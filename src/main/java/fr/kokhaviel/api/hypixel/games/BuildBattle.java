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
 * Build Battle Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class BuildBattle {

	/**
	 * All Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Total Solo Normal Mode Wins of the Player
	 */
	@SerializedName("wins_solo_normal")
	int winsSoloNormal = 0;

	/**
	 * Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Total Games Played by the Player
	 */
	@SerializedName("games_played")
	int gamesPlayed = 0;

	/**
	 * Total Score of the Player
	 */
	@SerializedName("score")
	int score = 0;

	/**
	 * Total Build Battle Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Total Votes of the Player
	 */
	@SerializedName("total_votes")
	int votes = 0;

	/**
	 * Music Status of the Player (On or Off)
	 */
	@SerializedName("music")
	boolean music = false;

	/**
	 * Total Teams Normal Mode Wins of the Player
	 */
	@SerializedName("wins_teams_normal")
	int winsTeamsNormal = 0;

	/**
	 * Total Solo Pro Mode Wins of the Player
	 */
	@SerializedName("wins_solo_pro")
	int winsSoloPro = 0;

	/**
	 * Total Correct Guesses of the Player (Guess The Build Mode)
	 */
	@SerializedName("correct_guesses")
	int guesses = 0;

	/**
	 * Total Super Votes of the Player
	 */
	@SerializedName("super_votes")
	int superVotes = 0;

	/**
	 * Total Guess the Build Mode WIns of the Player
	 */
	@SerializedName("wins_guess_the_build")
	int winsGuess = 0;

	/**
	 * Last Song Purchased by the Player
	 */
	@SerializedName("last_purchased_song")
	String lastSong = "";

	/**
	 * Current Selected Backdrop of the Player
	 */
	@SerializedName("selected_backdrop")
	String backdrop = "";

	/**
	 * Current Selected Victory Dance of the Player
	 */
	@SerializedName("new_victory_dance")
	String victoryDance = "";

	/**
	 * Current Selected Hat of the Player
	 */
	@SerializedName("new_selected_hat")
	String hat = "";

	/**
	 * Current Movement Trail of the Player
	 */
	@SerializedName("active_movement_trail")
	String trail = "";


	/**
	 * Get All Unlocked Packages (Cosmetics) of the Player
	 *
	 * @return List of all Unlocked Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Total Solo Normal Wins of the Player
	 *
	 * @return Solo Normal Wins
	 */
	public int getWinsSoloNormal() {
		return winsSoloNormal;
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
	 * Get Total Games Played by the Player
	 *
	 * @return Games Played
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
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
	 * Get Total Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Votes of the Player
	 *
	 * @return Votes
	 */
	public int getVotes() {
		return votes;
	}

	/**
	 * Get Music Status of the Player (On or Off)
	 *
	 * @return Music Status
	 */
	public boolean isMusic() {
		return music;
	}

	/**
	 * Get Total Teams Normal Mode Wins of the Player
	 *
	 * @return Teams Normal Wins
	 */
	public int getWinsTeamsNormal() {
		return winsTeamsNormal;
	}

	/**
	 * Get Total Solo Pro Mode Wins of the Player
	 *
	 * @return Solo Pro Wins
	 */
	public int getWinsSoloPro() {
		return winsSoloPro;
	}

	/**
	 * Get Total Guesses of the Player (Guess the Build Mode)
	 *
	 * @return Guesses
	 */
	public int getGuesses() {
		return guesses;
	}

	/**
	 * Get Total Super Votes Used by the Player
	 *
	 * @return Super Votes
	 */
	public int getSuperVotes() {
		return superVotes;
	}

	/**
	 * Get Total Guess Mode Wins of the Player
	 *
	 * @return Guess Wins
	 */
	public int getWinsGuess() {
		return winsGuess;
	}

	/**
	 * Get Last Purchased Song of the Player
	 *
	 * @return Last Song
	 */
	public String getLastSong() {
		return lastSong;
	}

	/**
	 * Get Current Backdrop Used by the Player
	 *
	 * @return Backdrop Name
	 */
	public String getBackdrop() {
		return backdrop;
	}

	/**
	 * Get Current Victory Dance of the Player
	 *
	 * @return Dance Name
	 */
	public String getVictoryDance() {
		return victoryDance;
	}

	/**
	 * Get Current Hat Used by the Player
	 *
	 * @return Hat Name
	 */
	public String getHat() {
		return hat;
	}

	/**
	 * Get Current Movement Trail Used by the Player
	 *
	 * @return Trail Name
	 */
	public String getTrail() {
		return trail;
	}

	@Override
	public String toString() {
		return "BuildBattle{" +
				"unlockedPackages=" + unlockedPackages +
				", winsSoloNormal=" + winsSoloNormal +
				", wins=" + wins +
				", gamesPlayed=" + gamesPlayed +
				", score=" + score +
				", coins=" + coins +
				", votes=" + votes +
				", music=" + music +
				", winsTeamsNormal=" + winsTeamsNormal +
				", winsSoloPro=" + winsSoloPro +
				", guesses=" + guesses +
				", superVotes=" + superVotes +
				", winsGuess=" + winsGuess +
				", lastSong='" + lastSong + '\'' +
				", backdrop='" + backdrop + '\'' +
				", victoryDance='" + victoryDance + '\'' +
				", hat='" + hat + '\'' +
				", trail='" + trail + '\'' +
				'}';
	}
}

