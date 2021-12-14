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

package fr.kokhaviel.api.hypixel.resources.guild;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import fr.kokhaviel.api.hypixel.util.exceptions.HypixelAPIException;

import java.util.HashMap;
import java.util.Map;

/**
 * Hypixel Network Guilds Achievements Data
 *
 * @author Kokhaviel
 * @since 3.3
 */
public class Achievements {

	final JsonObject achievementsObject;
	final JsonObject tieredObject;

	final boolean success;
	final long lastUpdate;

	public Achievements(JsonObject achievementsObject) {
		this.achievementsObject = achievementsObject;
		this.success = this.achievementsObject.get("success").getAsBoolean();
		this.lastUpdate = this.achievementsObject.get("lastUpdated").getAsLong();
		this.tieredObject = this.achievementsObject.get("tiered").getAsJsonObject();
	}

	/**
	 * Get Success Status of the Request
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Last Data Update Timestamp
	 */
	public long getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Get Guilds Achievements Data
	 */
	public Tiered getTieredAchievements() {
		return new Tiered(tieredObject);
	}

	/**
	 * Tiered Guilds Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.3
	 */
	public static class Tiered {
		final JsonObject tieredObject;
		final Map<String, Achievement> achievementMap = new HashMap<>();

		public Tiered(JsonObject tieredObject) {
			this.tieredObject = tieredObject;
			putData();
		}

		void putData() {
			achievementMap.put("PRESTIGE", new Achievement(tieredObject.get("PRESTIGE").getAsJsonObject()));
			achievementMap.put("EXPERIENCE_KINGS", new Achievement(tieredObject.get("EXPERIENCE_KINGS").getAsJsonObject()));
			achievementMap.put("WINNERS", new Achievement(tieredObject.get("WINNERS").getAsJsonObject()));
			achievementMap.put("ONLINE_PLAYERS", new Achievement(tieredObject.get("ONLINE_PLAYERS").getAsJsonObject()));
		}

		/**
		 * Get Guilds Achievements
		 */
		public Map<String, Achievement> getAchievementMap() {
			return achievementMap;
		}
	}

	/**
	 * Achievement Data
	 *
	 * @author Kokhaviel
	 * @since 3.3
	 */
	public static class Achievement {
		final String name;
		final String description;
		final JsonArray tiersArray;

		public Achievement(JsonObject achievementObject) {
			this.name = achievementObject.get("name").getAsString();
			this.description = achievementObject.get("description").getAsString();
			this.tiersArray = achievementObject.get("tiers").getAsJsonArray();
		}

		/**
		 * Get Achievement Full Name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Get Achievement Description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * Get Achievement Tier Data
		 *
		 * @param tierLevel Tier Level (1 = Minimum)
		 * @return Requested Tier Data
		 */
		public Tier getTier(int tierLevel) {
			if(tierLevel <= 0) throw new HypixelAPIException("Achievement Tier Cannot Be 0, 1 is Minimum");
			return new Tier(tiersArray.get(tierLevel - 1).getAsJsonObject());
		}
	}

	/**
	 * Achievement Tier Data
	 *
	 * @author Kokhaviel
	 * @since 3.3
	 */
	public static class Tier {
		final int tier;
		final int amount;

		public Tier(JsonObject tierObject) {
			this.tier = tierObject.get("tier").getAsInt();
			this.amount = tierObject.get("amount").getAsInt();
		}

		/**
		 * Get Tier Level
		 */
		public int getTier() {
			return tier;
		}

		/**
		 * Get Amount Required to Reach Tier
		 */
		public int getAmount() {
			return amount;
		}
	}
}
