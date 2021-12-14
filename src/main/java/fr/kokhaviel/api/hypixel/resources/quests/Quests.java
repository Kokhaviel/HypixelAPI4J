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

package fr.kokhaviel.api.hypixel.resources.quests;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Hypixel Network Quests Data
 *
 * @author Kokhaviel
 * @since 3.2
 */
public class Quests {

	final JsonObject questsObject;

	final Arcade arcade;
	final Arena arena;
	final Bedwars bedwars;
	final Blitz blitz;
	final BuildBattle buildBattle;
	final MCGO mcgo;
	final Duels duels;
	final GingerBread gingerBread;
	final MurderMystery murderMystery;
	final Paintball paintball;
	final Quake quake;
	final Skywars skywars;
	final Smash smash;
	final TNTGames tntGames;
	final UHC uhc;
	final VampireZ vampireZ;
	final Walls walls;
	final MegaWalls megaWalls;
	final Warlords warlords;
	final boolean success;
	final long lastUpdate;


	public Quests(JsonObject questsObject) {
		this.questsObject = questsObject.get("quests").getAsJsonObject();
		success = questsObject.get("success").getAsBoolean();
		lastUpdate = questsObject.get("lastUpdated").getAsLong();

		arcade = new Arcade(this.questsObject.get("arcade").getAsJsonArray());
		arena = new Arena(this.questsObject.get("arena").getAsJsonArray());
		bedwars = new Bedwars(this.questsObject.get("bedwars").getAsJsonArray());
		blitz = new Blitz(this.questsObject.get("hungergames").getAsJsonArray());
		buildBattle = new BuildBattle(this.questsObject.get("buildbattle").getAsJsonArray());
		mcgo = new MCGO(this.questsObject.get("mcgo").getAsJsonArray());
		duels = new Duels(this.questsObject.get("duels").getAsJsonArray());
		gingerBread = new GingerBread(this.questsObject.get("gingerbread").getAsJsonArray());
		murderMystery = new MurderMystery(this.questsObject.get("murdermystery").getAsJsonArray());
		paintball = new Paintball(this.questsObject.get("paintball").getAsJsonArray());
		quake = new Quake(this.questsObject.get("quake").getAsJsonArray());
		skywars = new Skywars(this.questsObject.get("skywars").getAsJsonArray());
		smash = new Smash(this.questsObject.get("supersmash").getAsJsonArray());
		tntGames = new TNTGames(this.questsObject.get("tntgames").getAsJsonArray());
		uhc = new UHC(this.questsObject.get("uhc").getAsJsonArray());
		vampireZ = new VampireZ(this.questsObject.get("vampirez").getAsJsonArray());
		walls = new Walls(this.questsObject.get("walls").getAsJsonArray());
		megaWalls = new MegaWalls(this.questsObject.get("walls3").getAsJsonArray());
		warlords = new Warlords(this.questsObject.get("battleground").getAsJsonArray());
	}

	/**
	 * Success Status of the Request
	 *
	 * @return Success Status
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Last Data Update Timestamp
	 *
	 * @return Update Timestamp
	 */
	public long getLastUpdate() {
		return lastUpdate;
	}


	/**
	 * Get Arcade Quests Data
	 */
	public Arcade getArcade() {
		return arcade;
	}

	/**
	 * Get Arena Quests Data
	 */
	public Arena getArena() {
		return arena;
	}

	/**
	 * Get Bedwars Quests Data
	 */
	public Bedwars getBedwars() {
		return bedwars;
	}

	/**
	 * Get Blitz Quests Data
	 */
	public Blitz getBlitz() {
		return blitz;
	}

	/**
	 * Get Build Battle Quests Data
	 */
	public BuildBattle getBuildBattle() {
		return buildBattle;
	}

	/**
	 * Get MCGO Quests Data
	 */
	public MCGO getMcgo() {
		return mcgo;
	}

	/**
	 * Get Duels Quests Data
	 */
	public Duels getDuels() {
		return duels;
	}

	/**
	 * Get Ginger Bread Quests Data
	 */
	public GingerBread getGingerBread() {
		return gingerBread;
	}

	/**
	 * Get Murder Mystery Quests Data
	 */
	public MurderMystery getMurderMystery() {
		return murderMystery;
	}

	/**
	 * Get Paintball Quests Data
	 */
	public Paintball getPaintball() {
		return paintball;
	}

	/**
	 * Get Quake Quests Data
	 */
	public Quake getQuake() {
		return quake;
	}

	/**
	 * Get Skywars Quests Data
	 */
	public Skywars getSkywars() {
		return skywars;
	}

	/**
	 * Get Smash Quests Data
	 */
	public Smash getSmash() {
		return smash;
	}

	/**
	 * Get Tnt Games Quests Data
	 */
	public TNTGames getTntGames() {
		return tntGames;
	}

	/**
	 * Get UHC Quests Data
	 */
	public UHC getUhc() {
		return uhc;
	}

	/**
	 * Get VampireZ Quests Data
	 */
	public VampireZ getVampireZ() {
		return vampireZ;
	}

	/**
	 * Get Walls Quests Data
	 */
	public Walls getWalls() {
		return walls;
	}

	/**
	 * Get Mega Walls Quests Data
	 */
	public MegaWalls getMegaWalls() {
		return megaWalls;
	}

	/**
	 * Get Warlords Quests Data
	 */
	public Warlords getWarlords() {
		return warlords;
	}

	/**
	 * Quake Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Quake {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Quake(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("QUAKE_PLAYER", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("SNIPER", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("WINNER", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("BAZINGA", new Quest(questsObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Quake Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Walls Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Walls {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Walls(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("WALLER", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("KILLS", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("WIN", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("WALLS_WEEKLY", new Quest(questsObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Walls Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Paintball Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Paintball {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Paintball(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("PAINTBALLER", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("PAINTBALL_KILLER", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("PAINTBALL_EXPERT", new Quest(questsObject.get(2).getAsJsonObject()));
		}

		/**
		 * Get Paintball Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Blitz Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Blitz {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Blitz(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("GAME_OF_THE_DAY", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("WIN_NORMAL", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("CHEST_LOOTER", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("KILLS", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("BLITZ_MASTER", new Quest(questsObject.get(4).getAsJsonObject()));
			questsMap.put("BLITZ_EXPERT", new Quest(questsObject.get(5).getAsJsonObject()));
		}

		/**
		 * Get Blitz Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * TNT Games Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class TNTGames {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public TNTGames(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("TNT_WINNER", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("EXPLOSIVE_FANATIC", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("TNT_RUN_DAILY", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("TNT_RUN_WEEKLY", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("PVP_RUN_DAILY", new Quest(questsObject.get(4).getAsJsonObject()));
			questsMap.put("PVP_RUN_WEEKLY", new Quest(questsObject.get(5).getAsJsonObject()));
			questsMap.put("BOW_SPLEEF_DAILY", new Quest(questsObject.get(6).getAsJsonObject()));
			questsMap.put("BOW_SPLEEF_WEEKLY", new Quest(questsObject.get(7).getAsJsonObject()));
			questsMap.put("TNT_TAG_DAILY", new Quest(questsObject.get(8).getAsJsonObject()));
			questsMap.put("TNT_TAG_WEEKLY", new Quest(questsObject.get(9).getAsJsonObject()));
			questsMap.put("TNT_WIZARDS_DAILY", new Quest(questsObject.get(10).getAsJsonObject()));
			questsMap.put("TNT_WIZARDS_WEEKLY", new Quest(questsObject.get(11).getAsJsonObject()));
		}

		/**
		 * Get TNT Games Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * VampireZ Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class VampireZ {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public VampireZ(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("VAMPIREZ", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("BLOOD_DRINKER", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("HUMAN_KILLER", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("VAMPIREZ_DAILY_WIN", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("VAMPIRE_WINNER", new Quest(questsObject.get(4).getAsJsonObject()));
			questsMap.put("VAMPIRE_SLAYER", new Quest(questsObject.get(5).getAsJsonObject()));
			questsMap.put("HUMAN_SLAYER", new Quest(questsObject.get(6).getAsJsonObject()));
		}

		/**
		 * Get VampireZ Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Mega Walls Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class MegaWalls {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public MegaWalls(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("GAME_OF_THE_DAY", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("WIN", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("KILLS", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("MEGA_WALLER", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("FAITHFUL", new Quest(questsObject.get(4).getAsJsonObject()));
		}

		/**
		 * Get Mega Walls Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Arcade Quests Data
	 *
	 * @author Kokahviel
	 * @since 3.2
	 */
	public static class Arcade {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Arcade(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("ARCADE_GAMER", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("ARCADE_WINNER", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("ARCADE_SPECIALIST", new Quest(questsObject.get(2).getAsJsonObject()));
		}

		/**
		 * Get Arcade Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Arena Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Arena {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Arena(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("PLAY_ARENA_DAILY", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("ARENA_KILLS", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("ARENA_WINS", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("PLAY_ARENA_WEEKLY", new Quest(questsObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Arena Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * UHC Quests Data
	 *
	 * @author Kokahviel
	 * @since 3.2
	 */
	public static class UHC {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public UHC(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("TEAM_UHC_CHAMPIONS", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("SOLO_UHC_CHAMPIONS", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("UHC_DEATHMATCH", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("UHC_CHAMPIONS", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("SOLO_SPEED_BRAWLER", new Quest(questsObject.get(4).getAsJsonObject()));
			questsMap.put("TEAM_SPEED_BRAWLER", new Quest(questsObject.get(5).getAsJsonObject()));
			questsMap.put("SPEED_UHC_MADNESS", new Quest(questsObject.get(6).getAsJsonObject()));
		}

		/**
		 * Get UHC Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * MCGO Quests Data
	 *
	 * @author Kokahviel
	 * @since 3.2
	 */
	public static class MCGO {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public MCGO(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("WIN_A_GAME_DEFUSAL", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("KILL_15_PLAYERS_DEFUSAL", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("GET_300_COINS_DM", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("WIN_A_GAME_DM", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("100_KILLS_1500_POINTS", new Quest(questsObject.get(4).getAsJsonObject()));
		}

		/**
		 * Get MCGO Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Warlords Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Warlords {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Warlords(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("CAPTURE_THE_FLAG", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("TEAM_DEATHMATCH", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("DOMINATION", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("VICTORIOUS", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("CARRY_SECURED", new Quest(questsObject.get(4).getAsJsonObject()));
			questsMap.put("DEDICATION", new Quest(questsObject.get(5).getAsJsonObject()));
			questsMap.put("ALL_STAR", new Quest(questsObject.get(6).getAsJsonObject()));
		}

		/**
		 * Get Warlords Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Smash Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Smash {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Smash(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("SOLO_WIN", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("SOLO_KILLS", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("TEAM_WIN", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("TEAM_KILLS", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("WEEKLY_KILLS", new Quest(questsObject.get(4).getAsJsonObject()));
		}

		/**
		 * Get Smash Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Ginger Bread Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class GingerBread {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public GingerBread(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("BLING_BLING", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("INTERNATIONAL_CHAMPIONSHIP", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("RACER", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("TURBO_KART_RACER", new Quest(questsObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Ginger Bread Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Skywars Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Skywars {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Skywars(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("SOLO_WIN", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("SOLO_KILLS", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("DOUBLES_WIN", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("DOUBLES_KILLS", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("LAB_WIN", new Quest(questsObject.get(4).getAsJsonObject()));
			questsMap.put("CORRUPTED_WIN", new Quest(questsObject.get(5).getAsJsonObject()));
			questsMap.put("WEEKLY_KILLS", new Quest(questsObject.get(6).getAsJsonObject()));
			questsMap.put("SCIENTIST", new Quest(questsObject.get(7).getAsJsonObject()));
			questsMap.put("TOKENS", new Quest(questsObject.get(8).getAsJsonObject()));
			questsMap.put("FREE_LOOT_CHEST", new Quest(questsObject.get(9).getAsJsonObject()));
		}

		/**
		 * Get Skywars Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Bedwars Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Bedwars {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Bedwars(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("FIRST_WIN", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("ONE_MORE_GAME", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("BED_REMOVAL", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("SLEEP_TIGHT", new Quest(questsObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Bedwars Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Murder Mystery Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class MurderMystery {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public MurderMystery(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("WINNER", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("POWER_PLAY", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("HITMAN", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("PROFESSIONAL", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("BIG_WINNER", new Quest(questsObject.get(4).getAsJsonObject()));
		}

		/**
		 * Get Murder Mystery Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Build Battle Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class BuildBattle {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public BuildBattle(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("PLAYER", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("WINNER", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("ARCHITECT", new Quest(questsObject.get(2).getAsJsonObject()));
		}

		/**
		 * Get Build Battle Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Duels Quests Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Duels {
		final JsonArray questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Duels(JsonArray questsObject) {
			this.questsObject = questsObject;
			putData();
		}

		void putData() {
			questsMap.put("PLAYER", new Quest(questsObject.get(0).getAsJsonObject()));
			questsMap.put("KILLER", new Quest(questsObject.get(1).getAsJsonObject()));
			questsMap.put("WINNER", new Quest(questsObject.get(2).getAsJsonObject()));
			questsMap.put("WEEKLY_KILLS", new Quest(questsObject.get(3).getAsJsonObject()));
			questsMap.put("WEEKLY_WINS", new Quest(questsObject.get(4).getAsJsonObject()));
		}

		/**
		 * Get Duels Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}


	/**
	 * Quest Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Quest {
		final String id;
		final String name;
		final String description;
		final JsonObject reward;
		final JsonObject objective;

		public Quest(JsonObject quest) {
			this.id = quest.get("id").getAsString();
			this.name = quest.get("name").getAsString();
			this.description = quest.get("description").getAsString();
			this.reward = quest.get("rewards").getAsJsonArray().get(0).getAsJsonObject();
			this.objective = quest.get("requirements").getAsJsonArray().get(0).getAsJsonObject();
		}

		/**
		 * Get Quest Id
		 */
		public String getId() {
			return id;
		}

		/**
		 * Get Quest Full Name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Get Quest Description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * Get Quest Reward
		 */
		public Reward getReward() {
			return new Reward(reward);
		}

		/**
		 * Get Quest Objective
		 */
		public Objective getObjective() {
			return new Objective(objective);
		}
	}

	/**
	 * Quest Reward Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Reward {

		final int amount;

		public Reward(JsonObject rewardObject) {
			this.amount = rewardObject.get("description").getAsInt();
		}

		/**
		 * Get Network Xp Gained
		 */
		public int getAmount() {
			return amount;
		}
	}

	/**
	 * Quest Objective Data
	 *
	 * @author Kokhaviel
	 * @since 3.2
	 */
	public static class Objective {

		final String description;

		public Objective(JsonObject objectiveObject) {
			this.description = objectiveObject.get("description").getAsString();
		}

		/**
		 * Get Objective Description
		 */
		public String getDescription() {
			return description;
		}
	}
}
