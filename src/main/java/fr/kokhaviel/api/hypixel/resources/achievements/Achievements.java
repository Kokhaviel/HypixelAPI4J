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

package fr.kokhaviel.api.hypixel.resources.achievements;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import fr.kokhaviel.api.hypixel.util.exceptions.HypixelAPIException;

import java.util.HashMap;
import java.util.Map;

/**
 * Hypixel Network Achievements Data
 *
 * @author Kokhaviel
 * @since 3.0
 */
public class Achievements {

	final JsonObject jsonObject;
	final JsonObject achievementsObject;

	final Arcade arcade;
	final Arena arena;
	final Bedwars bedwars;
	final Blitz blitz;
	final BuildBattle buildBattle;
	final Christmas christmas;
	final MCGO mcgo;
	final Duels duels;
	final Easter easter;
	final General general;
	final GingerBread gingerBread;
	final Halloween halloween;
	final Housing housing;
	final MurderMystery murderMystery;
	final Paintball paintball;
	final Pit pit;
	final Quake quake;
	final Skyblock skyblock;
	final Skywars skywars;
	final SpeedUHC speedUHC;
	final Summer summer;
	final Smash smash;
	final TNTGames tntGames;
	final UHC uhc;
	final VampireZ vampireZ;
	final Walls walls;
	final MegaWalls megaWalls;
	final Warlords warlords;
	final boolean success;
	final long lastUpdate;

	public Achievements(JsonObject achievementsObject) {
		this.jsonObject = achievementsObject;
		this.success = jsonObject.get("success").getAsBoolean();
		this.lastUpdate = jsonObject.get("lastUpdated").getAsLong();
		this.achievementsObject = jsonObject.get("achievements").getAsJsonObject();

		arcade = new Arcade(this.achievementsObject.get("arcade").getAsJsonObject());
		arena = new Arena(this.achievementsObject.get("arena").getAsJsonObject());
		bedwars = new Bedwars(this.achievementsObject.get("bedwars").getAsJsonObject());
		blitz = new Blitz(this.achievementsObject.get("blitz").getAsJsonObject());
		buildBattle = new BuildBattle(this.achievementsObject.get("buildbattle").getAsJsonObject());
		christmas = new Christmas(this.achievementsObject.get("christmas2017").getAsJsonObject());
		mcgo = new MCGO(this.achievementsObject.get("copsandcrims").getAsJsonObject());
		duels = new Duels(this.achievementsObject.get("duels").getAsJsonObject());
		easter = new Easter(this.achievementsObject.get("easter").getAsJsonObject());
		general = new General(this.achievementsObject.get("general").getAsJsonObject());
		gingerBread = new GingerBread(this.achievementsObject.get("gingerbread").getAsJsonObject());
		halloween = new Halloween(this.achievementsObject.get("halloween2017").getAsJsonObject());
		housing = new Housing(this.achievementsObject.get("housing").getAsJsonObject());
		murderMystery = new MurderMystery(this.achievementsObject.get("murdermystery").getAsJsonObject());
		paintball = new Paintball(this.achievementsObject.get("paintball").getAsJsonObject());
		pit = new Pit(this.achievementsObject.get("pit").getAsJsonObject());
		quake = new Quake(this.achievementsObject.get("quake").getAsJsonObject());
		skyblock = new Skyblock(this.achievementsObject.get("skyblock").getAsJsonObject());
		skywars = new Skywars(this.achievementsObject.get("skywars").getAsJsonObject());
		speedUHC = new SpeedUHC(this.achievementsObject.get("speeduhc").getAsJsonObject());
		summer = new Summer(this.achievementsObject.get("summer").getAsJsonObject());
		smash = new Smash(this.achievementsObject.get("supersmash").getAsJsonObject());
		tntGames = new TNTGames(this.achievementsObject.get("tntgames").getAsJsonObject());
		uhc = new UHC(this.achievementsObject.get("uhc").getAsJsonObject());
		vampireZ = new VampireZ(this.achievementsObject.get("vampirez").getAsJsonObject());
		walls = new Walls(this.achievementsObject.get("walls").getAsJsonObject());
		megaWalls = new MegaWalls(this.achievementsObject.getAsJsonObject("walls3").getAsJsonObject());
		warlords = new Warlords(this.achievementsObject.get("warlords").getAsJsonObject());
	}

	/**
	 * Success Status of the Request
	 *
	 * @return Success Status
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Last Data Update Timestamp
	 *
	 * @return Update Timestamp
	 */
	public long getLastUpdate() {
		return lastUpdate;
	}


	/**
	 * Get Arcade Achievements Data
	 */
	public Arcade getArcade() {
		return arcade;
	}

	/**
	 * Get Arena Achievements Data
	 */
	public Arena getArena() {
		return arena;
	}

	/**
	 * Get Bedwars Achievements Data
	 */
	public Bedwars getBedwars() {
		return bedwars;
	}

	/**
	 * Get Blitz Achievements Data
	 */
	public Blitz getBlitz() {
		return blitz;
	}

	/**
	 * Get Build Battle Achievements Data
	 */
	public BuildBattle getBuildBattle() {
		return buildBattle;
	}

	/**
	 * Get Christmas Achievements Data
	 */
	public Christmas getChristmas() {
		return christmas;
	}

	/**
	 * Get MCGO Achievements Data
	 */
	public MCGO getMcgo() {
		return mcgo;
	}

	/**
	 * Get Duels Achievements Data
	 */
	public Duels getDuels() {
		return duels;
	}

	/**
	 * Get Easter Achievements Data
	 */
	public Easter getEaster() {
		return easter;
	}

	/**
	 * Get General Achievements Data
	 */
	public General getGeneral() {
		return general;
	}

	/**
	 * Get Ginger Bread Achievements Data
	 */
	public GingerBread getGingerBread() {
		return gingerBread;
	}

	/**
	 * Get Halloween Achievements Data
	 */
	public Halloween getHalloween() {
		return halloween;
	}

	/**
	 * Get Housing Achievements Data
	 */
	public Housing getHousing() {
		return housing;
	}

	/**
	 * Get Murder Mystery Achievements Data
	 */
	public MurderMystery getMurderMystery() {
		return murderMystery;
	}

	/**
	 * Get Paintball Achievements Data
	 */
	public Paintball getPaintball() {
		return paintball;
	}

	/**
	 * Get Pit Achievements Data
	 */
	public Pit getPit() {
		return pit;
	}

	/**
	 * Get Quake Achievements Data
	 */
	public Quake getQuake() {
		return quake;
	}

	/**
	 * Get Skyblock Achievements Data
	 */
	public Skyblock getSkyblock() {
		return skyblock;
	}

	/**
	 * Get Skywars Achievements Data
	 */
	public Skywars getSkywars() {
		return skywars;
	}

	/**
	 * Get Speed UHC Achievements Data
	 */
	public SpeedUHC getSpeedUHC() {
		return speedUHC;
	}

	/**
	 * Get Summer Achievements Data
	 */
	public Summer getSummer() {
		return summer;
	}

	/**
	 * Get Smash Achievements Data
	 */
	public Smash getSmash() {
		return smash;
	}

	/**
	 * Get Tnt Games Achievements Data
	 */
	public TNTGames getTntGames() {
		return tntGames;
	}

	/**
	 * Get UHC Achievements Data
	 */
	public UHC getUhc() {
		return uhc;
	}

	/**
	 * Get VampireZ Achievements Data
	 */
	public VampireZ getVampireZ() {
		return vampireZ;
	}

	/**
	 * Get Walls Achievements Data
	 */
	public Walls getWalls() {
		return walls;
	}

	/**
	 * Get Mega Walls Achievements Data
	 */
	public MegaWalls getMegaWalls() {
		return megaWalls;
	}

	/**
	 * Get Warlords Achievements Data
	 */
	public Warlords getWarlords() {
		return warlords;
	}

	/**
	 * Arcade Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Arcade {

		final JsonObject arcadeObject;
		final JsonObject arcadeOneTimeObject;
		final JsonObject arcadeTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Arcade(JsonObject arcadeObject) {
			this.arcadeObject = arcadeObject;
			this.arcadeOneTimeObject = arcadeObject.get("one_time").getAsJsonObject();
			this.arcadeTieredObject = arcadeObject.get("tiered").getAsJsonObject();
			putArcadeMapData();
		}

		void putArcadeMapData() {
			oneTimeMap.put("CREEPER_ATTACK_SURVIVAL", new OneTime(
					arcadeOneTimeObject.get("CREEPER_ATTACK_SURVIVAL").getAsJsonObject()));
			oneTimeMap.put("FOOTBALL_FIVE_GOALS", new OneTime(
					arcadeOneTimeObject.get("FOOTBALL_FIVE_GOALS").getAsJsonObject()));
			oneTimeMap.put("OVERPOWERED", new OneTime(
					arcadeOneTimeObject.get("OVERPOWERED").getAsJsonObject()));
			oneTimeMap.put("WORLD_ECONOMICS", new OneTime(
					arcadeOneTimeObject.get("WORLD_ECONOMICS").getAsJsonObject()));
			oneTimeMap.put("CANT_HIDE_FROM_ME", new OneTime(
					arcadeOneTimeObject.get("CANT_HIDE_FROM_ME").getAsJsonObject()));
			oneTimeMap.put("OVER_HERE", new OneTime(
					arcadeOneTimeObject.get("OVER_HERE").getAsJsonObject()));
			oneTimeMap.put("GIDDY_UP_HORSEY", new OneTime(
					arcadeOneTimeObject.get("GIDDY_UP_HORSEY").getAsJsonObject()));
			oneTimeMap.put("DRAGONTAMER", new OneTime(
					arcadeOneTimeObject.get("DRAGONTAMER").getAsJsonObject()));
			oneTimeMap.put("CTW_HEY_THERE", new OneTime(
					arcadeOneTimeObject.get("CTW_HEY_THERE").getAsJsonObject()));
			oneTimeMap.put("PIXEL_PAINTERS_ONE", new OneTime(
					arcadeOneTimeObject.get("PIXEL_PAINTERS_ONE").getAsJsonObject()));
			oneTimeMap.put("SHOOTING_RANGE_EXPLOSIVE_ARROW", new OneTime(
					arcadeOneTimeObject.get("SHOOTING_RANGE_EXPLOSIVE_ARROW").getAsJsonObject()));
			oneTimeMap.put("HYPIXEL_SAYS_MASTER", new OneTime(
					arcadeOneTimeObject.get("HYPIXEL_SAYS_MASTER").getAsJsonObject()));
			oneTimeMap.put("NO_MUTINY_TODAY", new OneTime(
					arcadeOneTimeObject.get("NO_MUTINY_TODAY").getAsJsonObject()));
			oneTimeMap.put("DRAGON_WARS_BLAST", new OneTime(
					arcadeOneTimeObject.get("DRAGON_WARS_BLAST").getAsJsonObject()));
			oneTimeMap.put("CTW_I_CAN_BE_ANYTHING", new OneTime(
					arcadeOneTimeObject.get("CTW_I_CAN_BE_ANYTHING").getAsJsonObject()));
			oneTimeMap.put("CTW_NO_NEED", new OneTime(
					arcadeOneTimeObject.get("CTW_NO_NEED").getAsJsonObject()));
			oneTimeMap.put("MINI_WALLS_LAST_MAN", new OneTime(
					arcadeOneTimeObject.get("MINI_WALLS_LAST_MAN").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_FEELS_GOOD", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_FEELS_GOOD").getAsJsonObject()));
			oneTimeMap.put("HOEHOEHOE_SCORE", new OneTime(
					arcadeOneTimeObject.get("HOEHOEHOE_SCORE").getAsJsonObject()));
			oneTimeMap.put("CREEPER_ATTACK_WAVES", new OneTime(
					arcadeOneTimeObject.get("CREEPER_ATTACK_WAVES").getAsJsonObject()));
			oneTimeMap.put("HIDE_AND_SEEK_PROP_HUNTER", new OneTime(
					arcadeOneTimeObject.get("HIDE_AND_SEEK_PROP_HUNTER").getAsJsonObject()));
			oneTimeMap.put("HOLE_SCORE", new OneTime(
					arcadeOneTimeObject.get("HOLE_SCORE").getAsJsonObject()));
			oneTimeMap.put("CTW_MVP", new OneTime(
					arcadeOneTimeObject.get("CTW_MVP").getAsJsonObject()));
			oneTimeMap.put("FOOTBALL_SPEED", new OneTime(
					arcadeOneTimeObject.get("FOOTBALL_SPEED").getAsJsonObject()));
			oneTimeMap.put("MINI_WALLS_DAMAGE", new OneTime(
					arcadeOneTimeObject.get("MINI_WALLS_DAMAGE").getAsJsonObject()));
			oneTimeMap.put("ZOMBES_SERIAL_KILLER", new OneTime(
					arcadeOneTimeObject.get("ZOMBES_SERIAL_KILLER").getAsJsonObject()));
			oneTimeMap.put("PROFESSIONAL_MOWER", new OneTime(
					arcadeOneTimeObject.get("PROFESSIONAL_MOWER").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_SPEED_RUNNER", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_SPEED_RUNNER").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_ULTIMATE", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_ULTIMATE").getAsJsonObject()));
			oneTimeMap.put("PIG_FISHING_SUPER_BACON", new OneTime(
					arcadeOneTimeObject.get("PIG_FISHING_SUPER_BACON").getAsJsonObject()));
			oneTimeMap.put("BOUNTY_HUNTER_TARGET_KILLER", new OneTime(
					arcadeOneTimeObject.get("BOUNTY_HUNTER_TARGET_KILLER").getAsJsonObject()));
			oneTimeMap.put("WOOPS_DIDNT_MEAN_TO", new OneTime(
					arcadeOneTimeObject.get("WOOPS_DIDNT_MEAN_TO").getAsJsonObject()));
			oneTimeMap.put("MINI_HUNTER", new OneTime(
					arcadeOneTimeObject.get("MINI_HUNTER").getAsJsonObject()));
			oneTimeMap.put("HIDE_AND_SEEK_PARTY_POOPER", new OneTime(
					arcadeOneTimeObject.get("HIDE_AND_SEEK_PARTY_POOPER").getAsJsonObject()));
			oneTimeMap.put("GOTTA_CATCH_THEM_ALL", new OneTime(
					arcadeOneTimeObject.get("GOTTA_CATCH_THEM_ALL").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_TIME_TRIAL_BLOOD", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_TIME_TRIAL_BLOOD").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_TEAM_PLAYER", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_TEAM_PLAYER").getAsJsonObject()));
			oneTimeMap.put("HIDE_AND_SEEK_PROP", new OneTime(
					arcadeOneTimeObject.get("HIDE_AND_SEEK_PROP").getAsJsonObject()));
			oneTimeMap.put("RPG_16_ROCKET_PIG", new OneTime(
					arcadeOneTimeObject.get("RPG_16_ROCKET_PIG").getAsJsonObject()));
			oneTimeMap.put("CTW_RIGHT_PLACE_RIGHT_TIME", new OneTime(
					arcadeOneTimeObject.get("CTW_RIGHT_PLACE_RIGHT_TIME").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_HEROBRINE", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_HEROBRINE").getAsJsonObject()));
			oneTimeMap.put("FARM_HUNT_DISGUISE", new OneTime(
					arcadeOneTimeObject.get("FARM_HUNT_DISGUISE").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_PERK_HOARDER", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_PERK_HOARDER").getAsJsonObject()));
			oneTimeMap.put("HOLE_FINALS", new OneTime(
					arcadeOneTimeObject.get("HOLE_FINALS").getAsJsonObject()));
			oneTimeMap.put("CTW_FASHIONABLY_LATE", new OneTime(
					arcadeOneTimeObject.get("CTW_FASHIONABLY_LATE").getAsJsonObject()));
			oneTimeMap.put("CTW_SAFETY_IS_AN_ILLUSION", new OneTime(
					arcadeOneTimeObject.get("CTW_SAFETY_IS_AN_ILLUSION").getAsJsonObject()));
			oneTimeMap.put("CTW_MAGICIAN", new OneTime(
					arcadeOneTimeObject.get("CTW_MAGICIAN").getAsJsonObject()));
			oneTimeMap.put("CREEPER_ATTACK_IRON_GOLEM", new OneTime(
					arcadeOneTimeObject.get("CREEPER_ATTACK_IRON_GOLEM").getAsJsonObject()));
			oneTimeMap.put("NO_MERCY", new OneTime(
					arcadeOneTimeObject.get("NO_MERCY").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_WIN", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_WIN").getAsJsonObject()));
			oneTimeMap.put("THROW_OUT_POWERUP_KILL", new OneTime(
					arcadeOneTimeObject.get("THROW_OUT_POWERUP_KILL").getAsJsonObject()));
			oneTimeMap.put("CTW_FIRST", new OneTime(
					arcadeOneTimeObject.get("CTW_FIRST").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_ELECTRICIAN", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_ELECTRICIAN").getAsJsonObject()));
			oneTimeMap.put("TEAM_SLAYER", new OneTime(
					arcadeOneTimeObject.get("TEAM_SLAYER").getAsJsonObject()));
			oneTimeMap.put("CTW_COMEBACK", new OneTime(
					arcadeOneTimeObject.get("CTW_COMEBACK").getAsJsonObject()));
			oneTimeMap.put("FARM_HUNT_KILLER", new OneTime(
					arcadeOneTimeObject.get("FARM_HUNT_KILLER").getAsJsonObject()));
			oneTimeMap.put("AVALANCE_WAVES", new OneTime(
					arcadeOneTimeObject.get("AVALANCE_WAVES").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_TIME_TRIAL_DEAD", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_TIME_TRIAL_DEAD").getAsJsonObject()));
			oneTimeMap.put("CTW_NINJA", new OneTime(
					arcadeOneTimeObject.get("CTW_NINJA").getAsJsonObject()));
			oneTimeMap.put("PARTY_GAMES_STARS", new OneTime(
					arcadeOneTimeObject.get("PARTY_GAMES_STARS").getAsJsonObject()));
			oneTimeMap.put("TRAMPOLINIO_RED_WOOL", new OneTime(
					arcadeOneTimeObject.get("TRAMPOLINIO_RED_WOOL").getAsJsonObject()));
			oneTimeMap.put("DRAGON_SLAYER", new OneTime(
					arcadeOneTimeObject.get("DRAGON_SLAYER").getAsJsonObject()));
			oneTimeMap.put("UNTOUCHABLE", new OneTime(
					arcadeOneTimeObject.get("UNTOUCHABLE").getAsJsonObject()));
			oneTimeMap.put("LONE_SURVIVOR", new OneTime(
					arcadeOneTimeObject.get("LONE_SURVIVOR").getAsJsonObject()));
			oneTimeMap.put("ANIMAL_SLAUGHTER", new OneTime(
					arcadeOneTimeObject.get("ANIMAL_SLAUGHTER").getAsJsonObject()));
			oneTimeMap.put("SAVAGE", new OneTime(
					arcadeOneTimeObject.get("SAVAGE").getAsJsonObject()));
			oneTimeMap.put("DRAGON_KILLER", new OneTime(
					arcadeOneTimeObject.get("DRAGON_KILLER").getAsJsonObject()));
			oneTimeMap.put("CREEPER_ATTACK_UPGRADES", new OneTime(
					arcadeOneTimeObject.get("CREEPER_ATTACK_UPGRADES").getAsJsonObject()));
			oneTimeMap.put("ZOMBIES_SURVIVOR", new OneTime(
					arcadeOneTimeObject.get("ZOMBIES_SURVIVOR").getAsJsonObject()));


			tieredMap.put("ZOMBIES_NICE_SHOT", new Tiered(
					arcadeTieredObject.get("ZOMBIES_NICE_SHOT").getAsJsonObject()));
			tieredMap.put("HIDE_AND_SEEK_HIDER_KILLS", new Tiered(
					arcadeTieredObject.get("HIDE_AND_SEEK_HIDER_KILLS").getAsJsonObject()));
			tieredMap.put("ZOMBIE_KILLER", new Tiered(
					arcadeTieredObject.get("ZOMBIE_KILLER").getAsJsonObject()));
			tieredMap.put("ZOMBIES_ROUND_PROGRESSION", new Tiered(
					arcadeTieredObject.get("ZOMBIES_ROUND_PROGRESSION").getAsJsonObject()));
			tieredMap.put("CTW_OH_SHEEP", new Tiered(
					arcadeTieredObject.get("CTW_OH_SHEEP").getAsJsonObject()));
			tieredMap.put("TEAM_WORK", new Tiered(
					arcadeTieredObject.get("TEAM_WORK").getAsJsonObject()));
			tieredMap.put("ARCADE_BANKER", new Tiered(
					arcadeTieredObject.get("ARCADE_BANKER").getAsJsonObject()));
			tieredMap.put("MINIWALLS_WINNER", new Tiered(
					arcadeTieredObject.get("MINIWALLS_WINNER").getAsJsonObject()));
			tieredMap.put("BOUNTY_HUNTER", new Tiered(
					arcadeTieredObject.get("BOUNTY_HUNTER").getAsJsonObject()));
			tieredMap.put("ARCADE_WINNER", new Tiered(
					arcadeTieredObject.get("ARCADE_WINNER").getAsJsonObject()));
			tieredMap.put("ZOMBIES_HIGH_ROUND", new Tiered(
					arcadeTieredObject.get("ZOMBIES_HIGH_ROUND").getAsJsonObject()));
			tieredMap.put("FOOTBALL_PRO", new Tiered(
					arcadeTieredObject.get("FOOTBALL_PRO").getAsJsonObject()));
			tieredMap.put("CTW_SLAYER", new Tiered(
					arcadeTieredObject.get("CTW_SLAYER").getAsJsonObject()));
			tieredMap.put("FARMHUNT_DOMINATOR", new Tiered(
					arcadeTieredObject.get("FARMHUNT_DOMINATOR").getAsJsonObject()));
		}

		/**
		 * Get Arcade One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Arcade Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}


	}

	/**
	 * Arena Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Arena {

		final JsonObject arenaObject;
		final JsonObject arenaOneTimeObject;
		final JsonObject arenaTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Arena(JsonObject arenaObject) {
			this.arenaObject = arenaObject;
			this.arenaOneTimeObject = arenaObject.get("one_time").getAsJsonObject();
			this.arenaTieredObject = arenaObject.get("tiered").getAsJsonObject();
			putArenaData();
		}

		void putArenaData() {
			oneTimeMap.put("MY_NEW_HAT", new OneTime(
					arenaOneTimeObject.get("MY_NEW_HAT").getAsJsonObject()));
			oneTimeMap.put("SPARTACUS", new OneTime(
					arenaOneTimeObject.get("SPARTACUS").getAsJsonObject()));
			oneTimeMap.put("NICE_SPARE", new OneTime(
					arenaOneTimeObject.get("NICE_SPARE").getAsJsonObject()));
			oneTimeMap.put("NEW_TOY", new OneTime(
					arenaOneTimeObject.get("NEW_TOY").getAsJsonObject()));
			oneTimeMap.put("MAGICAL", new OneTime(
					arenaOneTimeObject.get("MAGICAL").getAsJsonObject()));
			oneTimeMap.put("HEALTH_TOTEM", new OneTime(
					arenaOneTimeObject.get("HEALTH_TOTEM").getAsJsonObject()));
			oneTimeMap.put("PIG", new OneTime(
					arenaOneTimeObject.get("PIG").getAsJsonObject()));
			oneTimeMap.put("MELEE", new OneTime(
					arenaOneTimeObject.get("MELEE").getAsJsonObject()));
			oneTimeMap.put("PUNISHER", new OneTime(
					arenaOneTimeObject.get("PUNISHER").getAsJsonObject()));
			oneTimeMap.put("ENERGY", new OneTime(
					arenaOneTimeObject.get("ENERGY").getAsJsonObject()));
			oneTimeMap.put("DOOM_SHROOM_GLOOM", new OneTime(
					arenaOneTimeObject.get("DOOM_SHROOM_GLOOM").getAsJsonObject()));
			oneTimeMap.put("ENVIRONMENTALIST", new OneTime(
					arenaOneTimeObject.get("ENVIRONMENTALIST").getAsJsonObject()));
			oneTimeMap.put("HARD_EARNED_REWARD", new OneTime(
					arenaOneTimeObject.get("HARD_EARNED_REWARD").getAsJsonObject()));
			oneTimeMap.put("DEADLY_PUMPKIN", new OneTime(
					arenaOneTimeObject.get("DEADLY_PUMPKIN").getAsJsonObject()));
			oneTimeMap.put("OFFENSIVE", new OneTime(
					arenaOneTimeObject.get("OFFENSIVE").getAsJsonObject()));
			oneTimeMap.put("DONT_TOUCH_ME", new OneTime(
					arenaOneTimeObject.get("DONT_TOUCH_ME").getAsJsonObject()));
			oneTimeMap.put("POWER_HUNGRY", new OneTime(
					arenaOneTimeObject.get("POWER_HUNGRY").getAsJsonObject()));
			oneTimeMap.put("NOT_EVEN_CLOSE", new OneTime(
					arenaOneTimeObject.get("NOT_EVEN_CLOSE").getAsJsonObject()));
			oneTimeMap.put("COOLDOWN", new OneTime(
					arenaOneTimeObject.get("COOLDOWN").getAsJsonObject()));
			oneTimeMap.put("DRAGON_WITHIN", new OneTime(
					arenaOneTimeObject.get("DRAGON_WITHIN").getAsJsonObject()));
			oneTimeMap.put("POOL", new OneTime(
					arenaOneTimeObject.get("POOL").getAsJsonObject()));
			oneTimeMap.put("SMASH", new OneTime(
					arenaOneTimeObject.get("SMASH").getAsJsonObject()));
			oneTimeMap.put("FLAWLESS", new OneTime(
					arenaOneTimeObject.get("FLAWLESS").getAsJsonObject()));
			oneTimeMap.put("RUNIC", new OneTime(
					arenaOneTimeObject.get("RUNIC").getAsJsonObject()));
			oneTimeMap.put("OVERKILL", new OneTime(
					arenaOneTimeObject.get("OVERKILL").getAsJsonObject()));
			oneTimeMap.put("BIG_BRAWLER", new OneTime(
					arenaOneTimeObject.get("BIG_BRAWLER").getAsJsonObject()));
			oneTimeMap.put("IRON_HEART", new OneTime(
					arenaOneTimeObject.get("IRON_HEART").getAsJsonObject()));
			oneTimeMap.put("HEALTH", new OneTime(
					arenaOneTimeObject.get("HEALTH").getAsJsonObject()));
			oneTimeMap.put("PAIRS", new OneTime(
					arenaOneTimeObject.get("PAIRS").getAsJsonObject()));
			oneTimeMap.put("SUPPORT", new OneTime(
					arenaOneTimeObject.get("SUPPORT").getAsJsonObject()));
			oneTimeMap.put("DISCO_STAR", new OneTime(
					arenaOneTimeObject.get("DISCO_STAR").getAsJsonObject()));
			oneTimeMap.put("YOU_SHALL_NOT_PASS", new OneTime(
					arenaOneTimeObject.get("YOU_SHALL_NOT_PASS").getAsJsonObject()));
			oneTimeMap.put("TOTEM_DESTROYER", new OneTime(
					arenaOneTimeObject.get("TOTEM_DESTROYER").getAsJsonObject()));
			oneTimeMap.put("MAX_RUNIC_MAGIC", new OneTime(
					arenaOneTimeObject.get("MAX_RUNIC_MAGIC").getAsJsonObject()));
			oneTimeMap.put("NOT_TODAY", new OneTime(
					arenaOneTimeObject.get("NOT_TODAY").getAsJsonObject()));
			oneTimeMap.put("SPIRITED_AWAY", new OneTime(arenaOneTimeObject.get("SPIRITED_AWAY").getAsJsonObject()));


			tieredMap.put("POWERUP", new Tiered(
					arenaTieredObject.get("POWERUP").getAsJsonObject()));
			tieredMap.put("BOSSED", new Tiered(
					arenaTieredObject.get("BOSSED").getAsJsonObject()));
			tieredMap.put("GOTTA_WEAR_EM_ALL", new Tiered(
					arenaTieredObject.get("GOTTA_WEAR_EM_ALL").getAsJsonObject()));
			tieredMap.put("MAGICAL_BOX", new Tiered(
					arenaTieredObject.get("MAGICAL_BOX").getAsJsonObject()));
			tieredMap.put("GLADIATOR", new Tiered(
					arenaTieredObject.get("GLADIATOR").getAsJsonObject()));
			tieredMap.put("CLIMB_THE_RANKS", new Tiered(
					arenaTieredObject.get("CLIMB_THE_RANKS").getAsJsonObject()));
		}

		/**
		 * Get Arena One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Arena Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Bedwars Achievements Data
	 *
	 * @author Kokahviel
	 * @since 3.0
	 */
	public static class Bedwars {
		final JsonObject bedwarsObject;
		final JsonObject bedwarsOneTimeObject;
		final JsonObject bedwarsTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Bedwars(JsonObject bedwarsObject) {
			this.bedwarsObject = bedwarsObject;
			this.bedwarsOneTimeObject = bedwarsObject.get("one_time").getAsJsonObject();
			this.bedwarsTieredObject = bedwarsObject.get("tiered").getAsJsonObject();
			putBedwarsData();
		}

		void putBedwarsData() {

			oneTimeMap.put("IRON_PUNCH", new OneTime(
					bedwarsOneTimeObject.get("IRON_PUNCH").getAsJsonObject()));
			oneTimeMap.put("STRATEGIST", new OneTime(
					bedwarsOneTimeObject.get("STRATEGIST").getAsJsonObject()));
			oneTimeMap.put("GEARED_UP", new OneTime(
					bedwarsOneTimeObject.get("GEARED_UP").getAsJsonObject()));
			oneTimeMap.put("DISTRACTION", new OneTime(
					bedwarsOneTimeObject.get("DISTRACTION").getAsJsonObject()));
			oneTimeMap.put("MINEFIELD", new OneTime(
					bedwarsOneTimeObject.get("MINEFIELD").getAsJsonObject()));
			oneTimeMap.put("EMERALD_HOARDER", new OneTime(
					bedwarsOneTimeObject.get("EMERALD_HOARDER").getAsJsonObject()));
			oneTimeMap.put("NINJA", new OneTime(
					bedwarsOneTimeObject.get("NINJA").getAsJsonObject()));
			oneTimeMap.put("THATS_A_FIRST", new OneTime(
					bedwarsOneTimeObject.get("THATS_A_FIRST").getAsJsonObject()));
			oneTimeMap.put("YOU_CANT_DO_THAT", new OneTime(
					bedwarsOneTimeObject.get("YOU_CANT_DO_THAT").getAsJsonObject()));
			oneTimeMap.put("ALREADY_OVER", new OneTime(
					bedwarsOneTimeObject.get("ALREADY_OVER").getAsJsonObject()));
			oneTimeMap.put("SNIPER", new OneTime(
					bedwarsOneTimeObject.get("SNIPER").getAsJsonObject()));
			oneTimeMap.put("CUTTING_IT_CLOSE", new OneTime(
					bedwarsOneTimeObject.get("CUTTING_IT_CLOSE").getAsJsonObject()));
			oneTimeMap.put("BUGGY_BEDS", new OneTime(
					bedwarsOneTimeObject.get("BUGGY_BEDS").getAsJsonObject()));
			oneTimeMap.put("KATNISS_EVERDEEN_STYLE", new OneTime(
					bedwarsOneTimeObject.get("KATNISS_EVERDEEN_STYLE").getAsJsonObject()));
			oneTimeMap.put("BUILDER", new OneTime(
					bedwarsOneTimeObject.get("BUILDER").getAsJsonObject()));
			oneTimeMap.put("OUT_OF_STOCK", new OneTime(
					bedwarsOneTimeObject.get("OUT_OF_STOCK").getAsJsonObject()));
			oneTimeMap.put("SUPER_LOOTER", new OneTime(
					bedwarsOneTimeObject.get("SUPER_LOOTER").getAsJsonObject()));
			oneTimeMap.put("REVENGE", new OneTime(
					bedwarsOneTimeObject.get("REVENGE").getAsJsonObject()));
			oneTimeMap.put("ALCHEMIST", new OneTime(
					bedwarsOneTimeObject.get("ALCHEMIST").getAsJsonObject()));
			oneTimeMap.put("ULTIMATE_DEFENSE", new OneTime(
					bedwarsOneTimeObject.get("ULTIMATE_DEFENSE").getAsJsonObject()));
			oneTimeMap.put("FIREBALLS", new OneTime(
					bedwarsOneTimeObject.get("FIREBALLS").getAsJsonObject()));
			oneTimeMap.put("BOMBER", new OneTime(
					bedwarsOneTimeObject.get("BOMBER").getAsJsonObject()));
			oneTimeMap.put("SHEAR_LUCK", new OneTime(
					bedwarsOneTimeObject.get("SHEAR_LUCK").getAsJsonObject()));
			oneTimeMap.put("SURVIVOR", new OneTime(
					bedwarsOneTimeObject.get("SURVIVOR").getAsJsonObject()));
			oneTimeMap.put("DIAMOND_HOARDER", new OneTime(
					bedwarsOneTimeObject.get("DIAMOND_HOARDER").getAsJsonObject()));
			oneTimeMap.put("SLAYER", new OneTime(
					bedwarsOneTimeObject.get("SLAYER").getAsJsonObject()));
			oneTimeMap.put("SAVVY_SHOPPER", new OneTime(
					bedwarsOneTimeObject.get("SAVVY_SHOPPER").getAsJsonObject()));
			oneTimeMap.put("BED_TRAP", new OneTime(
					bedwarsOneTimeObject.get("BED_TRAP").getAsJsonObject()));
			oneTimeMap.put("ITS_DARK_DOWN_THERE", new OneTime(
					bedwarsOneTimeObject.get("ITS_DARK_DOWN_THERE").getAsJsonObject()));
			oneTimeMap.put("TEAM_PLAYER", new OneTime(
					bedwarsOneTimeObject.get("TEAM_PLAYER").getAsJsonObject()));
			oneTimeMap.put("MISSION_CONTROL", new OneTime(
					bedwarsOneTimeObject.get("MISSION_CONTROL").getAsJsonObject()));
			oneTimeMap.put("DONT_NEED_BED", new OneTime(
					bedwarsOneTimeObject.get("DONT_NEED_BED").getAsJsonObject()));
			oneTimeMap.put("MERCILESS", new OneTime(
					bedwarsOneTimeObject.get("MERCILESS").getAsJsonObject()));
			oneTimeMap.put("STAY_AWAY_FROM_ME", new OneTime(
					bedwarsOneTimeObject.get("STAY_AWAY_FROM_ME").getAsJsonObject()));
			oneTimeMap.put("GOLEM", new OneTime(
					bedwarsOneTimeObject.get("GOLEM").getAsJsonObject()));
			oneTimeMap.put("REJOINING_THE_DREAM", new OneTime(
					bedwarsOneTimeObject.get("REJOINING_THE_DREAM").getAsJsonObject()));
			oneTimeMap.put("THE_LAST_OF_US", new OneTime(
					bedwarsOneTimeObject.get("THE_LAST_OF_US").getAsJsonObject()));
			oneTimeMap.put("SNEAKY_RUSHER", new OneTime(
					bedwarsOneTimeObject.get("SNEAKY_RUSHER").getAsJsonObject()));
			oneTimeMap.put("PICKAXE_CHALLENGE", new OneTime(
					bedwarsOneTimeObject.get("PICKAXE_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("FIRST", new OneTime(
					bedwarsOneTimeObject.get("FIRST").getAsJsonObject()));
			oneTimeMap.put("DESTROY_BEDS", new OneTime(
					bedwarsOneTimeObject.get("DESTROY_BEDS").getAsJsonObject()));
			oneTimeMap.put("FIRST_BLOOD", new OneTime(
					bedwarsOneTimeObject.get("FIRST_BLOOD").getAsJsonObject()));
			oneTimeMap.put("GETTING_THE_JOB_DONE_BETTER", new OneTime(
					bedwarsOneTimeObject.get("GETTING_THE_JOB_DONE_BETTER").getAsJsonObject()));

			tieredMap.put("COLLECTORS_EDITION", new Tiered(
					bedwarsTieredObject.get("COLLECTORS_EDITION").getAsJsonObject()));
			tieredMap.put("BEDWARS_KILLER", new Tiered(
					bedwarsTieredObject.get("BEDWARS_KILLER").getAsJsonObject()));
			tieredMap.put("LEVEL", new Tiered(
					bedwarsTieredObject.get("LEVEL").getAsJsonObject()));
			tieredMap.put("WINS", new Tiered(
					bedwarsTieredObject.get("WINS").getAsJsonObject()));
			tieredMap.put("BEDS", new Tiered(
					bedwarsTieredObject.get("BEDS").getAsJsonObject()));
			tieredMap.put("LOOT_BOX", new Tiered(
					bedwarsTieredObject.get("LOOT_BOX").getAsJsonObject()));
		}

		/**
		 * Get Bedwars One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Bedwars Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Blitz Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Blitz {

		final JsonObject blitzObject;
		final JsonObject blitzOneTimeObject;
		final JsonObject blitzTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Blitz(JsonObject blitzObject) {
			this.blitzObject = blitzObject;
			this.blitzOneTimeObject = blitzObject.get("one_time").getAsJsonObject();
			this.blitzTieredObject = blitzObject.get("tiered").getAsJsonObject();
			putBlitzData();
		}

		void putBlitzData() {

			oneTimeMap.put("DONKEYTAMER_MASTER", new OneTime(
					blitzOneTimeObject.get("DONKEYTAMER_MASTER").getAsJsonObject()));
			oneTimeMap.put("FIND_BLITZ", new OneTime(
					blitzOneTimeObject.get("FIND_BLITZ").getAsJsonObject()));
			oneTimeMap.put("TITANIUM", new OneTime(
					blitzOneTimeObject.get("TITANIUM").getAsJsonObject()));
			oneTimeMap.put("RAMPAGE", new OneTime(
					blitzOneTimeObject.get("RAMPAGE").getAsJsonObject()));
			oneTimeMap.put("NICKNAME", new OneTime(
					blitzOneTimeObject.get("NICKNAME").getAsJsonObject()));
			oneTimeMap.put("WIN_BEFORE_DEATHMATCH", new OneTime(
					blitzOneTimeObject.get("WIN_BEFORE_DEATHMATCH").getAsJsonObject()));
			oneTimeMap.put("LUCKY_MINIONS", new OneTime(
					blitzOneTimeObject.get("LUCKY_MINIONS").getAsJsonObject()));
			oneTimeMap.put("FULL_INVENTORY", new OneTime(
					blitzOneTimeObject.get("FULL_INVENTORY").getAsJsonObject()));
			oneTimeMap.put("FINALLY", new OneTime(
					blitzOneTimeObject.get("FINALLY").getAsJsonObject()));
			oneTimeMap.put("BLITZ_MANIAC", new OneTime(
					blitzOneTimeObject.get("BLITZ_MANIAC").getAsJsonObject()));
			oneTimeMap.put("ULTIMATE_PRESTIGER", new OneTime(
					blitzOneTimeObject.get("ULTIMATE_PRESTIGER").getAsJsonObject()));
			oneTimeMap.put("SO_SHINY", new OneTime(
					blitzOneTimeObject.get("SO_SHINY").getAsJsonObject()));
			oneTimeMap.put("ENCHANT_SWORD", new OneTime(
					blitzOneTimeObject.get("ENCHANT_SWORD").getAsJsonObject()));
			oneTimeMap.put("ENCHANTED_ARMOR", new OneTime(
					blitzOneTimeObject.get("ENCHANTED_ARMOR").getAsJsonObject()));
			oneTimeMap.put("SPAWN_HORSE", new OneTime(
					blitzOneTimeObject.get("SPAWN_HORSE").getAsJsonObject()));
			oneTimeMap.put("CHAMPION", new OneTime(
					blitzOneTimeObject.get("CHAMPION").getAsJsonObject()));
			oneTimeMap.put("INVINCIBLE", new OneTime(
					blitzOneTimeObject.get("INVINCIBLE").getAsJsonObject()));
			oneTimeMap.put("FIND_HEAD", new OneTime(
					blitzOneTimeObject.get("FIND_HEAD").getAsJsonObject()));
			oneTimeMap.put("SEVEN_KITS", new OneTime(
					blitzOneTimeObject.get("SEVEN_KITS").getAsJsonObject()));
			oneTimeMap.put("PHOENIX_MASTER", new OneTime(
					blitzOneTimeObject.get("PHOENIX_MASTER").getAsJsonObject()));
			oneTimeMap.put("FISH_KILL", new OneTime(
					blitzOneTimeObject.get("FISH_KILL").getAsJsonObject()));
			oneTimeMap.put("NO_REGRETS", new OneTime(
					blitzOneTimeObject.get("NO_REGRETS").getAsJsonObject()));
			oneTimeMap.put("ULTIMATE_COMBATANT", new OneTime(
					blitzOneTimeObject.get("ULTIMATE_COMBATANT").getAsJsonObject()));
			oneTimeMap.put("ULTIMATE_COMPLETIST", new OneTime(
					blitzOneTimeObject.get("ULTIMATE_COMPLETIST").getAsJsonObject()));
			oneTimeMap.put("COOKING_EXPERT", new OneTime(
					blitzOneTimeObject.get("COOKING_EXPERT").getAsJsonObject()));
			oneTimeMap.put("FIRST_RANGER", new OneTime(
					blitzOneTimeObject.get("FIRST_RANGER").getAsJsonObject()));
			oneTimeMap.put("PIGRIDER", new OneTime(
					blitzOneTimeObject.get("PIGRIDER").getAsJsonObject()));
			oneTimeMap.put("RAMBO", new OneTime(
					blitzOneTimeObject.get("RAMBO").getAsJsonObject()));
			oneTimeMap.put("COLLECTOR", new OneTime(
					blitzOneTimeObject.get("COLLECTOR").getAsJsonObject()));
			oneTimeMap.put("CRAFT_BREAD", new OneTime(
					blitzOneTimeObject.get("CRAFT_BREAD").getAsJsonObject()));
			oneTimeMap.put("FIRST_BLOOD", new OneTime(
					blitzOneTimeObject.get("FIRST_BLOOD").getAsJsonObject()));
			oneTimeMap.put("CLOSE_CALL", new OneTime(
					blitzOneTimeObject.get("CLOSE_CALL").getAsJsonObject()));
			oneTimeMap.put("USE_WOLF_TAMER", new OneTime(
					blitzOneTimeObject.get("USE_WOLF_TAMER").getAsJsonObject()));
			oneTimeMap.put("EXPERIMENTATION", new OneTime(
					blitzOneTimeObject.get("EXPERIMENTATION").getAsJsonObject()));
			oneTimeMap.put("SAFETY_FIRST", new OneTime(
					blitzOneTimeObject.get("SAFETY_FIRST").getAsJsonObject()));
			oneTimeMap.put("FIRST_GAME", new OneTime(
					blitzOneTimeObject.get("FIRST_GAME").getAsJsonObject()));
			oneTimeMap.put("RABBITS_FOOT", new OneTime(
					blitzOneTimeObject.get("RABBITS_FOOT").getAsJsonObject()));
			oneTimeMap.put("KILL_WITHOUT_KIT", new OneTime(
					blitzOneTimeObject.get("KILL_WITHOUT_KIT").getAsJsonObject()));
			oneTimeMap.put("APOCALYPSE", new OneTime(
					blitzOneTimeObject.get("APOCALYPSE").getAsJsonObject()));
			oneTimeMap.put("NOT_SKYWARS", new OneTime(
					blitzOneTimeObject.get("NOT_SKYWARS").getAsJsonObject()));
			oneTimeMap.put("UNFORTUNATE", new OneTime(
					blitzOneTimeObject.get("UNFORTUNATE").getAsJsonObject()));
			oneTimeMap.put("BRUTAL_WARRIOR", new OneTime(
					blitzOneTimeObject.get("BRUTAL_WARRIOR").getAsJsonObject()));
			oneTimeMap.put("TOO_BASIC", new OneTime(
					blitzOneTimeObject.get("TOO_BASIC").getAsJsonObject()));
			oneTimeMap.put("SAIL_AWAY", new OneTime(
					blitzOneTimeObject.get("SAIL_AWAY").getAsJsonObject()));
			oneTimeMap.put("GET_DIAMOND_SWORD", new OneTime(
					blitzOneTimeObject.get("GET_DIAMOND_SWORD").getAsJsonObject()));
			oneTimeMap.put("UNSTOPPABLE", new OneTime(
					blitzOneTimeObject.get("UNSTOPPABLE").getAsJsonObject()));
			oneTimeMap.put("NO_PROBLEM", new OneTime(
					blitzOneTimeObject.get("NO_PROBLEM").getAsJsonObject()));
			oneTimeMap.put("AFTERBURNER", new OneTime(
					blitzOneTimeObject.get("AFTERBURNER").getAsJsonObject()));
			oneTimeMap.put("MAX_BLITZ", new OneTime(
					blitzOneTimeObject.get("MAX_BLITZ").getAsJsonObject()));
			oneTimeMap.put("EVEN_SHINIER", new OneTime(
					blitzOneTimeObject.get("EVEN_SHINIER").getAsJsonObject()));
			oneTimeMap.put("COIN_FESTIVAL", new OneTime(
					blitzOneTimeObject.get("COIN_FESTIVAL").getAsJsonObject()));
			oneTimeMap.put("BOMBERMAN", new OneTime(
					blitzOneTimeObject.get("BOMBERMAN").getAsJsonObject()));
			oneTimeMap.put("PREFERENCE", new OneTime(
					blitzOneTimeObject.get("PREFERENCE").getAsJsonObject()));
			oneTimeMap.put("NO_LOOTING", new OneTime(
					blitzOneTimeObject.get("NO_LOOTING").getAsJsonObject()));
			oneTimeMap.put("LEVEL_SEVEN", new OneTime(
					blitzOneTimeObject.get("LEVEL_SEVEN").getAsJsonObject()));
			oneTimeMap.put("UNDER_THE_SEA", new OneTime(
					blitzOneTimeObject.get("UNDER_THE_SEA").getAsJsonObject()));

			tieredMap.put("KIT_COLLECTOR", new Tiered(
					blitzTieredObject.get("KIT_COLLECTOR").getAsJsonObject()));
			tieredMap.put("KIT_EXPERT", new Tiered(
					blitzTieredObject.get("KIT_EXPERT").getAsJsonObject()));
			tieredMap.put("RNG_MASTER", new Tiered(
					blitzTieredObject.get("RNG_MASTER").getAsJsonObject()));
			tieredMap.put("MASTER_OF_KITS", new Tiered(
					blitzTieredObject.get("MASTER_OF_KITS").getAsJsonObject()));
			tieredMap.put("WAR_VETERAN", new Tiered(
					blitzTieredObject.get("WAR_VETERAN").getAsJsonObject()));
			tieredMap.put("KILLS", new Tiered(
					blitzTieredObject.get("KILLS").getAsJsonObject()));
			tieredMap.put("RANGED_COMBAT", new Tiered(
					blitzTieredObject.get("RANGED_COMBAT").getAsJsonObject()));
			tieredMap.put("COINS", new Tiered(
					blitzTieredObject.get("COINS").getAsJsonObject()));
			tieredMap.put("LOOTER", new Tiered(
					blitzTieredObject.get("LOOTER").getAsJsonObject()));
			tieredMap.put("FIGHTING_EXPERT", new Tiered(
					blitzTieredObject.get("FIGHTING_EXPERT").getAsJsonObject()));
			tieredMap.put("TREASURE_SEEKER", new Tiered(
					blitzTieredObject.get("TREASURE_SEEKER").getAsJsonObject()));
			tieredMap.put("KIT_EXPERIENCE_COLLECTOR", new Tiered(
					blitzTieredObject.get("KIT_EXPERIENCE_COLLECTOR").getAsJsonObject()));
			tieredMap.put("MOB_MASTER", new Tiered(
					blitzTieredObject.get("MOB_MASTER").getAsJsonObject()));
			tieredMap.put("WINS", new Tiered(
					blitzTieredObject.get("WINS").getAsJsonObject()));
			tieredMap.put("WINS_TEAMS", new Tiered(
					blitzTieredObject.get("WINS_TEAMS").getAsJsonObject()));
		}

		/**
		 * Get Blitz One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Blitz Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Build Battle Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class BuildBattle {
		final JsonObject buildBattleObject;
		final JsonObject buildBattleOneTimeObject;
		final JsonObject buildBattleTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public BuildBattle(JsonObject buildBattleObject) {
			this.buildBattleObject = buildBattleObject;
			this.buildBattleOneTimeObject = buildBattleObject.get("one_time").getAsJsonObject();
			this.buildBattleTieredObject = buildBattleObject.get("tiered").getAsJsonObject();
			putBuildBattleData();
		}

		void putBuildBattleData() {

			oneTimeMap.put("GUESSING_STREAK", new OneTime(
					buildBattleOneTimeObject.get("GUESSING_STREAK").getAsJsonObject()));
			oneTimeMap.put("OOO_SHINY", new OneTime(
					buildBattleOneTimeObject.get("OOO_SHINY").getAsJsonObject()));
			oneTimeMap.put("MOBSTER", new OneTime(
					buildBattleOneTimeObject.get("MOBSTER").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY", new OneTime(
					buildBattleOneTimeObject.get("LEGENDARY").getAsJsonObject()));
			oneTimeMap.put("FAST_TYPER", new OneTime(
					buildBattleOneTimeObject.get("FAST_TYPER").getAsJsonObject()));
			oneTimeMap.put("INTUITION", new OneTime(
					buildBattleOneTimeObject.get("INTUITION").getAsJsonObject()));
			oneTimeMap.put("PROFESSIONAL_BUILDER", new OneTime(
					buildBattleOneTimeObject.get("PROFESSIONAL_BUILDER").getAsJsonObject()));
			oneTimeMap.put("CLASSIC_MAN", new OneTime(
					buildBattleOneTimeObject.get("CLASSIC_MAN").getAsJsonObject()));
			oneTimeMap.put("STENOGRAPHER", new OneTime(
					buildBattleOneTimeObject.get("STENOGRAPHER").getAsJsonObject()));
			oneTimeMap.put("OBVIOUS", new OneTime(
					buildBattleOneTimeObject.get("OBVIOUS").getAsJsonObject()));
			oneTimeMap.put("NO_MISTAKES", new OneTime(
					buildBattleOneTimeObject.get("NO_MISTAKES").getAsJsonObject()));
			oneTimeMap.put("BRANIAC", new OneTime(
					buildBattleOneTimeObject.get("BRANIAC").getAsJsonObject()));
			oneTimeMap.put("ARTIST", new OneTime(
					buildBattleOneTimeObject.get("ARTIST").getAsJsonObject()));
			oneTimeMap.put("FANCY", new OneTime(
					buildBattleOneTimeObject.get("FANCY").getAsJsonObject()));
			oneTimeMap.put("OVER_99", new OneTime(
					buildBattleOneTimeObject.get("OVER_99").getAsJsonObject()));
			oneTimeMap.put("PRO_WINNER", new OneTime(
					buildBattleOneTimeObject.get("PRO_WINNER").getAsJsonObject()));
			oneTimeMap.put("TEAMWORK", new OneTime(
					buildBattleOneTimeObject.get("TEAMWORK").getAsJsonObject()));
			oneTimeMap.put("THAT_WOOD_BE_PERFECT", new OneTime(
					buildBattleOneTimeObject.get("THAT_WOOD_BE_PERFECT").getAsJsonObject()));
			oneTimeMap.put("EVERY_SECOND_COUNTS", new OneTime(
					buildBattleOneTimeObject.get("EVERY_SECOND_COUNTS").getAsJsonObject()));
			oneTimeMap.put("SUPERIOR_VOTE", new OneTime(
					buildBattleOneTimeObject.get("SUPERIOR_VOTE").getAsJsonObject()));
			oneTimeMap.put("MUSICIAN", new OneTime(
					buildBattleOneTimeObject.get("MUSICIAN").getAsJsonObject()));
			oneTimeMap.put("PERFECT_HARMONY", new OneTime(
					buildBattleOneTimeObject.get("PERFECT_HARMONY").getAsJsonObject()));
			oneTimeMap.put("THE_HAT_MASTER", new OneTime(
					buildBattleOneTimeObject.get("THE_HAT_MASTER").getAsJsonObject()));


			tieredMap.put("BUILD_BATTLE_VOTER", new Tiered(
					buildBattleTieredObject.get("BUILD_BATTLE_VOTER").getAsJsonObject()));
			tieredMap.put("GUESS_THE_BUILD_GUESSES", new Tiered(
					buildBattleTieredObject.get("GUESS_THE_BUILD_GUESSES").getAsJsonObject()));
			tieredMap.put("BUILD_BATTLE_POINTS", new Tiered(
					buildBattleTieredObject.get("BUILD_BATTLE_POINTS").getAsJsonObject()));
			tieredMap.put("GUESS_THE_BUILD_WINNER", new Tiered(
					buildBattleTieredObject.get("GUESS_THE_BUILD_WINNER").getAsJsonObject()));
			tieredMap.put("BUILD_BATTLE_SCORE", new Tiered(
					buildBattleTieredObject.get("BUILD_BATTLE_SCORE").getAsJsonObject()));

		}

		/**
		 * Get Build Battle One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Build Battle Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Christmas Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Christmas {

		final JsonObject christmasObject;
		final JsonObject christmasOneTimeObject;
		final JsonObject christmasTieredObject;

		final Map<String, GlobalOneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Christmas(JsonObject christmasObject) {
			this.christmasObject = christmasObject;
			this.christmasOneTimeObject = christmasObject.get("one_time").getAsJsonObject();
			this.christmasTieredObject = christmasObject.get("tiered").getAsJsonObject();
			putChristmasData();
		}

		void putChristmasData() {

			oneTimeMap.put("GREED_INCARNATE", new GlobalOneTime(
					christmasOneTimeObject.get("GREED_INCARNATE").getAsJsonObject()));
			oneTimeMap.put("RESPECT_YOUR_ELDER", new GlobalOneTime(
					christmasOneTimeObject.get("RESPECT_YOUR_ELDER").getAsJsonObject()));
			oneTimeMap.put("EXPLOSIVE_CANDY", new GlobalOneTime(
					christmasOneTimeObject.get("EXPLOSIVE_CANDY").getAsJsonObject()));
			oneTimeMap.put("CHRISTMAS_IS_SAVED", new GlobalOneTime(
					christmasOneTimeObject.get("CHRISTMAS_IS_SAVED").getAsJsonObject()));
			oneTimeMap.put("SNOW_WARS", new GlobalOneTime(
					christmasOneTimeObject.get("SNOW_WARS").getAsJsonObject()));
			oneTimeMap.put("REAL_SANTA_2020", new GlobalOneTime(
					christmasOneTimeObject.get("REAL_SANTA_2020").getAsJsonObject()));
			oneTimeMap.put("TO_WAR", new GlobalOneTime(
					christmasOneTimeObject.get("TO_WAR").getAsJsonObject()));
			oneTimeMap.put("SPREADING_LOVE", new GlobalOneTime(
					christmasOneTimeObject.get("SPREADING_LOVE").getAsJsonObject()));
			oneTimeMap.put("BIG_BAG_O_GIFTS", new GlobalOneTime(
					christmasOneTimeObject.get("BIG_BAG_O_GIFTS").getAsJsonObject()));
			oneTimeMap.put("RUSH", new GlobalOneTime(
					christmasOneTimeObject.get("RUSH").getAsJsonObject()));
			oneTimeMap.put("NEW_YEARS_CELEBRATIONS", new GlobalOneTime(
					christmasOneTimeObject.get("NEW_YEARS_CELEBRATIONS").getAsJsonObject()));
			oneTimeMap.put("HOLIDAY_MIRACLE", new GlobalOneTime(
					christmasOneTimeObject.get("HOLIDAY_MIRACLE").getAsJsonObject()));
			oneTimeMap.put("DO_YOU_WANNA_BUILD_A_SNOWMAN", new GlobalOneTime(
					christmasOneTimeObject.get("DO_YOU_WANNA_BUILD_A_SNOWMAN").getAsJsonObject()));
			oneTimeMap.put("BOUNCY_CASTLE", new GlobalOneTime(
					christmasOneTimeObject.get("BOUNCY_CASTLE").getAsJsonObject()));
			oneTimeMap.put("NOT_MY_MOM", new GlobalOneTime(
					christmasOneTimeObject.get("NOT_MY_MOM").getAsJsonObject()));
			oneTimeMap.put("HOLIDAYS_RUINED", new GlobalOneTime(
					christmasOneTimeObject.get("HOLIDAYS_RUINED").getAsJsonObject()));
			oneTimeMap.put("CLOSE_ENOUGH", new GlobalOneTime(
					christmasOneTimeObject.get("CLOSE_ENOUGH").getAsJsonObject()));
			oneTimeMap.put("WINTER_RUNNER", new GlobalOneTime(
					christmasOneTimeObject.get("WINTER_RUNNER").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY", new GlobalOneTime(
					christmasOneTimeObject.get("LEGENDARY").getAsJsonObject()));
			oneTimeMap.put("ICE_BREAKER", new GlobalOneTime(
					christmasOneTimeObject.get("ICE_BREAKER").getAsJsonObject()));
			oneTimeMap.put("GROOPO_RETURNS", new GlobalOneTime(
					christmasOneTimeObject.get("GROOPO_RETURNS").getAsJsonObject()));
			oneTimeMap.put("CHRISTMAS_TOPPER", new GlobalOneTime(
					christmasOneTimeObject.get("CHRISTMAS_TOPPER").getAsJsonObject()));
			oneTimeMap.put("FRIENDLY_FIRE", new GlobalOneTime(
					christmasOneTimeObject.get("FRIENDLY_FIRE").getAsJsonObject()));
			oneTimeMap.put("CHRISTMAS_QUEST", new GlobalOneTime(
					christmasOneTimeObject.get("CHRISTMAS_QUEST").getAsJsonObject()));
			oneTimeMap.put("UH_UH", new GlobalOneTime(
					christmasOneTimeObject.get("UH_UH").getAsJsonObject()));
			oneTimeMap.put("HUNT_BEGINS_2020", new GlobalOneTime(
					christmasOneTimeObject.get("HUNT_BEGINS_2020").getAsJsonObject()));
			oneTimeMap.put("BLACKSMITH", new GlobalOneTime(
					christmasOneTimeObject.get("BLACKSMITH").getAsJsonObject()));
			oneTimeMap.put("SUGAR_RUSH", new GlobalOneTime(
					christmasOneTimeObject.get("SUGAR_RUSH").getAsJsonObject()));
			oneTimeMap.put("DEM_COWS", new GlobalOneTime(
					christmasOneTimeObject.get("DEM_COWS").getAsJsonObject()));
			oneTimeMap.put("LET_IT_SNOW", new GlobalOneTime(
					christmasOneTimeObject.get("LET_IT_SNOW").getAsJsonObject()));
			oneTimeMap.put("MERRY_CHRISTMAS", new GlobalOneTime(
					christmasOneTimeObject.get("MERRY_CHRISTMAS").getAsJsonObject()));
			oneTimeMap.put("TODAYS_THE_DAY", new GlobalOneTime(
					christmasOneTimeObject.get("TODAYS_THE_DAY").getAsJsonObject()));
			oneTimeMap.put("SWEGMAS", new GlobalOneTime(
					christmasOneTimeObject.get("SWEGMAS").getAsJsonObject()));
			oneTimeMap.put("ICE_SPREADER", new GlobalOneTime(
					christmasOneTimeObject.get("ICE_SPREADER").getAsJsonObject()));
			oneTimeMap.put("FESTIVITIES", new GlobalOneTime(
					christmasOneTimeObject.get("FESTIVITIES").getAsJsonObject()));
			oneTimeMap.put("MELTING_KILLER", new GlobalOneTime(
					christmasOneTimeObject.get("MELTING_KILLER").getAsJsonObject()));
			oneTimeMap.put("EMPTY_HOUSE", new GlobalOneTime(
					christmasOneTimeObject.get("EMPTY_HOUSE").getAsJsonObject()));
			oneTimeMap.put("NOM_NOM", new GlobalOneTime(
					christmasOneTimeObject.get("NOM_NOM").getAsJsonObject()));

			tieredMap.put("BEST_PRESENTS", new Tiered(
					christmasTieredObject.get("BEST_PRESENTS").getAsJsonObject()));
			tieredMap.put("ADVENT_2020", new Tiered(
					christmasTieredObject.get("ADVENT_2020").getAsJsonObject()));
			tieredMap.put("PRESENT_COLLECTOR", new Tiered(
					christmasTieredObject.get("PRESENT_COLLECTOR").getAsJsonObject()));
			tieredMap.put("SANTA_SAYS_ROUNDS", new Tiered(
					christmasTieredObject.get("SANTA_SAYS_ROUNDS").getAsJsonObject()));
			tieredMap.put("NO_CHRISTMAS", new Tiered(
					christmasTieredObject.get("NO_CHRISTMAS").getAsJsonObject()));
			tieredMap.put("SECRET_SANTA", new Tiered(
					christmasTieredObject.get("SECRET_SANTA").getAsJsonObject()));
			tieredMap.put("ADVENT_2019", new Tiered(
					christmasTieredObject.get("ADVENT_2019").getAsJsonObject()));
			tieredMap.put("ADVENT", new Tiered(
					christmasTieredObject.get("ADVENT").getAsJsonObject()));
			tieredMap.put("ADVENT_2018", new Tiered(
					christmasTieredObject.get("ADVENT_2018").getAsJsonObject()));
		}

		/**
		 * Get Christmas One Time Achievements
		 */
		public Map<String, GlobalOneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Christmas Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * MCGO Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class MCGO {

		final JsonObject mcgoObject;
		final JsonObject mcgoOneTimeObject;
		final JsonObject mcgoTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public MCGO(JsonObject mcgoObject) {
			this.mcgoObject = mcgoObject;
			this.mcgoOneTimeObject = mcgoObject.get("one_time").getAsJsonObject();
			this.mcgoTieredObject = mcgoObject.get("tiered").getAsJsonObject();
			putMCGOData();
		}

		void putMCGOData() {

			oneTimeMap.put("OH_BABY_A_TRIPLE", new OneTime(
					mcgoOneTimeObject.get("OH_BABY_A_TRIPLE").getAsJsonObject()));
			oneTimeMap.put("GOLDEN_DEAGLE", new OneTime(
					mcgoOneTimeObject.get("GOLDEN_DEAGLE").getAsJsonObject()));
			oneTimeMap.put("ONE_SHOT_ONE_KIL", new OneTime(
					mcgoOneTimeObject.get("ONE_SHOT_ONE_KIL").getAsJsonObject()));
			oneTimeMap.put("RUN_AWAY", new OneTime(
					mcgoOneTimeObject.get("RUN_AWAY").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_COMPLETED", new OneTime(
					mcgoOneTimeObject.get("CHALLENGE_COMPLETED").getAsJsonObject()));
			oneTimeMap.put("ARMED_AND_DANGEROUS", new OneTime(
					mcgoOneTimeObject.get("ARMED_AND_DANGEROUS").getAsJsonObject()));
			oneTimeMap.put("LIKE_MY_GUN", new OneTime(
					mcgoOneTimeObject.get("LIKE_MY_GUN").getAsJsonObject()));
			oneTimeMap.put("FANCY_NEW_TOYS", new OneTime(
					mcgoOneTimeObject.get("FANCY_NEW_TOYS").getAsJsonObject()));
			oneTimeMap.put("RAISE_YOUR_VOICE", new OneTime(
					mcgoOneTimeObject.get("RAISE_YOUR_VOICE").getAsJsonObject()));
			oneTimeMap.put("UNSTOPPABLE", new OneTime(
					mcgoOneTimeObject.get("UNSTOPPABLE").getAsJsonObject()));
			oneTimeMap.put("UMADBRO", new OneTime(
					mcgoOneTimeObject.get("UMADBRO").getAsJsonObject()));
			oneTimeMap.put("MP5_STREAK", new OneTime(
					mcgoOneTimeObject.get("MP5_STREAK").getAsJsonObject()));
			oneTimeMap.put("DARUDE_SANDSTORM", new OneTime(
					mcgoOneTimeObject.get("DARUDE_SANDSTORM").getAsJsonObject()));
			oneTimeMap.put("P90_STREAK", new OneTime(
					mcgoOneTimeObject.get("P90_STREAK").getAsJsonObject()));
			oneTimeMap.put("GUN_MASTER", new OneTime(
					mcgoOneTimeObject.get("GUN_MASTER").getAsJsonObject()));
			oneTimeMap.put("WHERES_MY_NUKE", new OneTime(
					mcgoOneTimeObject.get("WHERES_MY_NUKE").getAsJsonObject()));
			oneTimeMap.put("HOMING_BULLETS", new OneTime(
					mcgoOneTimeObject.get("HOMING_BULLETS").getAsJsonObject()));
			oneTimeMap.put("PENTAAAA", new OneTime(
					mcgoOneTimeObject.get("PENTAAAA").getAsJsonObject()));
			oneTimeMap.put("HUNTING_SEASON", new OneTime(
					mcgoOneTimeObject.get("HUNTING_SEASON").getAsJsonObject()));
			oneTimeMap.put("BLASTED_TO_THE_MOON", new OneTime(
					mcgoOneTimeObject.get("BLASTED_TO_THE_MOON").getAsJsonObject()));
			oneTimeMap.put("THE_CARRIER", new OneTime(
					mcgoOneTimeObject.get("THE_CARRIER").getAsJsonObject()));
			oneTimeMap.put("SPECIAL_LOOKS", new OneTime(
					mcgoOneTimeObject.get("SPECIAL_LOOKS").getAsJsonObject()));
			oneTimeMap.put("ON_FIRE", new OneTime(
					mcgoOneTimeObject.get("ON_FIRE").getAsJsonObject()));
			oneTimeMap.put("COMEBACK_STORY", new OneTime(
					mcgoOneTimeObject.get("COMEBACK_STORY").getAsJsonObject()));
			oneTimeMap.put("SNEAK_KILL", new OneTime(
					mcgoOneTimeObject.get("SNEAK_KILL").getAsJsonObject()));
			oneTimeMap.put("WARFARE_STYLIST", new OneTime(
					mcgoOneTimeObject.get("WARFARE_STYLIST").getAsJsonObject()));
			oneTimeMap.put("IS_IT_GOOD_NOW", new OneTime(
					mcgoOneTimeObject.get("IS_IT_GOOD_NOW").getAsJsonObject()));
			oneTimeMap.put("HALF_THE_BATTLE", new OneTime(
					mcgoOneTimeObject.get("HALF_THE_BATTLE").getAsJsonObject()));
			oneTimeMap.put("CHARACTER_UPGRADES", new OneTime(
					mcgoOneTimeObject.get("CHARACTER_UPGRADES").getAsJsonObject()));
			oneTimeMap.put("FRIENDLY_FIRE", new OneTime(
					mcgoOneTimeObject.get("FRIENDLY_FIRE").getAsJsonObject()));
			oneTimeMap.put("STREET_ARTIST", new OneTime(
					mcgoOneTimeObject.get("STREET_ARTIST").getAsJsonObject()));
			oneTimeMap.put("NEVER_TOO_LATE", new OneTime(
					mcgoOneTimeObject.get("NEVER_TOO_LATE").getAsJsonObject()));
			oneTimeMap.put("QUAD_FLASH", new OneTime(
					mcgoOneTimeObject.get("QUAD_FLASH").getAsJsonObject()));
			oneTimeMap.put("SAMURAI_WARRIOR", new OneTime(
					mcgoOneTimeObject.get("SAMURAI_WARRIOR").getAsJsonObject()));
			oneTimeMap.put("SECRET_ORDER", new OneTime(
					mcgoOneTimeObject.get("SECRET_ORDER").getAsJsonObject()));
			oneTimeMap.put("TEAM_COMMUNICATOR", new OneTime(
					mcgoOneTimeObject.get("TEAM_COMMUNICATOR").getAsJsonObject()));
			oneTimeMap.put("ACE", new OneTime(
					mcgoOneTimeObject.get("ACE").getAsJsonObject()));
			oneTimeMap.put("TOO_EASY", new OneTime(
					mcgoOneTimeObject.get("TOO_EASY").getAsJsonObject()));
			oneTimeMap.put("JACK_OF_ALL_TRADES", new OneTime(
					mcgoOneTimeObject.get("JACK_OF_ALL_TRADES").getAsJsonObject()));
			oneTimeMap.put("WRECKING_MACHINE", new OneTime(
					mcgoOneTimeObject.get("WRECKING_MACHINE").getAsJsonObject()));
			oneTimeMap.put("KAMIKAZE", new OneTime(
					mcgoOneTimeObject.get("KAMIKAZE").getAsJsonObject()));
			oneTimeMap.put("CLOSE_CALL", new OneTime(
					mcgoOneTimeObject.get("CLOSE_CALL").getAsJsonObject()));
			oneTimeMap.put("SNIPER", new OneTime(
					mcgoOneTimeObject.get("SNIPER").getAsJsonObject()));
			oneTimeMap.put("GRAFITTI_KING", new OneTime(
					mcgoOneTimeObject.get("GRAFITTI_KING").getAsJsonObject()));
			oneTimeMap.put("BLIND_KILL", new OneTime(
					mcgoOneTimeObject.get("BLIND_KILL").getAsJsonObject()));
			oneTimeMap.put("GRENADE_KILL", new OneTime(
					mcgoOneTimeObject.get("GRENADE_KILL").getAsJsonObject()));
			oneTimeMap.put("DEATHMATCH_SPECIALIST", new OneTime(
					mcgoOneTimeObject.get("DEATHMATCH_SPECIALIST").getAsJsonObject()));
			oneTimeMap.put("FRIENDLY_GAME", new OneTime(
					mcgoOneTimeObject.get("FRIENDLY_GAME").getAsJsonObject()));
			oneTimeMap.put("SNEAKY", new OneTime(
					mcgoOneTimeObject.get("SNEAKY").getAsJsonObject()));
			oneTimeMap.put("TRIIPPLEE", new OneTime(
					mcgoOneTimeObject.get("TRIIPPLEE").getAsJsonObject()));
			oneTimeMap.put("FLAWLESS", new OneTime(
					mcgoOneTimeObject.get("FLAWLESS").getAsJsonObject()));

			tieredMap.put("CAC_BANKER", new Tiered(
					mcgoTieredObject.get("CAC_BANKER").getAsJsonObject()));
			tieredMap.put("BOMB_SPECIALIST", new Tiered(
					mcgoTieredObject.get("BOMB_SPECIALIST").getAsJsonObject()));
			tieredMap.put("PRACTICE_MAKES_PERFECT", new Tiered(
					mcgoTieredObject.get("PRACTICE_MAKES_PERFECT").getAsJsonObject()));
			tieredMap.put("SERIAL_KILLER", new Tiered(
					mcgoTieredObject.get("SERIAL_KILLER").getAsJsonObject()));
			tieredMap.put("HEADSHOT_KILLS", new Tiered(
					mcgoTieredObject.get("HEADSHOT_KILLS").getAsJsonObject()));
			tieredMap.put("GRENADE_KILLS", new Tiered(
					mcgoTieredObject.get("GRENADE_KILLS").getAsJsonObject()));
			tieredMap.put("HERO_TERRORIST", new Tiered(
					mcgoTieredObject.get("HERO_TERRORIST").getAsJsonObject()));

		}

		/**
		 * Get MCGO Onte Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get MCGO Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Duels Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Duels {
		final JsonObject duelsObject;
		final JsonObject duelsOneTimeObject;
		final JsonObject duelsTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Duels(JsonObject duelsObject) {
			this.duelsObject = duelsObject;
			this.duelsOneTimeObject = duelsObject.get("one_time").getAsJsonObject();
			this.duelsTieredObject = duelsObject.get("tiered").getAsJsonObject();
			putDuelsData();
		}

		void putDuelsData() {
			oneTimeMap.put("GONE_FISHING", new OneTime(
					duelsOneTimeObject.get("GONE_FISHING").getAsJsonObject()));
			oneTimeMap.put("ON_FIRE", new OneTime(
					duelsOneTimeObject.get("ON_FIRE").getAsJsonObject()));
			oneTimeMap.put("CLOSE_CALL", new OneTime(
					duelsOneTimeObject.get("CLOSE_CALL").getAsJsonObject()));
			oneTimeMap.put("SHUT_DOWN", new OneTime(
					duelsOneTimeObject.get("SHUT_DOWN").getAsJsonObject()));
			oneTimeMap.put("MY_PREFERENCE", new OneTime(
					duelsOneTimeObject.get("MY_PREFERENCE").getAsJsonObject()));
			oneTimeMap.put("WELL_ROUNDED", new OneTime(
					duelsOneTimeObject.get("WELL_ROUNDED").getAsJsonObject()));
			oneTimeMap.put("COMMUNITY_ORIENTED", new OneTime(
					duelsOneTimeObject.get("COMMUNITY_ORIENTED").getAsJsonObject()));
			oneTimeMap.put("GG", new OneTime(
					duelsOneTimeObject.get("GG").getAsJsonObject()));
			oneTimeMap.put("CARRIED", new OneTime(
					duelsOneTimeObject.get("CARRIED").getAsJsonObject()));
			oneTimeMap.put("REPLAY", new OneTime(
					duelsOneTimeObject.get("REPLAY").getAsJsonObject()));
			oneTimeMap.put("DOMINATION", new OneTime(
					duelsOneTimeObject.get("DOMINATION").getAsJsonObject()));
			oneTimeMap.put("HAWK_EYE", new OneTime(
					duelsOneTimeObject.get("HAWK_EYE").getAsJsonObject()));
			oneTimeMap.put("REVENGE", new OneTime(
					duelsOneTimeObject.get("REVENGE").getAsJsonObject()));
			oneTimeMap.put("THE_WAITING_GAME", new OneTime(
					duelsOneTimeObject.get("THE_WAITING_GAME").getAsJsonObject()));
			oneTimeMap.put("FORTIFICATION", new OneTime(
					duelsOneTimeObject.get("FORTIFICATION").getAsJsonObject()));
			oneTimeMap.put("BURN_BABY_BURN", new OneTime(
					duelsOneTimeObject.get("BURN_BABY_BURN").getAsJsonObject()));
			oneTimeMap.put("TRIAL_BY_COMBAT", new OneTime(
					duelsOneTimeObject.get("TRIAL_BY_COMBAT").getAsJsonObject()));
			oneTimeMap.put("BUILD_BATTLE", new OneTime(
					duelsOneTimeObject.get("BUILD_BATTLE").getAsJsonObject()));
			oneTimeMap.put("REMATCH", new OneTime(
					duelsOneTimeObject.get("REMATCH").getAsJsonObject()));
			oneTimeMap.put("SUMMONER", new OneTime(
					duelsOneTimeObject.get("SUMMONER").getAsJsonObject()));
			oneTimeMap.put("UNTOUCHABLE", new OneTime(
					duelsOneTimeObject.get("UNTOUCHABLE").getAsJsonObject()));
			oneTimeMap.put("EXPRESS_YOURSELF", new OneTime(
					duelsOneTimeObject.get("EXPRESS_YOURSELF").getAsJsonObject()));
			oneTimeMap.put("HUNGRY", new OneTime(
					duelsOneTimeObject.get("HUNGRY").getAsJsonObject()));
			oneTimeMap.put("LOBBY_SLAYER", new OneTime(
					duelsOneTimeObject.get("LOBBY_SLAYER").getAsJsonObject()));
			oneTimeMap.put("SPEED_DUEL", new OneTime(
					duelsOneTimeObject.get("SPEED_DUEL").getAsJsonObject()));
			oneTimeMap.put("NINJA", new OneTime(
					duelsOneTimeObject.get("NINJA").getAsJsonObject()));
			oneTimeMap.put("NOT_CLOSE_AT_ALL", new OneTime(
					duelsOneTimeObject.get("NOT_CLOSE_AT_ALL").getAsJsonObject()));
			oneTimeMap.put("VOID_ARCHER", new OneTime(
					duelsOneTimeObject.get("VOID_ARCHER").getAsJsonObject()));
			oneTimeMap.put("SPEEDY_SUMO", new OneTime(
					duelsOneTimeObject.get("SPEEDY_SUMO").getAsJsonObject()));
			oneTimeMap.put("GOT_YA", new OneTime(
					duelsOneTimeObject.get("GOT_YA").getAsJsonObject()));
			oneTimeMap.put("LAST_STAND", new OneTime(
					duelsOneTimeObject.get("LAST_STAND").getAsJsonObject()));
			oneTimeMap.put("HAT_TRICK", new OneTime(
					duelsOneTimeObject.get("HAT_TRICK").getAsJsonObject()));
			oneTimeMap.put("GETTING_LOOT", new OneTime(
					duelsOneTimeObject.get("GETTING_LOOT").getAsJsonObject()));
			oneTimeMap.put("AXE_YOU_A_QUESTION", new OneTime(
					duelsOneTimeObject.get("AXE_YOU_A_QUESTION").getAsJsonObject()));
			oneTimeMap.put("CLEAN_SWEEP", new OneTime(
					duelsOneTimeObject.get("CLEAN_SWEEP").getAsJsonObject()));
			oneTimeMap.put("HEART_HOARDER", new OneTime(
					duelsOneTimeObject.get("HEART_HOARDER").getAsJsonObject()));
			oneTimeMap.put("ACE", new OneTime(
					duelsOneTimeObject.get("ACE").getAsJsonObject()));
			oneTimeMap.put("NOT_HUNGARY", new OneTime(
					duelsOneTimeObject.get("NOT_HUNGARY").getAsJsonObject()));
			oneTimeMap.put("TEAM_PLAYER", new OneTime(
					duelsOneTimeObject.get("TEAM_PLAYER").getAsJsonObject()));
			oneTimeMap.put("ONE_V_ONE_ME", new OneTime(
					duelsOneTimeObject.get("ONE_V_ONE_ME").getAsJsonObject()));

			tieredMap.put("DUELS_DIVISION", new Tiered(
					duelsTieredObject.get("DUELS_DIVISION").getAsJsonObject()));
			tieredMap.put("BRIDGE_FOUR_TEAMS_WINS", new Tiered(
					duelsTieredObject.get("BRIDGE_FOUR_TEAMS_WINS").getAsJsonObject()));
			tieredMap.put("DUELS_WINNER", new Tiered(
					duelsTieredObject.get("DUELS_WINNER").getAsJsonObject()));
			tieredMap.put("DUELS_WIN_STREAK", new Tiered(
					duelsTieredObject.get("DUELS_WIN_STREAK").getAsJsonObject()));
			tieredMap.put("BRIDGE_WINS", new Tiered(
					duelsTieredObject.get("BRIDGE_WINS").getAsJsonObject()));
			tieredMap.put("BRIDGE_DOUBLES_WINS", new Tiered(
					duelsTieredObject.get("BRIDGE_DOUBLES_WINS").getAsJsonObject()));
			tieredMap.put("GOALS", new Tiered(
					duelsTieredObject.get("GOALS").getAsJsonObject()));
			tieredMap.put("BRIDGE_TEAMS_WINS", new Tiered(
					duelsTieredObject.get("BRIDGE_TEAMS_WINS").getAsJsonObject()));
			tieredMap.put("DUELS_TRAVELLER", new Tiered(
					duelsTieredObject.get("DUELS_TRAVELLER").getAsJsonObject()));
			tieredMap.put("BRIDGE_WIN_STREAK", new Tiered(
					duelsTieredObject.get("BRIDGE_WIN_STREAK").getAsJsonObject()));
			tieredMap.put("BRIDGE_DUELS_WINS", new Tiered(
					duelsTieredObject.get("BRIDGE_DUELS_WINS").getAsJsonObject()));
			tieredMap.put("UNIQUE_MAP_WINS", new Tiered(
					duelsTieredObject.get("UNIQUE_MAP_WINS").getAsJsonObject()));
			tieredMap.put("DUELS_TROPHIES", new Tiered(
					duelsTieredObject.get("DUELS_TROPHIES").getAsJsonObject()));
		}

		/**
		 * Get Duels One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Duels Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Easter Achievements Data
	 *
	 * @author Kokahviel
	 * @since 3.0
	 */
	public static class Easter {

		final JsonObject easterObject;
		final JsonObject easterOneTimeObject;
		final JsonObject easterTieredObject;

		final Map<String, GlobalOneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Easter(JsonObject easterObject) {
			this.easterObject = easterObject;
			this.easterOneTimeObject = easterObject.get("one_time").getAsJsonObject();
			this.easterTieredObject = easterObject.get("tiered").getAsJsonObject();
			putEasterData();
		}

		void putEasterData() {

			oneTimeMap.put("ALL_EGGS_2019", new GlobalOneTime(
					easterOneTimeObject.get("ALL_EGGS_2019").getAsJsonObject()));
			oneTimeMap.put("HAPPY_EASTER_2019", new GlobalOneTime(
					easterOneTimeObject.get("HAPPY_EASTER_2019").getAsJsonObject()));
			oneTimeMap.put("FIRST_EGG_2019", new GlobalOneTime(
					easterOneTimeObject.get("FIRST_EGG_2019").getAsJsonObject()));
			oneTimeMap.put("FIRST_EGG_2020", new GlobalOneTime(
					easterOneTimeObject.get("FIRST_EGG_2020").getAsJsonObject()));
			oneTimeMap.put("ALL_EGGS_2020", new GlobalOneTime(
					easterOneTimeObject.get("ALL_EGGS_2020").getAsJsonObject()));
			oneTimeMap.put("HAPPY_EASTER_2020", new GlobalOneTime(
					easterOneTimeObject.get("HAPPY_EASTER_2020").getAsJsonObject()));
			oneTimeMap.put("EGG_BETRAYER", new GlobalOneTime(
					easterOneTimeObject.get("EGG_BETRAYER").getAsJsonObject()));
			oneTimeMap.put("SMASH_CLUCK_KILLS", new GlobalOneTime(
					easterOneTimeObject.get("SMASH_CLUCK_KILLS").getAsJsonObject()));
			oneTimeMap.put("SPRING_MAIDEN", new GlobalOneTime(
					easterOneTimeObject.get("SPRING_MAIDEN").getAsJsonObject()));
			oneTimeMap.put("ENVIRONMENT_PROTECTION", new GlobalOneTime(
					easterOneTimeObject.get("ENVIRONMENT_PROTECTION").getAsJsonObject()));
			oneTimeMap.put("ALL_EGGS_2021", new GlobalOneTime(
					easterOneTimeObject.get("ALL_EGGS_2021").getAsJsonObject()));
			oneTimeMap.put("EGG_MASTER", new GlobalOneTime(
					easterOneTimeObject.get("EGG_MASTER").getAsJsonObject()));
			oneTimeMap.put("CLOSE_ENOUGH", new GlobalOneTime(
					easterOneTimeObject.get("CLOSE_ENOUGH").getAsJsonObject()));
			oneTimeMap.put("BLITZ_SPAWN_RABBIT", new GlobalOneTime(
					easterOneTimeObject.get("BLITZ_SPAWN_RABBIT").getAsJsonObject()));
			oneTimeMap.put("CVC_GRENADES", new GlobalOneTime(
					easterOneTimeObject.get("CVC_GRENADES").getAsJsonObject()));
			oneTimeMap.put("EGG_ASSAULT", new GlobalOneTime(
					easterOneTimeObject.get("EGG_ASSAULT").getAsJsonObject()));
			oneTimeMap.put("ARCADE_CHICKEN_RACE", new GlobalOneTime(
					easterOneTimeObject.get("ARCADE_CHICKEN_RACE").getAsJsonObject()));
			oneTimeMap.put("EGG_LAYER", new GlobalOneTime(
					easterOneTimeObject.get("EGG_LAYER").getAsJsonObject()));
			oneTimeMap.put("WHAT_IS_THIS", new GlobalOneTime(
					easterOneTimeObject.get("WHAT_IS_THIS").getAsJsonObject()));
			oneTimeMap.put("EASTER_EGG", new GlobalOneTime(
					easterOneTimeObject.get("EASTER_EGG").getAsJsonObject()));
			oneTimeMap.put("PAINTBALL_LEEROY", new GlobalOneTime(
					easterOneTimeObject.get("PAINTBALL_LEEROY").getAsJsonObject()));
			oneTimeMap.put("INNER_RABBIT", new GlobalOneTime(
					easterOneTimeObject.get("INNER_RABBIT").getAsJsonObject()));
			oneTimeMap.put("MM_CARROT_KILLS", new GlobalOneTime(
					easterOneTimeObject.get("MM_CARROT_KILLS").getAsJsonObject()));
			oneTimeMap.put("UHC_GOLDEN_CARROT", new GlobalOneTime(
					easterOneTimeObject.get("UHC_GOLDEN_CARROT").getAsJsonObject()));
			oneTimeMap.put("SW_EGG_VOID", new GlobalOneTime(
					easterOneTimeObject.get("SW_EGG_VOID").getAsJsonObject()));
			oneTimeMap.put("WHAT_HAVE_WE_DONE", new GlobalOneTime(
					easterOneTimeObject.get("WHAT_HAVE_WE_DONE").getAsJsonObject()));
			oneTimeMap.put("SPRING_HERO", new GlobalOneTime(
					easterOneTimeObject.get("SPRING_HERO").getAsJsonObject()));
			oneTimeMap.put("PIT_DRAGON_EGG", new GlobalOneTime(
					easterOneTimeObject.get("PIT_DRAGON_EGG").getAsJsonObject()));
			oneTimeMap.put("WHATS_THIS", new GlobalOneTime(
					easterOneTimeObject.get("WHATS_THIS").getAsJsonObject()));
			oneTimeMap.put("SPRING_FISHING", new GlobalOneTime(
					easterOneTimeObject.get("SPRING_FISHING").getAsJsonObject()));
			oneTimeMap.put("HAPPY_EASTER_2021", new GlobalOneTime(
					easterOneTimeObject.get("HAPPY_EASTER_2021").getAsJsonObject()));
			oneTimeMap.put("TOWERWARS_CHICKENS", new GlobalOneTime(
					easterOneTimeObject.get("TOWERWARS_CHICKENS").getAsJsonObject()));
			oneTimeMap.put("BW_JUMP_BOOST", new GlobalOneTime(
					easterOneTimeObject.get("BW_JUMP_BOOST").getAsJsonObject()));
			oneTimeMap.put("MEGAWALLS_JOCKEY", new GlobalOneTime(
					easterOneTimeObject.get("MEGAWALLS_JOCKEY").getAsJsonObject()));
			oneTimeMap.put("FASTER_THAN_WIND", new GlobalOneTime(
					easterOneTimeObject.get("FASTER_THAN_WIND").getAsJsonObject()));
			oneTimeMap.put("YOU_DIDNT_SEE_THAT_COMING", new GlobalOneTime(
					easterOneTimeObject.get("YOU_DIDNT_SEE_THAT_COMING").getAsJsonObject()));
			oneTimeMap.put("FIRST_EGG_2021", new GlobalOneTime(
					easterOneTimeObject.get("FIRST_EGG_2021").getAsJsonObject()));
			oneTimeMap.put("VAMPIREZ_CARROT", new GlobalOneTime(
					easterOneTimeObject.get("VAMPIREZ_CARROT").getAsJsonObject()));

			tieredMap.put("THROW_EGGS", new Tiered(
					easterTieredObject.get("THROW_EGGS").getAsJsonObject()));
			tieredMap.put("MASTER_TRACKER", new Tiered(
					easterTieredObject.get("MASTER_TRACKER").getAsJsonObject()));
			tieredMap.put("EGG_FINDER", new Tiered(
					easterTieredObject.get("EGG_FINDER").getAsJsonObject()));
		}

		/**
		 * Get Easter One Time Achievements
		 */
		public Map<String, GlobalOneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Easter Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * General Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class General {
		final JsonObject generalObject;
		final JsonObject generalOneTimeObject;
		final JsonObject generalTieredObject;

		final Map<String, GlobalOneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public General(JsonObject generalObject) {
			this.generalObject = generalObject;
			this.generalOneTimeObject = generalObject.get("one_time").getAsJsonObject();
			this.generalTieredObject = generalObject.get("tiered").getAsJsonObject();
			putGeneralData();
		}

		void putGeneralData() {

			oneTimeMap.put("TREASURE_HUNT_2021", new GlobalOneTime(
					generalOneTimeObject.get("TREASURE_HUNT_2021").getAsJsonObject()));
			oneTimeMap.put("VIP", new GlobalOneTime(
					generalOneTimeObject.get("VIP").getAsJsonObject()));
			oneTimeMap.put("FRIENDS_25", new GlobalOneTime(
					generalOneTimeObject.get("FRIENDS_25").getAsJsonObject()));
			oneTimeMap.put("YOUTUBER", new GlobalOneTime(
					generalOneTimeObject.get("YOUTUBER").getAsJsonObject()));
			oneTimeMap.put("FIRST_JOIN", new GlobalOneTime(
					generalOneTimeObject.get("FIRST_JOIN").getAsJsonObject()));
			oneTimeMap.put("USE_PORTAL", new GlobalOneTime(
					generalOneTimeObject.get("USE_PORTAL").getAsJsonObject()));
			oneTimeMap.put("HOT_POTATO", new GlobalOneTime(
					generalOneTimeObject.get("HOT_POTATO").getAsJsonObject()));
			oneTimeMap.put("FIRST_GAME", new GlobalOneTime(
					generalOneTimeObject.get("FIRST_GAME").getAsJsonObject()));
			oneTimeMap.put("FIRST_CHAT", new GlobalOneTime(
					generalOneTimeObject.get("FIRST_CHAT").getAsJsonObject()));
			oneTimeMap.put("FIRST_FRIEND", new GlobalOneTime(
					generalOneTimeObject.get("FIRST_FRIEND").getAsJsonObject()));
			oneTimeMap.put("ACHIEVEMENT_NPC", new GlobalOneTime(
					generalOneTimeObject.get("ACHIEVEMENT_NPC").getAsJsonObject()));
			oneTimeMap.put("VIP_PLUS", new GlobalOneTime(
					generalOneTimeObject.get("VIP_PLUS").getAsJsonObject()));
			oneTimeMap.put("CREEPERBOOK", new GlobalOneTime(
					generalOneTimeObject.get("CREEPERBOOK").getAsJsonObject()));
			oneTimeMap.put("FIRST_PARTY", new GlobalOneTime(
					generalOneTimeObject.get("FIRST_PARTY").getAsJsonObject()));
			oneTimeMap.put("A_LONG_JOURNEY_BEGINS", new GlobalOneTime(
					generalOneTimeObject.get("A_LONG_JOURNEY_BEGINS").getAsJsonObject()));
			oneTimeMap.put("TREASURE_HUNT", new GlobalOneTime(
					generalOneTimeObject.get("TREASURE_HUNT").getAsJsonObject()));
			oneTimeMap.put("GIFTING", new GlobalOneTime(
					generalOneTimeObject.get("GIFTING").getAsJsonObject()));

			tieredMap.put("CHALLENGER", new Tiered(
					generalTieredObject.get("CHALLENGER").getAsJsonObject()));
			tieredMap.put("COINS", new Tiered(
					generalTieredObject.get("COINS").getAsJsonObject()));
			tieredMap.put("QUEST_MASTER", new Tiered(
					generalTieredObject.get("QUEST_MASTER").getAsJsonObject()));
			tieredMap.put("WINS", new Tiered(
					generalTieredObject.get("WINS").getAsJsonObject()));

		}

		/**
		 * Get General One Time Achievements
		 */
		public Map<String, GlobalOneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get General Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Ginger Bread Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class GingerBread {
		final JsonObject gingerBreadObject;
		final JsonObject gingerBreadOneTimeObject;
		final JsonObject gingerBreadTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public GingerBread(JsonObject gingerBreadObject) {
			this.gingerBreadObject = gingerBreadObject;
			this.gingerBreadOneTimeObject = gingerBreadObject.get("one_time").getAsJsonObject();
			this.gingerBreadTieredObject = gingerBreadObject.get("tiered").getAsJsonObject();
			putGingerBreadData();
		}

		void putGingerBreadData() {

			oneTimeMap.put("IS_THIS_SURVIVAL_GAMES", new OneTime(
					gingerBreadOneTimeObject.get("IS_THIS_SURVIVAL_GAMES").getAsJsonObject()));
			oneTimeMap.put("TRYHARDER", new OneTime(
					gingerBreadOneTimeObject.get("TRYHARDER").getAsJsonObject()));
			oneTimeMap.put("MISSILE_MAYHEM", new OneTime(
					gingerBreadOneTimeObject.get("MISSILE_MAYHEM").getAsJsonObject()));
			oneTimeMap.put("SLIPPERY", new OneTime(
					gingerBreadOneTimeObject.get("SLIPPERY").getAsJsonObject()));
			oneTimeMap.put("CANT_SEE_ANYTHING", new OneTime(
					gingerBreadOneTimeObject.get("CANT_SEE_ANYTHING").getAsJsonObject()));
			oneTimeMap.put("SHUT_DOWN", new OneTime(
					gingerBreadOneTimeObject.get("SHUT_DOWN").getAsJsonObject()));
			oneTimeMap.put("TASTE_MY_BANANA", new OneTime(
					gingerBreadOneTimeObject.get("TASTE_MY_BANANA").getAsJsonObject()));
			oneTimeMap.put("NEW_STYLE", new OneTime(
					gingerBreadOneTimeObject.get("NEW_STYLE").getAsJsonObject()));
			oneTimeMap.put("GETTING_GOOD", new OneTime(
					gingerBreadOneTimeObject.get("GETTING_GOOD").getAsJsonObject()));
			oneTimeMap.put("COIN_MAGNET", new OneTime(
					gingerBreadOneTimeObject.get("COIN_MAGNET").getAsJsonObject()));
			oneTimeMap.put("ETERNALLY_AWESOME", new OneTime(
					gingerBreadOneTimeObject.get("ETERNALLY_AWESOME").getAsJsonObject()));
			oneTimeMap.put("CHILL_OUT", new OneTime(
					gingerBreadOneTimeObject.get("CHILL_OUT").getAsJsonObject()));
			oneTimeMap.put("NEVER_LUCKY", new OneTime(
					gingerBreadOneTimeObject.get("NEVER_LUCKY").getAsJsonObject()));
			oneTimeMap.put("MODULAR", new OneTime(
					gingerBreadOneTimeObject.get("MODULAR").getAsJsonObject()));
			oneTimeMap.put("HONKING_AMAZING", new OneTime(
					gingerBreadOneTimeObject.get("HONKING_AMAZING").getAsJsonObject()));
			oneTimeMap.put("JAVELINS_ROCKET", new OneTime(
					gingerBreadOneTimeObject.get("JAVELINS_ROCKET").getAsJsonObject()));
			oneTimeMap.put("MECHANIC", new OneTime(
					gingerBreadOneTimeObject.get("MECHANIC").getAsJsonObject()));
			oneTimeMap.put("SURFACE_TO_AIR_MISSILE", new OneTime(
					gingerBreadOneTimeObject.get("SURFACE_TO_AIR_MISSILE").getAsJsonObject()));
			oneTimeMap.put("GET_HIT_BY_ME", new OneTime(
					gingerBreadOneTimeObject.get("GET_HIT_BY_ME").getAsJsonObject()));
			oneTimeMap.put("UNGRATEFUL", new OneTime(
					gingerBreadOneTimeObject.get("UNGRATEFUL").getAsJsonObject()));
			oneTimeMap.put("CONTENDER", new OneTime(
					gingerBreadOneTimeObject.get("CONTENDER").getAsJsonObject()));
			oneTimeMap.put("GETTIN_PAID", new OneTime(
					gingerBreadOneTimeObject.get("GETTIN_PAID").getAsJsonObject()));
			oneTimeMap.put("HONKING_MAD", new OneTime(
					gingerBreadOneTimeObject.get("HONKING_MAD").getAsJsonObject()));
			oneTimeMap.put("COINS_PLEASE", new OneTime(
					gingerBreadOneTimeObject.get("COINS_PLEASE").getAsJsonObject()));
			oneTimeMap.put("LAPPED", new OneTime(
					gingerBreadOneTimeObject.get("LAPPED").getAsJsonObject()));
			oneTimeMap.put("SEEN_IT_ALL", new OneTime(
					gingerBreadOneTimeObject.get("SEEN_IT_ALL").getAsJsonObject()));
			oneTimeMap.put("BOOST_OF_CONFIDENCE", new OneTime(
					gingerBreadOneTimeObject.get("BOOST_OF_CONFIDENCE").getAsJsonObject()));
			oneTimeMap.put("WELL_VERSED", new OneTime(
					gingerBreadOneTimeObject.get("WELL_VERSED").getAsJsonObject()));
			oneTimeMap.put("SLEEPER_AGENT", new OneTime(
					gingerBreadOneTimeObject.get("SLEEPER_AGENT").getAsJsonObject()));
			oneTimeMap.put("SHOW_OFF", new OneTime(
					gingerBreadOneTimeObject.get("SHOW_OFF").getAsJsonObject()));
			oneTimeMap.put("FLOWER_POWER", new OneTime(
					gingerBreadOneTimeObject.get("FLOWER_POWER").getAsJsonObject()));
			oneTimeMap.put("SEASONAL_RACER", new OneTime(
					gingerBreadOneTimeObject.get("SEASONAL_RACER").getAsJsonObject()));
			oneTimeMap.put("NOPE", new OneTime(
					gingerBreadOneTimeObject.get("NOPE").getAsJsonObject()));
			oneTimeMap.put("VICTORS_PRIZE", new OneTime(
					gingerBreadOneTimeObject.get("VICTORS_PRIZE").getAsJsonObject()));
			oneTimeMap.put("EAT_MY_DUST", new OneTime(
					gingerBreadOneTimeObject.get("EAT_MY_DUST").getAsJsonObject()));
			oneTimeMap.put("IM_LUCKY", new OneTime(
					gingerBreadOneTimeObject.get("IM_LUCKY").getAsJsonObject()));
			oneTimeMap.put("FRONT_MAN", new OneTime(
					gingerBreadOneTimeObject.get("FRONT_MAN").getAsJsonObject()));

			tieredMap.put("WINNER", new Tiered(
					gingerBreadTieredObject.get("WINNER").getAsJsonObject()));
			tieredMap.put("BANKER", new Tiered(
					gingerBreadTieredObject.get("BANKER").getAsJsonObject()));
			tieredMap.put("RACER", new Tiered(
					gingerBreadTieredObject.get("RACER").getAsJsonObject()));
			tieredMap.put("MYSTERY", new Tiered(
					gingerBreadTieredObject.get("MYSTERY").getAsJsonObject()));
		}

		/**
		 * Get Ginger Bread One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Ginger Bread Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Halloween Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Halloween {

		final JsonObject halloweenObject;
		final JsonObject halloweenOneTimeObject;
		final JsonObject halloweenTieredObject;

		final Map<String, GlobalOneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Halloween(JsonObject halloweenObject) {
			this.halloweenObject = halloweenObject;
			this.halloweenOneTimeObject = halloweenObject.get("one_time").getAsJsonObject();
			this.halloweenTieredObject = halloweenObject.get("tiered").getAsJsonObject();
			putHalloweenData();
		}

		void putHalloweenData() {

			oneTimeMap.put("FIRE_FROM_HELL", new GlobalOneTime(
					halloweenOneTimeObject.get("FIRE_FROM_HELL").getAsJsonObject()));
			oneTimeMap.put("PUMPKIN_DEATH", new GlobalOneTime(
					halloweenOneTimeObject.get("PUMPKIN_DEATH").getAsJsonObject()));
			oneTimeMap.put("FULL_BAT_MODE", new GlobalOneTime(
					halloweenOneTimeObject.get("FULL_BAT_MODE").getAsJsonObject()));
			oneTimeMap.put("PUMPKIN_VISION", new GlobalOneTime(
					halloweenOneTimeObject.get("PUMPKIN_VISION").getAsJsonObject()));
			oneTimeMap.put("TRICKED", new GlobalOneTime(
					halloweenOneTimeObject.get("TRICKED").getAsJsonObject()));
			oneTimeMap.put("TBR_SEASIDE_DRIVE", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_SEASIDE_DRIVE").getAsJsonObject()));
			oneTimeMap.put("SPOOKY_LOOKS", new GlobalOneTime(
					halloweenOneTimeObject.get("SPOOKY_LOOKS").getAsJsonObject()));
			oneTimeMap.put("CORPSE_STILL_RUNS", new GlobalOneTime(
					halloweenOneTimeObject.get("CORPSE_STILL_RUNS").getAsJsonObject()));
			oneTimeMap.put("TBR_CLOCK_TOWER_TRIP_FAST", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_CLOCK_TOWER_TRIP_FAST").getAsJsonObject()));
			oneTimeMap.put("SUGAR_RUSH", new GlobalOneTime(
					halloweenOneTimeObject.get("SUGAR_RUSH").getAsJsonObject()));
			oneTimeMap.put("LOOSE_FLOORBOARD", new GlobalOneTime(
					halloweenOneTimeObject.get("LOOSE_FLOORBOARD").getAsJsonObject()));
			oneTimeMap.put("TRICK_OR_TREAT_TIME", new GlobalOneTime(
					halloweenOneTimeObject.get("TRICK_OR_TREAT_TIME").getAsJsonObject()));
			oneTimeMap.put("BLAME_YOUR_TEAM", new GlobalOneTime(
					halloweenOneTimeObject.get("BLAME_YOUR_TEAM").getAsJsonObject()));
			oneTimeMap.put("VAMPIRES_BE_GONE", new GlobalOneTime(
					halloweenOneTimeObject.get("VAMPIRES_BE_GONE").getAsJsonObject()));
			oneTimeMap.put("FULL_MOON", new GlobalOneTime(
					halloweenOneTimeObject.get("FULL_MOON").getAsJsonObject()));
			oneTimeMap.put("TBR_PUMPKIN_JUMP_FAST", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_PUMPKIN_JUMP_FAST").getAsJsonObject()));
			oneTimeMap.put("BE_FREE", new GlobalOneTime(
					halloweenOneTimeObject.get("BE_FREE").getAsJsonObject()));
			oneTimeMap.put("MASTER_BOBBER", new GlobalOneTime(
					halloweenOneTimeObject.get("MASTER_BOBBER").getAsJsonObject()));
			oneTimeMap.put("SEE_THROUGH", new GlobalOneTime(
					halloweenOneTimeObject.get("SEE_THROUGH").getAsJsonObject()));
			oneTimeMap.put("BURNING_TOUCH", new GlobalOneTime(
					halloweenOneTimeObject.get("BURNING_TOUCH").getAsJsonObject()));
			oneTimeMap.put("PUMPKIN_DANCER", new GlobalOneTime(
					halloweenOneTimeObject.get("PUMPKIN_DANCER").getAsJsonObject()));
			oneTimeMap.put("RISING_DEAD", new GlobalOneTime(
					halloweenOneTimeObject.get("RISING_DEAD").getAsJsonObject()));
			oneTimeMap.put("GRAVEDIGGER", new GlobalOneTime(
					halloweenOneTimeObject.get("GRAVEDIGGER").getAsJsonObject()));
			oneTimeMap.put("FIVE_BASKETS_2020", new GlobalOneTime(
					halloweenOneTimeObject.get("FIVE_BASKETS_2020").getAsJsonObject()));
			oneTimeMap.put("UNDEAD_TARGET_PRACTICE", new GlobalOneTime(
					halloweenOneTimeObject.get("UNDEAD_TARGET_PRACTICE").getAsJsonObject()));
			oneTimeMap.put("THE_CRAWLING_DEAD", new GlobalOneTime(
					halloweenOneTimeObject.get("THE_CRAWLING_DEAD").getAsJsonObject()));
			oneTimeMap.put("SURVIVORS_BE_GONE", new GlobalOneTime(
					halloweenOneTimeObject.get("SURVIVORS_BE_GONE").getAsJsonObject()));
			oneTimeMap.put("SPOOKY_VICTORY", new GlobalOneTime(
					halloweenOneTimeObject.get("SPOOKY_VICTORY").getAsJsonObject()));
			oneTimeMap.put("THAT_WAS_EASY", new GlobalOneTime(
					halloweenOneTimeObject.get("THAT_WAS_EASY").getAsJsonObject()));
			oneTimeMap.put("SPOOKY_CHEST", new GlobalOneTime(
					halloweenOneTimeObject.get("SPOOKY_CHEST").getAsJsonObject()));
			oneTimeMap.put("CLASSY_WITHER", new GlobalOneTime(
					halloweenOneTimeObject.get("CLASSY_WITHER").getAsJsonObject()));
			oneTimeMap.put("MY_HALLOWEEN_COSTUME", new GlobalOneTime(
					halloweenOneTimeObject.get("MY_HALLOWEEN_COSTUME").getAsJsonObject()));
			oneTimeMap.put("DEVILS_RIDE", new GlobalOneTime(
					halloweenOneTimeObject.get("DEVILS_RIDE").getAsJsonObject()));
			oneTimeMap.put("GOOD_TRY", new GlobalOneTime(
					halloweenOneTimeObject.get("GOOD_TRY").getAsJsonObject()));
			oneTimeMap.put("TBR_SEASIDE_DRIVE_FAST", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_SEASIDE_DRIVE_FAST").getAsJsonObject()));
			oneTimeMap.put("HAUNTED_MAPS", new GlobalOneTime(
					halloweenOneTimeObject.get("HAUNTED_MAPS").getAsJsonObject()));
			oneTimeMap.put("KILLER_LOOT", new GlobalOneTime(
					halloweenOneTimeObject.get("KILLER_LOOT").getAsJsonObject()));
			oneTimeMap.put("ALL_BASKETS_2020", new GlobalOneTime(
					halloweenOneTimeObject.get("ALL_BASKETS_2020").getAsJsonObject()));
			oneTimeMap.put("OCTOBER_BETRAYAL", new GlobalOneTime(
					halloweenOneTimeObject.get("OCTOBER_BETRAYAL").getAsJsonObject()));
			oneTimeMap.put("PUMPKINS_WILL_RISE", new GlobalOneTime(
					halloweenOneTimeObject.get("PUMPKINS_WILL_RISE").getAsJsonObject()));
			oneTimeMap.put("HI_THERE", new GlobalOneTime(
					halloweenOneTimeObject.get("HI_THERE").getAsJsonObject()));
			oneTimeMap.put("TBR_CLOCK_TOWER_TRIP", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_CLOCK_TOWER_TRIP").getAsJsonObject()));
			oneTimeMap.put("TIS_THE_SEASON", new GlobalOneTime(
					halloweenOneTimeObject.get("TIS_THE_SEASON").getAsJsonObject()));
			oneTimeMap.put("NOT_SO_SCARY", new GlobalOneTime(
					halloweenOneTimeObject.get("NOT_SO_SCARY").getAsJsonObject()));
			oneTimeMap.put("TBR_PUMPKIN_JUMP", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_PUMPKIN_JUMP").getAsJsonObject()));
			oneTimeMap.put("THAT_TIME_OF_YEAR", new GlobalOneTime(
					halloweenOneTimeObject.get("THAT_TIME_OF_YEAR").getAsJsonObject()));
			oneTimeMap.put("SMOKING_VEIL", new GlobalOneTime(
					halloweenOneTimeObject.get("SMOKING_VEIL").getAsJsonObject()));
			oneTimeMap.put("FEAR_THE_PUMPKINATOR", new GlobalOneTime(
					halloweenOneTimeObject.get("FEAR_THE_PUMPKINATOR").getAsJsonObject()));
			oneTimeMap.put("ALL_GHOSTS_2018", new GlobalOneTime(
					halloweenOneTimeObject.get("ALL_GHOSTS_2018").getAsJsonObject()));
			oneTimeMap.put("SECOND_GHOST", new GlobalOneTime(
					halloweenOneTimeObject.get("SECOND_GHOST").getAsJsonObject()));
			oneTimeMap.put("TBR_KRAKEN_ASSAULT_1_25", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_KRAKEN_ASSAULT_1_25").getAsJsonObject()));
			oneTimeMap.put("TBR_OBSERVATORY_SPIN", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_OBSERVATORY_SPIN").getAsJsonObject()));
			oneTimeMap.put("TBR_SHARKNADO_JAUNT", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_SHARKNADO_JAUNT").getAsJsonObject()));
			oneTimeMap.put("ALL_BASKETS", new GlobalOneTime(
					halloweenOneTimeObject.get("ALL_BASKETS").getAsJsonObject()));
			oneTimeMap.put("TBR_SHARKNADO_JAUNT_FAST", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_SHARKNADO_JAUNT_FAST").getAsJsonObject()));
			oneTimeMap.put("ALL_GHOSTS", new GlobalOneTime(
					halloweenOneTimeObject.get("ALL_GHOSTS").getAsJsonObject()));
			oneTimeMap.put("TBR_KRAKEN_ASSAULT", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_KRAKEN_ASSAULT").getAsJsonObject()));
			oneTimeMap.put("TBR_MIDTOWN_TRIP", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_MIDTOWN_TRIP").getAsJsonObject()));
			oneTimeMap.put("TBR_OBSERVATORY_SPIN_1_10", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_OBSERVATORY_SPIN_1_10").getAsJsonObject()));
			oneTimeMap.put("FIVE_BASKETS", new GlobalOneTime(
					halloweenOneTimeObject.get("FIVE_BASKETS").getAsJsonObject()));
			oneTimeMap.put("SECOND_GHOST_2018", new GlobalOneTime(
					halloweenOneTimeObject.get("SECOND_GHOST_2018").getAsJsonObject()));
			oneTimeMap.put("TBR_MIDTOWN_TRIP_1_20", new GlobalOneTime(
					halloweenOneTimeObject.get("TBR_MIDTOWN_TRIP_1_20").getAsJsonObject()));
			oneTimeMap.put("EL_SPOODER", new GlobalOneTime(
					halloweenOneTimeObject.get("EL_SPOODER").getAsJsonObject()));
			oneTimeMap.put("NECROTHERAPY", new GlobalOneTime(
					halloweenOneTimeObject.get("NECROTHERAPY").getAsJsonObject()));

			tieredMap.put("PUMPKINATOR", new Tiered(
					halloweenTieredObject.get("PUMPKINATOR").getAsJsonObject()));
			tieredMap.put("PUMPKIN_SMASHER", new Tiered(
					halloweenTieredObject.get("PUMPKIN_SMASHER").getAsJsonObject()));
			tieredMap.put("BRAVE_THE_DARK", new Tiered(
					halloweenTieredObject.get("BRAVE_THE_DARK").getAsJsonObject()));
			tieredMap.put("GET_THEM_APPLES", new Tiered(
					halloweenTieredObject.get("GET_THEM_APPLES").getAsJsonObject()));
			tieredMap.put("CANDY_HOARDER", new Tiered(
					halloweenTieredObject.get("CANDY_HOARDER").getAsJsonObject()));

		}

		/**
		 * Get Halloween One Time Achievements
		 */
		public Map<String, GlobalOneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Halloween Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Housing Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Housing {
		final JsonObject housingObject;
		final JsonObject housingOneTimeObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();

		public Housing(JsonObject housingObject) {
			this.housingObject = housingObject;
			this.housingOneTimeObject = housingObject.get("one_time").getAsJsonObject();
			putHousingData();
		}

		void putHousingData() {

			oneTimeMap.put("JOIN_FRIEND", new OneTime(
					housingOneTimeObject.get("JOIN_FRIEND").getAsJsonObject()));
			oneTimeMap.put("RECIEVE_COOKIE", new OneTime(
					housingOneTimeObject.get("RECIEVE_COOKIE").getAsJsonObject()));
			oneTimeMap.put("JOIN_YOUTUBE", new OneTime(
					housingOneTimeObject.get("JOIN_YOUTUBE").getAsJsonObject()));
			oneTimeMap.put("NEW_LOOK", new OneTime(
					housingOneTimeObject.get("NEW_LOOK").getAsJsonObject()));
			oneTimeMap.put("JOIN_RANDOM", new OneTime(
					housingOneTimeObject.get("JOIN_RANDOM").getAsJsonObject()));
			oneTimeMap.put("GIVE_COOKIE", new OneTime(
					housingOneTimeObject.get("GIVE_COOKIE").getAsJsonObject()));
			oneTimeMap.put("JOIN_STAFF", new OneTime(
					housingOneTimeObject.get("JOIN_STAFF").getAsJsonObject()));
			oneTimeMap.put("MAKE_RESIDENT", new OneTime(
					housingOneTimeObject.get("MAKE_RESIDENT").getAsJsonObject()));
			oneTimeMap.put("GRAND_OPENING", new OneTime(
					housingOneTimeObject.get("GRAND_OPENING").getAsJsonObject()));
			oneTimeMap.put("BECOME_RESIDENT", new OneTime(
					housingOneTimeObject.get("BECOME_RESIDENT").getAsJsonObject()));
			oneTimeMap.put("JOIN_GUILD", new OneTime(
					housingOneTimeObject.get("JOIN_GUILD").getAsJsonObject()));
		}

		/**
		 * Get Housing One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}
	}

	/**
	 * Murder Mystery Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class MurderMystery {
		final JsonObject murderMysteryObject;
		final JsonObject murderMysteryOneTimeObject;
		final JsonObject murderMysteryTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public MurderMystery(JsonObject murderMysteryObject) {
			this.murderMysteryObject = murderMysteryObject;
			this.murderMysteryOneTimeObject = murderMysteryObject.get("one_time").getAsJsonObject();
			this.murderMysteryTieredObject = murderMysteryObject.get("tiered").getAsJsonObject();
			putMurderMysteryData();
		}

		void putMurderMysteryData() {

			oneTimeMap.put("BLESSING_AND_CURSE", new OneTime(
					murderMysteryOneTimeObject.get("BLESSING_AND_CURSE").getAsJsonObject()));
			oneTimeMap.put("KILL_MURDERER_AS_LAST_ALIVE", new OneTime(
					murderMysteryOneTimeObject.get("KILL_MURDERER_AS_LAST_ALIVE").getAsJsonObject()));
			oneTimeMap.put("WIN_SURVIVOR_DUE_TO_TIME", new OneTime(
					murderMysteryOneTimeObject.get("WIN_SURVIVOR_DUE_TO_TIME").getAsJsonObject()));
			oneTimeMap.put("THIRTY_GOLD_PICKED_UP", new OneTime(
					murderMysteryOneTimeObject.get("THIRTY_GOLD_PICKED_UP").getAsJsonObject()));
			oneTimeMap.put("SHOOT_THROWN_KNIFE", new OneTime(
					murderMysteryOneTimeObject.get("SHOOT_THROWN_KNIFE").getAsJsonObject()));
			oneTimeMap.put("SPECIAL_TWO_IN_A_ROW", new OneTime(
					murderMysteryOneTimeObject.get("SPECIAL_TWO_IN_A_ROW").getAsJsonObject()));
			oneTimeMap.put("JAWS", new OneTime(
					murderMysteryOneTimeObject.get("JAWS").getAsJsonObject()));
			oneTimeMap.put("WIN_AS_MURDERER_SHORT_TIME", new OneTime(
					murderMysteryOneTimeObject.get("WIN_AS_MURDERER_SHORT_TIME").getAsJsonObject()));
			oneTimeMap.put("PLAY_BOTH_GAMES", new OneTime(
					murderMysteryOneTimeObject.get("PLAY_BOTH_GAMES").getAsJsonObject()));
			oneTimeMap.put("KILL_IN_RAPID_TRANSPORT", new OneTime(
					murderMysteryOneTimeObject.get("KILL_IN_RAPID_TRANSPORT").getAsJsonObject()));
			oneTimeMap.put("BLOCK_WITH_BARRIER", new OneTime(
					murderMysteryOneTimeObject.get("BLOCK_WITH_BARRIER").getAsJsonObject()));
			oneTimeMap.put("FIVE_CURSES", new OneTime(
					murderMysteryOneTimeObject.get("FIVE_CURSES").getAsJsonObject()));
			oneTimeMap.put("WIN_WHILE_INVINCIBLE", new OneTime(
					murderMysteryOneTimeObject.get("WIN_WHILE_INVINCIBLE").getAsJsonObject()));
			oneTimeMap.put("FIRST_SHOT_HIT", new OneTime(
					murderMysteryOneTimeObject.get("FIRST_SHOT_HIT").getAsJsonObject()));
			oneTimeMap.put("MURDERER_FIRST_KILL", new OneTime(
					murderMysteryOneTimeObject.get("MURDERER_FIRST_KILL").getAsJsonObject()));
			oneTimeMap.put("THREE_KNIFE_THROW_KILLS", new OneTime(
					murderMysteryOneTimeObject.get("THREE_KNIFE_THROW_KILLS").getAsJsonObject()));
			oneTimeMap.put("KILL_MURDERER_AFTER_KILL", new OneTime(
					murderMysteryOneTimeObject.get("KILL_MURDERER_AFTER_KILL").getAsJsonObject()));
			oneTimeMap.put("DRINK_MANY_POTIONS", new OneTime(
					murderMysteryOneTimeObject.get("DRINK_MANY_POTIONS").getAsJsonObject()));
			oneTimeMap.put("KILL_MURDERER_WHILE_BLINDED", new OneTime(
					murderMysteryOneTimeObject.get("KILL_MURDERER_WHILE_BLINDED").getAsJsonObject()));
			oneTimeMap.put("LAST_SURVIVOR", new OneTime(
					murderMysteryOneTimeObject.get("LAST_SURVIVOR").getAsJsonObject()));
			oneTimeMap.put("PLAY_GAME_IN_LOBBY", new OneTime(
					murderMysteryOneTimeObject.get("PLAY_GAME_IN_LOBBY").getAsJsonObject()));
			oneTimeMap.put("SOLDIERS_ELIMINATED", new OneTime(
					murderMysteryOneTimeObject.get("SOLDIERS_ELIMINATED").getAsJsonObject()));
			oneTimeMap.put("WATSON", new OneTime(
					murderMysteryOneTimeObject.get("WATSON").getAsJsonObject()));
			oneTimeMap.put("KILL_DETECTIVE_FAST", new OneTime(
					murderMysteryOneTimeObject.get("KILL_DETECTIVE_FAST").getAsJsonObject()));
			oneTimeMap.put("CLEAR_CACTI", new OneTime(
					murderMysteryOneTimeObject.get("CLEAR_CACTI").getAsJsonObject()));
			oneTimeMap.put("KILLSTREAK", new OneTime(
					murderMysteryOneTimeObject.get("KILLSTREAK").getAsJsonObject()));
			oneTimeMap.put("KALI_FAVOR", new OneTime(
					murderMysteryOneTimeObject.get("KALI_FAVOR").getAsJsonObject()));
			oneTimeMap.put("PICKUP_GOLD", new OneTime(
					murderMysteryOneTimeObject.get("PICKUP_GOLD").getAsJsonObject()));
			oneTimeMap.put("BOW_KILLSTREAK", new OneTime(
					murderMysteryOneTimeObject.get("BOW_KILLSTREAK").getAsJsonObject()));
			oneTimeMap.put("BE_THE_HERO", new OneTime(
					murderMysteryOneTimeObject.get("BE_THE_HERO").getAsJsonObject()));
			oneTimeMap.put("THREE_ARROWS", new OneTime(
					murderMysteryOneTimeObject.get("THREE_ARROWS").getAsJsonObject()));
			oneTimeMap.put("SWORD_KILL_LONG_RANGE", new OneTime(
					murderMysteryOneTimeObject.get("SWORD_KILL_LONG_RANGE").getAsJsonObject()));
			oneTimeMap.put("RIDE_MONORAIL", new OneTime(
					murderMysteryOneTimeObject.get("RIDE_MONORAIL").getAsJsonObject()));
			oneTimeMap.put("BOW_KILL_ON_DETECTIVE", new OneTime(
					murderMysteryOneTimeObject.get("BOW_KILL_ON_DETECTIVE").getAsJsonObject()));
			oneTimeMap.put("REICHENBACH_FALL", new OneTime(
					murderMysteryOneTimeObject.get("REICHENBACH_FALL").getAsJsonObject()));
			oneTimeMap.put("WIN_INNO_MONORAIL", new OneTime(
					murderMysteryOneTimeObject.get("WIN_INNO_MONORAIL").getAsJsonObject()));
			oneTimeMap.put("EMP", new OneTime(
					murderMysteryOneTimeObject.get("EMP").getAsJsonObject()));
			oneTimeMap.put("UNCALCULATED", new OneTime(
					murderMysteryOneTimeObject.get("UNCALCULATED").getAsJsonObject()));
			oneTimeMap.put("SECRET_CHAMBER", new OneTime(
					murderMysteryOneTimeObject.get("SECRET_CHAMBER").getAsJsonObject()));
			oneTimeMap.put("PARANOID", new OneTime(
					murderMysteryOneTimeObject.get("PARANOID").getAsJsonObject()));
			oneTimeMap.put("LONGRANGE_SHOT", new OneTime(
					murderMysteryOneTimeObject.get("LONGRANGE_SHOT").getAsJsonObject()));
			oneTimeMap.put("RETURN_FROM_DEAD_WIN", new OneTime(
					murderMysteryOneTimeObject.get("RETURN_FROM_DEAD_WIN").getAsJsonObject()));
			oneTimeMap.put("WIN_MURDERER_FELL_IN_TRAP", new OneTime(
					murderMysteryOneTimeObject.get("WIN_MURDERER_FELL_IN_TRAP").getAsJsonObject()));
			oneTimeMap.put("NO_GOLD_PICKUP", new OneTime(
					murderMysteryOneTimeObject.get("NO_GOLD_PICKUP").getAsJsonObject()));
			oneTimeMap.put("TOP_ZOMBIE", new OneTime(
					murderMysteryOneTimeObject.get("TOP_ZOMBIE").getAsJsonObject()));
			oneTimeMap.put("DANCE", new OneTime(
					murderMysteryOneTimeObject.get("DANCE").getAsJsonObject()));
			oneTimeMap.put("SURVIVE_STORM_ON_TOP", new OneTime(
					murderMysteryOneTimeObject.get("SURVIVE_STORM_ON_TOP").getAsJsonObject()));
			oneTimeMap.put("ALL_DIRECTIONS", new OneTime(
					murderMysteryOneTimeObject.get("ALL_DIRECTIONS").getAsJsonObject()));
			oneTimeMap.put("MURDERER_BOW_KILLS", new OneTime(
					murderMysteryOneTimeObject.get("MURDERER_BOW_KILLS").getAsJsonObject()));
			oneTimeMap.put("STEALTH", new OneTime(
					murderMysteryOneTimeObject.get("STEALTH").getAsJsonObject()));
			oneTimeMap.put("HIT_BY_SWORD_WHILE_INVINC", new OneTime(
					murderMysteryOneTimeObject.get("HIT_BY_SWORD_WHILE_INVINC").getAsJsonObject()));
			oneTimeMap.put("KILL_WHILE_MONORAIL", new OneTime(
					murderMysteryOneTimeObject.get("KILL_WHILE_MONORAIL").getAsJsonObject()));
			oneTimeMap.put("TRIGGER_HAPPY_HAVOC", new OneTime(
					murderMysteryOneTimeObject.get("TRIGGER_HAPPY_HAVOC").getAsJsonObject()));
			oneTimeMap.put("KILL_ON_HORSE", new OneTime(
					murderMysteryOneTimeObject.get("KILL_ON_HORSE").getAsJsonObject()));

			tieredMap.put("WINS_AS_SURVIVOR", new Tiered(
					murderMysteryTieredObject.get("WINS_AS_SURVIVOR").getAsJsonObject()));
			tieredMap.put("KILLS_AS_MURDERER", new Tiered(
					murderMysteryTieredObject.get("KILLS_AS_MURDERER").getAsJsonObject()));
			tieredMap.put("WINS_AS_MURDERER", new Tiered(
					murderMysteryTieredObject.get("WINS_AS_MURDERER").getAsJsonObject()));
			tieredMap.put("HOARDER", new Tiered(
					murderMysteryTieredObject.get("HOARDER").getAsJsonObject()));
		}

		/**
		 * Get Murder Mystery One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Murder Mystery Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Paintball Achievements Data
	 *
	 * @author Kokahviel
	 * @since 3.0
	 */
	public static class Paintball {
		final JsonObject paintballObject;
		final JsonObject paintballOneTimeObject;
		final JsonObject paintballTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Paintball(JsonObject paintballObject) {
			this.paintballObject = paintballObject;
			this.paintballOneTimeObject = paintballObject.get("one_time").getAsJsonObject();
			this.paintballTieredObject = paintballObject.get("tiered").getAsJsonObject();
			putPaintballData();
		}

		void putPaintballData() {

			oneTimeMap.put("ACTIVATE_KILLSTREAKS", new OneTime(
					paintballOneTimeObject.get("ACTIVATE_KILLSTREAKS").getAsJsonObject()));
			oneTimeMap.put("CHEATING_DEATH", new OneTime(
					paintballOneTimeObject.get("CHEATING_DEATH").getAsJsonObject()));
			oneTimeMap.put("ACTIVATE_PLUS_TEN", new OneTime(
					paintballOneTimeObject.get("ACTIVATE_PLUS_TEN").getAsJsonObject()));
			oneTimeMap.put("TRIGGER_HAPPY", new OneTime(
					paintballOneTimeObject.get("TRIGGER_HAPPY").getAsJsonObject()));
			oneTimeMap.put("ENERGY_DRINK", new OneTime(
					paintballOneTimeObject.get("ENERGY_DRINK").getAsJsonObject()));
			oneTimeMap.put("THUNDER_STRUCK", new OneTime(
					paintballOneTimeObject.get("THUNDER_STRUCK").getAsJsonObject()));
			oneTimeMap.put("COMBO", new OneTime(
					paintballOneTimeObject.get("COMBO").getAsJsonObject()));
			oneTimeMap.put("GOD_KILLER", new OneTime(
					paintballOneTimeObject.get("GOD_KILLER").getAsJsonObject()));
			oneTimeMap.put("LIGHTS_OUT", new OneTime(
					paintballOneTimeObject.get("LIGHTS_OUT").getAsJsonObject()));
			oneTimeMap.put("NOW_YOU_SEE_ME", new OneTime(
					paintballOneTimeObject.get("NOW_YOU_SEE_ME").getAsJsonObject()));
			oneTimeMap.put("NO_KILLSTREAKS", new OneTime(
					paintballOneTimeObject.get("NO_KILLSTREAKS").getAsJsonObject()));
			oneTimeMap.put("LAST_KILL", new OneTime(
					paintballOneTimeObject.get("LAST_KILL").getAsJsonObject()));
			oneTimeMap.put("ACTIVATE_LEEROY_JENKINS", new OneTime(
					paintballOneTimeObject.get("ACTIVATE_LEEROY_JENKINS").getAsJsonObject()));
			oneTimeMap.put("AT_LEAST_I_TRIED", new OneTime(
					paintballOneTimeObject.get("AT_LEAST_I_TRIED").getAsJsonObject()));
			oneTimeMap.put("HACKER", new OneTime(
					paintballOneTimeObject.get("HACKER").getAsJsonObject()));
			oneTimeMap.put("UNLOCK_KILLSTREAKS", new OneTime(
					paintballOneTimeObject.get("UNLOCK_KILLSTREAKS").getAsJsonObject()));
			oneTimeMap.put("UNDERCOVER_SLOTH", new OneTime(
					paintballOneTimeObject.get("UNDERCOVER_SLOTH").getAsJsonObject()));
			oneTimeMap.put("EXPLOSIVE_DEATH", new OneTime(
					paintballOneTimeObject.get("EXPLOSIVE_DEATH").getAsJsonObject()));
			oneTimeMap.put("SARCRIFICE", new OneTime(
					paintballOneTimeObject.get("SARCRIFICE").getAsJsonObject()));
			oneTimeMap.put("FIRST_KILL", new OneTime(
					paintballOneTimeObject.get("FIRST_KILL").getAsJsonObject()));
			oneTimeMap.put("CLOSURE", new OneTime(
					paintballOneTimeObject.get("CLOSURE").getAsJsonObject()));
			oneTimeMap.put("ON_THE_BRINK_OF_DEFEAT", new OneTime(
					paintballOneTimeObject.get("ON_THE_BRINK_OF_DEFEAT").getAsJsonObject()));
			oneTimeMap.put("SHAKY_HANDS", new OneTime(
					paintballOneTimeObject.get("SHAKY_HANDS").getAsJsonObject()));
			oneTimeMap.put("HOW_DOES_IT_FEEL", new OneTime(
					paintballOneTimeObject.get("HOW_DOES_IT_FEEL").getAsJsonObject()));
			oneTimeMap.put("SAMPLING", new OneTime(
					paintballOneTimeObject.get("SAMPLING").getAsJsonObject()));
			oneTimeMap.put("GO_HOME_YOURE_DRUNK", new OneTime(
					paintballOneTimeObject.get("GO_HOME_YOURE_DRUNK").getAsJsonObject()));
			oneTimeMap.put("ADMIN_HAT", new OneTime(
					paintballOneTimeObject.get("ADMIN_HAT").getAsJsonObject()));
			oneTimeMap.put("UNLOCK_HAT", new OneTime(
					paintballOneTimeObject.get("UNLOCK_HAT").getAsJsonObject()));
			oneTimeMap.put("GODFATHER", new OneTime(
					paintballOneTimeObject.get("GODFATHER").getAsJsonObject()));
			oneTimeMap.put("WARFARE_TIME", new OneTime(
					paintballOneTimeObject.get("WARFARE_TIME").getAsJsonObject()));
			oneTimeMap.put("DO_I_GET_MY_NUKE_NOW", new OneTime(
					paintballOneTimeObject.get("DO_I_GET_MY_NUKE_NOW").getAsJsonObject()));
			oneTimeMap.put("JACKSON_POLLOCK", new OneTime(
					paintballOneTimeObject.get("JACKSON_POLLOCK").getAsJsonObject()));
			oneTimeMap.put("ENDURANCE", new OneTime(
					paintballOneTimeObject.get("ENDURANCE").getAsJsonObject()));
			oneTimeMap.put("ESPIONAGE", new OneTime(
					paintballOneTimeObject.get("ESPIONAGE").getAsJsonObject()));

			tieredMap.put("WINS", new Tiered(
					paintballTieredObject.get("WINS").getAsJsonObject()));
			tieredMap.put("HAT_COLLECTOR", new Tiered(
					paintballTieredObject.get("HAT_COLLECTOR").getAsJsonObject()));
			tieredMap.put("INVINCIBLE", new Tiered(
					paintballTieredObject.get("INVINCIBLE").getAsJsonObject()));
			tieredMap.put("KILL_STREAKS", new Tiered(
					paintballTieredObject.get("KILL_STREAKS").getAsJsonObject()));
			tieredMap.put("COINS", new Tiered(
					paintballTieredObject.get("COINS").getAsJsonObject()));
			tieredMap.put("KILLS", new Tiered(
					paintballTieredObject.get("KILLS").getAsJsonObject()));
		}

		/**
		 * Get Paintball One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Paintball Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Pit Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Pit {
		final JsonObject pitObject;
		final JsonObject pitOneTimeObject;
		final JsonObject pitTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Pit(JsonObject pitObject) {
			this.pitObject = pitObject;
			this.pitOneTimeObject = pitObject.get("one_time").getAsJsonObject();
			this.pitTieredObject = pitObject.get("tiered").getAsJsonObject();
			putPitData();
		}

		void putPitData() {

			oneTimeMap.put("MINE_OBSIDIAN", new OneTime(
					pitOneTimeObject.get("MINE_OBSIDIAN").getAsJsonObject()));
			oneTimeMap.put("PUNCH_SWORD", new OneTime(
					pitOneTimeObject.get("PUNCH_SWORD").getAsJsonObject()));
			oneTimeMap.put("WIN_AUCTION", new OneTime(
					pitOneTimeObject.get("WIN_AUCTION").getAsJsonObject()));
			oneTimeMap.put("DO_A_TRADE", new OneTime(
					pitOneTimeObject.get("DO_A_TRADE").getAsJsonObject()));
			oneTimeMap.put("DELIVER_MANY_PIZZAS", new OneTime(
					pitOneTimeObject.get("DELIVER_MANY_PIZZAS").getAsJsonObject()));
			oneTimeMap.put("COLOR_FANCY_HAT", new OneTime(
					pitOneTimeObject.get("COLOR_FANCY_HAT").getAsJsonObject()));
			oneTimeMap.put("HEAL_WITH_VAMPIRE", new OneTime(
					pitOneTimeObject.get("HEAL_WITH_VAMPIRE").getAsJsonObject()));
			oneTimeMap.put("EARN_MYSTIC_ITEM", new OneTime(
					pitOneTimeObject.get("EARN_MYSTIC_ITEM").getAsJsonObject()));
			oneTimeMap.put("COLLECT_TRICKLE_DOWN", new OneTime(
					pitOneTimeObject.get("COLLECT_TRICKLE_DOWN").getAsJsonObject()));
			oneTimeMap.put("FALL_IN_VOID", new OneTime(
					pitOneTimeObject.get("FALL_IN_VOID").getAsJsonObject()));
			oneTimeMap.put("COMPLETE_KING_QUEST", new OneTime(
					pitOneTimeObject.get("COMPLETE_KING_QUEST").getAsJsonObject()));
			oneTimeMap.put("BID_AUCTION", new OneTime(
					pitOneTimeObject.get("BID_AUCTION").getAsJsonObject()));
			oneTimeMap.put("USE_SELF_CHECKOUT", new OneTime(
					pitOneTimeObject.get("USE_SELF_CHECKOUT").getAsJsonObject()));
			oneTimeMap.put("KILLS_WITH_RAMBO", new OneTime(
					pitOneTimeObject.get("KILLS_WITH_RAMBO").getAsJsonObject()));
			oneTimeMap.put("XP_FROM_KOTH", new OneTime(
					pitOneTimeObject.get("XP_FROM_KOTH").getAsJsonObject()));
			oneTimeMap.put("TOP_THREE_IN_EVENT", new OneTime(
					pitOneTimeObject.get("TOP_THREE_IN_EVENT").getAsJsonObject()));
			oneTimeMap.put("BAKE_CAKE", new OneTime(
					pitOneTimeObject.get("BAKE_CAKE").getAsJsonObject()));
			oneTimeMap.put("MANY_KILLS_AS_BEAST", new OneTime(
					pitOneTimeObject.get("MANY_KILLS_AS_BEAST").getAsJsonObject()));
			oneTimeMap.put("ENCHANT_TIER_THREE", new OneTime(
					pitOneTimeObject.get("ENCHANT_TIER_THREE").getAsJsonObject()));
			oneTimeMap.put("REACH_LEVEL_100", new OneTime(
					pitOneTimeObject.get("REACH_LEVEL_100").getAsJsonObject()));
			oneTimeMap.put("FULL_STORAGE", new OneTime(
					pitOneTimeObject.get("FULL_STORAGE").getAsJsonObject()));
			oneTimeMap.put("MANY_CLICKS_DRAGON_EGG", new OneTime(
					pitOneTimeObject.get("MANY_CLICKS_DRAGON_EGG").getAsJsonObject()));
			oneTimeMap.put("KILL_HIGH_BOUNTY", new OneTime(
					pitOneTimeObject.get("KILL_HIGH_BOUNTY").getAsJsonObject()));
			oneTimeMap.put("HIGH_TIER_DEMON", new OneTime(
					pitOneTimeObject.get("HIGH_TIER_DEMON").getAsJsonObject()));
			oneTimeMap.put("PENTAKILL", new OneTime(
					pitOneTimeObject.get("PENTAKILL").getAsJsonObject()));
			oneTimeMap.put("TOP_THREE_RAGE_PIT", new OneTime(
					pitOneTimeObject.get("TOP_THREE_RAGE_PIT").getAsJsonObject()));
			oneTimeMap.put("HAVE_A_LOT_OF_GOLD", new OneTime(
					pitOneTimeObject.get("HAVE_A_LOT_OF_GOLD").getAsJsonObject()));
			oneTimeMap.put("SMALL_STREAK", new OneTime(
					pitOneTimeObject.get("SMALL_STREAK").getAsJsonObject()));
			oneTimeMap.put("SPIRE_LAST_FLOOR", new OneTime(
					pitOneTimeObject.get("SPIRE_LAST_FLOOR").getAsJsonObject()));
			oneTimeMap.put("GET_HIGH_BOUNTY", new OneTime(
					pitOneTimeObject.get("GET_HIGH_BOUNTY").getAsJsonObject()));
			oneTimeMap.put("GET_ENDLESS_QUIVER_ARROWS", new OneTime(
					pitOneTimeObject.get("GET_ENDLESS_QUIVER_ARROWS").getAsJsonObject()));
			oneTimeMap.put("SQUADS_MANY_POINTS", new OneTime(
					pitOneTimeObject.get("SQUADS_MANY_POINTS").getAsJsonObject()));
			oneTimeMap.put("CLAIM_BOUNTY", new OneTime(
					pitOneTimeObject.get("CLAIM_BOUNTY").getAsJsonObject()));
			oneTimeMap.put("CONSUME_EVERYTHING", new OneTime(
					pitOneTimeObject.get("CONSUME_EVERYTHING").getAsJsonObject()));
			oneTimeMap.put("EAT_LOTS_OF_CAKE", new OneTime(
					pitOneTimeObject.get("EAT_LOTS_OF_CAKE").getAsJsonObject()));
			oneTimeMap.put("WIN_RAFFLE", new OneTime(
					pitOneTimeObject.get("WIN_RAFFLE").getAsJsonObject()));
			oneTimeMap.put("COMPLETE_NIGHT_QUEST", new OneTime(
					pitOneTimeObject.get("COMPLETE_NIGHT_QUEST").getAsJsonObject()));
			oneTimeMap.put("GET_LUCKY_DIAMOND", new OneTime(
					pitOneTimeObject.get("GET_LUCKY_DIAMOND").getAsJsonObject()));
			oneTimeMap.put("PICKUP_INGOTS", new OneTime(
					pitOneTimeObject.get("PICKUP_INGOTS").getAsJsonObject()));
			oneTimeMap.put("PLACE_OBSIDIAN", new OneTime(
					pitOneTimeObject.get("PLACE_OBSIDIAN").getAsJsonObject()));
			oneTimeMap.put("KILL_WITH_STRENGTH", new OneTime(
					pitOneTimeObject.get("KILL_WITH_STRENGTH").getAsJsonObject()));
			oneTimeMap.put("MAX_OUT_EL_GATO", new OneTime(
					pitOneTimeObject.get("MAX_OUT_EL_GATO").getAsJsonObject()));
			oneTimeMap.put("REACH_PRESTIGE_20", new OneTime(
					pitOneTimeObject.get("REACH_PRESTIGE_20").getAsJsonObject()));
			oneTimeMap.put("MAX_OUT_RENOWN", new OneTime(
					pitOneTimeObject.get("MAX_OUT_RENOWN").getAsJsonObject()));
			oneTimeMap.put("UNLOCK_FAST_PASS", new OneTime(
					pitOneTimeObject.get("UNLOCK_FAST_PASS").getAsJsonObject()));
			oneTimeMap.put("FAST_QUICK_MATHS", new OneTime(
					pitOneTimeObject.get("FAST_QUICK_MATHS").getAsJsonObject()));
			oneTimeMap.put("TIME_ON_KOTL", new OneTime(
					pitOneTimeObject.get("TIME_ON_KOTL").getAsJsonObject()));
			oneTimeMap.put("HAVE_COBBLESTONE", new OneTime(
					pitOneTimeObject.get("HAVE_COBBLESTONE").getAsJsonObject()));
			oneTimeMap.put("USE_GOLDEN_HEADS", new OneTime(
					pitOneTimeObject.get("USE_GOLDEN_HEADS").getAsJsonObject()));
			oneTimeMap.put("PURCHASE_SCAM_ARTIST", new OneTime(
					pitOneTimeObject.get("PURCHASE_SCAM_ARTIST").getAsJsonObject()));
			oneTimeMap.put("BOUNTIES_CLAIMED_WITH_BH", new OneTime(
					pitOneTimeObject.get("BOUNTIES_CLAIMED_WITH_BH").getAsJsonObject()));
			oneTimeMap.put("ENCHANT_RARE", new OneTime(
					pitOneTimeObject.get("ENCHANT_RARE").getAsJsonObject()));
			oneTimeMap.put("COMPLETE_CONTRACT_FAST", new OneTime(
					pitOneTimeObject.get("COMPLETE_CONTRACT_FAST").getAsJsonObject()));
			oneTimeMap.put("ROBBERY_CAP", new OneTime(
					pitOneTimeObject.get("ROBBERY_CAP").getAsJsonObject()));
			oneTimeMap.put("COLLECT_FROM_CARE_PACKAGE", new OneTime(
					pitOneTimeObject.get("COLLECT_FROM_CARE_PACKAGE").getAsJsonObject()));
			oneTimeMap.put("EAT_RAGE_POTATOES", new OneTime(
					pitOneTimeObject.get("EAT_RAGE_POTATOES").getAsJsonObject()));
			oneTimeMap.put("EARN_AQUA_PANTS", new OneTime(
					pitOneTimeObject.get("EARN_AQUA_PANTS").getAsJsonObject()));
			oneTimeMap.put("MAX_OUT_PASSIVES", new OneTime(
					pitOneTimeObject.get("MAX_OUT_PASSIVES").getAsJsonObject()));
			oneTimeMap.put("STAY_ON_KOTH", new OneTime(
					pitOneTimeObject.get("STAY_ON_KOTH").getAsJsonObject()));
			oneTimeMap.put("HIGH_KILLSTREAK", new OneTime(
					pitOneTimeObject.get("HIGH_KILLSTREAK").getAsJsonObject()));
			oneTimeMap.put("KILL_TWO_BEASTS", new OneTime(
					pitOneTimeObject.get("KILL_TWO_BEASTS").getAsJsonObject()));

			tieredMap.put("MYSTICISM", new Tiered(
					pitTieredObject.get("MYSTICISM").getAsJsonObject()));
			tieredMap.put("KILLS", new Tiered(
					pitTieredObject.get("KILLS").getAsJsonObject()));
			tieredMap.put("PRESTIGES", new Tiered(
					pitTieredObject.get("PRESTIGES").getAsJsonObject()));
			tieredMap.put("CONTRACTS", new Tiered(
					pitTieredObject.get("CONTRACTS").getAsJsonObject()));
			tieredMap.put("RENOWN", new Tiered(
					pitTieredObject.get("RENOWN").getAsJsonObject()));
			tieredMap.put("GOLD", new Tiered(
					pitTieredObject.get("GOLD").getAsJsonObject()));
			tieredMap.put("EVENTS", new Tiered(
					pitTieredObject.get("EVENTS").getAsJsonObject()));
		}

		/**
		 * Get Pit One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Pit Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Quake Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Quake {
		final JsonObject quakeObject;
		final JsonObject quakeOneTimeObject;
		final JsonObject quakeTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Quake(JsonObject quakeObject) {
			this.quakeObject = quakeObject;
			this.quakeOneTimeObject = quakeObject.get("one_time").getAsJsonObject();
			this.quakeTieredObject = quakeObject.get("tiered").getAsJsonObject();
			putQuakeData();
		}

		void putQuakeData() {

			oneTimeMap.put("SHOW_ME_THE_MONEY", new OneTime(
					quakeOneTimeObject.get("SHOW_ME_THE_MONEY").getAsJsonObject()));
			oneTimeMap.put("WHAT_JUST_HAPPENED", new OneTime(
					quakeOneTimeObject.get("WHAT_JUST_HAPPENED").getAsJsonObject()));
			oneTimeMap.put("THANKS_GRANDMA", new OneTime(
					quakeOneTimeObject.get("THANKS_GRANDMA").getAsJsonObject()));
			oneTimeMap.put("BAKING_A_DOZEN", new OneTime(
					quakeOneTimeObject.get("BAKING_A_DOZEN").getAsJsonObject()));
			oneTimeMap.put("DOUBLE_TROUBLE", new OneTime(
					quakeOneTimeObject.get("DOUBLE_TROUBLE").getAsJsonObject()));
			oneTimeMap.put("DOUBLING_UP", new OneTime(
					quakeOneTimeObject.get("DOUBLING_UP").getAsJsonObject()));
			oneTimeMap.put("PERFECTIONIST", new OneTime(
					quakeOneTimeObject.get("PERFECTIONNIST").getAsJsonObject()));
			oneTimeMap.put("FROG", new OneTime(
					quakeOneTimeObject.get("FROG").getAsJsonObject()));
			oneTimeMap.put("ONE_IN_THE_CHAMBER", new OneTime(
					quakeOneTimeObject.get("ONE_IN_THE_CHAMBER").getAsJsonObject()));
			oneTimeMap.put("PLATINUM_PLATED", new OneTime(
					quakeOneTimeObject.get("PLATINUM_PLATED").getAsJsonObject()));
			oneTimeMap.put("RIP", new OneTime(
					quakeOneTimeObject.get("RIP").getAsJsonObject()));
			oneTimeMap.put("LOOKING_FANCY", new OneTime(
					quakeOneTimeObject.get("LOOKING_FANCY").getAsJsonObject()));
			oneTimeMap.put("TUBULAR", new OneTime(
					quakeOneTimeObject.get("TUBULAR").getAsJsonObject()));
			oneTimeMap.put("BEYOND_INCREDIBLE", new OneTime(
					quakeOneTimeObject.get("BEYOND_INCREDIBLE").getAsJsonObject()));
			oneTimeMap.put("FLY", new OneTime(
					quakeOneTimeObject.get("FLY").getAsJsonObject()));
			oneTimeMap.put("FIRST_KILL", new OneTime(
					quakeOneTimeObject.get("FIRST_KILL").getAsJsonObject()));
			oneTimeMap.put("I_LIKE_TURTLES", new OneTime(
					quakeOneTimeObject.get("I_LIEK_TURTLES").getAsJsonObject()));
			oneTimeMap.put("TEAM_PLAYER", new OneTime(
					quakeOneTimeObject.get("TEAM_PLAYER").getAsJsonObject()));
			oneTimeMap.put("DARK_SIDE", new OneTime(
					quakeOneTimeObject.get("DARK_SIDE").getAsJsonObject()));
			oneTimeMap.put("PRESIDENTIAL", new OneTime(
					quakeOneTimeObject.get("PRESIDENTIAL").getAsJsonObject()));
			oneTimeMap.put("WAT", new OneTime(
					quakeOneTimeObject.get("WAT").getAsJsonObject()));
			oneTimeMap.put("LOVE_IS_IN_THE_AIR", new OneTime(
					quakeOneTimeObject.get("LOVE_IS_IN_THE_AIR").getAsJsonObject()));
			oneTimeMap.put("MY_PRECIOUS", new OneTime(
					quakeOneTimeObject.get("MY_PRECIOUS").getAsJsonObject()));
			oneTimeMap.put("BOGOF", new OneTime(
					quakeOneTimeObject.get("BOGOF").getAsJsonObject()));
			oneTimeMap.put("INCREDIBLE", new OneTime(
					quakeOneTimeObject.get("INCREDIBLE").getAsJsonObject()));
			oneTimeMap.put("THINK_FAST", new OneTime(
					quakeOneTimeObject.get("THINK_FAST").getAsJsonObject()));
			oneTimeMap.put("BUFFING_UP", new OneTime(
					quakeOneTimeObject.get("BUFFING_UP").getAsJsonObject()));
			oneTimeMap.put("WANT_A_WARDROBE", new OneTime(
					quakeOneTimeObject.get("WANT_A_WARDROBE").getAsJsonObject()));
			oneTimeMap.put("REDSTONER", new OneTime(
					quakeOneTimeObject.get("REDSTONER").getAsJsonObject()));
			oneTimeMap.put("MY_WAY", new OneTime(
					quakeOneTimeObject.get("MY_WAY").getAsJsonObject()));
			oneTimeMap.put("GOOD_GUY_GAMER", new OneTime(
					quakeOneTimeObject.get("GOOD_GUY_GAMER").getAsJsonObject()));
			oneTimeMap.put("MINIGUN", new OneTime(
					quakeOneTimeObject.get("MINIGUN").getAsJsonObject()));
			oneTimeMap.put("FABULOUS_WIN", new OneTime(
					quakeOneTimeObject.get("FABULOUS_WIN").getAsJsonObject()));
			oneTimeMap.put("BILLY_TALENT", new OneTime(
					quakeOneTimeObject.get("BILLY_TALENT").getAsJsonObject()));
			oneTimeMap.put("NOT_TODAY", new OneTime(
					quakeOneTimeObject.get("NOT_TODAY").getAsJsonObject()));
			oneTimeMap.put("WHAT_HAVE_I_DONE", new OneTime(
					quakeOneTimeObject.get("WHAT_HAVE_I_DONE").getAsJsonObject()));
			oneTimeMap.put("HUMILIATION", new OneTime(
					quakeOneTimeObject.get("HUMILIATION").getAsJsonObject()));
			oneTimeMap.put("OH_BABY_A_TRIPLE", new OneTime(
					quakeOneTimeObject.get("OH_BABY_A_TRIPLE").getAsJsonObject()));
			oneTimeMap.put("APPLE_CORER", new OneTime(
					quakeOneTimeObject.get("APPLE_CORER").getAsJsonObject()));
			oneTimeMap.put("PERFECTION", new OneTime(
					quakeOneTimeObject.get("PERFECTION").getAsJsonObject()));
			oneTimeMap.put("FANATIC", new OneTime(
					quakeOneTimeObject.get("FANATIC").getAsJsonObject()));
			oneTimeMap.put("SIMPLE_THINGS", new OneTime(
					quakeOneTimeObject.get("SIMPLE_THINGS").getAsJsonObject()));
			oneTimeMap.put("UNTOUCHABLE", new OneTime(
					quakeOneTimeObject.get("UNTOUCHABLE").getAsJsonObject()));
			oneTimeMap.put("GOING_UP_IN_LIFE", new OneTime(
					quakeOneTimeObject.get("GOING_UP_IN_LIFE").getAsJsonObject()));
			oneTimeMap.put("ITS_SO_SHINY", new OneTime(
					quakeOneTimeObject.get("ITS_SO_SHINY").getAsJsonObject()));
			oneTimeMap.put("GRAB_IT_ALL", new OneTime(
					quakeOneTimeObject.get("GRAB_IT_ALL").getAsJsonObject()));
			oneTimeMap.put("NOT_WORKING", new OneTime(
					quakeOneTimeObject.get("NOT_WORKING").getAsJsonObject()));
			oneTimeMap.put("HEAVY_SHOULDERS", new OneTime(
					quakeOneTimeObject.get("HEAVY_SHOULDERS").getAsJsonObject()));
			oneTimeMap.put("LOOKIN_GOOD", new OneTime(
					quakeOneTimeObject.get("LOOKIN_GOOD").getAsJsonObject()));
			oneTimeMap.put("DIAMONDS_TO_YOU", new OneTime(
					quakeOneTimeObject.get("DIAMONDS_TO_YOU").getAsJsonObject()));
			oneTimeMap.put("CALM_DOWN", new OneTime(
					quakeOneTimeObject.get("CALM_DOWN").getAsJsonObject()));
			oneTimeMap.put("BUBBLY", new OneTime(
					quakeOneTimeObject.get("BUBBLY").getAsJsonObject()));
			oneTimeMap.put("HEART_STOPPER", new OneTime(
					quakeOneTimeObject.get("HEART_STOPPER").getAsJsonObject()));
			oneTimeMap.put("HOW_DID_THAT_HAPPEN", new OneTime(
					quakeOneTimeObject.get("HOW_DID_THAT_HAPPEN").getAsJsonObject()));
			oneTimeMap.put("ONE_SHOT", new OneTime(
					quakeOneTimeObject.get("ONE_SHOT").getAsJsonObject()));
			oneTimeMap.put("SQUISH", new OneTime(
					quakeOneTimeObject.get("SQUISH").getAsJsonObject()));
			oneTimeMap.put("IN_MY_WAY", new OneTime(
					quakeOneTimeObject.get("IN_MY_WAY").getAsJsonObject()));

			tieredMap.put("COINS", new Tiered(
					quakeTieredObject.get("COINS").getAsJsonObject()));
			tieredMap.put("HEADSHOTS", new Tiered(
					quakeTieredObject.get("HEADSHOTS").getAsJsonObject()));
			tieredMap.put("WINS", new Tiered(
					quakeTieredObject.get("WINS").getAsJsonObject()));
			tieredMap.put("WEAPON_ARSENAL", new Tiered(
					quakeTieredObject.get("WEAPON_ARSENAL").getAsJsonObject()));
			tieredMap.put("KILLING_SPREES", new Tiered(
					quakeTieredObject.get("KILLING_SPREES").getAsJsonObject()));
			tieredMap.put("GODLIKES", new Tiered(
					quakeTieredObject.get("GODLIKES").getAsJsonObject()));
			tieredMap.put("KILLS", new Tiered(
					quakeTieredObject.get("KILLS").getAsJsonObject()));

		}

		/**
		 * Get Quake One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Quake Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Skyblock Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Skyblock {
		final JsonObject skyblockObject;
		final JsonObject skyblockOneTimeObject;
		final JsonObject skyblockTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Skyblock(JsonObject skyblockObject) {
			this.skyblockObject = skyblockObject;
			this.skyblockOneTimeObject = skyblockObject.get("one_time").getAsJsonObject();
			this.skyblockTieredObject = skyblockObject.get("tiered").getAsJsonObject();
			putSkyblockData();
		}

		void putSkyblockData() {

			oneTimeMap.put("EXPLOSIVE_ENDING", new OneTime(
					skyblockOneTimeObject.get("EXPLOSIVE_ENDING").getAsJsonObject()));
			oneTimeMap.put("SADDLE_UP", new OneTime(
					skyblockOneTimeObject.get("SADDLE_UP").getAsJsonObject()));
			oneTimeMap.put("I_AM_SUPERIOR", new OneTime(
					skyblockOneTimeObject.get("I_AM_SUPERIOR").getAsJsonObject()));
			oneTimeMap.put("LOST_SOUL", new OneTime(
					skyblockOneTimeObject.get("LOST_SOUL").getAsJsonObject()));
			oneTimeMap.put("BAITED", new OneTime(
					skyblockOneTimeObject.get("BAITED").getAsJsonObject()));
			oneTimeMap.put("A_GOOD_SPIDER_IS_A_DEAD_SPIDER", new OneTime(
					skyblockOneTimeObject.get("A_GOOD_SPIDER_IS_A_DEAD_SPIDER").getAsJsonObject()));
			oneTimeMap.put("WATER_SWORD", new OneTime(
					skyblockOneTimeObject.get("WATER_SWORD").getAsJsonObject()));
			oneTimeMap.put("EMPTY_FLOWER_POT", new OneTime(
					skyblockOneTimeObject.get("EMPTY_FLOWER_POT").getAsJsonObject()));
			oneTimeMap.put("ZOOKEEPER", new OneTime(
					skyblockOneTimeObject.get("ZOOKEEPER").getAsJsonObject()));
			oneTimeMap.put("SAFETY_FIRST", new OneTime(
					skyblockOneTimeObject.get("SAFETY_FIRST").getAsJsonObject()));
			oneTimeMap.put("END_RACE", new OneTime(
					skyblockOneTimeObject.get("END_RACE").getAsJsonObject()));
			oneTimeMap.put("MYSTICAL", new OneTime(
					skyblockOneTimeObject.get("MYSTICAL").getAsJsonObject()));
			oneTimeMap.put("GLASS_CANNON", new OneTime(
					skyblockOneTimeObject.get("GLASS_CANNON").getAsJsonObject()));
			oneTimeMap.put("WORTH_IT", new OneTime(
					skyblockOneTimeObject.get("WORTH_IT").getAsJsonObject()));
			oneTimeMap.put("I_AM_GROOT", new OneTime(
					skyblockOneTimeObject.get("I_AM_GROOT").getAsJsonObject()));
			oneTimeMap.put("PRODUCTION_EXPANDED", new OneTime(
					skyblockOneTimeObject.get("PRODUCTION_EXPANDED").getAsJsonObject()));
			oneTimeMap.put("TO_SPACE_WE_GO", new OneTime(
					skyblockOneTimeObject.get("TO_SPACE_WE_GO").getAsJsonObject()));
			oneTimeMap.put("SUPREME_FARMER", new OneTime(
					skyblockOneTimeObject.get("SUPREME_FARMER").getAsJsonObject()));
			oneTimeMap.put("JERRY", new OneTime(
					skyblockOneTimeObject.get("JERRY").getAsJsonObject()));
			oneTimeMap.put("MASTER_ENCHANTER", new OneTime(
					skyblockOneTimeObject.get("MASTER_ENCHANTER").getAsJsonObject()));
			oneTimeMap.put("BRAIN_POWER", new OneTime(
					skyblockOneTimeObject.get("BRAIN_POWER").getAsJsonObject()));
			oneTimeMap.put("BIGGER_STORAGE_IS_SEEDED", new OneTime(
					skyblockOneTimeObject.get("BIGGER_STORAGE_IS_SEEDED").getAsJsonObject()));
			oneTimeMap.put("FLAMIN_HOT", new OneTime(
					skyblockOneTimeObject.get("FLAMIN_HOT").getAsJsonObject()));
			oneTimeMap.put("SHRIMP", new OneTime(
					skyblockOneTimeObject.get("SHRIMP").getAsJsonObject()));
			oneTimeMap.put("WELCOME_TO_MY_FACTORY", new OneTime(
					skyblockOneTimeObject.get("WELCOME_TO_MY_FACTORY").getAsJsonObject()));
			oneTimeMap.put("CUTE_LITTLE_CUBE", new OneTime(
					skyblockOneTimeObject.get("CUTE_LITTLE_CUBE").getAsJsonObject()));
			oneTimeMap.put("ACCESSORIES_GALORE", new OneTime(
					skyblockOneTimeObject.get("ACCESSORIES_GALORE").getAsJsonObject()));
			oneTimeMap.put("WONDERFUL_TREASURES", new OneTime(
					skyblockOneTimeObject.get("WONDERFUL_TREASURES").getAsJsonObject()));
			oneTimeMap.put("THE_REAL_ZOO_SHADY", new OneTime(
					skyblockOneTimeObject.get("THE_REAL_ZOO_SHADY").getAsJsonObject()));
			oneTimeMap.put("ANIMAL_FISHING", new OneTime(
					skyblockOneTimeObject.get("ANIMAL_FISHING").getAsJsonObject()));
			oneTimeMap.put("FLAWLESS", new OneTime(
					skyblockOneTimeObject.get("FLAWLESS").getAsJsonObject()));
			oneTimeMap.put("SERIOUSLY", new OneTime(
					skyblockOneTimeObject.get("SERIOUSLY").getAsJsonObject()));
			oneTimeMap.put("TREASURE_FISHING", new OneTime(
					skyblockOneTimeObject.get("TREASURE_FISHING").getAsJsonObject()));
			oneTimeMap.put("DEFEATING_DEATH", new OneTime(
					skyblockOneTimeObject.get("DEFEATING_DEATH").getAsJsonObject()));
			oneTimeMap.put("EXPENSIVE_BREW", new OneTime(
					skyblockOneTimeObject.get("EXPENSIVE_BREW").getAsJsonObject()));
			oneTimeMap.put("OVERKILL", new OneTime(
					skyblockOneTimeObject.get("OVERKILL").getAsJsonObject()));
			oneTimeMap.put("AGILE", new OneTime(
					skyblockOneTimeObject.get("AGILE").getAsJsonObject()));
			oneTimeMap.put("HEART_OF_THE_END", new OneTime(
					skyblockOneTimeObject.get("HEART_OF_THE_END").getAsJsonObject()));
			oneTimeMap.put("YOUR_ADVENTURE_BEGINS", new OneTime(
					skyblockOneTimeObject.get("YOUR_ADVENTURE_BEGINS").getAsJsonObject()));
			oneTimeMap.put("STORAGE_FOREVER", new OneTime(
					skyblockOneTimeObject.get("STORAGE_FOREVER").getAsJsonObject()));
			oneTimeMap.put("HSSSSS", new OneTime(
					skyblockOneTimeObject.get("HSSSSS").getAsJsonObject()));
			oneTimeMap.put("SPEEDRUNNER", new OneTime(
					skyblockOneTimeObject.get("SPEEDRUNNER").getAsJsonObject()));
			oneTimeMap.put("SECOND_CHANCE", new OneTime(
					skyblockOneTimeObject.get("SECOND_CHANCE").getAsJsonObject()));
			oneTimeMap.put("SMELL_LIKE_ROSES", new OneTime(
					skyblockOneTimeObject.get("SMELL_LIKE_ROSES").getAsJsonObject()));
			oneTimeMap.put("TIME_TO_START_FISHING", new OneTime(
					skyblockOneTimeObject.get("TIME_TO_START_FISHING").getAsJsonObject()));
			oneTimeMap.put("THOUGH_CHOICE", new OneTime(
					skyblockOneTimeObject.get("THOUGH_CHOICE").getAsJsonObject()));
			oneTimeMap.put("REBIRTH", new OneTime(
					skyblockOneTimeObject.get("REBIRTH").getAsJsonObject()));
			oneTimeMap.put("UPGRADES_PEOPLE_UPGRADES", new OneTime(
					skyblockOneTimeObject.get("UPGRADES_PEOPLE_UPGRADES").getAsJsonObject()));
			oneTimeMap.put("INDIANA_BONES", new OneTime(
					skyblockOneTimeObject.get("INDIANA_BONES").getAsJsonObject()));
			oneTimeMap.put("KING_OF_THE_CHICKS", new OneTime(
					skyblockOneTimeObject.get("KING_OF_THE_CHICKS").getAsJsonObject()));
			oneTimeMap.put("DRAGON_SLAYER", new OneTime(
					skyblockOneTimeObject.get("DRAGON_SLAYER").getAsJsonObject()));
			oneTimeMap.put("TRUE_ALCHEMIST", new OneTime(
					skyblockOneTimeObject.get("TRUE_ALCHEMIST").getAsJsonObject()));
			oneTimeMap.put("RAINBOW", new OneTime(
					skyblockOneTimeObject.get("RAINBOW").getAsJsonObject()));
			oneTimeMap.put("THIS_IS_FAIR", new OneTime(
					skyblockOneTimeObject.get("THIS_IS_FAIR").getAsJsonObject()));
			oneTimeMap.put("THE_FLINT_BROS", new OneTime(
					skyblockOneTimeObject.get("THE_FLINT_BROS").getAsJsonObject()));
			oneTimeMap.put("LIBRARIAN", new OneTime(
					skyblockOneTimeObject.get("LIBRARIAN").getAsJsonObject()));
			oneTimeMap.put("MORE_SPACE", new OneTime(
					skyblockOneTimeObject.get("MORE_SPACE").getAsJsonObject()));
			oneTimeMap.put("COMBINED_EFFORTS", new OneTime(
					skyblockOneTimeObject.get("COMBINED_EFFORTS").getAsJsonObject()));
			oneTimeMap.put("ROYAL_RESIDENT_DIALOGUE", new OneTime(
					skyblockOneTimeObject.get("ROYAL_RESIDENT_DIALOGUE").getAsJsonObject()));
			oneTimeMap.put("THE_PRODIGY", new OneTime(
					skyblockOneTimeObject.get("THE_PRODIGY").getAsJsonObject()));
			oneTimeMap.put("KNOWLEDGE_IS_POWER", new OneTime(
					skyblockOneTimeObject.get("KNOWLEDGE_IS_POWER").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_ROD", new OneTime(
					skyblockOneTimeObject.get("LEGENDARY_ROD").getAsJsonObject()));
			oneTimeMap.put("CARETAKER", new OneTime(
					skyblockOneTimeObject.get("CARETAKER").getAsJsonObject()));
			oneTimeMap.put("NIGHT_EYES", new OneTime(
					skyblockOneTimeObject.get("NIGHT_EYES").getAsJsonObject()));
			oneTimeMap.put("KING_OF_THE_PETS", new OneTime(
					skyblockOneTimeObject.get("KING_OF_THE_PETS").getAsJsonObject()));
			oneTimeMap.put("FULLY_EVOLVED", new OneTime(
					skyblockOneTimeObject.get("FULLY_EVOLVED").getAsJsonObject()));
			oneTimeMap.put("THE_ONE_BOTTLE", new OneTime(
					skyblockOneTimeObject.get("THE_ONE_BOTTLE").getAsJsonObject()));
			oneTimeMap.put("ABSORB_IT_ALL", new OneTime(
					skyblockOneTimeObject.get("ABSORB_IT_ALL").getAsJsonObject()));
			oneTimeMap.put("PROMISED_FULFILLED", new OneTime(
					skyblockOneTimeObject.get("PROMISED_FULFILLED").getAsJsonObject()));
			oneTimeMap.put("I_BELIEVE_I_CAN_FLY", new OneTime(
					skyblockOneTimeObject.get("I_BELIEVE_I_CAN_FLY").getAsJsonObject()));
			oneTimeMap.put("S_PLUS_SQUAD", new OneTime(
					skyblockOneTimeObject.get("S_PLUS_SQUAD").getAsJsonObject()));
			oneTimeMap.put("THE_FLASH", new OneTime(
					skyblockOneTimeObject.get("THE_FLASH").getAsJsonObject()));
			oneTimeMap.put("BAT_PINATA", new OneTime(
					skyblockOneTimeObject.get("BAT_PINATA").getAsJsonObject()));
			oneTimeMap.put("STUBBORN_GIVER", new OneTime(
					skyblockOneTimeObject.get("STUBBORN_GIVER").getAsJsonObject()));
			oneTimeMap.put("PRECIOUS_MINERALS", new OneTime(
					skyblockOneTimeObject.get("PRECIOUS_MINERALS").getAsJsonObject()));
			oneTimeMap.put("INTO_THE_DEEP", new OneTime(
					skyblockOneTimeObject.get("INTO_THE_DEEP").getAsJsonObject()));
			oneTimeMap.put("FORTUNATE", new OneTime(
					skyblockOneTimeObject.get("FORTUNATE").getAsJsonObject()));
			oneTimeMap.put("NEXT_LEVEL", new OneTime(
					skyblockOneTimeObject.get("NEXT_LEVEL").getAsJsonObject()));
			oneTimeMap.put("A_CHALLENGING_CLIMB", new OneTime(
					skyblockOneTimeObject.get("A_CHALLENGING_CLIMB").getAsJsonObject()));
			oneTimeMap.put("SPIKY", new OneTime(
					skyblockOneTimeObject.get("SPIKY").getAsJsonObject()));
			oneTimeMap.put("SPEED_OF_LIGHT", new OneTime(
					skyblockOneTimeObject.get("SPEED_OF_LIGHT").getAsJsonObject()));
			oneTimeMap.put("HIGHER_ENCHANTS", new OneTime(
					skyblockOneTimeObject.get("HIGHER_ENCHANTS").getAsJsonObject()));
			oneTimeMap.put("THREE_BIRDS_ONE_ARROW", new OneTime(
					skyblockOneTimeObject.get("THREE_BIRDS_ONE_ARROW").getAsJsonObject()));
			oneTimeMap.put("EVERY_LITTLE_BIT_HELPS", new OneTime(
					skyblockOneTimeObject.get("EVERY_LITTLE_BIT_HELPS").getAsJsonObject()));
			oneTimeMap.put("IM_FAST_AS_HECK_BOY", new OneTime(
					skyblockOneTimeObject.get("IM_FAST_AS_HECK_BOY").getAsJsonObject()));
			oneTimeMap.put("CAUGHT_THE_GRINCH", new OneTime(
					skyblockOneTimeObject.get("CAUGHT_THE_GRINCH").getAsJsonObject()));
			oneTimeMap.put("I_KNEW_IT", new OneTime(
					skyblockOneTimeObject.get("I_KNEW_IT").getAsJsonObject()));
			oneTimeMap.put("ROUGH_DEAL", new OneTime(
					skyblockOneTimeObject.get("ROUGH_DEAL").getAsJsonObject()));
			oneTimeMap.put("DO_YOU_EVEN_VOODOO", new OneTime(
					skyblockOneTimeObject.get("DO_YOU_EVEN_VOODOO").getAsJsonObject()));
			oneTimeMap.put("SUPER_FUEL", new OneTime(
					skyblockOneTimeObject.get("SUPER_FUEL").getAsJsonObject()));
			oneTimeMap.put("QUEST_COMPLETE", new OneTime(
					skyblockOneTimeObject.get("QUEST_COMPLETE").getAsJsonObject()));
			oneTimeMap.put("FRIEND_FOR_LIFE", new OneTime(
					skyblockOneTimeObject.get("FRIEND_FOR_LIFE").getAsJsonObject()));
			oneTimeMap.put("FRIAR_LAWRENCE", new OneTime(
					skyblockOneTimeObject.get("FRIAR_LAWRENCE").getAsJsonObject()));
			oneTimeMap.put("SWEET_TOOTH", new OneTime(
					skyblockOneTimeObject.get("SWEET_TOOTH").getAsJsonObject()));
			oneTimeMap.put("UNITED_IN_BLOOD", new OneTime(
					skyblockOneTimeObject.get("UNITED_IN_BLOOD").getAsJsonObject()));
			oneTimeMap.put("INFINITE_DARKNESS", new OneTime(
					skyblockOneTimeObject.get("INFINITE_DARKNESS").getAsJsonObject()));
			oneTimeMap.put("BIG_GAME_FISHER", new OneTime(
					skyblockOneTimeObject.get("BIG_GAME_FISHER").getAsJsonObject()));
			oneTimeMap.put("FROZEN_MONSTER", new OneTime(
					skyblockOneTimeObject.get("FROZEN_MONSTER").getAsJsonObject()));
			oneTimeMap.put("ADVANCED_TRANSPORTATION", new OneTime(
					skyblockOneTimeObject.get("ADVANCED_TRANSPORTATION").getAsJsonObject()));
			oneTimeMap.put("TIME_TO_GO_ON_VACATION", new OneTime(
					skyblockOneTimeObject.get("TIME_TO_GO_ON_VACATION").getAsJsonObject()));
			oneTimeMap.put("SIRIUS_BUSINESS", new OneTime(
					skyblockOneTimeObject.get("SIRIUS_BUSINESS").getAsJsonObject()));
			oneTimeMap.put("ARCADIA", new OneTime(
					skyblockOneTimeObject.get("ARCADIA").getAsJsonObject()));
			oneTimeMap.put("EXPLORER", new OneTime(
					skyblockOneTimeObject.get("EXPLORER").getAsJsonObject()));
			oneTimeMap.put("SEA_MONSTER", new OneTime(
					skyblockOneTimeObject.get("SEA_MONSTER").getAsJsonObject()));
			oneTimeMap.put("LIFELONG_CONTRACT", new OneTime(
					skyblockOneTimeObject.get("LIFELONG_CONTRACT").getAsJsonObject()));
			oneTimeMap.put("DEATH_FROM_ABOVE", new OneTime(
					skyblockOneTimeObject.get("DEATH_FROM_ABOVE").getAsJsonObject()));
			oneTimeMap.put("DUNGEON_EXPLORER", new OneTime(
					skyblockOneTimeObject.get("DUNGEON_EXPLORER").getAsJsonObject()));
			oneTimeMap.put("DEEP_STORAGE", new OneTime(
					skyblockOneTimeObject.get("DEEP_STORAGE").getAsJsonObject()));
			oneTimeMap.put("SACRIFICES_MUST_BE_MADE", new OneTime(
					skyblockOneTimeObject.get("SACRIFICES_MUST_BE_MADE").getAsJsonObject()));
			oneTimeMap.put("WATCH_ME_SHINE", new OneTime(
					skyblockOneTimeObject.get("WATCH_ME_SHINE").getAsJsonObject()));
			oneTimeMap.put("NO_ENCHANTS_NEEDED", new OneTime(
					skyblockOneTimeObject.get("NO_ENCHANTS_NEEDED").getAsJsonObject()));
			oneTimeMap.put("KING_OF_THE_SEA", new OneTime(
					skyblockOneTimeObject.get("KING_OF_THE_SEA").getAsJsonObject()));
			oneTimeMap.put("GOTTA_GO_FAST", new OneTime(
					skyblockOneTimeObject.get("GOTTA_GO_FAST").getAsJsonObject()));
			oneTimeMap.put("TRUE_ADVENTURER", new OneTime(
					skyblockOneTimeObject.get("TRUE_ADVENTURER").getAsJsonObject()));
			oneTimeMap.put("OH_SHINY", new OneTime(
					skyblockOneTimeObject.get("OH_SHINY").getAsJsonObject()));
			oneTimeMap.put("BUSINESSMAN", new OneTime(
					skyblockOneTimeObject.get("BUSINESSMAN").getAsJsonObject()));
			oneTimeMap.put("DULLAHAN", new OneTime(
					skyblockOneTimeObject.get("DULLAHAN").getAsJsonObject()));
			oneTimeMap.put("MASS_PRODUCTION", new OneTime(
					skyblockOneTimeObject.get("MASS_PRODUCTION").getAsJsonObject()));
			oneTimeMap.put("HAPPY_NEW_YEAR", new OneTime(
					skyblockOneTimeObject.get("HAPPY_NEW_YEAR").getAsJsonObject()));
			oneTimeMap.put("GOTTAGOFAST", new OneTime(
					skyblockOneTimeObject.get("GOTTAGOFAST").getAsJsonObject()));
			oneTimeMap.put("SOUL_HUNTER", new OneTime(
					skyblockOneTimeObject.get("SOUL_HUNTER").getAsJsonObject()));
			oneTimeMap.put("EXISTENTIAL_REVELATIONS", new OneTime(
					skyblockOneTimeObject.get("EXISTENTIAL_REVELATIONS").getAsJsonObject()));
			oneTimeMap.put("IT_NEVER_ENDS", new OneTime(
					skyblockOneTimeObject.get("IT_NEVER_ENDS").getAsJsonObject()));
			oneTimeMap.put("HAPPY_HOLIDAYS", new OneTime(
					skyblockOneTimeObject.get("HAPPY_HOLIDAYS").getAsJsonObject()));
			oneTimeMap.put("HIGHER_THAN_A_RABBIT", new OneTime(
					skyblockOneTimeObject.get("HIGHER_THAN_A_RABBIT").getAsJsonObject()));
			oneTimeMap.put("YOUR_BIG_BREAK", new OneTime(
					skyblockOneTimeObject.get("YOUR_BIG_BREAK").getAsJsonObject()));

			tieredMap.put("ANGLER", new Tiered(
					skyblockTieredObject.get("ANGLER").getAsJsonObject()));
			tieredMap.put("TREASURE_HUNTER", new Tiered(
					skyblockTieredObject.get("TREASURE_HUNTER").getAsJsonObject()));
			tieredMap.put("EXCAVATOR", new Tiered(
					skyblockTieredObject.get("EXCAVATOR").getAsJsonObject()));
			tieredMap.put("DUNGEONEER", new Tiered(
					skyblockTieredObject.get("DUNGEONEER").getAsJsonObject()));
			tieredMap.put("HARVESTER", new Tiered(
					skyblockTieredObject.get("HARVESTER").getAsJsonObject()));
			tieredMap.put("CONCOCTOR", new Tiered(
					skyblockTieredObject.get("CONCOCTOR").getAsJsonObject()));
			tieredMap.put("DOMESTICATOR", new Tiered(
					skyblockTieredObject.get("DOMESTICATOR").getAsJsonObject()));
			tieredMap.put("COMBAT", new Tiered(
					skyblockTieredObject.get("COMBAT").getAsJsonObject()));
			tieredMap.put("AUGMENTATION", new Tiered(
					skyblockTieredObject.get("AUGMENTATION").getAsJsonObject()));
			tieredMap.put("GATHERER", new Tiered(
					skyblockTieredObject.get("GATHERER").getAsJsonObject()));
			tieredMap.put("TREASURY", new Tiered(
					skyblockTieredObject.get("TREASURY").getAsJsonObject()));
			tieredMap.put("SLAYER", new Tiered(
					skyblockTieredObject.get("SLAYER").getAsJsonObject()));
			tieredMap.put("UNIQUE_GIFTS", new Tiered(
					skyblockTieredObject.get("UNIQUE_GIFTS").getAsJsonObject()));
			tieredMap.put("MINION_LOVER", new Tiered(
					skyblockTieredObject.get("MINION_LOVER").getAsJsonObject()));
		}

		/**
		 * Get Skyblock One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Skyblock Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Skywars Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Skywars {
		final JsonObject skywarsObject;
		final JsonObject skywarsOneTimeObject;
		final JsonObject skywarsTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Skywars(JsonObject skywarsObject) {
			this.skywarsObject = skywarsObject;
			this.skywarsOneTimeObject = skywarsObject.get("one_time").getAsJsonObject();
			this.skywarsTieredObject = skywarsObject.get("tiered").getAsJsonObject();
			putSkywarsData();
		}

		void putSkywarsData() {

			oneTimeMap.put("PEACEMAKER", new OneTime(
					skywarsOneTimeObject.get("PEACEMAKER").getAsJsonObject()));
			oneTimeMap.put("SIEGE", new OneTime(
					skywarsOneTimeObject.get("SIEGE").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_UHC", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_UHC").getAsJsonObject()));
			oneTimeMap.put("DONATOR", new OneTime(
					skywarsOneTimeObject.get("DONATOR").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_ROOKIE", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_ROOKIE").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_MASTER", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_MASTER").getAsJsonObject()));
			oneTimeMap.put("GOING_HAM", new OneTime(
					skywarsOneTimeObject.get("GOING_HAM").getAsJsonObject()));
			oneTimeMap.put("SHINY_STUFF", new OneTime(
					skywarsOneTimeObject.get("SHINY_STUFF").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_NO_BLOCK", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_NO_BLOCK").getAsJsonObject()));
			oneTimeMap.put("MYTHICAL", new OneTime(
					skywarsOneTimeObject.get("MYTHICAL").getAsJsonObject()));
			oneTimeMap.put("BALLER", new OneTime(
					skywarsOneTimeObject.get("BALLER").getAsJsonObject()));
			oneTimeMap.put("TEAMWORK_MAKES_THE_DREAM_WORK", new OneTime(
					skywarsOneTimeObject.get("TEAMWORK_MAKES_THE_DREAM_WORK").getAsJsonObject()));
			oneTimeMap.put("THE_ANGELS_JOURNEY", new OneTime(
					skywarsOneTimeObject.get("THE_ANGELS_JOURNEY").getAsJsonObject()));
			oneTimeMap.put("ATTENTION_SEEKING", new OneTime(
					skywarsOneTimeObject.get("ATTENTION_SEEKING").getAsJsonObject()));
			oneTimeMap.put("NOW_IM_ENCHANTED", new OneTime(
					skywarsOneTimeObject.get("NOW_IM_ENCHANTED").getAsJsonObject()));
			oneTimeMap.put("ENDERDRAGON", new OneTime(
					skywarsOneTimeObject.get("ENDERDRAGON").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_ULTIMATE_WARRIOR", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_ULTIMATE_WARRIOR").getAsJsonObject()));
			oneTimeMap.put("TOUCH_OF_DEATH", new OneTime(
					skywarsOneTimeObject.get("TOUCH_OF_DEATH").getAsJsonObject()));
			oneTimeMap.put("TROLOL", new OneTime(
					skywarsOneTimeObject.get("TROLOL").getAsJsonObject()));
			oneTimeMap.put("GAPPLE", new OneTime(
					skywarsOneTimeObject.get("GAPPLE").getAsJsonObject()));
			oneTimeMap.put("WELL_WELL", new OneTime(
					skywarsOneTimeObject.get("WELL_WELL").getAsJsonObject()));
			oneTimeMap.put("MAP_SELECT", new OneTime(
					skywarsOneTimeObject.get("MAP_SELECT").getAsJsonObject()));
			oneTimeMap.put("RNG", new OneTime(
					skywarsOneTimeObject.get("RNG").getAsJsonObject()));
			oneTimeMap.put("NO_CHEST_CHALLENGE", new OneTime(
					skywarsOneTimeObject.get("NO_CHEST_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("GONE_FISHING", new OneTime(
					skywarsOneTimeObject.get("GONE_FISHING").getAsJsonObject()));
			oneTimeMap.put("FAST_AND_FURIOUS", new OneTime(
					skywarsOneTimeObject.get("FAST_AND_FURIOUS").getAsJsonObject()));
			oneTimeMap.put("GOTCHA", new OneTime(
					skywarsOneTimeObject.get("GOTCHA").getAsJsonObject()));
			oneTimeMap.put("FISTS_OF_FURY", new OneTime(
					skywarsOneTimeObject.get("FISTS_OF_FURY").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY", new OneTime(
					skywarsOneTimeObject.get("LEGENDARY").getAsJsonObject()));
			oneTimeMap.put("MAX_WELL", new OneTime(
					skywarsOneTimeObject.get("MAX_WELL").getAsJsonObject()));
			oneTimeMap.put("SPEED_RUNNER", new OneTime(
					skywarsOneTimeObject.get("SPEED_RUNNER").getAsJsonObject()));
			oneTimeMap.put("SPEED_RUN", new OneTime(
					skywarsOneTimeObject.get("SPEED_RUN").getAsJsonObject()));
			oneTimeMap.put("MYSTERY_MOB", new OneTime(
					skywarsOneTimeObject.get("MYSTERY_MOB").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_NO_CHEST", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_NO_CHEST").getAsJsonObject()));
			oneTimeMap.put("KIT_CONOISSEUR", new OneTime(
					skywarsOneTimeObject.get("KIT_CONOISSEUR").getAsJsonObject()));
			oneTimeMap.put("TEAMWORK", new OneTime(
					skywarsOneTimeObject.get("TEAMWORK").getAsJsonObject()));
			oneTimeMap.put("HAPPY_MEAL", new OneTime(
					skywarsOneTimeObject.get("HAPPY_MEAL").getAsJsonObject()));
			oneTimeMap.put("KILLSTOLEN", new OneTime(
					skywarsOneTimeObject.get("KILLSTOLEN").getAsJsonObject()));
			oneTimeMap.put("MOB_SPAWNER", new OneTime(
					skywarsOneTimeObject.get("MOB_SPAWNER").getAsJsonObject()));
			oneTimeMap.put("ASHES_TO_ASHES", new OneTime(
					skywarsOneTimeObject.get("ASHES_TO_ASHES").getAsJsonObject()));
			oneTimeMap.put("MAX_PERK", new OneTime(
					skywarsOneTimeObject.get("MAX_PERK").getAsJsonObject()));
			oneTimeMap.put("KILL_STREAK", new OneTime(
					skywarsOneTimeObject.get("KILL_STREAK").getAsJsonObject()));
			oneTimeMap.put("LUCKY_CHARM", new OneTime(
					skywarsOneTimeObject.get("LUCKY_CHARM").getAsJsonObject()));
			oneTimeMap.put("SOLO_WARRIOR", new OneTime(
					skywarsOneTimeObject.get("SOLO_WARRIOR").getAsJsonObject()));
			oneTimeMap.put("WHO_NEEDS_TEAMMATES", new OneTime(
					skywarsOneTimeObject.get("WHO_NEEDS_TEAMMATES").getAsJsonObject()));
			oneTimeMap.put("LUCKY_SOULS", new OneTime(
					skywarsOneTimeObject.get("LUCKY_SOULS").getAsJsonObject()));
			oneTimeMap.put("MEGA_WARRIOR", new OneTime(
					skywarsOneTimeObject.get("MEGA_WARRIOR").getAsJsonObject()));
			oneTimeMap.put("NICK_CAGE", new OneTime(
					skywarsOneTimeObject.get("NICK_CAGE").getAsJsonObject()));
			oneTimeMap.put("CORRUPTION_LORD", new OneTime(
					skywarsOneTimeObject.get("CORRUPTION_LORD").getAsJsonObject()));
			oneTimeMap.put("FEAR_ME", new OneTime(
					skywarsOneTimeObject.get("FEAR_ME").getAsJsonObject()));
			oneTimeMap.put("SLOW_STEADY", new OneTime(
					skywarsOneTimeObject.get("SLOW_STEADY").getAsJsonObject()));
			oneTimeMap.put("PLAYING_IT_SAFE", new OneTime(
					skywarsOneTimeObject.get("PLAYING_IT_SAFE").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_PAPER", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_PAPER").getAsJsonObject()));
			oneTimeMap.put("OPEN_CHEST", new OneTime(
					skywarsOneTimeObject.get("OPEN_CHEST").getAsJsonObject()));
			oneTimeMap.put("CRIMINAL", new OneTime(
					skywarsOneTimeObject.get("CRIMINAL").getAsJsonObject()));
			oneTimeMap.put("HASTA_LA_VISTA", new OneTime(
					skywarsOneTimeObject.get("HASTA_LA_VISTA").getAsJsonObject()));
			oneTimeMap.put("SNIPER", new OneTime(
					skywarsOneTimeObject.get("SNIPER").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_ARCHER", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_ARCHER").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_HALF_HEALTH", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_HALF_HEALTH").getAsJsonObject()));
			oneTimeMap.put("PORTAL_GAME", new OneTime(
					skywarsOneTimeObject.get("PORTAL_GAME").getAsJsonObject()));
			oneTimeMap.put("CHALLENGE_PRO", new OneTime(
					skywarsOneTimeObject.get("CHALLENGE_PRO").getAsJsonObject()));
			oneTimeMap.put("WELL_DESERVED", new OneTime(
					skywarsOneTimeObject.get("WELL_DESERVED").getAsJsonObject()));

			tieredMap.put("KILLS_TEAM", new Tiered(
					skywarsTieredObject.get("KILLS_TEAM").getAsJsonObject()));
			tieredMap.put("KILLS_SOLO", new Tiered(
					skywarsTieredObject.get("KILLS_SOLO").getAsJsonObject()));
			tieredMap.put("KITS_TEAM", new Tiered(
					skywarsTieredObject.get("KITS_TEAM").getAsJsonObject()));
			tieredMap.put("KITS_SOLO", new Tiered(
					skywarsTieredObject.get("KITS_SOLO").getAsJsonObject()));
			tieredMap.put("KITS_MEGA", new Tiered(
					skywarsTieredObject.get("KITS_MEGA").getAsJsonObject()));
			tieredMap.put("OPAL_OBSESSION", new Tiered(
					skywarsTieredObject.get("OPAL_OBSESSION").getAsJsonObject()));
			tieredMap.put("WINS_TEAM", new Tiered(
					skywarsTieredObject.get("WINS_TEAM").getAsJsonObject()));
			tieredMap.put("WINS_LAB", new Tiered(
					skywarsTieredObject.get("WINS_LAB").getAsJsonObject()));
			tieredMap.put("WINS_SOLO", new Tiered(
					skywarsTieredObject.get("WINS_SOLO").getAsJsonObject()));
			tieredMap.put("WINS_MEGA", new Tiered(
					skywarsTieredObject.get("WINS_MEGA").getAsJsonObject()));
			tieredMap.put("CAGES", new Tiered(
					skywarsTieredObject.get("CAGES").getAsJsonObject()));
			tieredMap.put("NEW_DAY_NEW_CHALLENGE", new Tiered(
					skywarsTieredObject.get("NEW_DAY_NEW_CHALLENGE").getAsJsonObject()));
			tieredMap.put("KILLS_MEGA", new Tiered(
					skywarsTieredObject.get("KILLS_MEGA").getAsJsonObject()));
			tieredMap.put("HEADS", new Tiered(
					skywarsTieredObject.get("HEADS").getAsJsonObject()));
			tieredMap.put("YOU_RE_A_STAR", new Tiered(
					skywarsTieredObject.get("YOU_RE_A_STAR").getAsJsonObject()));
		}

		/**
		 * Get Skywars One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Skywars Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Speed UHC Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class SpeedUHC {
		final JsonObject speedUhcObject;
		final JsonObject speedUhcOneTimeObject;
		final JsonObject speedUhcTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public SpeedUHC(JsonObject speedUhcObject) {
			this.speedUhcObject = speedUhcObject;
			this.speedUhcOneTimeObject = speedUhcObject.get("one_time").getAsJsonObject();
			this.speedUhcTieredObject = speedUhcObject.get("tiered").getAsJsonObject();
			putSpeedUHCData();
		}

		void putSpeedUHCData() {

			oneTimeMap.put("POTION_BREWER", new OneTime(
					speedUhcOneTimeObject.get("POTION_BREWER").getAsJsonObject()));
			oneTimeMap.put("RIDE_PIG", new OneTime(
					speedUhcOneTimeObject.get("RIDE_PIG").getAsJsonObject()));
			oneTimeMap.put("MASTER_OF_MASTERS", new OneTime(
					speedUhcOneTimeObject.get("MASTER_OF_MASTERS").getAsJsonObject()));
			oneTimeMap.put("USE_ENDERPEARL", new OneTime(
					speedUhcOneTimeObject.get("USE_ENDERPEARL").getAsJsonObject()));
			oneTimeMap.put("GOLDEN_APPLE", new OneTime(
					speedUhcOneTimeObject.get("GOLDEN_APPLE").getAsJsonObject()));
			oneTimeMap.put("HOT_HOG", new OneTime(
					speedUhcOneTimeObject.get("HOT_HOG").getAsJsonObject()));
			oneTimeMap.put("NATURAL_TALENT", new OneTime(
					speedUhcOneTimeObject.get("NATURAL_TALENT").getAsJsonObject()));
			oneTimeMap.put("YEEHAW", new OneTime(
					speedUhcOneTimeObject.get("YEEHAW").getAsJsonObject()));
			oneTimeMap.put("ENCHANTED_ARMOR", new OneTime(
					speedUhcOneTimeObject.get("ENCHANTED_ARMOR").getAsJsonObject()));
			oneTimeMap.put("BRAVE_NEW_WORLD", new OneTime(
					speedUhcOneTimeObject.get("BRAVE_NEW_WORLD").getAsJsonObject()));
			oneTimeMap.put("SKELETON_BOW", new OneTime(
					speedUhcOneTimeObject.get("SKELETON_BOW").getAsJsonObject()));
			oneTimeMap.put("SNIPE_PLAYER", new OneTime(
					speedUhcOneTimeObject.get("SNIPE_PLAYER").getAsJsonObject()));
			oneTimeMap.put("KIT_SPECIALIST", new OneTime(
					speedUhcOneTimeObject.get("KIT_SPECIALIST").getAsJsonObject()));
			oneTimeMap.put("KIT_UNLOCK", new OneTime(
					speedUhcOneTimeObject.get("KIT_UNLOCK").getAsJsonObject()));
			oneTimeMap.put("KILL_TNT", new OneTime(
					speedUhcOneTimeObject.get("KILL_TNT").getAsJsonObject()));
			oneTimeMap.put("DIAMONDS", new OneTime(
					speedUhcOneTimeObject.get("DIAMONDS").getAsJsonObject()));
			oneTimeMap.put("MELON_SMASHER", new OneTime(
					speedUhcOneTimeObject.get("MELON_SMASHER").getAsJsonObject()));
			oneTimeMap.put("GOD_APPLE", new OneTime(
					speedUhcOneTimeObject.get("GOD_APPLE").getAsJsonObject()));
			oneTimeMap.put("TEARS_OF_LONELINESS", new OneTime(
					speedUhcOneTimeObject.get("TEARS_OF_LONELINESS").getAsJsonObject()));
			oneTimeMap.put("PAPER_CUT", new OneTime(
					speedUhcOneTimeObject.get("PAPER_CUT").getAsJsonObject()));
			oneTimeMap.put("RUSHER", new OneTime(
					speedUhcOneTimeObject.get("RUSHER").getAsJsonObject()));
			oneTimeMap.put("DOMINATION", new OneTime(
					speedUhcOneTimeObject.get("DOMINATION").getAsJsonObject()));
			oneTimeMap.put("MY_WAY", new OneTime(
					speedUhcOneTimeObject.get("MY_WAY").getAsJsonObject()));
			oneTimeMap.put("KILL_GHAST", new OneTime(
					speedUhcOneTimeObject.get("KILL_GHAST").getAsJsonObject()));

			tieredMap.put("SALTY", new Tiered(
					speedUhcTieredObject.get("SALTY").getAsJsonObject()));
			tieredMap.put("HUNTER", new Tiered(
					speedUhcTieredObject.get("HUNTER").getAsJsonObject()));
			tieredMap.put("COLLECTOR", new Tiered(
					speedUhcTieredObject.get("COLLECTOR").getAsJsonObject()));
			tieredMap.put("PROMOTION", new Tiered(
					speedUhcTieredObject.get("PROMOTION").getAsJsonObject()));
			tieredMap.put("UHC_MASTER", new Tiered(
					speedUhcTieredObject.get("UHC_MASTER").getAsJsonObject()));
		}

		/**
		 * Get Speed UHC One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Speed UHC Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Summer Achievements Data
	 *
	 * @author Kokahviel
	 * @since 3.0
	 */
	public static class Summer {
		final JsonObject summerObject;
		final JsonObject summerOneTimeObject;
		final JsonObject summerTieredObject;

		final Map<String, GlobalOneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Summer(JsonObject summerObject) {
			this.summerObject = summerObject;
			this.summerOneTimeObject = summerObject.get("one_time").getAsJsonObject();
			this.summerTieredObject = summerObject.get("tiered").getAsJsonObject();
			putSummerData();
		}

		void putSummerData() {

			oneTimeMap.put("HOME_RUN", new GlobalOneTime(
					summerOneTimeObject.get("HOME_RUN").getAsJsonObject()));
			oneTimeMap.put("WIN_PINK_SHEEP", new GlobalOneTime(
					summerOneTimeObject.get("WIN_PINK_SHEEP").getAsJsonObject()));
			oneTimeMap.put("COLLECTORS_EDITION", new GlobalOneTime(
					summerOneTimeObject.get("COLLECTORS_EDITION").getAsJsonObject()));
			oneTimeMap.put("EXPERT_DIVER", new GlobalOneTime(
					summerOneTimeObject.get("EXPERT_DIVER").getAsJsonObject()));
			oneTimeMap.put("POOL_PARTY", new GlobalOneTime(
					summerOneTimeObject.get("POOL_PARTY").getAsJsonObject()));
			oneTimeMap.put("AUSTRALIAN_WINTER", new GlobalOneTime(
					summerOneTimeObject.get("AUSTRALIAN_WINTER").getAsJsonObject()));
			oneTimeMap.put("SHOCKWAVE", new GlobalOneTime(
					summerOneTimeObject.get("SHOCKWAVE").getAsJsonObject()));
			oneTimeMap.put("BRING_THE_STORM", new GlobalOneTime(
					summerOneTimeObject.get("BRING_THE_STORM").getAsJsonObject()));
			oneTimeMap.put("LIGHTNING_ROD", new GlobalOneTime(
					summerOneTimeObject.get("LIGHTNING_ROD").getAsJsonObject()));
			oneTimeMap.put("PUNCH_OUT", new GlobalOneTime(
					summerOneTimeObject.get("PUNCH_OUT").getAsJsonObject()));
			oneTimeMap.put("GRILLMASTER", new GlobalOneTime(
					summerOneTimeObject.get("GRILLMASTER").getAsJsonObject()));

			tieredMap.put("GONE_FISHING", new Tiered(
					summerTieredObject.get("GONE_FISHING").getAsJsonObject()));
			tieredMap.put("TREASURE_HOARDER", new Tiered(
					summerTieredObject.get("TREASURE_HOARDER").getAsJsonObject()));
			tieredMap.put("TREASURE_MASTER", new Tiered(
					summerTieredObject.get("TREASURE_MASTER").getAsJsonObject()));
			tieredMap.put("SHOPAHOLIC", new Tiered(
					summerTieredObject.get("SHOPAHOLIC").getAsJsonObject()));
		}

		/**
		 * Get Summer One Time Achievements
		 */
		public Map<String, GlobalOneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Summer Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Smash Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Smash {

		final JsonObject smashObject;
		final JsonObject smashOneTimeObject;
		final JsonObject smashTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Smash(JsonObject smashObject) {
			this.smashObject = smashObject;
			this.smashOneTimeObject = smashObject.get("one_time").getAsJsonObject();
			this.smashTieredObject = smashObject.get("tiered").getAsJsonObject();
			putSmashData();
		}

		void putSmashData() {

			oneTimeMap.put("GENCLUCK_CHALLENGE", new OneTime(
					smashOneTimeObject.get("GENCLUCK_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("PUG_CHALLENGE", new OneTime(
					smashOneTimeObject.get("PUG_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("YOUNG_APPRENTICE", new OneTime(
					smashOneTimeObject.get("YOUNG_APPRENTICE").getAsJsonObject()));
			oneTimeMap.put("SHOOP_CHALLENGE", new OneTime(
					smashOneTimeObject.get("SHOOP_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("REACH_STARS", new OneTime(
					smashOneTimeObject.get("REACH_STARS").getAsJsonObject()));
			oneTimeMap.put("REACH_SKY", new OneTime(
					smashOneTimeObject.get("REACH_SKY").getAsJsonObject()));
			oneTimeMap.put("TINMAN_CHALLENGE", new OneTime(
					smashOneTimeObject.get("TINMAN_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("SPOODERMAN_CHALLENGE", new OneTime(
					smashOneTimeObject.get("SPOODERMAN_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("BOTMON_VS_SPOODERMAN", new OneTime(
					smashOneTimeObject.get("BOTMON_VS_SPOODERMAN").getAsJsonObject()));
			oneTimeMap.put("FROSTMAGE_CHALLENGE", new OneTime(
					smashOneTimeObject.get("FROSTMAGE_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("DOMINATION", new OneTime(
					smashOneTimeObject.get("DOMINATION").getAsJsonObject()));
			oneTimeMap.put("MARAUDER_CHALLENGE", new OneTime(
					smashOneTimeObject.get("MARAUDER_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("TWO_FOR_ONE", new OneTime(
					smashOneTimeObject.get("TWO_FOR_ONE").getAsJsonObject()));
			oneTimeMap.put("SECOND_ROUND", new OneTime(
					smashOneTimeObject.get("SECOND_ROUND").getAsJsonObject()));
			oneTimeMap.put("KARAKOT_CHALLENGE", new OneTime(
					smashOneTimeObject.get("KARAKOT_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("BOTMON_CHALLENGE", new OneTime(
					smashOneTimeObject.get("BOTMON_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("BULK_CHALLENGE", new OneTime(
					smashOneTimeObject.get("BULK_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("TOO_EASY", new OneTime(
					smashOneTimeObject.get("TOO_EASY").getAsJsonObject()));
			oneTimeMap.put("VOID_CHALLENGE", new OneTime(
					smashOneTimeObject.get("VOID_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("GET_OVER_HERE", new OneTime(
					smashOneTimeObject.get("GET_OVER_HERE").getAsJsonObject()));
			oneTimeMap.put("CAKE_CHALLENGE", new OneTime(
					smashOneTimeObject.get("CAKE_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("SUPREMACY", new OneTime(
					smashOneTimeObject.get("SUPREMACY").getAsJsonObject()));
			oneTimeMap.put("NEED_ALL", new OneTime(
					smashOneTimeObject.get("NEED_ALL").getAsJsonObject()));
			oneTimeMap.put("EXPERIENCE_EXPRESS", new OneTime(
					smashOneTimeObject.get("EXPERIENCE_EXPRESS").getAsJsonObject()));
			oneTimeMap.put("TEAMWORK", new OneTime(
					smashOneTimeObject.get("TEAMWORK").getAsJsonObject()));
			oneTimeMap.put("SKULLFIRE_CHALLENGE", new OneTime(
					smashOneTimeObject.get("SKULLFIRE_CHALLENGE").getAsJsonObject()));
			oneTimeMap.put("THE_PEAK", new OneTime(
					smashOneTimeObject.get("THE_PEAK").getAsJsonObject()));

			tieredMap.put("SMASH_CHAMPION", new Tiered(
					smashTieredObject.get("SMASH_CHAMPION").getAsJsonObject()));
			tieredMap.put("SMASH_WINNER", new Tiered(
					smashTieredObject.get("SMASH_WINNER").getAsJsonObject()));
			tieredMap.put("HERO_SLAYER", new Tiered(
					smashTieredObject.get("HERO_SLAYER").getAsJsonObject()));
			tieredMap.put("HANDYMAN", new Tiered(
					smashTieredObject.get("HANDYMAN").getAsJsonObject()));
		}

		/**
		 * Get Smash One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Smash Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Tnt Games Achievements Data
	 */
	public static class TNTGames {
		final JsonObject tntObject;
		final JsonObject tntOneTimeObject;
		final JsonObject tntTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public TNTGames(JsonObject tntObject) {
			this.tntObject = tntObject;
			this.tntOneTimeObject = tntObject.get("one_time").getAsJsonObject();
			this.tntTieredObject = tntObject.get("tiered").getAsJsonObject();
			putTntData();
		}

		void putTntData() {

			oneTimeMap.put("TNT_TAG_DIFFERENTTAGS", new OneTime(
					tntOneTimeObject.get("TNT_TAG_DIFFERENTTAGS").getAsJsonObject()));
			oneTimeMap.put("PRO_SURFER", new OneTime(
					tntOneTimeObject.get("PRO_SURFER").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_NOGOOD", new OneTime(
					tntOneTimeObject.get("WIZARDS_NOGOOD").getAsJsonObject()));
			oneTimeMap.put("TNT_NPCS", new OneTime(
					tntOneTimeObject.get("TNT_NPCS").getAsJsonObject()));
			oneTimeMap.put("DONT_GET_CLOSE", new OneTime(
					tntOneTimeObject.get("DONT_GET_CLOSE").getAsJsonObject()));
			oneTimeMap.put("SPLEEF_REPULSOR", new OneTime(
					tntOneTimeObject.get("SPLEEF_REPULSOR").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_FIRE_WIZARD_EXPLODE", new OneTime(
					tntOneTimeObject.get("WIZARDS_FIRE_WIZARD_EXPLODE").getAsJsonObject()));
			oneTimeMap.put("SPLEEF_HITS", new OneTime(
					tntOneTimeObject.get("SPLEEF_HITS").getAsJsonObject()));
			oneTimeMap.put("NO_YOU", new OneTime(
					tntOneTimeObject.get("NO_YOU").getAsJsonObject()));
			oneTimeMap.put("SPLEEF_NOPERKS", new OneTime(
					tntOneTimeObject.get("SPLEEF_NOPERKS").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_HURTS", new OneTime(
					tntOneTimeObject.get("WIZARDS_HURTS").getAsJsonObject()));
			oneTimeMap.put("WIN_STREAK", new OneTime(
					tntOneTimeObject.get("WIN_STREAK").getAsJsonObject()));
			oneTimeMap.put("SPOOKY", new OneTime(
					tntOneTimeObject.get("SPOOKY").getAsJsonObject()));
			oneTimeMap.put("FREEZE", new OneTime(
					tntOneTimeObject.get("FREEZE").getAsJsonObject()));
			oneTimeMap.put("JACK_OF_ALL", new OneTime(
					tntOneTimeObject.get("JACK_OF_ALL").getAsJsonObject()));
			oneTimeMap.put("BOW_SPLEEF_REPULSOR_UPGRADE", new OneTime(
					tntOneTimeObject.get("BOW_SPLEEF_REPULSOR_UPGRADE").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_FLYING", new OneTime(
					tntOneTimeObject.get("PVP_RUN_FLYING").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_TRIPLE", new OneTime(
					tntOneTimeObject.get("WIZARDS_TRIPLE").getAsJsonObject()));
			oneTimeMap.put("RUN_POTIONS", new OneTime(
					tntOneTimeObject.get("RUN_POTIONS").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_THIRTY_KILLS", new OneTime(
					tntOneTimeObject.get("WIZARDS_THIRTY_KILLS").getAsJsonObject()));
			oneTimeMap.put("TNT_WINS_IN_A_ROW", new OneTime(
					tntOneTimeObject.get("TNT_WINS_IN_A_ROW").getAsJsonObject()));
			oneTimeMap.put("TNT_TAG_BLOWNUP", new OneTime(
					tntOneTimeObject.get("TNT_TAG_BLOWNUP").getAsJsonObject()));
			oneTimeMap.put("TNT_TAG_DANGEROUS", new OneTime(
					tntOneTimeObject.get("TNT_TAG_DANGEROUS").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_TRIPLE", new OneTime(
					tntOneTimeObject.get("PVP_RUN_TRIPLE").getAsJsonObject()));
			oneTimeMap.put("TNT_RUN_NODJS", new OneTime(
					tntOneTimeObject.get("TNT_RUN_NODJS").getAsJsonObject()));
			oneTimeMap.put("EXTRME_SPEED", new OneTime(
					tntOneTimeObject.get("EXTRME_SPEED").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_NODJS", new OneTime(
					tntOneTimeObject.get("PVP_RUN_NODJS").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_BLOOD_WIZARD_REGEN", new OneTime(
					tntOneTimeObject.get("WIZARDS_BLOOD_WIZARD_REGEN").getAsJsonObject()));
			oneTimeMap.put("TNT_TAG_SNOWBALL", new OneTime(
					tntOneTimeObject.get("TNT_TAG_SNOWBALL").getAsJsonObject()));
			oneTimeMap.put("TIME_WIZARDS", new OneTime(
					tntOneTimeObject.get("TIME_WIZARDS").getAsJsonObject()));
			oneTimeMap.put("TNT_TAG_TRAVELLER", new OneTime(
					tntOneTimeObject.get("TNT_TAG_TRAVELLER").getAsJsonObject()));
			oneTimeMap.put("TNT_TAG_AWW", new OneTime(
					tntOneTimeObject.get("TNT_TAG_AWW").getAsJsonObject()));
			oneTimeMap.put("BOW_SPLEEF_TRIPLE_SHOT_UPGRADE", new OneTime(
					tntOneTimeObject.get("BOW_SPLEEF_TRIPLE_SHOT_UPGRADE").getAsJsonObject()));
			oneTimeMap.put("PATIENCE", new OneTime(
					tntOneTimeObject.get("PATIENCE").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_JUMPER", new OneTime(
					tntOneTimeObject.get("WIZARDS_JUMPER").getAsJsonObject()));
			oneTimeMap.put("TNT_RUN_NOMOVE", new OneTime(
					tntOneTimeObject.get("TNT_RUN_NOMOVE").getAsJsonObject()));
			oneTimeMap.put("SPLEEF_TRIPLE", new OneTime(
					tntOneTimeObject.get("SPLEEF_TRIPLE").getAsJsonObject()));
			oneTimeMap.put("BOW_SPLEEF_DOUBLE_JUMP_UPGRADE", new OneTime(
					tntOneTimeObject.get("BOW_SPLEEF_DOUBLE_JUMP_UPGRADE").getAsJsonObject()));
			oneTimeMap.put("SPLEEF_SHOTS", new OneTime(
					tntOneTimeObject.get("SPLEEF_SHOTS").getAsJsonObject()));
			oneTimeMap.put("TNT_TAG_TAGGER", new OneTime(
					tntOneTimeObject.get("TNT_TAG_TAGGER").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_CAPHELP", new OneTime(
					tntOneTimeObject.get("WIZARDS_CAPHELP").getAsJsonObject()));
			oneTimeMap.put("THAT_WAS_CLOSE", new OneTime(
					tntOneTimeObject.get("THAT_WAS_CLOSE").getAsJsonObject()));
			oneTimeMap.put("LUCKY", new OneTime(
					tntOneTimeObject.get("LUCKY").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_ASSISTANT", new OneTime(
					tntOneTimeObject.get("WIZARDS_ASSISTANT").getAsJsonObject()));
			oneTimeMap.put("BYE_BYE", new OneTime(
					tntOneTimeObject.get("BYE_BYE").getAsJsonObject()));
			oneTimeMap.put("POTION_SHOWER", new OneTime(
					tntOneTimeObject.get("POTION_SHOWER").getAsJsonObject()));
			oneTimeMap.put("SPLEEF_NOSHOTS", new OneTime(
					tntOneTimeObject.get("SPLEEF_NOSHOTS").getAsJsonObject()));
			oneTimeMap.put("TNT_RUN_FIRSTLAYER", new OneTime(
					tntOneTimeObject.get("TNT_RUN_FIRSTLAYER").getAsJsonObject()));
			oneTimeMap.put("TNT_RUN_FIRST_WIN", new OneTime(
					tntOneTimeObject.get("TNT_RUN_FIRST_WIN").getAsJsonObject()));
			oneTimeMap.put("TNT_RUN_NO_SPRINTING", new OneTime(
					tntOneTimeObject.get("TNT_RUN_NO_SPRINTING").getAsJsonObject()));
			oneTimeMap.put("SPLEEF_EXHAUSTED", new OneTime(
					tntOneTimeObject.get("SPLEEF_EXHAUSTED").getAsJsonObject()));
			oneTimeMap.put("KANGAROO", new OneTime(
					tntOneTimeObject.get("KANGAROO").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_MANYKILLS", new OneTime(
					tntOneTimeObject.get("PVP_RUN_MANYKILLS").getAsJsonObject()));
			oneTimeMap.put("HEALER", new OneTime(
					tntOneTimeObject.get("HEALER").getAsJsonObject()));
			oneTimeMap.put("TNT_PRESTIGE", new OneTime(
					tntOneTimeObject.get("TNT_PRESTIGE").getAsJsonObject()));
			oneTimeMap.put("TNT_RUN_SHORT", new OneTime(
					tntOneTimeObject.get("TNT_RUN_SHORT").getAsJsonObject()));
			oneTimeMap.put("TNT_RUN_EFFECTS", new OneTime(
					tntOneTimeObject.get("TNT_RUN_EFFECTS").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_PACIFIST", new OneTime(
					tntOneTimeObject.get("PVP_RUN_PACIFIST").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_LEADERBOARD", new OneTime(
					tntOneTimeObject.get("WIZARDS_LEADERBOARD").getAsJsonObject()));
			oneTimeMap.put("FLYING_MADMAN", new OneTime(
					tntOneTimeObject.get("FLYING_MADMAN").getAsJsonObject()));
			oneTimeMap.put("TNT_TAG_FIRST_WIN", new OneTime(
					tntOneTimeObject.get("TNT_TAG_FIRST_WIN").getAsJsonObject()));
			oneTimeMap.put("MAGNETIC_BOOTS", new OneTime(
					tntOneTimeObject.get("MAGNETIC_BOOTS").getAsJsonObject()));
			oneTimeMap.put("TNT_PARKOUR", new OneTime(
					tntOneTimeObject.get("TNT_PARKOUR").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_SABOTAGE", new OneTime(
					tntOneTimeObject.get("PVP_RUN_SABOTAGE").getAsJsonObject()));
			oneTimeMap.put("OVERPOWERED_ARCHERY", new OneTime(
					tntOneTimeObject.get("OVERPOWERED_ARCHERY").getAsJsonObject()));
			oneTimeMap.put("COMBO", new OneTime(
					tntOneTimeObject.get("COMBO").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_NOHIT", new OneTime(
					tntOneTimeObject.get("PVP_RUN_NOHIT").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_FIRST_WIN", new OneTime(
					tntOneTimeObject.get("PVP_RUN_FIRST_WIN").getAsJsonObject()));
			oneTimeMap.put("TNT_TAG_CLOSE", new OneTime(
					tntOneTimeObject.get("TNT_TAG_CLOSE").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_HEAL", new OneTime(
					tntOneTimeObject.get("WIZARDS_HEAL").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_AWIZARD", new OneTime(
					tntOneTimeObject.get("WIZARDS_AWIZARD").getAsJsonObject()));
			oneTimeMap.put("GRAND_MASTER", new OneTime(
					tntOneTimeObject.get("GRAND_MASTER").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_HALFHEARTED", new OneTime(
					tntOneTimeObject.get("PVP_RUN_HALFHEARTED").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_POTIONS", new OneTime(
					tntOneTimeObject.get("PVP_RUN_POTIONS").getAsJsonObject()));
			oneTimeMap.put("TNT_RUN_FLYING", new OneTime(
					tntOneTimeObject.get("TNT_RUN_FLYING").getAsJsonObject()));
			oneTimeMap.put("MEGA_TANK", new OneTime(
					tntOneTimeObject.get("MEGA_TANK").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_LEAD", new OneTime(
					tntOneTimeObject.get("WIZARDS_LEAD").getAsJsonObject()));
			oneTimeMap.put("TNT_RUN_PURCHASE_POTION", new OneTime(
					tntOneTimeObject.get("TNT_RUN_PURCHASE_POTION").getAsJsonObject()));
			oneTimeMap.put("BOW_SPLEEF_FIRST_DOUBLE_JUMP", new OneTime(
					tntOneTimeObject.get("BOW_SPLEEF_FIRST_DOUBLE_JUMP").getAsJsonObject()));
			oneTimeMap.put("TIMER", new OneTime(
					tntOneTimeObject.get("TIMER").getAsJsonObject()));
			oneTimeMap.put("WIZARDS_FIRST_WIN", new OneTime(
					tntOneTimeObject.get("WIZARDS_FIRST_WIN").getAsJsonObject()));
			oneTimeMap.put("SNIPER", new OneTime(
					tntOneTimeObject.get("SNIPER").getAsJsonObject()));
			oneTimeMap.put("TNT_TAG_DM", new OneTime(
					tntOneTimeObject.get("TNT_TAG_DM").getAsJsonObject()));
			oneTimeMap.put("PVP_RUN_FISTS", new OneTime(
					tntOneTimeObject.get("PVP_RUN_FISTS").getAsJsonObject()));
			oneTimeMap.put("BOW_SPLEEF_FIRST_WIN", new OneTime(
					tntOneTimeObject.get("BOW_SPLEEF_FIRST_WIN").getAsJsonObject()));
			oneTimeMap.put("SECOND_CHANCE", new OneTime(
					tntOneTimeObject.get("SECOND_CHANCE").getAsJsonObject()));

			tieredMap.put("PVP_RUN_WINS", new Tiered(
					tntTieredObject.get("PVP_RUN_WINS").getAsJsonObject()));
			tieredMap.put("TNT_WIZARDS_CAPS", new Tiered(
					tntTieredObject.get("TNT_WIZARDS_CAPS").getAsJsonObject()));
			tieredMap.put("TNT_TRIATHLON", new Tiered(
					tntTieredObject.get("TNT_TRIATHLON").getAsJsonObject()));
			tieredMap.put("BOW_SPLEEF_WINS", new Tiered(
					tntTieredObject.get("BOW_SPLEEF_WINS").getAsJsonObject()));
			tieredMap.put("TNT_RUN_WINS", new Tiered(
					tntTieredObject.get("TNT_RUN_WINS").getAsJsonObject()));
			tieredMap.put("WIZARDS_WINS", new Tiered(
					tntTieredObject.get("WIZARDS_WINS").getAsJsonObject()));
			tieredMap.put("TNT_WIZARDS_KILLS", new Tiered(
					tntTieredObject.get("TNT_WIZARDS_KILLS").getAsJsonObject()));
			tieredMap.put("CLINIC", new Tiered(
					tntTieredObject.get("CLINIC").getAsJsonObject()));
			tieredMap.put("BLOCK_RUNNER", new Tiered(
					tntTieredObject.get("BLOCK_RUNNER").getAsJsonObject()));
			tieredMap.put("TNT_TAG_WINS", new Tiered(
					tntTieredObject.get("TNT_TAG_WINS").getAsJsonObject()));
			tieredMap.put("PVP_RUN_KILLER", new Tiered(
					tntTieredObject.get("PVP_RUN_KILLER").getAsJsonObject()));
			tieredMap.put("TNT_BANKER", new Tiered(
					tntTieredObject.get("TNT_BANKER").getAsJsonObject()));
		}

		/**
		 * Get Tnt One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Tnt Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * UHC Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class UHC {
		final JsonObject uhcObject;
		final JsonObject uhcOneTimeObject;
		final JsonObject uhcTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public UHC(JsonObject uhcObject) {
			this.uhcObject = uhcObject;
			this.uhcOneTimeObject = uhcObject.get("one_time").getAsJsonObject();
			this.uhcTieredObject = uhcObject.get("tiered").getAsJsonObject();
			putUHCData();
		}

		void putUHCData() {

			oneTimeMap.put("CRAFTING_REVOLUTION", new OneTime(
					uhcOneTimeObject.get("CRAFTING_REVOLUTION").getAsJsonObject()));
			oneTimeMap.put("BLOODTHIRSTY", new OneTime(
					uhcOneTimeObject.get("BLOODTHIRSTY").getAsJsonObject()));
			oneTimeMap.put("FEARED_HUNTERS", new OneTime(
					uhcOneTimeObject.get("FEARED_HUNTERS").getAsJsonObject()));
			oneTimeMap.put("PUPPY", new OneTime(
					uhcOneTimeObject.get("PUPPY").getAsJsonObject()));
			oneTimeMap.put("POWERHOUSE", new OneTime(
					uhcOneTimeObject.get("POWERHOUSE").getAsJsonObject()));
			oneTimeMap.put("RIDE_A_HORSE", new OneTime(
					uhcOneTimeObject.get("RIDE_A_HORSE").getAsJsonObject()));
			oneTimeMap.put("KIT_MASTERY", new OneTime(
					uhcOneTimeObject.get("KIT_MASTERY").getAsJsonObject()));
			oneTimeMap.put("BOMBERMAN", new OneTime(
					uhcOneTimeObject.get("BOMBERMAN").getAsJsonObject()));
			oneTimeMap.put("OBLITERATE", new OneTime(
					uhcOneTimeObject.get("OBLITERATE").getAsJsonObject()));
			oneTimeMap.put("ELITE_PRESTIGE", new OneTime(
					uhcOneTimeObject.get("ELITE_PRESTIGE").getAsJsonObject()));
			oneTimeMap.put("ELDORADO", new OneTime(
					uhcOneTimeObject.get("ELDORADO").getAsJsonObject()));
			oneTimeMap.put("MUSIC", new OneTime(
					uhcOneTimeObject.get("MUSIC").getAsJsonObject()));
			oneTimeMap.put("ROBIN_HOOD", new OneTime(
					uhcOneTimeObject.get("ROBIN_HOOD").getAsJsonObject()));
			oneTimeMap.put("NOTHING_CAN_STOP_US", new OneTime(
					uhcOneTimeObject.get("NOTHING_CAN_STOP_US").getAsJsonObject()));
			oneTimeMap.put("PARKOUR_MASTER", new OneTime(
					uhcOneTimeObject.get("PARKOUR_MASTER").getAsJsonObject()));
			oneTimeMap.put("ENDERKIND", new OneTime(
					uhcOneTimeObject.get("ENDERKIND").getAsJsonObject()));
			oneTimeMap.put("CALLING_UPON_THOR", new OneTime(
					uhcOneTimeObject.get("CALLING_UPON_THOR").getAsJsonObject()));
			oneTimeMap.put("DEATHS_SCYTHE", new OneTime(
					uhcOneTimeObject.get("DEATHS_SCYTHE").getAsJsonObject()));
			oneTimeMap.put("DEUX_EX_MACHINA", new OneTime(
					uhcOneTimeObject.get("DEUX_EX_MACHINA").getAsJsonObject()));
			oneTimeMap.put("CRAZY_HARDCORE", new OneTime(
					uhcOneTimeObject.get("CRAZY_HARDCORE").getAsJsonObject()));
			oneTimeMap.put("EXODUS", new OneTime(
					uhcOneTimeObject.get("EXODUS").getAsJsonObject()));
			oneTimeMap.put("NO_PROBLEM_HERE", new OneTime(
					uhcOneTimeObject.get("NO_PROBLEM_HERE").getAsJsonObject()));
			oneTimeMap.put("WEALTHY_CHAMPION", new OneTime(
					uhcOneTimeObject.get("WEALTHY_CHAMPION").getAsJsonObject()));
			oneTimeMap.put("ULTIMATE_RECIPE", new OneTime(
					uhcOneTimeObject.get("ULTIMATE_RECIPE").getAsJsonObject()));
			oneTimeMap.put("ULTIMATELY_WEALTHY", new OneTime(
					uhcOneTimeObject.get("ULTIMATELY_WEALTHY").getAsJsonObject()));
			oneTimeMap.put("WRONG_MODE", new OneTime(
					uhcOneTimeObject.get("WRONG_MODE").getAsJsonObject()));
			oneTimeMap.put("AXE_OF_PERUN", new OneTime(
					uhcOneTimeObject.get("AXE_OF_PERUN").getAsJsonObject()));
			oneTimeMap.put("BYE_CRUEL_WORLD", new OneTime(
					uhcOneTimeObject.get("BYE_CRUEL_WORLD").getAsJsonObject()));
			oneTimeMap.put("CHAMPION_RANK", new OneTime(
					uhcOneTimeObject.get("CHAMPION_RANK").getAsJsonObject()));
			oneTimeMap.put("PRESTIGIOUS", new OneTime(
					uhcOneTimeObject.get("PRESTIGIOUS").getAsJsonObject()));
			oneTimeMap.put("ULTIMATE_CRAFTING", new OneTime(
					uhcOneTimeObject.get("ULTIMATE_CRAFTING").getAsJsonObject()));
			oneTimeMap.put("GHAST", new OneTime(
					uhcOneTimeObject.get("GHAST").getAsJsonObject()));
			oneTimeMap.put("SEAFOOD", new OneTime(
					uhcOneTimeObject.get("SEAFOOD").getAsJsonObject()));
			oneTimeMap.put("SHINY_ROCK", new OneTime(
					uhcOneTimeObject.get("SHINY_ROCK").getAsJsonObject()));
			oneTimeMap.put("DRINK_WITH_CAUTION", new OneTime(
					uhcOneTimeObject.get("DRINK_WITH_CAUTION").getAsJsonObject()));
			oneTimeMap.put("GHOST_RIDER", new OneTime(
					uhcOneTimeObject.get("GHOST_RIDER").getAsJsonObject()));
			oneTimeMap.put("TABLETS_OF_DESTINY", new OneTime(
					uhcOneTimeObject.get("TABLETS_OF_DESTINY").getAsJsonObject()));
			oneTimeMap.put("TOTAL_DOMINATION", new OneTime(
					uhcOneTimeObject.get("TOTAL_DOMINATION").getAsJsonObject()));
			oneTimeMap.put("DONG", new OneTime(
					uhcOneTimeObject.get("DONG").getAsJsonObject()));
			oneTimeMap.put("RAMPAGE", new OneTime(
					uhcOneTimeObject.get("RAMPAGE").getAsJsonObject()));
			oneTimeMap.put("CHEST_OF_FATE", new OneTime(
					uhcOneTimeObject.get("CHEST_OF_FATE").getAsJsonObject()));
			oneTimeMap.put("DICE_OF_GOD", new OneTime(
					uhcOneTimeObject.get("DICE_OF_GOD").getAsJsonObject()));
			oneTimeMap.put("EXTRA_POWERFUL", new OneTime(
					uhcOneTimeObject.get("EXTRA_POWERFUL").getAsJsonObject()));
			oneTimeMap.put("ADRENALINE", new OneTime(
					uhcOneTimeObject.get("ADRENALINE").getAsJsonObject()));
			oneTimeMap.put("WARMING_UP", new OneTime(
					uhcOneTimeObject.get("WARMING_UP").getAsJsonObject()));

			tieredMap.put("HUNTER", new Tiered(
					uhcTieredObject.get("HUNTER").getAsJsonObject()));
			tieredMap.put("MOVING_UP", new Tiered(
					uhcTieredObject.get("MOVING_UP").getAsJsonObject()));
			tieredMap.put("CHAMPION", new Tiered(
					uhcTieredObject.get("CHAMPION").getAsJsonObject()));
			tieredMap.put("CONSUMER", new Tiered(
					uhcTieredObject.get("CONSUMER").getAsJsonObject()));
			tieredMap.put("BOUNTY", new Tiered(
					uhcTieredObject.get("BOUNTY").getAsJsonObject()));
			tieredMap.put("ULTIMATUM", new Tiered(
					uhcTieredObject.get("ULTIMATUM").getAsJsonObject()));
		}

		/**
		 * Get UHC One TIme Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get UHC Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * VampireZ Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class VampireZ {
		final JsonObject vampireZObject;
		final JsonObject vampireZOneTimeObject;
		final JsonObject vampireZTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public VampireZ(JsonObject vampireZObject) {
			this.vampireZObject = vampireZObject;
			this.vampireZOneTimeObject = vampireZObject.get("one_time").getAsJsonObject();
			this.vampireZTieredObject = vampireZObject.get("tiered").getAsJsonObject();
			putVampireZData();
		}

		void putVampireZData() {

			oneTimeMap.put("PURCHASE_BLOOD", new OneTime(
					vampireZOneTimeObject.get("PURCHASE_BLOOD").getAsJsonObject()));
			oneTimeMap.put("NIGHTMARE", new OneTime(
					vampireZOneTimeObject.get("NIGHTMARE").getAsJsonObject()));
			oneTimeMap.put("BLOOD_THIRSTY", new OneTime(
					vampireZOneTimeObject.get("BLOOD_THIRSTY").getAsJsonObject()));
			oneTimeMap.put("PURCHASE_GOLD", new OneTime(
					vampireZOneTimeObject.get("PURCHASE_GOLD").getAsJsonObject()));
			oneTimeMap.put("PEST", new OneTime(
					vampireZOneTimeObject.get("PEST").getAsJsonObject()));
			oneTimeMap.put("BLOOD", new OneTime(
					vampireZOneTimeObject.get("BLOOD").getAsJsonObject()));
			oneTimeMap.put("PURCHASE_FOOD", new OneTime(
					vampireZOneTimeObject.get("PURCHASE_FOOD").getAsJsonObject()));
			oneTimeMap.put("SOLE_SURVIVOR", new OneTime(
					vampireZOneTimeObject.get("SOLE_SURVIVOR").getAsJsonObject()));
			oneTimeMap.put("ROBBED", new OneTime(
					vampireZOneTimeObject.get("ROBBED").getAsJsonObject()));
			oneTimeMap.put("VAMPIRE_FANG_KILL", new OneTime(
					vampireZOneTimeObject.get("VAMPIRE_FANG_KILL").getAsJsonObject()));
			oneTimeMap.put("VAMPIRE_KILLS_ONE_ROUND", new OneTime(
					vampireZOneTimeObject.get("VAMPIRE_KILLS_ONE_ROUND").getAsJsonObject()));
			oneTimeMap.put("PURCHASE_ARMOR", new OneTime(
					vampireZOneTimeObject.get("PURCHASE_ARMOR").getAsJsonObject()));
			oneTimeMap.put("DONT_NEED_IT", new OneTime(
					vampireZOneTimeObject.get("DONT_NEED_IT").getAsJsonObject()));
			oneTimeMap.put("PURCHASE_SWORD", new OneTime(
					vampireZOneTimeObject.get("PURCHASE_SWORD").getAsJsonObject()));
			oneTimeMap.put("VAMPIRE_SHOP", new OneTime(
					vampireZOneTimeObject.get("VAMPIRE_SHOP").getAsJsonObject()));
			oneTimeMap.put("POTIONS", new OneTime(
					vampireZOneTimeObject.get("POTIONS").getAsJsonObject()));
			oneTimeMap.put("KILL_ZOMBIES", new OneTime(
					vampireZOneTimeObject.get("KILL_ZOMBIES").getAsJsonObject()));
			oneTimeMap.put("UPGRADED", new OneTime(
					vampireZOneTimeObject.get("UPGRADED").getAsJsonObject()));
			oneTimeMap.put("UNDEFEATABLE", new OneTime(
					vampireZOneTimeObject.get("UNDEFEATABLE").getAsJsonObject()));
			oneTimeMap.put("WORD_PUNS", new OneTime(
					vampireZOneTimeObject.get("WORD_PUNS").getAsJsonObject()));
			oneTimeMap.put("PURIFIED", new OneTime(
					vampireZOneTimeObject.get("PURIFIED").getAsJsonObject()));
			oneTimeMap.put("CHEST_HUNTER", new OneTime(
					vampireZOneTimeObject.get("CHEST_HUNTER").getAsJsonObject()));
			oneTimeMap.put("GOLD", new OneTime(
					vampireZOneTimeObject.get("GOLD").getAsJsonObject()));
			oneTimeMap.put("LAST_CHANCE", new OneTime(
					vampireZOneTimeObject.get("LAST_CHANCE").getAsJsonObject()));
			oneTimeMap.put("FIRST_WAVE_KILL", new OneTime(
					vampireZOneTimeObject.get("FIRST_WAVE_KILL").getAsJsonObject()));
			oneTimeMap.put("TASTES_FUNNY", new OneTime(
					vampireZOneTimeObject.get("TASTES_FUNNY").getAsJsonObject()));
			oneTimeMap.put("ZOMBIE_SLAYER", new OneTime(
					vampireZOneTimeObject.get("ZOMBIE_SLAYER").getAsJsonObject()));
			oneTimeMap.put("SURVIVOR_KILLS_ONE_ROUND", new OneTime(
					vampireZOneTimeObject.get("SURVIVOR_KILLS_ONE_ROUND").getAsJsonObject()));
			oneTimeMap.put("ZOMBIE_WHISPERER", new OneTime(
					vampireZOneTimeObject.get("ZOMBIE_WHISPERER").getAsJsonObject()));

			tieredMap.put("ZOMBIE_KILLER", new Tiered(
					vampireZTieredObject.get("ZOMBIE_KILLER").getAsJsonObject()));
			tieredMap.put("COINS", new Tiered(
					vampireZTieredObject.get("COINS").getAsJsonObject()));
			tieredMap.put("KILL_VAMPIRES", new Tiered(
					vampireZTieredObject.get("KILL_VAMPIRES").getAsJsonObject()));
			tieredMap.put("KILL_SURVIVORS", new Tiered(
					vampireZTieredObject.get("KILL_SURVIVORS").getAsJsonObject()));
			tieredMap.put("SURVIVOR_WINS", new Tiered(
					vampireZTieredObject.get("SURVIVOR_WINS").getAsJsonObject()));
		}

		/**
		 * Get VampireZ One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get VampireZ Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Walls Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Walls {
		final JsonObject wallsObject;
		final JsonObject wallsOneTimeObject;
		final JsonObject wallsTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Walls(JsonObject wallsObject) {
			this.wallsObject = wallsObject;
			this.wallsOneTimeObject = wallsObject.get("one_time").getAsJsonObject();
			this.wallsTieredObject = wallsObject.get("tiered").getAsJsonObject();
			putWallsData();
		}

		void putWallsData() {

			oneTimeMap.put("FIRST_KIT", new OneTime(
					wallsOneTimeObject.get("FIRST_KIT").getAsJsonObject()));
			oneTimeMap.put("GET_DIAMOND_SWORD", new OneTime(
					wallsOneTimeObject.get("GET_DIAMOND_SWORD").getAsJsonObject()));
			oneTimeMap.put("CRAFT_FLINT", new OneTime(
					wallsOneTimeObject.get("CRAFT_FLINT").getAsJsonObject()));
			oneTimeMap.put("TRUE_POWER", new OneTime(
					wallsOneTimeObject.get("TRUE_POWER").getAsJsonObject()));
			oneTimeMap.put("FINDING_NEMO", new OneTime(
					wallsOneTimeObject.get("FINDING_NEMO").getAsJsonObject()));
			oneTimeMap.put("NO_TEAM_DEATHS", new OneTime(
					wallsOneTimeObject.get("NO_TEAM_DEATHS").getAsJsonObject()));
			oneTimeMap.put("CATCH_FISH", new OneTime(
					wallsOneTimeObject.get("CATCH_FISH").getAsJsonObject()));
			oneTimeMap.put("KILL_CLIFF", new OneTime(
					wallsOneTimeObject.get("KILL_CLIFF").getAsJsonObject()));
			oneTimeMap.put("ENGINEER", new OneTime(
					wallsOneTimeObject.get("ENGINEER").getAsJsonObject()));
			oneTimeMap.put("WIPED_OUT", new OneTime(
					wallsOneTimeObject.get("WIPED_OUT").getAsJsonObject()));
			oneTimeMap.put("BURNING", new OneTime(
					wallsOneTimeObject.get("BURNING").getAsJsonObject()));
			oneTimeMap.put("REVENGE", new OneTime(
					wallsOneTimeObject.get("REVENGE").getAsJsonObject()));
			oneTimeMap.put("NOT_A_FISH", new OneTime(
					wallsOneTimeObject.get("NOT_A_FISH").getAsJsonObject()));
			oneTimeMap.put("CUSTOMIZED", new OneTime(
					wallsOneTimeObject.get("CUSTOMIZED").getAsJsonObject()));
			oneTimeMap.put("CREATE_PORTAL", new OneTime(
					wallsOneTimeObject.get("CREATE_PORTAL").getAsJsonObject()));
			oneTimeMap.put("RIDE_HORSE", new OneTime(
					wallsOneTimeObject.get("RIDE_HORSE").getAsJsonObject()));
			oneTimeMap.put("UNTOUCHABLE", new OneTime(
					wallsOneTimeObject.get("UNTOUCHABLE").getAsJsonObject()));
			oneTimeMap.put("CRAFT_BOAT", new OneTime(
					wallsOneTimeObject.get("CRAFT_BOAT").getAsJsonObject()));
			oneTimeMap.put("TEN_KILLS", new OneTime(
					wallsOneTimeObject.get("TEN_KILLS").getAsJsonObject()));
			oneTimeMap.put("SOLE_SURVIVOR", new OneTime(
					wallsOneTimeObject.get("SOLE_SURVIVOR").getAsJsonObject()));
			oneTimeMap.put("VAMPIRISM", new OneTime(
					wallsOneTimeObject.get("VAMPIRISM").getAsJsonObject()));
			oneTimeMap.put("FIRST_PERK", new OneTime(
					wallsOneTimeObject.get("FIRST_PERK").getAsJsonObject()));
			oneTimeMap.put("BERSERK", new OneTime(
					wallsOneTimeObject.get("BERSERK").getAsJsonObject()));
			oneTimeMap.put("ROBIN_HOOD", new OneTime(
					wallsOneTimeObject.get("ROBIN_HOOD").getAsJsonObject()));
			oneTimeMap.put("NOT_TODAY", new OneTime(
					wallsOneTimeObject.get("NOT_TODAY").getAsJsonObject()));
			oneTimeMap.put("STARTER_KITS", new OneTime(
					wallsOneTimeObject.get("STARTER_KITS").getAsJsonObject()));
			oneTimeMap.put("RECORD_LABEL", new OneTime(
					wallsOneTimeObject.get("RECORD_LABEL").getAsJsonObject()));

			tieredMap.put("DIAMOND_MINER", new Tiered(
					wallsTieredObject.get("DIAMOND_MINER").getAsJsonObject()));
			tieredMap.put("KILLS", new Tiered(
					wallsTieredObject.get("KILLS").getAsJsonObject()));
			tieredMap.put("COINS", new Tiered(
					wallsTieredObject.get("COINS").getAsJsonObject()));
			tieredMap.put("WINS", new Tiered(
					wallsTieredObject.get("WINS").getAsJsonObject()));
		}

		/**
		 * Get Walls One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Walls Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Mega Walls Achievements Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class MegaWalls {
		final JsonObject megaWallsObject;
		final JsonObject megaWallsOneTimeObject;
		final JsonObject megaWallsTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public MegaWalls(JsonObject megaWallsObject) {
			this.megaWallsObject = megaWallsObject;
			this.megaWallsOneTimeObject = megaWallsObject.get("one_time").getAsJsonObject();
			this.megaWallsTieredObject = megaWallsObject.get("tiered").getAsJsonObject();
			putMegaWallsData();
		}

		void putMegaWallsData() {

			oneTimeMap.put("WHATS_THE_BIG_IDEA", new OneTime(
					megaWallsOneTimeObject.get("WHATS_THE_BIG_IDEA").getAsJsonObject()));
			oneTimeMap.put("READY_SET_BOOM", new OneTime(
					megaWallsOneTimeObject.get("READY_SET_BOOM").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_AUTOMATON", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_AUTOMATON").getAsJsonObject()));
			oneTimeMap.put("WOLF_SMASH", new OneTime(
					megaWallsOneTimeObject.get("WOLF_SMASH").getAsJsonObject()));
			oneTimeMap.put("HEAVY_EATER", new OneTime(
					megaWallsOneTimeObject.get("HEAVY_EATER").getAsJsonObject()));
			oneTimeMap.put("GONE_VEGAN", new OneTime(
					megaWallsOneTimeObject.get("GONE_VEGAN").getAsJsonObject()));
			oneTimeMap.put("GRAVE_ROBBER", new OneTime(
					megaWallsOneTimeObject.get("GRAVE_ROBBER").getAsJsonObject()));
			oneTimeMap.put("BULL_SHARK", new OneTime(
					megaWallsOneTimeObject.get("BULL_SHARK").getAsJsonObject()));
			oneTimeMap.put("THROWING_COCONUTS", new OneTime(
					megaWallsOneTimeObject.get("THROWING_COCONUTS").getAsJsonObject()));
			oneTimeMap.put("BIRDS_EYE", new OneTime(
					megaWallsOneTimeObject.get("BIRDS_EYE").getAsJsonObject()));
			oneTimeMap.put("TREASURE_HUNTER", new OneTime(
					megaWallsOneTimeObject.get("TREASURE_HUNTER").getAsJsonObject()));
			oneTimeMap.put("EMP", new OneTime(
					megaWallsOneTimeObject.get("EMP").getAsJsonObject()));
			oneTimeMap.put("RECYCLING", new OneTime(
					megaWallsOneTimeObject.get("RECYCLING").getAsJsonObject()));
			oneTimeMap.put("HAMMER_HEAD", new OneTime(
					megaWallsOneTimeObject.get("HAMMER_HEAD").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_SQUID", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_SQUID").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_HUNTER", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_HUNTER").getAsJsonObject()));
			oneTimeMap.put("SAVE_YOUR_STUFF", new OneTime(
					megaWallsOneTimeObject.get("SAVE_YOUR_STUFF").getAsJsonObject()));
			oneTimeMap.put("ALOTV1", new OneTime(
					megaWallsOneTimeObject.get("ALOTV1").getAsJsonObject()));
			oneTimeMap.put("I_FEEL_SICK", new OneTime(
					megaWallsOneTimeObject.get("I_FEEL_SICK").getAsJsonObject()));
			oneTimeMap.put("FIRST_SKILL_UPGRADE", new OneTime(
					megaWallsOneTimeObject.get("FIRST_SKILL_UPGRADE").getAsJsonObject()));
			oneTimeMap.put("TIGER_SHARK", new OneTime(
					megaWallsOneTimeObject.get("TIGER_SHARK").getAsJsonObject()));
			oneTimeMap.put("COMING_THROUGH", new OneTime(
					megaWallsOneTimeObject.get("COMING_THROUGH").getAsJsonObject()));
			oneTimeMap.put("MOODSETTER", new OneTime(
					megaWallsOneTimeObject.get("MOODSETTER").getAsJsonObject()));
			oneTimeMap.put("BLAZE_PARTY", new OneTime(
					megaWallsOneTimeObject.get("BLAZE_PARTY").getAsJsonObject()));
			oneTimeMap.put("REMOTE_DETONATION", new OneTime(
					megaWallsOneTimeObject.get("REMOTE_DETONATION").getAsJsonObject()));
			oneTimeMap.put("TIME_TO_DIET", new OneTime(
					megaWallsOneTimeObject.get("TIME_TO_DIET").getAsJsonObject()));
			oneTimeMap.put("CAKE_HUNTER_2", new OneTime(
					megaWallsOneTimeObject.get("CAKE_HUNTER_2").getAsJsonObject()));
			oneTimeMap.put("FAILED_EXPERIMENT", new OneTime(
					megaWallsOneTimeObject.get("FAILED_EXPERIMENT").getAsJsonObject()));
			oneTimeMap.put("TO_INFINITY", new OneTime(
					megaWallsOneTimeObject.get("TO_INFINITY").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_PIRATE", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_PIRATE").getAsJsonObject()));
			oneTimeMap.put("HUNTING_SEASON", new OneTime(
					megaWallsOneTimeObject.get("HUNTING_SEASON").getAsJsonObject()));
			oneTimeMap.put("CIRCLE_OF_TRUST", new OneTime(
					megaWallsOneTimeObject.get("CIRCLE_OF_TRUST").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_SKELETON", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_SKELETON").getAsJsonObject()));
			oneTimeMap.put("SNEAK_ATTACK", new OneTime(
					megaWallsOneTimeObject.get("SNEAK_ATTACK").getAsJsonObject()));
			oneTimeMap.put("BLOOD_LUST", new OneTime(
					megaWallsOneTimeObject.get("BLOOD_LUST").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_SPIDER", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_SPIDER").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_WEREWOLF", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_WEREWOLF").getAsJsonObject()));
			oneTimeMap.put("MORRA", new OneTime(
					megaWallsOneTimeObject.get("MORRA").getAsJsonObject()));
			oneTimeMap.put("I_AM_COW", new OneTime(
					megaWallsOneTimeObject.get("I_AM_COW").getAsJsonObject()));
			oneTimeMap.put("SLEEPYTIME", new OneTime(
					megaWallsOneTimeObject.get("SLEEPYTIME").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_ENDERMAN", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_ENDERMAN").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_PHOENIX", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_PHOENIX").getAsJsonObject()));
			oneTimeMap.put("MUCH_DOGS", new OneTime(
					megaWallsOneTimeObject.get("MUCH_DOGS").getAsJsonObject()));
			oneTimeMap.put("ESC", new OneTime(
					megaWallsOneTimeObject.get("ESC").getAsJsonObject()));
			oneTimeMap.put("CAPTAIN_COMBO", new OneTime(
					megaWallsOneTimeObject.get("CAPTAIN_COMBO").getAsJsonObject()));
			oneTimeMap.put("MARKSMAN", new OneTime(
					megaWallsOneTimeObject.get("MARKSMAN").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_SHARK", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_SHARK").getAsJsonObject()));
			oneTimeMap.put("LASER_PRECISION", new OneTime(
					megaWallsOneTimeObject.get("LASER_PRECISION").getAsJsonObject()));
			oneTimeMap.put("HAMMER_DOWN", new OneTime(
					megaWallsOneTimeObject.get("HAMMER_DOWN").getAsJsonObject()));
			oneTimeMap.put("COLLECTOR", new OneTime(
					megaWallsOneTimeObject.get("COLLECTOR").getAsJsonObject()));
			oneTimeMap.put("SKITTERAMA", new OneTime(
					megaWallsOneTimeObject.get("SKITTERAMA").getAsJsonObject()));
			oneTimeMap.put("SURPRISE", new OneTime(
					megaWallsOneTimeObject.get("SURPRISE").getAsJsonObject()));
			oneTimeMap.put("POTIONS_OF_DEATH", new OneTime(
					megaWallsOneTimeObject.get("POTIONS_OF_DEATH").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_ASSASSIN", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_ASSASSIN").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_ZOMBIE", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_ZOMBIE").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_CREEPER", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_CREEPER").getAsJsonObject()));
			oneTimeMap.put("HARD_AS_STEEL", new OneTime(
					megaWallsOneTimeObject.get("HARD_AS_STEEL").getAsJsonObject()));
			oneTimeMap.put("MINE_DIAMOND", new OneTime(
					megaWallsOneTimeObject.get("MINE_DIAMOND").getAsJsonObject()));
			oneTimeMap.put("PEACEKREEPER", new OneTime(
					megaWallsOneTimeObject.get("PEACEKREEPER").getAsJsonObject()));
			oneTimeMap.put("TRUST_ME_IM_A_DOCTOR", new OneTime(
					megaWallsOneTimeObject.get("TRUST_ME_IM_A_DOCTOR").getAsJsonObject()));
			oneTimeMap.put("ON_POINT", new OneTime(
					megaWallsOneTimeObject.get("ON_POINT").getAsJsonObject()));
			oneTimeMap.put("MULTI_KILL", new OneTime(
					megaWallsOneTimeObject.get("MULTI_KILL").getAsJsonObject()));
			oneTimeMap.put("YEEHAW", new OneTime(
					megaWallsOneTimeObject.get("YEEHAW").getAsJsonObject()));
			oneTimeMap.put("WUNDERBAR", new OneTime(
					megaWallsOneTimeObject.get("WUNDERBAR").getAsJsonObject()));
			oneTimeMap.put("ALCHEMY_100", new OneTime(
					megaWallsOneTimeObject.get("ALCHEMY_100").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_HEROBRINE", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_HEROBRINE").getAsJsonObject()));
			oneTimeMap.put("THIS_IS_MY_FINAL_FORM", new OneTime(
					megaWallsOneTimeObject.get("THIS_IS_MY_FINAL_FORM").getAsJsonObject()));
			oneTimeMap.put("BIOLOGICAL_RESTORATION", new OneTime(
					megaWallsOneTimeObject.get("BIOLOGICAL_RESTORATION").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_DREADLORD", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_DREADLORD").getAsJsonObject()));
			oneTimeMap.put("BA_BOOM", new OneTime(
					megaWallsOneTimeObject.get("BA_BOOM").getAsJsonObject()));
			oneTimeMap.put("INVENTORY_MANAGEMENT", new OneTime(
					megaWallsOneTimeObject.get("INVENTORY_MANAGEMENT").getAsJsonObject()));
			oneTimeMap.put("SPEED_RUN", new OneTime(
					megaWallsOneTimeObject.get("SPEED_RUN").getAsJsonObject()));
			oneTimeMap.put("BORN_TALENTED", new OneTime(
					megaWallsOneTimeObject.get("BORN_TALENTED").getAsJsonObject()));
			oneTimeMap.put("FIRST_GATHERING_SKILL_UPGRADE", new OneTime(
					megaWallsOneTimeObject.get("FIRST_GATHERING_SKILL_UPGRADE").getAsJsonObject()));
			oneTimeMap.put("ATTACK_WITHER", new OneTime(
					megaWallsOneTimeObject.get("ATTACK_WITHER").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_MOLEMAN", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_MOLEMAN").getAsJsonObject()));
			oneTimeMap.put("YOU_SHALL_NOT_PASS", new OneTime(
					megaWallsOneTimeObject.get("YOU_SHALL_NOT_PASS").getAsJsonObject()));
			oneTimeMap.put("GREAT_WHITE", new OneTime(
					megaWallsOneTimeObject.get("GREAT_WHITE").getAsJsonObject()));
			oneTimeMap.put("THANKS_CONNOR", new OneTime(
					megaWallsOneTimeObject.get("THANKS_CONNOR").getAsJsonObject()));
			oneTimeMap.put("MAX_SKILLS", new OneTime(
					megaWallsOneTimeObject.get("MAX_SKILLS").getAsJsonObject()));
			oneTimeMap.put("VETERAN", new OneTime(
					megaWallsOneTimeObject.get("VETERAN").getAsJsonObject()));
			oneTimeMap.put("ITS_ALL_OGRE_NOW", new OneTime(
					megaWallsOneTimeObject.get("ITS_ALL_OGRE_NOW").getAsJsonObject()));
			oneTimeMap.put("CHILL_SNIPER", new OneTime(
					megaWallsOneTimeObject.get("CHILL_SNIPER").getAsJsonObject()));
			oneTimeMap.put("FIRE_IN_THE_HOLE", new OneTime(
					megaWallsOneTimeObject.get("FIRE_IN_THE_HOLE").getAsJsonObject()));
			oneTimeMap.put("SKELETONS_BEST_FRIEND", new OneTime(
					megaWallsOneTimeObject.get("SKELETONS_BEST_FRIEND").getAsJsonObject()));
			oneTimeMap.put("DEATH_FROM_ABOVE", new OneTime(
					megaWallsOneTimeObject.get("DEATH_FROM_ABOVE").getAsJsonObject()));
			oneTimeMap.put("FEELS_BAD", new OneTime(
					megaWallsOneTimeObject.get("FEELS_BAD").getAsJsonObject()));
			oneTimeMap.put("SPEEDY_MINEMAN", new OneTime(
					megaWallsOneTimeObject.get("SPEEDY_MINEMAN").getAsJsonObject()));
			oneTimeMap.put("COMPETITIVE", new OneTime(
					megaWallsOneTimeObject.get("COMPETITIVE").getAsJsonObject()));
			oneTimeMap.put("LUCKY_SUNNY", new OneTime(
					megaWallsOneTimeObject.get("LUCKY_SUNNY").getAsJsonObject()));
			oneTimeMap.put("ASHES_TO_BASHES", new OneTime(
					megaWallsOneTimeObject.get("ASHES_TO_BASHES").getAsJsonObject()));
			oneTimeMap.put("HUG_ME", new OneTime(
					megaWallsOneTimeObject.get("HUG_ME").getAsJsonObject()));
			oneTimeMap.put("SEASONS_GREETINGS", new OneTime(
					megaWallsOneTimeObject.get("SEASONS_GREETINGS").getAsJsonObject()));
			oneTimeMap.put("MAGNATE", new OneTime(
					megaWallsOneTimeObject.get("MAGNATE").getAsJsonObject()));
			oneTimeMap.put("GERONIMO", new OneTime(
					megaWallsOneTimeObject.get("GERONIMO").getAsJsonObject()));
			oneTimeMap.put("BOW_DOWN", new OneTime(
					megaWallsOneTimeObject.get("BOW_DOWN").getAsJsonObject()));
			oneTimeMap.put("TEAM_PLAYER", new OneTime(
					megaWallsOneTimeObject.get("TEAM_PLAYER").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_COW", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_COW").getAsJsonObject()));
			oneTimeMap.put("AVALANCHE", new OneTime(
					megaWallsOneTimeObject.get("AVALANCHE").getAsJsonObject()));
			oneTimeMap.put("MAXIMUM_EFFORT", new OneTime(
					megaWallsOneTimeObject.get("MAXIMUM_EFFORT").getAsJsonObject()));
			oneTimeMap.put("REVENGE_OF_THE_WOLVES", new OneTime(
					megaWallsOneTimeObject.get("REVENGE_OF_THE_WOLVES").getAsJsonObject()));
			oneTimeMap.put("RUSHLORD", new OneTime(
					megaWallsOneTimeObject.get("RUSHLORD").getAsJsonObject()));
			oneTimeMap.put("HIGH_ON_ORES", new OneTime(
					megaWallsOneTimeObject.get("HIGH_ON_ORES").getAsJsonObject()));
			oneTimeMap.put("FIND_CHEST", new OneTime(
					megaWallsOneTimeObject.get("FIND_CHEST").getAsJsonObject()));
			oneTimeMap.put("WHIRLWIND", new OneTime(
					megaWallsOneTimeObject.get("WHIRLWIND").getAsJsonObject()));
			oneTimeMap.put("NIGHTS_REST", new OneTime(
					megaWallsOneTimeObject.get("NIGHTS_REST").getAsJsonObject()));
			oneTimeMap.put("WIN_BEFORE_DEATHMATCH", new OneTime(
					megaWallsOneTimeObject.get("WIN_BEFORE_DEATHMATCH").getAsJsonObject()));
			oneTimeMap.put("BREADLORD", new OneTime(
					megaWallsOneTimeObject.get("BREADLORD").getAsJsonObject()));
			oneTimeMap.put("WHIRLPOOL", new OneTime(
					megaWallsOneTimeObject.get("WHIRLPOOL").getAsJsonObject()));
			oneTimeMap.put("LOUIS", new OneTime(
					megaWallsOneTimeObject.get("LOUIS").getAsJsonObject()));
			oneTimeMap.put("FROSTY_FRIENDSHIP", new OneTime(
					megaWallsOneTimeObject.get("FROSTY_FRIENDSHIP").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_BLAZE", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_BLAZE").getAsJsonObject()));
			oneTimeMap.put("DONT_BLINK", new OneTime(
					megaWallsOneTimeObject.get("DONT_BLINK").getAsJsonObject()));
			oneTimeMap.put("EXCHANGE", new OneTime(
					megaWallsOneTimeObject.get("EXCHANGE").getAsJsonObject()));
			oneTimeMap.put("THUNDER", new OneTime(
					megaWallsOneTimeObject.get("THUNDER").getAsJsonObject()));
			oneTimeMap.put("CRUISING_FLAMES", new OneTime(
					megaWallsOneTimeObject.get("CRUISING_FLAMES").getAsJsonObject()));
			oneTimeMap.put("WIN_WITH_LIVING_WITHER", new OneTime(
					megaWallsOneTimeObject.get("WIN_WITH_LIVING_WITHER").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_SHAMAN", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_SHAMAN").getAsJsonObject()));
			oneTimeMap.put("TIMBER", new OneTime(
					megaWallsOneTimeObject.get("TIMBER").getAsJsonObject()));
			oneTimeMap.put("AT_LEAST_HE_TRIED", new OneTime(
					megaWallsOneTimeObject.get("AT_LEAST_HE_TRIED").getAsJsonObject()));
			oneTimeMap.put("GOTCHA", new OneTime(
					megaWallsOneTimeObject.get("GOTCHA").getAsJsonObject()));
			oneTimeMap.put("MAX_RENDER_DISTANCE", new OneTime(
					megaWallsOneTimeObject.get("MAX_RENDER_DISTANCE").getAsJsonObject()));
			oneTimeMap.put("NINJA_7S", new OneTime(
					megaWallsOneTimeObject.get("NINJA_7S").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_GOLEM", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_GOLEM").getAsJsonObject()));
			oneTimeMap.put("BLOWING_BUBBLES", new OneTime(
					megaWallsOneTimeObject.get("BLOWING_BUBBLES").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_RENEGADE", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_RENEGADE").getAsJsonObject()));
			oneTimeMap.put("MASTERPIECE", new OneTime(
					megaWallsOneTimeObject.get("MASTERPIECE").getAsJsonObject()));
			oneTimeMap.put("MAX_ZOMBIE_SKILLS", new OneTime(
					megaWallsOneTimeObject.get("MAX_ZOMBIE_SKILLS").getAsJsonObject()));
			oneTimeMap.put("HAPPY", new OneTime(
					megaWallsOneTimeObject.get("HAPPY").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_ARCANIST", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_ARCANIST").getAsJsonObject()));
			oneTimeMap.put("STAYIN_ALIVE", new OneTime(
					megaWallsOneTimeObject.get("STAYIN_ALIVE").getAsJsonObject()));
			oneTimeMap.put("NOT_A_GOLEM", new OneTime(
					megaWallsOneTimeObject.get("NOT_A_GOLEM").getAsJsonObject()));
			oneTimeMap.put("SCHOOL_CANCELLED", new OneTime(
					megaWallsOneTimeObject.get("SCHOOL_CANCELLED").getAsJsonObject()));
			oneTimeMap.put("MASS_DESTRUCTION", new OneTime(
					megaWallsOneTimeObject.get("MASS_DESTRUCTION").getAsJsonObject()));
			oneTimeMap.put("INTO_THE_FUTURE", new OneTime(
					megaWallsOneTimeObject.get("INTO_THE_FUTURE").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_PIGMAN", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_PIGMAN").getAsJsonObject()));
			oneTimeMap.put("TERMINATED_SCRIPT", new OneTime(
					megaWallsOneTimeObject.get("TERMINATED_SCRIPT").getAsJsonObject()));
			oneTimeMap.put("CONSTRUCTOR", new OneTime(
					megaWallsOneTimeObject.get("CONSTRUCTOR").getAsJsonObject()));
			oneTimeMap.put("MOO_BRAWL", new OneTime(
					megaWallsOneTimeObject.get("MOO_BRAWL").getAsJsonObject()));
			oneTimeMap.put("MAX_SKELETON_SKILLS", new OneTime(
					megaWallsOneTimeObject.get("MAX_SKELETON_SKILLS").getAsJsonObject()));
			oneTimeMap.put("TAKING_THE_HEAT", new OneTime(
					megaWallsOneTimeObject.get("TAKING_THE_HEAT").getAsJsonObject()));
			oneTimeMap.put("ADVANCED_STRATEGIES", new OneTime(
					megaWallsOneTimeObject.get("ADVANCED_STRATEGIES").getAsJsonObject()));
			oneTimeMap.put("UNTOUCHABLE", new OneTime(
					megaWallsOneTimeObject.get("UNTOUCHABLE").getAsJsonObject()));
			oneTimeMap.put("TIME_TO_FEAST", new OneTime(
					megaWallsOneTimeObject.get("TIME_TO_FEAST").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY_SNOWMAN", new OneTime(
					megaWallsOneTimeObject.get("LEGENDARY_SNOWMAN").getAsJsonObject()));
			oneTimeMap.put("MAX_HEROBRINE_SKILLS", new OneTime(
					megaWallsOneTimeObject.get("MAX_HEROBRINE_SKILLS").getAsJsonObject()));

			tieredMap.put("COINS", new Tiered(
					megaWallsTieredObject.get("COINS").getAsJsonObject()));
			tieredMap.put("JACK_OF_ALL_TRADES", new Tiered(
					megaWallsTieredObject.get("JACK_OF_ALL_TRADES").getAsJsonObject()));
			tieredMap.put("GUARDIAN", new Tiered(
					megaWallsTieredObject.get("GUARDIAN").getAsJsonObject()));
			tieredMap.put("WINS", new Tiered(
					megaWallsTieredObject.get("WINS").getAsJsonObject()));
			tieredMap.put("CAKE_HUNTER_TIERED", new Tiered(
					megaWallsTieredObject.get("CAKE_HUNTER_TIERED").getAsJsonObject()));
			tieredMap.put("KILLS", new Tiered(
					megaWallsTieredObject.get("KILLS").getAsJsonObject()));
			tieredMap.put("MOCTEZUMA", new Tiered(
					megaWallsTieredObject.get("MOCTEZUMA").getAsJsonObject()));
			tieredMap.put("RUSHER", new Tiered(
					megaWallsTieredObject.get("RUSHER").getAsJsonObject()));
		}

		/**
		 * Get Mega Walls One Time Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Mega Walls Tiered Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * Warlords Achievements Data
	 *
	 * @author Kokahviel
	 * @since 3.0
	 */
	public static class Warlords {
		final JsonObject warlordsObject;
		final JsonObject warlordsOneTimeObject;
		final JsonObject warlordsTieredObject;

		final Map<String, OneTime> oneTimeMap = new HashMap<>();
		final Map<String, Tiered> tieredMap = new HashMap<>();

		public Warlords(JsonObject warlordsObject) {
			this.warlordsObject = warlordsObject;
			this.warlordsOneTimeObject = warlordsObject.get("one_time").getAsJsonObject();
			this.warlordsTieredObject = warlordsObject.get("tiered").getAsJsonObject();
			putWarlordsData();
		}

		void putWarlordsData() {

			oneTimeMap.put("MEDIUM_RARE", new OneTime(
					warlordsOneTimeObject.get("MEDIUM_RARE").getAsJsonObject()));
			oneTimeMap.put("COMING_THROUGH", new OneTime(
					warlordsOneTimeObject.get("COMING_THROUGH").getAsJsonObject()));
			oneTimeMap.put("SUPERNATURAL", new OneTime(
					warlordsOneTimeObject.get("SUPERNATURAL").getAsJsonObject()));
			oneTimeMap.put("SOLO_CARRY", new OneTime(
					warlordsOneTimeObject.get("SOLO_CARRY").getAsJsonObject()));
			oneTimeMap.put("MY_PLEASURE", new OneTime(
					warlordsOneTimeObject.get("MY_PLEASURE").getAsJsonObject()));
			oneTimeMap.put("WARLORD", new OneTime(
					warlordsOneTimeObject.get("WARLORD").getAsJsonObject()));
			oneTimeMap.put("GREEN_IS_LOVE", new OneTime(
					warlordsOneTimeObject.get("GREEN_IS_LOVE").getAsJsonObject()));
			oneTimeMap.put("MAD_SKILLZ_YO", new OneTime(
					warlordsOneTimeObject.get("MAD_SKILLZ_YO").getAsJsonObject()));
			oneTimeMap.put("HAMMER_OF_DESTRUCTION", new OneTime(
					warlordsOneTimeObject.get("HAMMER_OF_DESTRUCTION").getAsJsonObject()));
			oneTimeMap.put("WORLD_TRAVEL", new OneTime(
					warlordsOneTimeObject.get("WORLD_TRAVEL").getAsJsonObject()));
			oneTimeMap.put("EXTENSIVE_TRAINING", new OneTime(
					warlordsOneTimeObject.get("EXTENSIVE_TRAINING").getAsJsonObject()));
			oneTimeMap.put("EAGLE_EYED", new OneTime(
					warlordsOneTimeObject.get("EAGLE_EYED").getAsJsonObject()));
			oneTimeMap.put("THAT_WAS_EASY", new OneTime(
					warlordsOneTimeObject.get("THAT_WAS_EASY").getAsJsonObject()));
			oneTimeMap.put("CAPTURE_THE_WIN", new OneTime(
					warlordsOneTimeObject.get("CAPTURE_THE_WIN").getAsJsonObject()));
			oneTimeMap.put("I_HAVE_TO_CONCENTRATE", new OneTime(
					warlordsOneTimeObject.get("I_HAVE_TO_CONCENTRATE").getAsJsonObject()));
			oneTimeMap.put("JUICED_UP", new OneTime(
					warlordsOneTimeObject.get("JUICED_UP").getAsJsonObject()));
			oneTimeMap.put("ARE_YOU_KIDDING_ME", new OneTime(
					warlordsOneTimeObject.get("ARE_YOU_KIDDING_ME").getAsJsonObject()));
			oneTimeMap.put("SHARDS_FOR_GLORY", new OneTime(
					warlordsOneTimeObject.get("SHARDS_FOR_GLORY").getAsJsonObject()));
			oneTimeMap.put("TOTAL_DOMINATION", new OneTime(
					warlordsOneTimeObject.get("TOTAL_DOMINATION").getAsJsonObject()));
			oneTimeMap.put("NIFTY", new OneTime(
					warlordsOneTimeObject.get("NIFTY").getAsJsonObject()));
			oneTimeMap.put("MAKIN_SOME_ROOM", new OneTime(
					warlordsOneTimeObject.get("MAKIN_SOME_ROOM").getAsJsonObject()));
			oneTimeMap.put("LIFELEECH", new OneTime(
					warlordsOneTimeObject.get("LIFELEECH").getAsJsonObject()));
			oneTimeMap.put("SLOW_DOWN_THERE", new OneTime(
					warlordsOneTimeObject.get("SLOW_DOWN_THERE").getAsJsonObject()));
			oneTimeMap.put("GIDDY_UP", new OneTime(
					warlordsOneTimeObject.get("GIDDY_UP").getAsJsonObject()));
			oneTimeMap.put("BEEP_BEEP", new OneTime(
					warlordsOneTimeObject.get("BEEP_BEEP").getAsJsonObject()));
			oneTimeMap.put("AVENGERS_WRATH", new OneTime(
					warlordsOneTimeObject.get("AVENGERS_WRATH").getAsJsonObject()));
			oneTimeMap.put("THIS_BETTER_BE_GOOD", new OneTime(
					warlordsOneTimeObject.get("THIS_BETTER_BE_GOOD").getAsJsonObject()));
			oneTimeMap.put("RIGHT_ON_TIME", new OneTime(
					warlordsOneTimeObject.get("RIGHT_ON_TIME").getAsJsonObject()));
			oneTimeMap.put("I_GOT_YOU_BRO", new OneTime(
					warlordsOneTimeObject.get("I_GOT_YOU_BRO").getAsJsonObject()));
			oneTimeMap.put("POWER_UP", new OneTime(
					warlordsOneTimeObject.get("POWER_UP").getAsJsonObject()));
			oneTimeMap.put("I_MUST_RESIST", new OneTime(
					warlordsOneTimeObject.get("I_MUST_RESIST").getAsJsonObject()));
			oneTimeMap.put("UNDEAD_ARMY", new OneTime(
					warlordsOneTimeObject.get("UNDEAD_ARMY").getAsJsonObject()));
			oneTimeMap.put("BEARING_GIFTS", new OneTime(
					warlordsOneTimeObject.get("BEARING_GIFTS").getAsJsonObject()));
			oneTimeMap.put("COLLATERAL_DAMAGE", new OneTime(
					warlordsOneTimeObject.get("COLLATERAL_DAMAGE").getAsJsonObject()));
			oneTimeMap.put("FEELING_SPECIAL", new OneTime(
					warlordsOneTimeObject.get("FEELING_SPECIAL").getAsJsonObject()));
			oneTimeMap.put("FIRST_OF_MANY", new OneTime(
					warlordsOneTimeObject.get("FIRST_OF_MANY").getAsJsonObject()));
			oneTimeMap.put("PURPLE_POWER", new OneTime(
					warlordsOneTimeObject.get("PURPLE_POWER").getAsJsonObject()));
			oneTimeMap.put("LEGENDARY", new OneTime(
					warlordsOneTimeObject.get("LEGENDARY").getAsJsonObject()));
			oneTimeMap.put("BOOT_CAMP", new OneTime(
					warlordsOneTimeObject.get("BOOT_CAMP").getAsJsonObject()));
			oneTimeMap.put("IT_SHINES", new OneTime(
					warlordsOneTimeObject.get("IT_SHINES").getAsJsonObject()));
			oneTimeMap.put("ON_TOP", new OneTime(
					warlordsOneTimeObject.get("ON_TOP").getAsJsonObject()));
			oneTimeMap.put("CHAIN_KILL", new OneTime(
					warlordsOneTimeObject.get("CHAIN_KILL").getAsJsonObject()));
			oneTimeMap.put("SUPER_SOAKER", new OneTime(
					warlordsOneTimeObject.get("SUPER_SOAKER").getAsJsonObject()));
			oneTimeMap.put("SUPER_POWERS", new OneTime(
					warlordsOneTimeObject.get("SUPER_POWERS").getAsJsonObject()));
			oneTimeMap.put("SURPRISE_ATTACK", new OneTime(
					warlordsOneTimeObject.get("SURPRISE_ATTACK").getAsJsonObject()));

			tieredMap.put("ASSIST", new Tiered(
					warlordsTieredObject.get("ASSIST").getAsJsonObject()));
			tieredMap.put("REPAIR_WEAPONS", new Tiered(
					warlordsTieredObject.get("REPAIR_WEAPONS").getAsJsonObject()));
			tieredMap.put("CTF_WINS", new Tiered(
					warlordsTieredObject.get("CTF_WINS").getAsJsonObject()));
			tieredMap.put("SHAMAN_LEVEL", new Tiered(
					warlordsTieredObject.get("SHAMAN_LEVEL").getAsJsonObject()));
			tieredMap.put("MAGE_LEVEL", new Tiered(
					warlordsTieredObject.get("MAGE_LEVEL").getAsJsonObject()));
			tieredMap.put("DOM_OBJECTIVE", new Tiered(
					warlordsTieredObject.get("DOM_OBJECTIVE").getAsJsonObject()));
			tieredMap.put("WARRIOR_LEVEL", new Tiered(
					warlordsTieredObject.get("WARRIOR_LEVEL").getAsJsonObject()));
			tieredMap.put("TDM_WINS", new Tiered(
					warlordsTieredObject.get("TDM_WINS").getAsJsonObject()));
			tieredMap.put("COINS", new Tiered(
					warlordsTieredObject.get("COINS").getAsJsonObject()));
			tieredMap.put("KILLS", new Tiered(
					warlordsTieredObject.get("KILLS").getAsJsonObject()));
			tieredMap.put("CTF_OBJECTIVE", new Tiered(
					warlordsTieredObject.get("CTF_OBJECTIVE").getAsJsonObject()));
			tieredMap.put("PALADIN_LEVEL", new Tiered(
					warlordsTieredObject.get("PALADIN_LEVEL").getAsJsonObject()));
			tieredMap.put("DOM_WINS", new Tiered(
					warlordsTieredObject.get("DOM_WINS").getAsJsonObject()));
		}

		/**
		 * Get One Time Warlords Achievements
		 */
		public Map<String, OneTime> getOneTimeMap() {
			return oneTimeMap;
		}

		/**
		 * Get Tiered Warlords Achievements
		 */
		public Map<String, Tiered> getTieredMap() {
			return tieredMap;
		}
	}

	/**
	 * One Time Achievement Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class OneTime {

		final int points;
		final String name;
		final String description;
		final double gamePercentUnlocked;
		final double globalPercentUnlocked;

		OneTime(JsonObject oneTimeObject) {
			this.points = oneTimeObject.get("points").getAsInt();
			this.name = oneTimeObject.get("name").getAsString();
			this.description = oneTimeObject.get("description").getAsString();
			this.gamePercentUnlocked = oneTimeObject.get("gamePercentUnlocked").getAsDouble();
			this.globalPercentUnlocked = oneTimeObject.get("globalPercentUnlocked").getAsDouble();
		}

		/**
		 * Get Points Won when Get Achievement
		 */
		public int getPoints() {
			return points;
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
		 * Get Unlocked Percentage of Player of This Game
		 */
		public double getGamePercentUnlocked() {
			return gamePercentUnlocked;
		}

		/**
		 * Get Unlocked Percentage of Entire Server
		 */
		public double getGlobalPercentUnlocked() {
			return globalPercentUnlocked;
		}
	}

	/**
	 * Global One Time Achievement Data
	 *
	 * @author Kokahviel
	 * @since 3.0
	 */
	public static class GlobalOneTime {

		final int points;
		final String name;
		final String description;

		GlobalOneTime(JsonObject oneTimeObject) {
			this.points = oneTimeObject.get("points").getAsInt();
			this.name = oneTimeObject.get("name").getAsString();
			this.description = oneTimeObject.get("description").getAsString();
		}

		/**
		 * Get Total Points Won when Get the Achievement
		 */
		public int getPoints() {
			return points;
		}

		/**
		 * Get Global Achievement Full Name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Get Global Achievement Description
		 */
		public String getDescription() {
			return description;
		}
	}

	/**
	 * Tiered Achievement Data
	 *
	 * @author Kokhaviel
	 * @since 3.0
	 */
	public static class Tiered {

		final String name;
		final String description;
		final JsonArray tierArray;

		Tiered(JsonObject tieredObject) {
			this.name = tieredObject.get("name").getAsString();
			this.description = tieredObject.get("description").getAsString();
			tierArray = tieredObject.get("tiers").getAsJsonArray();
		}

		/**
		 * Get Tiered Achievement Full Name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Get Tiered Achievement Description
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
		public Tiered.Tier getTier(int tierLevel) {
			if(tierLevel <= 0) throw new HypixelAPIException("Achievement Tier Cannot Be 0, 1 is Minimum");
			return new Tiered.Tier(tierArray.get(tierLevel - 1).getAsJsonObject());
		}

		/**
		 * Achievement Tier Data
		 *
		 * @author Kokhaviel
		 * @since 3.0
		 */
		public static class Tier {

			final int tier;
			final int points;
			final int amount;

			Tier(JsonObject tierObject) {
				this.tier = tierObject.get("tier").getAsInt();
				this.points = tierObject.get("points").getAsInt();
				this.amount = tierObject.get("amount").getAsInt();
			}

			/**
			 * Get Tier Level
			 */
			public int getTier() {
				return tier;
			}

			/**
			 * Get Total Points Won when Reached the Tier
			 */
			public int getPoints() {
				return points;
			}

			/**
			 * Get Amount Required to Reach Tier
			 */
			public int getAmount() {
				return amount;
			}
		}
	}
}
