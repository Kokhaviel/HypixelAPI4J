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
 * The Pit Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Pit {

	/**
	 * The Pit Profile of the Player
	 */
	@SerializedName("profile")
	Profile profile = new Profile();

	/**
	 * The Pit Stats of the Player
	 */
	@SerializedName("pit_stats_ptl")
	Stats stats = new Stats();

	/**
	 * Get The Pit Profile of the Player
	 *
	 * @return Pit Profile
	 */
	public Profile getProfile() {
		return profile;
	}

	/**
	 * Get The Pit Stats of the Player
	 *
	 * @return Pit Stats
	 */
	public Stats getStats() {
		return stats;
	}

	/**
	 * The Pit Profile
	 *
	 * @author Kokhaviel
	 * @since 1.0
	 */
	public static class Profile {

		/**
		 * The Pit Cash of the Player
		 */
		@SerializedName("cash")
		int cash = 0;

		/**
		 * The Pit Perk #1 of the Player
		 */
		@SerializedName("selected_perk_0")
		String firstPerk = "";

		/**
		 * The Pit Perk #2 of the Player
		 */
		@SerializedName("selected_perk_1")
		String secondPerk = "";

		/**
		 * The Pit Perk #3 of the Player
		 */
		@SerializedName("selected_perk_2")
		String thirdPerk = "";

		/**
		 * Genesis Faction Name
		 */
		@SerializedName("genesis_allegiance")
		String allegiance = "";

		/**
		 * Total Genesis Points of the Player
		 */
		@SerializedName("genesis_points")
		int genesisPoints = 0;

		/**
		 * The Pit Killstreak #1 of the Player
		 */
		@SerializedName("selected_killstreak_0")
		String firstKillstreak = "";

		/**
		 * The Pit Killstreak #2 of the Player
		 */
		@SerializedName("selected_killstreak_1")
		String secondKillstreak = "";

		/**
		 * The Pit Killstreak #3 of the Player
		 */
		@SerializedName("selected_killstreak_2")
		String thirdKillstreak = "";

		/**
		 * Total Xp of the Player
		 */
		@SerializedName("xp")
		int xp = 0;


		/**
		 * Get Total Cash of the Player
		 *
		 * @return Cash Amount
		 */
		public int getCash() {
			return cash;
		}

		/**
		 * Get Pit Perk #1 of the Player
		 *
		 * @return Perk #1 Name
		 */
		public String getFirstPerk() {
			return firstPerk;
		}

		/**
		 * Get Pit Perk #2 of the Player
		 *
		 * @return Perk #2 Name
		 */
		public String getSecondPerk() {
			return secondPerk;
		}

		/**
		 * Get Pit Perk #3 of the Player
		 *
		 * @return Perk #3 Name
		 */
		public String getThirdPerk() {
			return thirdPerk;
		}

		/**
		 * Get Genesis Faction Allegiance of the Player
		 *
		 * @return Faction Name
		 */
		public String getAllegiance() {
			return allegiance;
		}

		/**
		 * Get Total Genesis Points of the Player
		 *
		 * @return Genesis Points
		 */
		public int getGenesisPoints() {
			return genesisPoints;
		}

		/**
		 * Get Pit Killstreak #1 of the Player
		 *
		 * @return Killstreak #1 Name
		 */
		public String getFirstKillstreak() {
			return firstKillstreak;
		}

		/**
		 * Get Pit Killstreak #2 of the Player
		 *
		 * @return Killstreak #2 Name
		 */
		public String getSecondKillstreak() {
			return secondKillstreak;
		}

		/**
		 * Get Pit Killstreak #3 of the player
		 *
		 * @return Killstreak #3 Name
		 */
		public String getThirdKillstreak() {
			return thirdKillstreak;
		}

		/**
		 * Get Total Xp of the Player
		 *
		 * @return Xp Amount
		 */
		public int getXp() {
			return xp;
		}

		@Override
		public String toString() {
			return "Pit Profile{" +
					"cash=" + cash +
					", firstPerk='" + firstPerk + '\'' +
					", secondPerk='" + secondPerk + '\'' +
					", thirdPerk='" + thirdPerk + '\'' +
					", allegiance='" + allegiance + '\'' +
					", genesisPoints=" + genesisPoints +
					", firstKillstreak='" + firstKillstreak + '\'' +
					", secondKillstreak='" + secondKillstreak + '\'' +
					", thirdKillstreak='" + thirdKillstreak + '\'' +
					", xp=" + xp +
					'}';
		}
	}

	/**
	 * The Pit Stats
	 *
	 * @author Kokhaviel
	 * @since 1.0
	 */
	public static class Stats {

		/**
		 * Total Arrows Hit of the Player
		 */
		@SerializedName("arrow_hits")
		int arrowsHit = 0;

		/**
		 * Total Arrows Fired by the Player
		 */
		@SerializedName("arrows_fired")
		int arrowsFired = 0;

		/**
		 * Total Assists of the Player
		 */
		@SerializedName("assists")
		int assists = 0;

		/**
		 * Total Bow Damage Dealt by the Player
		 */
		@SerializedName("bow_damage_dealt")
		int bowDamageDealt = 0;

		/**
		 * Total Cash Earned by the Player
		 */
		@SerializedName("cash_earned")
		int cashEarned = 0;

		/**
		 * Total Damage Dealt by the Player
		 */
		@SerializedName("damage_dealt")
		int damageDealt = 0;

		/**
		 * Total Damage Received by the Player
		 */
		@SerializedName("damage_received")
		int damageReceived = 0;

		/**
		 * Total Deaths of the Player
		 */
		@SerializedName("deaths")
		int deaths = 0;

		/**
		 * Total Joins of the Player
		 */
		@SerializedName("joins")
		int joins = 0;

		/**
		 * Total Jump Into Pit of the Player
		 */
		@SerializedName("jumped_into_pit")
		int jumpPit = 0;

		/**
		 * Total Left Clicks of the Player
		 */
		@SerializedName("left_clicks")
		int leftClicks = 0;

		/**
		 * Total Melee Damage Dealt by the Player
		 */
		@SerializedName("melee_damage_dealt")
		int meleeDamageDealt = 0;

		/**
		 * Total Melee Damage Received by the Player
		 */
		@SerializedName("melee_damage_received")
		int meleeDamageReceived = 0;

		/**
		 * Total Time Played by the Player (in Minutes)
		 */
		@SerializedName("playtime_minutes")
		int playtime = 0;

		/**
		 * Total Sword Hits of the Player
		 */
		@SerializedName("sword_hits")
		int swordHits = 0;

		/**
		 * Total Bow Damage Received by the Player
		 */
		@SerializedName("bow_damage_received")
		int bowDamageReceived = 0;

		/**
		 * Total Gapple Eaten by the Player
		 */
		@SerializedName("gapple_eaten")
		int gappleEaten = 0;

		/**
		 * Total Launched by Launchers of the Player
		 */
		@SerializedName("launched_by_launchers")
		int launchedLaunchers = 0;

		/**
		 * Total Blocks Placed by the Player
		 */
		@SerializedName("blocks_placed")
		int blocksPlaced = 0;

		/**
		 * Total Golden Head Eaten by the Player
		 */
		@SerializedName("ghead_eaten")
		int gheadEaten = 0;

		/**
		 * Total Blocks Broken by the Player
		 */
		@SerializedName("blocks_broken")
		int blocksBroken = 0;


		/**
		 * Get Total Arrows Hit of the Player
		 *
		 * @return Arrows Hit
		 */
		public int getArrowsHit() {
			return arrowsHit;
		}

		/**
		 * Get Total Arrows Fired by the Player
		 *
		 * @return Arrows Fired
		 */
		public int getArrowsFired() {
			return arrowsFired;
		}

		/**
		 * Get Total of Assists the Player
		 *
		 * @return Assists
		 */
		public int getAssists() {
			return assists;
		}

		/**
		 * Get Total Bow Damage Dealt by the Player
		 *
		 * @return Bow Damage Dealt
		 */
		public int getBowDamageDealt() {
			return bowDamageDealt;
		}

		/**
		 * Get Total Cash Earned by the Player
		 *
		 * @return Amount Cash Earned
		 */
		public int getCashEarned() {
			return cashEarned;
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
		 * Get Total Damage Received by the Player
		 *
		 * @return Damage Received
		 */
		public int getDamageReceived() {
			return damageReceived;
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
		 * Get Total Joins of the Player
		 *
		 * @return Joins
		 */
		public int getJoins() {
			return joins;
		}

		/**
		 * Get Total Jump Into Pit of the Player
		 *
		 * @return Jump Into Pit
		 */
		public int getJumpPit() {
			return jumpPit;
		}

		/**
		 * Get Total Left Clicks of the Player
		 *
		 * @return Left Clicks
		 */
		public int getLeftClicks() {
			return leftClicks;
		}

		/**
		 * Get Total Melee Damage Dealt by the Player
		 *
		 * @return Melee Damage Dealt
		 */
		public int getMeleeDamageDealt() {
			return meleeDamageDealt;
		}

		/**
		 * Get Total Melee Damage Received by the Player
		 *
		 * @return Melee Damage Received
		 */
		public int getMeleeDamageReceived() {
			return meleeDamageReceived;
		}

		/**
		 * Get Total Playtime of the Player (in Minutes)
		 *
		 * @return Playtime Minutes
		 */
		public int getPlaytime() {
			return playtime;
		}

		/**
		 * Get Total Sword Hits of the Player
		 *
		 * @return Sword Hits
		 */
		public int getSwordHits() {
			return swordHits;
		}

		/**
		 * Get Total Bow Damage Received by the Player
		 *
		 * @return Bow Damage Received
		 */
		public int getBowDamageReceived() {
			return bowDamageReceived;
		}

		/**
		 * Get Total Gapple Eaten by the Player
		 *
		 * @return Gapple Eaten
		 */
		public int getGappleEaten() {
			return gappleEaten;
		}

		/**
		 * Get Total Launched by Launchers of the Player
		 *
		 * @return Launched by Launchers
		 */
		public int getLaunchedLaunchers() {
			return launchedLaunchers;
		}

		/**
		 * Get Total Blocks Placed of the Player
		 *
		 * @return Blocks Placed
		 */
		public int getBlocksPlaced() {
			return blocksPlaced;
		}

		/**
		 * Get Total Ghead Eaten by the Player
		 *
		 * @return Ghead Eaten
		 */
		public int getGheadEaten() {
			return gheadEaten;
		}

		/**
		 * Get Total Blocks Broken by the Player
		 *
		 * @return Blocks Broken
		 */
		public int getBlocksBroken() {
			return blocksBroken;
		}

		@Override
		public String toString() {
			return "Pit Stats{" +
					"arrowsHit=" + arrowsHit +
					", arrowsFired=" + arrowsFired +
					", assists=" + assists +
					", bowDamageDealt=" + bowDamageDealt +
					", cashEarned=" + cashEarned +
					", damageDealt=" + damageDealt +
					", damageReceived=" + damageReceived +
					", deaths=" + deaths +
					", joins=" + joins +
					", jumpPit=" + jumpPit +
					", leftClicks=" + leftClicks +
					", meleeDamageDealt=" + meleeDamageDealt +
					", meleeDamageReceived=" + meleeDamageReceived +
					", playtime=" + playtime +
					", swordHits=" + swordHits +
					", bowDamageReceived=" + bowDamageReceived +
					", gappleEaten=" + gappleEaten +
					", launchedLaunchers=" + launchedLaunchers +
					", blocksPlaced=" + blocksPlaced +
					", gheadEaten=" + gheadEaten +
					", blocksBroken=" + blocksBroken +
					'}';
		}
	}

	@Override
	public String toString() {
		return "Pit{" +
				"profile=" + profile +
				", stats=" + stats +
				'}';
	}
}
