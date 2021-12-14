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

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import fr.kokhaviel.api.hypixel.util.exceptions.HypixelAPIException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Hypixel Skyblock Data
 * @author Kokhaviel
 * @since 4.4
 */
public class SkyblockProfiles {

	private interface ISkyblockProfile {
		String getProfileId();
		Member getMember(int index);
		String getName();
	}

	private interface ISkyblockMember {
		long getLastUpdate();
		long getFirstJoin();

		double getCoinPurse();

		long getCollectedFairySouls();
		long getFairySouls();
		long getFairyExchanges();

		long getLastDeath();
		int getDeaths();

		int getRuneCraftingExp();
		int getMiningExp();
		int getAlchemyExp();
		int getTamingExp();
		int getCombatExp();
		int getFarmingExp();
		int getEnchantingExp();
		int getFishingExp();
		int getForagingExp();

		Stats getStats();
		Objectives getObjectives();
		Quests getQuests();
		Minions getMinions();
		Visits getVisits();
		Pets getPets();
		Collections getCollections();
	}


	final Gson GSON = new Gson();
	final boolean success;
	final JsonArray profilesArray;

	public SkyblockProfiles(JsonObject profilesObject) {
		this.success = profilesObject.get("success").getAsBoolean();
		this.profilesArray = profilesObject.getAsJsonArray("profiles");
	}

	/**
	 * Get Success Status of the Request
	 * @return Success Status
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Skyblock Profile by Index
	 * @param profile Index of the Profile (Begin at 1)
	 * @return Requested Profile Data
	 */
	public Profile getProfile(int profile) {
		if(profile <= 0) throw new HypixelAPIException("Skyblock Profile Cannot Be Under 0, 1 is Minimum");
		if(profile > profilesArray.size() + 1) throw new HypixelAPIException("There Are Only " + profilesArray.size() + 1 + " Skyblock Profiles on this Account");
		return new Profile(profilesArray.get(profile - 1).getAsJsonObject());
	}

	/**
	 * Skyblock Profile Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Profile implements ISkyblockProfile {

		final Gson GSON = new Gson();
		final String profileId;
		final JsonObject membersObject;
		final List<Member> members = new ArrayList<>();
		final String name;

		public Profile(JsonObject profileObject) {
			this.profileId = profileObject.get("profile_id").getAsString();
			this.membersObject = profileObject.getAsJsonObject("members");
			this.name = profileObject.get("cute_name").getAsString();
			addMembers();
		}

		public List<String> membersList;

		void addMembers() {
			membersList = membersObject.entrySet()
					.stream()
					.map(Map.Entry::getKey)
					.collect(Collectors.toCollection(ArrayList::new));

			membersList.forEach(member -> members.add(new Member(membersObject.get(member).getAsJsonObject())));
		}

		/**
		 * Get Skyblock Profile ID
		 */
		@Override
		public String getProfileId() {
			return this.profileId;
		}

		/**
		 * Get Skyblock Profile Member by Index
		 * @param index Index of the Member (Begin at 1)
		 * @return Requested Member Data
		 */
		@Override
		public Member getMember(int index) {
			if(index <= 0) throw new HypixelAPIException("Index Cannot Be 0, 1 is Minimum");
			if(index > members.size() + 1) throw new HypixelAPIException("The Are Only " + members.size() + 1 + " Members");
			return members.get(index - 1);
		}

		/**
		 * Get Profile Cute Name
		 */
		@Override
		public String getName() {
			return this.name;
		}
	}

	/**
	 * Skyblock Member Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Member implements ISkyblockMember {

		final Gson GSON = new Gson();
		final JsonObject memberObject;
		final long lastUpdate;
		final long firstJoin;
		final double coinPurse;
		final int collectedFairySouls;
		final int fairySouls;
		final int fairyExchanges;
		final long lastDeath;
		final int deaths;
		final int runeCraftingExp;
		final int miningExp;
		final int alchemyExp;
		final int tamingExp;
		final int combatExp;
		final int farmingExp;
		final int enchantingExp;
		final int fishingExp;
		final int foragingExp;
		final Objectives objectives;
		final Quests quests;
		final Minions minions;
		final Visits visits;
		final Pets pets;
		final Collections collections;

		public Member(JsonObject memberObject) {
			this.memberObject = memberObject;

			this.lastUpdate = memberObject.get("last_save").getAsLong();
			this.firstJoin = memberObject.get("first_join").getAsLong();
			this.coinPurse = memberObject.get("coin_purse").getAsDouble();
			this.collectedFairySouls = memberObject.get("fairy_souls_collected").getAsInt();
			this.fairySouls = memberObject.get("fairy_souls").getAsInt();
			this.fairyExchanges = memberObject.get("fairy_exchanges").getAsInt();
			this.lastDeath = memberObject.get("last_death").getAsLong();
			this.deaths = memberObject.get("death_count").getAsInt();
			this.runeCraftingExp = memberObject.get("experience_skill_runecrafting").getAsInt();
			this.miningExp = memberObject.get("experience_skill_mining").getAsInt();
			this.alchemyExp = memberObject.get("experience_skill_alchemy").getAsInt();
			this.tamingExp = memberObject.get("experience_skill_taming").getAsInt();
			this.combatExp = memberObject.get("experience_skill_combat").getAsInt();
			this.farmingExp = memberObject.get("experience_skill_farming").getAsInt();
			this.enchantingExp = memberObject.get("experience_skill_enchanting").getAsInt();
			this.fishingExp = memberObject.get("experience_skill_fishing").getAsInt();
			this.foragingExp = memberObject.get("experience_skill_foraging").getAsInt();

			this.objectives = new Objectives(memberObject.getAsJsonObject("objectives"));
			this.quests = new Quests(memberObject.getAsJsonObject("quests"));
			this.minions = new Minions(memberObject.getAsJsonArray("crafted_generators"));
			this.visits = new Visits(memberObject.getAsJsonArray("visited_zones"));
			this.pets = new Pets(memberObject.getAsJsonArray("pets"));
			this.collections = new Collections(memberObject.getAsJsonObject("collection"));
		}

		/**
		 * Get Last Data Update Timestamp
		 */
		@Override
		public long getLastUpdate() {
			return this.lastUpdate;
		}

		/**
		 * Get First Skyblock Join Timestamp
		 */
		@Override
		public long getFirstJoin() {
			return this.firstJoin;
		}

		/**
		 * Get Current Coin Purse of the Player
		 */
		@Override
		public double getCoinPurse() {
			return this.coinPurse;
		}

		/**
		 * Get Total Fairy Souls of the Player
		 */
		@Override
		public long getCollectedFairySouls() {
			return this.collectedFairySouls;
		}

		/**
		 * Get Fairy Souls of the Player
		 */
		@Override
		public long getFairySouls() {
			return this.fairySouls;
		}

		/**
		 * Get Fairy Souls Exchanges of the Player
		 */
		@Override
		public long getFairyExchanges() {
			return this.fairyExchanges;
		}

		/**
		 * Get Last Death Timestamp
		 */
		@Override
		public long getLastDeath() {
			return this.lastDeath;
		}

		/**
		 * Get Total Deaths of the Player
		 */
		@Override
		public int getDeaths() {
			return this.deaths;
		}

		/**
		 * Get Runecrafting Experience of the Player
		 */
		@Override
		public int getRuneCraftingExp() {
			return this.runeCraftingExp;
		}

		/**
		 * Get Mining Experience of the Player
		 */
		@Override
		public int getMiningExp() {
			return this.miningExp;
		}

		/**
		 * Get Alchemy Experience of the Player
		 */
		@Override
		public int getAlchemyExp() {
			return this.alchemyExp;
		}

		/**
		 * Get Taming Experience of the Player
		 */
		@Override
		public int getTamingExp() {
			return this.tamingExp;
		}

		/**
		 * Get Combat Experience of the Player
		 */
		@Override
		public int getCombatExp() {
			return this.combatExp;
		}

		/**
		 * Get Farming Experience of the Player
		 */
		@Override
		public int getFarmingExp() {
			return this.farmingExp;
		}

		/**
		 * Get Enchanting Experience of the Player
		 */
		@Override
		public int getEnchantingExp() {
			return this.enchantingExp;
		}

		/**
		 * Get Fishing Experience of the Player
		 */
		@Override
		public int getFishingExp() {
			return this.fishingExp;
		}

		/**
		 * Get Foraging Experience of the Player
		 */
		@Override
		public int getForagingExp() {
			return this.foragingExp;
		}

		/**
		 * Get Member Stats
		 */
		@Override
		public Stats getStats() {
			return GSON.fromJson(memberObject.getAsJsonObject("stats"), Stats.class);
		}

		/**
		 * Get Member Objectives Data
		 */
		@Override
		public Objectives getObjectives() {
			return this.objectives;
		}

		/**
		 * Get Member Quests Data
		 */
		@Override
		public Quests getQuests() {
			return this.quests;
		}

		/**
		 * Get Member Minions Data
		 */
		@Override
		public Minions getMinions() {
			return this.minions;
		}

		/**
		 * Get Member Visits Data
		 */
		@Override
		public Visits getVisits() {
			return this.visits;
		}

		/**
		 * Get Member Pets Data
		 */
		@Override
		public Pets getPets() {
			return this.pets;
		}

		/**
		 * Get Member Collections Data
		 */
		@Override
		public Collections getCollections() {
			return this.collections;
		}
	}

	/**
	 * Skyblock Member Stats 
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Stats {


		@SerializedName("deaths")
		int deaths = 0;

		@SerializedName("deaths_fire")
		int fireDeaths = 0;

		@SerializedName("deaths_fall")
		int fallDeaths = 0;

		@SerializedName("deaths_void")
		int voidDeaths = 0;

		@SerializedName("deaths_skeleton")
		int skeletonDeaths = 0;

		@SerializedName("deaths_magma_cube")
		int magmaCubesDeaths = 0;

		@SerializedName("deaths_spider")
		int spiderDeaths = 0;

		@SerializedName("deaths_lapis_zombie")
		int lapisZombiesDeaths = 0;

		@SerializedName("deaths_emerald_slime")
		int slimeDeaths = 0;

		@SerializedName("deaths_diamond_zombie")
		int diamondZombiesDeaths = 0;

		@SerializedName("deaths_diamond_skeleton")
		int diamondSkeletonDeaths = 0;

		@SerializedName("deaths_wither_skeleton")
		int witherSkeletonDeaths = 0;

		@SerializedName("deaths_spider_jockey")
		int jockeySpiderDeaths = 0;

		@SerializedName("deaths_blaze")
		int blazeDeaths = 0;

		@SerializedName("deaths_pigman")
		int pigmanDeaths = 0;

		@SerializedName("deaths_enderman")
		int endermanDeaths = 0;

		@SerializedName("deaths_zombie")
		int zombieDeaths = 0;

		@SerializedName("deaths_player")
		int playerDeaths = 0;


		@SerializedName("kills")
		int kills = 0;

		@SerializedName("kills_enderman")
		int endermanKills = 0;

		@SerializedName("kills_spider")
		int spiderKills = 0;

		@SerializedName("kills_weaver_spider")
		int weaverSpiderKills = 0;

		@SerializedName("kills_dasher_spider")
		int dasherSpiderKills = 0;

		@SerializedName("kills_spider_jockey")
		int jockeySpiderKills = 0;

		@SerializedName("kills_splitter_spider")
		int splitterSpiderKills = 0;

		@SerializedName("kills_voracious_spider")
		int voraciousSpiderKills = 0;

		@SerializedName("kills_skeleton")
		int skeletonKills = 0;

		@SerializedName("kills_zombie")
		int zombiesKills = 0;

		@SerializedName("kills_lapis_zombie")
		int lapisZombiesKills = 0;

		@SerializedName("kills_diamond_zombie")
		int diamondZombiesKills = 0;

		@SerializedName("kills_diamond_skeleton")
		int diamondSkeletonKills = 0;

		@SerializedName("kills_jockey_skeleton")
		int jockeySkeletonKills = 0;

		@SerializedName("kills_wither_skeleton")
		int witherSkeletonKills = 0;

		@SerializedName("kills_blaze")
		int blazeKills = 0;

		@SerializedName("kills_magma_cube")
		int magmaCubeKills = 0;

		@SerializedName("kills_ghast")
		int ghastKills = 0;

		@SerializedName("kills_cow")
		int cowKills = 0;

		@SerializedName("kills_pig")
		int pigKills = 0;

		@SerializedName("kills_sheep")
		int sheepKills = 0;

		@SerializedName("kills_rabbit")
		int rabbitKills = 0;

		@SerializedName("kills_sea_walker")
		int seaWalkerKills = 0;

		@SerializedName("kills_old_wolf")
		int oldWolfsKills = 0;

		@SerializedName("kills_witch")
		int witchKills = 0;

		@SerializedName("kills_slime")
		int slimeKills = 0;

		@SerializedName("kills_pigman")
		int pigmanKills = 0;

		@SerializedName("kills_sea_archer")
		int seaArcherKills = 0;

		@SerializedName("kills_sea_guardian")
		int seaGuardianKills = 0;

		@SerializedName("kills_chicken")
		int chickenKills = 0;

		@SerializedName("kills_player")
		int playerKills = 0;


		@SerializedName("highest_critical_damage")
		double highestDamageGiven;


		@SerializedName("auctions_created")
		int auctionsCreated = 0;

		@SerializedName("auctions_fees")
		int auctionFees = 0;

		@SerializedName("auctions_completed")
		int auctionsCompleted = 0;

		@SerializedName("auctions_gold_earned")
		int auctionsGoldEarned = 0;

		@SerializedName("auctions_gold_spent")
		int auctionGoldSpent = 0;

		@SerializedName("auctions_won")
		int auctionWon = 0;


		@SerializedName("items_fished")
		int itemsFished = 0;

		@SerializedName("items_fished_treasure")
		int treasuresFished = 0;


		@SerializedName("end_race_best_time")
		int bestTimeEndRace = 0;


		@SerializedName("gifts_given")
		int giftsGiven = 0;

		@SerializedName("gifts_received")
		int giftsReceived = 0;


		/**
		 * Get Total Deaths of the Player
		 */
		public int getDeaths() {
			return deaths;
		}

		/**
		 * Get Fire Deaths of the Player
		 */
		public int getFireDeaths() {
			return fireDeaths;
		}

		/**
		 * Get Fall Deaths of the Player
		 */
		public int getFallDeaths() {
			return fallDeaths;
		}

		/**
		 * Get Void Deaths of the Player
		 */
		public int getVoidDeaths() {
			return voidDeaths;
		}

		/**
		 * Get Skeleton Deaths of the Player
		 */
		public int getSkeletonDeaths() {
			return skeletonDeaths;
		}

		/**
		 * Get Magma Cubes Deaths of the Player
		 */
		public int getMagmaCubesDeaths() {
			return magmaCubesDeaths;
		}

		/**
		 * Get Spider Deaths of the Player
		 */
		public int getSpiderDeaths() {
			return spiderDeaths;
		}

		/**
		 * Get Lapis Zombies Deaths of the Player
		 */
		public int getLapisZombiesDeaths() {
			return lapisZombiesDeaths;
		}

		/**
		 * Get Slime Deaths of the Player
		 */
		public int getSlimeDeaths() {
			return slimeDeaths;
		}

		/**
		 * Get Diamond Zombies Deaths of the Player
		 */
		public int getDiamondZombiesDeaths() {
			return diamondZombiesDeaths;
		}

		/**
		 * Get Diamond Skeleton Deaths of the Player
		 */
		public int getDiamondSkeletonDeaths() {
			return diamondSkeletonDeaths;
		}

		/**
		 * Get Wither Skeleton Deaths of the Player
		 */
		public int getWitherSkeletonDeaths() {
			return witherSkeletonDeaths;
		}

		/**
		 * Get Jockey Spider Deaths of the Player
		 */
		public int getJockeySpiderDeaths() {
			return jockeySpiderDeaths;
		}

		/**
		 * Get Blaze Deaths of the Player
		 */
		public int getBlazeDeaths() {
			return blazeDeaths;
		}

		/**
		 * Get Pigman Deaths of the Player
		 */
		public int getPigmanDeaths() {
			return pigmanDeaths;
		}

		/**
		 * Get Enderman Deaths of the Player
		 */
		public int getEndermanDeaths() {
			return endermanDeaths;
		}

		/**
		 * Get Zombies Deaths of the Player
		 */
		public int getZombieDeaths() {
			return zombieDeaths;
		}

		/**
		 * Get Player Deaths of the Player
		 */
		public int getPlayerDeaths() {
			return playerDeaths;
		}

		/**
		 * Get Total Kills of the Player
		 */
		public int getKills() {
			return kills;
		}

		/**
		 * Get Enderman Kills of the Player
		 */
		public int getEndermanKills() {
			return endermanKills;
		}

		/**
		 * Get Spider Kills of the Player
		 */
		public int getSpiderKills() {
			return spiderKills;
		}

		/**
		 * Get Weaver Spider Kills of the Player
		 */
		public int getWeaverSpiderKills() {
			return weaverSpiderKills;
		}

		/**
		 * Get Dasher Spider Kills of the Player
		 */
		public int getDasherSpiderKills() {
			return dasherSpiderKills;
		}

		/**
		 * Get Jockey Spider Kills of the Player
		 */
		public int getJockeySpiderKills() {
			return jockeySpiderKills;
		}

		/**
		 * Get Splitter Spider Kills of the Player
		 */
		public int getSplitterSpiderKills() {
			return splitterSpiderKills;
		}

		/**
		 * Get Voracious Spider Kills of the Player
		 */
		public int getVoraciousSpiderKills() {
			return voraciousSpiderKills;
		}

		/**
		 * Get Skeleton Kills of the Player
		 */
		public int getSkeletonKills() {
			return skeletonKills;
		}

		/**
		 * Get Zombies Kills of the Player
		 */
		public int getZombiesKills() {
			return zombiesKills;
		}

		/**
		 * Get Lapis Zombies Kills of the Player
		 */
		public int getLapisZombiesKills() {
			return lapisZombiesKills;
		}

		/**
		 * Get Diamond Zombies Kills of the player
		 */
		public int getDiamondZombiesKills() {
			return diamondZombiesKills;
		}

		/**
		 * Get Diamond Skeleton Kills of the Player
		 */
		public int getDiamondSkeletonKills() {
			return diamondSkeletonKills;
		}

		/**
		 * Get Jockey Skeleton Kills of the pLayer
		 */
		public int getJockeySkeletonKills() {
			return jockeySkeletonKills;
		}

		/**
		 * Get Wither Skeleton Kills of the Player
		 */
		public int getWitherSkeletonKills() {
			return witherSkeletonKills;
		}

		/**
		 * Get Blaze Kills of the Player
		 */
		public int getBlazeKills() {
			return blazeKills;
		}

		/**
		 * Get Magma Cube Kills of the Player
		 */
		public int getMagmaCubeKills() {
			return magmaCubeKills;
		}

		/**
		 * Get Ghast Kills of the Player
		 */
		public int getGhastKills() {
			return ghastKills;
		}

		/**
		 * Get Cow Kills of the Player
		 */
		public int getCowKills() {
			return cowKills;
		}

		/**
		 * Get Pig Kills of the pLayer
		 */
		public int getPigKills() {
			return pigKills;
		}

		/**
		 * Get SHeep Kills of the Player
		 */
		public int getSheepKills() {
			return sheepKills;
		}

		/**
		 * Get Rabbit Kills of the Player
		 */
		public int getRabbitKills() {
			return rabbitKills;
		}

		/**
		 * get Sea Walker Kills of the Player
		 */
		public int getSeaWalkerKills() {
			return seaWalkerKills;
		}

		/**
		 * Get Old Wolfs Kills of the Player
		 */
		public int getOldWolfsKills() {
			return oldWolfsKills;
		}

		/**
		 * Get Witch Kills of the Player
		 */
		public int getWitchKills() {
			return witchKills;
		}

		/**
		 * Get Slime Kills of the Player
		 */
		public int getSlimeKills() {
			return slimeKills;
		}

		/**
		 * Get Pigman Kills of the player
		 */
		public int getPigmanKills() {
			return pigmanKills;
		}

		/**
		 * Get Sea Archer Kills of the Player
		 */
		public int getSeaArcherKills() {
			return seaArcherKills;
		}

		/**
		 * Get Sea Guardian Kills of the Player
		 */
		public int getSeaGuardianKills() {
			return seaGuardianKills;
		}

		/**
		 * Get Chicken Kills of the Player
		 */
		public int getChickenKills() {
			return chickenKills;
		}

		/**
		 * Get Player Kills of the Player
		 */
		public int getPlayerKills() {
			return playerKills;
		}

		/**
		 * Get Highest Damage Given by the Player
		 */
		public double getHighestDamageGiven() {
			return highestDamageGiven;
		}

		/**
		 * Get Total Auctions Created by the Player
		 */
		public int getAuctionsCreated() {
			return auctionsCreated;
		}

		/**
		 * Get Total Auctions Fees of the Player
		 */
		public int getAuctionFees() {
			return auctionFees;
		}

		/**
		 * Get Total Auctions Completed by the Player
		 */
		public int getAuctionsCompleted() {
			return auctionsCompleted;
		}

		/**
		 * Get Total Auctions Gold Earned by the Player
		 */
		public int getAuctionsGoldEarned() {
			return auctionsGoldEarned;
		}

		/**
		 * Get Total Auctions Gold Spent by the player
		 */
		public int getAuctionGoldSpent() {
			return auctionGoldSpent;
		}

		/**
		 * Get Total Auctions Won by the Player
		 */
		public int getAuctionWon() {
			return auctionWon;
		}

		/**
		 * Get Total Items Fished by the Player
		 */
		public int getItemsFished() {
			return itemsFished;
		}

		/**
		 * Get Total Treasures Fished by the Player
		 */
		public int getTreasuresFished() {
			return treasuresFished;
		}

		/**
		 * Get End Race Best Time of the Player
		 */
		public int getBestTimeEndRace() {
			return bestTimeEndRace;
		}

		/**
		 * Get Total Gifts Given by the Player
		 */
		public int getGiftsGiven() {
			return giftsGiven;
		}

		/**
		 * Get Total Gifts Received by the Player
		 */
		public int getGiftsReceived() {
			return giftsReceived;
		}
	}

	/**
	 * Member Objectives Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Objectives {

		final Gson GSON = new Gson();
		final JsonObject objectivesObject;
		final Map<String, Objective> objectivesMap = new HashMap<>();

		public Objectives(JsonObject objectivesObject) {
			this.objectivesObject = objectivesObject;
			putObjectivesData();
		}

		void putObjectivesData() {
			objectivesMap.put("COLLECT_LOG", GSON.fromJson(objectivesObject.get("collect_log").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_GUIDE", GSON.fromJson(objectivesObject.get("talk_to_guide").getAsJsonObject(), Objective.class));
			objectivesMap.put("PUBLIC_ISLAND", GSON.fromJson(objectivesObject.get("public_island").getAsJsonObject(), Objective.class));
			objectivesMap.put("CRAFT_WORKBENCH", GSON.fromJson(objectivesObject.get("craft_workbench").getAsJsonObject(), Objective.class));
			objectivesMap.put("CRAFT_WOOD_PICKAXE", GSON.fromJson(objectivesObject.get("craft_wood_pickaxe").getAsJsonObject(), Objective.class));
			objectivesMap.put("EXPLORE_HUB", GSON.fromJson(objectivesObject.get("explore_hub").getAsJsonObject(), Objective.class));
			objectivesMap.put("EXPLORE_VILLAGE", GSON.fromJson(objectivesObject.get("explore_village").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_LIBRARIAN", GSON.fromJson(objectivesObject.get("talk_to_librarian").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_FARMER", GSON.fromJson(objectivesObject.get("talk_to_farmer").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_BLACKSMITH", GSON.fromJson(objectivesObject.get("talk_to_blacksmith").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_LUMBERJACK", GSON.fromJson(objectivesObject.get("talk_to_lumberjack").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_EVENT_MASTER", GSON.fromJson(objectivesObject.get("talk_to_event_master").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_AUCTION_MASTER", GSON.fromJson(objectivesObject.get("talk_to_auction_master").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_BANKER", GSON.fromJson(objectivesObject.get("talk_to_banker").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_FAIRY", GSON.fromJson(objectivesObject.get("talk_to_fairy").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_FISHERMAN", GSON.fromJson(objectivesObject.get("talk_to_fisherman_1").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_CARPENTER", GSON.fromJson(objectivesObject.get("talk_to_carpenter").getAsJsonObject(), Objective.class));
			objectivesMap.put("PAINT_CANVAS", GSON.fromJson(objectivesObject.get("paint_canvas").getAsJsonObject(), Objective.class));
			objectivesMap.put("CHOP_TREE", GSON.fromJson(objectivesObject.get("chop_tree").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_LUMBERJACK_2", GSON.fromJson(objectivesObject.get("talk_to_lumberjack_2").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_FARMHAND", GSON.fromJson(objectivesObject.get("talk_to_farmhand_1").getAsJsonObject(), Objective.class));
			objectivesMap.put("FARMING_SKILL_5", GSON.fromJson(objectivesObject.get("increase_farming_skill_5").getAsJsonObject(), Objective.class));
			objectivesMap.put("WARP_MUSHROOM_DESERT", GSON.fromJson(objectivesObject.get("warp_mushroom_desert").getAsJsonObject(), Objective.class));
			objectivesMap.put("WHEAT", GSON.fromJson(objectivesObject.get("collect_wheat").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_FARMER_2", GSON.fromJson(objectivesObject.get("talk_to_farmer_2").getAsJsonObject(), Objective.class));
			objectivesMap.put("FARMING_RESOURCES", GSON.fromJson(objectivesObject.get("collect_farming_resources_2").getAsJsonObject(), Objective.class));
			objectivesMap.put("DEPOSIT_COINS", GSON.fromJson(objectivesObject.get("deposit_coins").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_LAZY_MINER", GSON.fromJson(objectivesObject.get("talk_to_lazy_miner").getAsJsonObject(), Objective.class));
			objectivesMap.put("MINING_SKILL_5", GSON.fromJson(objectivesObject.get("increase_mining_skill_5").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_TELEKINESIS_APPLIER", GSON.fromJson(objectivesObject.get("talk_to_telekinesis_applier").getAsJsonObject(), Objective.class));
			objectivesMap.put("FIND_PICKAXE", GSON.fromJson(objectivesObject.get("find_pickaxe").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_INGOTS", GSON.fromJson(objectivesObject.get("collect_ingots").getAsJsonObject(), Objective.class));
			objectivesMap.put("FORAGING_SKILL", GSON.fromJson(objectivesObject.get("increase_foraging_skill_5").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_GUSTAVE", GSON.fromJson(objectivesObject.get("talk_to_gustave_1").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_DARK_OAK_WOOD", GSON.fromJson(objectivesObject.get("collect_dark_oak_logs").getAsJsonObject(), Objective.class));
			objectivesMap.put("WOODS_RACE", GSON.fromJson(objectivesObject.get("complete_the_woods_race_1").getAsJsonObject(), Objective.class));
			objectivesMap.put("FARM_ANIMAL_RESOURCES", GSON.fromJson(objectivesObject.get("collect_farm_animal_resources_2").getAsJsonObject(), Objective.class));
			objectivesMap.put("WARP_DEEP_CAVERNS", GSON.fromJson(objectivesObject.get("warp_deep_caverns").getAsJsonObject(), Objective.class));
			objectivesMap.put("KILL_DANGER_MOBS", GSON.fromJson(objectivesObject.get("kill_danger_mobs").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_PET_COLLECTOR", GSON.fromJson(objectivesObject.get("talk_to_pet_collector").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_PET_SITTER", GSON.fromJson(objectivesObject.get("talk_to_pet_sitter").getAsJsonObject(), Objective.class));
			objectivesMap.put("MINE_COAL", GSON.fromJson(objectivesObject.get("mine_coal").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_BLACKSMITH_2", GSON.fromJson(objectivesObject.get("talk_to_blacksmith_2").getAsJsonObject(), Objective.class));
			objectivesMap.put("MINING_SKILL", GSON.fromJson(objectivesObject.get("increase_mining_skill").getAsJsonObject(), Objective.class));
			objectivesMap.put("REFORGE_ITEM", GSON.fromJson(objectivesObject.get("reforge_item").getAsJsonObject(), Objective.class));
			objectivesMap.put("WARP_GOLD_MINE", GSON.fromJson(objectivesObject.get("warp_gold_mine").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_BARTENDER", GSON.fromJson(objectivesObject.get("talk_to_bartender").getAsJsonObject(), Objective.class));
			objectivesMap.put("WHEAT_MINION", GSON.fromJson(objectivesObject.get("craft_wheat_minion").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_LAPIS_MINER", GSON.fromJson(objectivesObject.get("talk_to_lapis_miner").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_LIFT_OPERATOR", GSON.fromJson(objectivesObject.get("talk_to_lift_operator").getAsJsonObject(), Objective.class));
			objectivesMap.put("REACH_LAPIS_QUARRY", GSON.fromJson(objectivesObject.get("reach_lapis_quarry").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_LAPIS", GSON.fromJson(objectivesObject.get("collect_lapis").getAsJsonObject(), Objective.class));
			objectivesMap.put("PICKAXE_LAPIS_MINER", GSON.fromJson(objectivesObject.get("give_pickaxe_lapis_miner").getAsJsonObject(), Objective.class));
			objectivesMap.put("ENCHANT_ITEM", GSON.fromJson(objectivesObject.get("enchant_item").getAsJsonObject(), Objective.class));
			objectivesMap.put("REACH_PIGMENS_DEN", GSON.fromJson(objectivesObject.get("reach_pigmens_den").getAsJsonObject(), Objective.class));
			objectivesMap.put("COMBAT_SKILL", GSON.fromJson(objectivesObject.get("increase_combat_skill").getAsJsonObject(), Objective.class));
			objectivesMap.put("WARP_SPIDER_DEN", GSON.fromJson(objectivesObject.get("warp_spiders_den").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_FROSTY", GSON.fromJson(objectivesObject.get("talk_to_frosty").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_GULLIVER", GSON.fromJson(objectivesObject.get("talk_to_gulliver_1").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_GULLIVER_2", GSON.fromJson(objectivesObject.get("talk_to_gulliver_2").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_GULLIVER_3", GSON.fromJson(objectivesObject.get("talk_to_gulliver_3").getAsJsonObject(), Objective.class));
			objectivesMap.put("COMBAT_SKILL_5", GSON.fromJson(objectivesObject.get("increase_combat_skill_5").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_RICK", GSON.fromJson(objectivesObject.get("talk_to_rick").getAsJsonObject(), Objective.class));
			objectivesMap.put("WARP_THE_END", GSON.fromJson(objectivesObject.get("warp_the_end").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_HAYMITCH", GSON.fromJson(objectivesObject.get("talk_to_haymitch").getAsJsonObject(), Objective.class));
			objectivesMap.put("WARP_BLAZING_FORTRESS", GSON.fromJson(objectivesObject.get("warp_blazing_fortress").getAsJsonObject(), Objective.class));
			objectivesMap.put("WOOL_CARPENTER", GSON.fromJson(objectivesObject.get("collect_wool_carpenter").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_REDSTONE", GSON.fromJson(objectivesObject.get("collect_redstone").getAsJsonObject(), Objective.class));
			objectivesMap.put("REACH_SLIME_HILL", GSON.fromJson(objectivesObject.get("reach_slimehill").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_EMERALD", GSON.fromJson(objectivesObject.get("collect_emerald").getAsJsonObject(), Objective.class));
			objectivesMap.put("REACH_DIAMOND_RESERVE", GSON.fromJson(objectivesObject.get("reach_diamond_reserve").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_DIAMOND", GSON.fromJson(objectivesObject.get("collect_diamond").getAsJsonObject(), Objective.class));
			objectivesMap.put("REACH_OBSIDIAN_SANCTUARY", GSON.fromJson(objectivesObject.get("reach_obsidian_sanctuary").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_OBSIDIAN", GSON.fromJson(objectivesObject.get("collect_obsidian").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_RHYS", GSON.fromJson(objectivesObject.get("talk_to_rhys").getAsJsonObject(), Objective.class));
			objectivesMap.put("MINING_SKILL_12", GSON.fromJson(objectivesObject.get("increase_mining_12").getAsJsonObject(), Objective.class));
			objectivesMap.put("HOTM_GIVE_MATERIALS", GSON.fromJson(objectivesObject.get("hotm_give_materials").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_SPIDER", GSON.fromJson(objectivesObject.get("collect_spider").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_ELLE", GSON.fromJson(objectivesObject.get("talk_to_elle").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_NETHER_RESOURCES", GSON.fromJson(objectivesObject.get("collect_nether_resources").getAsJsonObject(), Objective.class));
			objectivesMap.put("CHICKEN_RACE", GSON.fromJson(objectivesObject.get("complete_the_chicken_race_1").getAsJsonObject(), Objective.class));
			objectivesMap.put("CHICKEN_RACE_2", GSON.fromJson(objectivesObject.get("complete_the_chicken_race_2").getAsJsonObject(), Objective.class));
			objectivesMap.put("CHICKEN_RACE_3", GSON.fromJson(objectivesObject.get("complete_the_chicken_race_3").getAsJsonObject(), Objective.class));
			objectivesMap.put("GIVE_FAIRY_SOULS", GSON.fromJson(objectivesObject.get("give_fairy_souls").getAsJsonObject(), Objective.class));
			objectivesMap.put("GIVE_RICK_INGOTS", GSON.fromJson(objectivesObject.get("give_rick_ingots").getAsJsonObject(), Objective.class));
			objectivesMap.put("COLLECT_CLAY", GSON.fromJson(objectivesObject.get("collect_clay").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_GUILDFORD", GSON.fromJson(objectivesObject.get("talk_to_guildford_1").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_ARCHAEOLOGIST", GSON.fromJson(objectivesObject.get("talk_to_archaeologist").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_SHAGGY", GSON.fromJson(objectivesObject.get("talk_to_shaggy").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_GUBER", GSON.fromJson(objectivesObject.get("talk_to_guber_1").getAsJsonObject(), Objective.class));
			objectivesMap.put("TALK_TO_END_DEALER", GSON.fromJson(objectivesObject.get("talk_to_end_dealer").getAsJsonObject(), Objective.class));
		}

		/**
		 * Get Objectives
		 */
		public Map<String, Objective> getObjectivesMap() {
			return objectivesMap;
		}
	}

	/**
	 * Objective Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Objective {

		@SerializedName("status")
		String status = "";

		@SerializedName("completed_at")
		long completed = 0;

		/**
		 * Get Objective Status
		 */
		public String getStatus() {
			return status;
		}

		/**
		 * Get 'Completed at' Timestamp
		 */
		public long getCompleted() {
			return completed;
		}
	}

	/**
	 * Member Quests Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Quests {

		final Gson GSON = new Gson();
		final JsonObject questsObject;
		final Map<String, Quest> questsMap = new HashMap<>();

		public Quests(JsonObject questsObject) {
			this.questsObject = questsObject;
			putQuestsData();
		}

		void putQuestsData() {
			questsMap.put("COLLECT_LOG", GSON.fromJson(questsObject.get("collect_log").getAsJsonObject(), Quest.class));
			questsMap.put("EXPLORE_HUB", GSON.fromJson(questsObject.get("explore_hub").getAsJsonObject(), Quest.class));
			questsMap.put("EXPLORE_VILLAGE", GSON.fromJson(questsObject.get("explore_village").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_LIBRARIAN", GSON.fromJson(questsObject.get("talk_to_librarian").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_FARMER", GSON.fromJson(questsObject.get("talk_to_farmer").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_BLACKSMITH", GSON.fromJson(questsObject.get("talk_to_blacksmith").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_LUMBERJACK", GSON.fromJson(questsObject.get("talk_to_lumberjack").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_AUCTION_MASTER", GSON.fromJson(questsObject.get("talk_to_auction_master").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_BANKER", GSON.fromJson(questsObject.get("talk_to_banker").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_CARPENTER", GSON.fromJson(questsObject.get("talk_to_carpenter").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_FARMHAND", GSON.fromJson(questsObject.get("talk_to_farmhand_1").getAsJsonObject(), Quest.class));
			questsMap.put("FARMING_SKILL", GSON.fromJson(questsObject.get("increase_farming_skill_5").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_LAZY_MINER", GSON.fromJson(questsObject.get("talk_to_lazy_miner").getAsJsonObject(), Quest.class));
			questsMap.put("MINING_SKILL", GSON.fromJson(questsObject.get("increase_mining_skill_5").getAsJsonObject(), Quest.class));
			questsMap.put("FORAGING_SKILL", GSON.fromJson(questsObject.get("increase_foraging_skill_5").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_GUSTAVE", GSON.fromJson(questsObject.get("talk_to_gustave_1").getAsJsonObject(), Quest.class));
			questsMap.put("KILL_DANGER_MOBS", GSON.fromJson(questsObject.get("kill_danger_mobs").getAsJsonObject(), Quest.class));
			questsMap.put("REFORGE_ITEM", GSON.fromJson(questsObject.get("reforge_item").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_LAPIS_MINER", GSON.fromJson(questsObject.get("talk_to_lapis_miner").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_GULLIVER", GSON.fromJson(questsObject.get("talk_to_gulliver_1").getAsJsonObject(), Quest.class));
			questsMap.put("COMBAT_SKILL", GSON.fromJson(questsObject.get("increase_combat_skill_5").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_RICK", GSON.fromJson(questsObject.get("talk_to_rick").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_RHYS", GSON.fromJson(questsObject.get("talk_to_rhys").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_GUILDFORD", GSON.fromJson(questsObject.get("talk_to_guildford_1").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_ARCHAEOLOGIST", GSON.fromJson(questsObject.get("talk_to_archaeologist").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_GUBER", GSON.fromJson(questsObject.get("talk_to_guber_1").getAsJsonObject(), Quest.class));
			questsMap.put("TALK_TO_END_DEALER", GSON.fromJson(questsObject.get("talk_to_end_dealer").getAsJsonObject(), Quest.class));
		}

		/**
		 * Get Quests
		 */
		public Map<String, Quest> getQuestsMap() {
			return questsMap;
		}
	}

	/**
	 * Quest Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Quest {

		@SerializedName("status")
		String status = "";

		@SerializedName("activated_at")
		long activation = 0;

		@SerializedName("completed_at")
		long completed = 0;

		/**
		 * Get Quest Status
		 */
		public String getStatus() {
			return status;
		}

		/**
		 * Get Quest Activation Timestamp
		 */
		public long getActivation() {
			return activation;
		}

		/**
		 * Get 'Completed at' Timestamp
		 */
		public long getCompleted() {
			return completed;
		}
	}

	/**
	 * Member Minions Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Minions {
		final JsonArray minionsArray;

		public Minions(JsonArray minionsArray) {
			this.minionsArray = minionsArray;
		}

		public List<String> getUnlockedMinions() {
			List<String> visitedZones = new ArrayList<>();
			minionsArray.forEach(minion -> visitedZones.add(minion.getAsString()));

			return visitedZones;
		}
	}

	/**
	 * Member Visits Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Visits {

		final JsonArray visitsArray;

		public Visits(JsonArray visitsArray) {
			this.visitsArray = visitsArray;
		}

		public List<String> getVisitedZones() {
			List<String> visitedZones = new ArrayList<>();
			visitsArray.forEach(zone -> visitedZones.add(zone.getAsString()));

			return visitedZones;
		}
	}

	/**
	 * Member Pets Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Pets {

		final Gson GSON = new Gson();
		final JsonArray petsArray;

		public Pets(JsonArray petsArray) {
			this.petsArray = petsArray;
		}

		public Pet getPet(int pet) {
			if(pet <= 0) throw new HypixelAPIException("Pet Number Cannot be 0, 1 is Minimum");
			if(pet > petsArray.size() + 1) throw new HypixelAPIException("Maximum Pet Number is " + petsArray.size() + 1);
			return GSON.fromJson(petsArray.get(pet - 1).getAsJsonObject(), Pet.class);
		}
	}

	/**
	 * Pet Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Pet {

		@SerializedName("type")
		String type = "";

		@SerializedName("exp")
		double exp = 0.0;

		@SerializedName("active")
		boolean active = false;

		@SerializedName("tier")
		String tier = "";

		@SerializedName("candyUsed")
		int candies = 0;

		/**
		 * Get Pet Type
		 */
		public String getType() {
			return type;
		}

		/**
		 * Get Pet Experience
		 */
		public double getExp() {
			return exp;
		}

		/**
		 * Get Pet Status (true = present; false = missing)
		 */
		public boolean isActive() {
			return active;
		}

		/**
		 * Get Pet Rarity Tier
		 */
		public String getTier() {
			return tier;
		}

		/**
		 * Get Total Used Candies
		 */
		public int getCandies() {
			return candies;
		}
	}

	/**
	 * Member Collections Data
	 * @author Kokhaviel
	 * @since 4.4
	 */
	public static class Collections {

		final Map<String, Integer> collectionsMap = new HashMap<>();
		final JsonObject collectionsObject;

		public Collections(JsonObject collectionsObject) {
			this.collectionsObject = collectionsObject;
			putCollectionsData();
		}

		void putCollectionsData() {
				collectionsMap.put("ACACIA_LOG", checkKeyExists(collectionsObject, "LOG_2") ? collectionsObject.get("LOG_2").getAsInt() : 0);
				collectionsMap.put("BIRCH_LOG", checkKeyExists(collectionsObject, "LOG:2") ? collectionsObject.get("LOG:2").getAsInt() : 0);
				collectionsMap.put("BLAZE_ROD", checkKeyExists(collectionsObject, "BLAZE_ROD") ? collectionsObject.get("BLAZE_ROD").getAsInt() : 0);
				collectionsMap.put("BONE", checkKeyExists(collectionsObject, "BONE") ? collectionsObject.get("BONE").getAsInt() : 0);
				collectionsMap.put("CACTUS", checkKeyExists(collectionsObject, "CACTUS") ? collectionsObject.get("CACTUS").getAsInt() : 0);
				collectionsMap.put("CARROT", checkKeyExists(collectionsObject, "CARROT_ITEM") ? collectionsObject.get("CARROT_ITEM").getAsInt() : 0);
				collectionsMap.put("CHICKEN", checkKeyExists(collectionsObject, "RAW_CHICKEN") ? collectionsObject.get("RAW_CHICKEN").getAsInt() : 0);
				collectionsMap.put("CLAY", checkKeyExists(collectionsObject, "CLAY_BALL") ? collectionsObject.get("CLAY_BALL").getAsInt() : 0);
				collectionsMap.put("COAL", checkKeyExists(collectionsObject, "COAL") ? collectionsObject.get("COAL").getAsInt() : 0);
				collectionsMap.put("COBBLESTONE", checkKeyExists(collectionsObject, "COBBLESTONE") ? collectionsObject.get("COBBLESTONE").getAsInt() : 0);
				collectionsMap.put("DARK_OAK_LOG", checkKeyExists(collectionsObject, "LOG_2:1") ? collectionsObject.get("LOG_2:1").getAsInt() : 0);
				collectionsMap.put("DIAMOND", checkKeyExists(collectionsObject, "DIAMOND") ? collectionsObject.get("DIAMOND").getAsInt() : 0);
				collectionsMap.put("EMERALD", checkKeyExists(collectionsObject, "EMERALD") ? collectionsObject.get("EMERALD").getAsInt() : 0);
				collectionsMap.put("END_STONE", checkKeyExists(collectionsObject, "ENDER_STONE") ? collectionsObject.get("ENDER_STONE").getAsInt() : 0);
				collectionsMap.put("ENDERPEARL", checkKeyExists(collectionsObject, "ENDER_PEARL") ? collectionsObject.get("ENDER_PEARL").getAsInt() : 0);
				collectionsMap.put("FEATHER", checkKeyExists(collectionsObject, "FEATHER") ? collectionsObject.get("FEATHER").getAsInt() : 0);
				collectionsMap.put("GHAST_TEAR", checkKeyExists(collectionsObject, "GHAST_TEAR") ? collectionsObject.get("GHAST_TEAR").getAsInt() : 0);
				collectionsMap.put("GLOWSTONE", checkKeyExists(collectionsObject, "GLOWSTONE_DUST") ? collectionsObject.get("GLOWSTONE_DUST").getAsInt() : 0);
				collectionsMap.put("GOLD", checkKeyExists(collectionsObject, "GOLD_INGOT") ? collectionsObject.get("GOLD_INGOT").getAsInt() : 0);
				collectionsMap.put("GRAVEL", checkKeyExists(collectionsObject, "GRAVEL") ? collectionsObject.get("GRAVEL").getAsInt() : 0);
				collectionsMap.put("ICE", checkKeyExists(collectionsObject, "ICE") ? collectionsObject.get("ICE").getAsInt() : 0);
				collectionsMap.put("INK", checkKeyExists(collectionsObject, "INK_SACK") ? collectionsObject.get("INK_SACK").getAsInt() : 0);
				collectionsMap.put("IRON", checkKeyExists(collectionsObject, "IRON_INGOT") ? collectionsObject.get("IRON_INGOT").getAsInt() : 0);
				collectionsMap.put("JUNGLE_LOG", checkKeyExists(collectionsObject, "LOG:3") ? collectionsObject.get("LOG:3").getAsInt() : 0);
				collectionsMap.put("LEATHER", checkKeyExists(collectionsObject, "LEATHER") ? collectionsObject.get("LEATHER").getAsInt() : 0);
				collectionsMap.put("LILYPAD", checkKeyExists(collectionsObject, "WATER_LILY") ? collectionsObject.get("WATER_LILY").getAsInt() : 0);
				collectionsMap.put("MAGMA_CREAM", checkKeyExists(collectionsObject, "MAGMA_CREAM") ? collectionsObject.get("MAGMA_CREAM").getAsInt() : 0);
				collectionsMap.put("MELON", checkKeyExists(collectionsObject, "MELON") ? collectionsObject.get("MELON").getAsInt() : 0);
				collectionsMap.put("MITHRIL", checkKeyExists(collectionsObject, "MITHRIL_ORE") ? collectionsObject.get("MITHRIL_ORE").getAsInt() : 0);
				collectionsMap.put("MUTTON", checkKeyExists(collectionsObject, "MUTTON") ? collectionsObject.get("MUTTON").getAsInt() : 0);
				collectionsMap.put("NETHER_WART", checkKeyExists(collectionsObject, "NETHER_STALK") ? collectionsObject.get("NETHER_STALK").getAsInt() : 0);
				collectionsMap.put("NETHERRACK", checkKeyExists(collectionsObject, "NETHERRACK") ? collectionsObject.get("NETHERRACK").getAsInt() : 0);
				collectionsMap.put("OAK_LOG", checkKeyExists(collectionsObject, "LOG") ? collectionsObject.get("LOG").getAsInt() : 0);
				collectionsMap.put("OBSIDIAN", checkKeyExists(collectionsObject, "OBSIDIAN") ? collectionsObject.get("OBSIDIAN").getAsInt() : 0);
				collectionsMap.put("PORK", checkKeyExists(collectionsObject, "PORK") ? collectionsObject.get("PORK").getAsInt() : 0);
				collectionsMap.put("POTATO", checkKeyExists(collectionsObject, "POTATO_ITEM") ? collectionsObject.get("POTATO_ITEM").getAsInt() : 0);
				collectionsMap.put("PRISMARINE_CRYSTALS", checkKeyExists(collectionsObject, "PRISMARINE_CRYSTALS") ? collectionsObject.get("PRISMARINE_CRYSTALS").getAsInt() : 0);
				collectionsMap.put("PRISMARINE_SHARD", checkKeyExists(collectionsObject, "PRISMARINE_SHARD") ? collectionsObject.get("PRISMARINE_SHARD").getAsInt() : 0);
				collectionsMap.put("PUFFERFISH", checkKeyExists(collectionsObject, "RAW_FISH:3") ? collectionsObject.get("RAW_FISH:3").getAsInt() : 0);
				collectionsMap.put("PUMPKIN", checkKeyExists(collectionsObject, "PUMPKIN") ? collectionsObject.get("PUMPKIN").getAsInt() : 0);
				collectionsMap.put("QUARTZ", checkKeyExists(collectionsObject, "QUARTZ") ? collectionsObject.get("QUARTZ").getAsInt() : 0);
				collectionsMap.put("RABBIT", checkKeyExists(collectionsObject, "RABBIT") ? collectionsObject.get("RABBIT").getAsInt() : 0);
				collectionsMap.put("MUSHROOM", checkKeyExists(collectionsObject, "MUSHROOM_COLLECTION") ? collectionsObject.get("MUSHROOM_COLLECTION").getAsInt() : 0);
				collectionsMap.put("REDSTONE", checkKeyExists(collectionsObject, "REDSTONE") ? collectionsObject.get("REDSTONE").getAsInt() : 0);
				collectionsMap.put("ROTTEN_FLESH", checkKeyExists(collectionsObject, "ROTTEN_FLESH") ? collectionsObject.get("ROTTEN_FLESH").getAsInt() : 0);
				collectionsMap.put("SALMON", checkKeyExists(collectionsObject, "RAW_FISH:1") ? collectionsObject.get("RAW_FISH:1").getAsInt() : 0);
				collectionsMap.put("SLIMEBALL", checkKeyExists(collectionsObject, "SLIME_BALL") ? collectionsObject.get("SLIME_BALL").getAsInt() : 0);
				collectionsMap.put("SPIDER_EYE", checkKeyExists(collectionsObject, "SPIDER_EYE") ? collectionsObject.get("SPIDER_EYE").getAsInt() : 0);
				collectionsMap.put("SPRUCE_LOG", checkKeyExists(collectionsObject, "LOG:1") ? collectionsObject.get("LOG:1").getAsInt() : 0);
				collectionsMap.put("STRING", checkKeyExists(collectionsObject, "STRING") ? collectionsObject.get("STRING").getAsInt() : 0);
				collectionsMap.put("SUGAR_CANE", checkKeyExists(collectionsObject, "SUGAR_CANE") ? collectionsObject.get("SUGAR_CANE").getAsInt() : 0);
				collectionsMap.put("CLOWNFISH", checkKeyExists(collectionsObject, "RAW_FISH:2") ? collectionsObject.get("RAW_FISH:2").getAsInt() : 0);
				collectionsMap.put("WHEAT", checkKeyExists(collectionsObject, "WHEAT") ? collectionsObject.get("WHEAT").getAsInt() : 0);
				collectionsMap.put("SEEDS", checkKeyExists(collectionsObject, "SEEDS") ? collectionsObject.get("SEEDS").getAsInt() : 0);
		}

		/**
		 * Get Collections
		 */
		public Map<String, Integer> getCollectionsMap() {
			return collectionsMap;
		}

		private boolean checkKeyExists(JsonObject collectionsObject, String key) {
			return collectionsObject.has(key);
		}
	}
}
