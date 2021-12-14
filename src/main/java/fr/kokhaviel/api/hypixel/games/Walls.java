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
 * Walls Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Walls {

	/**
	 * Total Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Total Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Losses of the Player
	 */
	@SerializedName("losses")
	int losses = 0;

	/**
	 * Total Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

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
	 * Total Assists of the Player
	 */
	@SerializedName("assists")
	int assists = 0;


	/**
	 * Get Total Kills of the Player
	 *
	 * @return Kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * Get Total Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Losses of the Player
	 *
	 * @return Losses
	 */
	public int getLosses() {
		return losses;
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
	 * Get Total Assists of the Player
	 *
	 * @return Assists
	 */
	public int getAssists() {
		return assists;
	}

	@Override
	public String toString() {
		return "Walls{" +
				"kills=" + kills +
				", coins=" + coins +
				", losses=" + losses +
				", deaths=" + deaths +
				", unlockedPackages=" + unlockedPackages +
				", wins=" + wins +
				", assists=" + assists +
				'}';
	}
}

