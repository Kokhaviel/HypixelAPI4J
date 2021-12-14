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
 * Speed UHC Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class SpeedUHC {

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Total Tears Well Uses of the Player
	 */
	@SerializedName("tearWellUses")
	int tearsWellUses = 0;

	/**
	 * Total Tears of the Player
	 */
	@SerializedName("tears")
	int tears = 0;

	/**
	 * Current Killstreak of the Player
	 */
	@SerializedName("killstreak")
	int killstreak = 0;

	/**
	 * Best Killstreak of the Player
	 */
	@SerializedName("highestKillstreak")
	int highestKillstreak = 0;

	/**
	 * Current Winstreak of the Player
	 */
	@SerializedName("winstreak")
	int winstreak = 0;

	/**
	 * Total Speed UHC Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Losses of the Player
	 */
	@SerializedName("losses")
	int losses = 0;

	/**
	 * Total Quits of the Player
	 */
	@SerializedName("quits")
	int quits = 0;

	/**
	 * Total Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Total Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Total Survived Players
	 */
	@SerializedName("survived_players")
	int survivedPlayers = 0;

	/**
	 * Total Assists of the Player
	 */
	@SerializedName("assists")
	int assists = 0;

	/**
	 * Total Blocks Placed by the Player
	 */
	@SerializedName("blocks_placed")
	int blocksPlaced = 0;

	/**
	 * Total Enchanted Items of the Player
	 */
	@SerializedName("items_enchanted")
	int itemsEnchanted = 0;

	/**
	 * Total Games Played by the Player
	 */
	@SerializedName("games")
	int gamesPlayed = 0;

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Total Arrows Shot by the Player
	 */
	@SerializedName("arrows_shot")
	int arrowsShot = 0;

	/**
	 * Total Arrows Hit of the Player
	 */
	@SerializedName("arrows_hit")
	int arrowsHit = 0;

	/**
	 * Total Score of the Player
	 */
	@SerializedName("score")
	int score = 0;

	/**
	 * Current Victory Dance Used by the Player
	 */
	@SerializedName("active_victorydance")
	String victoryDance = "";

	/**
	 * Current Kill Effect Used by the Player
	 */
	@SerializedName("active_killeffect")
	String killEffect = "";

	/**
	 * Current Cage Used by the Player
	 */
	@SerializedName("active_cage")
	String cage = "";

	/**
	 * Current Projectile Trail Used by the Player
	 */
	@SerializedName("active_projectiletrail")
	String projectileTrail = "";


	/**
	 * Get All Unlocked Packages (Cosmetics) of the Player
	 *
	 * @return List of All Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Total Tears Well Uses of the Player
	 *
	 * @return Tears Well Uses
	 */
	public int getTearsWellUses() {
		return tearsWellUses;
	}

	/**
	 * Get Total Tears of the Player
	 *
	 * @return Tears
	 */
	public int getTears() {
		return tears;
	}

	/**
	 * Get Current Killstreak of the Player
	 *
	 * @return Current Killstreak
	 */
	public int getKillstreak() {
		return killstreak;
	}

	/**
	 * Get Best Killstreak of the Player
	 *
	 * @return Best Killstreak
	 */
	public int getHighestKillstreak() {
		return highestKillstreak;
	}

	/**
	 * Get Current Winstreak of the Player
	 *
	 * @return Current Winstreak
	 */
	public int getWinstreak() {
		return winstreak;
	}

	/**
	 * Get Total Speed UHC Coins of the Player
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
	 * Get Total Quits of the Player
	 *
	 * @return Quits
	 */
	public int getQuits() {
		return quits;
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
	 * Get Total Deaths of the Player
	 *
	 * @return Deaths
	 */
	public int getDeaths() {
		return deaths;
	}

	/**
	 * Get Total Survived Players of the Player
	 *
	 * @return Survived Players
	 */
	public int getSurvivedPlayers() {
		return survivedPlayers;
	}

	/**
	 * Get Total Assists of the Player
	 *
	 * @return Assists
	 */
	public int getAssists() {
		return assists;
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
	 * Get Total Enchanted Items of the Player
	 *
	 * @return Enchanted Items
	 */
	public int getItemsEnchanted() {
		return itemsEnchanted;
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
	 * Get Total Wins of the Player
	 *
	 * @return Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Total Arrows Shot by the Player
	 *
	 * @return Arrows Shot
	 */
	public int getArrowsShot() {
		return arrowsShot;
	}

	/**
	 * Get Total Arrows Hit of the Player
	 *
	 * @return Arrows Hit
	 */
	public int getArrowsHit() {
		return arrowsHit;
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
	 * Get Current Victory Dance Used by the Player
	 *
	 * @return Dance Name
	 */
	public String getVictoryDance() {
		return victoryDance;
	}

	/**
	 * Get Current Kill Effect Used by the Player
	 *
	 * @return Effect Name
	 */
	public String getKillEffect() {
		return killEffect;
	}

	/**
	 * Get Current Cage Used by the Player
	 *
	 * @return Cage Name
	 */
	public String getCage() {
		return cage;
	}

	/**
	 * Get Current Projectile Trail Used by the Player
	 *
	 * @return Trail Name
	 */
	public String getProjectileTrail() {
		return projectileTrail;
	}

	@Override
	public String toString() {
		return "SpeedUHC{" +
				"unlockedPackages=" + unlockedPackages +
				", tearsWellUses=" + tearsWellUses +
				", tears=" + tears +
				", killstreak=" + killstreak +
				", highestKillstreak=" + highestKillstreak +
				", winstreak=" + winstreak +
				", coins=" + coins +
				", losses=" + losses +
				", quits=" + quits +
				", kills=" + kills +
				", deaths=" + deaths +
				", survivedPlayers=" + survivedPlayers +
				", assists=" + assists +
				", blocksPlaced=" + blocksPlaced +
				", itemsEnchanted=" + itemsEnchanted +
				", gamesPlayed=" + gamesPlayed +
				", wins=" + wins +
				", arrowsShot=" + arrowsShot +
				", arrowsHit=" + arrowsHit +
				", score=" + score +
				", victoryDance='" + victoryDance + '\'' +
				", killEffect='" + killEffect + '\'' +
				", cage='" + cage + '\'' +
				", projectileTrail='" + projectileTrail + '\'' +
				'}';
	}
}