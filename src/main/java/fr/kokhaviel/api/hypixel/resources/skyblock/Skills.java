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

package fr.kokhaviel.api.hypixel.resources.skyblock;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import fr.kokhaviel.api.hypixel.util.exceptions.HypixelAPIException;

import java.util.HashMap;
import java.util.Map;

/**
 * Hypixel Network Skyblock Skills Data
 * @author Kokhaviel
 * @since 4.1
 */
public class Skills {

	private interface ISkyblockSkill {
		String getName();
		String getDescription();
		int getMaxLevel();
		Level getLevel(int level);
	}

	private interface ILevel {
		int getLevel();
		int getExpRequired();
		String getUnlocks();
	}

	final boolean success;
	final long lastUpdate;
	final String version;
	final JsonObject skillsObject;
	final Map<String, Skill> skillsMap = new HashMap<>();

	public Skills(JsonObject skillsObject) {
		this.success = skillsObject.get("success").getAsBoolean();
		this.lastUpdate = skillsObject.get("lastUpdated").getAsLong();
		this.version = skillsObject.get("version").getAsString();
		this.skillsObject = skillsObject.get("collections").getAsJsonObject();
		putData();
	}

	void putData() {
		skillsMap.put("FARMING", new Skill(skillsObject.get("FARMING").getAsJsonObject()));
		skillsMap.put("MINING", new Skill(skillsObject.get("MINING").getAsJsonObject()));
		skillsMap.put("COMBAT", new Skill(skillsObject.get("COMBAT").getAsJsonObject()));
		skillsMap.put("FORAGING", new Skill(skillsObject.get("FORAGING").getAsJsonObject()));
		skillsMap.put("FISHING", new Skill(skillsObject.get("FISHING").getAsJsonObject()));
		skillsMap.put("ENCHANTING", new Skill(skillsObject.get("ENCHANTING").getAsJsonObject()));
		skillsMap.put("ALCHEMY", new Skill(skillsObject.get("ALCHEMY").getAsJsonObject()));
		skillsMap.put("CARPENTRY", new Skill(skillsObject.get("CARPENTRY").getAsJsonObject()));
		skillsMap.put("RUNECRAFTING", new Skill(skillsObject.get("RUNECRAFTING").getAsJsonObject()));
		skillsMap.put("SOCIAL", new Skill(skillsObject.get("SOCIAL").getAsJsonObject()));
		skillsMap.put("TAMING", new Skill(skillsObject.get("TAMING").getAsJsonObject()));
	}

	/**
	 * Success Status of the Request
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Last Data Update Timestamp
	 */
	public long getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Skills Data Version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Get Skyblock Skills
	 */
	public Map<String, Skill> getSkillsMap() {
		return skillsMap;
	}

	/**
	 * Skill Data
	 * @author Kokhaviel
	 * @since 4.1
	 */
	public static class Skill implements ISkyblockSkill {

		final String name;
		final String description;
		final int maxLevel;
		final JsonArray levels;

		public Skill(JsonObject skillObject) {
			this.name = skillObject.get("name").getAsString();
			this.description = skillObject.get("description").getAsString();
			this.maxLevel = skillObject.get("maxLevel").getAsInt();
			this.levels = skillObject.get("levels").getAsJsonArray();
		}

		/**
		 * Get Skill Name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * Get Skill Description
		 */
		@Override
		public String getDescription() {
			return description;
		}

		/**
		 * Get Skill Max Level
		 */
		@Override
		public int getMaxLevel() {
			return maxLevel;
		}

		/**
		 * Get Skill Level
		 * @param level Skill Level (Minimum = 1)
		 * @return Request Level Data
		 */
		@Override
		public Level getLevel(int level) {
			if(level <= 0) throw new HypixelAPIException("Level cannot be 0, 1 is minimum");
			if(level > maxLevel) throw new HypixelAPIException("Maximum Level of this Skill is " + maxLevel);
			return new Level(levels.get(level - 1).getAsJsonObject());
		}
	}

	/**
	 * Skill Level Data
	 * @author Kokhaviel
	 * @since 4.1
	 */
	public static class Level implements ILevel {

		final int level;
		final int exp;
		final JsonArray unlocks;

		public Level(JsonObject levelObject) {
			this.level = levelObject.get("level").getAsInt();
			this.exp = levelObject.get("totalExpRequired").getAsInt();
			this.unlocks = levelObject.get("unlocks").getAsJsonArray();
		}

		/**
		 * Get Level
		 */
		@Override
		public int getLevel() {
			return level;
		}

		/**
		 * Get Exp Required to Reach Level
		 */
		@Override
		public int getExpRequired() {
			return exp;
		}

		/**
		 * Get Unlocked Items when Reach Level
		 */
		@Override
		public String getUnlocks() {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < unlocks.size(); i++) {
				sb.append(i + 1).append(" : ").append(unlocks.get(i).getAsString()).append("\n");
			}
			return sb.toString();
		}
	}
}
