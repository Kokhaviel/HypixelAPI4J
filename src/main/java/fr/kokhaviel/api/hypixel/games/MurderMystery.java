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
 * Murder Mystery Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class MurderMystery {

	/**
	 * Total Murder Mystery Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Total Murder Mystery Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Murder Mystery Knife Kills of the Player
	 */
	@SerializedName("knife_kills")
	int knifeKills = 0;

	/**
	 * Total Murder Mystery Games Played by the Player
	 */
	@SerializedName("games")
	int gamesPlayed = 0;

	/**
	 * Total Murder Mystery Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Total Murder Mystery Coins Picked Up by the Player
	 */
	@SerializedName("coins_pickedup")
	int coinsPickedUp = 0;

	/**
	 * Total Murder Mystery Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Total Murder Mystery Bow Kills of the Player
	 */
	@SerializedName("bow_kills")
	int bowKills = 0;

	/**
	 * Current Chance To Be Detective of the Player
	 */
	@SerializedName("detective_chance")
	int detectiveChance = 0;

	/**
	 * Current Chance To Be Murderer of the Player
	 */
	@SerializedName("murderer_chance")
	int murdererChance = 0;

	/**
	 * Unlocked Murder Mystery Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Total Murder Mystery Hero Wins of the Player
	 */
	@SerializedName("was_hero")
	int heroWins = 0;

	/**
	 * Total Murder Mystery Murderer Kills of the Player
	 */
	@SerializedName("kills_as_murderer")
	int murdererKills = 0;

	/**
	 * Total Murder Mystery Murderer Wins of the Player
	 */
	@SerializedName("murderer_wins")
	int murdererWins = 0;

	/**
	 * Total Murder Mystery Detective Wins of the Player
	 */
	@SerializedName("detective_wins")
	int detectiveWins = 0;

	/**
	 * Total Murderer Thrown Knife Kills of the Player
	 */
	@SerializedName("thrown_knife_kills")
	int thrownKnifeKills = 0;

	/**
	 * Total Murder Mystery Trap Kills of the Player
	 */
	@SerializedName("trap_kills")
	int trapKills = 0;

	/**
	 * Current Murder Mystery Gesture Used by the Player
	 */
	@SerializedName("active_gesture")
	String gesture = "";

	/**
	 * Current Murder Mystery Victory Dance Used by the Player
	 */
	@SerializedName("active_victory_dance")
	String victoryDance = "";

	/**
	 * Total Murder Mystery Suicides of the Player
	 */
	@SerializedName("suicides")
	int suicides = 0;

	/**
	 * Current Murder Mystery Projectile Trail Used by the Player
	 */
	@SerializedName("active_projectile_trail")
	String projectileTrail = "";

	/**
	 * Current Murder Mystery Last Words Used by the Player
	 */
	@SerializedName("active_last_words")
	String lastWords = "";

	/**
	 * Current Murder Mystery Kill Note of the Player
	 */
	@SerializedName("active_kill_note")
	String killNote = "";

	/**
	 * Current Murder Mystery Animated Hat Used by the Player
	 */
	@SerializedName("active_animated_hat")
	String animatedHat = "";

	/**
	 * Current Murder Mystery Death Cry Used by the Player
	 */
	@SerializedName("active_deathcry")
	String deathCry = "";


	/**
	 * Get Total Wins of the Player
	 *
	 * @return Total Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Total Murder Mystery Coins of the Player
	 *
	 * @return Total Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Knife Kills of the Player
	 *
	 * @return Knife Kills
	 */
	public int getKnifeKills() {
		return knifeKills;
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
	 * Get Total Kills of the Player
	 *
	 * @return Total Kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * Get Total Picked Up Coins of the Player
	 *
	 * @return Total Picked Up Coins
	 */
	public int getCoinsPickedUp() {
		return coinsPickedUp;
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
	 * Get Total Bow Kills of the Plyer
	 *
	 * @return Bow Kills
	 */
	public int getBowKills() {
		return bowKills;
	}

	/**
	 * Get Current Detective Chance of the Player
	 *
	 * @return Detective Chance
	 */
	public int getDetectiveChance() {
		return detectiveChance;
	}

	/**
	 * Get Current Murderer Chance of the Player
	 *
	 * @return Murderer Chance
	 */
	public int getMurdererChance() {
		return murdererChance;
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
	 * Get Total Hero Wins of the Player
	 *
	 * @return Total Hero Wins
	 */
	public int getHeroWins() {
		return heroWins;
	}

	/**
	 * Get Total Murderer Kills of the Player
	 *
	 * @return Murderer Kills
	 */
	public int getMurdererKills() {
		return murdererKills;
	}

	/**
	 * Get Total Murderer Wins of the Player
	 *
	 * @return Murderer Wins
	 */
	public int getMurdererWins() {
		return murdererWins;
	}

	/**
	 * Get Total Detective Wins of the Player
	 *
	 * @return Detective Wins
	 */
	public int getDetectiveWins() {
		return detectiveWins;
	}

	/**
	 * Get Total Thrown Knife Kills of the Player
	 *
	 * @return Thrown Knife Kills of the Player
	 */
	public int getThrownKnifeKills() {
		return thrownKnifeKills;
	}

	/**
	 * Get Total Trap Kills of the Player
	 *
	 * @return Trap Kills
	 */
	public int getTrapKills() {
		return trapKills;
	}

	/**
	 * Get Current Gesture Used by the Player
	 *
	 * @return Current Gesture
	 */
	public String getGesture() {
		return gesture;
	}

	/**
	 * Get Current Victory Dance Used by the Player
	 *
	 * @return Current Victory Dance
	 */
	public String getVictoryDance() {
		return victoryDance;
	}

	/**
	 * Get Total Suicides of the Player
	 *
	 * @return Suicides
	 */
	public int getSuicides() {
		return suicides;
	}

	/**
	 * Get Current Projectile Trail Used by the Player
	 *
	 * @return Current Projectile Trail
	 */
	public String getProjectileTrail() {
		return projectileTrail;
	}

	/**
	 * Get Current Last Words Used by the Player
	 *
	 * @return Current Last Words
	 */
	public String getLastWords() {
		return lastWords;
	}

	/**
	 * Get Current Last Note Used by the Player
	 *
	 * @return Current Last Note
	 */
	public String getKillNote() {
		return killNote;
	}

	/**
	 * Get Current Animated Hat Used by the Player
	 *
	 * @return Current Animated Hat
	 */
	public String getAnimatedHat() {
		return animatedHat;
	}

	/**
	 * Get Current Death Cry of the Player
	 *
	 * @return Current Death Cry
	 */
	public String getDeathCry() {
		return deathCry;
	}

	@Override
	public String toString() {
		return "MurderMystery{" +
				"wins=" + wins +
				", coins=" + coins +
				", knifeKills=" + knifeKills +
				", gamesPlayed=" + gamesPlayed +
				", kills=" + kills +
				", coinsPickedUp=" + coinsPickedUp +
				", deaths=" + deaths +
				", bowKills=" + bowKills +
				", detectiveChance=" + detectiveChance +
				", murdererChance=" + murdererChance +
				", unlockedPackages=" + unlockedPackages +
				", heroWins=" + heroWins +
				", murdererKills=" + murdererKills +
				", murdererWins=" + murdererWins +
				", detectiveWins=" + detectiveWins +
				", thrownKnifeKills=" + thrownKnifeKills +
				", trapKills=" + trapKills +
				", gesture='" + gesture + '\'' +
				", victoryDance='" + victoryDance + '\'' +
				", suicides=" + suicides +
				", projectileTrail='" + projectileTrail + '\'' +
				", lastWords='" + lastWords + '\'' +
				", killNote='" + killNote + '\'' +
				", animatedHat='" + animatedHat + '\'' +
				", deathCry='" + deathCry + '\'' +
				'}';
	}
}
