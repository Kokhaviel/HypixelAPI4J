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

package fr.kokhaviel.api.hypixel.server;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hypixel Network Leaderboards Data
 * @author Kokhaviel
 * @since 5.0
 */
public class Leaderboards {

	final boolean success;
	final JsonObject leaderboardsObject;
	final Map<String, Leaderboard> leaderboardMap = new HashMap<>();

	public Leaderboards(JsonObject jsonObject) {
		this.success = jsonObject.get("success").getAsBoolean();
		this.leaderboardsObject = jsonObject.getAsJsonObject("leaderboards");
		putLeaderboardsData();
	}

	void putLeaderboardsData() {
		leaderboardMap.put("DUELS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("DUELS").get(0).getAsJsonObject()));
		leaderboardMap.put("DUELS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("DUELS").get(1).getAsJsonObject()));

		leaderboardMap.put("VAMPIREZ_WINS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("VAMPIREZ").get(0).getAsJsonObject()));
		leaderboardMap.put("VAMPIREZ_WINS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("VAMPIREZ").get(1).getAsJsonObject()));
		leaderboardMap.put("VAMPIREZ_WINS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("VAMPIREZ").get(2).getAsJsonObject()));

		leaderboardMap.put("MEGA_WALLS_KILLS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("WALLS3").get(0).getAsJsonObject()));
		leaderboardMap.put("MEGA_WALLS_KILLS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("WALLS3").get(1).getAsJsonObject()));
		leaderboardMap.put("MEGA_WALLS_KILLS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("WALLS3").get(2).getAsJsonObject()));

		leaderboardMap.put("UHC_KILLS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("UHC").get(0).getAsJsonObject()));
		leaderboardMap.put("UHC_KILLS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("UHC").get(1).getAsJsonObject()));
		leaderboardMap.put("UHC_WINS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("UHC").get(2).getAsJsonObject()));
		leaderboardMap.put("UHC_WINS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("UHC").get(3).getAsJsonObject()));

		leaderboardMap.put("SKYWARS_EXP", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYWARS").get(0).getAsJsonObject()));
		leaderboardMap.put("SKYWARS_RATING", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYWARS").get(1).getAsJsonObject()));
		leaderboardMap.put("SKYWARS_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYWARS").get(2).getAsJsonObject()));
		leaderboardMap.put("SKYWARS_KILLS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYWARS").get(3).getAsJsonObject()));
		leaderboardMap.put("SKYWARS_KILLS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYWARS").get(4).getAsJsonObject()));
		leaderboardMap.put("SKYWARS_KILLS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYWARS").get(5).getAsJsonObject()));

		leaderboardMap.put("TRUE_COMBAT_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("TRUE_COMBAT").get(0).getAsJsonObject()));
		leaderboardMap.put("TRUE_COMBAT_KILLS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("TRUE_COMBAT").get(1).getAsJsonObject()));
		leaderboardMap.put("TRUE_COMBAT_KILLS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("TRUE_COMBAT").get(2).getAsJsonObject()));
		leaderboardMap.put("TRUE_COMBAT_KILLS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("TRUE_COMBAT").get(3).getAsJsonObject()));

		leaderboardMap.put("BUILD_BATTLE_SCORE", new Leaderboard(leaderboardsObject.getAsJsonArray("BUILD_BATTLE").get(0).getAsJsonObject()));
		leaderboardMap.put("BUILD_BATTLE_COINS", new Leaderboard(leaderboardsObject.getAsJsonArray("BUILD_BATTLE").get(1).getAsJsonObject()));
		leaderboardMap.put("BUILD_BATTLE_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("BUILD_BATTLE").get(2).getAsJsonObject()));

		leaderboardMap.put("SPEED_UHC_SALT", new Leaderboard(leaderboardsObject.getAsJsonArray("SPEED_UHC").get(0).getAsJsonObject()));
		leaderboardMap.put("SPEED_UHC_KILLS_NORMAL", new Leaderboard(leaderboardsObject.getAsJsonArray("SPEED_UHC").get(1).getAsJsonObject()));
		leaderboardMap.put("SPEED_UHC_WINS_NORMAL", new Leaderboard(leaderboardsObject.getAsJsonArray("SPEED_UHC").get(2).getAsJsonObject()));
		leaderboardMap.put("SPEED_UHC_KILLS_INSANE", new Leaderboard(leaderboardsObject.getAsJsonArray("SPEED_UHC").get(3).getAsJsonObject()));
		leaderboardMap.put("SPEED_UHC_WINS_INSANE", new Leaderboard(leaderboardsObject.getAsJsonArray("SPEED_UHC").get(4).getAsJsonObject()));

		leaderboardMap.put("TNT_RUN_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("TNTGAMES").get(0).getAsJsonObject()));
		leaderboardMap.put("PVP_RUN_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("TNTGAMES").get(1).getAsJsonObject()));
		leaderboardMap.put("WIZARDS_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("TNTGAMES").get(2).getAsJsonObject()));
		leaderboardMap.put("TNT_TAG_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("TNTGAMES").get(3).getAsJsonObject()));
		leaderboardMap.put("SPLEEF_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("TNTGAMES").get(4).getAsJsonObject()));

		leaderboardMap.put("ARENA_RATING", new Leaderboard(leaderboardsObject.getAsJsonArray("ARENA").get(0).getAsJsonObject()));
		leaderboardMap.put("ARENA_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("ARENA").get(1).getAsJsonObject()));

		leaderboardMap.put("MCGO_KILLS", new Leaderboard(leaderboardsObject.getAsJsonArray("MCGO").get(0).getAsJsonObject()));
		leaderboardMap.put("MCGO_DEFUSAL_WINS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("MCGO").get(1).getAsJsonObject()));
		leaderboardMap.put("MCGO_DEFUSAL_WINS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("MCGO").get(2).getAsJsonObject()));
		leaderboardMap.put("MCGO_DEATHMATCH_WINS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("MCGO").get(3).getAsJsonObject()));
		leaderboardMap.put("MCGO_DEATHMATCH_WINS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("MCGO").get(4).getAsJsonObject()));

		leaderboardMap.put("SKYCLASH_KILLS_TOTAL", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYCLASH").get(0).getAsJsonObject()));
		leaderboardMap.put("SKYCLASH_WINS_SOLO", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYCLASH").get(1).getAsJsonObject()));
		leaderboardMap.put("SKYCLASH_WINS_DOUBLES", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYCLASH").get(2).getAsJsonObject()));
		leaderboardMap.put("SKYCLASH_WINS_TEAMWAR", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYCLASH").get(3).getAsJsonObject()));
		leaderboardMap.put("SKYCLASH_KILLS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("SKYCLASH").get(4).getAsJsonObject()));

		leaderboardMap.put("BEDWARS_LEVEL", new Leaderboard(leaderboardsObject.getAsJsonArray("BEDWARS").get(0).getAsJsonObject()));
		leaderboardMap.put("BEDWARS_WINS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("BEDWARS").get(1).getAsJsonObject()));
		leaderboardMap.put("BEDWARS_WINS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("BEDWARS").get(2).getAsJsonObject()));
		leaderboardMap.put("BEDWARS_FINAL_KILLS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("BEDWARS").get(3).getAsJsonObject()));
		leaderboardMap.put("BEDWARS_FINAL_KILLS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("BEDWARS").get(4).getAsJsonObject()));

		leaderboardMap.put("BLITZ_KILLS", new Leaderboard(leaderboardsObject.getAsJsonArray("SURVIVAL_GAMES").get(0).getAsJsonObject()));
		leaderboardMap.put("BLITZ_WINS_SOLO", new Leaderboard(leaderboardsObject.getAsJsonArray("SURVIVAL_GAMES").get(1).getAsJsonObject()));
		leaderboardMap.put("BLITZ_WINS_TEAM", new Leaderboard(leaderboardsObject.getAsJsonArray("SURVIVAL_GAMES").get(2).getAsJsonObject()));

		leaderboardMap.put("SMASH_LEVEL", new Leaderboard(leaderboardsObject.getAsJsonArray("SUPER_SMASH").get(0).getAsJsonObject()));
		leaderboardMap.put("SMASH_KILLS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("SUPER_SMASH").get(1).getAsJsonObject()));
		leaderboardMap.put("SMASH_KILLS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("SUPER_SMASH").get(2).getAsJsonObject()));
		leaderboardMap.put("SMASH_KILLS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("SUPER_SMASH").get(3).getAsJsonObject()));

		leaderboardMap.put("QUAKE_KILLS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("QUAKECRAFT").get(0).getAsJsonObject()));
		leaderboardMap.put("QUAKE_KILLS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("QUAKECRAFT").get(1).getAsJsonObject()));
		leaderboardMap.put("QUAKE_KILLS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("QUAKECRAFT").get(2).getAsJsonObject()));

		leaderboardMap.put("WALLS_KILLS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("WALLS").get(0).getAsJsonObject()));
		leaderboardMap.put("WALLS_KILLS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("WALLS").get(1).getAsJsonObject()));
		leaderboardMap.put("WALLS_KILLS_WEEKLY",  new Leaderboard(leaderboardsObject.getAsJsonArray("WALLS").get(2).getAsJsonObject()));

		leaderboardMap.put("PAINTBALL_KILLS_OVERALL", new Leaderboard(leaderboardsObject.getAsJsonArray("PAINTBALL").get(0).getAsJsonObject()));
		leaderboardMap.put("PAINTBALL_KILLS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("PAINTBALL").get(1).getAsJsonObject()));
		leaderboardMap.put("PAINTBALL_KILLS_WEEKLY",  new Leaderboard(leaderboardsObject.getAsJsonArray("PAINTBALL").get(2).getAsJsonObject()));

		leaderboardMap.put("BATTLEGROUND_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("BATTLEGROUND").get(0).getAsJsonObject()));
		leaderboardMap.put("BATTLEGROUND_WINS_DOM", new Leaderboard(leaderboardsObject.getAsJsonArray("BATTLEGROUND").get(1).getAsJsonObject()));
		leaderboardMap.put("BATTLEGROUND_WINS_TDM", new Leaderboard(leaderboardsObject.getAsJsonArray("BATTLEGROUND").get(2).getAsJsonObject()));
		leaderboardMap.put("BATTLEGROUND_WINS_CTF", new Leaderboard(leaderboardsObject.getAsJsonArray("BATTLEGROUND").get(3).getAsJsonObject()));

		leaderboardMap.put("ARCADE_COINS_CURRENT", new Leaderboard(leaderboardsObject.getAsJsonArray("ARCADE").get(0).getAsJsonObject()));
		leaderboardMap.put("ARCADE_COINS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("ARCADE").get(1).getAsJsonObject()));
		leaderboardMap.put("ARCADE_COINS_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("ARCADE").get(2).getAsJsonObject()));

		leaderboardMap.put("TKR_GOLD_TROPHIES", new Leaderboard(leaderboardsObject.getAsJsonArray("GINGERBREAD").get(0).getAsJsonObject()));
		leaderboardMap.put("TKR_GOLD_TROPHIES_MONTHLY", new Leaderboard(leaderboardsObject.getAsJsonArray("GINGERBREAD").get(1).getAsJsonObject()));
		leaderboardMap.put("TKR_GOLD_TROPHIES_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("GINGERBREAD").get(2).getAsJsonObject()));
		leaderboardMap.put("TKR_LAPS", new Leaderboard(leaderboardsObject.getAsJsonArray("GINGERBREAD").get(3).getAsJsonObject()));
		leaderboardMap.put("TKR_POINTS", new Leaderboard(leaderboardsObject.getAsJsonArray("GINGERBREAD").get(4).getAsJsonObject()));

		leaderboardMap.put("MURDER_MYSTERY_WINS", new Leaderboard(leaderboardsObject.getAsJsonArray("MURDER_MYSTERY").get(0).getAsJsonObject()));
		leaderboardMap.put("MURDER_MYSTERY_WINS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("MURDER_MYSTERY").get(1).getAsJsonObject()));
		leaderboardMap.put("MURDER_MYSTERY_KILLS_", new Leaderboard(leaderboardsObject.getAsJsonArray("MURDER_MYSTERY").get(2).getAsJsonObject()));
		leaderboardMap.put("MURDER_MYSTERY_KILLS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("MURDER_MYSTERY").get(3).getAsJsonObject()));
		leaderboardMap.put("MURDER_MYSTERY_MURDERER_KILLS", new Leaderboard(leaderboardsObject.getAsJsonArray("MURDER_MYSTERY").get(4).getAsJsonObject()));
		leaderboardMap.put("MURDER_MYSTERY_MURDERER_KILLS_WEEKLY", new Leaderboard(leaderboardsObject.getAsJsonArray("MURDER_MYSTERY").get(5).getAsJsonObject()));
	}

	/**
	 * Get Leaderboards
	 */
	public Map<String, Leaderboard> getLeaderboardMap() {
		return leaderboardMap;
	}

	/**
	 * Leaderboard Data
	 * @author Kokhaviel
	 * @since 5.0
	 */
	public static class Leaderboard {

		final String path;
		final String prefix;
		final String title;
		final String location;
		final JsonArray leaders;

		public Leaderboard(JsonObject leaderboardObject) {
			this.path = leaderboardObject.get("path").getAsString();
			this.prefix = leaderboardObject.get("prefix").getAsString();
			this.title = leaderboardObject.get("title").getAsString();
			this.location = leaderboardObject.get("location").getAsString();
			this.leaders = leaderboardObject.getAsJsonArray("leaders");
		}

		/**
		 * Get Leaderboard Path
		 */
		public String getPath() {
			return path;
		}

		/**
		 * Get Leaderboard Prefix (ie Weekly, Monthly Overall and Others ...)
		 */
		public String getPrefix() {
			return prefix;
		}

		/**
		 * Get Leaderboard Title
		 */
		public String getTitle() {
			return title;
		}

		/**
		 * Get Leaderboard Location (ie In-Game Lobby Location)
		 */
		public String getLocation() {
			return location;
		}

		/**
		 * Get 10 First Leader of the Leaderboard
		 */
		public List<String> getLeaders() {
			List<String> leadersList = new ArrayList<>();
			leaders.forEach(leader -> leadersList.add(leader.getAsString()));

			return leadersList;
		}
	}
}
