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
 * Mega Walls Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class MegaWalls {

	/**
	 * Total Assists of the Player
	 */
	@SerializedName("assists")
	int assists = 0;

	/**
	 * Current Class Used by the Player
	 */
	@SerializedName("chosen_class")
	String chosenClass = "";

	/**
	 * Total Mega Walls Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Total Final Deaths of the Player
	 */
	@SerializedName("finalDeaths")
	int finalDeaths = 0;

	/**
	 * Total Final Kills of the Player
	 */
	@SerializedName("finalKills")
	int finalKills = 0;

	/**
	 * Total Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Total Losses of the Player
	 */
	@SerializedName("losses")
	int losses = 0;

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Current Cry Used by the Player
	 */
	@SerializedName("war_cry")
	String cry = "";

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Total Damage Dealt to Wither
	 */
	@SerializedName("witherDamage")
	int witherDamage = 0;

	/**
	 * Total Time Played of the Player (in Minutes)
	 */
	@SerializedName("time_played")
	int timepLayed = 0;

	/**
	 * Total Meters Fallen by the Player
	 */
	@SerializedName("meters_fallen")
	int fallen = 0;

	/**
	 * Total Meters Walked by the Player
	 */
	@SerializedName("meters_walked")
	int walked = 0;

	/**
	 * Total Games played by the Player
	 */
	@SerializedName("games_played")
	int gamesPlayed = 0;

	/**
	 * Total Damage Dealt by the Player
	 */
	@SerializedName("damage_dealt")
	int damage = 0;

	/**
	 * Total Potions Drunk by the Player
	 */
	@SerializedName("potions_drunk")
	int potionsDrunk = 0;

	/**
	 * Total Blocks Broken by the Player
	 */
	@SerializedName("blocks_broken")
	int blocksBroken = 0;

	/**
	 * Total Blocks Placed by the Player
	 */
	@SerializedName("blocks_placed")
	int blocksPlaced = 0;

	/**
	 * Total Wither Kills of the Player
	 */
	@SerializedName("wither_kills")
	int witherKills = 0;


	/**
	 * Get Total Assists of the Player
	 *
	 * @return Assists
	 */
	public int getAssists() {
		return assists;
	}

	/**
	 * Get Current Class Used by the Player
	 *
	 * @return Class Name
	 */
	public String getChosenClass() {
		return chosenClass;
	}

	/**
	 * Get Total Mega Walls Coins of the Player
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
	 * Get Total Final Deaths of the Player
	 *
	 * @return Final Deaths
	 */
	public int getFinalDeaths() {
		return finalDeaths;
	}

	/**
	 * Get Total Final Kills of the Player
	 *
	 * @return Final Kills
	 */
	public int getFinalKills() {
		return finalKills;
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
	 * Get Total Losses of the Player
	 *
	 * @return Losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * Get All Unlocked Packages (Cosmetics) of the Player
	 *
	 * @return List of All Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Current Cry Used by the Player
	 *
	 * @return Cry Name
	 */
	public String getCry() {
		return cry;
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
	 * Get Total Damage Dealt to Wither by the Player
	 *
	 * @return Wither Damage Dealt
	 */
	public int getWitherDamage() {
		return witherDamage;
	}

	/**
	 * Get Total Time Played of the Player
	 *
	 * @return Time Played in Minutes
	 */
	public int getTimepLayed() {
		return timepLayed;
	}

	/**
	 * Get Total Meters Fallen by the Player
	 *
	 * @return Meters Fallen
	 */
	public int getFallen() {
		return fallen;
	}

	/**
	 * Get Total Meters Walked by the pLayer
	 *
	 * @return Meters Walked
	 */
	public int getWalked() {
		return walked;
	}

	/**
	 * Get Total Games Played by the Player
	 *
	 * @return Games Played
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	/**
	 * Get Total Damage Dealt by the Player
	 *
	 * @return Damage Dealt
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * Get Total Potions Drunk by the Player
	 *
	 * @return Potions Drunk
	 */
	public int getPotionsDrunk() {
		return potionsDrunk;
	}

	/**
	 * Get Total Blocks Broken by the Player
	 *
	 * @return Blocks Broken
	 */
	public int getBlocksBroken() {
		return blocksBroken;
	}

	/**
	 * Get Total Blocks Placed by the Player
	 *
	 * @return Blocks Placed
	 */
	public int getBlocksPlaced() {
		return blocksPlaced;
	}

	/**
	 * Get Total Wither Kills of the Player
	 *
	 * @return Wither Kills
	 */
	public int getWitherKills() {
		return witherKills;
	}

	@Override
	public String toString() {
		return "MegaWalls{" +
				"assists=" + assists +
				", chosenClass='" + chosenClass + '\'' +
				", coins=" + coins +
				", deaths=" + deaths +
				", finalDeaths=" + finalDeaths +
				", finalKills=" + finalKills +
				", kills=" + kills +
				", losses=" + losses +
				", unlockedPackages=" + unlockedPackages +
				", cry='" + cry + '\'' +
				", wins=" + wins +
				", witherDamage=" + witherDamage +
				", timepLayed=" + timepLayed +
				", fallen=" + fallen +
				", walked=" + walked +
				", gamesPlayed=" + gamesPlayed +
				", damage=" + damage +
				", potionsDrunk=" + potionsDrunk +
				", blocksBroken=" + blocksBroken +
				", blocksPlaced=" + blocksPlaced +
				", witherKills=" + witherKills +
				'}';
	}
}
