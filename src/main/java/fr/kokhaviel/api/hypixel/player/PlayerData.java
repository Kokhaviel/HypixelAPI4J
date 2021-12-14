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

package fr.kokhaviel.api.hypixel.player;

import com.google.gson.annotations.SerializedName;
import fr.kokhaviel.api.hypixel.HypixelAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Hypixel API Player Data Request Return
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class PlayerData {

	/**
	 * Success status for the request
	 */
	@SerializedName("success")
	boolean success = false;

	/**
	 * Player Object from the Username specified in {@link HypixelAPI#getPlayerData(String)}
	 */
	@SerializedName("player")
	Player player = new Player();


	/**
	 * Get Success Status for the current request
	 *
	 * @return Success status
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get the Player Object with the player statistics
	 *
	 * @return {@link fr.kokhaviel.api.hypixel.player.PlayerData.Player} Object from the Username specified in {@link HypixelAPI#getPlayerData(String)}
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Player Hypixel Server Statistics
	 *
	 * @author Kokhaviel
	 * @since 1.0
	 */
	public static class Player {

		/**
		 * Hypixel Player Id
		 */
		@SerializedName("_id")
		String id = "";

		/**
		 * Minecraft Account UUID
		 */
		@SerializedName("uuid")
		String uuid = "";

		/**
		 * Timestamp of the first login of the player
		 */
		@SerializedName("firstLogin")
		long firstLogin = 0;

		/**
		 * Timestamp of the last login of the player
		 */
		@SerializedName("lastLogin")
		long lastLogin = 0;

		/**
		 * Minecraft Player Name
		 */
		@SerializedName("playername")
		String playerName = "";

		/**
		 * In-Game Username
		 */
		@SerializedName("displayname")
		String displayName = "";

		/**
		 * In-Game Achievement Points
		 */
		@SerializedName("achievementPoints")
		int achievementPoints = 0;

		/**
		 * Last 'Quickjoin' Timestamp
		 */
		@SerializedName("quickjoin_timestamp")
		long timestampLastQuickjoin = 0;

		/**
		 * Number of use 'Quickjoin'
		 */
		@SerializedName("quickjoin_uses")
		int quickjoinUses = 0;

		/**
		 * In-Game Network Experience
		 */
		@SerializedName("networkExp")
		int networkExperience = 0;

		/**
		 * Timestamp of the last logout of the player
		 */
		@SerializedName("lastLogout")
		long lastLogout = 0;

		/**
		 * First or Third Person when spectate a game
		 */
		@SerializedName("spec_first_person")
		boolean specFirstPerson = false;

		/**
		 * Flying or not when spectate a game
		 */
		@SerializedName("spec_always_flying")
		boolean specAlwaysFlying = false;

		/**
		 * In-Game Karma Points
		 */
		@SerializedName("karma")
		int karma = 0;

		/**
		 * Pending Friends Requests
		 */
		@SerializedName("friendRequestsUuid")
		List<String> uuidsFriendRequests = new ArrayList<>();

		/**
		 * Last Minecraft Version used by the player
		 */
		@SerializedName("mcVersionRp")
		String lastMcVersion = "";

		/**
		 * In-Game Rank of the player (Default : PLAYER; Can Be : HELPER, MOD, ADMIN, YOUTUBE, OWNER, MOJANG, SLOTH, EVENTS, MCP & PIG+++)
		 */
		@SerializedName("rank")
		String rank = "PLAYER";

		/**
		 * In-Game Donator Rank of the player (Default : NONE; Can Be : VIP, VIP+, MVP, MVP+ & MVP++)
		 */
		@SerializedName("newPackageRank")
		String serverRank = "NONE";

		/**
		 * In-Game Rank Color (Default : NONE)
		 */
		@SerializedName("rankPlusColor")
		String rankColor = "NONE";

		/**
		 * Current Language Used by the player
		 */
		@SerializedName("userLanguage")
		String language = "";

		/**
		 * Last Claimed Daily Reward
		 */
		@SerializedName("lastClaimedReward")
		long lastClaimedReward = 0;

		/**
		 * High Score Claimed Rewards
		 */
		@SerializedName("rewardHighScore")
		int rewardHighScore = 0;

		/**
		 * Current Claimed Rewards Score
		 */
		@SerializedName("rewardScore")
		int rewardScore = 0;

		/**
		 * Current Claimed Rewards Streak
		 */
		@SerializedName("rewardStreak")
		int rewardStreak = 0;

		/**
		 * Total Claimed Daily Rewards
		 */
		@SerializedName("totalDailyRewards")
		int totalDailyRewards = 0;

		/**
		 * Total Claimed Rewards
		 */
		@SerializedName("totalRewards")
		int totalRewards = 0;

		/**
		 * All Favourites Lobby Items (Gadget, Morph, Games ...)
		 */
		@SerializedName("vanityFavorites")
		String lobbyFavourites = "";

		/**
		 * Adsense Rewards Tokens
		 */
		@SerializedName("adsense_tokens")
		int adsenseTokens = 0;

		/**
		 * Current Lobby Gadget
		 */
		@SerializedName("currentGadget")
		String gadget = "";

		/**
		 * Current Lobby Cloak
		 */
		@SerializedName("currentCloak")
		String cloak = "";

		/**
		 * Most Recent Game Played
		 */
		@SerializedName("mostRecentGameType")
		String recentGame = "";

		/**
		 * In-Game Current Lobby Pet (Default : NONE)
		 */
		@SerializedName("currentPet")
		String pet = "NONE";

		/**
		 * History of player usernames
		 */
		@SerializedName("knownAliases")
		List<String> aliases = new ArrayList<>();

		/**
		 * One Time Achievements Unlocked
		 */
		@SerializedName("achievementsOneTime")
		List<String> oneTimeAchievements = new ArrayList<>();

		/**
		 * Player Stats Per Games
		 */
		@SerializedName("stats")
		Stats stats = new Stats();

		/**
		 * Challenges Completed by the Player
		 */
		@SerializedName("challenges")
		Challenges challenges = new Challenges();

		/**
		 * Social Medias Links of the Player
		 */
		@SerializedName("socialMedia")
		Medias medias = new Medias();


		/**
		 * Get Hypixel Player Id
		 *
		 * @return Hypixel Id
		 */
		public String getId() {
			return id;
		}

		/**
		 * Get Minecraft Account UUID
		 *
		 * @return Minecraft UUID
		 */
		public String getUuid() {
			return uuid;
		}

		/**
		 * Get the Player First Login Timestamp
		 *
		 * @return First Login Timestamp
		 */
		public long getFirstLogin() {
			return firstLogin;
		}

		/**
		 * Get the Player Last Login Timestamp
		 *
		 * @return Last Login Timestamp
		 */
		public long getLastLogin() {
			return lastLogin;
		}

		/**
		 * Get the Player Name
		 *
		 * @return Player Name
		 */
		public String getPlayerName() {
			return playerName;
		}

		/**
		 * Get the In-Game displayed Player Name
		 *
		 * @return Displayed Player Name
		 */
		public String getDisplayName() {
			return displayName;
		}

		/**
		 * Get In-Game Achievements Points
		 *
		 * @return Player Achievements Points
		 */
		public int getAchievementPoints() {
			return achievementPoints;
		}

		/**
		 * Get the last 'Quickjoin' Timestamp
		 *
		 * @return Last 'Quickjoin' Timestamp
		 */
		public long getTimestampLastQuickjoin() {
			return timestampLastQuickjoin;
		}

		/**
		 * Get the number of uses of 'Quickjoin'
		 *
		 * @return Number of Uses of 'Quickjoin'
		 */
		public int getQuickjoinUses() {
			return quickjoinUses;
		}

		/**
		 * Get In-Game Experience
		 *
		 * @return Player Network Experience
		 */
		public int getNetworkExperience() {
			return networkExperience;
		}

		/**
		 * Get the Player Last Logout Timestamp
		 *
		 * @return Last Logout Timestamp
		 */
		public long getLastLogout() {
			return lastLogout;
		}

		/**
		 * Get the View of the Player when Spectate a Game
		 *
		 * @return If Player is on First or Third Person
		 */
		public boolean isSpecFirstPerson() {
			return specFirstPerson;
		}

		/**
		 * Get the Position of the player when spectate a game
		 *
		 * @return If Player is Flying or Not
		 */
		public boolean isSpecAlwaysFlying() {
			return specAlwaysFlying;
		}

		/**
		 * Get the Player Karma points
		 *
		 * @return Karma Points
		 */
		public int getKarma() {
			return karma;
		}

		/**
		 * Get In-Game Pending Friend Requests
		 *
		 * @return Friends Requests UUID
		 */
		public List<String> getUuidsFriendRequests() {
			return uuidsFriendRequests;
		}

		/**
		 * Get the last Minecraft Version Used by the Player
		 *
		 * @return Last Minecraft Version
		 */
		public String getLastMcVersion() {
			return lastMcVersion;
		}

		/**
		 * Get In-Game Rank (https://hypixel.fandom.com/wiki/Ranks?file=All_Ranks.png)
		 *
		 * @return In-Game Rank
		 */
		public String getRank() {
			return rank;
		}

		/**
		 * Get In-Game donator rank (https://hypixel.fandom.com/wiki/Ranks?file=All_Ranks.png)
		 *
		 * @return In-Game Donator Rank
		 */
		public String getServerRank() {
			return serverRank;
		}

		/**
		 * Get the Mvp Rank Color (The + of MVP+ or MVP++)
		 *
		 * @return Mvp Rank Color
		 */
		public String getRankColor() {
			return rankColor;
		}

		/**
		 * Get the Current Language Used by the Player
		 *
		 * @return In-Game Language
		 */
		public String getLanguage() {
			return language;
		}

		/**
		 * Get Last Claimed Reward (From Delivery Man)
		 *
		 * @return Last Claimed Reward
		 */
		public long getLastClaimedReward() {
			return lastClaimedReward;
		}

		/**
		 * Get the Player Claimed Rewards High Score
		 *
		 * @return Claimed Rewards High Score
		 */
		public int getRewardHighScore() {
			return rewardHighScore;
		}

		/**
		 * Get the Player Claimed Rewards Current Score
		 *
		 * @return Claimed Rewards Current Score
		 */
		public int getRewardScore() {
			return rewardScore;
		}

		/**
		 * Get the Player Claimed Rewards Current Streak
		 *
		 * @return Claimed Rewards Current Streak
		 */
		public int getRewardStreak() {
			return rewardStreak;
		}

		/**
		 * Get the Total Daily Claimed Rewards
		 *
		 * @return Total Daily Rewards
		 */
		public int getTotalDailyRewards() {
			return totalDailyRewards;
		}

		/**
		 * Get the Total Claimed Rewards
		 *
		 * @return Total Rewards
		 */
		public int getTotalRewards() {
			return totalRewards;
		}

		/**
		 * Get All Favourites Lobby Items (Gadget, Morph, Games...)
		 *
		 * @return String with Items' Name
		 */
		public String getLobbyFavourites() {
			return lobbyFavourites;
		}

		/**
		 * Get the Current Number of Adsense Tokens
		 *
		 * @return Number of Adsense Tokens
		 */
		public int getAdsenseTokens() {
			return adsenseTokens;
		}

		/**
		 * Get the Current Gadget Used in Lobby
		 *
		 * @return Current Lobby Gadget
		 */
		public String getGadget() {
			return gadget;
		}

		/**
		 * Get the current Cloak used in Lobby
		 *
		 * @return Current Lobby Cloak
		 */
		public String getCloak() {
			return cloak;
		}

		/**
		 * Get Recent Games Played
		 *
		 * @return Recent Games
		 */
		public String getRecentGame() {
			return recentGame;
		}

		/**
		 * Get Current Pet Used in Lobby
		 *
		 * @return Current Lobby Pet
		 */
		public String getPet() {
			return pet;
		}

		/**
		 * Get the Player Usernames History
		 *
		 * @return List of all Usernames
		 */
		public List<String> getAliases() {
			return aliases;
		}

		/**
		 * Get All One Time Achievements
		 *
		 * @return List of all One Time Achievements Unlocked
		 */
		public List<String> getOneTimeAchievements() {
			return oneTimeAchievements;
		}

		/**
		 * Get the Player Stats per Games
		 *
		 * @return Player Games Stats
		 */
		public Stats getStats() {
			return stats;
		}

		/**
		 * Get Challenges Completed by the Player
		 *
		 * @return Challenges per Games
		 */
		public Challenges getChallenges() {
			return challenges;
		}

		/**
		 * Get Social Medias Links of the Player
		 *
		 * @return Social Medias Links
		 */
		public Medias getMedias() {
			return medias;
		}

		@Override
		public String toString() {
			return "Player{" +
					"id='" + id + '\'' +
					", uuid='" + uuid + '\'' +
					", firstLogin=" + firstLogin +
					", lastLogin=" + lastLogin +
					", playerName='" + playerName + '\'' +
					", displayName='" + displayName + '\'' +
					", achievementPoints=" + achievementPoints +
					", timestampLastQuickjoin=" + timestampLastQuickjoin +
					", quickjoinUses=" + quickjoinUses +
					", networkExperience=" + networkExperience +
					", lastLogout=" + lastLogout +
					", specFirstPerson=" + specFirstPerson +
					", specAlwaysFlying=" + specAlwaysFlying +
					", karma=" + karma +
					", uuidsFriendRequests=" + uuidsFriendRequests +
					", lastMcVersion='" + lastMcVersion + '\'' +
					", rank='" + rank + '\'' +
					", serverRank='" + serverRank + '\'' +
					", rankColor='" + rankColor + '\'' +
					", language='" + language + '\'' +
					", lastClaimedReward=" + lastClaimedReward +
					", rewardHighScore=" + rewardHighScore +
					", rewardScore=" + rewardScore +
					", rewardStreak=" + rewardStreak +
					", totalDailyRewards=" + totalDailyRewards +
					", totalRewards=" + totalRewards +
					", lobbyFavourites='" + lobbyFavourites + '\'' +
					", adsenseTokens=" + adsenseTokens +
					", gadget='" + gadget + '\'' +
					", cloak='" + cloak + '\'' +
					", recentGame='" + recentGame + '\'' +
					", pet='" + pet + '\'' +
					", aliases=" + aliases +
					'}';
		}
	}

	@Override
	public String toString() {
		return "PlayerData{" +
				"success=" + success +
				", player=" + player +
				'}';
	}
}
