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

import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

public class Counts {

	final boolean success;
	final int playerCount;
	final JsonObject gamesCountObject;

	public Counts(JsonObject playerCountsObject) {
		this.success = playerCountsObject.get("success").getAsBoolean();
		this.playerCount = playerCountsObject.get("playerCount").getAsInt();
		this.gamesCountObject = playerCountsObject.getAsJsonObject("games");
	}

	public boolean isSuccess() {
		return success;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	public CountsGames getCountsGames() {
		return new CountsGames(gamesCountObject);
	}

	public static class CountsGames {
		final JsonObject gamesCountObject;
		final Map<String, Integer> countsGames = new HashMap<>();

		public CountsGames(JsonObject gamesCountObject) {
			this.gamesCountObject = gamesCountObject;
			putCountsData();
		}

		void putCountsData() {
			countsGames.put("MAIN_LOBBY", gamesCountObject.get("MAIN_LOBBY").getAsJsonObject().get("players").getAsInt());
			countsGames.put("TOURNAMENT_LOBBY", gamesCountObject.get("TOURNAMENT_LOBBY").getAsJsonObject().get("players").getAsInt());
			countsGames.put("DUELS", gamesCountObject.get("DUELS").getAsJsonObject().get("players").getAsInt());
			countsGames.put("TNT_GAMES", gamesCountObject.get("TNTGAMES").getAsJsonObject().get("players").getAsInt());
			countsGames.put("SUPER_SMASH", gamesCountObject.get("SUPER_SMASH").getAsJsonObject().get("players").getAsInt());
			countsGames.put("BATTLEGROUND", gamesCountObject.get("BATTLEGROUND").getAsJsonObject().get("players").getAsInt());
			countsGames.put("LEGACY", gamesCountObject.get("LEGACY").getAsJsonObject().get("players").getAsInt());
			countsGames.put("ARCADE", gamesCountObject.get("ARCADE").getAsJsonObject().get("players").getAsInt());
			countsGames.put("MURDER_MYSTERY", gamesCountObject.get("MURDER_MYSTERY").getAsJsonObject().get("players").getAsInt());
			countsGames.put("HOUSING", gamesCountObject.get("HOUSING").getAsJsonObject().get("players").getAsInt());
			countsGames.put("SURVIVAL_GAMES", gamesCountObject.get("SURVIVAL_GAMES").getAsJsonObject().get("players").getAsInt());
			countsGames.put("BUILD_BATTLE", gamesCountObject.get("BUILD_BATTLE").getAsJsonObject().get("players").getAsInt());
			countsGames.put("REPLAY", gamesCountObject.get("REPLAY").getAsJsonObject().get("players").getAsInt());
			countsGames.put("UHC", gamesCountObject.get("UHC").getAsJsonObject().get("players").getAsInt());
			countsGames.put("SKYWARS", gamesCountObject.get("SKYWARS").getAsJsonObject().get("players").getAsInt());
			countsGames.put("SKYBLOCK", gamesCountObject.get("SKYBLOCK").getAsJsonObject().get("players").getAsInt());
			countsGames.put("MEGA_WALLS", gamesCountObject.get("WALLS3").getAsJsonObject().get("players").getAsInt());
			countsGames.put("BEDWARS", gamesCountObject.get("BEDWARS").getAsJsonObject().get("players").getAsInt());
			countsGames.put("SPEED_UHC", gamesCountObject.get("SPEED_UHC").getAsJsonObject().get("players").getAsInt());
			countsGames.put("MCGO", gamesCountObject.get("MCGO").getAsJsonObject().get("players").getAsInt());
			countsGames.put("PROTOTYPE", gamesCountObject.get("PROTOTYPE").getAsJsonObject().get("players").getAsInt());
			countsGames.put("LIMBO", gamesCountObject.get("LIMBO").getAsJsonObject().get("players").getAsInt());
			countsGames.put("IDLE", gamesCountObject.get("IDLE").getAsJsonObject().get("players").getAsInt());
			countsGames.put("QUEUE", gamesCountObject.get("QUEUE").getAsJsonObject().get("players").getAsInt());
		}

		public Map<String, Integer> getCountsGames() {
			return countsGames;
		}
	}
}
