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

package fr.kokhaviel.api.hypixel.guild;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Hypixel Guild Data
 *
 * @author Kokhaviel
 * @since 2.0
 */
public class GuildData {

	/**
	 * Success Status
	 */
	@SerializedName("success")
	boolean success = false;

	/**
	 * Guild Statistics
	 */
	@SerializedName("guild")
	Guild guild = new Guild();

	/**
	 * Get Success Status
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Guild Statistics
	 */
	public Guild getGuild() {
		return guild;
	}

	/**
	 * Hypixel Guild Statistics
	 *
	 * @author Kokhaviel
	 * @since 2.0
	 */
	public static class Guild {

		/**
		 * Guild Id
		 */
		@SerializedName("_id")
		String id = "";

		/**
		 * Name of the Guild
		 */
		@SerializedName("name")
		String name = "";

		/**
		 * Coins of the Guild
		 */
		@SerializedName("coins")
		int coins = 0;

		/**
		 * Total Coins of the Guild
		 */
		@SerializedName("coinsEver")
		int totalCoins = 0;

		/**
		 * Timestamp of Guild Create
		 */
		@SerializedName("created")
		long created = 0;

		/**
		 * Members Statistics of the Guild
		 */
		@SerializedName("members")
		List<Member> members = new ArrayList<>();

		/**
		 * Ranks Statistics of the Player
		 */
		@SerializedName("ranks")
		List<Rank> ranks = new ArrayList<>();

		/**
		 * Get Total Guild Experience
		 */
		@SerializedName("exp")
		long experience = 0;

		/**
		 * Description of the Guild
		 */
		@SerializedName("description")
		String description = "";

		/**
		 * Server Tag of the Guild
		 */
		@SerializedName("tag")
		String tag = "";

		/**
		 * Current Tag Color of the Guild
		 */
		@SerializedName("tagColor")
		String tagColor = "";

		/**
		 * Top 3 Preferred Guild Members Games
		 */
		@SerializedName("preferredGames")
		List<String> preferredGames = new ArrayList<>();

		/**
		 * Guild Experience Per Games
		 */
		@SerializedName("guildExpByGameType")
		GuildExp guildExp = new GuildExp();


		/**
		 * Get Guild ID
		 *
		 * @return ID
		 */
		public String getId() {
			return id;
		}

		/**
		 * Get Guild Name
		 *
		 * @return Name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Get Guild Coins
		 *
		 * @return Coins
		 */
		public int getCoins() {
			return coins;
		}

		/**
		 * Get Total Guild Coins
		 *
		 * @return Total Coins
		 */
		public int getTotalCoins() {
			return totalCoins;
		}

		/**
		 * Get Timestamp of the Creation of the Guild
		 *
		 * @return Creation Date
		 */
		public long getCreated() {
			return created;
		}

		/**
		 * Get Members Stats
		 */
		public List<Member> getMembers() {
			return members;
		}

		/**
		 * Get Rank Stats
		 */
		public List<Rank> getRanks() {
			return ranks;
		}

		/**
		 * Get Guild Experience
		 *
		 * @return Exp
		 */
		public long getExperience() {
			return experience;
		}

		/**
		 * Get Guild Description
		 *
		 * @return Description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * Get Guild Server Tag
		 *
		 * @return Tag
		 */
		public String getTag() {
			return tag;
		}

		/**
		 * Get Guild Tag Color
		 *
		 * @return Color Name
		 */
		public String getTagColor() {
			return tagColor;
		}

		/**
		 * Get Guild Members Preferred Games
		 */
		public List<String> getPreferredGames() {
			return preferredGames;
		}

		/**
		 * Get Guild Experience Per Games
		 */
		public GuildExp getGuildExp() {
			return guildExp;
		}

		@Override
		public String toString() {
			return "Guild{" +
					"id='" + id + '\'' +
					", name='" + name + '\'' +
					", coins=" + coins +
					", totalCoins=" + totalCoins +
					", created=" + created +
					", experience=" + experience +
					", description='" + description + '\'' +
					", tag='" + tag + '\'' +
					", tagColor='" + tagColor + '\'' +
					", preferredGames=" + preferredGames +
					", guildExp=" + guildExp +
					'}';
		}
	}

	@Override
	public String toString() {
		return "GuildData{" +
				"success=" + success +
				", guild=" + guild +
				'}';
	}
}
