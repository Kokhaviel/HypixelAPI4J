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
 * BattleGrounds Hypixel player Statistics
 */
public class BattleGround {

	/**
	 * Current Class Used by the Player
	 */
	@SerializedName("chosen_class")
	String class_ = "";

	/**
	 * Total Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Damage Dealt by the Player
	 */
	@SerializedName("damage")
	int damage = 0;

	/**
	 * Total Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Total Amount Healed by the Player
	 */
	@SerializedName("heal")
	int healed = 0;

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
	 * Total Magic Dust of the Player
	 */
	@SerializedName("magic_dust")
	int dust = 0;

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Total Items Repaired by the Player
	 */
	@SerializedName("repaired")
	int repaired = 0;

	/**
	 * Total Void Shards of the Player
	 */
	@SerializedName("void_shards")
	int shards = 0;

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Private Games Settings of the Player
	 */
	@SerializedName("privategames")
	PrivateGames privateGames = new PrivateGames();

	/**
	 * Total Assists of the Player
	 */
	@SerializedName("assists")
	int assists = 0;

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
		return class_;
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
	 * Get Total Damage Dealt by the Player
	 *
	 * @return Damage Dealt
	 */
	public int getDamage() {
		return damage;
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
	 * Get Total Healed by the Player
	 *
	 * @return Healed
	 */
	public int getHealed() {
		return healed;
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
	 * Get Total Magic Dust of the Player
	 *
	 * @return Magic Dust
	 */
	public int getDust() {
		return dust;
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
	 * Get Total Items Repaired by the Player
	 *
	 * @return Items Repaired
	 */
	public int getRepaired() {
		return repaired;
	}

	/**
	 * Get Total Shards of the Player
	 *
	 * @return Shards
	 */
	public int getShards() {
		return shards;
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
	 * Get Battle Ground Private Games Settings of the Player
	 *
	 * @return Private Games Settings
	 */
	public PrivateGames getPrivateGames() {
		return privateGames;
	}

	/**
	 * Walls Private Games Settings
	 *
	 * @author Kokhaviel
	 * @since 1.0
	 */
	public static class PrivateGames {

		/**
		 * Points Level Setting
		 */
		@SerializedName("points")
		final
		String pointsLevel = "";

		/**
		 * Weapon Type Setting
		 */
		@SerializedName("weapon")
		final
		String weapons = "";

		/**
		 * Specializations Type Setting
		 */
		@SerializedName("specializations")
		final
		String specializations = "";

		/**
		 * Horse Speed Level Setting
		 */
		@SerializedName("horse_speed")
		final
		String horseSpeed = "";

		/**
		 * Level Setting
		 */
		@SerializedName("level")
		final
		String level = "";

		/**
		 * Health Level Setting
		 */
		@SerializedName("health")
		final
		String health = "";


		/**
		 * Get Points Level Setting
		 *
		 * @return Points Level
		 */
		public String getPointsLevel() {
			return pointsLevel;
		}

		/**
		 * Get Weapons Type Setting
		 *
		 * @return Type
		 */
		public String getWeapons() {
			return weapons;
		}

		/**
		 * Get Specializations Type Setting
		 *
		 * @return Type
		 */
		public String getSpecializations() {
			return specializations;
		}

		/**
		 * Get Horse Speed Level Setting
		 *
		 * @return Speed Level
		 */
		public String getHorseSpeed() {
			return horseSpeed;
		}

		/**
		 * Get Level Setting
		 *
		 * @return Level
		 */
		public String getLevel() {
			return level;
		}

		/**
		 * Get Health Level Setting
		 *
		 * @return Health Level
		 */
		public String getHealth() {
			return health;
		}

		@Override
		public String toString() {
			return "Battle Ground PrivateGames{" +
					"pointsLevel='" + pointsLevel + '\'' +
					", weapons='" + weapons + '\'' +
					", specializations='" + specializations + '\'' +
					", horseSpeed='" + horseSpeed + '\'' +
					", level='" + level + '\'' +
					", health='" + health + '\'' +
					'}';
		}
	}

	@Override
	public String toString() {
		return "BattleGround{" +
				"class='" + class_ + '\'' +
				", coins=" + coins +
				", damage=" + damage +
				", deaths=" + deaths +
				", healed=" + healed +
				", kills=" + kills +
				", losses=" + losses +
				", dust=" + dust +
				", unlockedPackages=" + unlockedPackages +
				", repaired=" + repaired +
				", shards=" + shards +
				", wins=" + wins +
				", assists=" + assists +
				'}';
	}
}
