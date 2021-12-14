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
 * Hypixel Network Collections Data
 * @author Kokhaviel
 * @since 4.0
 */
public class Collections {


	private interface ISkill {
		String getName();
		Map<String, Item> getCollection();
	}

	final JsonObject collectionsObject;
	final boolean success;
	final long lastUpdate;
	final String version;

	public Collections(JsonObject jsonObject) {
		this.success = jsonObject.get("success").getAsBoolean();
		this.lastUpdate = jsonObject.get("lastUpdated").getAsLong();
		this.version = jsonObject.get("version").getAsString();
		this.collectionsObject = jsonObject.get("collections").getAsJsonObject();
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
	 * Get Farming Collections
	 */
	public Farming getFarmingCollections() {
		return new Farming(collectionsObject.get("FARMING").getAsJsonObject());
	}

	/**
	 * Get Mining Collections
	 */
	public Mining getMiningCollections() {
		return new Mining(collectionsObject.get("MINING").getAsJsonObject());
	}

	/**
	 * Get Combat Collections
	 */
	public Combat getCombatFarmingCollections() {
		return new Combat(collectionsObject.get("COMBAT").getAsJsonObject());
	}

	/**
	 * Get Foraging Collections
	 */
	public Foraging getForagingCollections() {
		return new Foraging(collectionsObject.get("FORAGING").getAsJsonObject());
	}

	/**
	 * Get Fishing Collections
	 */
	public Fishing getFishingCollections() {
		return new Fishing(collectionsObject.get("FISHING").getAsJsonObject());
	}

	/**
	 * Get Skyblock Version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Farming Collections Data
	 * @author Kokhaviel
	 * @since 4.0
	 */
	public static class Farming implements ISkill {
		final String name;
		final JsonObject itemsObject;
		final Map<String, Item> farmingCollection = new HashMap<>();

		public Farming(JsonObject farmingObject) {
			this.name = farmingObject.get("name").getAsString();
			this.itemsObject = farmingObject.get("items").getAsJsonObject();
			putFarmingData();
		}

		void putFarmingData() {
			farmingCollection.put("WHEAT", new Item(itemsObject.get("WHEAT").getAsJsonObject()));
			farmingCollection.put("CARROT", new Item(itemsObject.get("CARROT_ITEM").getAsJsonObject()));
			farmingCollection.put("POTATO", new Item(itemsObject.get("POTATO_ITEM").getAsJsonObject()));
			farmingCollection.put("PUMPKIN", new Item(itemsObject.get("PUMPKIN").getAsJsonObject()));
			farmingCollection.put("MELON", new Item(itemsObject.get("MELON").getAsJsonObject()));
			farmingCollection.put("SEEDS", new Item(itemsObject.get("SEEDS").getAsJsonObject()));
			farmingCollection.put("MUSHROOM", new Item(itemsObject.get("MUSHROOM_COLLECTION").getAsJsonObject()));
			farmingCollection.put("INK_SACK", new Item(itemsObject.get("INK_SACK:3").getAsJsonObject()));
			farmingCollection.put("CACTUS", new Item(itemsObject.get("CACTUS").getAsJsonObject()));
			farmingCollection.put("SUGAR_CANE", new Item(itemsObject.get("SUGAR_CANE").getAsJsonObject()));
			farmingCollection.put("FEATHER", new Item(itemsObject.get("FEATHER").getAsJsonObject()));
			farmingCollection.put("LEATHER", new Item(itemsObject.get("LEATHER").getAsJsonObject()));
			farmingCollection.put("PORK", new Item(itemsObject.get("PORK").getAsJsonObject()));
			farmingCollection.put("RAW_CHICKEN", new Item(itemsObject.get("RAW_CHICKEN").getAsJsonObject()));
			farmingCollection.put("MUTTON", new Item(itemsObject.get("MUTTON").getAsJsonObject()));
			farmingCollection.put("RABBIT", new Item(itemsObject.get("RABBIT").getAsJsonObject()));
			farmingCollection.put("NETHER_STALK", new Item(itemsObject.get("NETHER_STALK").getAsJsonObject()));
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public Map<String, Item> getCollection() {
			return farmingCollection;
		}
	}

	/**
	 * Mining Collections Data
	 * @author Kokhaviel
	 * @since 4.0
	 */
	public static class Mining implements ISkill {
		final String name;
		final JsonObject itemsObject;
		final Map<String, Item> miningCollection = new HashMap<>();

		public Mining(JsonObject miningObject) {
			this.name = miningObject.get("name").getAsString();
			this.itemsObject = miningObject.get("items").getAsJsonObject();
			putMiningData();
		}

		void putMiningData() {
			miningCollection.put("COBBLESTONE", new Item(itemsObject.get("COBBLESTONE").getAsJsonObject()));
			miningCollection.put("COAL", new Item(itemsObject.get("COAL").getAsJsonObject()));
			miningCollection.put("IRON", new Item(itemsObject.get("IRON_INGOT").getAsJsonObject()));
			miningCollection.put("GOLD", new Item(itemsObject.get("GOLD_INGOT").getAsJsonObject()));
			miningCollection.put("DIAMOND", new Item(itemsObject.get("DIAMOND").getAsJsonObject()));
			miningCollection.put("INK_SACK", new Item(itemsObject.get("INK_SACK:4").getAsJsonObject()));
			miningCollection.put("EMERALD", new Item(itemsObject.get("EMERALD").getAsJsonObject()));
			miningCollection.put("REDSTONE", new Item(itemsObject.get("REDSTONE").getAsJsonObject()));
			miningCollection.put("QUARTZ", new Item(itemsObject.get("QUARTZ").getAsJsonObject()));
			miningCollection.put("OBSIDIAN", new Item(itemsObject.get("OBSIDIAN").getAsJsonObject()));
			miningCollection.put("GLOWSTONE", new Item(itemsObject.get("GLOWSTONE_DUST").getAsJsonObject()));
			miningCollection.put("GRAVEL", new Item(itemsObject.get("GRAVEL").getAsJsonObject()));
			miningCollection.put("ICE", new Item(itemsObject.get("ICE").getAsJsonObject()));
			miningCollection.put("NETHERRACK", new Item(itemsObject.get("NETHERRACK").getAsJsonObject()));
			miningCollection.put("SAND", new Item(itemsObject.get("SAND").getAsJsonObject()));
			miningCollection.put("ENDER_STONE", new Item(itemsObject.get("ENDER_STONE").getAsJsonObject()));
			miningCollection.put("MITHRIL", new Item(itemsObject.get("MITHRIL_ORE").getAsJsonObject()));
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public Map<String, Item> getCollection() {
			return miningCollection;
		}
	}

	/**
	 * Combat Collections Data
	 * @author Kokhaviel
	 * @since 4.0
	 */
	public static class Combat implements ISkill {
		final String name;
		final JsonObject itemsObject;
		final Map<String, Item> combatCollection = new HashMap<>();

		public Combat(JsonObject combatObject) {
			this.name = combatObject.get("name").getAsString();
			this.itemsObject = combatObject.get("items").getAsJsonObject();
			putCombatData();
		}

		void putCombatData() {
			combatCollection.put("ROTTEN_FLESH", new Item(itemsObject.get("ROTTEN_FLESH").getAsJsonObject()));
			combatCollection.put("BONE", new Item(itemsObject.get("BONE").getAsJsonObject()));
			combatCollection.put("STRING", new Item(itemsObject.get("STRING").getAsJsonObject()));
			combatCollection.put("SPIDER_EYE", new Item(itemsObject.get("SPIDER_EYE").getAsJsonObject()));
			combatCollection.put("SULPHUR", new Item(itemsObject.get("SULPHUR").getAsJsonObject()));
			combatCollection.put("ENDERPEARL", new Item(itemsObject.get("ENDER_PEARL").getAsJsonObject()));
			combatCollection.put("GHAST_TEAR", new Item(itemsObject.get("GHAST_TEAR").getAsJsonObject()));
			combatCollection.put("SLIMEBALL", new Item(itemsObject.get("SLIME_BALL").getAsJsonObject()));
			combatCollection.put("BLAZE_ROD", new Item(itemsObject.get("BLAZE_ROD").getAsJsonObject()));
			combatCollection.put("MAGMA_CREAM", new Item(itemsObject.get("MAGMA_CREAM").getAsJsonObject()));
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public Map<String, Item> getCollection() {
			return combatCollection;
		}
	}

	/**
	 * Foraging Collections Data
	 * @author Kokhaviel
	 * @since 4.0
	 */
	public static class Foraging implements ISkill {
		final String name;
		final JsonObject itemsObject;
		final Map<String, Item> foragingCollection = new HashMap<>();

		public Foraging(JsonObject foragingObject) {
			this.name = foragingObject.get("name").getAsString();
			this.itemsObject = foragingObject.get("items").getAsJsonObject();
			putForagingData();
		}

		void putForagingData() {
			foragingCollection.put("WOOD", new Item(itemsObject.get("LOG").getAsJsonObject()));
			foragingCollection.put("SPRUCE_WOOD", new Item(itemsObject.get("LOG:1").getAsJsonObject()));
			foragingCollection.put("BIRCH_WOOD", new Item(itemsObject.get("LOG:2").getAsJsonObject()));
			foragingCollection.put("DARK_OAK_WOOD", new Item(itemsObject.get("LOG_2:1").getAsJsonObject()));
			foragingCollection.put("ACACIA_WOOD", new Item(itemsObject.get("LOG_2").getAsJsonObject()));
			foragingCollection.put("JUNGLE_WOOD", new Item(itemsObject.get("LOG:3").getAsJsonObject()));
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public Map<String, Item> getCollection() {
			return foragingCollection;
		}
	}

	/**
	 * Fishing Collections Data
	 * @author Kokhaviel
	 * @since 4.0
	 */
	public static class Fishing implements ISkill {
		final String name;
		final JsonObject itemsObject;
		final Map<String, Item> fishingCollection = new HashMap<>();

		public Fishing(JsonObject fishingObject) {
			this.name = fishingObject.get("name").getAsString();
			this.itemsObject = fishingObject.get("items").getAsJsonObject();
			putFishingData();
		}

		void putFishingData() {
			fishingCollection.put("RAW_FISH", new Item(itemsObject.get("RAW_FISH").getAsJsonObject()));
			fishingCollection.put("RAW_SALMON", new Item(itemsObject.get("RAW_FISH:1").getAsJsonObject()));
			fishingCollection.put("CLOWNFISH", new Item(itemsObject.get("RAW_FISH:2").getAsJsonObject()));
			fishingCollection.put("PUFFERFISH", new Item(itemsObject.get("RAW_FISH:3").getAsJsonObject()));
			fishingCollection.put("PRISMARINE_SHARD", new Item(itemsObject.get("PRISMARINE_SHARD").getAsJsonObject()));
			fishingCollection.put("PRISMARINE_CRYSTALS", new Item(itemsObject.get("PRISMARINE_CRYSTALS").getAsJsonObject()));
			fishingCollection.put("CLAY_BALL", new Item(itemsObject.get("CLAY_BALL").getAsJsonObject()));
			fishingCollection.put("LILYPAD", new Item(itemsObject.get("WATER_LILY").getAsJsonObject()));
			fishingCollection.put("INK_SACK", new Item(itemsObject.get("INK_SACK").getAsJsonObject()));
			fishingCollection.put("SPONGE", new Item(itemsObject.get("SPONGE").getAsJsonObject()));
		}

		@Override
		public String getName() {
			return name;
		}

		@Override
		public Map<String, Item> getCollection() {
			return fishingCollection;
		}
	}

	/**
	 * Collection Item Data
	 * @author Kokhaviel
	 */
	public static class Item {

		final String name;
		final int maxTier;
		final JsonArray tiersObject;

		public Item(JsonObject itemObject) {
			this.name = itemObject.get("name").getAsString();
			this.maxTier = itemObject.get("maxTiers").getAsInt();
			this.tiersObject = itemObject.get("tiers").getAsJsonArray();
		}

		public String getName() {
			return name;
		}

		public int getMaxTier() {
			return maxTier;
		}

		public Tier getTier(int tierLevel) {
			if(tierLevel <= 0) throw new HypixelAPIException("Collection Tier Cannot Be 0, 1 is Minimum");
			if(tierLevel > maxTier + 1) throw new HypixelAPIException("Maximum Tier of this Collection is " + maxTier);

			return new Tier(tiersObject.get(tierLevel - 1).getAsJsonObject());
		}
	}

	/**
	 * Collection Item Tier Data
	 * @author Kokhaviel
	 * @since 4.0
	 */
	public static class Tier {
		final int tier;
		final int amountRequired;
		final JsonArray unlocksArray;

		public Tier(JsonObject tierObject) {
			this.tier = tierObject.get("tier").getAsInt();
			this.amountRequired = tierObject.get("amountRequired").getAsInt();
			this.unlocksArray = tierObject.get("unlocks").getAsJsonArray();
		}

		public int getTier() {
			return tier;
		}

		public int getAmountRequired() {
			return amountRequired;
		}

		public String getUnlocks() {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < unlocksArray.size(); i++) {
				sb.append(i + 1).append(" : ").append(unlocksArray.get(i).getAsString()).append("\n");
			}
			return sb.toString();
		}
	}
}
