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
import fr.kokhaviel.api.hypixel.games.*;

/**
 * Hypixel Player Games Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Stats {

	/**
	 * Tnt Games Statistics of the Player
	 */
	@SerializedName("TNTGames")
	TntGames tntGames = new TntGames();

	/**
	 * Hunger Games (Blitz SG) Statistics of the Player
	 */
	@SerializedName("HungerGames")
	HungerGames hungerGames = new HungerGames();

	/**
	 * Bedwars Statistics of the player
	 */
	@SerializedName("Bedwars")
	Bedwars bedwars = new Bedwars();

	/**
	 * Skywars Statistics of the Player
	 */
	@SerializedName("SkyWars")
	Skywars skywars = new Skywars();

	/**
	 * Arcade Statistics of the Player
	 */
	@SerializedName("Arcade")
	Arcade arcade = new Arcade();

	/**
	 * Murder Mystery Statistics of the Player
	 */
	@SerializedName("MurderMystery")
	MurderMystery murderMystery = new MurderMystery();

	/**
	 * Duels Statistics of the Player
	 */
	@SerializedName("Duels")
	Duels duels = new Duels();

	/**
	 * Build Battle Statistics of the Player
	 */
	@SerializedName("BuildBattle")
	BuildBattle buildBattle = new BuildBattle();

	/**
	 * Mega Walls Statistics of the Player
	 */
	@SerializedName("Walls3")
	MegaWalls megaWalls = new MegaWalls();

	/**
	 * Speed UHC Statistics of the Player
	 */
	@SerializedName("SpeedUHC")
	SpeedUHC speedUHC = new SpeedUHC();

	/**
	 * Cops vs Crims Statistics of the Player
	 */
	@SerializedName("MCGO")
	MCGO mcgo = new MCGO();

	/**
	 * UHC Statistics of the Player
	 */
	@SerializedName("UHC")
	UHC uhc = new UHC();

	/**
	 * The Pit Statistics of the Player
	 */
	@SerializedName("Pit")
	Pit pit = new Pit();

	/**
	 * VampireZ Statistics of the Player
	 */
	@SerializedName("VampireZ")
	VampireZ vampireZ = new VampireZ();

	/**
	 * Quake Statistics of the Player
	 */
	@SerializedName("Quake")
	Quake quake = new Quake();

	/**
	 * Gingerbread (Turbo Kart Racer) Statistics of the Player
	 */
	@SerializedName("GingerBread")
	GingerBread gingerBread = new GingerBread();

	/**
	 * Paintball Statistics of the Player
	 */
	@SerializedName("Paintball")
	Paintball paintball = new Paintball();

	/**
	 * Legacy Statistics of the Player
	 */
	@SerializedName("Legacy")
	Legacy legacy = new Legacy();

	@SerializedName("Arena")
	Arena arena = new Arena();

	/**
	 * Walls Statistics of the Player
	 */
	@SerializedName("Walls")
	Walls walls = new Walls();

	/**
	 * Battle Ground (Warlords) Statistics of the Player
	 */
	@SerializedName("Battleground")
	BattleGround battleGround = new BattleGround();

	/**
	 * Smash Statistics of the Player
	 */
	@SerializedName("SuperSmash")
	Smash smash = new Smash();


	/**
	 * Get Tnt Games Statistics of the Player
	 *
	 * @return Tnt Games Stats
	 */
	public TntGames getTntGames() {
		return tntGames;
	}

	/**
	 * Get Hunger Games (Blitz) Statistics of the Player
	 *
	 * @return Hunger Games Stats
	 */
	public HungerGames getHungerGames() {
		return hungerGames;
	}

	/**
	 * Get Bedwars Statistics of the Player
	 *
	 * @return Bedwars Stats
	 */
	public Bedwars getBedwars() {
		return bedwars;
	}

	/**
	 * Get Skywars Statistics of the Player
	 *
	 * @return Skywars Stats
	 */
	public Skywars getSkywars() {
		return skywars;
	}

	/**
	 * Get Arcade Statistics of the Player
	 *
	 * @return Arcade Stats
	 */
	public Arcade getArcade() {
		return arcade;
	}

	/**
	 * Get Murder Mystery Statistics of the Player
	 *
	 * @return Murder Mystery Stats
	 */
	public MurderMystery getMurderMystery() {
		return murderMystery;
	}

	/**
	 * Get Duels Statistics of the Player
	 *
	 * @return Duels Stats
	 */
	public Duels getDuels() {
		return duels;
	}

	/**
	 * Get Build Battle Statistics of the Player
	 *
	 * @return Build Battle Stats
	 */
	public BuildBattle getBuildBattle() {
		return buildBattle;
	}

	/**
	 * Get Mega Walls Statistics of the Player
	 *
	 * @return Mega Walls Stats
	 */
	public MegaWalls getMegaWalls() {
		return megaWalls;
	}

	/**
	 * Get Speed UHC Statistics of the Player
	 *
	 * @return Speed UHC Stats
	 */
	public SpeedUHC getSpeedUHC() {
		return speedUHC;
	}

	/**
	 * Get MCGO (Cops and Crims) Statistics of the Player
	 *
	 * @return MCGO Stats
	 */
	public MCGO getMcgo() {
		return mcgo;
	}

	/**
	 * Get UHC Statistics of the Player
	 *
	 * @return UHC Stats
	 */
	public UHC getUhc() {
		return uhc;
	}

	/**
	 * Get Pit Statistics of the Player
	 *
	 * @return Pit Stats
	 */
	public Pit getPit() {
		return pit;
	}

	/**
	 * Get VampireZ Statistics of the Player
	 *
	 * @return VampireZ Stats
	 */
	public VampireZ getVampireZ() {
		return vampireZ;
	}

	/**
	 * Get Quake Craft Statistics of the Player
	 *
	 * @return Quake Craft Stats
	 */
	public Quake getQuake() {
		return quake;
	}

	/**
	 * Get Ginger Bread Statistics of the Player
	 *
	 * @return Ginger Bread Stats
	 */
	public GingerBread getGingerBread() {
		return gingerBread;
	}

	/**
	 * Get Paintball Statistics of the Player
	 *
	 * @return Paintball Stats
	 */
	public Paintball getPaintball() {
		return paintball;
	}

	/**
	 * Get Legacy Statistics of the Player
	 *
	 * @return Legacy Stats
	 */
	public Legacy getLegacy() {
		return legacy;
	}

	/**
	 * Get Arena Statistics of the Player
	 *
	 * @return Arena Stats
	 */
	public Arena getArena() {
		return arena;
	}

	/**
	 * Get Walls Statistics of the Player
	 *
	 * @return Walls Stats
	 */
	public Walls getWalls() {
		return walls;
	}

	/**
	 * Get Battle Ground (Warlords) Statistics of the Player
	 *
	 * @return Battle Ground Stats
	 */
	public BattleGround getBattleGround() {
		return battleGround;
	}

	/**
	 * Get Smash Statistics of the Player
	 *
	 * @return Smash Stats
	 */
	public Smash getSmash() {
		return smash;
	}

	@Override
	public String toString() {
		return "Stats{" +
				"tntGames=" + tntGames +
				", hungerGames=" + hungerGames +
				", bedwars=" + bedwars +
				", skywars=" + skywars +
				", arcade=" + arcade +
				", murderMystery=" + murderMystery +
				", duels=" + duels +
				", buildBattle=" + buildBattle +
				", megaWalls=" + megaWalls +
				", speedUHC=" + speedUHC +
				", mcgo=" + mcgo +
				", uhc=" + uhc +
				", pit=" + pit +
				", vampireZ=" + vampireZ +
				", quake=" + quake +
				", gingerBread=" + gingerBread +
				", paintball=" + paintball +
				", legacy=" + legacy +
				", arena=" + arena +
				", walls=" + walls +
				", battleGround=" + battleGround +
				", smash=" + smash +
				'}';
	}
}