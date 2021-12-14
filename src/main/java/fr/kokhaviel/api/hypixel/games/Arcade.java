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
 * Arcade Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Arcade {

	/**
	 * Total Arcade Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Day One Wins of the Player
	 */
	@SerializedName("wins_dayone")
	int dayOneWins = 0;

	/**
	 * Mini Walls Wins of the Player
	 */
	@SerializedName("wins_mini_walls")
	int miniWallsWins = 0;

	/**
	 * Mini Walls Active Kit of the Player
	 */
	@SerializedName("miniwalls_activeKit")
	String miniWallsKit = "";

	/**
	 * Soccer Wins of the Player
	 */
	@SerializedName("wins_soccer")
	int soccerWins = 0;

	/**
	 * Simon Says Total Rounds of the player
	 */
	@SerializedName("rounds_simon_says")
	int simonSaysRounds = 0;

	/**
	 * Hole in the Wall Total Rounds of the Player
	 */
	@SerializedName("rounds_hole_in_the_wall")
	int holeInTheWallRounds = 0;

	/**
	 * Current Melee Weapon Used by the Player
	 */
	@SerializedName("melee_weapon")
	String meleeWeapon = "";

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Farm Hunt Wins of the Player
	 */
	@SerializedName("wins_farm_hunt")
	int farmHuntWins = 0;

	/**
	 * Hide and Seek Hider Wins of the Player
	 */
	@SerializedName("hider_wins_hide_and_seek")
	int hideAndSeekHiderWins = 0;

	/**
	 * Zombies Best Round of the Player
	 */
	@SerializedName("best_round_zombies")
	int zombiesBestRound = 0;

	/**
	 * Hide and Seek Seeker Wins of the Player
	 */
	@SerializedName("seeker_wins_hide_and_seek")
	int hideAndSeekSeekerWins = 0;

	/**
	 * Zombies Wins of the Player
	 */
	@SerializedName("wins_zombies")
	int zombiesWins = 0;

	/**
	 * Party Games Wins of the Player
	 */
	@SerializedName("wins_party")
	int partyGamesWins = 0;

	/**
	 * Hole in the Wall Wins of the Player
	 */
	@SerializedName("wins_hole_in_the_wall")
	int holeInTheWallWins = 0;

	/**
	 * Simon Says Wins of the Player
	 */
	@SerializedName("wins_simon_says")
	int simonSaysWins = 0;

	/**
	 * One in the Quiver Wins of the Player
	 */
	@SerializedName("wins_oneinthequiver")
	int onInTheQuiverWins = 0;

	/**
	 * Current Ender Spleef Trail Used by the Player
	 */
	@SerializedName("enderspleef_trail")
	String enderSpleefTrail = "";

	/**
	 * Current Bounty Hunter Head Used by the Player
	 */
	@SerializedName("bounty_head")
	String bountyHuntersHead = "";

	/**
	 * Ender Spleef Wins of the Player
	 */
	@SerializedName("wins_ender")
	int enderSpleefWins = 0;

	/**
	 * Dragon Wars Wins of the Player
	 */
	@SerializedName("wins_dragonwars2")
	int dragonWarsWins = 0;

	/**
	 * Pixel Painters Wins of the Player
	 */
	@SerializedName("wins_draw_their_thing")
	int pixelPaintersWins = 0;

	/**
	 * Throw Out Wins of the Player
	 */
	@SerializedName("wins_throw_out")
	int thrownOutWins = 0;


	/**
	 * Get Total Arcade Coins of the Player
	 *
	 * @return Total Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Day One Wins of the Player
	 *
	 * @return Day One Wins
	 */
	public int getDayOneWins() {
		return dayOneWins;
	}

	/**
	 * Get Total Mini Walls Wins of the Player
	 *
	 * @return Mini Walls Wins
	 */
	public int getMiniWallsWins() {
		return miniWallsWins;
	}

	/**
	 * Get Current Mini Walls Kit Used by the Player
	 *
	 * @return Current Mini Walls Kit
	 */
	public String getMiniWallsKit() {
		return miniWallsKit;
	}

	/**
	 * Get Total Soccer Wins of the Player
	 *
	 * @return Soccer Wins
	 */
	public int getSoccerWins() {
		return soccerWins;
	}

	/**
	 * Get Total Simon Says Rounds Played by the Player
	 *
	 * @return Simon Says Rounds Played
	 */
	public int getSimonSaysRounds() {
		return simonSaysRounds;
	}

	/**
	 * Get Total Hole in the Wall Rounds Played by the Player
	 *
	 * @return Hole in the Wall Rounds Played
	 */
	public int getHoleInTheWallRounds() {
		return holeInTheWallRounds;
	}

	/**
	 * Get Current Melee Weapon Used by the Player
	 *
	 * @return Current Melee Weapon
	 */
	public String getMeleeWeapon() {
		return meleeWeapon;
	}

	/**
	 * Get All Unlocked Packages (Cosmetics) of the Player
	 *
	 * @return Unlocked Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Total Farm Hunt Wins of the Player
	 *
	 * @return Farm Hunt Wins
	 */
	public int getFarmHuntWins() {
		return farmHuntWins;
	}

	/**
	 * Get Total Hide and Seek Hider Wins of the Player
	 *
	 * @return Hider Wins
	 */
	public int getHideAndSeekHiderWins() {
		return hideAndSeekHiderWins;
	}

	/**
	 * Get Best Zombies Round of the Player
	 *
	 * @return Best Zombies Round Score
	 */
	public int getZombiesBestRound() {
		return zombiesBestRound;
	}

	/**
	 * Get Hide and Seek Seeker Wins of the Player
	 *
	 * @return Seeker Wins
	 */
	public int getHideAndSeekSeekerWins() {
		return hideAndSeekSeekerWins;
	}

	/**
	 * Get Total Zombies Wins of the Player
	 *
	 * @return Zombies Wins
	 */
	public int getZombiesWins() {
		return zombiesWins;
	}

	/**
	 * Get Total Party Games Wins of the Player
	 *
	 * @return Party Games Wins
	 */
	public int getPartyGamesWins() {
		return partyGamesWins;
	}

	/**
	 * Get Total Hole in the Wall Wins of the Player
	 *
	 * @return Hole in the Wall Wins
	 */
	public int getHoleInTheWallWins() {
		return holeInTheWallWins;
	}

	/**
	 * Get Total Simon Says Wins of the Player
	 *
	 * @return Simon Says Wins
	 */
	public int getSimonSaysWins() {
		return simonSaysWins;
	}

	/**
	 * Get Total One in the Quiver of the Player
	 *
	 * @return One in the Quiver
	 */
	public int getOnInTheQuiverWins() {
		return onInTheQuiverWins;
	}

	/**
	 * Get Current Ender Spleef Trail Used by the Player
	 *
	 * @return Current Ender Spleef Trail
	 */
	public String getEnderSpleefTrail() {
		return enderSpleefTrail;
	}

	/**
	 * Get Current Bounty Hunters Head Used by the Player
	 *
	 * @return Current Bounty Hunters Head
	 */
	public String getBountyHuntersHead() {
		return bountyHuntersHead;
	}

	/**
	 * Get Total Ender Spleef Wins of the Player
	 *
	 * @return Ender Spleef Wins
	 */
	public int getEnderSpleefWins() {
		return enderSpleefWins;
	}

	/**
	 * Get Total Dragon Wars Wins of the Player
	 *
	 * @return Dragon Wars Wins
	 */
	public int getDragonWarsWins() {
		return dragonWarsWins;
	}

	/**
	 * Get Total Pixel Painters Wins of the Player
	 *
	 * @return Pixel Painters Wins
	 */
	public int getPixelPaintersWins() {
		return pixelPaintersWins;
	}

	/**
	 * Get Total Throw Out Wins of the Player
	 *
	 * @return Throw Out Wins
	 */
	public int getThrownOutWins() {
		return thrownOutWins;
	}

	@Override
	public String toString() {
		return "Arcade{" +
				"coins=" + coins +
				", dayOneWins=" + dayOneWins +
				", miniWallsWins=" + miniWallsWins +
				", miniWallsKit='" + miniWallsKit + '\'' +
				", soccerWins=" + soccerWins +
				", simonSaysRounds=" + simonSaysRounds +
				", holeInTheWallRounds=" + holeInTheWallRounds +
				", meleeWeapon='" + meleeWeapon + '\'' +
				", unlockedPackages=" + unlockedPackages +
				", farmHuntWins=" + farmHuntWins +
				", hideAndSeekHiderWins=" + hideAndSeekHiderWins +
				", zombiesBestRound=" + zombiesBestRound +
				", hideAndSeekSeekerWins=" + hideAndSeekSeekerWins +
				", zombiesWins=" + zombiesWins +
				", partyGamesWins=" + partyGamesWins +
				", holeInTheWallWins=" + holeInTheWallWins +
				", simonSaysWins=" + simonSaysWins +
				", onInTheQuiverWins=" + onInTheQuiverWins +
				", enderSpleefTrail='" + enderSpleefTrail + '\'' +
				", bountyHuntersHead='" + bountyHuntersHead + '\'' +
				", enderSpleefWins=" + enderSpleefWins +
				", dragonWarsWins=" + dragonWarsWins +
				", pixelPaintersWins=" + pixelPaintersWins +
				", thrownOutWins=" + thrownOutWins +
				'}';
	}
}
