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

package fr.kokhaviel.api.hypixel.resources.challenges;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Hypixel Network Challenges Data
 *
 * @author Kokhaviel
 * @since 3.1
 */
public class Challenges {

	final JsonObject challengesObject;

	final Arcade arcade;
	final Arena arena;
	final Bedwars bedwars;
	final Blitz blitz;
	final BuildBattle buildBattle;
	final MCGO mcgo;
	final Duels duels;
	final GingerBread gingerBread;
	final MurderMystery murderMystery;
	final Paintball paintball;
	final Quake quake;
	final Skywars skywars;
	final SpeedUHC speedUHC;
	final Smash smash;
	final TNTGames tntGames;
	final UHC uhc;
	final VampireZ vampireZ;
	final Walls walls;
	final MegaWalls megaWalls;
	final Warlords warlords;
	final boolean success;
	final long lastUpdate;

	public Challenges(JsonObject challengesObject) {
		this.challengesObject = challengesObject.get("challenges").getAsJsonObject();
		success = challengesObject.get("success").getAsBoolean();
		lastUpdate = challengesObject.get("lastUpdated").getAsLong();

		arcade = new Arcade(this.challengesObject.get("arcade").getAsJsonArray());
		arena = new Arena(this.challengesObject.get("arena").getAsJsonArray());
		bedwars = new Bedwars(this.challengesObject.get("bedwars").getAsJsonArray());
		blitz = new Blitz(this.challengesObject.get("hungergames").getAsJsonArray());
		buildBattle = new BuildBattle(this.challengesObject.get("buildbattle").getAsJsonArray());
		mcgo = new MCGO(this.challengesObject.get("mcgo").getAsJsonArray());
		duels = new Duels(this.challengesObject.get("duels").getAsJsonArray());
		gingerBread = new GingerBread(this.challengesObject.get("gingerbread").getAsJsonArray());
		murderMystery = new MurderMystery(this.challengesObject.get("murdermystery").getAsJsonArray());
		paintball = new Paintball(this.challengesObject.get("paintball").getAsJsonArray());
		quake = new Quake(this.challengesObject.get("quake").getAsJsonArray());
		skywars = new Skywars(this.challengesObject.get("skywars").getAsJsonArray());
		speedUHC = new SpeedUHC(this.challengesObject.get("speeduhc").getAsJsonArray());
		smash = new Smash(this.challengesObject.get("supersmash").getAsJsonArray());
		tntGames = new TNTGames(this.challengesObject.get("tntgames").getAsJsonArray());
		uhc = new UHC(this.challengesObject.get("uhc").getAsJsonArray());
		vampireZ = new VampireZ(this.challengesObject.get("vampirez").getAsJsonArray());
		walls = new Walls(this.challengesObject.get("walls").getAsJsonArray());
		megaWalls = new MegaWalls(this.challengesObject.get("walls3").getAsJsonArray());
		warlords = new Warlords(this.challengesObject.get("battleground").getAsJsonArray());
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
	 * Get Arcade Challenges Data
	 */
	public Arcade getArcade() {
		return arcade;
	}

	/**
	 * Get Arena Challenges Data
	 */
	public Arena getArena() {
		return arena;
	}

	/**
	 * Get Bedwars Challenges Data
	 */
	public Bedwars getBedwars() {
		return bedwars;
	}

	/**
	 * Get Blitz Challenges Data
	 */
	public Blitz getBlitz() {
		return blitz;
	}

	/**
	 * Get Build Battle Challenges Data
	 */
	public BuildBattle getBuildBattle() {
		return buildBattle;
	}

	/**
	 * Get MCGO Challenges Data
	 */
	public MCGO getMcgo() {
		return mcgo;
	}

	/**
	 * Get Duels Challenges Data
	 */
	public Duels getDuels() {
		return duels;
	}

	/**
	 * Get Ginger Bread Challenges Data
	 */
	public GingerBread getGingerBread() {
		return gingerBread;
	}

	/**
	 * Get Murder Mystery Challenges Data
	 */
	public MurderMystery getMurderMystery() {
		return murderMystery;
	}

	/**
	 * Get Paintball Challenges Data
	 */
	public Paintball getPaintball() {
		return paintball;
	}

	/**
	 * Get Quake Challenges Data
	 */
	public Quake getQuake() {
		return quake;
	}

	/**
	 * Get Skywars Challenges Data
	 */
	public Skywars getSkywars() {
		return skywars;
	}

	/**
	 * Get Speed UHC Challenges Data
	 */
	public SpeedUHC getSpeedUHC() {
		return speedUHC;
	}

	/**
	 * Get Smash Challenges Data
	 */
	public Smash getSmash() {
		return smash;
	}

	/**
	 * Get Tnt Games Challenges Data
	 */
	public TNTGames getTntGames() {
		return tntGames;
	}

	/**
	 * Get UHC Challenges Data
	 */
	public UHC getUhc() {
		return uhc;
	}

	/**
	 * Get VampireZ Challenges Data
	 */
	public VampireZ getVampireZ() {
		return vampireZ;
	}

	/**
	 * Get Walls Challenges Data
	 */
	public Walls getWalls() {
		return walls;
	}

	/**
	 * Get Mega Walls Challenges Data
	 */
	public MegaWalls getMegaWalls() {
		return megaWalls;
	}

	/**
	 * Get Warlords Challenges Data
	 */
	public Warlords getWarlords() {
		return warlords;
	}


	/**
	 * Arcade Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Arcade {
		final JsonArray arcadeObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Arcade(JsonArray arcadeObject) {
			this.arcadeObject = arcadeObject;
			putData();
		}

		void putData() {

			challengeMap.put("FARM_HUNT_CHALLENGE", new Challenge(arcadeObject.get(0).getAsJsonObject()));
			challengeMap.put("BLOCKING_DEAD_CHALLENGE", new Challenge(arcadeObject.get(1).getAsJsonObject()));
			challengeMap.put("BOUNTY_HUNTER_CHALLENGE", new Challenge(arcadeObject.get(2).getAsJsonObject()));
			challengeMap.put("CREEPER_ATTACK_CHALLENGE", new Challenge(arcadeObject.get(3).getAsJsonObject()));
			challengeMap.put("DRAGON_WARS_CHALLENGE", new Challenge(arcadeObject.get(4).getAsJsonObject()));
			challengeMap.put("ENDER_SPLEEF_CHALLENGE", new Challenge(arcadeObject.get(5).getAsJsonObject()));
			challengeMap.put("GALAXY_WARS_CHALLENGE", new Challenge(arcadeObject.get(6).getAsJsonObject()));
			challengeMap.put("THROW_OUT_CHALLENGE", new Challenge(arcadeObject.get(7).getAsJsonObject()));
			challengeMap.put("HOLE_IN_THE_WALL_CHALLENGE", new Challenge(arcadeObject.get(8).getAsJsonObject()));
			challengeMap.put("HYPIXEL_SAYS_CHALLENGE", new Challenge(arcadeObject.get(9).getAsJsonObject()));
			challengeMap.put("PIXEL_PAINTERS_CHALLENGE", new Challenge(arcadeObject.get(10).getAsJsonObject()));
			challengeMap.put("PARTY_GAMES_CHALLENGE", new Challenge(arcadeObject.get(11).getAsJsonObject()));
			challengeMap.put("FOOTBALL_CHALLENGE", new Challenge(arcadeObject.get(12).getAsJsonObject()));
			challengeMap.put("MINI_WALLS_CHALLENGE", new Challenge(arcadeObject.get(13).getAsJsonObject()));
			challengeMap.put("CAPTURE_THE_WOOL_CHALLENGE", new Challenge(arcadeObject.get(14).getAsJsonObject()));
			challengeMap.put("ZOMBIES_CHALLENGE", new Challenge(arcadeObject.get(15).getAsJsonObject()));
			challengeMap.put("HIDE_AND_SEEK_CHALLENGE", new Challenge(arcadeObject.get(16).getAsJsonObject()));
		}

		/**
		 * Get Arcade Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Arena Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Arena {
		final JsonArray arenaObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Arena(JsonArray arenaObject) {
			this.arenaObject = arenaObject;
			putData();
		}

		void putData() {

			challengeMap.put("WHERE_IS_IT_CHALLENGE", new Challenge(arenaObject.get(0).getAsJsonObject()));
			challengeMap.put("TRIPLE_KILL_CHALLENGE", new Challenge(arenaObject.get(1).getAsJsonObject()));
			challengeMap.put("NO_ULTIMATE_CHALLENGE", new Challenge(arenaObject.get(2).getAsJsonObject()));
			challengeMap.put("COOPERATION_CHALLENGE", new Challenge(arenaObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Arena Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Bedwars Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Bedwars {
		final JsonArray bedwarsObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Bedwars(JsonArray bedwarsObject) {
			this.bedwarsObject = bedwarsObject;
			putData();
		}

		void putData() {

			challengeMap.put("DEFENSIVE", new Challenge(bedwarsObject.get(0).getAsJsonObject()));
			challengeMap.put("OFFENSIVE", new Challenge(bedwarsObject.get(1).getAsJsonObject()));
			challengeMap.put("SUPPORT", new Challenge(bedwarsObject.get(2).getAsJsonObject()));
		}

		/**
		 * Get Bedwars Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Blitz Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Blitz {
		final JsonArray blitzObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Blitz(JsonArray blitzObject) {
			this.blitzObject = blitzObject;
			putData();
		}

		void putData() {

			challengeMap.put("STAR_CHALLENGE", new Challenge(blitzObject.get(0).getAsJsonObject()));
			challengeMap.put("IRON_MAN_CHALLENGE", new Challenge(blitzObject.get(1).getAsJsonObject()));
			challengeMap.put("BLITZ_CHALLENGE", new Challenge(blitzObject.get(2).getAsJsonObject()));
			challengeMap.put("RESISTANCE_CHALLENGE", new Challenge(blitzObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Blitz Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Build Battle Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class BuildBattle {
		final JsonArray buildBattleObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public BuildBattle(JsonArray buildBattleObject) {
			this.buildBattleObject = buildBattleObject;
			putData();
		}

		void putData() {

			challengeMap.put("TOP_3_CHALLENGE", new Challenge(buildBattleObject.get(0).getAsJsonObject()));
			challengeMap.put("GUESSER_CHALLENGE", new Challenge(buildBattleObject.get(1).getAsJsonObject()));
		}

		/**
		 * Get Build Battle Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * MCGO Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class MCGO {
		final JsonArray mcgoObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public MCGO(JsonArray mcgoObject) {
			this.mcgoObject = mcgoObject;
			putData();
		}

		void putData() {

			challengeMap.put("PISTOL_CHALLENGE", new Challenge(mcgoObject.get(0).getAsJsonObject()));
			challengeMap.put("KNIFE_CHALLENGE", new Challenge(mcgoObject.get(1).getAsJsonObject()));
			challengeMap.put("GRENADE_CHALLENGE", new Challenge(mcgoObject.get(2).getAsJsonObject()));
			challengeMap.put("KILLING_SPREE_CHALLENGE", new Challenge(mcgoObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get MCGO Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Duels Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Duels {
		final JsonArray duelsObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Duels(JsonArray duelsObject) {
			this.duelsObject = duelsObject;
			putData();
		}

		void putData() {

			challengeMap.put("FEED_THE_VOID_CHALLENGE", new Challenge(duelsObject.get(0).getAsJsonObject()));
			challengeMap.put("TEAMS_CHALLENGE", new Challenge(duelsObject.get(1).getAsJsonObject()));
			challengeMap.put("TARGET_PRACTICE_CHALLENGE", new Challenge(duelsObject.get(2).getAsJsonObject()));
		}

		/**
		 * Get Duels Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Ginger Bread Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class GingerBread {
		final JsonArray gingerBreadObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public GingerBread(JsonArray gingerBreadObject) {
			this.gingerBreadObject = gingerBreadObject;
			putData();
		}

		void putData() {

			challengeMap.put("COIN_CHALLENGE", new Challenge(gingerBreadObject.get(0).getAsJsonObject()));
			challengeMap.put("FIRST_PLACE_CHALLENGE", new Challenge(gingerBreadObject.get(1).getAsJsonObject()));
			challengeMap.put("BANANA_CHALLENGE", new Challenge(gingerBreadObject.get(2).getAsJsonObject()));
			challengeMap.put("LEADERBOARD_CHALLENGE", new Challenge(gingerBreadObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Ginger Bread CHallenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Murder Mystery Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class MurderMystery {
		final JsonArray murderMysteryObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public MurderMystery(JsonArray murderMysteryObject) {
			this.murderMysteryObject = murderMysteryObject;
			putData();
		}

		void putData() {
			challengeMap.put("MURDER_SPREE", new Challenge(murderMysteryObject.get(0).getAsJsonObject()));
			challengeMap.put("SHERLOCK", new Challenge(murderMysteryObject.get(1).getAsJsonObject()));
			challengeMap.put("HERO", new Challenge(murderMysteryObject.get(2).getAsJsonObject()));
			challengeMap.put("SERIAL_KILLER", new Challenge(murderMysteryObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Murder Mystery Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Paintball Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Paintball {
		final JsonArray paintballObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Paintball(JsonArray paintballObject) {
			this.paintballObject = paintballObject;
			putData();
		}

		void putData() {

			challengeMap.put("KILL_STREAK_CHALLENGE", new Challenge(paintballObject.get(0).getAsJsonObject()));
			challengeMap.put("KILLING_SPREE_CHALLENGE", new Challenge(paintballObject.get(1).getAsJsonObject()));
			challengeMap.put("NUKE_CHALLENGE", new Challenge(paintballObject.get(2).getAsJsonObject()));
			challengeMap.put("FINISH_CHALLENGE", new Challenge(paintballObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Paintball Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Quake Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Quake {
		final JsonArray quakeObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Quake(JsonArray quakeObject) {
			this.quakeObject = quakeObject;
			putData();
		}

		void putData() {

			challengeMap.put("POUWERUP_CHALLENGE", new Challenge(quakeObject.get(0).getAsJsonObject()));
			challengeMap.put("KILLING_STREAK_CHALLENGE", new Challenge(quakeObject.get(1).getAsJsonObject()));
			challengeMap.put("DONT_BLINK_CHALLENGE", new Challenge(quakeObject.get(2).getAsJsonObject()));
			challengeMap.put("COMBO_CHALLENGE", new Challenge(quakeObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Quake Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Skywars Challenges Data
	 *
	 * @author Kokahviel
	 * @since 3.1
	 */
	public static class Skywars {
		final JsonArray skywarsObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Skywars(JsonArray skywarsObject) {
			this.skywarsObject = skywarsObject;
			putData();
		}

		void putData() {

			challengeMap.put("FEEDING_THE_VOID_CHALLENGE", new Challenge(skywarsObject.get(0).getAsJsonObject()));
			challengeMap.put("RUSH_CHALLENGE", new Challenge(skywarsObject.get(1).getAsJsonObject()));
			challengeMap.put("RANKED_CHALLENGE", new Challenge(skywarsObject.get(2).getAsJsonObject()));
			challengeMap.put("ENDERMAN_CHALLENGE", new Challenge(skywarsObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Skywars Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Speed UHC Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class SpeedUHC {
		final JsonArray speedUHCObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public SpeedUHC(JsonArray speedUHCObject) {
			this.speedUHCObject = speedUHCObject;
			putData();
		}

		void putData() {

			challengeMap.put("ALCHEMIST_CHALLENGE", new Challenge(speedUHCObject.get(0).getAsJsonObject()));
			challengeMap.put("WIZARD_CHALLENGE", new Challenge(speedUHCObject.get(1).getAsJsonObject()));
			challengeMap.put("MARKSMAN_CHALLENGE", new Challenge(speedUHCObject.get(2).getAsJsonObject()));
			challengeMap.put("NETHER_CHALLENGE", new Challenge(speedUHCObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Speed UHC Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Smash Challenges Data
	 *
	 * @author Kokahviel
	 * @since 3.1
	 */
	public static class Smash {
		final JsonArray smashObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Smash(JsonArray smashObject) {
			this.smashObject = smashObject;
			putData();
		}

		void putData() {

			challengeMap.put("LEADERBOARD_CHALLENGE", new Challenge(smashObject.get(0).getAsJsonObject()));
			challengeMap.put("CRYSTAL_CHALLENGE", new Challenge(smashObject.get(1).getAsJsonObject()));
			challengeMap.put("SMASH_CHALLENGE", new Challenge(smashObject.get(2).getAsJsonObject()));
			challengeMap.put("FLAWLESS_CHALLENGE", new Challenge(smashObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Smash Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Tnt Games Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class TNTGames {
		final JsonArray tntObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public TNTGames(JsonArray tntObject) {
			this.tntObject = tntObject;
			putData();
		}

		void putData() {

			challengeMap.put("TNT_RUN_CHALLENGE", new Challenge(tntObject.get(0).getAsJsonObject()));
			challengeMap.put("PVP_RUN_CHALLENGE", new Challenge(tntObject.get(1).getAsJsonObject()));
			challengeMap.put("BOW_SPLEEF_CHALLENGE", new Challenge(tntObject.get(2).getAsJsonObject()));
			challengeMap.put("TNT_TAG_CHALLENGE", new Challenge(tntObject.get(3).getAsJsonObject()));
			challengeMap.put("TNT_WIZARDS_CHALLENGE", new Challenge(tntObject.get(4).getAsJsonObject()));
			challengeMap.put("TNT_WIZARD_CHALLENGE", new Challenge(tntObject.get(5).getAsJsonObject()));
		}

		/**
		 * Get Tnt Games Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * UHC Challenges Data
	 *
	 * @author Kokahviel
	 * @since 3.1
	 */
	public static class UHC {
		final JsonArray uhcObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public UHC(JsonArray uhcObject) {
			this.uhcObject = uhcObject;
			putData();
		}

		void putData() {

			challengeMap.put("LONGSHOT_CHALLENGE", new Challenge(uhcObject.get(0).getAsJsonObject()));
			challengeMap.put("PERFECT_START_CHALLENGE", new Challenge(uhcObject.get(1).getAsJsonObject()));
			challengeMap.put("HUNTER_CHALLENGE", new Challenge(uhcObject.get(2).getAsJsonObject()));
			challengeMap.put("THREAT_CHALLENGE", new Challenge(uhcObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get UHC Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * VampireZ Challenges Data
	 *
	 * @author Kokahviel
	 * @since 3.1
	 */
	public static class VampireZ {
		final JsonArray vampireZObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public VampireZ(JsonArray vampireZObject) {
			this.vampireZObject = vampireZObject;
			putData();
		}

		void putData() {

			challengeMap.put("FANG_CHALLENGE", new Challenge(vampireZObject.get(0).getAsJsonObject()));
			challengeMap.put("GOLD_CHALLENGE", new Challenge(vampireZObject.get(1).getAsJsonObject()));
			challengeMap.put("PURIFYING_CHALLENGE", new Challenge(vampireZObject.get(2).getAsJsonObject()));
			challengeMap.put("LAST_STAND_CHALLENGE", new Challenge(vampireZObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get VampireZ Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Walls Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Walls {
		final JsonArray wallsObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Walls(JsonArray wallsObject) {
			this.wallsObject = wallsObject;
			putData();
		}

		void putData() {

			challengeMap.put("FIRST_BLOOD_CHALLENGE", new Challenge(wallsObject.get(0).getAsJsonObject()));
			challengeMap.put("POWERHOUSE_CHALLENGE", new Challenge(wallsObject.get(1).getAsJsonObject()));
			challengeMap.put("LOOTING_CHALLENGE", new Challenge(wallsObject.get(2).getAsJsonObject()));
			challengeMap.put("DOUBLE_KILL_CHALLENGE", new Challenge(wallsObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Walls Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Mega Walls Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class MegaWalls {
		final JsonArray megaWallsObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public MegaWalls(JsonArray megaWallsObject) {
			this.megaWallsObject = megaWallsObject;
			putData();
		}

		void putData() {

			challengeMap.put("WITHER_CHALLENGE", new Challenge(megaWallsObject.get(0).getAsJsonObject()));
			challengeMap.put("PROTECTOR_CHALLENGE", new Challenge(megaWallsObject.get(1).getAsJsonObject()));
			challengeMap.put("BERSERK_CHALLENGE", new Challenge(megaWallsObject.get(2).getAsJsonObject()));
			challengeMap.put("COMEBACK_CHALLENGE", new Challenge(megaWallsObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Mega Walls Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Warlords Challenges Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Warlords {
		final JsonArray warlordsObject;
		final Map<String, Challenge> challengeMap = new HashMap<>();

		public Warlords(JsonArray warlordsObject) {
			this.warlordsObject = warlordsObject;
			putData();
		}

		void putData() {

			challengeMap.put("SUPPORT_CHALLENGE", new Challenge(warlordsObject.get(0).getAsJsonObject()));
			challengeMap.put("BRUTE_CHALLENGE", new Challenge(warlordsObject.get(1).getAsJsonObject()));
			challengeMap.put("CAPTURE_CHALLENGE", new Challenge(warlordsObject.get(2).getAsJsonObject()));
			challengeMap.put("CARRY_CHALLENGE", new Challenge(warlordsObject.get(3).getAsJsonObject()));
		}

		/**
		 * Get Warlords Challenges
		 */
		public Map<String, Challenge> getChallengeMap() {
			return challengeMap;
		}
	}

	/**
	 * Challenge Data
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Challenge {
		final String name;
		final JsonObject reward;

		public Challenge(JsonObject challengeObject) {

			this.name = challengeObject.get("name").getAsString();
			this.reward = challengeObject.get("rewards").getAsJsonArray().get(0).getAsJsonObject();
		}

		/**
		 * Get Challenge Full Name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Get Challenge Reward
		 */
		public Reward getReward() {
			return new Reward(reward);
		}
	}

	/**
	 * Reward Datat
	 *
	 * @author Kokhaviel
	 * @since 3.1
	 */
	public static class Reward {
		final int amount;

		public Reward(JsonObject rewardObject) {
			this.amount = rewardObject.get("amount").getAsInt();
		}

		/**
		 * Get Amount Of Experience Gained
		 */
		public int getAmount() {
			return amount;
		}
	}
}
