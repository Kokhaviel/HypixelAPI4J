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
 * Gingerbread Hypixel Player Statistics
 */
public class GingerBread {

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Current Helmet Used by the Player
	 */
	@SerializedName("helmet_active")
	String helmet = "";

	/**
	 * Current Jacket Used by the Player
	 */
	@SerializedName("jacket_active")
	String jacket = "";

	/**
	 * Current Pants Used by the Player
	 */
	@SerializedName("pants_active")
	String pants = "";

	/**
	 * Current Shoes USed by the Player
	 */
	@SerializedName("shoes_active")
	String shoes = "";

	/**
	 * Current Skin USed by the Player
	 */
	@SerializedName("skin_active")
	String skin = "";

	/**
	 * Total Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Box Pickups of the Player
	 */
	@SerializedName("box_pickups")
	int boxPickups = 0;

	/**
	 * Total Coins Picked Up by the Player
	 */
	@SerializedName("coins_picked_up")
	int coinsPickedUp = 0;

	/**
	 * Total Laps Completed by the Player
	 */
	@SerializedName("laps_completed")
	int laps = 0;

	/**
	 * Total Bronze Trophies of the Player
	 */
	@SerializedName("bronze_trophy")
	int bronze = 0;

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Total Gold Trophies of the Player
	 */
	@SerializedName("gold_trophy")
	int gold = 0;

	/**
	 * Total Silver Trophies of the Player
	 */
	@SerializedName("silver_trophy")
	int silver = 0;

	/**
	 * Current Prefix Color Used by the Player
	 */
	@SerializedName("prefix_color")
	String prefixColor = "";

	/**
	 * Current Particle Trail Used by the Player
	 */
	@SerializedName("particle_trail")
	String particleTrail = "";


	/**
	 * Get All Unlocked Packages (Cosmetics) of the Player
	 *
	 * @return List of Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Current Helmet Used by the Player
	 *
	 * @return Helmet Name
	 */
	public String getHelmet() {
		return helmet;
	}

	/**
	 * Get Current Jacket Used by the Player
	 *
	 * @return Jacket Name
	 */
	public String getJacket() {
		return jacket;
	}

	/**
	 * Get Current Pants Used by the Player
	 *
	 * @return Pants Name
	 */
	public String getPants() {
		return pants;
	}

	/**
	 * Get Current Shoes USed by the Player
	 *
	 * @return Shoes Name
	 */
	public String getShoes() {
		return shoes;
	}

	/**
	 * Get Current SKin Used by the Player
	 *
	 * @return Skin Name
	 */
	public String getSkin() {
		return skin;
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
	 * Get Total Box Pickup of the Player
	 *
	 * @return Bow Pickup
	 */
	public int getBoxPickups() {
		return boxPickups;
	}

	/**
	 * Get Total Coins Picked Up by the Player
	 *
	 * @return Coins Picked Up
	 */
	public int getCoinsPickedUp() {
		return coinsPickedUp;
	}

	/**
	 * Get Total Laps Completed by the Player
	 *
	 * @return Laps Completed
	 */
	public int getLaps() {
		return laps;
	}

	/**
	 * Get Total Bronze Trophies of the Player
	 *
	 * @return Bronze Trophies Won
	 */
	public int getBronze() {
		return bronze;
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
	 * Get Total Gold Trophies of the Player
	 *
	 * @return Gold Trophies Won
	 */
	public int getGold() {
		return gold;
	}

	/**
	 * Get Total Silver Trophies of the Player
	 *
	 * @return Silver Trophies Won
	 */
	public int getSilver() {
		return silver;
	}

	/**
	 * Get Current Prefix Color Used by the Player
	 *
	 * @return Prefix Color
	 */
	public String getPrefixColor() {
		return prefixColor;
	}

	/**
	 * Get Current Particle Trail Used by the Player
	 *
	 * @return Trail Name
	 */
	public String getParticleTrail() {
		return particleTrail;
	}

	@Override
	public String toString() {
		return "GingerBread{" +
				"unlockedPackages=" + unlockedPackages +
				", helmet='" + helmet + '\'' +
				", jacket='" + jacket + '\'' +
				", pants='" + pants + '\'' +
				", shoes='" + shoes + '\'' +
				", skin='" + skin + '\'' +
				", coins=" + coins +
				", boxPickups=" + boxPickups +
				", coinsPickedUp=" + coinsPickedUp +
				", laps=" + laps +
				", bronze=" + bronze +
				", wins=" + wins +
				", gold=" + gold +
				", silver=" + silver +
				", prefixColor='" + prefixColor + '\'' +
				", particleTrail='" + particleTrail + '\'' +
				'}';
	}
}
