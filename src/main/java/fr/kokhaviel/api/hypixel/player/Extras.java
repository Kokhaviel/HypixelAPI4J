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

import fr.kokhaviel.api.hypixel.HypixelAPI;

import java.io.IOException;

/**
 * Hypixel Player Extras Statistics
 *
 * @author Kokhaviel
 * @since 1.1
 */
@SuppressWarnings("unused")
public class Extras {

	HypixelAPI hypixelAPI;
	String player;

	public Extras(HypixelAPI hypixelAPI, String player) {
		this.hypixelAPI = hypixelAPI;
		this.player = player;
	}

	/**
	 * Get Arcade Extra Stats
	 */
	public ArcadeExtras getArcadeExtras() throws IOException {
		return new ArcadeExtras(hypixelAPI, player);
	}

	/**
	 * Get Battle Ground Extra Stats
	 */
	public BattleGroundExtras getBattleGroundExtras() throws IOException {
		return new BattleGroundExtras(hypixelAPI, player);
	}

	/**
	 * Get Bedwars Extra Stats
	 */
	public BedwarsExtras getBedwarsExtras() throws IOException {
		return new BedwarsExtras(hypixelAPI, player);
	}

	/**
	 * Get Duels Extra Stats
	 */
	public DuelsExtras getDuelsExtras() throws IOException {
		return new DuelsExtras(hypixelAPI, player);
	}

	/**
	 * Get Ginger Bread Extra Stats
	 */
	public GingerBreadExtras getGingerBreadExtras() throws IOException {
		return new GingerBreadExtras(hypixelAPI, player);
	}

	/**
	 * Get Hunger Games Extra Stats
	 */
	public HungerGamesExtras getHungerGamesExtras() throws IOException {
		return new HungerGamesExtras(hypixelAPI, player);
	}

	/**
	 * Get MCGO Extra Stats
	 */
	public MCGOExtras getMcgoExtras() throws IOException {
		return new MCGOExtras(hypixelAPI, player);
	}

	/**
	 * Get Mega Walls Extra Stats
	 */
	public MegaWallsExtras getMegaWallsExtras() throws IOException {
		return new MegaWallsExtras(hypixelAPI, player);
	}

	/**
	 * Get Murder Mystery Extra Stats
	 */
	public MurderMysteryExtras getMurderMysteryExtras() throws IOException {
		return new MurderMysteryExtras(hypixelAPI, player);
	}

	/**
	 * Get Pit Extra Stats
	 */
	public PitExtras getPitExtras() throws IOException {
		return new PitExtras(hypixelAPI, player);
	}

	/**
	 * Get Quake Extra Stats
	 */
	public QuakeExtras getQuakeExtras() throws IOException {
		return new QuakeExtras(hypixelAPI, player);
	}

	/**
	 * Get Skywars Extra Stats
	 */
	public SkywarsExtras getSkywarsExtras() throws IOException {
		return new SkywarsExtras(hypixelAPI, player);
	}

	/**
	 * Get Smash Extra Stats
	 */
	public SmashExtras getSmashExtras() throws IOException {
		return new SmashExtras(hypixelAPI, player);
	}

	/**
	 * Get SpeedUHC Extra Stats
	 */
	public SpeedUHCExtras getSpeedUHCExtras() throws IOException {
		return new SpeedUHCExtras(hypixelAPI, player);
	}

	/**
	 * Get UHC Extra Stats
	 */
	public UHCExtras getUHCExtras() throws IOException {
		return new UHCExtras(hypixelAPI, player);
	}

	/**
	 * Get Walls Extra Stats
	 */
	public WallsExtras getWallsExtras() throws IOException {
		return new WallsExtras(hypixelAPI, player);
	}

	/**
	 * Hypixel Arcade Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class ArcadeExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.Arcade arcade;

		public ArcadeExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			arcade = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getArcade();
		}

		/**
		 * Get Total Arcade Wins of the Player
		 *
		 * @return Sum of all Arcade Games Wins
		 */
		public int getTotalWins() {
			return arcade.getDayOneWins() + arcade.getMiniWallsWins()
					+ arcade.getSoccerWins() + arcade.getFarmHuntWins()
					+ arcade.getHideAndSeekHiderWins() + arcade.getHideAndSeekSeekerWins()
					+ arcade.getZombiesWins() + arcade.getPartyGamesWins()
					+ arcade.getHoleInTheWallWins() + arcade.getSimonSaysWins()
					+ arcade.getOnInTheQuiverWins() + arcade.getEnderSpleefWins()
					+ arcade.getDragonWarsWins() + arcade.getPixelPaintersWins() + arcade.getThrownOutWins();
		}
	}

	/**
	 * Hypixel Battle Ground Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class BattleGroundExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.BattleGround battleGround;

		public BattleGroundExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			battleGround = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getBattleGround();
		}

		/**
		 * Get Battle Ground Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return battleGround.getKills() / battleGround.getDeaths();
		}

		/**
		 * Get Battle Ground Heal/Damage Ratio of the Player
		 */
		public int getHealDamageRatio() {
			return battleGround.getHealed() / battleGround.getDamage();
		}

		/**
		 * Get Battle Ground Win/Loss Ratio of the Player
		 */
		public int getWinLossRation() {
			return battleGround.getWins() / battleGround.getLosses();
		}
	}

	/**
	 * Hypixel Bedwars Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class BedwarsExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.Bedwars bedwars;


		public BedwarsExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			bedwars = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getBedwars();
		}

		/**
		 * Get Bedwars Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return bedwars.getKills() / bedwars.getDeaths();
		}

		/**
		 * Get Beds Broken/Lost Ratio of the Player
		 */
		public int getBedsBrokenLostRatio() {
			return bedwars.getBedsBroken() / bedwars.getBedsLost();
		}

		/**
		 * Get Win/Loss Ratio of the Player
		 */
		public int getWinLossRatio() {
			return bedwars.getWins() / bedwars.getLosses();
		}
	}

	/**
	 * Hypixel Duels Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class DuelsExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.Duels duels;

		public DuelsExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			duels = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getDuels();
		}

		/**
		 * Get Win/Loss Ratio of the Player
		 */
		public int getWinLossRatio() {
			return duels.getWins() / duels.getLosses();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return duels.getKills() / duels.getDeaths();
		}
	}

	/**
	 * Hypixel Ginger Bread Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class GingerBreadExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.GingerBread gingerBread;

		public GingerBreadExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			gingerBread = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getGingerBread();
		}

		/**
		 * Get Total Trophies of the Player
		 *
		 * @return Sum of Gold, Silver & Bronze trophies
		 */
		public int getTotalTrophies() {
			return gingerBread.getGold() + gingerBread.getSilver() + gingerBread.getBronze();
		}
	}

	/**
	 * Hypixel Hunger Games Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class HungerGamesExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.HungerGames hungerGames;

		public HungerGamesExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			hungerGames = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getHungerGames();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return hungerGames.getKills() / hungerGames.getDeaths();
		}
	}

	/**
	 * Hypixel MCGO Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class MCGOExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.MCGO mcgo;

		public MCGOExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			mcgo = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getMcgo();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillDeathsRatio() {
			return mcgo.getKills() / mcgo.getDeaths();
		}
	}

	/**
	 * Hypixel Mega Walls Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class MegaWallsExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.MegaWalls megaWalls;

		public MegaWallsExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			megaWalls = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getMegaWalls();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return megaWalls.getKills() / megaWalls.getDeaths();
		}

		/**
		 * Get Win/Loss Ratio of the Player
		 */
		public int getWinLossRatio() {
			return megaWalls.getWins() / megaWalls.getLosses();
		}
	}

	/**
	 * Hypixel Murder Mystery Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class MurderMysteryExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.MurderMystery murderMystery;

		public MurderMysteryExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			murderMystery = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getMurderMystery();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return murderMystery.getKills() / murderMystery.getDeaths();
		}
	}

	/**
	 * Get Pit Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class PitExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.Pit pit;

		public PitExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			pit = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getPit();
		}

		/**
		 * Get Damage Dealt/Received Ratio of the Player
		 */
		public int getDamageDealtReceivedRatio() {
			return pit.getStats().getDamageDealt() / pit.getStats().getDamageReceived();
		}
	}

	/**
	 * Hypixel Quake Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class QuakeExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.Quake quake;

		public QuakeExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			quake = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getQuake();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return quake.getKills() / quake.getDeaths();
		}
	}

	/**
	 * Hypixel Skywars Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class SkywarsExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.Skywars skywars;

		public SkywarsExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			skywars = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getSkywars();
		}

		/**
		 * Get Win/Loss Ratio of the Player
		 */
		public int getWinLossRatio() {
			return skywars.getWins() / skywars.getLosses();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return skywars.getKills() / skywars.getDeaths();
		}
	}

	/**
	 * Hypixel Smash Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class SmashExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.Smash smash;

		public SmashExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			smash = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getSmash();
		}

		/**
		 * Get Win/Loss Ratio of the Player
		 */
		public int getWinLossRatio() {
			return smash.getWins() / smash.getLosses();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return smash.getKills() / smash.getDeaths();
		}
	}

	/**
	 * Hypixel SpeedUHC Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class SpeedUHCExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.SpeedUHC speedUHC;

		public SpeedUHCExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			speedUHC = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getSpeedUHC();
		}

		/**
		 * Get Win/Loss Ratio of the Player
		 */
		public int getWinLossRatio() {
			return speedUHC.getWins() / speedUHC.getLosses();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return speedUHC.getKills() / speedUHC.getDeaths();
		}
	}

	/**
	 * Hypixel UHC Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class UHCExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.UHC uhc;

		public UHCExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			uhc = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getUhc();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return uhc.getKills() / uhc.getDeaths();
		}
	}

	/**
	 * Hypixel Walls Extra Stats
	 *
	 * @author Kokhaviel
	 * @since 1.1
	 */
	public static class WallsExtras {

		HypixelAPI hypixelAPI;
		String player;
		fr.kokhaviel.api.hypixel.games.Walls walls;

		public WallsExtras(HypixelAPI hypixelAPI, String player) throws IOException {
			this.hypixelAPI = hypixelAPI;
			this.player = player;
			walls = hypixelAPI.getPlayerData(this.player).getPlayer().getStats().getWalls();
		}

		/**
		 * Get Win/Loss Ratio of the Player
		 */
		public int getWinLossRatio() {
			return walls.getWins() / walls.getLosses();
		}

		/**
		 * Get Kdr of the Player
		 */
		public int getKillsDeathsRatio() {
			return walls.getKills() / walls.getDeaths();
		}
	}

	@Override
	public String toString() {
		return "Extras{" +
				"hypixelAPI=" + hypixelAPI +
				", player='" + player + '\'' +
				'}';
	}
}
