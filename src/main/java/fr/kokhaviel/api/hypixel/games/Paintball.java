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
 * Paintball Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Paintball {

	/**
	 * Current Adrenaline Level of the Player
	 */
	@SerializedName("adrenaline")
	int adrenaline = 0;

	/**
	 * Total Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Current Endurance Level of the Player
	 */
	@SerializedName("endurance")
	int endurance = 0;

	/**
	 * Current Fortune Level of the Player
	 */
	@SerializedName("fortune")
	int fortune = 0;

	/**
	 * Current God Father Level of the Player
	 */
	@SerializedName("godfather")
	int godFather = 0;

	/**
	 * Total Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Total Shots Fired by the Player
	 */
	@SerializedName("shots_fired")
	int shotsFired = 0;

	/**
	 * Current Super Luck Level of the Player
	 */
	@SerializedName("superluck")
	int superLuck = 0;

	/**
	 * Current Transfusion Level of the Player
	 */
	@SerializedName("transfusion")
	int transfusion = 0;

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Current Hat Used by the Player
	 */
	@SerializedName("hat")
	String hat = "";

	/**
	 * Get Current Adrenaline Level of the Player
	 *
	 * @return Adrenaline Level
	 */
	public int getAdrenaline() {
		return adrenaline;
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
	 * Get Total Deaths of the Player
	 *
	 * @return Deaths
	 */
	public int getDeaths() {
		return deaths;
	}

	/**
	 * Get Current Endurance Level of the Player
	 *
	 * @return Endurance Level
	 */
	public int getEndurance() {
		return endurance;
	}

	/**
	 * Get Current Fortune Level of the Player
	 *
	 * @return Fortune Level
	 */
	public int getFortune() {
		return fortune;
	}

	/**
	 * Get Current God Father Level fo the Player
	 *
	 * @return God Father Level
	 */
	public int getGodFather() {
		return godFather;
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
	 * Get All Unlocked Packages (Cosmetics) of the Player
	 *
	 * @return List of Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Total Shots Fired by the Player
	 *
	 * @return Shots Fired
	 */
	public int getShotsFired() {
		return shotsFired;
	}

	/**
	 * Get Current Super Luck Level of the Player
	 *
	 * @return Super Luck Level
	 */
	public int getSuperLuck() {
		return superLuck;
	}

	/**
	 * Get Current Transfusion Level of the pLayer
	 *
	 * @return Transfusion Level
	 */
	public int getTransfusion() {
		return transfusion;
	}

	/**
	 * Get Total Wins of the pLayer
	 *
	 * @return Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Current Hat Used by the Player
	 *
	 * @return Hat Name
	 */
	public String getHat() {
		return hat;
	}

	@Override
	public String toString() {
		return "Paintball{" +
				"adrenaline=" + adrenaline +
				", coins=" + coins +
				", deaths=" + deaths +
				", endurance=" + endurance +
				", fortune=" + fortune +
				", godFather=" + godFather +
				", kills=" + kills +
				", unlockedPackages=" + unlockedPackages +
				", shotsFired=" + shotsFired +
				", superLuck=" + superLuck +
				", transfusion=" + transfusion +
				", wins=" + wins +
				", hat='" + hat + '\'' +
				'}';
	}
}
