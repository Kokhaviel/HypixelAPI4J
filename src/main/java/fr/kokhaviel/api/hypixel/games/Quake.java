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
 * Quake Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Quake {

	/**
	 * Current Barrel Used by the Player
	 */
	@SerializedName("barrel")
	String barrel = "";

	/**
	 * Current Case Used by the Player
	 */
	@SerializedName("case")
	String case_ = "";

	/**
	 * Total Quakecraft Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Total Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Current Kill Sound Used by the Player
	 */
	@SerializedName("killsound")
	String killSound = "";

	/**
	 * Current Killstreak of the Player
	 */
	@SerializedName("killstreaks")
	int killstreaks = 0;

	/**
	 * Current Muzzle Used by the Player
	 */
	@SerializedName("muzzle")
	String muzzle = "";

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Current Sight Used by the Player
	 */
	@SerializedName("sight")
	String sight = "";

	/**
	 * Current Trigger Used by the Player
	 */
	@SerializedName("trigger")
	String trigger = "";

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Current Dash Cooldown of the Player
	 */
	@SerializedName("dash_cooldown")
	String dashCooldown = "";

	/**
	 * Current Dash Power of the Player
	 */
	@SerializedName("dash_power")
	String dashPower = "";

	/**
	 * Total headshots of the Player
	 */
	@SerializedName("headshots")
	int headshots = 0;

	/**
	 * Total Distance Travelled by the Player
	 */
	@SerializedName("distance_travelled")
	int travelled = 0;

	/**
	 * Total Shots Fired by the Player
	 */
	@SerializedName("shots_fired")
	int shotsFired = 0;

	/**
	 * Current Beam Used by the Player
	 */
	@SerializedName("beam")
	String beam = "";

	/**
	 * Current Kill Prefix Used by the Player
	 */
	@SerializedName("selectedKillPrefix")
	String killPrefix = "";


	/**
	 * Get Current Barrel Used by the Player
	 *
	 * @return Barrel Name
	 */
	public String getBarrel() {
		return barrel;
	}

	/**
	 * Get Current Case Used by the Player
	 *
	 * @return Case Name
	 */
	public String getCase() {
		return case_;
	}

	/**
	 * Get Total Quakecraft Coins of the Player
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
	 * Get Total Kills of the Player
	 *
	 * @return Kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * Get Current Kill Sound Used by the Player
	 *
	 * @return Kill Sound Name
	 */
	public String getKillSound() {
		return killSound;
	}

	/**
	 * Get Current Killstreak of the Player
	 *
	 * @return Current Killstreak
	 */
	public int getKillstreaks() {
		return killstreaks;
	}

	/**
	 * Get Current Muzzle Used by the Player
	 *
	 * @return Muzzle Name
	 */
	public String getMuzzle() {
		return muzzle;
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
	 * Get Current Sight Used by the Player
	 *
	 * @return Sight Name
	 */
	public String getSight() {
		return sight;
	}

	/**
	 * Get Current Trigger Used by the Player
	 *
	 * @return Trigger Name
	 */
	public String getTrigger() {
		return trigger;
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
	 * Get Current Dash Cooldown of the Player
	 *
	 * @return Dash Cooldown
	 */
	public String getDashCooldown() {
		return dashCooldown;
	}

	/**
	 * Get Current Dash Power of the Player
	 *
	 * @return Dash Power
	 */
	public String getDashPower() {
		return dashPower;
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
	 * Get Total Meters Travelled by the Player
	 *
	 * @return Meters Travelled
	 */
	public int getTravelled() {
		return travelled;
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
	 * Get Current Beam Used by the Player
	 *
	 * @return Beam Name
	 */
	public String getBeam() {
		return beam;
	}

	/**
	 * Get Current Kill Prefix Used by the Player
	 *
	 * @return Kill Prefix Name
	 */
	public String getKillPrefix() {
		return killPrefix;
	}

	@Override
	public String toString() {
		return "Quake{" +
				"barrel='" + barrel + '\'' +
				", case_='" + case_ + '\'' +
				", coins=" + coins +
				", deaths=" + deaths +
				", kills=" + kills +
				", killSound='" + killSound + '\'' +
				", killstreaks=" + killstreaks +
				", muzzle='" + muzzle + '\'' +
				", unlockedPackages=" + unlockedPackages +
				", sight='" + sight + '\'' +
				", trigger='" + trigger + '\'' +
				", wins=" + wins +
				", dashCooldown='" + dashCooldown + '\'' +
				", dashPower='" + dashPower + '\'' +
				", headshots=" + headshots +
				", travelled=" + travelled +
				", shotsFired=" + shotsFired +
				", beam='" + beam + '\'' +
				", killPrefix='" + killPrefix + '\'' +
				'}';
	}
}
