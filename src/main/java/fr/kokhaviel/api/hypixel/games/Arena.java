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
 * Arena Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Arena {

	/**
	 * Total Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Coins Spent by the Player
	 */
	@SerializedName("coins_spent")
	int coinsSpent = 0;

	/**
	 * Total Keys of the Player
	 */
	@SerializedName("keys")
	int keys = 0;

	/**
	 * Current Offensive Used by the Player
	 */
	@SerializedName("offensive")
	String offensive = "";

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Current Utility Used by the Player
	 */
	@SerializedName("utility")
	String utility = "";

	/**
	 * Current Support Used by the Player
	 */
	@SerializedName("support")
	String support = "";

	/**
	 * Current Ultimate Used by the Player
	 */
	@SerializedName("ultimate")
	String ultimate = "";

	/**
	 * Current Selected Sword of the Player
	 */
	@SerializedName("selected_sword")
	String sword = "";

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Current Rune Used by the Player
	 */
	@SerializedName("active_rune")
	String rune = "";

	/**
	 * Current Melee Trail Used by the Player
	 */
	@SerializedName("active_melee_trail")
	String meleeTrail = "";

	/**
	 * Current Prefix Color Used by the Player
	 */
	@SerializedName("prefix_color")
	String prefixColor = "";

	/**
	 * Current Kill Effect Used by the Player
	 */
	@SerializedName("active_kill_effect")
	String killEffect = "";

	/**
	 * Current Hat Used by the Player
	 */
	@SerializedName("hat")
	String hat = "";


	/**
	 * Get Total Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Coins Spent by the Player
	 *
	 * @return Coins Spent
	 */
	public int getCoinsSpent() {
		return coinsSpent;
	}

	/**
	 * Get Total Keys of the Player
	 *
	 * @return Keys
	 */
	public int getKeys() {
		return keys;
	}

	/**
	 * Get Current Offensive Used by the Player
	 *
	 * @return Offensive Name
	 */
	public String getOffensive() {
		return offensive;
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
	 * Get Current Utility Used by the Player
	 *
	 * @return Utility Name
	 */
	public String getUtility() {
		return utility;
	}

	/**
	 * Get Current Support Used by the Player
	 *
	 * @return Support Name
	 */
	public String getSupport() {
		return support;
	}

	/**
	 * Get Current Ultimate Used by the Player
	 *
	 * @return Ultimate Name
	 */
	public String getUltimate() {
		return ultimate;
	}

	/**
	 * Get Current Selected Sword of the Player
	 *
	 * @return Sword Name
	 */
	public String getSword() {
		return sword;
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
	 * Get Current Rune Used by the Player
	 *
	 * @return Rune Name
	 */
	public String getRune() {
		return rune;
	}

	/**
	 * Get Current Melee Trail of the Player
	 *
	 * @return Trail Name
	 */
	public String getMeleeTrail() {
		return meleeTrail;
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
	 * Get Current Kill Effect Used by the Player
	 *
	 * @return Effect Name
	 */
	public String getKillEffect() {
		return killEffect;
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
		return "Arena{" +
				"coins=" + coins +
				", coinsSpent=" + coinsSpent +
				", keys=" + keys +
				", offensive='" + offensive + '\'' +
				", unlockedPackages=" + unlockedPackages +
				", utility='" + utility + '\'' +
				", support='" + support + '\'' +
				", ultimate='" + ultimate + '\'' +
				", sword='" + sword + '\'' +
				", wins=" + wins +
				", rune='" + rune + '\'' +
				", meleeTrail='" + meleeTrail + '\'' +
				", prefixColor='" + prefixColor + '\'' +
				", killEffect='" + killEffect + '\'' +
				", hat='" + hat + '\'' +
				'}';
	}
}
