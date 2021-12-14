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

import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Hypixel Skyblock Bazaar Data
 * @author Kokhaviel
 * @since 4.3
 */
public class Bazaar {

	private interface IBazaarItem {
		String getProductId();
		double getSellPrice();
		double getBuyPrice();
	}

	final boolean success;
	final long lastUpdate;
	final JsonObject bazaarObject;
	final Map<String, BazaarItem> bazaarItemMap = new HashMap<>();

	public Bazaar(JsonObject bazaarObject) {
		this.success = bazaarObject.get("success").getAsBoolean();
		this.lastUpdate = bazaarObject.get("lastUpdated").getAsLong();
		this.bazaarObject = bazaarObject.get("products").getAsJsonObject();
		putBazaarData();
	}

	void putBazaarData() {
		bazaarItemMap.put("BROWN_MUSHROOM", new BazaarItem(bazaarObject.get("BROWN_MUSHROOM").getAsJsonObject()));
		bazaarItemMap.put("INK_SACK:3", new BazaarItem(bazaarObject.get("INK_SACK:3").getAsJsonObject()));
		bazaarItemMap.put("INK_SACK:4", new BazaarItem(bazaarObject.get("INK_SACK:4").getAsJsonObject()));
		bazaarItemMap.put("SPOOKY_SHARD", new BazaarItem(bazaarObject.get("SPOOKY_SHARD").getAsJsonObject()));
		bazaarItemMap.put("TARANTULA_WEB", new BazaarItem(bazaarObject.get("TARANTULA_WEB").getAsJsonObject()));
		bazaarItemMap.put("CARROT_ITEM", new BazaarItem(bazaarObject.get("CARROT_ITEM").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_POTATO", new BazaarItem(bazaarObject.get("ENCHANTED_POTATO").getAsJsonObject()));
		bazaarItemMap.put("EXP_BOTTLE", new BazaarItem(bazaarObject.get("EXP_BOTTLE").getAsJsonObject()));
		bazaarItemMap.put("JERRY_BOX_GREEN", new BazaarItem(bazaarObject.get("JERRY_BOX_GREEN").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SLIME_BALL", new BazaarItem(bazaarObject.get("ENCHANTED_SLIME_BALL").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_RED_MUSHROOM", new BazaarItem(bazaarObject.get("ENCHANTED_RED_MUSHROOM").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_GOLDEN_CARROT", new BazaarItem(bazaarObject.get("ENCHANTED_GOLDEN_CARROT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_RABBIT_HIDE", new BazaarItem(bazaarObject.get("ENCHANTED_RABBIT_HIDE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_BIRCH_LOG", new BazaarItem(bazaarObject.get("ENCHANTED_BIRCH_LOG").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_GUNPOWDER", new BazaarItem(bazaarObject.get("ENCHANTED_GUNPOWDER").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_MELON", new BazaarItem(bazaarObject.get("ENCHANTED_MELON").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SUGAR", new BazaarItem(bazaarObject.get("ENCHANTED_SUGAR").getAsJsonObject()));
		bazaarItemMap.put("CACTUS", new BazaarItem(bazaarObject.get("CACTUS").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_BLAZE_ROD", new BazaarItem(bazaarObject.get("ENCHANTED_BLAZE_ROD").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_CAKE", new BazaarItem(bazaarObject.get("ENCHANTED_CAKE").getAsJsonObject()));
		bazaarItemMap.put("PUMPKIN", new BazaarItem(bazaarObject.get("PUMPKIN").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_BROWN_MUSHROOM", new BazaarItem(bazaarObject.get("ENCHANTED_BROWN_MUSHROOM").getAsJsonObject()));
		bazaarItemMap.put("WHEAT", new BazaarItem(bazaarObject.get("WHEAT").getAsJsonObject()));
		bazaarItemMap.put("NURSE_SHARK_TOOTH", new BazaarItem(bazaarObject.get("NURSE_SHARK_TOOTH").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_RAW_SALMON", new BazaarItem(bazaarObject.get("ENCHANTED_RAW_SALMON").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_GLISTERING_MELON", new BazaarItem(bazaarObject.get("ENCHANTED_GLISTERING_MELON").getAsJsonObject()));
		bazaarItemMap.put("PRISMARINE_SHARD", new BazaarItem(bazaarObject.get("PRISMARINE_SHARD").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_EMERALD", new BazaarItem(bazaarObject.get("ENCHANTED_EMERALD").getAsJsonObject()));
		bazaarItemMap.put("PROTECTOR_FRAGMENT", new BazaarItem(bazaarObject.get("PROTECTOR_FRAGMENT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SPIDER_EYE", new BazaarItem(bazaarObject.get("ENCHANTED_SPIDER_EYE").getAsJsonObject()));
		bazaarItemMap.put("RED_MUSHROOM", new BazaarItem(bazaarObject.get("RED_MUSHROOM").getAsJsonObject()));
		bazaarItemMap.put("GRAND_EXP_BOTTLE", new BazaarItem(bazaarObject.get("GRAND_EXP_BOTTLE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_MELON_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_MELON_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("MUTTON", new BazaarItem(bazaarObject.get("MUTTON").getAsJsonObject()));
		bazaarItemMap.put("POWER_CRYSTAL", new BazaarItem(bazaarObject.get("POWER_CRYSTAL").getAsJsonObject()));
		bazaarItemMap.put("RAW_SOULFLOW", new BazaarItem(bazaarObject.get("RAW_SOULFLOW").getAsJsonObject()));
		bazaarItemMap.put("DIAMOND", new BazaarItem(bazaarObject.get("DIAMOND").getAsJsonObject()));
		bazaarItemMap.put("SHARK_FIN", new BazaarItem(bazaarObject.get("SHARK_FIN").getAsJsonObject()));
		bazaarItemMap.put("WISE_FRAGMENT", new BazaarItem(bazaarObject.get("WISE_FRAGMENT").getAsJsonObject()));
		bazaarItemMap.put("COBBLESTONE", new BazaarItem(bazaarObject.get("COBBLESTONE").getAsJsonObject()));
		bazaarItemMap.put("REFINED_MITHRIL", new BazaarItem(bazaarObject.get("REFINED_MITHRIL").getAsJsonObject()));
		bazaarItemMap.put("RAW_FISH", new BazaarItem(bazaarObject.get("RAW_FISH").getAsJsonObject()));
		bazaarItemMap.put("SPIDER_EYE", new BazaarItem(bazaarObject.get("SPIDER_EYE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_PUFFERFISH", new BazaarItem(bazaarObject.get("ENCHANTED_PUFFERFISH").getAsJsonObject()));
		bazaarItemMap.put("POTATO_ITEM", new BazaarItem(bazaarObject.get("POTATO_ITEM").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_NETHERRACK", new BazaarItem(bazaarObject.get("ENCHANTED_NETHERRACK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_HUGE_MUSHROOM_1", new BazaarItem(bazaarObject.get("ENCHANTED_HUGE_MUSHROOM_1").getAsJsonObject()));
		bazaarItemMap.put("REFINED_DIAMOND", new BazaarItem(bazaarObject.get("REFINED_DIAMOND").getAsJsonObject()));
		bazaarItemMap.put("TIGHTLY_TIED_HAY_BALE", new BazaarItem(bazaarObject.get("TIGHTLY_TIED_HAY_BALE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_COBBLESTONE", new BazaarItem(bazaarObject.get("ENCHANTED_COBBLESTONE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_HUGE_MUSHROOM_2", new BazaarItem(bazaarObject.get("ENCHANTED_HUGE_MUSHROOM_2").getAsJsonObject()));
		bazaarItemMap.put("PORK", new BazaarItem(bazaarObject.get("PORK").getAsJsonObject()));
		bazaarItemMap.put("PRISMARINE_CRYSTALS", new BazaarItem(bazaarObject.get("PRISMARINE_CRYSTALS").getAsJsonObject()));
		bazaarItemMap.put("ICE", new BazaarItem(bazaarObject.get("ICE").getAsJsonObject()));
		bazaarItemMap.put("TIGER_SHARK_TOOTH", new BazaarItem(bazaarObject.get("TIGER_SHARK_TOOTH").getAsJsonObject()));
		bazaarItemMap.put("HUGE_MUSHROOM_1", new BazaarItem(bazaarObject.get("HUGE_MUSHROOM_1").getAsJsonObject()));
		bazaarItemMap.put("ICE_BAIT", new BazaarItem(bazaarObject.get("ICE_BAIT").getAsJsonObject()));
		bazaarItemMap.put("HUGE_MUSHROOM_2", new BazaarItem(bazaarObject.get("HUGE_MUSHROOM_2").getAsJsonObject()));
		bazaarItemMap.put("DARK_OAK_WOOD", new BazaarItem(bazaarObject.get("LOG_2:1").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SNOW_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_SNOW_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("STRING", new BazaarItem(bazaarObject.get("STRING").getAsJsonObject()));
		bazaarItemMap.put("GOLDEN_TOOTH", new BazaarItem(bazaarObject.get("GOLDEN_TOOTH").getAsJsonObject()));
		bazaarItemMap.put("HYPER_CATALYST", new BazaarItem(bazaarObject.get("HYPER_CATALYST").getAsJsonObject()));
		bazaarItemMap.put("RABBIT_FOOT", new BazaarItem(bazaarObject.get("RABBIT_FOOT").getAsJsonObject()));
		bazaarItemMap.put("REDSTONE", new BazaarItem(bazaarObject.get("REDSTONE").getAsJsonObject()));
		bazaarItemMap.put("JERRY_BOX_GOLDEN", new BazaarItem(bazaarObject.get("JERRY_BOX_GOLDEN").getAsJsonObject()));
		bazaarItemMap.put("PUMPKIN_GUTS", new BazaarItem(bazaarObject.get("PUMPKIN_GUTS").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_CACTUS_GREEN", new BazaarItem(bazaarObject.get("ENCHANTED_CACTUS_GREEN").getAsJsonObject()));
		bazaarItemMap.put("BOOSTER_COOKIE", new BazaarItem(bazaarObject.get("BOOSTER_COOKIE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_CARROT_ON_A_STICK", new BazaarItem(bazaarObject.get("ENCHANTED_CARROT_ON_A_STICK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_LAPIS_LAZULI_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_LAPIS_LAZULI_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_COOKIE", new BazaarItem(bazaarObject.get("ENCHANTED_COOKIE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_ENDSTONE", new BazaarItem(bazaarObject.get("ENCHANTED_ENDSTONE").getAsJsonObject()));
		bazaarItemMap.put("COLOSSAL_EXP_BOTTLE", new BazaarItem(bazaarObject.get("COLOSSAL_EXP_BOTTLE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SAND", new BazaarItem(bazaarObject.get("ENCHANTED_SAND").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_STRING", new BazaarItem(bazaarObject.get("ENCHANTED_STRING").getAsJsonObject()));
		bazaarItemMap.put("STRONG_FRAGMENT", new BazaarItem(bazaarObject.get("STRONG_FRAGMENT").getAsJsonObject()));
		bazaarItemMap.put("SLIME_BALL", new BazaarItem(bazaarObject.get("SLIME_BALL").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_ACACIA_LOG", new BazaarItem(bazaarObject.get("ENCHANTED_ACACIA_LOG").getAsJsonObject()));
		bazaarItemMap.put("SNOW_BALL", new BazaarItem(bazaarObject.get("SNOW_BALL").getAsJsonObject()));
		bazaarItemMap.put("HOLY_FRAGMENT", new BazaarItem(bazaarObject.get("HOLY_FRAGMENT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_EGG", new BazaarItem(bazaarObject.get("ENCHANTED_EGG").getAsJsonObject()));
		bazaarItemMap.put("SAND", new BazaarItem(bazaarObject.get("SAND").getAsJsonObject()));
		bazaarItemMap.put("SOUL_FRAGMENT", new BazaarItem(bazaarObject.get("SOUL_FRAGMENT").getAsJsonObject()));
		bazaarItemMap.put("RAW_CHICKEN", new BazaarItem(bazaarObject.get("RAW_CHICKEN").getAsJsonObject()));
		bazaarItemMap.put("PLASMA_BUCKET", new BazaarItem(bazaarObject.get("PLASMA_BUCKET").getAsJsonObject()));
		bazaarItemMap.put("ANCIENT_CLAW", new BazaarItem(bazaarObject.get("ANCIENT_CLAW").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_LAPIS_LAZULI", new BazaarItem(bazaarObject.get("ENCHANTED_LAPIS_LAZULI").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_GHAST_TEAR", new BazaarItem(bazaarObject.get("ENCHANTED_GHAST_TEAR").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_COCOA", new BazaarItem(bazaarObject.get("ENCHANTED_COCOA").getAsJsonObject()));
		bazaarItemMap.put("CARROT_BAIT", new BazaarItem(bazaarObject.get("CARROT_BAIT").getAsJsonObject()));
		bazaarItemMap.put("SEEDS", new BazaarItem(bazaarObject.get("SEEDS").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_LEATHER", new BazaarItem(bazaarObject.get("ENCHANTED_LEATHER").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SHARK_FIN", new BazaarItem(bazaarObject.get("ENCHANTED_SHARK_FIN").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SPONGE", new BazaarItem(bazaarObject.get("ENCHANTED_SPONGE").getAsJsonObject()));
		bazaarItemMap.put("HAY_BLOCK", new BazaarItem(bazaarObject.get("HAY_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("FLINT", new BazaarItem(bazaarObject.get("FLINT").getAsJsonObject()));
		bazaarItemMap.put("INK_SACK", new BazaarItem(bazaarObject.get("INK_SACK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_ROTTEN_FLESH", new BazaarItem(bazaarObject.get("ENCHANTED_ROTTEN_FLESH").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SPRUCE_LOG", new BazaarItem(bazaarObject.get("ENCHANTED_SPRUCE_LOG").getAsJsonObject()));
		bazaarItemMap.put("WOLF_TOOTH", new BazaarItem(bazaarObject.get("WOLF_TOOTH").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_GRILLED_PORK", new BazaarItem(bazaarObject.get("ENCHANTED_GRILLED_PORK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_NETHER_STALK", new BazaarItem(bazaarObject.get("ENCHANTED_NETHER_STALK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_REDSTONE_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_REDSTONE_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_QUARTZ_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_QUARTZ_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_ANCIENT_CLAW", new BazaarItem(bazaarObject.get("ENCHANTED_ANCIENT_CLAW").getAsJsonObject()));
		bazaarItemMap.put("GREEN_CANDY", new BazaarItem(bazaarObject.get("GREEN_CANDY").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_REDSTONE", new BazaarItem(bazaarObject.get("ENCHANTED_REDSTONE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_REDSTONE_LAMP", new BazaarItem(bazaarObject.get("ENCHANTED_REDSTONE_LAMP").getAsJsonObject()));
		bazaarItemMap.put("TREASURITE", new BazaarItem(bazaarObject.get("TREASURITE").getAsJsonObject()));
		bazaarItemMap.put("DWARVEN_COMPACTOR", new BazaarItem(bazaarObject.get("DWARVEN_COMPACTOR").getAsJsonObject()));
		bazaarItemMap.put("GREAT_WHITE_SHARK_TOOTH", new BazaarItem(bazaarObject.get("GREAT_WHITE_SHARK_TOOTH").getAsJsonObject()));
		bazaarItemMap.put("GRAVEL", new BazaarItem(bazaarObject.get("GRAVEL").getAsJsonObject()));
		bazaarItemMap.put("MELON", new BazaarItem(bazaarObject.get("MELON").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_LAVA_BUCKET", new BazaarItem(bazaarObject.get("ENCHANTED_LAVA_BUCKET").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_PACKED_ICE", new BazaarItem(bazaarObject.get("ENCHANTED_PACKED_ICE").getAsJsonObject()));
		bazaarItemMap.put("PUFFERFISH", new BazaarItem(bazaarObject.get("RAW_FISH:3").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_PRISMARINE_SHARD", new BazaarItem(bazaarObject.get("ENCHANTED_PRISMARINE_SHARD").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_IRON_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_IRON_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("RECOMBOBULATOR_3000", new BazaarItem(bazaarObject.get("RECOMBOBULATOR_3000").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_CARROT_STICK", new BazaarItem(bazaarObject.get("ENCHANTED_CARROT_STICK").getAsJsonObject()));
		bazaarItemMap.put("BONE", new BazaarItem(bazaarObject.get("BONE").getAsJsonObject()));
		bazaarItemMap.put("CLOWNFISH", new BazaarItem(bazaarObject.get("RAW_FISH:2").getAsJsonObject()));
		bazaarItemMap.put("RAW_SALMON", new BazaarItem(bazaarObject.get("RAW_FISH:1").getAsJsonObject()));
		bazaarItemMap.put("REVENANT_FLESH", new BazaarItem(bazaarObject.get("REVENANT_FLESH").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_PORK", new BazaarItem(bazaarObject.get("ENCHANTED_PORK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_GLOWSTONE", new BazaarItem(bazaarObject.get("ENCHANTED_GLOWSTONE").getAsJsonObject()));
		bazaarItemMap.put("FEATHER", new BazaarItem(bazaarObject.get("FEATHER").getAsJsonObject()));
		bazaarItemMap.put("WHALE_BAIT", new BazaarItem(bazaarObject.get("WHALE_BAIT").getAsJsonObject()));
		bazaarItemMap.put("NETHERRACK", new BazaarItem(bazaarObject.get("NETHERRACK").getAsJsonObject()));
		bazaarItemMap.put("SPONGE", new BazaarItem(bazaarObject.get("SPONGE").getAsJsonObject()));
		bazaarItemMap.put("BLAZE_ROD", new BazaarItem(bazaarObject.get("BLAZE_ROD").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_DARK_OAK_LOG", new BazaarItem(bazaarObject.get("ENCHANTED_DARK_OAK_LOG").getAsJsonObject()));
		bazaarItemMap.put("YOUNG_FRAGMENT", new BazaarItem(bazaarObject.get("YOUNG_FRAGMENT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_CLOWNFISH", new BazaarItem(bazaarObject.get("ENCHANTED_CLOWNFISH").getAsJsonObject()));
		bazaarItemMap.put("REFINED_MINERAL", new BazaarItem(bazaarObject.get("REFINED_MINERAL").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_GOLD", new BazaarItem(bazaarObject.get("ENCHANTED_GOLD").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_RAW_CHICKEN", new BazaarItem(bazaarObject.get("ENCHANTED_RAW_CHICKEN").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_WATER_LILY", new BazaarItem(bazaarObject.get("ENCHANTED_WATER_LILY").getAsJsonObject()));
		bazaarItemMap.put("SPRUCE_WOOD", new BazaarItem(bazaarObject.get("LOG:1").getAsJsonObject()));
		bazaarItemMap.put("NULL_ATOM", new BazaarItem(bazaarObject.get("NULL_ATOM").getAsJsonObject()));
		bazaarItemMap.put("TITANIUM_ORE", new BazaarItem(bazaarObject.get("TITANIUM_ORE").getAsJsonObject()));
		bazaarItemMap.put("BLUE_SHARK_TOOTH", new BazaarItem(bazaarObject.get("BLUE_SHARK_TOOTH").getAsJsonObject()));
		bazaarItemMap.put("CATALYST", new BazaarItem(bazaarObject.get("CATALYST").getAsJsonObject()));
		bazaarItemMap.put("BIRCH_WOOD", new BazaarItem(bazaarObject.get("LOG:3").getAsJsonObject()));
		bazaarItemMap.put("JUNGLE_WOOD", new BazaarItem(bazaarObject.get("LOG:2").getAsJsonObject()));
		bazaarItemMap.put("BLESSED_BAIT", new BazaarItem(bazaarObject.get("BLESSED_BAIT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_GLOWSTONE_DUST", new BazaarItem(bazaarObject.get("ENCHANTED_GLOWSTONE_DUST").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_INK_SACK", new BazaarItem(bazaarObject.get("ENCHANTED_INK_SACK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_CACTUS", new BazaarItem(bazaarObject.get("ENCHANTED_CACTUS").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SUGAR_CANE", new BazaarItem(bazaarObject.get("ENCHANTED_SUGAR_CANE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_COOKED_SALMON", new BazaarItem(bazaarObject.get("ENCHANTED_COOKED_SALMON").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SEEDS", new BazaarItem(bazaarObject.get("ENCHANTED_SEEDS").getAsJsonObject()));
		bazaarItemMap.put("LOG", new BazaarItem(bazaarObject.get("LOG").getAsJsonObject()));
		bazaarItemMap.put("JACOBS_TICKET", new BazaarItem(bazaarObject.get("JACOBS_TICKET").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_BONE_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_BONE_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("GHAST_TEAR", new BazaarItem(bazaarObject.get("GHAST_TEAR").getAsJsonObject()));
		bazaarItemMap.put("ABSOLUTE_ENDER_PEARL", new BazaarItem(bazaarObject.get("ABSOLUTE_ENDER_PEARL").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_ENDER_PEARL", new BazaarItem(bazaarObject.get("ENCHANTED_ENDER_PEARL").getAsJsonObject()));
		bazaarItemMap.put("UNSTABLE_FRAGMENT", new BazaarItem(bazaarObject.get("UNSTABLE_FRAGMENT").getAsJsonObject()));
		bazaarItemMap.put("PURPLE_CANDY", new BazaarItem(bazaarObject.get("PURPLE_CANDY").getAsJsonObject()));
		bazaarItemMap.put("POLISHED_PUMPKIN", new BazaarItem(bazaarObject.get("POLISHED_PUMPKIN").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_FERMENTED_SPIDER_EYE", new BazaarItem(bazaarObject.get("ENCHANTED_FERMENTED_SPIDER_EYE").getAsJsonObject()));
		bazaarItemMap.put("SPIKED_BAIT", new BazaarItem(bazaarObject.get("SPIKED_BAIT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_GOLD_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_GOLD_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_JUNGLE_LOG", new BazaarItem(bazaarObject.get("ENCHANTED_JUNGLE_LOG").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_FLINT", new BazaarItem(bazaarObject.get("ENCHANTED_FLINT").getAsJsonObject()));
		bazaarItemMap.put("IRON_INGOT", new BazaarItem(bazaarObject.get("IRON_INGOT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_EMERALD_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_EMERALD_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("NULL_OVOID", new BazaarItem(bazaarObject.get("NULL_OVOID").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_CLAY_BALL", new BazaarItem(bazaarObject.get("ENCHANTED_CLAY_BALL").getAsJsonObject()));
		bazaarItemMap.put("GLOWSTONE_DUST", new BazaarItem(bazaarObject.get("GLOWSTONE_DUST").getAsJsonObject()));
		bazaarItemMap.put("GOLD_INGOT", new BazaarItem(bazaarObject.get("GOLD_INGOT").getAsJsonObject()));
		bazaarItemMap.put("REVENANT_VISCERA", new BazaarItem(bazaarObject.get("REVENANT_VISCERA").getAsJsonObject()));
		bazaarItemMap.put("TARANTULA_SILK", new BazaarItem(bazaarObject.get("TARANTULA_SILK").getAsJsonObject()));
		bazaarItemMap.put("TITANIC_EXP_BOTTLE", new BazaarItem(bazaarObject.get("TITANIC_EXP_BOTTLE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_MUTTON", new BazaarItem(bazaarObject.get("ENCHANTED_MUTTON").getAsJsonObject()));
		bazaarItemMap.put("NULL_SPHERE", new BazaarItem(bazaarObject.get("NULL_SPHERE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_IRON", new BazaarItem(bazaarObject.get("ENCHANTED_IRON").getAsJsonObject()));
		bazaarItemMap.put("SUPER_EGG", new BazaarItem(bazaarObject.get("SUPER_EGG").getAsJsonObject()));
		bazaarItemMap.put("SUPER_COMPACTOR_3000", new BazaarItem(bazaarObject.get("SUPER_COMPACTOR_3000").getAsJsonObject()));
		bazaarItemMap.put("STOCK_OF_STONKS", new BazaarItem(bazaarObject.get("STOCK_OF_STONKS").getAsJsonObject()));
		bazaarItemMap.put("MITHRIL_ORE", new BazaarItem(bazaarObject.get("MITHRIL_ORE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_HAY_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_HAY_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_PAPER", new BazaarItem(bazaarObject.get("ENCHANTED_PAPER").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_BONE", new BazaarItem(bazaarObject.get("ENCHANTED_BONE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_TITANIUM", new BazaarItem(bazaarObject.get("ENCHANTED_TITANIUM").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_DIAMOND_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_DIAMOND_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("SPOOKY_BAIT", new BazaarItem(bazaarObject.get("SPOOKY_BAIT").getAsJsonObject()));
		bazaarItemMap.put("SUPERIOR_FRAGMENT", new BazaarItem(bazaarObject.get("SUPERIOR_FRAGMENT").getAsJsonObject()));
		bazaarItemMap.put("MAGMA_BUCKET", new BazaarItem(bazaarObject.get("MAGMA_BUCKET").getAsJsonObject()));
		bazaarItemMap.put("EMERALD", new BazaarItem(bazaarObject.get("EMERALD").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_RABBIT_FOOT", new BazaarItem(bazaarObject.get("ENCHANTED_RABBIT_FOOT").getAsJsonObject()));
		bazaarItemMap.put("LIGHT_BAIT", new BazaarItem(bazaarObject.get("LIGHT_BAIT").getAsJsonObject()));
		bazaarItemMap.put("HOT_POTATO_BOOK", new BazaarItem(bazaarObject.get("HOT_POTATO_BOOK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_ICE", new BazaarItem(bazaarObject.get("ENCHANTED_ICE").getAsJsonObject()));
		bazaarItemMap.put("CLAY_BALL", new BazaarItem(bazaarObject.get("CLAY_BALL").getAsJsonObject()));
		bazaarItemMap.put("OLD_FRAGMENT", new BazaarItem(bazaarObject.get("OLD_FRAGMENT").getAsJsonObject()));
		bazaarItemMap.put("GREEN_GIFT", new BazaarItem(bazaarObject.get("GREEN_GIFT").getAsJsonObject()));
		bazaarItemMap.put("PACKED_ICE", new BazaarItem(bazaarObject.get("PACKED_ICE").getAsJsonObject()));
		bazaarItemMap.put("WATER_LILY", new BazaarItem(bazaarObject.get("WATER_LILY").getAsJsonObject()));
		bazaarItemMap.put("HAMSTER_WHEEL", new BazaarItem(bazaarObject.get("HAMSTER_WHEEL").getAsJsonObject()));
		bazaarItemMap.put("ACACIA_WOOD", new BazaarItem(bazaarObject.get("LOG_2").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_OBSIDIAN", new BazaarItem(bazaarObject.get("ENCHANTED_OBSIDIAN").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_COAL", new BazaarItem(bazaarObject.get("ENCHANTED_COAL").getAsJsonObject()));
		bazaarItemMap.put("COAL", new BazaarItem(bazaarObject.get("COAL").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_QUARTZ", new BazaarItem(bazaarObject.get("ENCHANTED_QUARTZ").getAsJsonObject()));
		bazaarItemMap.put("ENDER_PEARL", new BazaarItem(bazaarObject.get("ENDER_PEARL").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_COAL_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_COAL_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("WEREWOLF_SKIN", new BazaarItem(bazaarObject.get("WEREWOLF_SKIN").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_PRISMARINE_CRYSTALS", new BazaarItem(bazaarObject.get("ENCHANTED_PRISMARINE_CRYSTALS").getAsJsonObject()));
		bazaarItemMap.put("DAEDALUS_STICK", new BazaarItem(bazaarObject.get("DAEDALUS_STICK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_WET_SPONGE", new BazaarItem(bazaarObject.get("ENCHANTED_WET_SPONGE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_RAW_FISH", new BazaarItem(bazaarObject.get("ENCHANTED_RAW_FISH").getAsJsonObject()));
		bazaarItemMap.put("ENDER_STONE", new BazaarItem(bazaarObject.get("ENDER_STONE").getAsJsonObject()));
		bazaarItemMap.put("FOUL_FLESH", new BazaarItem(bazaarObject.get("FOUL_FLESH").getAsJsonObject()));
		bazaarItemMap.put("QUARTZ", new BazaarItem(bazaarObject.get("QUARTZ").getAsJsonObject()));
		bazaarItemMap.put("JERRY_BOX_PURPLE", new BazaarItem(bazaarObject.get("JERRY_BOX_PURPLE").getAsJsonObject()));
		bazaarItemMap.put("RAW_BEEF", new BazaarItem(bazaarObject.get("RAW_BEEF").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_EYE_OF_ENDER", new BazaarItem(bazaarObject.get("ENCHANTED_EYE_OF_ENDER").getAsJsonObject()));
		bazaarItemMap.put("ECTOPLASM", new BazaarItem(bazaarObject.get("ECTOPLASM").getAsJsonObject()));
		bazaarItemMap.put("SUGAR_CANE", new BazaarItem(bazaarObject.get("SUGAR_CANE").getAsJsonObject()));
		bazaarItemMap.put("MAGMA_CREAM", new BazaarItem(bazaarObject.get("MAGMA_CREAM").getAsJsonObject()));
		bazaarItemMap.put("SHARK_BAIT", new BazaarItem(bazaarObject.get("SHARK_BAIT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_MITHRIL", new BazaarItem(bazaarObject.get("ENCHANTED_MITHRIL").getAsJsonObject()));
		bazaarItemMap.put("RED_GIFT", new BazaarItem(bazaarObject.get("RED_GIFT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_RAW_BEEF", new BazaarItem(bazaarObject.get("ENCHANTED_RAW_BEEF").getAsJsonObject()));
		bazaarItemMap.put("JERRY_BOX_BLUE", new BazaarItem(bazaarObject.get("JERRY_BOX_BLUE").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_SLIME_BLOCK", new BazaarItem(bazaarObject.get("ENCHANTED_SLIME_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_FEATHER", new BazaarItem(bazaarObject.get("ENCHANTED_FEATHER").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_OAK_LOG", new BazaarItem(bazaarObject.get("ENCHANTED_OAK_LOG").getAsJsonObject()));
		bazaarItemMap.put("RABBIT_HIDE", new BazaarItem(bazaarObject.get("RABBIT_HIDE").getAsJsonObject()));
		bazaarItemMap.put("WHITE_GIFT", new BazaarItem(bazaarObject.get("WHITE_GIFT").getAsJsonObject()));
		bazaarItemMap.put("SULPHUR", new BazaarItem(bazaarObject.get("SULPHUR").getAsJsonObject()));
		bazaarItemMap.put("NETHER_STALK", new BazaarItem(bazaarObject.get("NETHER_STALK").getAsJsonObject()));
		bazaarItemMap.put("RABBIT", new BazaarItem(bazaarObject.get("RABBIT").getAsJsonObject()));
		bazaarItemMap.put("DARK_BAIT", new BazaarItem(bazaarObject.get("DARK_BAIT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_CARROT", new BazaarItem(bazaarObject.get("ENCHANTED_CARROT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_PUMPKIN", new BazaarItem(bazaarObject.get("ENCHANTED_PUMPKIN").getAsJsonObject()));
		bazaarItemMap.put("GRIFFIN_FEATHER", new BazaarItem(bazaarObject.get("GRIFFIN_FEATHER").getAsJsonObject()));
		bazaarItemMap.put("ROTTEN_FLESH", new BazaarItem(bazaarObject.get("ROTTEN_FLESH").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_COOKED_FISH", new BazaarItem(bazaarObject.get("ENCHANTED_COOKED_FISH").getAsJsonObject()));
		bazaarItemMap.put("OBSIDIAN", new BazaarItem(bazaarObject.get("OBSIDIAN").getAsJsonObject()));
		bazaarItemMap.put("SOULFLOW", new BazaarItem(bazaarObject.get("SOULFLOW").getAsJsonObject()));
		bazaarItemMap.put("MINNOW_BAIT", new BazaarItem(bazaarObject.get("MINNOW_BAIT").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_MAGMA_CREAM", new BazaarItem(bazaarObject.get("ENCHANTED_MAGMA_CREAM").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_FIREWORK_ROCKET", new BazaarItem(bazaarObject.get("ENCHANTED_FIREWORK_ROCKET").getAsJsonObject()));
		bazaarItemMap.put("STARFALL", new BazaarItem(bazaarObject.get("STARFALL").getAsJsonObject()));
		bazaarItemMap.put("LEATHER", new BazaarItem(bazaarObject.get("LEATHER").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_COOKED_MUTTON", new BazaarItem(bazaarObject.get("ENCHANTED_COOKED_MUTTON").getAsJsonObject()));
		bazaarItemMap.put("REFINED_TITANIUM", new BazaarItem(bazaarObject.get("REFINED_TITANIUM").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_RABBIT", new BazaarItem(bazaarObject.get("ENCHANTED_RABBIT").getAsJsonObject()));
		bazaarItemMap.put("MUTANT_NETHER_STALK", new BazaarItem(bazaarObject.get("MUTANT_NETHER_STALK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_BREAD", new BazaarItem(bazaarObject.get("ENCHANTED_BREAD").getAsJsonObject()));
		bazaarItemMap.put("FUMING_POTATO_BOOK", new BazaarItem(bazaarObject.get("FUMING_POTATO_BOOK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_CHARCOAL", new BazaarItem(bazaarObject.get("ENCHANTED_CHARCOAL").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_BLAZE_POWDER", new BazaarItem(bazaarObject.get("ENCHANTED_BLAZE_POWDER").getAsJsonObject()));
		bazaarItemMap.put("SUMMONING_EYE", new BazaarItem(bazaarObject.get("SUMMONING_EYE").getAsJsonObject()));
		bazaarItemMap.put("FISH_BAIT", new BazaarItem(bazaarObject.get("FISH_BAIT").getAsJsonObject()));
		bazaarItemMap.put("SNOW_BLOCK", new BazaarItem(bazaarObject.get("SNOW_BLOCK").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_BAKED_POTATO", new BazaarItem(bazaarObject.get("ENCHANTED_BAKED_POTATO").getAsJsonObject()));
		bazaarItemMap.put("COMPACTOR", new BazaarItem(bazaarObject.get("COMPACTOR").getAsJsonObject()));
		bazaarItemMap.put("ENCHANTED_DIAMOND", new BazaarItem(bazaarObject.get("ENCHANTED_DIAMOND").getAsJsonObject()));
		bazaarItemMap.put("BAZAAR_COOKIE", new BazaarItem(bazaarObject.get("BAZAAR_COOKIE").getAsJsonObject()));
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
	 * Get Bazaar items
	 */
	public Map<String, BazaarItem> getBazaarItemMap() {
		return bazaarItemMap;
	}

	/**
	 * Bazaar Item Data
	 * @author Kokhaviel
	 * @since 4.3
	 */
	public static class BazaarItem implements IBazaarItem {

		final String productId;
		final double sellPrice;
		final double buyPrice;

		public BazaarItem(JsonObject itemObject) {
			JsonObject object = itemObject.get("quick_status").getAsJsonObject();
			this.productId = object.get("productId").getAsString();
			this.sellPrice = object.get("sellPrice").getAsDouble();
			this.buyPrice = object.get("buyPrice").getAsDouble();
		}

		@Override
		public String getProductId() {
			return this.productId;
		}

		@Override
		public double getSellPrice() {
			return this.sellPrice;
		}

		@Override
		public double getBuyPrice() {
			return this.buyPrice;
		}
	}
}
