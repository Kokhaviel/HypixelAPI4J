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

/**
 * Smash Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Smash {

	/**
	 * Total Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Current Class Used by the Player
	 */
	@SerializedName("active_class")
	String class_ = "";

	/**
	 * Total Smasher of the Player
	 */
	@SerializedName("smasher")
	int smasher = 0;

	/**
	 * Total Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Total Damage Dealt by the Player
	 */
	@SerializedName("damage_dealt")
	int damageDealt = 0;

	/**
	 * Total Players Smashed by the Player
	 */
	@SerializedName("smashed")
	int smashed = 0;

	/**
	 * Total Deaths of the player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Total Games Played by the Player
	 */
	@SerializedName("games")
	int gamesPlayed = 0;

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
	 * Total Assists of the Player
	 */
	@SerializedName("assists")
	int assists = 0;


	/**
	 * Get Total Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Current Class Used by the Player
	 *
	 * @return Class Name
	 */
	public String getChosenClass() {
		return class_;
	}

	/**
	 * Total Smasher of the Player
	 *
	 * @return Smasher
	 */
	public int getSmasher() {
		return smasher;
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
	 * Get Total Wins of the Player
	 *
	 * @return Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Total Damage Dealt by the Player
	 *
	 * @return Damage Dealt
	 */
	public int getDamageDealt() {
		return damageDealt;
	}

	/**
	 * Get Total Players Smashed by the Player
	 *
	 * @return Players Smashed
	 */
	public int getSmashed() {
		return smashed;
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
	 * Get Total Games Played by the Player
	 *
	 * @return Games Played
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
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
	 * Get Total Assists of the Player
	 *
	 * @return Assists
	 */
	public int getAssists() {
		return assists;
	}

	@Override
	public String toString() {
		return "Smash{" +
				"coins=" + coins +
				", class_='" + class_ + '\'' +
				", smasher=" + smasher +
				", kills=" + kills +
				", wins=" + wins +
				", damageDealt=" + damageDealt +
				", smashed=" + smashed +
				", deaths=" + deaths +
				", gamesPlayed=" + gamesPlayed +
				", losses=" + losses +
				", quits=" + quits +
				", assists=" + assists +
				'}';
	}
}