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

package fr.kokhaviel.api.hypixel;

//Game Types Values : https://api.hypixel.net/#section/Introduction/GameTypes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Hypixel Game Type Data
 * @author Kokhaviel
 * @since 5.0
 */
public enum GameType {

	QUAKECRAFT(2, "QUAKECRAFT", "Quake"),
	WALLS(3, "WALLS", "Walls"),
	PAINTBALL(4, "PAINTBALL", "Paintball"),
	BLITZ(5, "SURVIVAL_GAMES", "Blitz Survival Games"),
	TNT_GAMES(6, "TNTGAMES", "TNT Games"),
	VAMPIREZ(7, "VAMPIREZ", "VampireZ"),
	MEGA_WALLS(13, "WALLS3", "Mega Walls"),
	ARCADE(14, "ARCADE", "Arcade"),
	ARENA(17, "ARENA", "Arena"),
	UHC(20, "UHC", "UHC Champions"),
	MCGO(21, "MCGO", "Cops and Crims"),
	WARLORDS(23, "BATTLEGROUND", "Warlords"),
	SMASH(24, "SUPER_SMASH", "Smash Heroes"),
	TURBO_KART_RACERS(25, "GINGERBREAD", "Turbo Kart Racers"),
	HOUSING(26, "HOUSING", "Housing"),
	SKYWARS(51, "SKYWARS", "SkyWars"),
	CRAZY_WALLS(52, "TRUE_COMBAT", "Crazy Walls"),
	SPEED_UHC(54, "SPEED_UHC", "Speed UHC"),
	SKYCLASH(55, "SKYCLASH", "SkyClash"),
	CLASSIC_GAMES(56, "LEGACY", "Classic Games"),
	PROTOTYPE(57, "PROTOTYPE", "Prototype"),
	BEDWARS(58, "BEDWARS", "Bed Wars"),
	MURDER_MYSTERY(59, "MURDER_MYSTERY", "Murder Mystery"),
	BUILD_BATTLE(60, "BUILD_BATTLE", "Build Battle"),
	DUELS(61, "DUELS", "Duels"),
	SKYBLOCK(63, "SKYBLOCK", "SkyBlock"),
	PIT(64, "PIT", "Pit"),
	REPLAY(65, "REPLAY", "Replay"),
	SMP(67, "SMP", "SMP");

	final int id;
	final String typeName;
	final String cleanName;

	GameType(int id, String typeName, String cleanName) {
		this.id = id;
		this.typeName = typeName;
		this.cleanName = cleanName;
	}

	/**
	 * Get Game ID
	 */
	public int getId() {
		return id;
	}

	/**
	 * Get Game Type Name
	 */
	public String getTypeName() {
		return typeName;
	}

	/**
	 * Get Game Clean Name
	 */
	public String getCleanName() {
		return cleanName;
	}

	public static final List<GameType> HYPIXEL_GAMES = new ArrayList<>(Arrays.asList(GameType.values()));

	/**
	 * Get Game Type Name From Game ID
	 * @param id Hypixel Game ID
	 * @return Game Type Name
	 */
	public static String typeFromID(int id) {
		AtomicReference<GameType> gameType = new AtomicReference<>();
		HYPIXEL_GAMES.forEach(game -> {
			if(game.getId() == id) {
				gameType.set(game);
			}
		});

		return gameType.get().getTypeName();
	}

	/**
	 * Get Game Clean Name From Game ID
	 * @param id Game ID
	 * @return Game Clean Name
	 */
	public static String cleanFromID(int id) {
		AtomicReference<GameType> gameType = new AtomicReference<>();
		HYPIXEL_GAMES.forEach(game -> {
			if(game.getId() == id) {
				gameType.set(game);
			}
		});

		return gameType.get().getCleanName();
	}

	/**
	 * Get Game Clean Name From Game Type Name
	 * @param typeName Game Type Name
	 * @return Game Clean Name
	 */
	public static String cleanFromType(String typeName) {
		AtomicReference<GameType> gameType = new AtomicReference<>();
		HYPIXEL_GAMES.forEach(game -> {
			if(game.getTypeName().equals(typeName)) {
				gameType.set(game);
			}
		});

		return gameType.get().getCleanName();
	}

	/**
	 * Get Game Type Name From Game Clean Name
	 * @param cleanName Game Clean Name
	 * @return Game Type Name
	 */
	public static String typeFromClean(String cleanName) {
		AtomicReference<GameType> gameType = new AtomicReference<>();
		HYPIXEL_GAMES.forEach(game -> {
			if(game.getCleanName().equals(cleanName)) {
				gameType.set(game);
			}
		});

		return gameType.get().getTypeName();
	}

	/**
	 * Get Game ID From Game Clean Name
	 * @param cleanName Game Clean Name
	 * @return Game ID
	 */
	public static int idFromClean(String cleanName) {
		AtomicReference<GameType> gameType = new AtomicReference<>();
		HYPIXEL_GAMES.forEach(game -> {
			if(game.getCleanName().equals(cleanName)) {
				gameType.set(game);
			}
		});

		return gameType.get().getId();
	}

	/**
	 * Get Game ID From Game Type Name
	 * @param typeName Game Type Name
	 * @return Game ID
	 */
	public static int idFromType(String typeName) {
		AtomicReference<GameType> gameType = new AtomicReference<>();
		HYPIXEL_GAMES.forEach(game -> {
			if(game.getTypeName().equals(typeName)) {
				gameType.set(game);
			}
		});

		return gameType.get().getId();
	}
}
