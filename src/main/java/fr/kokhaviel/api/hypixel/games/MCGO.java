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
 * Cops And Crims Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class MCGO {

	/**
	 * Total Bombs Defused by the Player
	 */
	@SerializedName("bombs_defused")
	int bombsDefused = 0;

	/**
	 * Total Bombs Planted by the Player
	 */
	@SerializedName("bombs_planted")
	int bombsPlanted = 0;

	/**
	 * Total Cops And Crims Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Cop Kills of the Player
	 */
	@SerializedName("cop_kills")
	int copKills = 0;

	/**
	 * Total Criminal Kills of the Player
	 */
	@SerializedName("criminal_kills")
	int criminalKills = 0;

	/**
	 * Total Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("game_wins")
	int wins = 0;

	/**
	 * Total Headshots of the Player
	 */
	@SerializedName("headshot_kills")
	int headshots = 0;

	/**
	 * Total Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Total Shots Fired by the Player
	 */
	@SerializedName("shots_fired")
	int shotsFired = 0;

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Current Lobby Prefix Used by the Player
	 */
	@SerializedName("selected_lobby_prefix")
	String lobbyPrefix = "";

	/**
	 * Total Grenade Kills of the Player
	 */
	@SerializedName("grenade_kills")
	int grenadeKills = 0;

	/**
	 * Total Pistol Kills of the Player
	 */
	@SerializedName("pistolKills")
	int pistolKills = 0;

	/**
	 * Total Carbine Kills of the Player
	 */
	@SerializedName("carbineKills")
	int carbineKills = 0;

	/**
	 * Total Assists of the Player
	 */
	@SerializedName("assists")
	int assists = 0;

	/**
	 * Total Rifle Kills of the Player
	 */
	@SerializedName("rifleKills")
	int rifleKills = 0;

	/**
	 * Total Sniper Kills of the Player
	 */
	@SerializedName("sniperKills")
	int sniperKills = 0;


	/**
	 * Get Total Bombs Defused by the Player
	 *
	 * @return Bombs Defused
	 */
	public int getBombsDefused() {
		return bombsDefused;
	}

	/**
	 * Get Total Bombs Planted by the Player
	 *
	 * @return Bombs Planted
	 */
	public int getBombsPlanted() {
		return bombsPlanted;
	}

	/**
	 * Get Total Cops and Crims Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Cop Kills of the Player
	 *
	 * @return Cop Kills
	 */
	public int getCopKills() {
		return copKills;
	}

	/**
	 * Get Total Criminal Kills of the player
	 *
	 * @return Criminal Kills
	 */
	public int getCriminalKills() {
		return criminalKills;
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
	 * Get Total Wins of the Player
	 *
	 * @return Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Total Headshots of the Player
	 *
	 * @return Headshots
	 */
	public int getHeadshots() {
		return headshots;
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
	 * Get Total Shots Fired by the Player
	 *
	 * @return Shots Fired
	 */
	public int getShotsFired() {
		return shotsFired;
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
	 * Get Current lobby Prefix Used by the Player
	 *
	 * @return Prefix Name
	 */
	public String getLobbyPrefix() {
		return lobbyPrefix;
	}

	/**
	 * Get Total Grenade Kills of the Player
	 *
	 * @return Grenade Kills
	 */
	public int getGrenadeKills() {
		return grenadeKills;
	}

	/**
	 * Get Total Pistol Kills of the Player
	 *
	 * @return Pistol Kills
	 */
	public int getPistolKills() {
		return pistolKills;
	}

	/**
	 * Get Total Carbine Kills of the Player
	 *
	 * @return Carbine Kills
	 */
	public int getCarbineKills() {
		return carbineKills;
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
	 * Get Total Rifle Kills of the Player
	 *
	 * @return Rifle Kills
	 */
	public int getRifleKills() {
		return rifleKills;
	}

	/**
	 * Get Total Sniper Kills of the Player
	 *
	 * @return Sniper Kills
	 */
	public int getSniperKills() {
		return sniperKills;
	}

	@Override
	public String toString() {
		return "MCGO{" +
				"bombsDefused=" + bombsDefused +
				", bombsPlanted=" + bombsPlanted +
				", coins=" + coins +
				", copKills=" + copKills +
				", criminalKills=" + criminalKills +
				", deaths=" + deaths +
				", wins=" + wins +
				", headshots=" + headshots +
				", kills=" + kills +
				", shotsFired=" + shotsFired +
				", unlockedPackages=" + unlockedPackages +
				", lobbyPrefix='" + lobbyPrefix + '\'' +
				", grenadeKills=" + grenadeKills +
				", pistolKills=" + pistolKills +
				", carbineKills=" + carbineKills +
				", assists=" + assists +
				", rifleKills=" + rifleKills +
				", sniperKills=" + sniperKills +
				'}';
	}
}