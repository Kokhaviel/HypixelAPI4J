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
 * VampireZ Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class VampireZ {

	/**
	 * Total VampireZ Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Human Deaths of the Player
	 */
	@SerializedName("human_deaths")
	int humanDeaths = 0;

	/**
	 * Total Human Kills of the Player
	 */
	@SerializedName("human_kills")
	int humanKills = 0;

	/**
	 * Total Human Wins of the Player
	 */
	@SerializedName("human_wins")
	int humanWins = 0;

	/**
	 * Total Vampire Deaths of the Player
	 */
	@SerializedName("vampire_deaths")
	int vampireDeaths = 0;

	/**
	 * Total Vampire Kills of the Player
	 */
	@SerializedName("vampire_kills")
	int vampireKills = 0;

	/**
	 * Total Zombie Kills of the Player
	 */
	@SerializedName("zombie_kills")
	int zombieKills = 0;

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Total Gold Bought by the Player
	 */
	@SerializedName("gold_bought")
	int goldBought = 0;

	/**
	 * Total Vampire Wins of the Player
	 */
	@SerializedName("vampire_wins")
	int vampireWins = 0;

	/**
	 * Current Vampire Color Used by the Player
	 */
	@SerializedName("vamp_color")
	String vampireColor = "";


	/**
	 * Get Total VampireZ Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Human Deaths of the Player
	 *
	 * @return Human Deaths
	 */
	public int getHumanDeaths() {
		return humanDeaths;
	}

	/**
	 * Get Total Human Kills of the Player
	 *
	 * @return Human Kills
	 */
	public int getHumanKills() {
		return humanKills;
	}

	/**
	 * Get Total Human Wins of the Player
	 *
	 * @return Human Wins
	 */
	public int getHumanWins() {
		return humanWins;
	}

	/**
	 * Get Total Vampire Deaths of the Player
	 *
	 * @return Vampire Deaths
	 */
	public int getVampireDeaths() {
		return vampireDeaths;
	}

	/**
	 * Get Total Vampire Kills of the Player
	 *
	 * @return Vampire Kills
	 */
	public int getVampireKills() {
		return vampireKills;
	}

	/**
	 * Get Total Zombie Kills of the Player
	 *
	 * @return Zombie Kills
	 */
	public int getZombieKills() {
		return zombieKills;
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
	 * Get Total Gold Bought by the Player
	 *
	 * @return Gold Bought
	 */
	public int getGoldBought() {
		return goldBought;
	}

	/**
	 * Get Total Vampire Wins of the Player
	 *
	 * @return Vampire Wins
	 */
	public int getVampireWins() {
		return vampireWins;
	}

	/**
	 * Get Current Vampire Color Used by the Player
	 *
	 * @return Vampire Color
	 */
	public String getVampireColor() {
		return vampireColor;
	}

	@Override
	public String toString() {
		return "VampireZ{" +
				"coins=" + coins +
				", humanDeaths=" + humanDeaths +
				", humanKills=" + humanKills +
				", humanWins=" + humanWins +
				", vampireDeaths=" + vampireDeaths +
				", vampireKills=" + vampireKills +
				", zombieKills=" + zombieKills +
				", unlockedPackages=" + unlockedPackages +
				", goldBought=" + goldBought +
				", vampireWins=" + vampireWins +
				", vampireColor='" + vampireColor + '\'' +
				'}';
	}
}
