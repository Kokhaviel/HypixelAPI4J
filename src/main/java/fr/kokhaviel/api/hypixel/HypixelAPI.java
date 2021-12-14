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

import java.net.MalformedURLException;
import java.net.URL;
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
	public KeyData getKey() throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/key?key=";
		String hypixelUrl = baseUrl + key;

		return this.get(hypixelUrl, KeyData.class);
	}

	/**
	 * Get Key Data Information for the Api Key Specified in param
	 *
	 * @param apiKey The Api Key
	 * @return Key Info for Api Key in param
	 * @since 1.0
	 */
	public KeyData getKey(String apiKey) throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/key?key=";
		String hypixelUrl = baseUrl + apiKey;

		return this.get(hypixelUrl, KeyData.class);
	}

	/**
	 * Get Player Data from a Minecraft Username
	 *
	 * @param player The Username of the Player
	 * @return {@link fr.kokhaviel.api.hypixel.player.PlayerData} for the specified Username
	 * @see HypixelAPI#getPlayerData(UUID)
	 * @since 1.0
	 */
	public PlayerData getPlayerData(String player) throws MalformedURLException {
		String baseHypixelUrl = "https://api.hypixel.net/player?uuid=";
		String hypixelURL = baseHypixelUrl + getMojangUUID(player).getUuid() + "&key=" + key;

		return this.get(hypixelURL, PlayerData.class);
	}

	/**
	 * Get Player Data from a Minecraft Account UUID
	 *
	 * @param uuid The Minecraft Account UUID
	 * @return {@link fr.kokhaviel.api.hypixel.player.PlayerData} for the specified UUID
	 * @see HypixelAPI#getPlayerData(String)
	 * @since 1.0
	 */
	public PlayerData getPlayerData(UUID uuid) throws MalformedURLException {
		String baseHypixelUrl = "https://api.hypixel.net/player?uuid=";
		String hypixelURL = baseHypixelUrl + uuid + "&key=" + key;

		return this.get(hypixelURL, PlayerData.class);
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
	public Friends getFriends(String player) throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/friends?uuid=";
		String hypixelUrl = baseUrl + getMojangUUID(player).getUuid() + "&key=" + key;

		return this.get(hypixelUrl, Friends.class);
	}

	/**
	 * Get Friends of the Player from UUID
	 *
	 * @param uuid UUID of the Player
	 * @return Friends List
	 * @see HypixelAPI#getFriends(String)
	 * @since 1.2
	 */
	public Friends getFriends(UUID uuid) throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/friends?uuid=";
		String hypixelUrl = baseUrl + uuid + "&key=" + key;

		return this.get(hypixelUrl, Friends.class);
	}

	/**
	 * Get Recent Games of the Player
	 *
	 * @param player Username of the Player
	 * @return Recent Games Played
	 * @see HypixelAPI#getRecentGames(UUID)
	 * @since 1.3
	 */
	public RecentGames getRecentGames(String player) throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/recentgames?uuid=";
		String hypixelUrl = baseUrl + getMojangUUID(player).getUuid() + "&key=" + key;

		return this.get(hypixelUrl, RecentGames.class);
	}

	/**
	 * Get Recent Games of the Player
	 *
	 * @param uuid UUID of the Player
	 * @return Recent Games Played
	 * @see HypixelAPI#getRecentGames(String)
	 * @since 1.3
	 */
	public RecentGames getRecentGames(UUID uuid) throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/recentgames?uuid=";
		String hypixelUrl = baseUrl + uuid + "&key=" + key;

		return this.get(hypixelUrl, RecentGames.class);
	}

	/**
	 * Get Current Game Status of the Player
	 *
	 * @param player Username of the Player
	 * @return Status
	 * @since 1.4
	 */
	public Status getStatus(String player) throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/status?uuid=";
		String hypixelUrl = baseUrl + getMojangUUID(player).getUuid() + "&key=" + key;

		return this.get(hypixelUrl, Status.class);
	}

	/**
	 * Get Current Game Status of the Player
	 *
	 * @param uuid UUID of the Player
	 * @return Status
	 * @since 1.4
	 */
	public Status getStatus(UUID uuid) throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/status?uuid=";
		String hypixelUrl = baseUrl + uuid + "&key=" + key;

		return this.get(hypixelUrl, Status.class);
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
	public GuildData getGuildData(String player) throws MalformedURLException {
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
	public GuildData getGuildData(UUID uuid) throws MalformedURLException {
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
	public GuildData getGuildDataByID(String id) throws MalformedURLException {
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
	public GuildData getGuildDataByName(String guildName) throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/guild?name=";
		return getGuildData(guildName, baseUrl);
	}

	/**
	 * Get Guild Statistics
	 *
	 * @param guild Guild Name or ID
	 * @return 2.0
	 */
	private GuildData getGuildData(String guild, String baseUrl) throws MalformedURLException {
		String hypixelUrl = baseUrl + guild + "&key=" + key;

		return this.get(hypixelUrl, GuildData.class);
	}

	/**
	 * Get Hypixel Network Achievements Data
	 *
	 * @return Achievements Data
	 * @since 3.0
	 */
	public fr.kokhaviel.api.hypixel.resources.achievements.Achievements getAchievementsData() {
		String hypixelUrl = "https://api.hypixel.net/resources/achievements";

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Achievements Data or Invalid Data : " + e.getMessage());
		}

		return new fr.kokhaviel.api.hypixel.resources.achievements.Achievements(hypixelObject);
	}

	/**
	 * Get Hypixel Network Challenges Data
	 *
	 * @return Challenges Data
	 * @since 3.1
	 */
	public Challenges getChallengesData() {
		String hypixelUrl = "https://api.hypixel.net/resources/challenges";

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Challenges Data or Invalid Data : " + e.getMessage());
		}

		return new Challenges(hypixelObject);
	}

	/**
	 * Get Hypixel Network Quests Data
	 *
	 * @return Challenges Data
	 * @since 3.2
	 */
	public Quests getQuestsData() {
		String hypixelUrl = "https://api.hypixel.net/resources/quests";

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Quests Data or Invalid Data : " + e.getMessage());
		}

		return new Quests(hypixelObject);
	}

	/**
	 * Get Hypixel Network Guilds Achievements Data
	 *
	 * @return Guilds Achievements Data
	 * @since 3.3
	 */
	public fr.kokhaviel.api.hypixel.resources.guild.Achievements getGuildAchievementsData() {
		String hypixelUrl = "https://api.hypixel.net/resources/guilds/achievements";

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Guild Achievements Data or Invalid Data : " + e.getMessage());
		}

		return new fr.kokhaviel.api.hypixel.resources.guild.Achievements(hypixelObject);
	}

	/**
	 * Get Hypixel Network Guilds Permissions Data
	 *
	 * @return Permissions Data
	 * @since 3.4
	 */
	public Permissions getGuildsPermissions() {
		String hypixelUrl = "https://api.hypixel.net/resources/guilds/permissions";

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Guild Achievements Data or Invalid Data : " + e.getMessage());
		}

		return new Permissions(hypixelObject);
	}

	/**
	 * Get Hypixel Network Skyblock Collections Data
	 * @return Skyblock Collections Data
	 * @since 4.0
	 */
	public Collections getSkyblockCollectionsData() {
		String hypixelUrl = "https://api.hypixel.net/resources/skyblock/collections";

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Skyblock Collections Data or Invalid Data : " + e.getMessage());
		}

		return new Collections(hypixelObject);
	}

	/**
	 * Get Hypixel Network Skyblock Skills Data
	 * @return Skills Data
	 * @since 4.1
	 */
	public Skills getSkyblockSkillsData() {
		String hypixelUrl = "https://api.hypixel.net/resources/skyblock/skills";

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Skyblock Skills Data or Invalid Data : " + e.getMessage());
		}

		return new Skills(hypixelObject);
	}

	/**
	 * Get Hypixel Skyblock Active Auctions
	 * @return Auctions Data
	 * @see HypixelAPI#getActiveAuctions(int)
	 * @since 4.2
	 */
	public Auctions getActiveAuctions() {
		String hypixelUrl = "https://api.hypixel.net/skyblock/auctions";

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Skyblock Auctions Data or Invalid Data : " + e.getMessage());
		}

		return new Auctions(hypixelObject, this);
	}

	/**
	 * Get Hypixel Skyblock Active Auctions with Specified Page
	 * @return Auctions Data
	 * @see HypixelAPI#getActiveAuctions()
	 * @since 4.2
	 */
	public Auctions getActiveAuctions(int page) {
		String hypixelUrl = "https://api.hypixel.net/skyblock/auctions?page=" + page;

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Skyblock Auctions Data or Invalid Data : " + e.getMessage());
		}

		return new Auctions(hypixelObject, this);
	}

	/**
	 * Get Hypixel Skyblock Bazaar Data
	 * @return Bazaar Data
	 * @since 4.3
	 */
	public Bazaar getBazaarData() {
		String hypixelUrl = "https://api.hypixel.net/skyblock/bazaar";

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Skyblock Bazaar Data or Invalid Data : " + e.getMessage());
		}

		return new Bazaar(hypixelObject);
	}

	/**
	 * Get Hypixel Skyblock Player Data
	 * @param player Username of the Player
	 * @return Skyblock Stats of the Player
	 * @since 4.4
	 */
	public SkyblockProfiles getSkyblockData(String player) throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/skyblock/profiles?uuid=";
		String hypixelUrl = baseUrl + getMojangUUID(player).getUuid() + "&key=" + key;

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Skyblock Player Data or Invalid Data : " + e.getMessage());
		}

		return new SkyblockProfiles(hypixelObject);
	}

	/**
	 * Get Hypixel Network Active Boosters
	 * @return Boosters Data
	 * @since 5.0
	 */
	public Boosters getActiveBoosters() {
		String baseUrl = "https://api.hypixel.net/boosters?key=";
		String hypixelUrl = baseUrl + key;

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Boosters Data or Invalid Data : " + e.getMessage());
		}

		return new Boosters(hypixelObject);
	}

	/**
	 * Get Players Count Per Game or Lobby
	 * @return Players Count Data
	 * @since 5.0
	 */
	public Counts getPlayerCounts() {
		String baseUrl = "https://api.hypixel.net/counts?key=";
		String hypixelUrl = baseUrl + key;

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Counts Data or Invalid Data : " + e.getMessage());
		}

		return new Counts(hypixelObject);
	}

	/**
	 * Get Hypixel Game Leaderboards
	 * @return Leaderboards Data
	 * @since 5.0
	 */
	public Leaderboards getLeaderboardsData() {
		String baseUrl = "https://api.hypixel.net/leaderboards?key=";
		String hypixelUrl = baseUrl + key;

		JsonObject hypixelObject;
		try {
			hypixelObject = IOUtils.readJson(new URL(hypixelUrl)).getAsJsonObject();
		} catch(IllegalStateException | MalformedURLException e) {
			throw new HypixelAPIException("Cannot Access Leaderboards Data or Invalid Data : " + e.getMessage());
		}

		return new Leaderboards(hypixelObject);
	}

	/**
	 * Get Hypixel Network Bans
	 * @return Bans Data
	 * @since 5.0
	 */
	public Bans getBansData() throws MalformedURLException {
		String baseUrl = "https://api.hypixel.net/punishmentstats?key=";
		String hypixelUrl = baseUrl + key;

		return this.get(hypixelUrl, Bans.class);
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

		return this.get(mojangUrl, MojangUUID.class);
	}

	private <T> T get(String url, Class<T> classOfT) throws IllegalStateException, MalformedURLException {
		JsonObject hypixelObject = IOUtils.readJson(new URL(url)).getAsJsonObject();
		return GSON.fromJson(hypixelObject, classOfT);
	}

	@Override
	public String toString() {
		return "HypixelAPI by Kokhaviel {" +
				"key='" + key + '\'' +
				'}';
	}
}
