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

package fr.kokhaviel.api.hypixel.games;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * UHC Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class UHC {

	/**
	 * Current Kit Used by the Player
	 */
	@SerializedName("equippedKit")
	String kit = "";

	/**
	 * Total UHC Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Total Heads Eaten by the Player
	 */
	@SerializedName("heads_eaten")
	int headsEaten = 0;

	/**
	 * Total Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Total Score of the Player
	 */
	@SerializedName("score")
	int score = 0;

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Total Ultimate Craft of the Player
	 */
	@SerializedName("ultimates_crafted")
	int ultimateCraft = 0;


	/**
	 * Get Current Kit Used by the Player
	 *
	 * @return Kit Name
	 */
	public String getKit() {
		return kit;
	}

	/**
	 * Get Total UHC Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Deaths of the Player
	 *
	 * @return Deaths
	 */
	public int getDeaths() {
		return deaths;
	}

	/**
	 * Get Total Heads Eaten by the Player
	 *
	 * @return Heads Eaten
	 */
	public int getHeadsEaten() {
		return headsEaten;
	}

	/**
	 * Get Total Kills of the Player
	 *
	 * @return Kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * Get Total Score of the Player
	 *
	 * @return Score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * Get All Unlocked Packages (Cosmetics) of the Player
	 *
	 * @return List of Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Total Wins of the Player
	 *
	 * @return Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Total Ultimate Items Crafted by the Player
	 *
	 * @return Ultimate Craft
	 */
	public int getUltimateCraft() {
		return ultimateCraft;
	}

	@Override
	public String toString() {
		return "UHC{" +
				"kit='" + kit + '\'' +
				", coins=" + coins +
				", deaths=" + deaths +
				", headsEaten=" + headsEaten +
				", kills=" + kills +
				", score=" + score +
				", unlockedPackages=" + unlockedPackages +
				", wins=" + wins +
				", ultimateCraft=" + ultimateCraft +
				'}';
	}
}
