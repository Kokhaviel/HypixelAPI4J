/*
 * Copyright (c) 2021 Kokhaviel.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

//TODO : Implements Logger Factory to API

package fr.kokhaviel.api.hypixel;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import fr.kokhaviel.api.hypixel.guild.GuildData;
import fr.kokhaviel.api.hypixel.key.KeyData;
import fr.kokhaviel.api.hypixel.mojang.MojangUUID;
import fr.kokhaviel.api.hypixel.player.*;
import fr.kokhaviel.api.hypixel.player.friends.Friends;
import fr.kokhaviel.api.hypixel.recent.RecentGames;
import fr.kokhaviel.api.hypixel.resources.challenges.Challenges;
import fr.kokhaviel.api.hypixel.resources.guild.Permissions;
import fr.kokhaviel.api.hypixel.resources.quests.Quests;
import fr.kokhaviel.api.hypixel.resources.skyblock.*;
import fr.kokhaviel.api.hypixel.server.*;
import fr.kokhaviel.api.hypixel.status.Status;
import fr.kokhaviel.api.hypixel.util.IOUtils;
import fr.kokhaviel.api.hypixel.util.exceptions.*;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.TimeZone;
import java.util.UUID;

/**
 * The core of HypixelAPI
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class HypixelAPI {

	public static String cacheDir;

	static {
		try {
			Cache.createCacheIfNotExists();
			Cache.clearOneHourCache();
			cacheDir = System.getProperty("user.home") + "/.hypixel-api/";
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * The Hypixel API Key, allows you to obtain Hypixel Statistics
	 */
	final String key;

	final Gson GSON = new Gson();

	/**
	 * Create an HypixelAPI Instance with your API Key
	 *
	 * @param key Your Hypixel API Key
	 * @since 1.0
	 */
	public HypixelAPI(String key) {
		this.key = key;
	}

	/**
	 * Get a LocalDateTime Object from a Timestamp
	 *
	 * @param timestamp The Timestamp you want to convert
	 * @return Converted Timestamp to {@link java.time.LocalDateTime}
	 * @since 1.0
	 */
	public static LocalDateTime convertTimestampToDateTime(long timestamp) {
		return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), TimeZone.getDefault().toZoneId());
	}

	/**
	 * Get Key Data Information for the Api Key Actually Used in {@link HypixelAPI#HypixelAPI(String)}
	 *
	 * @return Key Info for Specified in {@link HypixelAPI#HypixelAPI(String)}
	 * @since 1.0
	 */
	public KeyData getKey() throws IOException {
		final String fileName = "key-" + key;
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, KeyData.class);
		} else {
			String baseUrl = "https://api.hypixel.net/key?key=";
			String hypixelUrl = baseUrl + key;
			return this.fetchAndGet(hypixelUrl, KeyData.class, fileName);
		}
	}

	/**
	 * Get Key Data Information for the Api Key Specified in param
	 *
	 * @param apiKey The Api Key
	 * @return Key Info for Api Key in param
	 * @since 1.0
	 */
	public KeyData getKey(String apiKey) throws IOException {
		final String fileName = "key-" + apiKey;
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, KeyData.class);
		} else {
			String baseUrl = "https://api.hypixel.net/key?key=";
			String hypixelUrl = baseUrl + apiKey;
			return this.fetchAndGet(hypixelUrl, KeyData.class, fileName);
		}
	}

	/**
	 * Get Player Data from a Minecraft Username
	 *
	 * @param player The Username of the Player
	 * @return {@link fr.kokhaviel.api.hypixel.player.PlayerData} for the specified Username
	 * @see HypixelAPI#getPlayerData(UUID)
	 * @since 1.0
	 */
	public PlayerData getPlayerData(String player) throws IOException {
		final String fileName = "player-" + getMojangUUID(player).getUuid();
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, PlayerData.class);
		} else {
			String baseUrl = "https://api.hypixel.net/player?uuid=";
			String hypixelUrl = baseUrl + getMojangUUID(player).getUuid() + "&key=" + key;
			return this.fetchAndGet(hypixelUrl, PlayerData.class, fileName);
		}
	}

	/**
	 * Get Player Data from a Minecraft Account UUID
	 *
	 * @param uuid The Minecraft Account UUID
	 * @return {@link fr.kokhaviel.api.hypixel.player.PlayerData} for the specified UUID
	 * @see HypixelAPI#getPlayerData(String)
	 * @since 1.0
	 */
	public PlayerData getPlayerData(UUID uuid) throws IOException {
		final String fileName = "player-" + uuid;
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, PlayerData.class);
		} else {
			String baseUrl = "https://api.hypixel.net/player?uuid=";
			String hypixelUrl = baseUrl +  uuid + "&key=" + key;
			return this.fetchAndGet(hypixelUrl, PlayerData.class, fileName);
		}
	}

	public Level getLevel(String player) {
		return new Level(this, player);
	}

	/**
	 * Get Extras Statistics That aren't Available in Base API
	 *
	 * @param player The Username of the Player
	 * @return Extras Statistics
	 * @since 1.1
	 */
	public Extras getExtras(String player) {
		return new Extras(this, player);
	}

	/**
	 * Get Friends of the Player from Player Name
	 *
	 * @param player The Username of the Player
	 * @return Friends List
	 * @see HypixelAPI#getFriends(UUID)
	 * @since 1.2
	 */
	public Friends getFriends(String player) throws IOException {
		final String fileName = "friends-" + getMojangUUID(player).getUuid();
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, Friends.class);
		} else {
			String baseUrl = "https://api.hypixel.net/friends?uuid=";
			String hypixelUrl = baseUrl +  getMojangUUID(player).getUuid() + "&key=" + key;
			return this.fetchAndGet(hypixelUrl, Friends.class, fileName);
		}
	}

	/**
	 * Get Friends of the Player from UUID
	 *
	 * @param uuid UUID of the Player
	 * @return Friends List
	 * @see HypixelAPI#getFriends(String)
	 * @since 1.2
	 */
	public Friends getFriends(UUID uuid) throws IOException {
		final String fileName = "friends-" + uuid;
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, Friends.class);
		} else {
			String baseUrl = "https://api.hypixel.net/friends?uuid=";
			String hypixelUrl = baseUrl +  uuid + "&key=" + key;
			return this.fetchAndGet(hypixelUrl, Friends.class, fileName);
		}
	}

	/**
	 * Get Recent Games of the Player
	 *
	 * @param player Username of the Player
	 * @return Recent Games Played
	 * @see HypixelAPI#getRecentGames(UUID)
	 * @since 1.3
	 */
	public RecentGames getRecentGames(String player) throws IOException {
		final String fileName = "recent-" + getMojangUUID(player).getUuid();
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, RecentGames.class);
		} else {
			String baseUrl = "https://api.hypixel.net/recentgames?uuid=";
			String hypixelUrl = baseUrl + getMojangUUID(player).getUuid() + "&key=" + key;
			return this.fetchAndGet(hypixelUrl, RecentGames.class, fileName);
		}
	}

	/**
	 * Get Recent Games of the Player
	 *
	 * @param uuid UUID of the Player
	 * @return Recent Games Played
	 * @see HypixelAPI#getRecentGames(String)
	 * @since 1.3
	 */
	public RecentGames getRecentGames(UUID uuid) throws IOException {
		final String fileName = "recent-" + uuid;
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, RecentGames.class);
		} else {
			String baseUrl = "https://api.hypixel.net/recentgames?uuid=";
			String hypixelUrl = baseUrl + uuid + "&key=" + key;
			return this.fetchAndGet(hypixelUrl, RecentGames.class, fileName);
		}
	}

	/**
	 * Get Current Game Status of the Player
	 *
	 * @param player Username of the Player
	 * @return Status
	 * @since 1.4
	 */
	public Status getStatus(String player) throws IOException {
		final String fileName = "status-" + getMojangUUID(player).getUuid();
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, Status.class);
		} else {
			String baseUrl = "https://api.hypixel.net/status?uuid=";
			String hypixelUrl = baseUrl + getMojangUUID(player).getUuid() + "&key=" + key;
			return this.fetchAndGet(hypixelUrl, Status.class, fileName);
		}
	}

	/**
	 * Get Current Game Status of the Player
	 *
	 * @param uuid UUID of the Player
	 * @return Status
	 * @since 1.4
	 */
	public Status getStatus(UUID uuid) throws IOException {
		final String fileName = "status-" + uuid;
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, Status.class);
		} else {
			String baseUrl = "https://api.hypixel.net/status?uuid=";
			String hypixelUrl = baseUrl + uuid + "&key=" + key;
			return this.fetchAndGet(hypixelUrl, Status.class, fileName);
		}
	}

	/**
	 * Get Guild Statistics by Member Name
	 *
	 * @param player Member Name
	 * @return Guild Stats
	 * @see HypixelAPI#getGuildData(UUID)
	 * @see HypixelAPI#getGuildDataByID(String)
	 * @see HypixelAPI#getGuildDataByName(String)
	 * @since 2.0
	 */
	public GuildData getGuildData(String player) throws IOException {
		String baseUrl = "https://api.hypixel.net/guild?player=";

		return getGuildData(getMojangUUID(player).getUuid(), baseUrl);
	}

	/**
	 * Get Guild Statistics by Member UUID
	 *
	 * @param uuid UUID of the Member
	 * @return Guild Stats
	 * @see HypixelAPI#getGuildData(String)
	 * @see HypixelAPI#getGuildData(String, String)
	 * @see HypixelAPI#getGuildDataByID(String)
	 * @see HypixelAPI#getGuildDataByName(String)
	 * @since 2.0
	 */
	public GuildData getGuildData(UUID uuid) throws IOException {
		String baseUrl = "https://api.hypixel.net/guild?player=";

		return getGuildData(uuid.toString(), baseUrl);
	}

	/**
	 * Get Guild Statistics by Guild ID
	 *
	 * @param id Guild ID
	 * @return Guild Stats
	 * @see HypixelAPI#getGuildData(UUID)
	 * @see HypixelAPI#getGuildData(String)
	 * @see HypixelAPI#getGuildData(String, String)
	 * @see HypixelAPI#getGuildDataByName(String)
	 * @since 2.0
	 */
	public GuildData getGuildDataByID(String id) throws IOException {
		String baseUrl = "https://api.hypixel.net/guild?id=";
		return getGuildData(id, baseUrl);
	}

	/**
	 * Get Guild Statistics by Guild Name
	 *
	 * @param guildName Guild Name
	 * @return Guild Stats
	 * @see HypixelAPI#getGuildData(UUID)
	 * @see HypixelAPI#getGuildData(String)
	 * @see HypixelAPI#getGuildData(String, String)
	 * @see HypixelAPI#getGuildDataByID(String)
	 * @since 2.0
	 */
	public GuildData getGuildDataByName(String guildName) throws IOException {
		String baseUrl = "https://api.hypixel.net/guild?name=";
		return getGuildData(guildName, baseUrl);
	}

	/**
	 * Get Guild Statistics
	 *
	 * @param guild Guild Name or ID
	 * @return 2.0
	 */
	private GuildData getGuildData(String guild, String baseUrl) throws IOException {
		final String fileName = "guild-" + guild;
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, GuildData.class);
		} else {
			String hypixelUrl = baseUrl + guild + "&key=" + key;
			return this.fetchAndGet(hypixelUrl, GuildData.class, fileName);
		}
	}

	/**
	 * Get Hypixel Network Achievements Data
	 *
	 * @return Achievements Data
	 * @since 3.0
	 */
	public fr.kokhaviel.api.hypixel.resources.achievements.Achievements getAchievementsData() throws IOException {
		final String fileName = "achievements";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/resources/achievements";
			this.fetch(hypixelUrl, fileName);
		}
		return new fr.kokhaviel.api.hypixel.resources.achievements.Achievements(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Network Challenges Data
	 *
	 * @return Challenges Data
	 * @since 3.1
	 */
	public Challenges getChallengesData() throws IOException {

		final String fileName = "challenges";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/resources/challenges";
			this.fetch(hypixelUrl, fileName);
		}
		return new Challenges(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Network Quests Data
	 *
	 * @return Challenges Data
	 * @since 3.2
	 */
	public Quests getQuestsData() throws IOException {
		final String fileName = "quests";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/resources/quests";
			this.fetch(hypixelUrl, fileName);
		}
		return new Quests(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Network Guilds Achievements Data
	 *
	 * @return Guilds Achievements Data
	 * @since 3.3
	 */
	public fr.kokhaviel.api.hypixel.resources.guild.Achievements getGuildAchievementsData() throws IOException {
		final String fileName = "guild-achievements";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/resources/guilds/achievements";
			this.fetch(hypixelUrl, fileName);
		}
		return new fr.kokhaviel.api.hypixel.resources.guild.Achievements(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Network Guilds Permissions Data
	 *
	 * @return Permissions Data
	 * @since 3.4
	 */
	public Permissions getGuildsPermissions() throws IOException {
		final String fileName = "guild-permissions";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/resources/guilds/permissions";
			this.fetch(hypixelUrl, fileName);
		}
		return new Permissions(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Network Skyblock Collections Data
	 * @return Skyblock Collections Data
	 * @since 4.0
	 */
	public Collections getSkyblockCollectionsData() throws IOException {
		final String fileName = "skyblock-collections";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/resources/skyblock/collections";
			this.fetch(hypixelUrl, fileName);
		}
		return new Collections(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Network Skyblock Skills Data
	 * @return Skills Data
	 * @since 4.1
	 */
	public Skills getSkyblockSkillsData() throws IOException {
		final String fileName = "skyblock-skills";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/resources/skyblock/skills";
			this.fetch(hypixelUrl, fileName);
		}
		return new Skills(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Skyblock Active Auctions
	 * @return Auctions Data
	 * @see HypixelAPI#getActiveAuctions(int)
	 * @since 4.2
	 */
	public Auctions getActiveAuctions() throws IOException {
		final String fileName = "auctions-1";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/skyblock/auctions";
			this.fetch(hypixelUrl, fileName);
		}
		return new Auctions(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Skyblock Active Auctions with Specified Page
	 * @return Auctions Data
	 * @see HypixelAPI#getActiveAuctions()
	 * @since 4.2
	 */
	public Auctions getActiveAuctions(int page) throws IOException {
		final String fileName = "auctions-" + page;
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/skyblock/auctions?page=" + page;
			this.fetch(hypixelUrl, fileName);
		}
		return new Auctions(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Skyblock Bazaar Data
	 * @return Bazaar Data
	 * @since 4.3
	 */
	public Bazaar getBazaarData() throws IOException {
		final String fileName = "bazaar";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String hypixelUrl = "https://api.hypixel.net/skyblock/bazaar";
			this.fetch(hypixelUrl, fileName);
		}
		return new Bazaar(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Skyblock Player Data
	 * @param player Username of the Player
	 * @return Skyblock Stats of the Player
	 * @since 4.4
	 */
	public SkyblockProfiles getSkyblockData(String player) throws IOException {
		final String fileName = "skyblock-stats-" + getMojangUUID(player).getUuid();
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String baseUrl = "https://api.hypixel.net/skyblock/profiles?uuid=";
			String hypixelUrl = baseUrl + getMojangUUID(player).getUuid() + "&key=" + key;
			this.fetch(hypixelUrl, fileName);
		}
		return new SkyblockProfiles(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Network Active Boosters
	 * @return Boosters Data
	 * @since 5.0
	 */
	public Boosters getActiveBoosters() throws IOException {
		final String fileName = "bazaar";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String baseUrl = "https://api.hypixel.net/boosters?key=";
			String hypixelUrl = baseUrl + key;
			this.fetch(hypixelUrl, fileName);
		}
		return new Boosters(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Players Count Per Game or Lobby
	 * @return Players Count Data
	 * @since 5.0
	 */
	public Counts getPlayerCounts() throws IOException {
		final String fileName = "bazaar";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String baseUrl = "https://api.hypixel.net/counts?key=";
			String hypixelUrl = baseUrl + key;
			this.fetch(hypixelUrl, fileName);
		}
		return new Counts(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Game Leaderboards
	 * @return Leaderboards Data
	 * @since 5.0
	 */
	public Leaderboards getLeaderboardsData() throws IOException {
		final String fileName = "bazaar";
		Cache.invalidateFiveMinutesCache(fileName);
		if(!Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			String baseUrl = "https://api.hypixel.net/leaderboards?key=";
			String hypixelUrl = baseUrl + key;
			this.fetch(hypixelUrl, fileName);
		}
		return new Leaderboards(IOUtils.readJson(new File(cacheDir + fileName)).getAsJsonObject());
	}

	/**
	 * Get Hypixel Network Bans
	 * @return Bans Data
	 * @since 5.0
	 */
	public Bans getBansData() throws IOException {
		final String fileName = "bans";
		Cache.invalidateFiveMinutesCache(fileName);
		if(Files.exists(Paths.get(cacheDir + fileName + ".json"))) {
			return this.getFromCache(cacheDir + fileName, Bans.class);
		} else {
			String baseUrl = "https://api.hypixel.net/punishmentstats?key=";
			String hypixelUrl = baseUrl + key;
			return this.fetchAndGet(hypixelUrl, Bans.class, fileName);
		}
	}

	/**
	 * Get Minecraft UUID from a Player Name
	 *
	 * @param player The Username of the Player
	 * @return Id & UUID of the Player
	 * @since 1.0
	 */
	public MojangUUID getMojangUUID(String player) throws MalformedURLException {
		String baseMojangUrl = "https://api.mojang.com/users/profiles/minecraft/";
		String mojangUrl = baseMojangUrl + player;

		return this.getNoCache(mojangUrl, MojangUUID.class);
	}

	private <T> T getFromCache(String file, Class<T> classOfT) {
		JsonObject hypixelObject = IOUtils.readJson(new File(file + ".json")).getAsJsonObject();
		return GSON.fromJson(hypixelObject, classOfT);
	}

	private <T> T getNoCache(String url, Class<T> classOfT) throws IllegalStateException, MalformedURLException {
		JsonObject hypixelObject = IOUtils.readJson(new URL(url)).getAsJsonObject();
		return GSON.fromJson(hypixelObject, classOfT);
	}

	private <T> T fetchAndGet(String url, Class<T> classOfT, String name) throws IllegalStateException, IOException {
		this.fetch(url, name);
		return this.getFromCache(cacheDir + name, classOfT);
	}

	private void fetch(String url, String name) throws IOException {
		JsonObject hypixelObject = IOUtils.readJson(new URL(url)).getAsJsonObject();
		Cache.createCache(name, hypixelObject.toString());
	}

	@Override
	public String toString() {
		return "HypixelAPI by Kokhaviel {" +
				"key='" + key + '\'' +
				'}';
	}
}
