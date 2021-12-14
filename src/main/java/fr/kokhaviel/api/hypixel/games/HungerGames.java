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

package fr.kokhaviel.api.hypixel.games;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Hunger Games Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class HungerGames {

	/**
	 * Hunger Games Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Current Taunt of the Player
	 */
	@SerializedName("chosen_taunt")
	String taunt = "";

	/**
	 * Current Victory Dance of the Player
	 */
	@SerializedName("chosen_victorydance")
	String victoryDance = "";

	/**
	 * Hunger Games Deaths of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Hunger Games Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Hunger Games Packages (Cosmetics) Unlocked of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Hunger Games Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Hunger Games Team Wins of the Player
	 */
	@SerializedName("wins_teams")
	int teamWins = 0;

	/**
	 * Hunger Games Default Kit of the Player
	 */
	@SerializedName("defaultkit")
	String defaultKit = "";

	/**
	 * Huger games Current Finisher of the Player
	 */
	@SerializedName("chosen_finisher")
	String finisher = "";

	/**
	 * Hunger Games Combat Tracker of the Player (On or Off)
	 */
	@SerializedName("combatTracker")
	boolean combatTracker = false;

	/**
	 * Hunger Games Auto Armor of the Player (On or Off)
	 */
	@SerializedName("autoarmor")
	boolean autoArmor = false;

	/**
	 * Hunger Games Taunt Kills of the Player
	 */
	@SerializedName("taunt_kills")
	int tauntKills = 0;

	/**
	 * Hunger Games Potion Drunk by the Player
	 */
	@SerializedName("potions_drunk")
	int potionDrunk = 0;

	/**
	 * Hunger Games Damage Taken by the Player
	 */
	@SerializedName("damage")
	int damage = 0;

	/**
	 * Hunger Games Mobs Spawned by the Player
	 */
	@SerializedName("mobs_spawned")
	int mobsSpawned = 0;

	/**
	 * Hunger Games Time Played of the Player
	 */
	@SerializedName("time_played")
	int timePlayed = 0;

	/**
	 * Hunger Games Chests Opened
	 */
	@SerializedName("chests_opened")
	int chestsOpened = 0;

	/**
	 * Hunger Games Arrows Hit by the Player
	 */
	@SerializedName("arrows_hit")
	int arrowsHit = 0;

	/**
	 * Hunger Games Damage Taken of the Player
	 */
	@SerializedName("damage_taken")
	int damageTaken = 0;

	/**
	 * Hunger Games Games Played by the Player
	 */
	@SerializedName("games_played")
	int gamesPlayed = 0;

	/**
	 * Hunger Games Potions Thrown by the Player
	 */
	@SerializedName("potions_thrown")
	int potionThrown = 0;

	/**
	 * Hunger Games Arrows Fired by the Player
	 */
	@SerializedName("arrows_fired")
	int arrowsFired = 0;

	/**
	 * Hunger Games Blitz Star Uses of the Player
	 */
	@SerializedName("blitz_uses")
	int blitzStarUses = 0;

	/**
	 * Hunger Games Solo Normal Wins of the Player
	 */
	@SerializedName("wins_solo_normal")
	int soloNormalWins = 0;

	/**
	 * Hunger Games Team Normal Wins of the Player
	 */
	@SerializedName("wins_teams_normal")
	int teamNormalWins = 0;

	/**
	 * Hunger Games Solo Normal Kills of the Player
	 */
	@SerializedName("kills_solo_normal")
	int soloNormalKills = 0;

	/**
	 * Hunger Games Solo Chaos Wins of the Player
	 */
	@SerializedName("wins_solo_chaos")
	int soloChaosWins = 0;

	/**
	 * Hunger Games Solo Chaos Kills of the Player
	 */
	@SerializedName("kills_solo_chaos")
	int soloChaosKills = 0;


	/**
	 * Arachnologist Kit Experience
	 */
	@SerializedName("exp_arachnologist")
	int arachnologistKitExp = 0;

	/**
	 * Arachnologist Kit Wins
	 */
	@SerializedName("wins_arachnologist")
	int arachnologistKitWins = 0;

	/**
	 * Arachnologist Kit Wins Team
	 */
	@SerializedName("wins_team_arachnologist")
	int arachnologistKitWinsTeam = 0;

	/**
	 * Arachnologist Kit Games Played
	 */
	@SerializedName("games_played_arachnologist")
	int arachnologistKitGamesPlayed = 0;

	/**
	 * Arachnologist Kit Time Played
	 */
	@SerializedName("time_played_arachnologist")
	int arachnologistKitTimePlayed = 0;

	/**
	 * Arachnologist Kit Kills
	 */
	@SerializedName("kills_arachnologist")
	int arachnologistKitKills = 0;

	/**
	 * Arachnologist Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_arachnologist")
	int arachnologistKitTauntKills = 0;

	/**
	 * Arachnologist Kit Damage
	 */
	@SerializedName("damage_arachnologist")
	int arachnologistKitDamage = 0;

	/**
	 * Arachnologist Kit Damage Taken
	 */
	@SerializedName("damage_taken_arachnologist")
	int arachnologistKitDamageTaken = 0;

	/**
	 * Arachnologist Kit Fall Damage
	 */
	@SerializedName("fall_damage_arachnologist")
	int arachnologistKitFallDamage = 0;

	/**
	 * Arachnologist Kit Chests Opened
	 */
	@SerializedName("chests_opened_arachnologist")
	int arachnologistKitChestsOpened = 0;

	/**
	 * Arachnologist Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_arachnologist")
	int arachnologistKitItemsEnchanted = 0;

	/**
	 * Arachnologist Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_arachnologist")
	int arachnologistKitArrowsFired = 0;

	/**
	 * Arachnologist Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_arachnologist")
	int arachnologistKitArrowsHit = 0;

	/**
	 * Arachnologist Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_arachnologist")
	int arachnologistKitPotionsDrunk = 0;

	/**
	 * Arachnologist Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_arachnologist")
	int arachnologistKitPotionsThrown = 0;

	/**
	 * Arachnologist Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_arachnologist")
	int arachnologistKitEggThrown = 0;

	/**
	 * Arachnologist Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_arachnologist")
	int arachnologistKitMobsSpawned = 0;


	/**
	 * Archer Kit Experience
	 */
	@SerializedName("exp_archer")
	int archerKitExp = 0;

	/**
	 * Archer Kit Wins
	 */
	@SerializedName("wins_archer")
	int archerKitWins = 0;

	/**
	 * Archer Kit Wins Team
	 */
	@SerializedName("wins_team_archer")
	int archerKitWinsTeam = 0;

	/**
	 * Archer Kit Games Played
	 */
	@SerializedName("games_played_archer")
	int archerKitGamesPlayed = 0;

	/**
	 * Archer Kit Time Played
	 */
	@SerializedName("time_played_archer")
	int archerKitTimePlayed = 0;

	/**
	 * Archer Kit Kills
	 */
	@SerializedName("kills_archer")
	int archerKitKills = 0;

	/**
	 * Archer Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_archer")
	int archerKitTauntKills = 0;

	/**
	 * Archer Kit Damage
	 */
	@SerializedName("damage_archer")
	int archerKitDamage = 0;

	/**
	 * Archer Kit Damage Taken
	 */
	@SerializedName("damage_taken_archer")
	int archerKitDamageTaken = 0;

	/**
	 * Archer Kit Fall Damage
	 */
	@SerializedName("fall_damage_archer")
	int archerKitFallDamage = 0;

	/**
	 * Archer Kit Chests Opened
	 */
	@SerializedName("chests_opened_archer")
	int archerKitChestsOpened = 0;

	/**
	 * Archer Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_archer")
	int archerKitItemsEnchanted = 0;

	/**
	 * Archer Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_archer")
	int archerKitArrowsFired = 0;

	/**
	 * Archer Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_archer")
	int archerKitArrowsHit = 0;

	/**
	 * Archer Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_archer")
	int archerKitPotionsDrunk = 0;

	/**
	 * Archer Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_archer")
	int archerKitPotionsThrown = 0;

	/**
	 * Archer Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_archer")
	int archerKitEggThrown = 0;

	/**
	 * Archer Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_archer")
	int archerKitMobsSpawned = 0;


	/**
	 * Armorer Kit Experience
	 */
	@SerializedName("exp_armorer")
	int armorerKitExp = 0;

	/**
	 * Armorer Kit Wins
	 */
	@SerializedName("wins_armorer")
	int armorerKitWins = 0;

	/**
	 * Armorer Kit Wins Team
	 */
	@SerializedName("wins_team_armorer")
	int armorerKitWinsTeam = 0;

	/**
	 * Armorer Kit Games Played
	 */
	@SerializedName("games_played_armorer")
	int armorerKitGamesPlayed = 0;

	/**
	 * Armorer Kit Time Played
	 */
	@SerializedName("time_played_armorer")
	int armorerKitTimePlayed = 0;

	/**
	 * Armorer Kit Kills
	 */
	@SerializedName("kills_armorer")
	int armorerKitKills = 0;

	/**
	 * Armorer Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_armorer")
	int armorerKitTauntKills = 0;

	/**
	 * Armorer Kit Damage
	 */
	@SerializedName("damage_armorer")
	int armorerKitDamage = 0;

	/**
	 * Armorer Kit Damage Taken
	 */
	@SerializedName("damage_taken_armorer")
	int armorerKitDamageTaken = 0;

	/**
	 * Armorer Kit Fall Damage
	 */
	@SerializedName("fall_damage_armorer")
	int armorerKitFallDamage = 0;

	/**
	 * Armorer Kit Chests Opened
	 */
	@SerializedName("chests_opened_armorer")
	int armorerKitChestsOpened = 0;

	/**
	 * Armorer Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_armorer")
	int armorerKitItemsEnchanted = 0;

	/**
	 * Armorer Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_armorer")
	int armorerKitArrowsFired = 0;

	/**
	 * Armorer Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_armorer")
	int armorerKitArrowsHit = 0;

	/**
	 * Armorer Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_armorer")
	int armorerKitPotionsDrunk = 0;

	/**
	 * Armorer Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_armorer")
	int armorerKitPotionsThrown = 0;

	/**
	 * Armorer Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_armorer")
	int armorerKitEggThrown = 0;

	/**
	 * Armorer Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_armorer")
	int armorerKitMobsSpawned = 0;


	/**
	 * Astronaut Kit Experience
	 */
	@SerializedName("exp_astronaut")
	int astronautKitExp = 0;

	/**
	 * Astronaut Kit Wins
	 */
	@SerializedName("wins_astronaut")
	int astronautKitWins = 0;

	/**
	 * Astronaut Kit Wins Team
	 */
	@SerializedName("wins_team_astronaut")
	int astronautKitWinsTeam = 0;

	/**
	 * Astronaut Kit Games Played
	 */
	@SerializedName("games_played_astronaut")
	int astronautKitGamesPlayed = 0;

	/**
	 * Astronaut Kit Time Played
	 */
	@SerializedName("time_played_astronaut")
	int astronautKitTimePlayed = 0;

	/**
	 * Astronaut Kit Kills
	 */
	@SerializedName("kills_astronaut")
	int astronautKitKills = 0;

	/**
	 * Astronaut Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_astronaut")
	int astronautKitTauntKills = 0;

	/**
	 * Astronaut Kit Damage
	 */
	@SerializedName("damage_astronaut")
	int astronautKitDamage = 0;

	/**
	 * Astronaut Kit Damage Taken
	 */
	@SerializedName("damage_taken_astronaut")
	int astronautKitDamageTaken = 0;

	/**
	 * Astronaut Kit Fall Damage
	 */
	@SerializedName("fall_damage_astronaut")
	int astronautKitFallDamage = 0;

	/**
	 * Astronaut Kit Chests Opened
	 */
	@SerializedName("chests_opened_astronaut")
	int astronautKitChestsOpened = 0;

	/**
	 * Astronaut Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_astronaut")
	int astronautKitItemsEnchanted = 0;

	/**
	 * Astronaut Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_astronaut")
	int astronautKitArrowsFired = 0;

	/**
	 * Astronaut Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_astronaut")
	int astronautKitArrowsHit = 0;

	/**
	 * Astronaut Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_astronaut")
	int astronautKitPotionsDrunk = 0;

	/**
	 * Astronaut Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_astronaut")
	int astronautKitPotionsThrown = 0;

	/**
	 * Astronaut Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_astronaut")
	int astronautKitEggThrown = 0;

	/**
	 * Astronaut Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_astronaut")
	int astronautKitMobsSpawned = 0;


	/**
	 * Baker Kit Experience
	 */
	@SerializedName("exp_baker")
	int bakerKitExp = 0;

	/**
	 * Baker Kit Wins
	 */
	@SerializedName("wins_baker")
	int bakerKitWins = 0;

	/**
	 * Baker Kit Wins Team
	 */
	@SerializedName("wins_team_baker")
	int bakerKitWinsTeam = 0;

	/**
	 * Baker Kit Games Played
	 */
	@SerializedName("games_played_baker")
	int bakerKitGamesPlayed = 0;

	/**
	 * Baker Kit Time Played
	 */
	@SerializedName("time_played_baker")
	int bakerKitTimePlayed = 0;

	/**
	 * Baker Kit Kills
	 */
	@SerializedName("kills_baker")
	int bakerKitKills = 0;

	/**
	 * Baker Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_baker")
	int bakerKitTauntKills = 0;

	/**
	 * Baker Kit Damage
	 */
	@SerializedName("damage_baker")
	int bakerKitDamage = 0;

	/**
	 * Baker Kit Damage Taken
	 */
	@SerializedName("damage_taken_baker")
	int bakerKitDamageTaken = 0;

	/**
	 * Baker Kit Fall Damage
	 */
	@SerializedName("fall_damage_baker")
	int bakerKitFallDamage = 0;

	/**
	 * Baker Kit Chests Opened
	 */
	@SerializedName("chests_opened_baker")
	int bakerKitChestsOpened = 0;

	/**
	 * Baker Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_baker")
	int bakerKitItemsEnchanted = 0;

	/**
	 * Baker Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_baker")
	int bakerKitArrowsFired = 0;

	/**
	 * Baker Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_baker")
	int bakerKitArrowsHit = 0;

	/**
	 * Baker Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_baker")
	int bakerKitPotionsDrunk = 0;

	/**
	 * Baker Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_baker")
	int bakerKitPotionsThrown = 0;

	/**
	 * Baker Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_baker")
	int bakerKitEggThrown = 0;

	/**
	 * Baker Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_baker")
	int bakerKitMobsSpawned = 0;


	/**
	 * Blaze Kit Experience
	 */
	@SerializedName("exp_blaze")
	int blazeKitExp = 0;

	/**
	 * Blaze Kit Wins
	 */
	@SerializedName("wins_blaze")
	int blazeKitWins = 0;

	/**
	 * Blaze Kit Wins Team
	 */
	@SerializedName("wins_team_blaze")
	int blazeKitWinsTeam = 0;

	/**
	 * Blaze Kit Games Played
	 */
	@SerializedName("games_played_blaze")
	int blazeKitGamesPlayed = 0;

	/**
	 * Blaze Kit Time Played
	 */
	@SerializedName("time_played_blaze")
	int blazeKitTimePlayed = 0;

	/**
	 * Blaze Kit Kills
	 */
	@SerializedName("kills_blaze")
	int blazeKitKills = 0;

	/**
	 * Blaze Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_blaze")
	int blazeKitTauntKills = 0;

	/**
	 * Blaze Kit Damage
	 */
	@SerializedName("damage_blaze")
	int blazeKitDamage = 0;

	/**
	 * Blaze Kit Damage Taken
	 */
	@SerializedName("damage_taken_blaze")
	int blazeKitDamageTaken = 0;

	/**
	 * Blaze Kit Fall Damage
	 */
	@SerializedName("fall_damage_blaze")
	int blazeKitFallDamage = 0;

	/**
	 * Blaze Kit Chests Opened
	 */
	@SerializedName("chests_opened_blaze")
	int blazeKitChestsOpened = 0;

	/**
	 * Blaze Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_blaze")
	int blazeKitItemsEnchanted = 0;

	/**
	 * Blaze Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_blaze")
	int blazeKitArrowsFired = 0;

	/**
	 * Blaze Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_blaze")
	int blazeKitArrowsHit = 0;

	/**
	 * Blaze Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_blaze")
	int blazeKitPotionsDrunk = 0;

	/**
	 * Blaze Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_blaze")
	int blazeKitPotionsThrown = 0;

	/**
	 * Blaze Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_blaze")
	int blazeKitEggThrown = 0;

	/**
	 * Blaze Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_blaze")
	int blazeKitMobsSpawned = 0;


	/**
	 * Creeper Tamer Kit Experience
	 */
	@SerializedName("exp_creepertamer")
	int creeperTamerKitExp = 0;

	/**
	 * Creeper Tamer Kit Wins
	 */
	@SerializedName("wins_creepertamer")
	int creeperTamerKitWins = 0;

	/**
	 * Creeper Tamer Kit Wins Team
	 */
	@SerializedName("wins_team_creepertamer")
	int creeperTamerKitWinsTeam = 0;

	/**
	 * Creeper Tamer Kit Games Played
	 */
	@SerializedName("games_played_creepertamer")
	int creeperTamerKitGamesPlayed = 0;

	/**
	 * Creeper Tamer Kit Time Played
	 */
	@SerializedName("time_played_creepertamer")
	int creeperTamerKitTimePlayed = 0;

	/**
	 * Creeper Tamer Kit Kills
	 */
	@SerializedName("kills_creepertamer")
	int creeperTamerKitKills = 0;

	/**
	 * Creeper Tamer Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_creepertamer")
	int creeperTamerKitTauntKills = 0;

	/**
	 * Creeper Tamer Kit Damage
	 */
	@SerializedName("damage_creepertamer")
	int creeperTamerKitDamage = 0;

	/**
	 * Creeper Tamer Kit Damage Taken
	 */
	@SerializedName("damage_taken_creepertamer")
	int creeperTamerKitDamageTaken = 0;

	/**
	 * Creeper Tamer Kit Fall Damage
	 */
	@SerializedName("fall_damage_creepertamer")
	int creeperTamerKitFallDamage = 0;

	/**
	 * Creeper Tamer Kit Chests Opened
	 */
	@SerializedName("chests_opened_creepertamer")
	int creeperTamerKitChestsOpened = 0;

	/**
	 * Creeper Tamer Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_creepertamer")
	int creeperTamerKitItemsEnchanted = 0;

	/**
	 * Creeper Tamer Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_creepertamer")
	int creeperTamerKitArrowsFired = 0;

	/**
	 * Creeper Tamer Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_creepertamer")
	int creeperTamerKitArrowsHit = 0;

	/**
	 * Creeper Tamer Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_creepertamer")
	int creeperTamerKitPotionsDrunk = 0;

	/**
	 * Creeper Tamer Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_creepertamer")
	int creeperTamerKitPotionsThrown = 0;

	/**
	 * Creeper Tamer Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_creepertamer")
	int creeperTamerKitEggThrown = 0;

	/**
	 * Creeper Tamer Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_creepertamer")
	int creeperTamerKitMobsSpawned = 0;


	/**
	 * Diver Kit Experience
	 */
	@SerializedName("exp_diver")
	int diverKitExp = 0;

	/**
	 * Diver Kit Wins
	 */
	@SerializedName("wins_diver")
	int diverKitWins = 0;

	/**
	 * Diver Kit Wins Team
	 */
	@SerializedName("wins_team_diver")
	int diverKitWinsTeam = 0;

	/**
	 * Diver Kit Games Played
	 */
	@SerializedName("games_played_diver")
	int diverKitGamesPlayed = 0;

	/**
	 * Diver Kit Time Played
	 */
	@SerializedName("time_played_diver")
	int diverKitTimePlayed = 0;

	/**
	 * Diver Kit Kills
	 */
	@SerializedName("kills_diver")
	int diverKitKills = 0;

	/**
	 * Diver Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_diver")
	int diverKitTauntKills = 0;

	/**
	 * Diver Kit Damage
	 */
	@SerializedName("damage_diver")
	int diverKitDamage = 0;

	/**
	 * Diver Kit Damage Taken
	 */
	@SerializedName("damage_taken_diver")
	int diverKitDamageTaken = 0;

	/**
	 * Diver Kit Fall Damage
	 */
	@SerializedName("fall_damage_diver")
	int diverKitFallDamage = 0;

	/**
	 * Diver Kit Chests Opened
	 */
	@SerializedName("chests_opened_diver")
	int diverKitChestsOpened = 0;

	/**
	 * Diver Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_diver")
	int diverKitItemsEnchanted = 0;

	/**
	 * Diver Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_diver")
	int diverKitArrowsFired = 0;

	/**
	 * Diver Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_diver")
	int diverKitArrowsHit = 0;

	/**
	 * Diver Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_diver")
	int diverKitPotionsDrunk = 0;

	/**
	 * Diver Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_diver")
	int diverKitPotionsThrown = 0;

	/**
	 * Diver Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_diver")
	int diverKitEggThrown = 0;

	/**
	 * Diver Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_diver")
	int diverKitMobsSpawned = 0;


	/**
	 * Donkey Tamer Kit Experience
	 */
	@SerializedName("exp_donkeytamer")
	int donkeyTamerKitExp = 0;

	/**
	 * Donkey Tamer Kit Wins
	 */
	@SerializedName("wins_donkeytamer")
	int donkeyTamerKitWins = 0;

	/**
	 * Donkey Tamer Kit Wins Team
	 */
	@SerializedName("wins_team_donkeytamer")
	int donkeyTamerKitWinsTeam = 0;

	/**
	 * Donkey Tamer Kit Games Played
	 */
	@SerializedName("games_played_donkeytamer")
	int donkeyTamerKitGamesPlayed = 0;

	/**
	 * Donkey Tamer Kit Time Played
	 */
	@SerializedName("time_played_donkeytamer")
	int donkeyTamerKitTimePlayed = 0;

	/**
	 * Donkey Tamer Kit Kills
	 */
	@SerializedName("kills_donkeytamer")
	int donkeyTamerKitKills = 0;

	/**
	 * Donkey Tamer Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_donkeytamer")
	int donkeyTamerKitTauntKills = 0;

	/**
	 * Donkey Tamer Kit Damage
	 */
	@SerializedName("damage_donkeytamer")
	int donkeyTamerKitDamage = 0;

	/**
	 * Donkey Tamer Kit Damage Taken
	 */
	@SerializedName("damage_taken_donkeytamer")
	int donkeyTamerKitDamageTaken = 0;

	/**
	 * Donkey Tamer Kit Fall Damage
	 */
	@SerializedName("fall_damage_donkeytamer")
	int donkeyTamerKitFallDamage = 0;

	/**
	 * Donkey Tamer Kit Chests Opened
	 */
	@SerializedName("chests_opened_donkeytamer")
	int donkeyTamerKitChestsOpened = 0;

	/**
	 * Donkey Tamer Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_donkeytamer")
	int donkeyTamerKitItemsEnchanted = 0;

	/**
	 * Donkey Tamer Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_donkeytamer")
	int donkeyTamerKitArrowsFired = 0;

	/**
	 * Donkey Tamer Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_donkeytamer")
	int donkeyTamerKitArrowsHit = 0;

	/**
	 * Donkey Tamer Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_donkeytamer")
	int donkeyTamerKitPotionsDrunk = 0;

	/**
	 * Donkey Tamer Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_donkeytamer")
	int donkeyTamerKitPotionsThrown = 0;

	/**
	 * Donkey Tamer Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_donkeytamer")
	int donkeyTamerKitEggThrown = 0;

	/**
	 * Donkey Tamer Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_donkeytamer")
	int donkeyTamerKitMobsSpawned = 0;


	/**
	 * Farmer Kit Experience
	 */
	@SerializedName("exp_farmer")
	int farmerKitExp = 0;

	/**
	 * Farmer Kit Wins
	 */
	@SerializedName("wins_farmer")
	int farmerKitWins = 0;

	/**
	 * Farmer Kit Wins Team
	 */
	@SerializedName("wins_team_farmer")
	int farmerKitWinsTeam = 0;

	/**
	 * Farmer Kit Games Played
	 */
	@SerializedName("games_played_farmer")
	int farmerKitGamesPlayed = 0;

	/**
	 * Farmer Kit Time Played
	 */
	@SerializedName("time_played_farmer")
	int farmerKitTimePlayed = 0;

	/**
	 * Farmer Kit Kills
	 */
	@SerializedName("kills_farmer")
	int farmerKitKills = 0;

	/**
	 * Farmer Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_farmer")
	int farmerKitTauntKills = 0;

	/**
	 * Farmer Kit Damage
	 */
	@SerializedName("damage_farmer")
	int farmerKitDamage = 0;

	/**
	 * Farmer Kit Damage Taken
	 */
	@SerializedName("damage_taken_farmer")
	int farmerKitDamageTaken = 0;

	/**
	 * Farmer Kit Fall Damage
	 */
	@SerializedName("fall_damage_farmer")
	int farmerKitFallDamage = 0;

	/**
	 * Farmer Kit Chests Opened
	 */
	@SerializedName("chests_opened_farmer")
	int farmerKitChestsOpened = 0;

	/**
	 * Farmer Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_farmer")
	int farmerKitItemsEnchanted = 0;

	/**
	 * Farmer Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_farmer")
	int farmerKitArrowsFired = 0;

	/**
	 * Farmer Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_farmer")
	int farmerKitArrowsHit = 0;

	/**
	 * Farmer Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_farmer")
	int farmerKitPotionsDrunk = 0;

	/**
	 * Farmer Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_farmer")
	int farmerKitPotionsThrown = 0;

	/**
	 * Farmer Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_farmer")
	int farmerKitEggThrown = 0;

	/**
	 * Farmer Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_farmer")
	int farmerKitMobsSpawned = 0;


	/**
	 * Fisherman Kit Experience
	 */
	@SerializedName("exp_fisherman")
	int fishermanKitExp = 0;

	/**
	 * Fisherman Kit Wins
	 */
	@SerializedName("wins_fisherman")
	int fishermanKitWins = 0;

	/**
	 * Fisherman Kit Wins Team
	 */
	@SerializedName("wins_team_fisherman")
	int fishermanKitWinsTeam = 0;

	/**
	 * Fisherman Kit Games Played
	 */
	@SerializedName("games_played_fisherman")
	int fishermanKitGamesPlayed = 0;

	/**
	 * Fisherman Kit Time Played
	 */
	@SerializedName("time_played_fisherman")
	int fishermanKitTimePlayed = 0;

	/**
	 * Fisherman Kit Kills
	 */
	@SerializedName("kills_fisherman")
	int fishermanKitKills = 0;

	/**
	 * Fisherman Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_fisherman")
	int fishermanKitTauntKills = 0;

	/**
	 * Fisherman Kit Damage
	 */
	@SerializedName("damage_fisherman")
	int fishermanKitDamage = 0;

	/**
	 * Fisherman Kit Damage Taken
	 */
	@SerializedName("damage_taken_fisherman")
	int fishermanKitDamageTaken = 0;

	/**
	 * Fisherman Kit Fall Damage
	 */
	@SerializedName("fall_damage_fisherman")
	int fishermanKitFallDamage = 0;

	/**
	 * Fisherman Kit Chests Opened
	 */
	@SerializedName("chests_opened_fisherman")
	int fishermanKitChestsOpened = 0;

	/**
	 * Fisherman Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_fisherman")
	int fishermanKitItemsEnchanted = 0;

	/**
	 * Fisherman Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_fisherman")
	int fishermanKitArrowsFired = 0;

	/**
	 * Fisherman Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_fisherman")
	int fishermanKitArrowsHit = 0;

	/**
	 * Fisherman Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_fisherman")
	int fishermanKitPotionsDrunk = 0;

	/**
	 * Fisherman Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_fisherman")
	int fishermanKitPotionsThrown = 0;

	/**
	 * Fisherman Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_fisherman")
	int fishermanKitEggThrown = 0;

	/**
	 * Fisherman Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_fisherman")
	int fishermanKitMobsSpawned = 0;


	/**
	 * Florist Kit Experience
	 */
	@SerializedName("exp_florist")
	int floristKitExp = 0;

	/**
	 * Florist Kit Wins
	 */
	@SerializedName("wins_florist")
	int floristKitWins = 0;

	/**
	 * Florist Kit Wins Team
	 */
	@SerializedName("wins_team_florist")
	int floristKitWinsTeam = 0;

	/**
	 * Florist Kit Games Played
	 */
	@SerializedName("games_played_florist")
	int floristKitGamesPlayed = 0;

	/**
	 * Florist Kit Time Played
	 */
	@SerializedName("time_played_florist")
	int floristKitTimePlayed = 0;

	/**
	 * Florist Kit Kills
	 */
	@SerializedName("kills_florist")
	int floristKitKills = 0;

	/**
	 * Florist Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_florist")
	int floristKitTauntKills = 0;

	/**
	 * Florist Kit Damage
	 */
	@SerializedName("damage_florist")
	int floristKitDamage = 0;

	/**
	 * Florist Kit Damage Taken
	 */
	@SerializedName("damage_taken_florist")
	int floristKitDamageTaken = 0;

	/**
	 * Florist Kit Fall Damage
	 */
	@SerializedName("fall_damage_florist")
	int floristKitFallDamage = 0;

	/**
	 * Florist Kit Chests Opened
	 */
	@SerializedName("chests_opened_florist")
	int floristKitChestsOpened = 0;

	/**
	 * Florist Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_florist")
	int floristKitItemsEnchanted = 0;

	/**
	 * Florist Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_florist")
	int floristKitArrowsFired = 0;

	/**
	 * Florist Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_florist")
	int floristKitArrowsHit = 0;

	/**
	 * Florist Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_florist")
	int floristKitPotionsDrunk = 0;

	/**
	 * Florist Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_florist")
	int floristKitPotionsThrown = 0;

	/**
	 * Florist Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_florist")
	int floristKitEggThrown = 0;

	/**
	 * Florist Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_florist")
	int floristKitMobsSpawned = 0;


	/**
	 * Golem Kit Experience
	 */
	@SerializedName("exp_golem")
	int golemKitExp = 0;

	/**
	 * Golem Kit Wins
	 */
	@SerializedName("wins_golem")
	int golemKitWins = 0;

	/**
	 * Golem Kit Wins Team
	 */
	@SerializedName("wins_team_golem")
	int golemKitWinsTeam = 0;

	/**
	 * Golem Kit Games Played
	 */
	@SerializedName("games_played_golem")
	int golemKitGamesPlayed = 0;

	/**
	 * Golem Kit Time Played
	 */
	@SerializedName("time_played_golem")
	int golemKitTimePlayed = 0;

	/**
	 * Golem Kit Kills
	 */
	@SerializedName("kills_golem")
	int golemKitKills = 0;

	/**
	 * Golem Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_golem")
	int golemKitTauntKills = 0;

	/**
	 * Golem Kit Damage
	 */
	@SerializedName("damage_golem")
	int golemKitDamage = 0;

	/**
	 * Golem Kit Damage Taken
	 */
	@SerializedName("damage_taken_golem")
	int golemKitDamageTaken = 0;

	/**
	 * Golem Kit Fall Damage
	 */
	@SerializedName("fall_damage_golem")
	int golemKitFallDamage = 0;

	/**
	 * Golem Kit Chests Opened
	 */
	@SerializedName("chests_opened_golem")
	int golemKitChestsOpened = 0;

	/**
	 * Golem Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_golem")
	int golemKitItemsEnchanted = 0;

	/**
	 * Golem Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_golem")
	int golemKitArrowsFired = 0;

	/**
	 * Golem Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_golem")
	int golemKitArrowsHit = 0;

	/**
	 * Golem Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_golem")
	int golemKitPotionsDrunk = 0;

	/**
	 * Golem Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_golem")
	int golemKitPotionsThrown = 0;

	/**
	 * Golem Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_golem")
	int golemKitEggThrown = 0;

	/**
	 * Golem Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_golem")
	int golemKitMobsSpawned = 0;


	/**
	 * Guardian Kit Experience
	 */
	@SerializedName("exp_guardian")
	int guardianKitExp = 0;

	/**
	 * Guardian Kit Wins
	 */
	@SerializedName("wins_guardian")
	int guardianKitWins = 0;

	/**
	 * Guardian Kit Wins Team
	 */
	@SerializedName("wins_team_guardian")
	int guardianKitWinsTeam = 0;

	/**
	 * Guardian Kit Games Played
	 */
	@SerializedName("games_played_guardian")
	int guardianKitGamesPlayed = 0;

	/**
	 * Guardian Kit Time Played
	 */
	@SerializedName("time_played_guardian")
	int guardianKitTimePlayed = 0;

	/**
	 * Guardian Kit Kills
	 */
	@SerializedName("kills_guardian")
	int guardianKitKills = 0;

	/**
	 * Guardian Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_guardian")
	int guardianKitTauntKills = 0;

	/**
	 * Guardian Kit Damage
	 */
	@SerializedName("damage_guardian")
	int guardianKitDamage = 0;

	/**
	 * Guardian Kit Damage Taken
	 */
	@SerializedName("damage_taken_guardian")
	int guardianKitDamageTaken = 0;

	/**
	 * Guardian Kit Fall Damage
	 */
	@SerializedName("fall_damage_guardian")
	int guardianKitFallDamage = 0;

	/**
	 * Guardian Kit Chests Opened
	 */
	@SerializedName("chests_opened_guardian")
	int guardianKitChestsOpened = 0;

	/**
	 * Guardian Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_guardian")
	int guardianKitItemsEnchanted = 0;

	/**
	 * Guardian Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_guardian")
	int guardianKitArrowsFired = 0;

	/**
	 * Guardian Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_guardian")
	int guardianKitArrowsHit = 0;

	/**
	 * Guardian Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_guardian")
	int guardianKitPotionsDrunk = 0;

	/**
	 * Guardian Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_guardian")
	int guardianKitPotionsThrown = 0;

	/**
	 * Guardian Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_guardian")
	int guardianKitEggThrown = 0;

	/**
	 * Guardian Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_guardian")
	int guardianKitMobsSpawned = 0;


	/**
	 * Horse Tamer Kit Experience
	 */
	@SerializedName("exp_horsetamer")
	int horseTamerKitExp = 0;

	/**
	 * Horse Tamer Kit Wins
	 */
	@SerializedName("wins_horsetamer")
	int horseTamerKitWins = 0;

	/**
	 * Horse Tamer Kit Wins Team
	 */
	@SerializedName("wins_team_horsetamer")
	int horseTamerKitWinsTeam = 0;

	/**
	 * Horse Tamer Kit Games Played
	 */
	@SerializedName("games_played_horsetamer")
	int horseTamerKitGamesPlayed = 0;

	/**
	 * Horse Tamer Kit Time Played
	 */
	@SerializedName("time_played_horsetamer")
	int horseTamerKitTimePlayed = 0;

	/**
	 * Horse Tamer Kit Kills
	 */
	@SerializedName("kills_horsetamer")
	int horseTamerKitKills = 0;

	/**
	 * Horse Tamer Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_horsetamer")
	int horseTamerKitTauntKills = 0;

	/**
	 * Horse Tamer Kit Damage
	 */
	@SerializedName("damage_horsetamer")
	int horseTamerKitDamage = 0;

	/**
	 * Horse Tamer Kit Damage Taken
	 */
	@SerializedName("damage_taken_horsetamer")
	int horseTamerKitDamageTaken = 0;

	/**
	 * Horse Tamer Kit Fall Damage
	 */
	@SerializedName("fall_damage_horsetamer")
	int horseTamerKitFallDamage = 0;

	/**
	 * Horse Tamer Kit Chests Opened
	 */
	@SerializedName("chests_opened_horsetamer")
	int horseTamerKitChestsOpened = 0;

	/**
	 * Horse Tamer Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_horsetamer")
	int horseTamerKitItemsEnchanted = 0;

	/**
	 * Horse Tamer Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_horsetamer")
	int horseTamerKitArrowsFired = 0;

	/**
	 * Horse Tamer Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_horsetamer")
	int horseTamerKitArrowsHit = 0;

	/**
	 * Horse Tamer Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_horsetamer")
	int horseTamerKitPotionsDrunk = 0;

	/**
	 * Horse Tamer Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_horsetamer")
	int horseTamerKitPotionsThrown = 0;

	/**
	 * Horse Tamer Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_horsetamer")
	int horseTamerKitEggThrown = 0;

	/**
	 * Horse Tamer Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_horsetamer")
	int horseTamerKitMobsSpawned = 0;


	/**
	 * Hunter Kit Experience
	 */
	@SerializedName("exp_hunter")
	int hunterKitExp = 0;

	/**
	 * Hunter Kit Wins
	 */
	@SerializedName("wins_hunter")
	int hunterKitWins = 0;

	/**
	 * Hunter Kit Wins Team
	 */
	@SerializedName("wins_team_hunter")
	int hunterKitWinsTeam = 0;

	/**
	 * Hunter Kit Games Played
	 */
	@SerializedName("games_played_hunter")
	int hunterKitGamesPlayed = 0;

	/**
	 * Hunter Kit Time Played
	 */
	@SerializedName("time_played_hunter")
	int hunterKitTimePlayed = 0;

	/**
	 * Hunter Kit Kills
	 */
	@SerializedName("kills_hunter")
	int hunterKitKills = 0;

	/**
	 * Hunter Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_hunter")
	int hunterKitTauntKills = 0;

	/**
	 * Hunter Kit Damage
	 */
	@SerializedName("damage_hunter")
	int hunterKitDamage = 0;

	/**
	 * Hunter Kit Damage Taken
	 */
	@SerializedName("damage_taken_hunter")
	int hunterKitDamageTaken = 0;

	/**
	 * Hunter Kit Fall Damage
	 */
	@SerializedName("fall_damage_hunter")
	int hunterKitFallDamage = 0;

	/**
	 * Hunter Kit Chests Opened
	 */
	@SerializedName("chests_opened_hunter")
	int hunterKitChestsOpened = 0;

	/**
	 * Hunter Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_hunter")
	int hunterKitItemsEnchanted = 0;

	/**
	 * Hunter Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_hunter")
	int hunterKitArrowsFired = 0;

	/**
	 * Hunter Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_hunter")
	int hunterKitArrowsHit = 0;

	/**
	 * Hunter Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_hunter")
	int hunterKitPotionsDrunk = 0;

	/**
	 * Hunter Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_hunter")
	int hunterKitPotionsThrown = 0;

	/**
	 * Hunter Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_hunter")
	int hunterKitEggThrown = 0;

	/**
	 * Hunter Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_hunter")
	int hunterKitMobsSpawned = 0;

	/**
	 * Hype Train Kit Experience
	 */
	@SerializedName("exp_hype train")
	int hypeTrainKitExp = 0;

	/**
	 * Hype Train Kit Wins
	 */
	@SerializedName("wins_hype train")
	int hypeTrainKitWins = 0;

	/**
	 * Hype Train Kit Wins Team
	 */
	@SerializedName("wins_team_hype train")
	int hypeTrainKitWinsTeam = 0;

	/**
	 * Hype Train Kit Games Played
	 */
	@SerializedName("games_played_hype train")
	int hypeTrainKitGamesPlayed = 0;

	/**
	 * Hype Train Kit Time Played
	 */
	@SerializedName("time_played_hype train")
	int hypeTrainKitTimePlayed = 0;

	/**
	 * Hype Train Kit Kills
	 */
	@SerializedName("kills_hype train")
	int hypeTrainKitKills = 0;

	/**
	 * Hype Train Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_hype train")
	int hypeTrainKitTauntKills = 0;

	/**
	 * Hype Train Kit Damage
	 */
	@SerializedName("damage_hype train")
	int hypeTrainKitDamage = 0;

	/**
	 * Hype Train Kit Damage Taken
	 */
	@SerializedName("damage_taken_hype train")
	int hypeTrainKitDamageTaken = 0;

	/**
	 * Hype Train Kit Fall Damage
	 */
	@SerializedName("fall_damage_hype train")
	int hypeTrainKitFallDamage = 0;

	/**
	 * Hype Train Kit Chests Opened
	 */
	@SerializedName("chests_opened_hype train")
	int hypeTrainKitChestsOpened = 0;

	/**
	 * Hype Train Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_hype train")
	int hypeTrainKitItemsEnchanted = 0;

	/**
	 * Hype Train Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_hype train")
	int hypeTrainKitArrowsFired = 0;

	/**
	 * Hype Train Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_hype train")
	int hypeTrainKitArrowsHit = 0;

	/**
	 * Hype Train Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_hype train")
	int hypeTrainKitPotionsDrunk = 0;

	/**
	 * Hype Train Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_hype train")
	int hypeTrainKitPotionsThrown = 0;

	/**
	 * Hype Train Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_hype train")
	int hypeTrainKitEggThrown = 0;

	/**
	 * Hype Train Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_hype train")
	int hypeTrainKitMobsSpawned = 0;


	/**
	 * Jockey Kit Experience
	 */
	@SerializedName("exp_jockey")
	int jockeyKitExp = 0;

	/**
	 * Jockey Kit Wins
	 */
	@SerializedName("wins_jockey")
	int jockeyKitWins = 0;

	/**
	 * Jockey Kit Wins Team
	 */
	@SerializedName("wins_team_jockey")
	int jockeyKitWinsTeam = 0;

	/**
	 * Jockey Kit Games Played
	 */
	@SerializedName("games_played_jockey")
	int jockeyKitGamesPlayed = 0;

	/**
	 * Jockey Kit Time Played
	 */
	@SerializedName("time_played_jockey")
	int jockeyKitTimePlayed = 0;

	/**
	 * Jockey Kit Kills
	 */
	@SerializedName("kills_jockey")
	int jockeyKitKills = 0;

	/**
	 * Jockey Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_jockey")
	int jockeyKitTauntKills = 0;

	/**
	 * Jockey Kit Damage
	 */
	@SerializedName("damage_jockey")
	int jockeyKitDamage = 0;

	/**
	 * Jockey Kit Damage Taken
	 */
	@SerializedName("damage_taken_jockey")
	int jockeyKitDamageTaken = 0;

	/**
	 * Jockey Kit Fall Damage
	 */
	@SerializedName("fall_damage_jockey")
	int jockeyKitFallDamage = 0;

	/**
	 * Jockey Kit Chests Opened
	 */
	@SerializedName("chests_opened_jockey")
	int jockeyKitChestsOpened = 0;

	/**
	 * Jockey Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_jockey")
	int jockeyKitItemsEnchanted = 0;

	/**
	 * Jockey Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_jockey")
	int jockeyKitArrowsFired = 0;

	/**
	 * Jockey Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_jockey")
	int jockeyKitArrowsHit = 0;

	/**
	 * Jockey Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_jockey")
	int jockeyKitPotionsDrunk = 0;

	/**
	 * Jockey Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_jockey")
	int jockeyKitPotionsThrown = 0;

	/**
	 * Jockey Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_jockey")
	int jockeyKitEggThrown = 0;

	/**
	 * Jockey Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_jockey")
	int jockeyKitMobsSpawned = 0;


	/**
	 * Knight Kit Experience
	 */
	@SerializedName("exp_knight")
	int knightKitExp = 0;

	/**
	 * Knight Kit Wins
	 */
	@SerializedName("wins_knight")
	int knightKitWins = 0;

	/**
	 * Knight Kit Wins Team
	 */
	@SerializedName("wins_team_knight")
	int knightKitWinsTeam = 0;

	/**
	 * Knight Kit Games Played
	 */
	@SerializedName("games_played_knight")
	int knightKitGamesPlayed = 0;

	/**
	 * Knight Kit Time Played
	 */
	@SerializedName("time_played_knight")
	int knightKitTimePlayed = 0;

	/**
	 * Knight Kit Kills
	 */
	@SerializedName("kills_knight")
	int knightKitKills = 0;

	/**
	 * Knight Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_knight")
	int knightKitTauntKills = 0;

	/**
	 * Knight Kit Damage
	 */
	@SerializedName("damage_knight")
	int knightKitDamage = 0;

	/**
	 * Knight Kit Damage Taken
	 */
	@SerializedName("damage_taken_knight")
	int knightKitDamageTaken = 0;

	/**
	 * Knight Kit Fall Damage
	 */
	@SerializedName("fall_damage_knight")
	int knightKitFallDamage = 0;

	/**
	 * Knight Kit Chests Opened
	 */
	@SerializedName("chests_opened_knight")
	int knightKitChestsOpened = 0;

	/**
	 * Knight Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_knight")
	int knightKitItemsEnchanted = 0;

	/**
	 * Knight Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_knight")
	int knightKitArrowsFired = 0;

	/**
	 * Knight Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_knight")
	int knightKitArrowsHit = 0;

	/**
	 * Knight Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_knight")
	int knightKitPotionsDrunk = 0;

	/**
	 * Knight Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_knight")
	int knightKitPotionsThrown = 0;

	/**
	 * Knight Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_knight")
	int knightKitEggThrown = 0;

	/**
	 * Knight Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_knight")
	int knightKitMobsSpawned = 0;


	/**
	 * Meat Master Kit Experience
	 */
	@SerializedName("exp_meatmaster")
	int meatMasterKitExp = 0;

	/**
	 * Meat Master Kit Wins
	 */
	@SerializedName("wins_meatmaster")
	int meatMasterKitWins = 0;

	/**
	 * Meat Master Kit Wins Team
	 */
	@SerializedName("wins_team_meatmaster")
	int meatMasterKitWinsTeam = 0;

	/**
	 * Meat Master Kit Games Played
	 */
	@SerializedName("games_played_meatmaster")
	int meatMasterKitGamesPlayed = 0;

	/**
	 * Meat Master Kit Time Played
	 */
	@SerializedName("time_played_meatmaster")
	int meatMasterKitTimePlayed = 0;

	/**
	 * Meat Master Kit Kills
	 */
	@SerializedName("kills_meatmaster")
	int meatMasterKitKills = 0;

	/**
	 * Meat Master Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_meatmaster")
	int meatMasterKitTauntKills = 0;

	/**
	 * Meat Master Kit Damage
	 */
	@SerializedName("damage_meatmaster")
	int meatMasterKitDamage = 0;

	/**
	 * Meat Master Kit Damage Taken
	 */
	@SerializedName("damage_taken_meatmaster")
	int meatMasterKitDamageTaken = 0;

	/**
	 * Meat Master Kit Fall Damage
	 */
	@SerializedName("fall_damage_meatmaster")
	int meatMasterKitFallDamage = 0;

	/**
	 * Meat Master Kit Chests Opened
	 */
	@SerializedName("chests_opened_meatmaster")
	int meatMasterKitChestsOpened = 0;

	/**
	 * Meat Master Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_meatmaster")
	int meatMasterKitItemsEnchanted = 0;

	/**
	 * Meat Master Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_meatmaster")
	int meatMasterKitArrowsFired = 0;

	/**
	 * Meat Master Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_meatmaster")
	int meatMasterKitArrowsHit = 0;

	/**
	 * Meat Master Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_meatmaster")
	int meatMasterKitPotionsDrunk = 0;

	/**
	 * Meat Master Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_meatmaster")
	int meatMasterKitPotionsThrown = 0;

	/**
	 * Meat Master Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_meatmaster")
	int meatMasterKitEggThrown = 0;

	/**
	 * Meat Master Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_meatmaster")
	int meatMasterKitMobsSpawned = 0;


	/**
	 * Necromancer Kit Experience
	 */
	@SerializedName("exp_necromancer")
	int necromancerKitExp = 0;

	/**
	 * Necromancer Kit Wins
	 */
	@SerializedName("wins_necromancer")
	int necromancerKitWins = 0;

	/**
	 * Necromancer Kit Wins Team
	 */
	@SerializedName("wins_team_necromancer")
	int necromancerKitWinsTeam = 0;

	/**
	 * Necromancer Kit Games Played
	 */
	@SerializedName("games_played_necromancer")
	int necromancerKitGamesPlayed = 0;

	/**
	 * Necromancer Kit Time Played
	 */
	@SerializedName("time_played_necromancer")
	int necromancerKitTimePlayed = 0;

	/**
	 * Necromancer Kit Kills
	 */
	@SerializedName("kills_necromancer")
	int necromancerKitKills = 0;

	/**
	 * Necromancer Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_necromancer")
	int necromancerKitTauntKills = 0;

	/**
	 * Necromancer Kit Damage
	 */
	@SerializedName("damage_necromancer")
	int necromancerKitDamage = 0;

	/**
	 * Necromancer Kit Damage Taken
	 */
	@SerializedName("damage_taken_necromancer")
	int necromancerKitDamageTaken = 0;

	/**
	 * Necromancer Kit Fall Damage
	 */
	@SerializedName("fall_damage_necromancer")
	int necromancerKitFallDamage = 0;

	/**
	 * Necromancer Kit Chests Opened
	 */
	@SerializedName("chests_opened_necromancer")
	int necromancerKitChestsOpened = 0;

	/**
	 * Necromancer Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_necromancer")
	int necromancerKitItemsEnchanted = 0;

	/**
	 * Necromancer Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_necromancer")
	int necromancerKitArrowsFired = 0;

	/**
	 * Necromancer Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_necromancer")
	int necromancerKitArrowsHit = 0;

	/**
	 * Necromancer Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_necromancer")
	int necromancerKitPotionsDrunk = 0;

	/**
	 * Necromancer Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_necromancer")
	int necromancerKitPotionsThrown = 0;

	/**
	 * Necromancer Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_necromancer")
	int necromancerKitEggThrown = 0;

	/**
	 * Necromancer Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_necromancer")
	int necromancerKitMobsSpawned = 0;


	/**
	 * Paladin Kit Experience
	 */
	@SerializedName("exp_paladin")
	int paladinKitExp = 0;

	/**
	 * Paladin Kit Wins
	 */
	@SerializedName("wins_paladin")
	int paladinKitWins = 0;

	/**
	 * Paladin Kit Wins Team
	 */
	@SerializedName("wins_team_paladin")
	int paladinKitWinsTeam = 0;

	/**
	 * Paladin Kit Games Played
	 */
	@SerializedName("games_played_paladin")
	int paladinKitGamesPlayed = 0;

	/**
	 * Paladin Kit Time Played
	 */
	@SerializedName("time_played_paladin")
	int paladinKitTimePlayed = 0;

	/**
	 * Paladin Kit Kills
	 */
	@SerializedName("kills_paladin")
	int paladinKitKills = 0;

	/**
	 * Paladin Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_paladin")
	int paladinKitTauntKills = 0;

	/**
	 * Paladin Kit Damage
	 */
	@SerializedName("damage_paladin")
	int paladinKitDamage = 0;

	/**
	 * Paladin Kit Damage Taken
	 */
	@SerializedName("damage_taken_paladin")
	int paladinKitDamageTaken = 0;

	/**
	 * Paladin Kit Fall Damage
	 */
	@SerializedName("fall_damage_paladin")
	int paladinKitFallDamage = 0;

	/**
	 * Paladin Kit Chests Opened
	 */
	@SerializedName("chests_opened_paladin")
	int paladinKitChestsOpened = 0;

	/**
	 * Paladin Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_paladin")
	int paladinKitItemsEnchanted = 0;

	/**
	 * Paladin Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_paladin")
	int paladinKitArrowsFired = 0;

	/**
	 * Paladin Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_paladin")
	int paladinKitArrowsHit = 0;

	/**
	 * Paladin Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_paladin")
	int paladinKitPotionsDrunk = 0;

	/**
	 * Paladin Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_paladin")
	int paladinKitPotionsThrown = 0;

	/**
	 * Paladin Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_paladin")
	int paladinKitEggThrown = 0;

	/**
	 * Paladin Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_paladin")
	int paladinKitMobsSpawned = 0;


	/**
	 * Phoenix Kit Experience
	 */
	@SerializedName("exp_phoenix")
	int phoenixKitExp = 0;

	/**
	 * Phoenix Kit Wins
	 */
	@SerializedName("wins_phoenix")
	int phoenixKitWins = 0;

	/**
	 * Phoenix Kit Wins Team
	 */
	@SerializedName("wins_team_phoenix")
	int phoenixKitWinsTeam = 0;

	/**
	 * Phoenix Kit Games Played
	 */
	@SerializedName("games_played_phoenix")
	int phoenixKitGamesPlayed = 0;

	/**
	 * Phoenix Kit Time Played
	 */
	@SerializedName("time_played_phoenix")
	int phoenixKitTimePlayed = 0;

	/**
	 * Phoenix Kit Kills
	 */
	@SerializedName("kills_phoenix")
	int phoenixKitKills = 0;

	/**
	 * Phoenix Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_phoenix")
	int phoenixKitTauntKills = 0;

	/**
	 * Phoenix Kit Damage
	 */
	@SerializedName("damage_phoenix")
	int phoenixKitDamage = 0;

	/**
	 * Phoenix Kit Damage Taken
	 */
	@SerializedName("damage_taken_phoenix")
	int phoenixKitDamageTaken = 0;

	/**
	 * Phoenix Kit Fall Damage
	 */
	@SerializedName("fall_damage_phoenix")
	int phoenixKitFallDamage = 0;

	/**
	 * Phoenix Kit Chests Opened
	 */
	@SerializedName("chests_opened_phoenix")
	int phoenixKitChestsOpened = 0;

	/**
	 * Phoenix Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_phoenix")
	int phoenixKitItemsEnchanted = 0;

	/**
	 * Phoenix Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_phoenix")
	int phoenixKitArrowsFired = 0;

	/**
	 * Phoenix Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_phoenix")
	int phoenixKitArrowsHit = 0;

	/**
	 * Phoenix Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_phoenix")
	int phoenixKitPotionsDrunk = 0;

	/**
	 * Phoenix Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_phoenix")
	int phoenixKitPotionsThrown = 0;

	/**
	 * Phoenix Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_phoenix")
	int phoenixKitEggThrown = 0;

	/**
	 * Phoenix Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_phoenix")
	int phoenixKitMobsSpawned = 0;


	/**
	 * Pigman Kit Experience
	 */
	@SerializedName("exp_pigman")
	int pigmanKitExp = 0;

	/**
	 * Pigman Kit Wins
	 */
	@SerializedName("wins_pigman")
	int pigmanKitWins = 0;

	/**
	 * Pigman Kit Wins Team
	 */
	@SerializedName("wins_team_pigman")
	int pigmanKitWinsTeam = 0;

	/**
	 * Pigman Kit Games Played
	 */
	@SerializedName("games_played_pigman")
	int pigmanKitGamesPlayed = 0;

	/**
	 * Pigman Kit Time Played
	 */
	@SerializedName("time_played_pigman")
	int pigmanKitTimePlayed = 0;

	/**
	 * Pigman Kit Kills
	 */
	@SerializedName("kills_pigman")
	int pigmanKitKills = 0;

	/**
	 * Pigman Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_pigman")
	int pigmanKitTauntKills = 0;

	/**
	 * Pigman Kit Damage
	 */
	@SerializedName("damage_pigman")
	int pigmanKitDamage = 0;

	/**
	 * Pigman Kit Damage Taken
	 */
	@SerializedName("damage_taken_pigman")
	int pigmanKitDamageTaken = 0;

	/**
	 * Pigman Kit Fall Damage
	 */
	@SerializedName("fall_damage_pigman")
	int pigmanKitFallDamage = 0;

	/**
	 * Pigman Kit Chests Opened
	 */
	@SerializedName("chests_opened_pigman")
	int pigmanKitChestsOpened = 0;

	/**
	 * Pigman Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_pigman")
	int pigmanKitItemsEnchanted = 0;

	/**
	 * Pigman Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_pigman")
	int pigmanKitArrowsFired = 0;

	/**
	 * Pigman Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_pigman")
	int pigmanKitArrowsHit = 0;

	/**
	 * Pigman Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_pigman")
	int pigmanKitPotionsDrunk = 0;

	/**
	 * Pigman Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_pigman")
	int pigmanKitPotionsThrown = 0;

	/**
	 * Pigman Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_pigman")
	int pigmanKitEggThrown = 0;

	/**
	 * Pigman Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_pigman")
	int pigmanKitMobsSpawned = 0;


	/**
	 * Ranger Kit Experience
	 */
	@SerializedName("exp_ranger")
	int rangerKitExp = 0;

	/**
	 * Ranger Kit Wins
	 */
	@SerializedName("wins_ranger")
	int rangerKitWins = 0;

	/**
	 * Ranger Kit Wins Team
	 */
	@SerializedName("wins_team_ranger")
	int rangerKitWinsTeam = 0;

	/**
	 * Ranger Kit Games Played
	 */
	@SerializedName("games_played_ranger")
	int rangerKitGamesPlayed = 0;

	/**
	 * Ranger Kit Time Played
	 */
	@SerializedName("time_played_ranger")
	int rangerKitTimePlayed = 0;

	/**
	 * Ranger Kit Kills
	 */
	@SerializedName("kills_ranger")
	int rangerKitKills = 0;

	/**
	 * Ranger Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_ranger")
	int rangerKitTauntKills = 0;

	/**
	 * Ranger Kit Damage
	 */
	@SerializedName("damage_ranger")
	int rangerKitDamage = 0;

	/**
	 * Ranger Kit Damage Taken
	 */
	@SerializedName("damage_taken_ranger")
	int rangerKitDamageTaken = 0;

	/**
	 * Ranger Kit Fall Damage
	 */
	@SerializedName("fall_damage_ranger")
	int rangerKitFallDamage = 0;

	/**
	 * Ranger Kit Chests Opened
	 */
	@SerializedName("chests_opened_ranger")
	int rangerKitChestsOpened = 0;

	/**
	 * Ranger Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_ranger")
	int rangerKitItemsEnchanted = 0;

	/**
	 * Ranger Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_ranger")
	int rangerKitArrowsFired = 0;

	/**
	 * Ranger Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_ranger")
	int rangerKitArrowsHit = 0;

	/**
	 * Ranger Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_ranger")
	int rangerKitPotionsDrunk = 0;

	/**
	 * Ranger Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_ranger")
	int rangerKitPotionsThrown = 0;

	/**
	 * Ranger Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_ranger")
	int rangerKitEggThrown = 0;

	/**
	 * Ranger Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_ranger")
	int rangerKitMobsSpawned = 0;


	/**
	 * Reaper Kit Experience
	 */
	@SerializedName("exp_reaper")
	int reaperKitExp = 0;

	/**
	 * Reaper Kit Wins
	 */
	@SerializedName("wins_reaper")
	int reaperKitWins = 0;

	/**
	 * Reaper Kit Wins Team
	 */
	@SerializedName("wins_team_reaper")
	int reaperKitWinsTeam = 0;

	/**
	 * Reaper Kit Games Played
	 */
	@SerializedName("games_played_reaper")
	int reaperKitGamesPlayed = 0;

	/**
	 * Reaper Kit Time Played
	 */
	@SerializedName("time_played_reaper")
	int reaperKitTimePlayed = 0;

	/**
	 * Reaper Kit Kills
	 */
	@SerializedName("kills_reaper")
	int reaperKitKills = 0;

	/**
	 * Reaper Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_reaper")
	int reaperKitTauntKills = 0;

	/**
	 * Reaper Kit Damage
	 */
	@SerializedName("damage_reaper")
	int reaperKitDamage = 0;

	/**
	 * Reaper Kit Damage Taken
	 */
	@SerializedName("damage_taken_reaper")
	int reaperKitDamageTaken = 0;

	/**
	 * Reaper Kit Fall Damage
	 */
	@SerializedName("fall_damage_reaper")
	int reaperKitFallDamage = 0;

	/**
	 * Reaper Kit Chests Opened
	 */
	@SerializedName("chests_opened_reaper")
	int reaperKitChestsOpened = 0;

	/**
	 * Reaper Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_reaper")
	int reaperKitItemsEnchanted = 0;

	/**
	 * Reaper Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_reaper")
	int reaperKitArrowsFired = 0;

	/**
	 * Reaper Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_reaper")
	int reaperKitArrowsHit = 0;

	/**
	 * Reaper Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_reaper")
	int reaperKitPotionsDrunk = 0;

	/**
	 * Reaper Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_reaper")
	int reaperKitPotionsThrown = 0;

	/**
	 * Reaper Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_reaper")
	int reaperKitEggThrown = 0;

	/**
	 * Reaper Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_reaper")
	int reaperKitMobsSpawned = 0;


	/**
	 * Red Dragon Kit Experience
	 */
	@SerializedName("exp_reddragon")
	int redDragonKitExp = 0;

	/**
	 * Red Dragon Kit Wins
	 */
	@SerializedName("wins_reddragon")
	int redDragonKitWins = 0;

	/**
	 * Red Dragon Kit Wins Team
	 */
	@SerializedName("wins_team_reddragon")
	int redDragonKitWinsTeam = 0;

	/**
	 * Red Dragon Kit Games Played
	 */
	@SerializedName("games_played_reddragon")
	int redDragonKitGamesPlayed = 0;

	/**
	 * Red Dragon Kit Time Played
	 */
	@SerializedName("time_played_reddragon")
	int redDragonKitTimePlayed = 0;

	/**
	 * Red Dragon Kit Kills
	 */
	@SerializedName("kills_reddragon")
	int redDragonKitKills = 0;

	/**
	 * Red Dragon Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_reddragon")
	int redDragonKitTauntKills = 0;

	/**
	 * Red Dragon Kit Damage
	 */
	@SerializedName("damage_reddragon")
	int redDragonKitDamage = 0;

	/**
	 * Red Dragon Kit Damage Taken
	 */
	@SerializedName("damage_taken_reddragon")
	int redDragonKitDamageTaken = 0;

	/**
	 * Red Dragon Kit Fall Damage
	 */
	@SerializedName("fall_damage_reddragon")
	int redDragonKitFallDamage = 0;

	/**
	 * Red Dragon Kit Chests Opened
	 */
	@SerializedName("chests_opened_reddragon")
	int redDragonKitChestsOpened = 0;

	/**
	 * Red Dragon Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_reddragon")
	int redDragonKitItemsEnchanted = 0;

	/**
	 * Red Dragon Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_reddragon")
	int redDragonKitArrowsFired = 0;

	/**
	 * Red Dragon Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_reddragon")
	int redDragonKitArrowsHit = 0;

	/**
	 * Red Dragon Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_reddragon")
	int redDragonKitPotionsDrunk = 0;

	/**
	 * Red Dragon Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_reddragon")
	int redDragonKitPotionsThrown = 0;

	/**
	 * Red Dragon Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_reddragon")
	int redDragonKitEggThrown = 0;

	/**
	 * Red Dragon Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_reddragon")
	int redDragonKitMobsSpawned = 0;


	/**
	 * Rogue Kit Experience
	 */
	@SerializedName("exp_rogue")
	int rogueKitExp = 0;

	/**
	 * Rogue Kit Wins
	 */
	@SerializedName("wins_rogue")
	int rogueKitWins = 0;

	/**
	 * Rogue Kit Wins Team
	 */
	@SerializedName("wins_team_rogue")
	int rogueKitWinsTeam = 0;

	/**
	 * Rogue Kit Games Played
	 */
	@SerializedName("games_played_rogue")
	int rogueKitGamesPlayed = 0;

	/**
	 * Rogue Kit Time Played
	 */
	@SerializedName("time_played_rogue")
	int rogueKitTimePlayed = 0;

	/**
	 * Rogue Kit Kills
	 */
	@SerializedName("kills_rogue")
	int rogueKitKills = 0;

	/**
	 * Rogue Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_rogue")
	int rogueKitTauntKills = 0;

	/**
	 * Rogue Kit Damage
	 */
	@SerializedName("damage_rogue")
	int rogueKitDamage = 0;

	/**
	 * Rogue Kit Damage Taken
	 */
	@SerializedName("damage_taken_rogue")
	int rogueKitDamageTaken = 0;

	/**
	 * Rogue Kit Fall Damage
	 */
	@SerializedName("fall_damage_rogue")
	int rogueKitFallDamage = 0;

	/**
	 * Rogue Kit Chests Opened
	 */
	@SerializedName("chests_opened_rogue")
	int rogueKitChestsOpened = 0;

	/**
	 * Rogue Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_rogue")
	int rogueKitItemsEnchanted = 0;

	/**
	 * Rogue Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_rogue")
	int rogueKitArrowsFired = 0;

	/**
	 * Rogue Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_rogue")
	int rogueKitArrowsHit = 0;

	/**
	 * Rogue Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_rogue")
	int rogueKitPotionsDrunk = 0;

	/**
	 * Rogue Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_rogue")
	int rogueKitPotionsThrown = 0;

	/**
	 * Rogue Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_rogue")
	int rogueKitEggThrown = 0;

	/**
	 * Rogue Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_rogue")
	int rogueKitMobsSpawned = 0;


	/**
	 * Scout Kit Experience
	 */
	@SerializedName("exp_scout")
	int scoutKitExp = 0;

	/**
	 * Scout Kit Wins
	 */
	@SerializedName("wins_scout")
	int scoutKitWins = 0;

	/**
	 * Scout Kit Wins Team
	 */
	@SerializedName("wins_team_scout")
	int scoutKitWinsTeam = 0;

	/**
	 * Scout Kit Games Played
	 */
	@SerializedName("games_played_scout")
	int scoutKitGamesPlayed = 0;

	/**
	 * Scout Kit Time Played
	 */
	@SerializedName("time_played_scout")
	int scoutKitTimePlayed = 0;

	/**
	 * Scout Kit Kills
	 */
	@SerializedName("kills_scout")
	int scoutKitKills = 0;

	/**
	 * Scout Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_scout")
	int scoutKitTauntKills = 0;

	/**
	 * Scout Kit Damage
	 */
	@SerializedName("damage_scout")
	int scoutKitDamage = 0;

	/**
	 * Scout Kit Damage Taken
	 */
	@SerializedName("damage_taken_scout")
	int scoutKitDamageTaken = 0;

	/**
	 * Scout Kit Fall Damage
	 */
	@SerializedName("fall_damage_scout")
	int scoutKitFallDamage = 0;

	/**
	 * Scout Kit Chests Opened
	 */
	@SerializedName("chests_opened_scout")
	int scoutKitChestsOpened = 0;

	/**
	 * Scout Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_scout")
	int scoutKitItemsEnchanted = 0;

	/**
	 * Scout Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_scout")
	int scoutKitArrowsFired = 0;

	/**
	 * Scout Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_scout")
	int scoutKitArrowsHit = 0;

	/**
	 * Scout Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_scout")
	int scoutKitPotionsDrunk = 0;

	/**
	 * Scout Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_scout")
	int scoutKitPotionsThrown = 0;

	/**
	 * Scout Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_scout")
	int scoutKitEggThrown = 0;

	/**
	 * Scout Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_scout")
	int scoutKitMobsSpawned = 0;


	/**
	 * Shadow Knight Kit Experience
	 */
	@SerializedName("exp_shadow knight")
	int shadowKnightKitExp = 0;

	/**
	 * Shadow Knight Kit Wins
	 */
	@SerializedName("wins_shadow knight")
	int shadowKnightKitWins = 0;

	/**
	 * Shadow Knight Kit Wins Team
	 */
	@SerializedName("wins_team_shadow knight")
	int shadowKnightKitWinsTeam = 0;

	/**
	 * Shadow Knight Kit Games Played
	 */
	@SerializedName("games_played_shadow knight")
	int shadowKnightKitGamesPlayed = 0;

	/**
	 * Shadow Knight Kit Time Played
	 */
	@SerializedName("time_played_shadow knight")
	int shadowKnightKitTimePlayed = 0;

	/**
	 * Shadow Knight Kit Kills
	 */
	@SerializedName("kills_shadow knight")
	int shadowKnightKitKills = 0;

	/**
	 * Shadow Knight Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_shadow knight")
	int shadowKnightKitTauntKills = 0;

	/**
	 * Shadow Knight Kit Damage
	 */
	@SerializedName("damage_shadow knight")
	int shadowKnightKitDamage = 0;

	/**
	 * Shadow Knight Kit Damage Taken
	 */
	@SerializedName("damage_taken_shadow knight")
	int shadowKnightKitDamageTaken = 0;

	/**
	 * Shadow Knight Kit Fall Damage
	 */
	@SerializedName("fall_damage_shadow knight")
	int shadowKnightKitFallDamage = 0;

	/**
	 * Shadow Knight Kit Chests Opened
	 */
	@SerializedName("chests_opened_shadow knight")
	int shadowKnightKitChestsOpened = 0;

	/**
	 * Shadow Knight Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_shadow knight")
	int shadowKnightKitItemsEnchanted = 0;

	/**
	 * Shadow Knight Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_shadow knight")
	int shadowKnightKitArrowsFired = 0;

	/**
	 * Shadow Knight Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_shadow knight")
	int shadowKnightKitArrowsHit = 0;

	/**
	 * Shadow Knight Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_shadow knight")
	int shadowKnightKitPotionsDrunk = 0;

	/**
	 * Shadow Knight Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_shadow knight")
	int shadowKnightKitPotionsThrown = 0;

	/**
	 * Shadow Knight Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_shadow knight")
	int shadowKnightKitEggThrown = 0;

	/**
	 * Shadow Knight Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_shadow knight")
	int shadowKnightKitMobsSpawned = 0;


	/**
	 * Slimey Slime Kit Experience
	 */
	@SerializedName("exp_slimeyslime")
	int slimeySlimeKitExp = 0;

	/**
	 * Slimey Slime Kit Wins
	 */
	@SerializedName("wins_slimeyslime")
	int slimeySlimeKitWins = 0;

	/**
	 * Slimey Slime Kit Wins Team
	 */
	@SerializedName("wins_team_slimeyslime")
	int slimeySlimeKitWinsTeam = 0;

	/**
	 * Slimey Slime Kit Games Played
	 */
	@SerializedName("games_played_slimeyslime")
	int slimeySlimeKitGamesPlayed = 0;

	/**
	 * Slimey Slime Kit Time Played
	 */
	@SerializedName("time_played_slimeyslime")
	int slimeySlimeKitTimePlayed = 0;

	/**
	 * Slimey Slime Kit Kills
	 */
	@SerializedName("kills_slimeyslime")
	int slimeySlimeKitKills = 0;

	/**
	 * Slimey Slime Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_slimeyslime")
	int slimeySlimeKitTauntKills = 0;

	/**
	 * Slimey Slime Kit Damage
	 */
	@SerializedName("damage_slimeyslime")
	int slimeySlimeKitDamage = 0;

	/**
	 * Slimey Slime Kit Damage Taken
	 */
	@SerializedName("damage_taken_slimeyslime")
	int slimeySlimeKitDamageTaken = 0;

	/**
	 * Slimey Slime Kit Fall Damage
	 */
	@SerializedName("fall_damage_slimeyslime")
	int slimeySlimeKitFallDamage = 0;

	/**
	 * Slimey Slime Kit Chests Opened
	 */
	@SerializedName("chests_opened_slimeyslime")
	int slimeySlimeKitChestsOpened = 0;

	/**
	 * Slimey Slime Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_slimeyslime")
	int slimeySlimeKitItemsEnchanted = 0;

	/**
	 * Slimey Slime Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_slimeyslime")
	int slimeySlimeKitArrowsFired = 0;

	/**
	 * Slimey Slime Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_slimeyslime")
	int slimeySlimeKitArrowsHit = 0;

	/**
	 * Slimey Slime Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_slimeyslime")
	int slimeySlimeKitPotionsDrunk = 0;

	/**
	 * Slimey Slime Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_slimeyslime")
	int slimeySlimeKitPotionsThrown = 0;

	/**
	 * Slimey Slime Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_slimeyslime")
	int slimeySlimeKitEggThrown = 0;

	/**
	 * Slimey Slime Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_slimeyslime")
	int slimeySlimeKitMobsSpawned = 0;


	/**
	 * Snowman Kit Experience
	 */
	@SerializedName("exp_snowman")
	int snowmanKitExp = 0;

	/**
	 * Snowman Kit Wins
	 */
	@SerializedName("wins_snowman")
	int snowmanKitWins = 0;

	/**
	 * Snowman Kit Wins Team
	 */
	@SerializedName("wins_team_snowman")
	int snowmanKitWinsTeam = 0;

	/**
	 * Snowman Kit Games Played
	 */
	@SerializedName("games_played_snowman")
	int snowmanKitGamesPlayed = 0;

	/**
	 * Snowman Kit Time Played
	 */
	@SerializedName("time_played_snowman")
	int snowmanKitTimePlayed = 0;

	/**
	 * Snowman Kit Kills
	 */
	@SerializedName("kills_snowman")
	int snowmanKitKills = 0;

	/**
	 * Snowman Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_snowman")
	int snowmanKitTauntKills = 0;

	/**
	 * Snowman Kit Damage
	 */
	@SerializedName("damage_snowman")
	int snowmanKitDamage = 0;

	/**
	 * Snowman Kit Damage Taken
	 */
	@SerializedName("damage_taken_snowman")
	int snowmanKitDamageTaken = 0;

	/**
	 * Snowman Kit Fall Damage
	 */
	@SerializedName("fall_damage_snowman")
	int snowmanKitFallDamage = 0;

	/**
	 * Snowman Kit Chests Opened
	 */
	@SerializedName("chests_opened_snowman")
	int snowmanKitChestsOpened = 0;

	/**
	 * Snowman Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_snowman")
	int snowmanKitItemsEnchanted = 0;

	/**
	 * Snowman Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_snowman")
	int snowmanKitArrowsFired = 0;

	/**
	 * Snowman Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_snowman")
	int snowmanKitArrowsHit = 0;

	/**
	 * Snowman Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_snowman")
	int snowmanKitPotionsDrunk = 0;

	/**
	 * Snowman Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_snowman")
	int snowmanKitPotionsThrown = 0;

	/**
	 * Snowman Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_snowman")
	int snowmanKitEggThrown = 0;

	/**
	 * Snowman Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_snowman")
	int snowmanKitMobsSpawned = 0;


	/**
	 * Speleologist Kit Experience
	 */
	@SerializedName("exp_speleologist")
	int speleologistKitExp = 0;

	/**
	 * Speleologist Kit Wins
	 */
	@SerializedName("wins_speleologist")
	int speleologistKitWins = 0;

	/**
	 * Speleologist Kit Wins Team
	 */
	@SerializedName("wins_team_speleologist")
	int speleologistKitWinsTeam = 0;

	/**
	 * Speleologist Kit Games Played
	 */
	@SerializedName("games_played_speleologist")
	int speleologistKitGamesPlayed = 0;

	/**
	 * Speleologist Kit Time Played
	 */
	@SerializedName("time_played_speleologist")
	int speleologistKitTimePlayed = 0;

	/**
	 * Speleologist Kit Kills
	 */
	@SerializedName("kills_speleologist")
	int speleologistKitKills = 0;

	/**
	 * Speleologist Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_speleologist")
	int speleologistKitTauntKills = 0;

	/**
	 * Speleologist Kit Damage
	 */
	@SerializedName("damage_speleologist")
	int speleologistKitDamage = 0;

	/**
	 * Speleologist Kit Damage Taken
	 */
	@SerializedName("damage_taken_speleologist")
	int speleologistKitDamageTaken = 0;

	/**
	 * Speleologist Kit Fall Damage
	 */
	@SerializedName("fall_damage_speleologist")
	int speleologistKitFallDamage = 0;

	/**
	 * Speleologist Kit Chests Opened
	 */
	@SerializedName("chests_opened_speleologist")
	int speleologistKitChestsOpened = 0;

	/**
	 * Speleologist Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_speleologist")
	int speleologistKitItemsEnchanted = 0;

	/**
	 * Speleologist Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_speleologist")
	int speleologistKitArrowsFired = 0;

	/**
	 * Speleologist Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_speleologist")
	int speleologistKitArrowsHit = 0;

	/**
	 * Speleologist Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_speleologist")
	int speleologistKitPotionsDrunk = 0;

	/**
	 * Speleologist Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_speleologist")
	int speleologistKitPotionsThrown = 0;

	/**
	 * Speleologist Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_speleologist")
	int speleologistKitEggThrown = 0;

	/**
	 * Speleologist Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_speleologist")
	int speleologistKitMobsSpawned = 0;


	/**
	 * Tim Kit Experience
	 */
	@SerializedName("exp_tim")
	int timKitExp = 0;

	/**
	 * Tim Kit Wins
	 */
	@SerializedName("wins_tim")
	int timKitWins = 0;

	/**
	 * Tim Kit Wins Team
	 */
	@SerializedName("wins_team_tim")
	int timKitWinsTeam = 0;

	/**
	 * Tim Kit Games Played
	 */
	@SerializedName("games_played_tim")
	int timKitGamesPlayed = 0;

	/**
	 * Tim Kit Time Played
	 */
	@SerializedName("time_played_tim")
	int timKitTimePlayed = 0;

	/**
	 * Tim Kit Kills
	 */
	@SerializedName("kills_tim")
	int timKitKills = 0;

	/**
	 * Tim Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_tim")
	int timKitTauntKills = 0;

	/**
	 * Tim Kit Damage
	 */
	@SerializedName("damage_tim")
	int timKitDamage = 0;

	/**
	 * Tim Kit Damage Taken
	 */
	@SerializedName("damage_taken_tim")
	int timKitDamageTaken = 0;

	/**
	 * Tim Kit Fall Damage
	 */
	@SerializedName("fall_damage_tim")
	int timKitFallDamage = 0;

	/**
	 * Tim Kit Chests Opened
	 */
	@SerializedName("chests_opened_tim")
	int timKitChestsOpened = 0;

	/**
	 * Tim Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_tim")
	int timKitItemsEnchanted = 0;

	/**
	 * Tim Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_tim")
	int timKitArrowsFired = 0;

	/**
	 * Tim Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_tim")
	int timKitArrowsHit = 0;

	/**
	 * Tim Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_tim")
	int timKitPotionsDrunk = 0;

	/**
	 * Tim Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_tim")
	int timKitPotionsThrown = 0;

	/**
	 * Tim Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_tim")
	int timKitEggThrown = 0;

	/**
	 * Tim Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_tim")
	int timKitMobsSpawned = 0;


	/**
	 * Toxicologist Kit Experience
	 */
	@SerializedName("exp_toxicologist")
	int toxicologistKitExp = 0;

	/**
	 * Toxicologist Kit Wins
	 */
	@SerializedName("wins_toxicologist")
	int toxicologistKitWins = 0;

	/**
	 * Toxicologist Kit Wins Team
	 */
	@SerializedName("wins_team_toxicologist")
	int toxicologistKitWinsTeam = 0;

	/**
	 * Toxicologist Kit Games Played
	 */
	@SerializedName("games_played_toxicologist")
	int toxicologistKitGamesPlayed = 0;

	/**
	 * Toxicologist Kit Time Played
	 */
	@SerializedName("time_played_toxicologist")
	int toxicologistKitTimePlayed = 0;

	/**
	 * Toxicologist Kit Kills
	 */
	@SerializedName("kills_toxicologist")
	int toxicologistKitKills = 0;

	/**
	 * Toxicologist Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_toxicologist")
	int toxicologistKitTauntKills = 0;

	/**
	 * Toxicologist Kit Damage
	 */
	@SerializedName("damage_toxicologist")
	int toxicologistKitDamage = 0;

	/**
	 * Toxicologist Kit Damage Taken
	 */
	@SerializedName("damage_taken_toxicologist")
	int toxicologistKitDamageTaken = 0;

	/**
	 * Toxicologist Kit Fall Damage
	 */
	@SerializedName("fall_damage_toxicologist")
	int toxicologistKitFallDamage = 0;

	/**
	 * Toxicologist Kit Chests Opened
	 */
	@SerializedName("chests_opened_toxicologist")
	int toxicologistKitChestsOpened = 0;

	/**
	 * Toxicologist Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_toxicologist")
	int toxicologistKitItemsEnchanted = 0;

	/**
	 * Toxicologist Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_toxicologist")
	int toxicologistKitArrowsFired = 0;

	/**
	 * Toxicologist Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_toxicologist")
	int toxicologistKitArrowsHit = 0;

	/**
	 * Toxicologist Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_toxicologist")
	int toxicologistKitPotionsDrunk = 0;

	/**
	 * Toxicologist Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_toxicologist")
	int toxicologistKitPotionsThrown = 0;

	/**
	 * Toxicologist Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_toxicologist")
	int toxicologistKitEggThrown = 0;

	/**
	 * Toxicologist Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_toxicologist")
	int toxicologistKitMobsSpawned = 0;


	/**
	 * Troll Kit Experience
	 */
	@SerializedName("exp_troll")
	int trollKitExp = 0;

	/**
	 * Troll Kit Wins
	 */
	@SerializedName("wins_troll")
	int trollKitWins = 0;

	/**
	 * Troll Kit Wins Team
	 */
	@SerializedName("wins_team_troll")
	int trollKitWinsTeam = 0;

	/**
	 * Troll Kit Games Played
	 */
	@SerializedName("games_played_troll")
	int trollKitGamesPlayed = 0;

	/**
	 * Troll Kit Time Played
	 */
	@SerializedName("time_played_troll")
	int trollKitTimePlayed = 0;

	/**
	 * Troll Kit Kills
	 */
	@SerializedName("kills_troll")
	int trollKitKills = 0;

	/**
	 * Troll Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_troll")
	int trollKitTauntKills = 0;

	/**
	 * Troll Kit Damage
	 */
	@SerializedName("damage_troll")
	int trollKitDamage = 0;

	/**
	 * Troll Kit Damage Taken
	 */
	@SerializedName("damage_taken_troll")
	int trollKitDamageTaken = 0;

	/**
	 * Troll Kit Fall Damage
	 */
	@SerializedName("fall_damage_troll")
	int trollKitFallDamage = 0;

	/**
	 * Troll Kit Chests Opened
	 */
	@SerializedName("chests_opened_troll")
	int trollKitChestsOpened = 0;

	/**
	 * Troll Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_troll")
	int trollKitItemsEnchanted = 0;

	/**
	 * Troll Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_troll")
	int trollKitArrowsFired = 0;

	/**
	 * Troll Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_troll")
	int trollKitArrowsHit = 0;

	/**
	 * Troll Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_troll")
	int trollKitPotionsDrunk = 0;

	/**
	 * Troll Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_troll")
	int trollKitPotionsThrown = 0;

	/**
	 * Troll Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_troll")
	int trollKitEggThrown = 0;

	/**
	 * Troll Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_troll")
	int trollKitMobsSpawned = 0;


	/**
	 * Viking Kit Experience
	 */
	@SerializedName("exp_viking")
	int vikingKitExp = 0;

	/**
	 * Viking Kit Wins
	 */
	@SerializedName("wins_viking")
	int vikingKitWins = 0;

	/**
	 * Viking Kit Wins Team
	 */
	@SerializedName("wins_team_viking")
	int vikingKitWinsTeam = 0;

	/**
	 * Viking Kit Games Played
	 */
	@SerializedName("games_played_viking")
	int vikingKitGamesPlayed = 0;

	/**
	 * Viking Kit Time Played
	 */
	@SerializedName("time_played_viking")
	int vikingKitTimePlayed = 0;

	/**
	 * Viking Kit Kills
	 */
	@SerializedName("kills_viking")
	int vikingKitKills = 0;

	/**
	 * Viking Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_viking")
	int vikingKitTauntKills = 0;

	/**
	 * Viking Kit Damage
	 */
	@SerializedName("damage_viking")
	int vikingKitDamage = 0;

	/**
	 * Viking Kit Damage Taken
	 */
	@SerializedName("damage_taken_viking")
	int vikingKitDamageTaken = 0;

	/**
	 * Viking Kit Fall Damage
	 */
	@SerializedName("fall_damage_viking")
	int vikingKitFallDamage = 0;

	/**
	 * Viking Kit Chests Opened
	 */
	@SerializedName("chests_opened_viking")
	int vikingKitChestsOpened = 0;

	/**
	 * Viking Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_viking")
	int vikingKitItemsEnchanted = 0;

	/**
	 * Viking Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_viking")
	int vikingKitArrowsFired = 0;

	/**
	 * Viking Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_viking")
	int vikingKitArrowsHit = 0;

	/**
	 * Viking Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_viking")
	int vikingKitPotionsDrunk = 0;

	/**
	 * Viking Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_viking")
	int vikingKitPotionsThrown = 0;

	/**
	 * Viking Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_viking")
	int vikingKitEggThrown = 0;

	/**
	 * Viking Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_viking")
	int vikingKitMobsSpawned = 0;


	/**
	 * Warlock Kit Experience
	 */
	@SerializedName("exp_warlock")
	int warlockKitExp = 0;

	/**
	 * Warlock Kit Wins
	 */
	@SerializedName("wins_warlock")
	int warlockKitWins = 0;

	/**
	 * Warlock Kit Wins Team
	 */
	@SerializedName("wins_team_warlock")
	int warlockKitWinsTeam = 0;

	/**
	 * Warlock Kit Games Played
	 */
	@SerializedName("games_played_warlock")
	int warlockKitGamesPlayed = 0;

	/**
	 * Warlock Kit Time Played
	 */
	@SerializedName("time_played_warlock")
	int warlockKitTimePlayed = 0;

	/**
	 * Warlock Kit Kills
	 */
	@SerializedName("kills_warlock")
	int warlockKitKills = 0;

	/**
	 * Warlock Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_warlock")
	int warlockKitTauntKills = 0;

	/**
	 * Warlock Kit Damage
	 */
	@SerializedName("damage_warlock")
	int warlockKitDamage = 0;

	/**
	 * Warlock Kit Damage Taken
	 */
	@SerializedName("damage_taken_warlock")
	int warlockKitDamageTaken = 0;

	/**
	 * Warlock Kit Fall Damage
	 */
	@SerializedName("fall_damage_warlock")
	int warlockKitFallDamage = 0;

	/**
	 * Warlock Kit Chests Opened
	 */
	@SerializedName("chests_opened_warlock")
	int warlockKitChestsOpened = 0;

	/**
	 * Warlock Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_warlock")
	int warlockKitItemsEnchanted = 0;

	/**
	 * Warlock Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_warlock")
	int warlockKitArrowsFired = 0;

	/**
	 * Warlock Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_warlock")
	int warlockKitArrowsHit = 0;

	/**
	 * Warlock Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_warlock")
	int warlockKitPotionsDrunk = 0;

	/**
	 * Warlock Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_warlock")
	int warlockKitPotionsThrown = 0;

	/**
	 * Warlock Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_warlock")
	int warlockKitEggThrown = 0;

	/**
	 * Warlock Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_warlock")
	int warlockKitMobsSpawned = 0;


	/**
	 * Warrior Kit Experience
	 */
	@SerializedName("exp_warrior")
	int warriorKitExp = 0;

	/**
	 * Warrior Kit Wins
	 */
	@SerializedName("wins_warrior")
	int warriorKitWins = 0;

	/**
	 * Warrior Kit Wins Team
	 */
	@SerializedName("wins_team_warrior")
	int warriorKitWinsTeam = 0;

	/**
	 * Warrior Kit Games Played
	 */
	@SerializedName("games_played_warrior")
	int warriorKitGamesPlayed = 0;

	/**
	 * Warrior Kit Time Played
	 */
	@SerializedName("time_played_warrior")
	int warriorKitTimePlayed = 0;

	/**
	 * Warrior Kit Kills
	 */
	@SerializedName("kills_warrior")
	int warriorKitKills = 0;

	/**
	 * Warrior Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_warrior")
	int warriorKitTauntKills = 0;

	/**
	 * Warrior Kit Damage
	 */
	@SerializedName("damage_warrior")
	int warriorKitDamage = 0;

	/**
	 * Warrior Kit Damage Taken
	 */
	@SerializedName("damage_taken_warrior")
	int warriorKitDamageTaken = 0;

	/**
	 * Warrior Kit Fall Damage
	 */
	@SerializedName("fall_damage_warrior")
	int warriorKitFallDamage = 0;

	/**
	 * Warrior Kit Chests Opened
	 */
	@SerializedName("chests_opened_warrior")
	int warriorKitChestsOpened = 0;

	/**
	 * Warrior Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_warrior")
	int warriorKitItemsEnchanted = 0;

	/**
	 * Warrior Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_warrior")
	int warriorKitArrowsFired = 0;

	/**
	 * Warrior Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_warrior")
	int warriorKitArrowsHit = 0;

	/**
	 * Warrior Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_warrior")
	int warriorKitPotionsDrunk = 0;

	/**
	 * Warrior Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_warrior")
	int warriorKitPotionsThrown = 0;

	/**
	 * Warrior Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_warrior")
	int warriorKitEggThrown = 0;

	/**
	 * Warrior Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_warrior")
	int warriorKitMobsSpawned = 0;


	/**
	 * Wolf Tamer Kit Experience
	 */
	@SerializedName("exp_wolftamer")
	int wolfTamerKitExp = 0;

	/**
	 * Wolf Tamer Kit Wins
	 */
	@SerializedName("wins_wolftamer")
	int wolfTamerKitWins = 0;

	/**
	 * Wolf Tamer Kit Wins Team
	 */
	@SerializedName("wins_team_wolftamer")
	int wolfTamerKitWinsTeam = 0;

	/**
	 * Wolf Tamer Kit Games Played
	 */
	@SerializedName("games_played_wolftamer")
	int wolfTamerKitGamesPlayed = 0;

	/**
	 * Wolf Tamer Kit Time Played
	 */
	@SerializedName("time_played_wolftamer")
	int wolfTamerKitTimePlayed = 0;

	/**
	 * Wolf Tamer Kit Kills
	 */
	@SerializedName("kills_wolftamer")
	int wolfTamerKitKills = 0;

	/**
	 * Wolf Tamer Kit Taunt Kills
	 */
	@SerializedName("taunt_kills_wolftamer")
	int wolfTamerKitTauntKills = 0;

	/**
	 * Wolf Tamer Kit Damage
	 */
	@SerializedName("damage_wolftamer")
	int wolfTamerKitDamage = 0;

	/**
	 * Wolf Tamer Kit Damage Taken
	 */
	@SerializedName("damage_taken_wolftamer")
	int wolfTamerKitDamageTaken = 0;

	/**
	 * Wolf Tamer Kit Fall Damage
	 */
	@SerializedName("fall_damage_wolftamer")
	int wolfTamerKitFallDamage = 0;

	/**
	 * Wolf Tamer Kit Chests Opened
	 */
	@SerializedName("chests_opened_wolftamer")
	int wolfTamerKitChestsOpened = 0;

	/**
	 * Wolf Tamer Kit Items Enchanted
	 */
	@SerializedName("items_enchanted_wolftamer")
	int wolfTamerKitItemsEnchanted = 0;

	/**
	 * Wolf Tamer Kit Arrows Fired
	 */
	@SerializedName("arrows_fired_wolftamer")
	int wolfTamerKitArrowsFired = 0;

	/**
	 * Wolf Tamer Kit Arrows Hit
	 */
	@SerializedName("arrows_hit_wolftamer")
	int wolfTamerKitArrowsHit = 0;

	/**
	 * Wolf Tamer Kit Potions Drunk
	 */
	@SerializedName("potions_drunk_wolftamer")
	int wolfTamerKitPotionsDrunk = 0;

	/**
	 * Wolf Tamer Kit Potions Thrown
	 */
	@SerializedName("potions_thrown_wolftamer")
	int wolfTamerKitPotionsThrown = 0;

	/**
	 * Wolf Tamer Kit Egg Thrown
	 */
	@SerializedName("egg_thrown_wolftamer")
	int wolfTamerKitEggThrown = 0;

	/**
	 * Wolf Tamer Kit Mobs Spawned
	 */
	@SerializedName("mobs_spawned_wolftamer")
	int wolfTamerKitMobsSpawned = 0;


	/**
	 * Get Hunger Games Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Hunger Games Taunt of the Player
	 *
	 * @return Taunt
	 */
	public String getTaunt() {
		return taunt;
	}

	/**
	 * Get Hunger Games Victory Dance of the Player
	 *
	 * @return Victory Dance
	 */
	public String getVictoryDance() {
		return victoryDance;
	}

	/**
	 * Get Hunger Games Deaths of the Player
	 *
	 * @return Deaths
	 */
	public int getDeaths() {
		return deaths;
	}

	/**
	 * Get Hunger Games Kills of the Player
	 *
	 * @return Kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * Get Unlocked Packages (Cosmetics) of the Player
	 *
	 * @return List of All Hunger Games Unlocked Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Hunger Games Wins of the Player
	 *
	 * @return Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Hunger Games Team Wins of the Player
	 *
	 * @return Team Wins
	 */
	public int getTeamWins() {
		return teamWins;
	}

	/**
	 * Get Current Hunger Games Default Kit of the Player
	 *
	 * @return Current Default Kit
	 */
	public String getDefaultKit() {
		return defaultKit;
	}

	/**
	 * Get Current Hunger Games Finisher of the Player
	 *
	 * @return Current Finisher
	 */
	public String getFinisher() {
		return finisher;
	}

	/**
	 * Get Combat Tracker Status (On or Off) of the Player
	 *
	 * @return Combat Tracker Status
	 */
	public boolean isCombatTracker() {
		return combatTracker;
	}

	/**
	 * Get Auto Armor Status (On or Off) of the Player
	 *
	 * @return Auto Armor Status
	 */
	public boolean isAutoArmor() {
		return autoArmor;
	}

	/**
	 * Get Taunt Kills of the Player
	 *
	 * @return Taunt Kills
	 */
	public int getTauntKills() {
		return tauntKills;
	}

	/**
	 * Get Potions Drunk by the Player
	 *
	 * @return Potions Drunk
	 */
	public int getPotionDrunk() {
		return potionDrunk;
	}

	/**
	 * Get Damage of the Player
	 *
	 * @return Damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * Get Mobs Spawned by the Player
	 *
	 * @return Mobs Spawned
	 */
	public int getMobsSpawned() {
		return mobsSpawned;
	}

	/**
	 * Get Time Played of the Player (in Minutes)
	 *
	 * @return Time Played
	 */
	public int getTimePlayed() {
		return timePlayed;
	}

	/**
	 * Get Opened Chests by the Player
	 *
	 * @return Opened Chests
	 */
	public int getChestsOpened() {
		return chestsOpened;
	}

	/**
	 * Get Arrows Hit by the Player
	 *
	 * @return Arrows Hit
	 */
	public int getArrowsHit() {
		return arrowsHit;
	}

	/**
	 * Get Damage Taken by the Player
	 *
	 * @return Damage Taken
	 */
	public int getDamageTaken() {
		return damageTaken;
	}

	/**
	 * Get Games Played by the Player
	 *
	 * @return Games Played
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	/**
	 * Get Potions Thrown by the player
	 *
	 * @return Potions Thrown
	 */
	public int getPotionThrown() {
		return potionThrown;
	}

	/**
	 * Get Arrows Fired by the Player
	 *
	 * @return Arrows Fired
	 */
	public int getArrowsFired() {
		return arrowsFired;
	}

	/**
	 * Get Blitz Star Uses by th Player
	 *
	 * @return Blitz Star Uses
	 */
	public int getBlitzStarUses() {
		return blitzStarUses;
	}

	/**
	 * Get Solo Normal Mode Wins of the Player
	 *
	 * @return Solo Normal Wins
	 */
	public int getSoloNormalWins() {
		return soloNormalWins;
	}

	/**
	 * Get Team Normal Mode Wins of the Player
	 *
	 * @return Team Normal Wins
	 */
	public int getTeamNormalWins() {
		return teamNormalWins;
	}

	/**
	 * Get Hunger Games Solo Normal Mode Kills of the Player
	 *
	 * @return Solo Normal Kills
	 */
	public int getSoloNormalKills() {
		return soloNormalKills;
	}

	/**
	 * Get Hunger Games Chaos Mode Wins of the Player
	 *
	 * @return Solo Chaos Wins
	 */
	public int getSoloChaosWins() {
		return soloChaosWins;
	}

	/**
	 * Get Hunger Games Solo Chaos Mode Kills of the Player
	 *
	 * @return Solo Chaos Kills
	 */
	public int getSoloChaosKills() {
		return soloChaosKills;
	}


	/**
	 * Get Arachnologist Kit Experience
	 *
	 * @return Arachnologist Exp
	 */
	public int getArachnologistKitExp() {
		return arachnologistKitExp;
	}

	/**
	 * Get Arachnologist Kit Wins
	 *
	 * @return Arachnologist Wins
	 */
	public int getArachnologistKitWins() {
		return arachnologistKitWins;
	}

	/**
	 * Get Arachnologist Kit Wins Team
	 *
	 * @return Arachnologist Wins Team
	 */
	public int getArachnologistKitWinsTeam() {
		return arachnologistKitWinsTeam;
	}

	/**
	 * Get Arachnologist Kit Games Played
	 *
	 * @return Arachnologist Games Played
	 */
	public int getArachnologistKitGamesPlayed() {
		return arachnologistKitGamesPlayed;
	}

	/**
	 * Get Arachnologist Kit Time played
	 *
	 * @return Arachnologist Time Played
	 */
	public int getArachnologistKitTimePlayed() {
		return arachnologistKitTimePlayed;
	}

	/**
	 * Get Arachnologist Kit Kills
	 *
	 * @return Arachnologist Kills
	 */
	public int getArachnologistKitKills() {
		return arachnologistKitKills;
	}

	/**
	 * Get Arachnologist Kit Taunt Kills
	 *
	 * @return Arachnologist Taunt Kills
	 */
	public int getArachnologistKitTauntKills() {
		return arachnologistKitTauntKills;
	}

	/**
	 * Get Arachnologist Kit Damage
	 *
	 * @return Arachnologist Damage
	 */
	public int getArachnologistKitDamage() {
		return arachnologistKitDamage;
	}

	/**
	 * Get Arachnologist Kit Damage Taken
	 *
	 * @return Arachnologist Damage Taken
	 */
	public int getArachnologistKitDamageTaken() {
		return arachnologistKitDamageTaken;
	}

	/**
	 * Get Arachnologist Kit Fall Damage
	 *
	 * @return Arachnologist Fall Damage
	 */
	public int getArachnologistKitFallDamage() {
		return arachnologistKitFallDamage;
	}

	/**
	 * Get Arachnologist Kit Chests Opened
	 *
	 * @return Arachnologist Chests Opened
	 */
	public int getArachnologistKitChestsOpened() {
		return arachnologistKitChestsOpened;
	}

	/**
	 * Get Arachnologist Kit Items Enchanted
	 *
	 * @return Arachnologist Items Enchanted
	 */
	public int getArachnologistKitItemsEnchanted() {
		return arachnologistKitItemsEnchanted;
	}

	/**
	 * Get Arachnologist Kit Arrows Fired
	 *
	 * @return Arachnologist Arrows Fired
	 */
	public int getArachnologistKitArrowsFired() {
		return arachnologistKitArrowsFired;
	}

	/**
	 * Get Arachnologist Kit Arrows Hit
	 *
	 * @return Arachnologist Arrows Hit
	 */
	public int getArachnologistKitArrowsHit() {
		return arachnologistKitArrowsHit;
	}

	/**
	 * Get Arachnologist Kit Potions Drunk
	 *
	 * @return Arachnologist Potions Drunk
	 */
	public int getArachnologistKitPotionsDrunk() {
		return arachnologistKitPotionsDrunk;
	}

	/**
	 * Get Arachnologist Kit Potion Thrown
	 *
	 * @return Arachnologist Potions Thrown
	 */
	public int getArachnologistKitPotionsThrown() {
		return arachnologistKitPotionsThrown;
	}

	/**
	 * Get Arachnologist Kit Egg Thrown
	 *
	 * @return Arachnologist Egg Thrown
	 */
	public int getArachnologistKitEggThrown() {
		return arachnologistKitEggThrown;
	}

	/**
	 * Get Arachnologist Kit Mobs Spawned
	 *
	 * @return Arachnologist Mobs Spawned
	 */
	public int getArachnologistKitMobsSpawned() {
		return arachnologistKitMobsSpawned;
	}


	/**
	 * Get Archer Kit Experience
	 *
	 * @return Archer Exp
	 */
	public int getArcherKitExp() {
		return archerKitExp;
	}

	/**
	 * Get Archer Kit Wins
	 *
	 * @return Archer Wins
	 */
	public int getArcherKitWins() {
		return archerKitWins;
	}

	/**
	 * Get Archer Kit Wins Team
	 *
	 * @return Archer Wins Team
	 */
	public int getArcherKitWinsTeam() {
		return archerKitWinsTeam;
	}

	/**
	 * Get Archer Kit Games Played
	 *
	 * @return Archer Games Played
	 */
	public int getArcherKitGamesPlayed() {
		return archerKitGamesPlayed;
	}

	/**
	 * Get Archer Kit Time played
	 *
	 * @return Archer Time Played
	 */
	public int getArcherKitTimePlayed() {
		return archerKitTimePlayed;
	}

	/**
	 * Get Archer Kit Kills
	 *
	 * @return Archer Kills
	 */
	public int getArcherKitKills() {
		return archerKitKills;
	}

	/**
	 * Get Archer Kit Taunt Kills
	 *
	 * @return Archer Taunt Kills
	 */
	public int getArcherKitTauntKills() {
		return archerKitTauntKills;
	}

	/**
	 * Get Archer Kit Damage
	 *
	 * @return Archer Damage
	 */
	public int getArcherKitDamage() {
		return archerKitDamage;
	}

	/**
	 * Get Archer Kit Damage Taken
	 *
	 * @return Archer Damage Taken
	 */
	public int getArcherKitDamageTaken() {
		return archerKitDamageTaken;
	}

	/**
	 * Get Archer Kit Fall Damage
	 *
	 * @return Archer Fall Damage
	 */
	public int getArcherKitFallDamage() {
		return archerKitFallDamage;
	}

	/**
	 * Get Archer Kit Chests Opened
	 *
	 * @return Archer Chests Opened
	 */
	public int getArcherKitChestsOpened() {
		return archerKitChestsOpened;
	}

	/**
	 * Get Archer Kit Items Enchanted
	 *
	 * @return Archer Items Enchanted
	 */
	public int getArcherKitItemsEnchanted() {
		return archerKitItemsEnchanted;
	}

	/**
	 * Get Archer Kit Arrows Fired
	 *
	 * @return Archer Arrows Fired
	 */
	public int getArcherKitArrowsFired() {
		return archerKitArrowsFired;
	}

	/**
	 * Get Archer Kit Arrows Hit
	 *
	 * @return Archer Arrows Hit
	 */
	public int getArcherKitArrowsHit() {
		return archerKitArrowsHit;
	}

	/**
	 * Get Archer Kit Potions Drunk
	 *
	 * @return Archer Potions Drunk
	 */
	public int getArcherKitPotionsDrunk() {
		return archerKitPotionsDrunk;
	}

	/**
	 * Get Archer Kit Potion Thrown
	 *
	 * @return Archer Potions Thrown
	 */
	public int getArcherKitPotionsThrown() {
		return archerKitPotionsThrown;
	}

	/**
	 * Get Archer Kit Egg Thrown
	 *
	 * @return Archer Egg Thrown
	 */
	public int getArcherKitEggThrown() {
		return archerKitEggThrown;
	}

	/**
	 * Get Archer Kit Mobs Spawned
	 *
	 * @return Archer Mobs Spawned
	 */
	public int getArcherKitMobsSpawned() {
		return archerKitMobsSpawned;
	}


	/**
	 * Get Armorer Kit Experience
	 *
	 * @return Armorer Exp
	 */
	public int getArmorerKitExp() {
		return armorerKitExp;
	}

	/**
	 * Get Armorer Kit Wins
	 *
	 * @return Armorer Wins
	 */
	public int getArmorerKitWins() {
		return armorerKitWins;
	}

	/**
	 * Get Armorer Kit Wins Team
	 *
	 * @return Armorer Wins Team
	 */
	public int getArmorerKitWinsTeam() {
		return armorerKitWinsTeam;
	}

	/**
	 * Get Armorer Kit Games Played
	 *
	 * @return Armorer Games Played
	 */
	public int getArmorerKitGamesPlayed() {
		return armorerKitGamesPlayed;
	}

	/**
	 * Get Armorer Kit Time played
	 *
	 * @return Armorer Time Played
	 */
	public int getArmorerKitTimePlayed() {
		return armorerKitTimePlayed;
	}

	/**
	 * Get Armorer Kit Kills
	 *
	 * @return Armorer Kills
	 */
	public int getArmorerKitKills() {
		return armorerKitKills;
	}

	/**
	 * Get Armorer Kit Taunt Kills
	 *
	 * @return Armorer Taunt Kills
	 */
	public int getArmorerKitTauntKills() {
		return armorerKitTauntKills;
	}

	/**
	 * Get Armorer Kit Damage
	 *
	 * @return Armorer Damage
	 */
	public int getArmorerKitDamage() {
		return armorerKitDamage;
	}

	/**
	 * Get Armorer Kit Damage Taken
	 *
	 * @return Armorer Damage Taken
	 */
	public int getArmorerKitDamageTaken() {
		return armorerKitDamageTaken;
	}

	/**
	 * Get Armorer Kit Fall Damage
	 *
	 * @return Armorer Fall Damage
	 */
	public int getArmorerKitFallDamage() {
		return armorerKitFallDamage;
	}

	/**
	 * Get Armorer Kit Chests Opened
	 *
	 * @return Armorer Chests Opened
	 */
	public int getArmorerKitChestsOpened() {
		return armorerKitChestsOpened;
	}

	/**
	 * Get Armorer Kit Items Enchanted
	 *
	 * @return Armorer Items Enchanted
	 */
	public int getArmorerKitItemsEnchanted() {
		return armorerKitItemsEnchanted;
	}

	/**
	 * Get Armorer Kit Arrows Fired
	 *
	 * @return Armorer Arrows Fired
	 */
	public int getArmorerKitArrowsFired() {
		return armorerKitArrowsFired;
	}

	/**
	 * Get Armorer Kit Arrows Hit
	 *
	 * @return Armorer Arrows Hit
	 */
	public int getArmorerKitArrowsHit() {
		return armorerKitArrowsHit;
	}

	/**
	 * Get Armorer Kit Potions Drunk
	 *
	 * @return Armorer Potions Drunk
	 */
	public int getArmorerKitPotionsDrunk() {
		return armorerKitPotionsDrunk;
	}

	/**
	 * Get Armorer Kit Potion Thrown
	 *
	 * @return Armorer Potions Thrown
	 */
	public int getArmorerKitPotionsThrown() {
		return armorerKitPotionsThrown;
	}

	/**
	 * Get Armorer Kit Egg Thrown
	 *
	 * @return Armorer Egg Thrown
	 */
	public int getArmorerKitEggThrown() {
		return armorerKitEggThrown;
	}

	/**
	 * Get Armorer Kit Mobs Spawned
	 *
	 * @return Armorer Mobs Spawned
	 */
	public int getArmorerKitMobsSpawned() {
		return armorerKitMobsSpawned;
	}


	/**
	 * Get Astronaut Kit Experience
	 *
	 * @return Astronaut Exp
	 */
	public int getAstronautKitExp() {
		return astronautKitExp;
	}

	/**
	 * Get Astronaut Kit Wins
	 *
	 * @return Astronaut Wins
	 */
	public int getAstronautKitWins() {
		return astronautKitWins;
	}

	/**
	 * Get Astronaut Kit Wins Team
	 *
	 * @return Astronaut Wins Team
	 */
	public int getAstronautKitWinsTeam() {
		return astronautKitWinsTeam;
	}

	/**
	 * Get Astronaut Kit Games Played
	 *
	 * @return Astronaut Games Played
	 */
	public int getAstronautKitGamesPlayed() {
		return astronautKitGamesPlayed;
	}

	/**
	 * Get Astronaut Kit Time played
	 *
	 * @return Astronaut Time Played
	 */
	public int getAstronautKitTimePlayed() {
		return astronautKitTimePlayed;
	}

	/**
	 * Get Astronaut Kit Kills
	 *
	 * @return Astronaut Kills
	 */
	public int getAstronautKitKills() {
		return astronautKitKills;
	}

	/**
	 * Get Astronaut Kit Taunt Kills
	 *
	 * @return Astronaut Taunt Kills
	 */
	public int getAstronautKitTauntKills() {
		return astronautKitTauntKills;
	}

	/**
	 * Get Astronaut Kit Damage
	 *
	 * @return Astronaut Damage
	 */
	public int getAstronautKitDamage() {
		return astronautKitDamage;
	}

	/**
	 * Get Astronaut Kit Damage Taken
	 *
	 * @return Astronaut Damage Taken
	 */
	public int getAstronautKitDamageTaken() {
		return astronautKitDamageTaken;
	}

	/**
	 * Get Astronaut Kit Fall Damage
	 *
	 * @return Astronaut Fall Damage
	 */
	public int getAstronautKitFallDamage() {
		return astronautKitFallDamage;
	}

	/**
	 * Get Astronaut Kit Chests Opened
	 *
	 * @return Astronaut Chests Opened
	 */
	public int getAstronautKitChestsOpened() {
		return astronautKitChestsOpened;
	}

	/**
	 * Get Astronaut Kit Items Enchanted
	 *
	 * @return Astronaut Items Enchanted
	 */
	public int getAstronautKitItemsEnchanted() {
		return astronautKitItemsEnchanted;
	}

	/**
	 * Get Astronaut Kit Arrows Fired
	 *
	 * @return Astronaut Arrows Fired
	 */
	public int getAstronautKitArrowsFired() {
		return astronautKitArrowsFired;
	}

	/**
	 * Get Astronaut Kit Arrows Hit
	 *
	 * @return Astronaut Arrows Hit
	 */
	public int getAstronautKitArrowsHit() {
		return astronautKitArrowsHit;
	}

	/**
	 * Get Astronaut Kit Potions Drunk
	 *
	 * @return Astronaut Potions Drunk
	 */
	public int getAstronautKitPotionsDrunk() {
		return astronautKitPotionsDrunk;
	}

	/**
	 * Get Astronaut Kit Potion Thrown
	 *
	 * @return Astronaut Potions Thrown
	 */
	public int getAstronautKitPotionsThrown() {
		return astronautKitPotionsThrown;
	}

	/**
	 * Get Astronaut Kit Egg Thrown
	 *
	 * @return Astronaut Egg Thrown
	 */
	public int getAstronautKitEggThrown() {
		return astronautKitEggThrown;
	}

	/**
	 * Get Astronaut Kit Mobs Spawned
	 *
	 * @return Astronaut Mobs Spawned
	 */
	public int getAstronautKitMobsSpawned() {
		return astronautKitMobsSpawned;
	}


	/**
	 * Get Baker Kit Experience
	 *
	 * @return Baker Exp
	 */
	public int getBakerKitExp() {
		return bakerKitExp;
	}

	/**
	 * Get Baker Kit Wins
	 *
	 * @return Baker Wins
	 */
	public int getBakerKitWins() {
		return bakerKitWins;
	}

	/**
	 * Get Baker Kit Wins Team
	 *
	 * @return Baker Wins Team
	 */
	public int getBakerKitWinsTeam() {
		return bakerKitWinsTeam;
	}

	/**
	 * Get Baker Kit Games Played
	 *
	 * @return Baker Games Played
	 */
	public int getBakerKitGamesPlayed() {
		return bakerKitGamesPlayed;
	}

	/**
	 * Get Baker Kit Time played
	 *
	 * @return Baker Time Played
	 */
	public int getBakerKitTimePlayed() {
		return bakerKitTimePlayed;
	}

	/**
	 * Get Baker Kit Kills
	 *
	 * @return Baker Kills
	 */
	public int getBakerKitKills() {
		return bakerKitKills;
	}

	/**
	 * Get Baker Kit Taunt Kills
	 *
	 * @return Baker Taunt Kills
	 */
	public int getBakerKitTauntKills() {
		return bakerKitTauntKills;
	}

	/**
	 * Get Baker Kit Damage
	 *
	 * @return Baker Damage
	 */
	public int getBakerKitDamage() {
		return bakerKitDamage;
	}

	/**
	 * Get Baker Kit Damage Taken
	 *
	 * @return Baker Damage Taken
	 */
	public int getBakerKitDamageTaken() {
		return bakerKitDamageTaken;
	}

	/**
	 * Get Baker Kit Fall Damage
	 *
	 * @return Baker Fall Damage
	 */
	public int getBakerKitFallDamage() {
		return bakerKitFallDamage;
	}

	/**
	 * Get Baker Kit Chests Opened
	 *
	 * @return Baker Chests Opened
	 */
	public int getBakerKitChestsOpened() {
		return bakerKitChestsOpened;
	}

	/**
	 * Get Baker Kit Items Enchanted
	 *
	 * @return Baker Items Enchanted
	 */
	public int getBakerKitItemsEnchanted() {
		return bakerKitItemsEnchanted;
	}

	/**
	 * Get Baker Kit Arrows Fired
	 *
	 * @return Baker Arrows Fired
	 */
	public int getBakerKitArrowsFired() {
		return bakerKitArrowsFired;
	}

	/**
	 * Get Baker Kit Arrows Hit
	 *
	 * @return Baker Arrows Hit
	 */
	public int getBakerKitArrowsHit() {
		return bakerKitArrowsHit;
	}

	/**
	 * Get Baker Kit Potions Drunk
	 *
	 * @return Baker Potions Drunk
	 */
	public int getBakerKitPotionsDrunk() {
		return bakerKitPotionsDrunk;
	}

	/**
	 * Get Baker Kit Potion Thrown
	 *
	 * @return Baker Potions Thrown
	 */
	public int getBakerKitPotionsThrown() {
		return bakerKitPotionsThrown;
	}

	/**
	 * Get Baker Kit Egg Thrown
	 *
	 * @return Baker Egg Thrown
	 */
	public int getBakerKitEggThrown() {
		return bakerKitEggThrown;
	}

	/**
	 * Get Baker Kit Mobs Spawned
	 *
	 * @return Baker Mobs Spawned
	 */
	public int getBakerKitMobsSpawned() {
		return bakerKitMobsSpawned;
	}


	/**
	 * Get Blaze Kit Experience
	 *
	 * @return Blaze Exp
	 */
	public int getBlazeKitExp() {
		return blazeKitExp;
	}

	/**
	 * Get Blaze Kit Wins
	 *
	 * @return Blaze Wins
	 */
	public int getBlazeKitWins() {
		return blazeKitWins;
	}

	/**
	 * Get Blaze Kit Wins Team
	 *
	 * @return Blaze Wins Team
	 */
	public int getBlazeKitWinsTeam() {
		return blazeKitWinsTeam;
	}

	/**
	 * Get Blaze Kit Games Played
	 *
	 * @return Blaze Games Played
	 */
	public int getBlazeKitGamesPlayed() {
		return blazeKitGamesPlayed;
	}

	/**
	 * Get Blaze Kit Time played
	 *
	 * @return Blaze Time Played
	 */
	public int getBlazeKitTimePlayed() {
		return blazeKitTimePlayed;
	}

	/**
	 * Get Blaze Kit Kills
	 *
	 * @return Blaze Kills
	 */
	public int getBlazeKitKills() {
		return blazeKitKills;
	}

	/**
	 * Get Blaze Kit Taunt Kills
	 *
	 * @return Blaze Taunt Kills
	 */
	public int getBlazeKitTauntKills() {
		return blazeKitTauntKills;
	}

	/**
	 * Get Blaze Kit Damage
	 *
	 * @return Blaze Damage
	 */
	public int getBlazeKitDamage() {
		return blazeKitDamage;
	}

	/**
	 * Get Blaze Kit Damage Taken
	 *
	 * @return Blaze Damage Taken
	 */
	public int getBlazeKitDamageTaken() {
		return blazeKitDamageTaken;
	}

	/**
	 * Get Blaze Kit Fall Damage
	 *
	 * @return Blaze Fall Damage
	 */
	public int getBlazeKitFallDamage() {
		return blazeKitFallDamage;
	}

	/**
	 * Get Blaze Kit Chests Opened
	 *
	 * @return Blaze Chests Opened
	 */
	public int getBlazeKitChestsOpened() {
		return blazeKitChestsOpened;
	}

	/**
	 * Get Blaze Kit Items Enchanted
	 *
	 * @return Blaze Items Enchanted
	 */
	public int getBlazeKitItemsEnchanted() {
		return blazeKitItemsEnchanted;
	}

	/**
	 * Get Blaze Kit Arrows Fired
	 *
	 * @return Blaze Arrows Fired
	 */
	public int getBlazeKitArrowsFired() {
		return blazeKitArrowsFired;
	}

	/**
	 * Get Blaze Kit Arrows Hit
	 *
	 * @return Blaze Arrows Hit
	 */
	public int getBlazeKitArrowsHit() {
		return blazeKitArrowsHit;
	}

	/**
	 * Get Blaze Kit Potions Drunk
	 *
	 * @return Blaze Potions Drunk
	 */
	public int getBlazeKitPotionsDrunk() {
		return blazeKitPotionsDrunk;
	}

	/**
	 * Get Blaze Kit Potion Thrown
	 *
	 * @return Blaze Potions Thrown
	 */
	public int getBlazeKitPotionsThrown() {
		return blazeKitPotionsThrown;
	}

	/**
	 * Get Blaze Kit Egg Thrown
	 *
	 * @return Blaze Egg Thrown
	 */
	public int getBlazeKitEggThrown() {
		return blazeKitEggThrown;
	}

	/**
	 * Get Blaze Kit Mobs Spawned
	 *
	 * @return Blaze Mobs Spawned
	 */
	public int getBlazeKitMobsSpawned() {
		return blazeKitMobsSpawned;
	}


	/**
	 * Get Creeper Tamer Kit Experience
	 *
	 * @return Creeper Tamer Exp
	 */
	public int getCreeperTamerKitExp() {
		return creeperTamerKitExp;
	}

	/**
	 * Get Creeper Tamer Kit Wins
	 *
	 * @return Creeper Tamer Wins
	 */
	public int getCreeperTamerKitWins() {
		return creeperTamerKitWins;
	}

	/**
	 * Get Creeper Tamer Kit Wins Team
	 *
	 * @return Creeper Tamer Wins Team
	 */
	public int getCreeperTamerKitWinsTeam() {
		return creeperTamerKitWinsTeam;
	}

	/**
	 * Get Creeper Tamer Kit Games Played
	 *
	 * @return Creeper Tamer Games Played
	 */
	public int getCreeperTamerKitGamesPlayed() {
		return creeperTamerKitGamesPlayed;
	}

	/**
	 * Get Creeper Tamer Kit Time played
	 *
	 * @return Creeper Tamer Time Played
	 */
	public int getCreeperTamerKitTimePlayed() {
		return creeperTamerKitTimePlayed;
	}

	/**
	 * Get Creeper Tamer Kit Kills
	 *
	 * @return Creeper Tamer Kills
	 */
	public int getCreeperTamerKitKills() {
		return creeperTamerKitKills;
	}

	/**
	 * Get Creeper Tamer Kit Taunt Kills
	 *
	 * @return Creeper Tamer Taunt Kills
	 */
	public int getCreeperTamerKitTauntKills() {
		return creeperTamerKitTauntKills;
	}

	/**
	 * Get Creeper Tamer Kit Damage
	 *
	 * @return Creeper Tamer Damage
	 */
	public int getCreeperTamerKitDamage() {
		return creeperTamerKitDamage;
	}

	/**
	 * Get Creeper Tamer Kit Damage Taken
	 *
	 * @return Creeper Tamer Damage Taken
	 */
	public int getCreeperTamerKitDamageTaken() {
		return creeperTamerKitDamageTaken;
	}

	/**
	 * Get Creeper Tamer Kit Fall Damage
	 *
	 * @return Creeper Tamer Fall Damage
	 */
	public int getCreeperTamerKitFallDamage() {
		return creeperTamerKitFallDamage;
	}

	/**
	 * Get Creeper Tamer Kit Chests Opened
	 *
	 * @return Creeper Tamer Chests Opened
	 */
	public int getCreeperTamerKitChestsOpened() {
		return creeperTamerKitChestsOpened;
	}

	/**
	 * Get Creeper Tamer Kit Items Enchanted
	 *
	 * @return Creeper Tamer Items Enchanted
	 */
	public int getCreeperTamerKitItemsEnchanted() {
		return creeperTamerKitItemsEnchanted;
	}

	/**
	 * Get Creeper Tamer Kit Arrows Fired
	 *
	 * @return Creeper Tamer Arrows Fired
	 */
	public int getCreeperTamerKitArrowsFired() {
		return creeperTamerKitArrowsFired;
	}

	/**
	 * Get Creeper Tamer Kit Arrows Hit
	 *
	 * @return Creeper Tamer Arrows Hit
	 */
	public int getCreeperTamerKitArrowsHit() {
		return creeperTamerKitArrowsHit;
	}

	/**
	 * Get Creeper Tamer Kit Potions Drunk
	 *
	 * @return Creeper Tamer Potions Drunk
	 */
	public int getCreeperTamerKitPotionsDrunk() {
		return creeperTamerKitPotionsDrunk;
	}

	/**
	 * Get Creeper Tamer Kit Potion Thrown
	 *
	 * @return Creeper Tamer Potions Thrown
	 */
	public int getCreeperTamerKitPotionsThrown() {
		return creeperTamerKitPotionsThrown;
	}

	/**
	 * Get Creeper Tamer Kit Egg Thrown
	 *
	 * @return Creeper Tamer Egg Thrown
	 */
	public int getCreeperTamerKitEggThrown() {
		return creeperTamerKitEggThrown;
	}

	/**
	 * Get Creeper Tamer Kit Mobs Spawned
	 *
	 * @return Creeper Tamer Mobs Spawned
	 */
	public int getCreeperTamerKitMobsSpawned() {
		return creeperTamerKitMobsSpawned;
	}


	/**
	 * Get Diver Kit Experience
	 *
	 * @return Diver Exp
	 */
	public int getDiverKitExp() {
		return diverKitExp;
	}

	/**
	 * Get Diver Kit Wins
	 *
	 * @return Diver Wins
	 */
	public int getDiverKitWins() {
		return diverKitWins;
	}

	/**
	 * Get Diver Kit Wins Team
	 *
	 * @return Diver Wins Team
	 */
	public int getDiverKitWinsTeam() {
		return diverKitWinsTeam;
	}

	/**
	 * Get Diver Kit Games Played
	 *
	 * @return Diver Games Played
	 */
	public int getDiverKitGamesPlayed() {
		return diverKitGamesPlayed;
	}

	/**
	 * Get Diver Kit Time played
	 *
	 * @return Diver Time Played
	 */
	public int getDiverKitTimePlayed() {
		return diverKitTimePlayed;
	}

	/**
	 * Get Diver Kit Kills
	 *
	 * @return Diver Kills
	 */
	public int getDiverKitKills() {
		return diverKitKills;
	}

	/**
	 * Get Diver Kit Taunt Kills
	 *
	 * @return Diver Taunt Kills
	 */
	public int getDiverKitTauntKills() {
		return diverKitTauntKills;
	}

	/**
	 * Get Diver Kit Damage
	 *
	 * @return Diver Damage
	 */
	public int getDiverKitDamage() {
		return diverKitDamage;
	}

	/**
	 * Get Diver Kit Damage Taken
	 *
	 * @return Diver Damage Taken
	 */
	public int getDiverKitDamageTaken() {
		return diverKitDamageTaken;
	}

	/**
	 * Get Diver Kit Fall Damage
	 *
	 * @return Diver Fall Damage
	 */
	public int getDiverKitFallDamage() {
		return diverKitFallDamage;
	}

	/**
	 * Get Diver Kit Chests Opened
	 *
	 * @return Diver Chests Opened
	 */
	public int getDiverKitChestsOpened() {
		return diverKitChestsOpened;
	}

	/**
	 * Get Diver Kit Items Enchanted
	 *
	 * @return Diver Items Enchanted
	 */
	public int getDiverKitItemsEnchanted() {
		return diverKitItemsEnchanted;
	}

	/**
	 * Get Diver Kit Arrows Fired
	 *
	 * @return Diver Arrows Fired
	 */
	public int getDiverKitArrowsFired() {
		return diverKitArrowsFired;
	}

	/**
	 * Get Diver Kit Arrows Hit
	 *
	 * @return Diver Arrows Hit
	 */
	public int getDiverKitArrowsHit() {
		return diverKitArrowsHit;
	}

	/**
	 * Get Diver Kit Potions Drunk
	 *
	 * @return Diver Potions Drunk
	 */
	public int getDiverKitPotionsDrunk() {
		return diverKitPotionsDrunk;
	}

	/**
	 * Get Diver Kit Potion Thrown
	 *
	 * @return Diver Potions Thrown
	 */
	public int getDiverKitPotionsThrown() {
		return diverKitPotionsThrown;
	}

	/**
	 * Get Diver Kit Egg Thrown
	 *
	 * @return Diver Egg Thrown
	 */
	public int getDiverKitEggThrown() {
		return diverKitEggThrown;
	}

	/**
	 * Get Diver Kit Mobs Spawned
	 *
	 * @return Diver Mobs Spawned
	 */
	public int getDiverKitMobsSpawned() {
		return diverKitMobsSpawned;
	}


	/**
	 * Get Donkey Tamer Kit Experience
	 *
	 * @return Donkey Tamer Exp
	 */
	public int getDonkeyTamerKitExp() {
		return donkeyTamerKitExp;
	}

	/**
	 * Get Donkey Tamer Kit Wins
	 *
	 * @return Donkey Tamer Wins
	 */
	public int getDonkeyTamerKitWins() {
		return donkeyTamerKitWins;
	}

	/**
	 * Get Donkey Tamer Kit Wins Team
	 *
	 * @return Donkey Tamer Wins Team
	 */
	public int getDonkeyTamerKitWinsTeam() {
		return donkeyTamerKitWinsTeam;
	}

	/**
	 * Get Donkey Tamer Kit Games Played
	 *
	 * @return Donkey Tamer Games Played
	 */
	public int getDonkeyTamerKitGamesPlayed() {
		return donkeyTamerKitGamesPlayed;
	}

	/**
	 * Get Donkey Tamer Kit Time played
	 *
	 * @return Donkey Tamer Time Played
	 */
	public int getDonkeyTamerKitTimePlayed() {
		return donkeyTamerKitTimePlayed;
	}

	/**
	 * Get Donkey Tamer Kit Kills
	 *
	 * @return Donkey Tamer Kills
	 */
	public int getDonkeyTamerKitKills() {
		return donkeyTamerKitKills;
	}

	/**
	 * Get Donkey Tamer Kit Taunt Kills
	 *
	 * @return Donkey Tamer Taunt Kills
	 */
	public int getDonkeyTamerKitTauntKills() {
		return donkeyTamerKitTauntKills;
	}

	/**
	 * Get Donkey Tamer Kit Damage
	 *
	 * @return Donkey Tamer Damage
	 */
	public int getDonkeyTamerKitDamage() {
		return donkeyTamerKitDamage;
	}

	/**
	 * Get Donkey Tamer Kit Damage Taken
	 *
	 * @return Donkey Tamer Damage Taken
	 */
	public int getDonkeyTamerKitDamageTaken() {
		return donkeyTamerKitDamageTaken;
	}

	/**
	 * Get Donkey Tamer Kit Fall Damage
	 *
	 * @return Donkey Tamer Fall Damage
	 */
	public int getDonkeyTamerKitFallDamage() {
		return donkeyTamerKitFallDamage;
	}

	/**
	 * Get Donkey Tamer Kit Chests Opened
	 *
	 * @return Donkey Tamer Chests Opened
	 */
	public int getDonkeyTamerKitChestsOpened() {
		return donkeyTamerKitChestsOpened;
	}

	/**
	 * Get Donkey Tamer Kit Items Enchanted
	 *
	 * @return Donkey Tamer Items Enchanted
	 */
	public int getDonkeyTamerKitItemsEnchanted() {
		return donkeyTamerKitItemsEnchanted;
	}

	/**
	 * Get Donkey Tamer Kit Arrows Fired
	 *
	 * @return Donkey Tamer Arrows Fired
	 */
	public int getDonkeyTamerKitArrowsFired() {
		return donkeyTamerKitArrowsFired;
	}

	/**
	 * Get Donkey Tamer Kit Arrows Hit
	 *
	 * @return Donkey Tamer Arrows Hit
	 */
	public int getDonkeyTamerKitArrowsHit() {
		return donkeyTamerKitArrowsHit;
	}

	/**
	 * Get Donkey Tamer Kit Potions Drunk
	 *
	 * @return Donkey Tamer Potions Drunk
	 */
	public int getDonkeyTamerKitPotionsDrunk() {
		return donkeyTamerKitPotionsDrunk;
	}

	/**
	 * Get Donkey Tamer Kit Potion Thrown
	 *
	 * @return Donkey Tamer Potions Thrown
	 */
	public int getDonkeyTamerKitPotionsThrown() {
		return donkeyTamerKitPotionsThrown;
	}

	/**
	 * Get Donkey Tamer Kit Egg Thrown
	 *
	 * @return Donkey Tamer Egg Thrown
	 */
	public int getDonkeyTamerKitEggThrown() {
		return donkeyTamerKitEggThrown;
	}

	/**
	 * Get Donkey Tamer Kit Mobs Spawned
	 *
	 * @return Donkey Tamer Mobs Spawned
	 */
	public int getDonkeyTamerKitMobsSpawned() {
		return donkeyTamerKitMobsSpawned;
	}


	/**
	 * Get Farmer Kit Experience
	 *
	 * @return Farmer Exp
	 */
	public int getFarmerKitExp() {
		return farmerKitExp;
	}

	/**
	 * Get Farmer Kit Wins
	 *
	 * @return Farmer Wins
	 */
	public int getFarmerKitWins() {
		return farmerKitWins;
	}

	/**
	 * Get Farmer Kit Wins Team
	 *
	 * @return Farmer Wins Team
	 */
	public int getFarmerKitWinsTeam() {
		return farmerKitWinsTeam;
	}

	/**
	 * Get Farmer Kit Games Played
	 *
	 * @return Farmer Games Played
	 */
	public int getFarmerKitGamesPlayed() {
		return farmerKitGamesPlayed;
	}

	/**
	 * Get Farmer Kit Time played
	 *
	 * @return Farmer Time Played
	 */
	public int getFarmerKitTimePlayed() {
		return farmerKitTimePlayed;
	}

	/**
	 * Get Farmer Kit Kills
	 *
	 * @return Farmer Kills
	 */
	public int getFarmerKitKills() {
		return farmerKitKills;
	}

	/**
	 * Get Farmer Kit Taunt Kills
	 *
	 * @return Farmer Taunt Kills
	 */
	public int getFarmerKitTauntKills() {
		return farmerKitTauntKills;
	}

	/**
	 * Get Farmer Kit Damage
	 *
	 * @return Farmer Damage
	 */
	public int getFarmerKitDamage() {
		return farmerKitDamage;
	}

	/**
	 * Get Farmer Kit Damage Taken
	 *
	 * @return Farmer Damage Taken
	 */
	public int getFarmerKitDamageTaken() {
		return farmerKitDamageTaken;
	}

	/**
	 * Get Farmer Kit Fall Damage
	 *
	 * @return Farmer Fall Damage
	 */
	public int getFarmerKitFallDamage() {
		return farmerKitFallDamage;
	}

	/**
	 * Get Farmer Kit Chests Opened
	 *
	 * @return Farmer Chests Opened
	 */
	public int getFarmerKitChestsOpened() {
		return farmerKitChestsOpened;
	}

	/**
	 * Get Farmer Kit Items Enchanted
	 *
	 * @return Farmer Items Enchanted
	 */
	public int getFarmerKitItemsEnchanted() {
		return farmerKitItemsEnchanted;
	}

	/**
	 * Get Farmer Kit Arrows Fired
	 *
	 * @return Farmer Arrows Fired
	 */
	public int getFarmerKitArrowsFired() {
		return farmerKitArrowsFired;
	}

	/**
	 * Get Farmer Kit Arrows Hit
	 *
	 * @return Farmer Arrows Hit
	 */
	public int getFarmerKitArrowsHit() {
		return farmerKitArrowsHit;
	}

	/**
	 * Get Farmer Kit Potions Drunk
	 *
	 * @return Farmer Potions Drunk
	 */
	public int getFarmerKitPotionsDrunk() {
		return farmerKitPotionsDrunk;
	}

	/**
	 * Get Farmer Kit Potion Thrown
	 *
	 * @return Farmer Potions Thrown
	 */
	public int getFarmerKitPotionsThrown() {
		return farmerKitPotionsThrown;
	}

	/**
	 * Get Farmer Kit Egg Thrown
	 *
	 * @return Farmer Egg Thrown
	 */
	public int getFarmerKitEggThrown() {
		return farmerKitEggThrown;
	}

	/**
	 * Get Farmer Kit Mobs Spawned
	 *
	 * @return Farmer Mobs Spawned
	 */
	public int getFarmerKitMobsSpawned() {
		return farmerKitMobsSpawned;
	}


	/**
	 * Get Fisherman Kit Experience
	 *
	 * @return Fisherman Exp
	 */
	public int getFishermanKitExp() {
		return fishermanKitExp;
	}

	/**
	 * Get Fisherman Kit Wins
	 *
	 * @return Fisherman Wins
	 */
	public int getFishermanKitWins() {
		return fishermanKitWins;
	}

	/**
	 * Get Fisherman Kit Wins Team
	 *
	 * @return Fisherman Wins Team
	 */
	public int getFishermanKitWinsTeam() {
		return fishermanKitWinsTeam;
	}

	/**
	 * Get Fisherman Kit Games Played
	 *
	 * @return Fisherman Games Played
	 */
	public int getFishermanKitGamesPlayed() {
		return fishermanKitGamesPlayed;
	}

	/**
	 * Get Fisherman Kit Time played
	 *
	 * @return Fisherman Time Played
	 */
	public int getFishermanKitTimePlayed() {
		return fishermanKitTimePlayed;
	}

	/**
	 * Get Fisherman Kit Kills
	 *
	 * @return Fisherman Kills
	 */
	public int getFishermanKitKills() {
		return fishermanKitKills;
	}

	/**
	 * Get Fisherman Kit Taunt Kills
	 *
	 * @return Fisherman Taunt Kills
	 */
	public int getFishermanKitTauntKills() {
		return fishermanKitTauntKills;
	}

	/**
	 * Get Fisherman Kit Damage
	 *
	 * @return Fisherman Damage
	 */
	public int getFishermanKitDamage() {
		return fishermanKitDamage;
	}

	/**
	 * Get Fisherman Kit Damage Taken
	 *
	 * @return Fisherman Damage Taken
	 */
	public int getFishermanKitDamageTaken() {
		return fishermanKitDamageTaken;
	}

	/**
	 * Get Fisherman Kit Fall Damage
	 *
	 * @return Fisherman Fall Damage
	 */
	public int getFishermanKitFallDamage() {
		return fishermanKitFallDamage;
	}

	/**
	 * Get Fisherman Kit Chests Opened
	 *
	 * @return Fisherman Chests Opened
	 */
	public int getFishermanKitChestsOpened() {
		return fishermanKitChestsOpened;
	}

	/**
	 * Get Fisherman Kit Items Enchanted
	 *
	 * @return Fisherman Items Enchanted
	 */
	public int getFishermanKitItemsEnchanted() {
		return fishermanKitItemsEnchanted;
	}

	/**
	 * Get Fisherman Kit Arrows Fired
	 *
	 * @return Fisherman Arrows Fired
	 */
	public int getFishermanKitArrowsFired() {
		return fishermanKitArrowsFired;
	}

	/**
	 * Get Fisherman Kit Arrows Hit
	 *
	 * @return Fisherman Arrows Hit
	 */
	public int getFishermanKitArrowsHit() {
		return fishermanKitArrowsHit;
	}

	/**
	 * Get Fisherman Kit Potions Drunk
	 *
	 * @return Fisherman Potions Drunk
	 */
	public int getFishermanKitPotionsDrunk() {
		return fishermanKitPotionsDrunk;
	}

	/**
	 * Get Fisherman Kit Potion Thrown
	 *
	 * @return Fisherman Potions Thrown
	 */
	public int getFishermanKitPotionsThrown() {
		return fishermanKitPotionsThrown;
	}

	/**
	 * Get Fisherman Kit Egg Thrown
	 *
	 * @return Fisherman Egg Thrown
	 */
	public int getFishermanKitEggThrown() {
		return fishermanKitEggThrown;
	}

	/**
	 * Get Fisherman Kit Mobs Spawned
	 *
	 * @return Fisherman Mobs Spawned
	 */
	public int getFishermanKitMobsSpawned() {
		return fishermanKitMobsSpawned;
	}


	/**
	 * Get Florist Kit Experience
	 *
	 * @return Florist Exp
	 */
	public int getFloristKitExp() {
		return floristKitExp;
	}

	/**
	 * Get Florist Kit Wins
	 *
	 * @return Florist Wins
	 */
	public int getFloristKitWins() {
		return floristKitWins;
	}

	/**
	 * Get Florist Kit Wins Team
	 *
	 * @return Florist Wins Team
	 */
	public int getFloristKitWinsTeam() {
		return floristKitWinsTeam;
	}

	/**
	 * Get Florist Kit Games Played
	 *
	 * @return Florist Games Played
	 */
	public int getFloristKitGamesPlayed() {
		return floristKitGamesPlayed;
	}

	/**
	 * Get Florist Kit Time played
	 *
	 * @return Florist Time Played
	 */
	public int getFloristKitTimePlayed() {
		return floristKitTimePlayed;
	}

	/**
	 * Get Florist Kit Kills
	 *
	 * @return Florist Kills
	 */
	public int getFloristKitKills() {
		return floristKitKills;
	}

	/**
	 * Get Florist Kit Taunt Kills
	 *
	 * @return Florist Taunt Kills
	 */
	public int getFloristKitTauntKills() {
		return floristKitTauntKills;
	}

	/**
	 * Get Florist Kit Damage
	 *
	 * @return Florist Damage
	 */
	public int getFloristKitDamage() {
		return floristKitDamage;
	}

	/**
	 * Get Florist Kit Damage Taken
	 *
	 * @return Florist Damage Taken
	 */
	public int getFloristKitDamageTaken() {
		return floristKitDamageTaken;
	}

	/**
	 * Get Florist Kit Fall Damage
	 *
	 * @return Florist Fall Damage
	 */
	public int getFloristKitFallDamage() {
		return floristKitFallDamage;
	}

	/**
	 * Get Florist Kit Chests Opened
	 *
	 * @return Florist Chests Opened
	 */
	public int getFloristKitChestsOpened() {
		return floristKitChestsOpened;
	}

	/**
	 * Get Florist Kit Items Enchanted
	 *
	 * @return Florist Items Enchanted
	 */
	public int getFloristKitItemsEnchanted() {
		return floristKitItemsEnchanted;
	}

	/**
	 * Get Florist Kit Arrows Fired
	 *
	 * @return Florist Arrows Fired
	 */
	public int getFloristKitArrowsFired() {
		return floristKitArrowsFired;
	}

	/**
	 * Get Florist Kit Arrows Hit
	 *
	 * @return Florist Arrows Hit
	 */
	public int getFloristKitArrowsHit() {
		return floristKitArrowsHit;
	}

	/**
	 * Get Florist Kit Potions Drunk
	 *
	 * @return Florist Potions Drunk
	 */
	public int getFloristKitPotionsDrunk() {
		return floristKitPotionsDrunk;
	}

	/**
	 * Get Florist Kit Potion Thrown
	 *
	 * @return Florist Potions Thrown
	 */
	public int getFloristKitPotionsThrown() {
		return floristKitPotionsThrown;
	}

	/**
	 * Get Florist Kit Egg Thrown
	 *
	 * @return Florist Egg Thrown
	 */
	public int getFloristKitEggThrown() {
		return floristKitEggThrown;
	}

	/**
	 * Get Florist Kit Mobs Spawned
	 *
	 * @return Florist Mobs Spawned
	 */
	public int getFloristKitMobsSpawned() {
		return floristKitMobsSpawned;
	}


	/**
	 * Get Golem Kit Experience
	 *
	 * @return Golem Exp
	 */
	public int getGolemKitExp() {
		return golemKitExp;
	}

	/**
	 * Get Golem Kit Wins
	 *
	 * @return Golem Wins
	 */
	public int getGolemKitWins() {
		return golemKitWins;
	}

	/**
	 * Get Golem Kit Wins Team
	 *
	 * @return Golem Wins Team
	 */
	public int getGolemKitWinsTeam() {
		return golemKitWinsTeam;
	}

	/**
	 * Get Golem Kit Games Played
	 *
	 * @return Golem Games Played
	 */
	public int getGolemKitGamesPlayed() {
		return golemKitGamesPlayed;
	}

	/**
	 * Get Golem Kit Time played
	 *
	 * @return Golem Time Played
	 */
	public int getGolemKitTimePlayed() {
		return golemKitTimePlayed;
	}

	/**
	 * Get Golem Kit Kills
	 *
	 * @return Golem Kills
	 */
	public int getGolemKitKills() {
		return golemKitKills;
	}

	/**
	 * Get Golem Kit Taunt Kills
	 *
	 * @return Golem Taunt Kills
	 */
	public int getGolemKitTauntKills() {
		return golemKitTauntKills;
	}

	/**
	 * Get Golem Kit Damage
	 *
	 * @return Golem Damage
	 */
	public int getGolemKitDamage() {
		return golemKitDamage;
	}

	/**
	 * Get Golem Kit Damage Taken
	 *
	 * @return Golem Damage Taken
	 */
	public int getGolemKitDamageTaken() {
		return golemKitDamageTaken;
	}

	/**
	 * Get Golem Kit Fall Damage
	 *
	 * @return Golem Fall Damage
	 */
	public int getGolemKitFallDamage() {
		return golemKitFallDamage;
	}

	/**
	 * Get Golem Kit Chests Opened
	 *
	 * @return Golem Chests Opened
	 */
	public int getGolemKitChestsOpened() {
		return golemKitChestsOpened;
	}

	/**
	 * Get Golem Kit Items Enchanted
	 *
	 * @return Golem Items Enchanted
	 */
	public int getGolemKitItemsEnchanted() {
		return golemKitItemsEnchanted;
	}

	/**
	 * Get Golem Kit Arrows Fired
	 *
	 * @return Golem Arrows Fired
	 */
	public int getGolemKitArrowsFired() {
		return golemKitArrowsFired;
	}

	/**
	 * Get Golem Kit Arrows Hit
	 *
	 * @return Golem Arrows Hit
	 */
	public int getGolemKitArrowsHit() {
		return golemKitArrowsHit;
	}

	/**
	 * Get Golem Kit Potions Drunk
	 *
	 * @return Golem Potions Drunk
	 */
	public int getGolemKitPotionsDrunk() {
		return golemKitPotionsDrunk;
	}

	/**
	 * Get Golem Kit Potion Thrown
	 *
	 * @return Golem Potions Thrown
	 */
	public int getGolemKitPotionsThrown() {
		return golemKitPotionsThrown;
	}

	/**
	 * Get Golem Kit Egg Thrown
	 *
	 * @return Golem Egg Thrown
	 */
	public int getGolemKitEggThrown() {
		return golemKitEggThrown;
	}

	/**
	 * Get Golem Kit Mobs Spawned
	 *
	 * @return Golem Mobs Spawned
	 */
	public int getGolemKitMobsSpawned() {
		return golemKitMobsSpawned;
	}


	/**
	 * Get Guardian Kit Experience
	 *
	 * @return Guardian Exp
	 */
	public int getGuardianKitExp() {
		return guardianKitExp;
	}

	/**
	 * Get Guardian Kit Wins
	 *
	 * @return Guardian Wins
	 */
	public int getGuardianKitWins() {
		return guardianKitWins;
	}

	/**
	 * Get Guardian Kit Wins Team
	 *
	 * @return Guardian Wins Team
	 */
	public int getGuardianKitWinsTeam() {
		return guardianKitWinsTeam;
	}

	/**
	 * Get Guardian Kit Games Played
	 *
	 * @return Guardian Games Played
	 */
	public int getGuardianKitGamesPlayed() {
		return guardianKitGamesPlayed;
	}

	/**
	 * Get Guardian Kit Time played
	 *
	 * @return Guardian Time Played
	 */
	public int getGuardianKitTimePlayed() {
		return guardianKitTimePlayed;
	}

	/**
	 * Get Guardian Kit Kills
	 *
	 * @return Guardian Kills
	 */
	public int getGuardianKitKills() {
		return guardianKitKills;
	}

	/**
	 * Get Guardian Kit Taunt Kills
	 *
	 * @return Guardian Taunt Kills
	 */
	public int getGuardianKitTauntKills() {
		return guardianKitTauntKills;
	}

	/**
	 * Get Guardian Kit Damage
	 *
	 * @return Guardian Damage
	 */
	public int getGuardianKitDamage() {
		return guardianKitDamage;
	}

	/**
	 * Get Guardian Kit Damage Taken
	 *
	 * @return Guardian Damage Taken
	 */
	public int getGuardianKitDamageTaken() {
		return guardianKitDamageTaken;
	}

	/**
	 * Get Guardian Kit Fall Damage
	 *
	 * @return Guardian Fall Damage
	 */
	public int getGuardianKitFallDamage() {
		return guardianKitFallDamage;
	}

	/**
	 * Get Guardian Kit Chests Opened
	 *
	 * @return Guardian Chests Opened
	 */
	public int getGuardianKitChestsOpened() {
		return guardianKitChestsOpened;
	}

	/**
	 * Get Guardian Kit Items Enchanted
	 *
	 * @return Guardian Items Enchanted
	 */
	public int getGuardianKitItemsEnchanted() {
		return guardianKitItemsEnchanted;
	}

	/**
	 * Get Guardian Kit Arrows Fired
	 *
	 * @return Guardian Arrows Fired
	 */
	public int getGuardianKitArrowsFired() {
		return guardianKitArrowsFired;
	}

	/**
	 * Get Guardian Kit Arrows Hit
	 *
	 * @return Guardian Arrows Hit
	 */
	public int getGuardianKitArrowsHit() {
		return guardianKitArrowsHit;
	}

	/**
	 * Get Guardian Kit Potions Drunk
	 *
	 * @return Guardian Potions Drunk
	 */
	public int getGuardianKitPotionsDrunk() {
		return guardianKitPotionsDrunk;
	}

	/**
	 * Get Guardian Kit Potion Thrown
	 *
	 * @return Guardian Potions Thrown
	 */
	public int getGuardianKitPotionsThrown() {
		return guardianKitPotionsThrown;
	}

	/**
	 * Get Guardian Kit Egg Thrown
	 *
	 * @return Guardian Egg Thrown
	 */
	public int getGuardianKitEggThrown() {
		return guardianKitEggThrown;
	}

	/**
	 * Get Guardian Kit Mobs Spawned
	 *
	 * @return Guardian Mobs Spawned
	 */
	public int getGuardianKitMobsSpawned() {
		return guardianKitMobsSpawned;
	}


	/**
	 * Get Horse Tamer Kit Experience
	 *
	 * @return Horse Tamer Exp
	 */
	public int getHorseTamerKitExp() {
		return horseTamerKitExp;
	}

	/**
	 * Get Horse Tamer Kit Wins
	 *
	 * @return Horse Tamer Wins
	 */
	public int getHorseTamerKitWins() {
		return horseTamerKitWins;
	}

	/**
	 * Get Horse Tamer Kit Wins Team
	 *
	 * @return Horse Tamer Wins Team
	 */
	public int getHorseTamerKitWinsTeam() {
		return horseTamerKitWinsTeam;
	}

	/**
	 * Get Horse Tamer Kit Games Played
	 *
	 * @return Horse Tamer Games Played
	 */
	public int getHorseTamerKitGamesPlayed() {
		return horseTamerKitGamesPlayed;
	}

	/**
	 * Get Horse Tamer Kit Time played
	 *
	 * @return Horse Tamer Time Played
	 */
	public int getHorseTamerKitTimePlayed() {
		return horseTamerKitTimePlayed;
	}

	/**
	 * Get Horse Tamer Kit Kills
	 *
	 * @return Horse Tamer Kills
	 */
	public int getHorseTamerKitKills() {
		return horseTamerKitKills;
	}

	/**
	 * Get Horse Tamer Kit Taunt Kills
	 *
	 * @return Horse Tamer Taunt Kills
	 */
	public int getHorseTamerKitTauntKills() {
		return horseTamerKitTauntKills;
	}

	/**
	 * Get Horse Tamer Kit Damage
	 *
	 * @return Horse Tamer Damage
	 */
	public int getHorseTamerKitDamage() {
		return horseTamerKitDamage;
	}

	/**
	 * Get Horse Tamer Kit Damage Taken
	 *
	 * @return Horse Tamer Damage Taken
	 */
	public int getHorseTamerKitDamageTaken() {
		return horseTamerKitDamageTaken;
	}

	/**
	 * Get Horse Tamer Kit Fall Damage
	 *
	 * @return Horse Tamer Fall Damage
	 */
	public int getHorseTamerKitFallDamage() {
		return horseTamerKitFallDamage;
	}

	/**
	 * Get Horse Tamer Kit Chests Opened
	 *
	 * @return Horse Tamer Chests Opened
	 */
	public int getHorseTamerKitChestsOpened() {
		return horseTamerKitChestsOpened;
	}

	/**
	 * Get Horse Tamer Kit Items Enchanted
	 *
	 * @return Horse Tamer Items Enchanted
	 */
	public int getHorseTamerKitItemsEnchanted() {
		return horseTamerKitItemsEnchanted;
	}

	/**
	 * Get Horse Tamer Kit Arrows Fired
	 *
	 * @return Horse Tamer Arrows Fired
	 */
	public int getHorseTamerKitArrowsFired() {
		return horseTamerKitArrowsFired;
	}

	/**
	 * Get Horse Tamer Kit Arrows Hit
	 *
	 * @return Horse Tamer Arrows Hit
	 */
	public int getHorseTamerKitArrowsHit() {
		return horseTamerKitArrowsHit;
	}

	/**
	 * Get Horse Tamer Kit Potions Drunk
	 *
	 * @return Horse Tamer Potions Drunk
	 */
	public int getHorseTamerKitPotionsDrunk() {
		return horseTamerKitPotionsDrunk;
	}

	/**
	 * Get Horse Tamer Kit Potion Thrown
	 *
	 * @return Horse Tamer Potions Thrown
	 */
	public int getHorseTamerKitPotionsThrown() {
		return horseTamerKitPotionsThrown;
	}

	/**
	 * Get Horse Tamer Kit Egg Thrown
	 *
	 * @return Horse Tamer Egg Thrown
	 */
	public int getHorseTamerKitEggThrown() {
		return horseTamerKitEggThrown;
	}

	/**
	 * Get Horse Tamer Kit Mobs Spawned
	 *
	 * @return Horse Tamer Mobs Spawned
	 */
	public int getHorseTamerKitMobsSpawned() {
		return horseTamerKitMobsSpawned;
	}


	/**
	 * Get Hunter Kit Experience
	 *
	 * @return Hunter Exp
	 */
	public int getHunterKitExp() {
		return hunterKitExp;
	}

	/**
	 * Get Hunter Kit Wins
	 *
	 * @return Hunter Wins
	 */
	public int getHunterKitWins() {
		return hunterKitWins;
	}

	/**
	 * Get Hunter Kit Wins Team
	 *
	 * @return Hunter Wins Team
	 */
	public int getHunterKitWinsTeam() {
		return hunterKitWinsTeam;
	}

	/**
	 * Get Hunter Kit Games Played
	 *
	 * @return Hunter Games Played
	 */
	public int getHunterKitGamesPlayed() {
		return hunterKitGamesPlayed;
	}

	/**
	 * Get Hunter Kit Time played
	 *
	 * @return Hunter Time Played
	 */
	public int getHunterKitTimePlayed() {
		return hunterKitTimePlayed;
	}

	/**
	 * Get Hunter Kit Kills
	 *
	 * @return Hunter Kills
	 */
	public int getHunterKitKills() {
		return hunterKitKills;
	}

	/**
	 * Get Hunter Kit Taunt Kills
	 *
	 * @return Hunter Taunt Kills
	 */
	public int getHunterKitTauntKills() {
		return hunterKitTauntKills;
	}

	/**
	 * Get Hunter Kit Damage
	 *
	 * @return Hunter Damage
	 */
	public int getHunterKitDamage() {
		return hunterKitDamage;
	}

	/**
	 * Get Hunter Kit Damage Taken
	 *
	 * @return Hunter Damage Taken
	 */
	public int getHunterKitDamageTaken() {
		return hunterKitDamageTaken;
	}

	/**
	 * Get Hunter Kit Fall Damage
	 *
	 * @return Hunter Fall Damage
	 */
	public int getHunterKitFallDamage() {
		return hunterKitFallDamage;
	}

	/**
	 * Get Hunter Kit Chests Opened
	 *
	 * @return Hunter Chests Opened
	 */
	public int getHunterKitChestsOpened() {
		return hunterKitChestsOpened;
	}

	/**
	 * Get Hunter Kit Items Enchanted
	 *
	 * @return Hunter Items Enchanted
	 */
	public int getHunterKitItemsEnchanted() {
		return hunterKitItemsEnchanted;
	}

	/**
	 * Get Hunter Kit Arrows Fired
	 *
	 * @return Hunter Arrows Fired
	 */
	public int getHunterKitArrowsFired() {
		return hunterKitArrowsFired;
	}

	/**
	 * Get Hunter Kit Arrows Hit
	 *
	 * @return Hunter Arrows Hit
	 */
	public int getHunterKitArrowsHit() {
		return hunterKitArrowsHit;
	}

	/**
	 * Get Hunter Kit Potions Drunk
	 *
	 * @return Hunter Potions Drunk
	 */
	public int getHunterKitPotionsDrunk() {
		return hunterKitPotionsDrunk;
	}

	/**
	 * Get Hunter Kit Potion Thrown
	 *
	 * @return Hunter Potions Thrown
	 */
	public int getHunterKitPotionsThrown() {
		return hunterKitPotionsThrown;
	}

	/**
	 * Get Hunter Kit Egg Thrown
	 *
	 * @return Hunter Egg Thrown
	 */
	public int getHunterKitEggThrown() {
		return hunterKitEggThrown;
	}

	/**
	 * Get Hunter Kit Mobs Spawned
	 *
	 * @return Hunter Mobs Spawned
	 */
	public int getHunterKitMobsSpawned() {
		return hunterKitMobsSpawned;
	}


	/**
	 * Get Hype Train Kit Experience
	 *
	 * @return Hype Train Exp
	 */
	public int getHypeTrainKitExp() {
		return hypeTrainKitExp;
	}

	/**
	 * Get Hype Train Kit Wins
	 *
	 * @return Hype Train Wins
	 */
	public int getHypeTrainKitWins() {
		return hypeTrainKitWins;
	}

	/**
	 * Get Hype Train Kit Wins Team
	 *
	 * @return Hype Train Wins Team
	 */
	public int getHypeTrainKitWinsTeam() {
		return hypeTrainKitWinsTeam;
	}

	/**
	 * Get Hype Train Kit Games Played
	 *
	 * @return Hype Train Games Played
	 */
	public int getHypeTrainKitGamesPlayed() {
		return hypeTrainKitGamesPlayed;
	}

	/**
	 * Get Hype Train Kit Time played
	 *
	 * @return Hype Train Time Played
	 */
	public int getHypeTrainKitTimePlayed() {
		return hypeTrainKitTimePlayed;
	}

	/**
	 * Get Hype Train Kit Kills
	 *
	 * @return Hype Train Kills
	 */
	public int getHypeTrainKitKills() {
		return hypeTrainKitKills;
	}

	/**
	 * Get Hype Train Kit Taunt Kills
	 *
	 * @return Hype Train Taunt Kills
	 */
	public int getHypeTrainKitTauntKills() {
		return hypeTrainKitTauntKills;
	}

	/**
	 * Get Hype Train Kit Damage
	 *
	 * @return Hype Train Damage
	 */
	public int getHypeTrainKitDamage() {
		return hypeTrainKitDamage;
	}

	/**
	 * Get Hype Train Kit Damage Taken
	 *
	 * @return Hype Train Damage Taken
	 */
	public int getHypeTrainKitDamageTaken() {
		return hypeTrainKitDamageTaken;
	}

	/**
	 * Get Hype Train Kit Fall Damage
	 *
	 * @return Hype Train Fall Damage
	 */
	public int getHypeTrainKitFallDamage() {
		return hypeTrainKitFallDamage;
	}

	/**
	 * Get Hype Train Kit Chests Opened
	 *
	 * @return Hype Train Chests Opened
	 */
	public int getHypeTrainKitChestsOpened() {
		return hypeTrainKitChestsOpened;
	}

	/**
	 * Get Hype Train Kit Items Enchanted
	 *
	 * @return Hype Train Items Enchanted
	 */
	public int getHypeTrainKitItemsEnchanted() {
		return hypeTrainKitItemsEnchanted;
	}

	/**
	 * Get Hype Train Kit Arrows Fired
	 *
	 * @return Hype Train Arrows Fired
	 */
	public int getHypeTrainKitArrowsFired() {
		return hypeTrainKitArrowsFired;
	}

	/**
	 * Get Hype Train Kit Arrows Hit
	 *
	 * @return Hype Train Arrows Hit
	 */
	public int getHypeTrainKitArrowsHit() {
		return hypeTrainKitArrowsHit;
	}

	/**
	 * Get Hype Train Kit Potions Drunk
	 *
	 * @return Hype Train Potions Drunk
	 */
	public int getHypeTrainKitPotionsDrunk() {
		return hypeTrainKitPotionsDrunk;
	}

	/**
	 * Get Hype Train Kit Potion Thrown
	 *
	 * @return Hype Train Potions Thrown
	 */
	public int getHypeTrainKitPotionsThrown() {
		return hypeTrainKitPotionsThrown;
	}

	/**
	 * Get Hype Train Kit Egg Thrown
	 *
	 * @return Hype Train Egg Thrown
	 */
	public int getHypeTrainKitEggThrown() {
		return hypeTrainKitEggThrown;
	}

	/**
	 * Get Hype Train Kit Mobs Spawned
	 *
	 * @return Hype Train Mobs Spawned
	 */
	public int getHypeTrainKitMobsSpawned() {
		return hypeTrainKitMobsSpawned;
	}


	/**
	 * Get Jockey Kit Experience
	 *
	 * @return Jockey Exp
	 */
	public int getJockeyKitExp() {
		return jockeyKitExp;
	}

	/**
	 * Get Jockey Kit Wins
	 *
	 * @return Jockey Wins
	 */
	public int getJockeyKitWins() {
		return jockeyKitWins;
	}

	/**
	 * Get Jockey Kit Wins Team
	 *
	 * @return Jockey Wins Team
	 */
	public int getJockeyKitWinsTeam() {
		return jockeyKitWinsTeam;
	}

	/**
	 * Get Jockey Kit Games Played
	 *
	 * @return Jockey Games Played
	 */
	public int getJockeyKitGamesPlayed() {
		return jockeyKitGamesPlayed;
	}

	/**
	 * Get Jockey Kit Time played
	 *
	 * @return Jockey Time Played
	 */
	public int getJockeyKitTimePlayed() {
		return jockeyKitTimePlayed;
	}

	/**
	 * Get Jockey Kit Kills
	 *
	 * @return Jockey Kills
	 */
	public int getJockeyKitKills() {
		return jockeyKitKills;
	}

	/**
	 * Get Jockey Kit Taunt Kills
	 *
	 * @return Jockey Taunt Kills
	 */
	public int getJockeyKitTauntKills() {
		return jockeyKitTauntKills;
	}

	/**
	 * Get Jockey Kit Damage
	 *
	 * @return Jockey Damage
	 */
	public int getJockeyKitDamage() {
		return jockeyKitDamage;
	}

	/**
	 * Get Jockey Kit Damage Taken
	 *
	 * @return Jockey Damage Taken
	 */
	public int getJockeyKitDamageTaken() {
		return jockeyKitDamageTaken;
	}

	/**
	 * Get Jockey Kit Fall Damage
	 *
	 * @return Jockey Fall Damage
	 */
	public int getJockeyKitFallDamage() {
		return jockeyKitFallDamage;
	}

	/**
	 * Get Jockey Kit Chests Opened
	 *
	 * @return Jockey Chests Opened
	 */
	public int getJockeyKitChestsOpened() {
		return jockeyKitChestsOpened;
	}

	/**
	 * Get Jockey Kit Items Enchanted
	 *
	 * @return Jockey Items Enchanted
	 */
	public int getJockeyKitItemsEnchanted() {
		return jockeyKitItemsEnchanted;
	}

	/**
	 * Get Jockey Kit Arrows Fired
	 *
	 * @return Jockey Arrows Fired
	 */
	public int getJockeyKitArrowsFired() {
		return jockeyKitArrowsFired;
	}

	/**
	 * Get Jockey Kit Arrows Hit
	 *
	 * @return Jockey Arrows Hit
	 */
	public int getJockeyKitArrowsHit() {
		return jockeyKitArrowsHit;
	}

	/**
	 * Get Jockey Kit Potions Drunk
	 *
	 * @return Jockey Potions Drunk
	 */
	public int getJockeyKitPotionsDrunk() {
		return jockeyKitPotionsDrunk;
	}

	/**
	 * Get Jockey Kit Potion Thrown
	 *
	 * @return Jockey Potions Thrown
	 */
	public int getJockeyKitPotionsThrown() {
		return jockeyKitPotionsThrown;
	}

	/**
	 * Get Jockey Kit Egg Thrown
	 *
	 * @return Jockey Egg Thrown
	 */
	public int getJockeyKitEggThrown() {
		return jockeyKitEggThrown;
	}

	/**
	 * Get Jockey Kit Mobs Spawned
	 *
	 * @return Jockey Mobs Spawned
	 */
	public int getJockeyKitMobsSpawned() {
		return jockeyKitMobsSpawned;
	}


	/**
	 * Get Knight Kit Experience
	 *
	 * @return Knight Exp
	 */
	public int getKnightKitExp() {
		return knightKitExp;
	}

	/**
	 * Get Knight Kit Wins
	 *
	 * @return Knight Wins
	 */
	public int getKnightKitWins() {
		return knightKitWins;
	}

	/**
	 * Get Knight Kit Wins Team
	 *
	 * @return Knight Wins Team
	 */
	public int getKnightKitWinsTeam() {
		return knightKitWinsTeam;
	}

	/**
	 * Get Knight Kit Games Played
	 *
	 * @return Knight Games Played
	 */
	public int getKnightKitGamesPlayed() {
		return knightKitGamesPlayed;
	}

	/**
	 * Get Knight Kit Time played
	 *
	 * @return Knight Time Played
	 */
	public int getKnightKitTimePlayed() {
		return knightKitTimePlayed;
	}

	/**
	 * Get Knight Kit Kills
	 *
	 * @return Knight Kills
	 */
	public int getKnightKitKills() {
		return knightKitKills;
	}

	/**
	 * Get Knight Kit Taunt Kills
	 *
	 * @return Knight Taunt Kills
	 */
	public int getKnightKitTauntKills() {
		return knightKitTauntKills;
	}

	/**
	 * Get Knight Kit Damage
	 *
	 * @return Knight Damage
	 */
	public int getKnightKitDamage() {
		return knightKitDamage;
	}

	/**
	 * Get Knight Kit Damage Taken
	 *
	 * @return Knight Damage Taken
	 */
	public int getKnightKitDamageTaken() {
		return knightKitDamageTaken;
	}

	/**
	 * Get Knight Kit Fall Damage
	 *
	 * @return Knight Fall Damage
	 */
	public int getKnightKitFallDamage() {
		return knightKitFallDamage;
	}

	/**
	 * Get Knight Kit Chests Opened
	 *
	 * @return Knight Chests Opened
	 */
	public int getKnightKitChestsOpened() {
		return knightKitChestsOpened;
	}

	/**
	 * Get Knight Kit Items Enchanted
	 *
	 * @return Knight Items Enchanted
	 */
	public int getKnightKitItemsEnchanted() {
		return knightKitItemsEnchanted;
	}

	/**
	 * Get Knight Kit Arrows Fired
	 *
	 * @return Knight Arrows Fired
	 */
	public int getKnightKitArrowsFired() {
		return knightKitArrowsFired;
	}

	/**
	 * Get Knight Kit Arrows Hit
	 *
	 * @return Knight Arrows Hit
	 */
	public int getKnightKitArrowsHit() {
		return knightKitArrowsHit;
	}

	/**
	 * Get Knight Kit Potions Drunk
	 *
	 * @return Knight Potions Drunk
	 */
	public int getKnightKitPotionsDrunk() {
		return knightKitPotionsDrunk;
	}

	/**
	 * Get Knight Kit Potion Thrown
	 *
	 * @return Knight Potions Thrown
	 */
	public int getKnightKitPotionsThrown() {
		return knightKitPotionsThrown;
	}

	/**
	 * Get Knight Kit Egg Thrown
	 *
	 * @return Knight Egg Thrown
	 */
	public int getKnightKitEggThrown() {
		return knightKitEggThrown;
	}

	/**
	 * Get Knight Kit Mobs Spawned
	 *
	 * @return Knight Mobs Spawned
	 */
	public int getKnightKitMobsSpawned() {
		return knightKitMobsSpawned;
	}


	/**
	 * Get Meat Master Kit Experience
	 *
	 * @return Meat Master Exp
	 */
	public int getMeatMasterKitExp() {
		return meatMasterKitExp;
	}

	/**
	 * Get Meat Master Kit Wins
	 *
	 * @return Meat Master Wins
	 */
	public int getMeatMasterKitWins() {
		return meatMasterKitWins;
	}

	/**
	 * Get Meat Master Kit Wins Team
	 *
	 * @return Meat Master Wins Team
	 */
	public int getMeatMasterKitWinsTeam() {
		return meatMasterKitWinsTeam;
	}

	/**
	 * Get Meat Master Kit Games Played
	 *
	 * @return Meat Master Games Played
	 */
	public int getMeatMasterKitGamesPlayed() {
		return meatMasterKitGamesPlayed;
	}

	/**
	 * Get Meat Master Kit Time played
	 *
	 * @return Meat Master Time Played
	 */
	public int getMeatMasterKitTimePlayed() {
		return meatMasterKitTimePlayed;
	}

	/**
	 * Get Meat Master Kit Kills
	 *
	 * @return Meat Master Kills
	 */
	public int getMeatMasterKitKills() {
		return meatMasterKitKills;
	}

	/**
	 * Get Meat Master Kit Taunt Kills
	 *
	 * @return Meat Master Taunt Kills
	 */
	public int getMeatMasterKitTauntKills() {
		return meatMasterKitTauntKills;
	}

	/**
	 * Get Meat Master Kit Damage
	 *
	 * @return Meat Master Damage
	 */
	public int getMeatMasterKitDamage() {
		return meatMasterKitDamage;
	}

	/**
	 * Get Meat Master Kit Damage Taken
	 *
	 * @return Meat Master Damage Taken
	 */
	public int getMeatMasterKitDamageTaken() {
		return meatMasterKitDamageTaken;
	}

	/**
	 * Get Meat Master Kit Fall Damage
	 *
	 * @return Meat Master Fall Damage
	 */
	public int getMeatMasterKitFallDamage() {
		return meatMasterKitFallDamage;
	}

	/**
	 * Get Meat Master Kit Chests Opened
	 *
	 * @return Meat Master Chests Opened
	 */
	public int getMeatMasterKitChestsOpened() {
		return meatMasterKitChestsOpened;
	}

	/**
	 * Get Meat Master Kit Items Enchanted
	 *
	 * @return Meat Master Items Enchanted
	 */
	public int getMeatMasterKitItemsEnchanted() {
		return meatMasterKitItemsEnchanted;
	}

	/**
	 * Get Meat Master Kit Arrows Fired
	 *
	 * @return Meat Master Arrows Fired
	 */
	public int getMeatMasterKitArrowsFired() {
		return meatMasterKitArrowsFired;
	}

	/**
	 * Get Meat Master Kit Arrows Hit
	 *
	 * @return Meat Master Arrows Hit
	 */
	public int getMeatMasterKitArrowsHit() {
		return meatMasterKitArrowsHit;
	}

	/**
	 * Get Meat Master Kit Potions Drunk
	 *
	 * @return Meat Master Potions Drunk
	 */
	public int getMeatMasterKitPotionsDrunk() {
		return meatMasterKitPotionsDrunk;
	}

	/**
	 * Get Meat Master Kit Potion Thrown
	 *
	 * @return Meat Master Potions Thrown
	 */
	public int getMeatMasterKitPotionsThrown() {
		return meatMasterKitPotionsThrown;
	}

	/**
	 * Get Meat Master Kit Egg Thrown
	 *
	 * @return Meat Master Egg Thrown
	 */
	public int getMeatMasterKitEggThrown() {
		return meatMasterKitEggThrown;
	}

	/**
	 * Get Meat Master Kit Mobs Spawned
	 *
	 * @return Meat Master Mobs Spawned
	 */
	public int getMeatMasterKitMobsSpawned() {
		return meatMasterKitMobsSpawned;
	}


	/**
	 * Get Necromancer Kit Experience
	 *
	 * @return Necromancer Exp
	 */
	public int getNecromancerKitExp() {
		return necromancerKitExp;
	}

	/**
	 * Get Necromancer Kit Wins
	 *
	 * @return Necromancer Wins
	 */
	public int getNecromancerKitWins() {
		return necromancerKitWins;
	}

	/**
	 * Get Necromancer Kit Wins Team
	 *
	 * @return Necromancer Wins Team
	 */
	public int getNecromancerKitWinsTeam() {
		return necromancerKitWinsTeam;
	}

	/**
	 * Get Necromancer Kit Games Played
	 *
	 * @return Necromancer Games Played
	 */
	public int getNecromancerKitGamesPlayed() {
		return necromancerKitGamesPlayed;
	}

	/**
	 * Get Necromancer Kit Time played
	 *
	 * @return Necromancer Time Played
	 */
	public int getNecromancerKitTimePlayed() {
		return necromancerKitTimePlayed;
	}

	/**
	 * Get Necromancer Kit Kills
	 *
	 * @return Necromancer Kills
	 */
	public int getNecromancerKitKills() {
		return necromancerKitKills;
	}

	/**
	 * Get Necromancer Kit Taunt Kills
	 *
	 * @return Necromancer Taunt Kills
	 */
	public int getNecromancerKitTauntKills() {
		return necromancerKitTauntKills;
	}

	/**
	 * Get Necromancer Kit Damage
	 *
	 * @return Necromancer Damage
	 */
	public int getNecromancerKitDamage() {
		return necromancerKitDamage;
	}

	/**
	 * Get Necromancer Kit Damage Taken
	 *
	 * @return Necromancer Damage Taken
	 */
	public int getNecromancerKitDamageTaken() {
		return necromancerKitDamageTaken;
	}

	/**
	 * Get Necromancer Kit Fall Damage
	 *
	 * @return Necromancer Fall Damage
	 */
	public int getNecromancerKitFallDamage() {
		return necromancerKitFallDamage;
	}

	/**
	 * Get Necromancer Kit Chests Opened
	 *
	 * @return Necromancer Chests Opened
	 */
	public int getNecromancerKitChestsOpened() {
		return necromancerKitChestsOpened;
	}

	/**
	 * Get Necromancer Kit Items Enchanted
	 *
	 * @return Necromancer Items Enchanted
	 */
	public int getNecromancerKitItemsEnchanted() {
		return necromancerKitItemsEnchanted;
	}

	/**
	 * Get Necromancer Kit Arrows Fired
	 *
	 * @return Necromancer Arrows Fired
	 */
	public int getNecromancerKitArrowsFired() {
		return necromancerKitArrowsFired;
	}

	/**
	 * Get Necromancer Kit Arrows Hit
	 *
	 * @return Necromancer Arrows Hit
	 */
	public int getNecromancerKitArrowsHit() {
		return necromancerKitArrowsHit;
	}

	/**
	 * Get Necromancer Kit Potions Drunk
	 *
	 * @return Necromancer Potions Drunk
	 */
	public int getNecromancerKitPotionsDrunk() {
		return necromancerKitPotionsDrunk;
	}

	/**
	 * Get Necromancer Kit Potion Thrown
	 *
	 * @return Necromancer Potions Thrown
	 */
	public int getNecromancerKitPotionsThrown() {
		return necromancerKitPotionsThrown;
	}

	/**
	 * Get Necromancer Kit Egg Thrown
	 *
	 * @return Necromancer Egg Thrown
	 */
	public int getNecromancerKitEggThrown() {
		return necromancerKitEggThrown;
	}

	/**
	 * Get Necromancer Kit Mobs Spawned
	 *
	 * @return Necromancer Mobs Spawned
	 */
	public int getNecromancerKitMobsSpawned() {
		return necromancerKitMobsSpawned;
	}


	/**
	 * Get Paladin Kit Experience
	 *
	 * @return Paladin Exp
	 */
	public int getPaladinKitExp() {
		return paladinKitExp;
	}

	/**
	 * Get Paladin Kit Wins
	 *
	 * @return Paladin Wins
	 */
	public int getPaladinKitWins() {
		return paladinKitWins;
	}

	/**
	 * Get Paladin Kit Wins Team
	 *
	 * @return Paladin Wins Team
	 */
	public int getPaladinKitWinsTeam() {
		return paladinKitWinsTeam;
	}

	/**
	 * Get Paladin Kit Games Played
	 *
	 * @return Paladin Games Played
	 */
	public int getPaladinKitGamesPlayed() {
		return paladinKitGamesPlayed;
	}

	/**
	 * Get Paladin Kit Time played
	 *
	 * @return Paladin Time Played
	 */
	public int getPaladinKitTimePlayed() {
		return paladinKitTimePlayed;
	}

	/**
	 * Get Paladin Kit Kills
	 *
	 * @return Paladin Kills
	 */
	public int getPaladinKitKills() {
		return paladinKitKills;
	}

	/**
	 * Get Paladin Kit Taunt Kills
	 *
	 * @return Paladin Taunt Kills
	 */
	public int getPaladinKitTauntKills() {
		return paladinKitTauntKills;
	}

	/**
	 * Get Paladin Kit Damage
	 *
	 * @return Paladin Damage
	 */
	public int getPaladinKitDamage() {
		return paladinKitDamage;
	}

	/**
	 * Get Paladin Kit Damage Taken
	 *
	 * @return Paladin Damage Taken
	 */
	public int getPaladinKitDamageTaken() {
		return paladinKitDamageTaken;
	}

	/**
	 * Get Paladin Kit Fall Damage
	 *
	 * @return Paladin Fall Damage
	 */
	public int getPaladinKitFallDamage() {
		return paladinKitFallDamage;
	}

	/**
	 * Get Paladin Kit Chests Opened
	 *
	 * @return Paladin Chests Opened
	 */
	public int getPaladinKitChestsOpened() {
		return paladinKitChestsOpened;
	}

	/**
	 * Get Paladin Kit Items Enchanted
	 *
	 * @return Paladin Items Enchanted
	 */
	public int getPaladinKitItemsEnchanted() {
		return paladinKitItemsEnchanted;
	}

	/**
	 * Get Paladin Kit Arrows Fired
	 *
	 * @return Paladin Arrows Fired
	 */
	public int getPaladinKitArrowsFired() {
		return paladinKitArrowsFired;
	}

	/**
	 * Get Paladin Kit Arrows Hit
	 *
	 * @return Paladin Arrows Hit
	 */
	public int getPaladinKitArrowsHit() {
		return paladinKitArrowsHit;
	}

	/**
	 * Get Paladin Kit Potions Drunk
	 *
	 * @return Paladin Potions Drunk
	 */
	public int getPaladinKitPotionsDrunk() {
		return paladinKitPotionsDrunk;
	}

	/**
	 * Get Paladin Kit Potion Thrown
	 *
	 * @return Paladin Potions Thrown
	 */
	public int getPaladinKitPotionsThrown() {
		return paladinKitPotionsThrown;
	}

	/**
	 * Get Paladin Kit Egg Thrown
	 *
	 * @return Paladin Egg Thrown
	 */
	public int getPaladinKitEggThrown() {
		return paladinKitEggThrown;
	}

	/**
	 * Get Paladin Kit Mobs Spawned
	 *
	 * @return Paladin Mobs Spawned
	 */
	public int getPaladinKitMobsSpawned() {
		return paladinKitMobsSpawned;
	}


	/**
	 * Get Phoenix Kit Experience
	 *
	 * @return Phoenix Exp
	 */
	public int getPhoenixKitExp() {
		return phoenixKitExp;
	}

	/**
	 * Get Phoenix Kit Wins
	 *
	 * @return Phoenix Wins
	 */
	public int getPhoenixKitWins() {
		return phoenixKitWins;
	}

	/**
	 * Get Phoenix Kit Wins Team
	 *
	 * @return Phoenix Wins Team
	 */
	public int getPhoenixKitWinsTeam() {
		return phoenixKitWinsTeam;
	}

	/**
	 * Get Phoenix Kit Games Played
	 *
	 * @return Phoenix Games Played
	 */
	public int getPhoenixKitGamesPlayed() {
		return phoenixKitGamesPlayed;
	}

	/**
	 * Get Phoenix Kit Time played
	 *
	 * @return Phoenix Time Played
	 */
	public int getPhoenixKitTimePlayed() {
		return phoenixKitTimePlayed;
	}

	/**
	 * Get Phoenix Kit Kills
	 *
	 * @return Phoenix Kills
	 */
	public int getPhoenixKitKills() {
		return phoenixKitKills;
	}

	/**
	 * Get Phoenix Kit Taunt Kills
	 *
	 * @return Phoenix Taunt Kills
	 */
	public int getPhoenixKitTauntKills() {
		return phoenixKitTauntKills;
	}

	/**
	 * Get Phoenix Kit Damage
	 *
	 * @return Phoenix Damage
	 */
	public int getPhoenixKitDamage() {
		return phoenixKitDamage;
	}

	/**
	 * Get Phoenix Kit Damage Taken
	 *
	 * @return Phoenix Damage Taken
	 */
	public int getPhoenixKitDamageTaken() {
		return phoenixKitDamageTaken;
	}

	/**
	 * Get Phoenix Kit Fall Damage
	 *
	 * @return Phoenix Fall Damage
	 */
	public int getPhoenixKitFallDamage() {
		return phoenixKitFallDamage;
	}

	/**
	 * Get Phoenix Kit Chests Opened
	 *
	 * @return Phoenix Chests Opened
	 */
	public int getPhoenixKitChestsOpened() {
		return phoenixKitChestsOpened;
	}

	/**
	 * Get Phoenix Kit Items Enchanted
	 *
	 * @return Phoenix Items Enchanted
	 */
	public int getPhoenixKitItemsEnchanted() {
		return phoenixKitItemsEnchanted;
	}

	/**
	 * Get Phoenix Kit Arrows Fired
	 *
	 * @return Phoenix Arrows Fired
	 */
	public int getPhoenixKitArrowsFired() {
		return phoenixKitArrowsFired;
	}

	/**
	 * Get Phoenix Kit Arrows Hit
	 *
	 * @return Phoenix Arrows Hit
	 */
	public int getPhoenixKitArrowsHit() {
		return phoenixKitArrowsHit;
	}

	/**
	 * Get Phoenix Kit Potions Drunk
	 *
	 * @return Phoenix Potions Drunk
	 */
	public int getPhoenixKitPotionsDrunk() {
		return phoenixKitPotionsDrunk;
	}

	/**
	 * Get Phoenix Kit Potion Thrown
	 *
	 * @return Phoenix Potions Thrown
	 */
	public int getPhoenixKitPotionsThrown() {
		return phoenixKitPotionsThrown;
	}

	/**
	 * Get Phoenix Kit Egg Thrown
	 *
	 * @return Phoenix Egg Thrown
	 */
	public int getPhoenixKitEggThrown() {
		return phoenixKitEggThrown;
	}

	/**
	 * Get Phoenix Kit Mobs Spawned
	 *
	 * @return Phoenix Mobs Spawned
	 */
	public int getPhoenixKitMobsSpawned() {
		return phoenixKitMobsSpawned;
	}


	/**
	 * Get Pigman Kit Experience
	 *
	 * @return Pigman Exp
	 */
	public int getPigmanKitExp() {
		return pigmanKitExp;
	}

	/**
	 * Get Pigman Kit Wins
	 *
	 * @return Pigman Wins
	 */
	public int getPigmanKitWins() {
		return pigmanKitWins;
	}

	/**
	 * Get Pigman Kit Wins Team
	 *
	 * @return Pigman Wins Team
	 */
	public int getPigmanKitWinsTeam() {
		return pigmanKitWinsTeam;
	}

	/**
	 * Get Pigman Kit Games Played
	 *
	 * @return Pigman Games Played
	 */
	public int getPigmanKitGamesPlayed() {
		return pigmanKitGamesPlayed;
	}

	/**
	 * Get Pigman Kit Time played
	 *
	 * @return Pigman Time Played
	 */
	public int getPigmanKitTimePlayed() {
		return pigmanKitTimePlayed;
	}

	/**
	 * Get Pigman Kit Kills
	 *
	 * @return Pigman Kills
	 */
	public int getPigmanKitKills() {
		return pigmanKitKills;
	}

	/**
	 * Get Pigman Kit Taunt Kills
	 *
	 * @return Pigman Taunt Kills
	 */
	public int getPigmanKitTauntKills() {
		return pigmanKitTauntKills;
	}

	/**
	 * Get Pigman Kit Damage
	 *
	 * @return Pigman Damage
	 */
	public int getPigmanKitDamage() {
		return pigmanKitDamage;
	}

	/**
	 * Get Pigman Kit Damage Taken
	 *
	 * @return Pigman Damage Taken
	 */
	public int getPigmanKitDamageTaken() {
		return pigmanKitDamageTaken;
	}

	/**
	 * Get Pigman Kit Fall Damage
	 *
	 * @return Pigman Fall Damage
	 */
	public int getPigmanKitFallDamage() {
		return pigmanKitFallDamage;
	}

	/**
	 * Get Pigman Kit Chests Opened
	 *
	 * @return Pigman Chests Opened
	 */
	public int getPigmanKitChestsOpened() {
		return pigmanKitChestsOpened;
	}

	/**
	 * Get Pigman Kit Items Enchanted
	 *
	 * @return Pigman Items Enchanted
	 */
	public int getPigmanKitItemsEnchanted() {
		return pigmanKitItemsEnchanted;
	}

	/**
	 * Get Pigman Kit Arrows Fired
	 *
	 * @return Pigman Arrows Fired
	 */
	public int getPigmanKitArrowsFired() {
		return pigmanKitArrowsFired;
	}

	/**
	 * Get Pigman Kit Arrows Hit
	 *
	 * @return Pigman Arrows Hit
	 */
	public int getPigmanKitArrowsHit() {
		return pigmanKitArrowsHit;
	}

	/**
	 * Get Pigman Kit Potions Drunk
	 *
	 * @return Pigman Potions Drunk
	 */
	public int getPigmanKitPotionsDrunk() {
		return pigmanKitPotionsDrunk;
	}

	/**
	 * Get Pigman Kit Potion Thrown
	 *
	 * @return Pigman Potions Thrown
	 */
	public int getPigmanKitPotionsThrown() {
		return pigmanKitPotionsThrown;
	}

	/**
	 * Get Pigman Kit Egg Thrown
	 *
	 * @return Pigman Egg Thrown
	 */
	public int getPigmanKitEggThrown() {
		return pigmanKitEggThrown;
	}

	/**
	 * Get Pigman Kit Mobs Spawned
	 *
	 * @return Pigman Mobs Spawned
	 */
	public int getPigmanKitMobsSpawned() {
		return pigmanKitMobsSpawned;
	}


	/**
	 * Get Ranger Kit Experience
	 *
	 * @return Ranger Exp
	 */
	public int getRangerKitExp() {
		return rangerKitExp;
	}

	/**
	 * Get Ranger Kit Wins
	 *
	 * @return Ranger Wins
	 */
	public int getRangerKitWins() {
		return rangerKitWins;
	}

	/**
	 * Get Ranger Kit Wins Team
	 *
	 * @return Ranger Wins Team
	 */
	public int getRangerKitWinsTeam() {
		return rangerKitWinsTeam;
	}

	/**
	 * Get Ranger Kit Games Played
	 *
	 * @return Ranger Games Played
	 */
	public int getRangerKitGamesPlayed() {
		return rangerKitGamesPlayed;
	}

	/**
	 * Get Ranger Kit Time played
	 *
	 * @return Ranger Time Played
	 */
	public int getRangerKitTimePlayed() {
		return rangerKitTimePlayed;
	}

	/**
	 * Get Ranger Kit Kills
	 *
	 * @return Ranger Kills
	 */
	public int getRangerKitKills() {
		return rangerKitKills;
	}

	/**
	 * Get Ranger Kit Taunt Kills
	 *
	 * @return Ranger Taunt Kills
	 */
	public int getRangerKitTauntKills() {
		return rangerKitTauntKills;
	}

	/**
	 * Get Ranger Kit Damage
	 *
	 * @return Ranger Damage
	 */
	public int getRangerKitDamage() {
		return rangerKitDamage;
	}

	/**
	 * Get Ranger Kit Damage Taken
	 *
	 * @return Ranger Damage Taken
	 */
	public int getRangerKitDamageTaken() {
		return rangerKitDamageTaken;
	}

	/**
	 * Get Ranger Kit Fall Damage
	 *
	 * @return Ranger Fall Damage
	 */
	public int getRangerKitFallDamage() {
		return rangerKitFallDamage;
	}

	/**
	 * Get Ranger Kit Chests Opened
	 *
	 * @return Ranger Chests Opened
	 */
	public int getRangerKitChestsOpened() {
		return rangerKitChestsOpened;
	}

	/**
	 * Get Ranger Kit Items Enchanted
	 *
	 * @return Ranger Items Enchanted
	 */
	public int getRangerKitItemsEnchanted() {
		return rangerKitItemsEnchanted;
	}

	/**
	 * Get Ranger Kit Arrows Fired
	 *
	 * @return Ranger Arrows Fired
	 */
	public int getRangerKitArrowsFired() {
		return rangerKitArrowsFired;
	}

	/**
	 * Get Ranger Kit Arrows Hit
	 *
	 * @return Ranger Arrows Hit
	 */
	public int getRangerKitArrowsHit() {
		return rangerKitArrowsHit;
	}

	/**
	 * Get Ranger Kit Potions Drunk
	 *
	 * @return Ranger Potions Drunk
	 */
	public int getRangerKitPotionsDrunk() {
		return rangerKitPotionsDrunk;
	}

	/**
	 * Get Ranger Kit Potion Thrown
	 *
	 * @return Ranger Potions Thrown
	 */
	public int getRangerKitPotionsThrown() {
		return rangerKitPotionsThrown;
	}

	/**
	 * Get Ranger Kit Egg Thrown
	 *
	 * @return Ranger Egg Thrown
	 */
	public int getRangerKitEggThrown() {
		return rangerKitEggThrown;
	}

	/**
	 * Get Ranger Kit Mobs Spawned
	 *
	 * @return Ranger Mobs Spawned
	 */
	public int getRangerKitMobsSpawned() {
		return rangerKitMobsSpawned;
	}


	/**
	 * Get Reaper Kit Experience
	 *
	 * @return Reaper Exp
	 */
	public int getReaperKitExp() {
		return reaperKitExp;
	}

	/**
	 * Get Reaper Kit Wins
	 *
	 * @return Reaper Wins
	 */
	public int getReaperKitWins() {
		return reaperKitWins;
	}

	/**
	 * Get Reaper Kit Wins Team
	 *
	 * @return Reaper Wins Team
	 */
	public int getReaperKitWinsTeam() {
		return reaperKitWinsTeam;
	}

	/**
	 * Get Reaper Kit Games Played
	 *
	 * @return Reaper Games Played
	 */
	public int getReaperKitGamesPlayed() {
		return reaperKitGamesPlayed;
	}

	/**
	 * Get Reaper Kit Time played
	 *
	 * @return Reaper Time Played
	 */
	public int getReaperKitTimePlayed() {
		return reaperKitTimePlayed;
	}

	/**
	 * Get Reaper Kit Kills
	 *
	 * @return Reaper Kills
	 */
	public int getReaperKitKills() {
		return reaperKitKills;
	}

	/**
	 * Get Reaper Kit Taunt Kills
	 *
	 * @return Reaper Taunt Kills
	 */
	public int getReaperKitTauntKills() {
		return reaperKitTauntKills;
	}

	/**
	 * Get Reaper Kit Damage
	 *
	 * @return Reaper Damage
	 */
	public int getReaperKitDamage() {
		return reaperKitDamage;
	}

	/**
	 * Get Reaper Kit Damage Taken
	 *
	 * @return Reaper Damage Taken
	 */
	public int getReaperKitDamageTaken() {
		return reaperKitDamageTaken;
	}

	/**
	 * Get Reaper Kit Fall Damage
	 *
	 * @return Reaper Fall Damage
	 */
	public int getReaperKitFallDamage() {
		return reaperKitFallDamage;
	}

	/**
	 * Get Reaper Kit Chests Opened
	 *
	 * @return Reaper Chests Opened
	 */
	public int getReaperKitChestsOpened() {
		return reaperKitChestsOpened;
	}

	/**
	 * Get Reaper Kit Items Enchanted
	 *
	 * @return Reaper Items Enchanted
	 */
	public int getReaperKitItemsEnchanted() {
		return reaperKitItemsEnchanted;
	}

	/**
	 * Get Reaper Kit Arrows Fired
	 *
	 * @return Reaper Arrows Fired
	 */
	public int getReaperKitArrowsFired() {
		return reaperKitArrowsFired;
	}

	/**
	 * Get Reaper Kit Arrows Hit
	 *
	 * @return Reaper Arrows Hit
	 */
	public int getReaperKitArrowsHit() {
		return reaperKitArrowsHit;
	}

	/**
	 * Get Reaper Kit Potions Drunk
	 *
	 * @return Reaper Potions Drunk
	 */
	public int getReaperKitPotionsDrunk() {
		return reaperKitPotionsDrunk;
	}

	/**
	 * Get Reaper Kit Potion Thrown
	 *
	 * @return Reaper Potions Thrown
	 */
	public int getReaperKitPotionsThrown() {
		return reaperKitPotionsThrown;
	}

	/**
	 * Get Reaper Kit Egg Thrown
	 *
	 * @return Reaper Egg Thrown
	 */
	public int getReaperKitEggThrown() {
		return reaperKitEggThrown;
	}

	/**
	 * Get Reaper Kit Mobs Spawned
	 *
	 * @return Reaper Mobs Spawned
	 */
	public int getReaperKitMobsSpawned() {
		return reaperKitMobsSpawned;
	}


	/**
	 * Get Red Dragon Kit Experience
	 *
	 * @return Red Dragon Exp
	 */
	public int getRedDragonKitExp() {
		return redDragonKitExp;
	}

	/**
	 * Get Red Dragon Kit Wins
	 *
	 * @return Red Dragon Wins
	 */
	public int getRedDragonKitWins() {
		return redDragonKitWins;
	}

	/**
	 * Get Red Dragon Kit Wins Team
	 *
	 * @return Red Dragon Wins Team
	 */
	public int getRedDragonKitWinsTeam() {
		return redDragonKitWinsTeam;
	}

	/**
	 * Get Red Dragon Kit Games Played
	 *
	 * @return Red Dragon Games Played
	 */
	public int getRedDragonKitGamesPlayed() {
		return redDragonKitGamesPlayed;
	}

	/**
	 * Get Red Dragon Kit Time played
	 *
	 * @return Red Dragon Time Played
	 */
	public int getRedDragonKitTimePlayed() {
		return redDragonKitTimePlayed;
	}

	/**
	 * Get Red Dragon Kit Kills
	 *
	 * @return Red Dragon Kills
	 */
	public int getRedDragonKitKills() {
		return redDragonKitKills;
	}

	/**
	 * Get Red Dragon Kit Taunt Kills
	 *
	 * @return Red Dragon Taunt Kills
	 */
	public int getRedDragonKitTauntKills() {
		return redDragonKitTauntKills;
	}

	/**
	 * Get Red Dragon Kit Damage
	 *
	 * @return Red Dragon Damage
	 */
	public int getRedDragonKitDamage() {
		return redDragonKitDamage;
	}

	/**
	 * Get Red Dragon Kit Damage Taken
	 *
	 * @return Red Dragon Damage Taken
	 */
	public int getRedDragonKitDamageTaken() {
		return redDragonKitDamageTaken;
	}

	/**
	 * Get Red Dragon Kit Fall Damage
	 *
	 * @return Red Dragon Fall Damage
	 */
	public int getRedDragonKitFallDamage() {
		return redDragonKitFallDamage;
	}

	/**
	 * Get Red Dragon Kit Chests Opened
	 *
	 * @return Red Dragon Chests Opened
	 */
	public int getRedDragonKitChestsOpened() {
		return redDragonKitChestsOpened;
	}

	/**
	 * Get Red Dragon Kit Items Enchanted
	 *
	 * @return Red Dragon Items Enchanted
	 */
	public int getRedDragonKitItemsEnchanted() {
		return redDragonKitItemsEnchanted;
	}

	/**
	 * Get Red Dragon Kit Arrows Fired
	 *
	 * @return Red Dragon Arrows Fired
	 */
	public int getRedDragonKitArrowsFired() {
		return redDragonKitArrowsFired;
	}

	/**
	 * Get Red Dragon Kit Arrows Hit
	 *
	 * @return Red Dragon Arrows Hit
	 */
	public int getRedDragonKitArrowsHit() {
		return redDragonKitArrowsHit;
	}

	/**
	 * Get Red Dragon Kit Potions Drunk
	 *
	 * @return Red Dragon Potions Drunk
	 */
	public int getRedDragonKitPotionsDrunk() {
		return redDragonKitPotionsDrunk;
	}

	/**
	 * Get Red Dragon Kit Potion Thrown
	 *
	 * @return Red Dragon Potions Thrown
	 */
	public int getRedDragonKitPotionsThrown() {
		return redDragonKitPotionsThrown;
	}

	/**
	 * Get Red Dragon Kit Egg Thrown
	 *
	 * @return Red Dragon Egg Thrown
	 */
	public int getRedDragonKitEggThrown() {
		return redDragonKitEggThrown;
	}

	/**
	 * Get Red Dragon Kit Mobs Spawned
	 *
	 * @return Red Dragon Mobs Spawned
	 */
	public int getRedDragonKitMobsSpawned() {
		return redDragonKitMobsSpawned;
	}


	/**
	 * Get Rogue Kit Experience
	 *
	 * @return Rogue Exp
	 */
	public int getRogueKitExp() {
		return rogueKitExp;
	}

	/**
	 * Get Rogue Kit Wins
	 *
	 * @return Rogue Wins
	 */
	public int getRogueKitWins() {
		return rogueKitWins;
	}

	/**
	 * Get Rogue Kit Wins Team
	 *
	 * @return Rogue Wins Team
	 */
	public int getRogueKitWinsTeam() {
		return rogueKitWinsTeam;
	}

	/**
	 * Get Rogue Kit Games Played
	 *
	 * @return Rogue Games Played
	 */
	public int getRogueKitGamesPlayed() {
		return rogueKitGamesPlayed;
	}

	/**
	 * Get Rogue Kit Time played
	 *
	 * @return Rogue Time Played
	 */
	public int getRogueKitTimePlayed() {
		return rogueKitTimePlayed;
	}

	/**
	 * Get Rogue Kit Kills
	 *
	 * @return Rogue Kills
	 */
	public int getRogueKitKills() {
		return rogueKitKills;
	}

	/**
	 * Get Rogue Kit Taunt Kills
	 *
	 * @return Rogue Taunt Kills
	 */
	public int getRogueKitTauntKills() {
		return rogueKitTauntKills;
	}

	/**
	 * Get Rogue Kit Damage
	 *
	 * @return Rogue Damage
	 */
	public int getRogueKitDamage() {
		return rogueKitDamage;
	}

	/**
	 * Get Rogue Kit Damage Taken
	 *
	 * @return Rogue Damage Taken
	 */
	public int getRogueKitDamageTaken() {
		return rogueKitDamageTaken;
	}

	/**
	 * Get Rogue Kit Fall Damage
	 *
	 * @return Rogue Fall Damage
	 */
	public int getRogueKitFallDamage() {
		return rogueKitFallDamage;
	}

	/**
	 * Get Rogue Kit Chests Opened
	 *
	 * @return Rogue Chests Opened
	 */
	public int getRogueKitChestsOpened() {
		return rogueKitChestsOpened;
	}

	/**
	 * Get Rogue Kit Items Enchanted
	 *
	 * @return Rogue Items Enchanted
	 */
	public int getRogueKitItemsEnchanted() {
		return rogueKitItemsEnchanted;
	}

	/**
	 * Get Rogue Kit Arrows Fired
	 *
	 * @return Rogue Arrows Fired
	 */
	public int getRogueKitArrowsFired() {
		return rogueKitArrowsFired;
	}

	/**
	 * Get Rogue Kit Arrows Hit
	 *
	 * @return Rogue Arrows Hit
	 */
	public int getRogueKitArrowsHit() {
		return rogueKitArrowsHit;
	}

	/**
	 * Get Rogue Kit Potions Drunk
	 *
	 * @return Rogue Potions Drunk
	 */
	public int getRogueKitPotionsDrunk() {
		return rogueKitPotionsDrunk;
	}

	/**
	 * Get Rogue Kit Potion Thrown
	 *
	 * @return Rogue Potions Thrown
	 */
	public int getRogueKitPotionsThrown() {
		return rogueKitPotionsThrown;
	}

	/**
	 * Get Rogue Kit Egg Thrown
	 *
	 * @return Rogue Egg Thrown
	 */
	public int getRogueKitEggThrown() {
		return rogueKitEggThrown;
	}

	/**
	 * Get Rogue Kit Mobs Spawned
	 *
	 * @return Rogue Mobs Spawned
	 */
	public int getRogueKitMobsSpawned() {
		return rogueKitMobsSpawned;
	}


	/**
	 * Get Scout Kit Experience
	 *
	 * @return Scout Exp
	 */
	public int getScoutKitExp() {
		return scoutKitExp;
	}

	/**
	 * Get Scout Kit Wins
	 *
	 * @return Scout Wins
	 */
	public int getScoutKitWins() {
		return scoutKitWins;
	}

	/**
	 * Get Scout Kit Wins Team
	 *
	 * @return Scout Wins Team
	 */
	public int getScoutKitWinsTeam() {
		return scoutKitWinsTeam;
	}

	/**
	 * Get Scout Kit Games Played
	 *
	 * @return Scout Games Played
	 */
	public int getScoutKitGamesPlayed() {
		return scoutKitGamesPlayed;
	}

	/**
	 * Get Scout Kit Time played
	 *
	 * @return Scout Time Played
	 */
	public int getScoutKitTimePlayed() {
		return scoutKitTimePlayed;
	}

	/**
	 * Get Scout Kit Kills
	 *
	 * @return Scout Kills
	 */
	public int getScoutKitKills() {
		return scoutKitKills;
	}

	/**
	 * Get Scout Kit Taunt Kills
	 *
	 * @return Scout Taunt Kills
	 */
	public int getScoutKitTauntKills() {
		return scoutKitTauntKills;
	}

	/**
	 * Get Scout Kit Damage
	 *
	 * @return Scout Damage
	 */
	public int getScoutKitDamage() {
		return scoutKitDamage;
	}

	/**
	 * Get Scout Kit Damage Taken
	 *
	 * @return Scout Damage Taken
	 */
	public int getScoutKitDamageTaken() {
		return scoutKitDamageTaken;
	}

	/**
	 * Get Scout Kit Fall Damage
	 *
	 * @return Scout Fall Damage
	 */
	public int getScoutKitFallDamage() {
		return scoutKitFallDamage;
	}

	/**
	 * Get Scout Kit Chests Opened
	 *
	 * @return Scout Chests Opened
	 */
	public int getScoutKitChestsOpened() {
		return scoutKitChestsOpened;
	}

	/**
	 * Get Scout Kit Items Enchanted
	 *
	 * @return Scout Items Enchanted
	 */
	public int getScoutKitItemsEnchanted() {
		return scoutKitItemsEnchanted;
	}

	/**
	 * Get Scout Kit Arrows Fired
	 *
	 * @return Scout Arrows Fired
	 */
	public int getScoutKitArrowsFired() {
		return scoutKitArrowsFired;
	}

	/**
	 * Get Scout Kit Arrows Hit
	 *
	 * @return Scout Arrows Hit
	 */
	public int getScoutKitArrowsHit() {
		return scoutKitArrowsHit;
	}

	/**
	 * Get Scout Kit Potions Drunk
	 *
	 * @return Scout Potions Drunk
	 */
	public int getScoutKitPotionsDrunk() {
		return scoutKitPotionsDrunk;
	}

	/**
	 * Get Scout Kit Potion Thrown
	 *
	 * @return Scout Potions Thrown
	 */
	public int getScoutKitPotionsThrown() {
		return scoutKitPotionsThrown;
	}

	/**
	 * Get Scout Kit Egg Thrown
	 *
	 * @return Scout Egg Thrown
	 */
	public int getScoutKitEggThrown() {
		return scoutKitEggThrown;
	}

	/**
	 * Get Scout Kit Mobs Spawned
	 *
	 * @return Scout Mobs Spawned
	 */
	public int getScoutKitMobsSpawned() {
		return scoutKitMobsSpawned;
	}


	/**
	 * Get Shadow Knight Kit Experience
	 *
	 * @return Shadow Knight Exp
	 */
	public int getShadowKnightKitExp() {
		return shadowKnightKitExp;
	}

	/**
	 * Get Shadow Knight Kit Wins
	 *
	 * @return Shadow Knight Wins
	 */
	public int getShadowKnightKitWins() {
		return shadowKnightKitWins;
	}

	/**
	 * Get Shadow Knight Kit Wins Team
	 *
	 * @return Shadow Knight Wins Team
	 */
	public int getShadowKnightKitWinsTeam() {
		return shadowKnightKitWinsTeam;
	}

	/**
	 * Get Shadow Knight Kit Games Played
	 *
	 * @return Shadow Knight Games Played
	 */
	public int getShadowKnightKitGamesPlayed() {
		return shadowKnightKitGamesPlayed;
	}

	/**
	 * Get Shadow Knight Kit Time played
	 *
	 * @return Shadow Knight Time Played
	 */
	public int getShadowKnightKitTimePlayed() {
		return shadowKnightKitTimePlayed;
	}

	/**
	 * Get Shadow Knight Kit Kills
	 *
	 * @return Shadow Knight Kills
	 */
	public int getShadowKnightKitKills() {
		return shadowKnightKitKills;
	}

	/**
	 * Get Shadow Knight Kit Taunt Kills
	 *
	 * @return Shadow Knight Taunt Kills
	 */
	public int getShadowKnightKitTauntKills() {
		return shadowKnightKitTauntKills;
	}

	/**
	 * Get Shadow Knight Kit Damage
	 *
	 * @return Shadow Knight Damage
	 */
	public int getShadowKnightKitDamage() {
		return shadowKnightKitDamage;
	}

	/**
	 * Get Shadow Knight Kit Damage Taken
	 *
	 * @return Shadow Knight Damage Taken
	 */
	public int getShadowKnightKitDamageTaken() {
		return shadowKnightKitDamageTaken;
	}

	/**
	 * Get Shadow Knight Kit Fall Damage
	 *
	 * @return Shadow Knight Fall Damage
	 */
	public int getShadowKnightKitFallDamage() {
		return shadowKnightKitFallDamage;
	}

	/**
	 * Get Shadow Knight Kit Chests Opened
	 *
	 * @return Shadow Knight Chests Opened
	 */
	public int getShadowKnightKitChestsOpened() {
		return shadowKnightKitChestsOpened;
	}

	/**
	 * Get Shadow Knight Kit Items Enchanted
	 *
	 * @return Shadow Knight Items Enchanted
	 */
	public int getShadowKnightKitItemsEnchanted() {
		return shadowKnightKitItemsEnchanted;
	}

	/**
	 * Get Shadow Knight Kit Arrows Fired
	 *
	 * @return Shadow Knight Arrows Fired
	 */
	public int getShadowKnightKitArrowsFired() {
		return shadowKnightKitArrowsFired;
	}

	/**
	 * Get Shadow Knight Kit Arrows Hit
	 *
	 * @return Shadow Knight Arrows Hit
	 */
	public int getShadowKnightKitArrowsHit() {
		return shadowKnightKitArrowsHit;
	}

	/**
	 * Get Shadow Knight Kit Potions Drunk
	 *
	 * @return Shadow Knight Potions Drunk
	 */
	public int getShadowKnightKitPotionsDrunk() {
		return shadowKnightKitPotionsDrunk;
	}

	/**
	 * Get Shadow Knight Kit Potion Thrown
	 *
	 * @return Shadow Knight Potions Thrown
	 */
	public int getShadowKnightKitPotionsThrown() {
		return shadowKnightKitPotionsThrown;
	}

	/**
	 * Get Shadow Knight Kit Egg Thrown
	 *
	 * @return Shadow Knight Egg Thrown
	 */
	public int getShadowKnightKitEggThrown() {
		return shadowKnightKitEggThrown;
	}

	/**
	 * Get Shadow Knight Kit Mobs Spawned
	 *
	 * @return Shadow Knight Mobs Spawned
	 */
	public int getShadowKnightKitMobsSpawned() {
		return shadowKnightKitMobsSpawned;
	}


	/**
	 * Get Slimey Slime Kit Experience
	 *
	 * @return Slimey Slime Exp
	 */
	public int getSlimeySlimeKitExp() {
		return slimeySlimeKitExp;
	}

	/**
	 * Get Slimey Slime Kit Wins
	 *
	 * @return Slimey Slime Wins
	 */
	public int getSlimeySlimeKitWins() {
		return slimeySlimeKitWins;
	}

	/**
	 * Get Slimey Slime Kit Wins Team
	 *
	 * @return Slimey Slime Wins Team
	 */
	public int getSlimeySlimeKitWinsTeam() {
		return slimeySlimeKitWinsTeam;
	}

	/**
	 * Get Slimey Slime Kit Games Played
	 *
	 * @return Slimey Slime Games Played
	 */
	public int getSlimeySlimeKitGamesPlayed() {
		return slimeySlimeKitGamesPlayed;
	}

	/**
	 * Get Slimey Slime Kit Time played
	 *
	 * @return Slimey Slime Time Played
	 */
	public int getSlimeySlimeKitTimePlayed() {
		return slimeySlimeKitTimePlayed;
	}

	/**
	 * Get Slimey Slime Kit Kills
	 *
	 * @return Slimey Slime Kills
	 */
	public int getSlimeySlimeKitKills() {
		return slimeySlimeKitKills;
	}

	/**
	 * Get Slimey Slime Kit Taunt Kills
	 *
	 * @return Slimey Slime Taunt Kills
	 */
	public int getSlimeySlimeKitTauntKills() {
		return slimeySlimeKitTauntKills;
	}

	/**
	 * Get Slimey Slime Kit Damage
	 *
	 * @return Slimey Slime Damage
	 */
	public int getSlimeySlimeKitDamage() {
		return slimeySlimeKitDamage;
	}

	/**
	 * Get Slimey Slime Kit Damage Taken
	 *
	 * @return Slimey Slime Damage Taken
	 */
	public int getSlimeySlimeKitDamageTaken() {
		return slimeySlimeKitDamageTaken;
	}

	/**
	 * Get Slimey Slime Kit Fall Damage
	 *
	 * @return Slimey Slime Fall Damage
	 */
	public int getSlimeySlimeKitFallDamage() {
		return slimeySlimeKitFallDamage;
	}

	/**
	 * Get Slimey Slime Kit Chests Opened
	 *
	 * @return Slimey Slime Chests Opened
	 */
	public int getSlimeySlimeKitChestsOpened() {
		return slimeySlimeKitChestsOpened;
	}

	/**
	 * Get Slimey Slime Kit Items Enchanted
	 *
	 * @return Slimey Slime Items Enchanted
	 */
	public int getSlimeySlimeKitItemsEnchanted() {
		return slimeySlimeKitItemsEnchanted;
	}

	/**
	 * Get Slimey Slime Kit Arrows Fired
	 *
	 * @return Slimey Slime Arrows Fired
	 */
	public int getSlimeySlimeKitArrowsFired() {
		return slimeySlimeKitArrowsFired;
	}

	/**
	 * Get Slimey Slime Kit Arrows Hit
	 *
	 * @return Slimey Slime Arrows Hit
	 */
	public int getSlimeySlimeKitArrowsHit() {
		return slimeySlimeKitArrowsHit;
	}

	/**
	 * Get Slimey Slime Kit Potions Drunk
	 *
	 * @return Slimey Slime Potions Drunk
	 */
	public int getSlimeySlimeKitPotionsDrunk() {
		return slimeySlimeKitPotionsDrunk;
	}

	/**
	 * Get Slimey Slime Kit Potion Thrown
	 *
	 * @return Slimey Slime Potions Thrown
	 */
	public int getSlimeySlimeKitPotionsThrown() {
		return slimeySlimeKitPotionsThrown;
	}

	/**
	 * Get Slimey Slime Kit Egg Thrown
	 *
	 * @return Slimey Slime Egg Thrown
	 */
	public int getSlimeySlimeKitEggThrown() {
		return slimeySlimeKitEggThrown;
	}

	/**
	 * Get Slimey Slime Kit Mobs Spawned
	 *
	 * @return Slimey Slime Mobs Spawned
	 */
	public int getSlimeySlimeKitMobsSpawned() {
		return slimeySlimeKitMobsSpawned;
	}


	/**
	 * Get Snowman Kit Experience
	 *
	 * @return Snowman Exp
	 */
	public int getSnowmanKitExp() {
		return snowmanKitExp;
	}

	/**
	 * Get Snowman Kit Wins
	 *
	 * @return Snowman Wins
	 */
	public int getSnowmanKitWins() {
		return snowmanKitWins;
	}

	/**
	 * Get Snowman Kit Wins Team
	 *
	 * @return Snowman Wins Team
	 */
	public int getSnowmanKitWinsTeam() {
		return snowmanKitWinsTeam;
	}

	/**
	 * Get Snowman Kit Games Played
	 *
	 * @return Snowman Games Played
	 */
	public int getSnowmanKitGamesPlayed() {
		return snowmanKitGamesPlayed;
	}

	/**
	 * Get Snowman Kit Time played
	 *
	 * @return Snowman Time Played
	 */
	public int getSnowmanKitTimePlayed() {
		return snowmanKitTimePlayed;
	}

	/**
	 * Get Snowman Kit Kills
	 *
	 * @return Snowman Kills
	 */
	public int getSnowmanKitKills() {
		return snowmanKitKills;
	}

	/**
	 * Get Snowman Kit Taunt Kills
	 *
	 * @return Snowman Taunt Kills
	 */
	public int getSnowmanKitTauntKills() {
		return snowmanKitTauntKills;
	}

	/**
	 * Get Snowman Kit Damage
	 *
	 * @return Snowman Damage
	 */
	public int getSnowmanKitDamage() {
		return snowmanKitDamage;
	}

	/**
	 * Get Snowman Kit Damage Taken
	 *
	 * @return Snowman Damage Taken
	 */
	public int getSnowmanKitDamageTaken() {
		return snowmanKitDamageTaken;
	}

	/**
	 * Get Snowman Kit Fall Damage
	 *
	 * @return Snowman Fall Damage
	 */
	public int getSnowmanKitFallDamage() {
		return snowmanKitFallDamage;
	}

	/**
	 * Get Snowman Kit Chests Opened
	 *
	 * @return Snowman Chests Opened
	 */
	public int getSnowmanKitChestsOpened() {
		return snowmanKitChestsOpened;
	}

	/**
	 * Get Snowman Kit Items Enchanted
	 *
	 * @return Snowman Items Enchanted
	 */
	public int getSnowmanKitItemsEnchanted() {
		return snowmanKitItemsEnchanted;
	}

	/**
	 * Get Snowman Kit Arrows Fired
	 *
	 * @return Snowman Arrows Fired
	 */
	public int getSnowmanKitArrowsFired() {
		return snowmanKitArrowsFired;
	}

	/**
	 * Get Snowman Kit Arrows Hit
	 *
	 * @return Snowman Arrows Hit
	 */
	public int getSnowmanKitArrowsHit() {
		return snowmanKitArrowsHit;
	}

	/**
	 * Get Snowman Kit Potions Drunk
	 *
	 * @return Snowman Potions Drunk
	 */
	public int getSnowmanKitPotionsDrunk() {
		return snowmanKitPotionsDrunk;
	}

	/**
	 * Get Snowman Kit Potion Thrown
	 *
	 * @return Snowman Potions Thrown
	 */
	public int getSnowmanKitPotionsThrown() {
		return snowmanKitPotionsThrown;
	}

	/**
	 * Get Snowman Kit Egg Thrown
	 *
	 * @return Snowman Egg Thrown
	 */
	public int getSnowmanKitEggThrown() {
		return snowmanKitEggThrown;
	}

	/**
	 * Get Snowman Kit Mobs Spawned
	 *
	 * @return Snowman Mobs Spawned
	 */
	public int getSnowmanKitMobsSpawned() {
		return snowmanKitMobsSpawned;
	}


	/**
	 * Get Speleologist Kit Experience
	 *
	 * @return Speleologist Exp
	 */
	public int getSpeleologistKitExp() {
		return speleologistKitExp;
	}

	/**
	 * Get Speleologist Kit Wins
	 *
	 * @return Speleologist Wins
	 */
	public int getSpeleologistKitWins() {
		return speleologistKitWins;
	}

	/**
	 * Get Speleologist Kit Wins Team
	 *
	 * @return Speleologist Wins Team
	 */
	public int getSpeleologistKitWinsTeam() {
		return speleologistKitWinsTeam;
	}

	/**
	 * Get Speleologist Kit Games Played
	 *
	 * @return Speleologist Games Played
	 */
	public int getSpeleologistKitGamesPlayed() {
		return speleologistKitGamesPlayed;
	}

	/**
	 * Get Speleologist Kit Time played
	 *
	 * @return Speleologist Time Played
	 */
	public int getSpeleologistKitTimePlayed() {
		return speleologistKitTimePlayed;
	}

	/**
	 * Get Speleologist Kit Kills
	 *
	 * @return Speleologist Kills
	 */
	public int getSpeleologistKitKills() {
		return speleologistKitKills;
	}

	/**
	 * Get Speleologist Kit Taunt Kills
	 *
	 * @return Speleologist Taunt Kills
	 */
	public int getSpeleologistKitTauntKills() {
		return speleologistKitTauntKills;
	}

	/**
	 * Get Speleologist Kit Damage
	 *
	 * @return Speleologist Damage
	 */
	public int getSpeleologistKitDamage() {
		return speleologistKitDamage;
	}

	/**
	 * Get Speleologist Kit Damage Taken
	 *
	 * @return Speleologist Damage Taken
	 */
	public int getSpeleologistKitDamageTaken() {
		return speleologistKitDamageTaken;
	}

	/**
	 * Get Speleologist Kit Fall Damage
	 *
	 * @return Speleologist Fall Damage
	 */
	public int getSpeleologistKitFallDamage() {
		return speleologistKitFallDamage;
	}

	/**
	 * Get Speleologist Kit Chests Opened
	 *
	 * @return Speleologist Chests Opened
	 */
	public int getSpeleologistKitChestsOpened() {
		return speleologistKitChestsOpened;
	}

	/**
	 * Get Speleologist Kit Items Enchanted
	 *
	 * @return Speleologist Items Enchanted
	 */
	public int getSpeleologistKitItemsEnchanted() {
		return speleologistKitItemsEnchanted;
	}

	/**
	 * Get Speleologist Kit Arrows Fired
	 *
	 * @return Speleologist Arrows Fired
	 */
	public int getSpeleologistKitArrowsFired() {
		return speleologistKitArrowsFired;
	}

	/**
	 * Get Speleologist Kit Arrows Hit
	 *
	 * @return Speleologist Arrows Hit
	 */
	public int getSpeleologistKitArrowsHit() {
		return speleologistKitArrowsHit;
	}

	/**
	 * Get Speleologist Kit Potions Drunk
	 *
	 * @return Speleologist Potions Drunk
	 */
	public int getSpeleologistKitPotionsDrunk() {
		return speleologistKitPotionsDrunk;
	}

	/**
	 * Get Speleologist Kit Potion Thrown
	 *
	 * @return Speleologist Potions Thrown
	 */
	public int getSpeleologistKitPotionsThrown() {
		return speleologistKitPotionsThrown;
	}

	/**
	 * Get Speleologist Kit Egg Thrown
	 *
	 * @return Speleologist Egg Thrown
	 */
	public int getSpeleologistKitEggThrown() {
		return speleologistKitEggThrown;
	}

	/**
	 * Get Speleologist Kit Mobs Spawned
	 *
	 * @return Speleologist Mobs Spawned
	 */
	public int getSpeleologistKitMobsSpawned() {
		return speleologistKitMobsSpawned;
	}


	/**
	 * Get Tim Kit Experience
	 *
	 * @return Tim Exp
	 */
	public int getTimKitExp() {
		return timKitExp;
	}

	/**
	 * Get Tim Kit Wins
	 *
	 * @return Tim Wins
	 */
	public int getTimKitWins() {
		return timKitWins;
	}

	/**
	 * Get Tim Kit Wins Team
	 *
	 * @return Tim Wins Team
	 */
	public int getTimKitWinsTeam() {
		return timKitWinsTeam;
	}

	/**
	 * Get Tim Kit Games Played
	 *
	 * @return Tim Games Played
	 */
	public int getTimKitGamesPlayed() {
		return timKitGamesPlayed;
	}

	/**
	 * Get Tim Kit Time played
	 *
	 * @return Tim Time Played
	 */
	public int getTimKitTimePlayed() {
		return timKitTimePlayed;
	}

	/**
	 * Get Tim Kit Kills
	 *
	 * @return Tim Kills
	 */
	public int getTimKitKills() {
		return timKitKills;
	}

	/**
	 * Get Tim Kit Taunt Kills
	 *
	 * @return Tim Taunt Kills
	 */
	public int getTimKitTauntKills() {
		return timKitTauntKills;
	}

	/**
	 * Get Tim Kit Damage
	 *
	 * @return Tim Damage
	 */
	public int getTimKitDamage() {
		return timKitDamage;
	}

	/**
	 * Get Tim Kit Damage Taken
	 *
	 * @return Tim Damage Taken
	 */
	public int getTimKitDamageTaken() {
		return timKitDamageTaken;
	}

	/**
	 * Get Tim Kit Fall Damage
	 *
	 * @return Tim Fall Damage
	 */
	public int getTimKitFallDamage() {
		return timKitFallDamage;
	}

	/**
	 * Get Tim Kit Chests Opened
	 *
	 * @return Tim Chests Opened
	 */
	public int getTimKitChestsOpened() {
		return timKitChestsOpened;
	}

	/**
	 * Get Tim Kit Items Enchanted
	 *
	 * @return Tim Items Enchanted
	 */
	public int getTimKitItemsEnchanted() {
		return timKitItemsEnchanted;
	}

	/**
	 * Get Tim Kit Arrows Fired
	 *
	 * @return Tim Arrows Fired
	 */
	public int getTimKitArrowsFired() {
		return timKitArrowsFired;
	}

	/**
	 * Get Tim Kit Arrows Hit
	 *
	 * @return Tim Arrows Hit
	 */
	public int getTimKitArrowsHit() {
		return timKitArrowsHit;
	}

	/**
	 * Get Tim Kit Potions Drunk
	 *
	 * @return Tim Potions Drunk
	 */
	public int getTimKitPotionsDrunk() {
		return timKitPotionsDrunk;
	}

	/**
	 * Get Tim Kit Potion Thrown
	 *
	 * @return Tim Potions Thrown
	 */
	public int getTimKitPotionsThrown() {
		return timKitPotionsThrown;
	}

	/**
	 * Get Tim Kit Egg Thrown
	 *
	 * @return Tim Egg Thrown
	 */
	public int getTimKitEggThrown() {
		return timKitEggThrown;
	}

	/**
	 * Get Tim Kit Mobs Spawned
	 *
	 * @return Tim Mobs Spawned
	 */
	public int getTimKitMobsSpawned() {
		return timKitMobsSpawned;
	}


	/**
	 * Get Toxicologist Kit Experience
	 *
	 * @return Toxicologist Exp
	 */
	public int getToxicologistKitExp() {
		return toxicologistKitExp;
	}

	/**
	 * Get Toxicologist Kit Wins
	 *
	 * @return Toxicologist Wins
	 */
	public int getToxicologistKitWins() {
		return toxicologistKitWins;
	}

	/**
	 * Get Toxicologist Kit Wins Team
	 *
	 * @return Toxicologist Wins Team
	 */
	public int getToxicologistKitWinsTeam() {
		return toxicologistKitWinsTeam;
	}

	/**
	 * Get Toxicologist Kit Games Played
	 *
	 * @return Toxicologist Games Played
	 */
	public int getToxicologistKitGamesPlayed() {
		return toxicologistKitGamesPlayed;
	}

	/**
	 * Get Toxicologist Kit Time played
	 *
	 * @return Toxicologist Time Played
	 */
	public int getToxicologistKitTimePlayed() {
		return toxicologistKitTimePlayed;
	}

	/**
	 * Get Toxicologist Kit Kills
	 *
	 * @return Toxicologist Kills
	 */
	public int getToxicologistKitKills() {
		return toxicologistKitKills;
	}

	/**
	 * Get Toxicologist Kit Taunt Kills
	 *
	 * @return Toxicologist Taunt Kills
	 */
	public int getToxicologistKitTauntKills() {
		return toxicologistKitTauntKills;
	}

	/**
	 * Get Toxicologist Kit Damage
	 *
	 * @return Toxicologist Damage
	 */
	public int getToxicologistKitDamage() {
		return toxicologistKitDamage;
	}

	/**
	 * Get Toxicologist Kit Damage Taken
	 *
	 * @return Toxicologist Damage Taken
	 */
	public int getToxicologistKitDamageTaken() {
		return toxicologistKitDamageTaken;
	}

	/**
	 * Get Toxicologist Kit Fall Damage
	 *
	 * @return Toxicologist Fall Damage
	 */
	public int getToxicologistKitFallDamage() {
		return toxicologistKitFallDamage;
	}

	/**
	 * Get Toxicologist Kit Chests Opened
	 *
	 * @return Toxicologist Chests Opened
	 */
	public int getToxicologistKitChestsOpened() {
		return toxicologistKitChestsOpened;
	}

	/**
	 * Get Toxicologist Kit Items Enchanted
	 *
	 * @return Toxicologist Items Enchanted
	 */
	public int getToxicologistKitItemsEnchanted() {
		return toxicologistKitItemsEnchanted;
	}

	/**
	 * Get Toxicologist Kit Arrows Fired
	 *
	 * @return Toxicologist Arrows Fired
	 */
	public int getToxicologistKitArrowsFired() {
		return toxicologistKitArrowsFired;
	}

	/**
	 * Get Toxicologist Kit Arrows Hit
	 *
	 * @return Toxicologist Arrows Hit
	 */
	public int getToxicologistKitArrowsHit() {
		return toxicologistKitArrowsHit;
	}

	/**
	 * Get Toxicologist Kit Potions Drunk
	 *
	 * @return Toxicologist Potions Drunk
	 */
	public int getToxicologistKitPotionsDrunk() {
		return toxicologistKitPotionsDrunk;
	}

	/**
	 * Get Toxicologist Kit Potion Thrown
	 *
	 * @return Toxicologist Potions Thrown
	 */
	public int getToxicologistKitPotionsThrown() {
		return toxicologistKitPotionsThrown;
	}

	/**
	 * Get Toxicologist Kit Egg Thrown
	 *
	 * @return Toxicologist Egg Thrown
	 */
	public int getToxicologistKitEggThrown() {
		return toxicologistKitEggThrown;
	}

	/**
	 * Get Toxicologist Kit Mobs Spawned
	 *
	 * @return Toxicologist Mobs Spawned
	 */
	public int getToxicologistKitMobsSpawned() {
		return toxicologistKitMobsSpawned;
	}


	/**
	 * Get Troll Kit Experience
	 *
	 * @return Troll Exp
	 */
	public int getTrollKitExp() {
		return trollKitExp;
	}

	/**
	 * Get Troll Kit Wins
	 *
	 * @return Troll Wins
	 */
	public int getTrollKitWins() {
		return trollKitWins;
	}

	/**
	 * Get Troll Kit Wins Team
	 *
	 * @return Troll Wins Team
	 */
	public int getTrollKitWinsTeam() {
		return trollKitWinsTeam;
	}

	/**
	 * Get Troll Kit Games Played
	 *
	 * @return Troll Games Played
	 */
	public int getTrollKitGamesPlayed() {
		return trollKitGamesPlayed;
	}

	/**
	 * Get Troll Kit Time played
	 *
	 * @return Troll Time Played
	 */
	public int getTrollKitTimePlayed() {
		return trollKitTimePlayed;
	}

	/**
	 * Get Troll Kit Kills
	 *
	 * @return Troll Kills
	 */
	public int getTrollKitKills() {
		return trollKitKills;
	}

	/**
	 * Get Troll Kit Taunt Kills
	 *
	 * @return Troll Taunt Kills
	 */
	public int getTrollKitTauntKills() {
		return trollKitTauntKills;
	}

	/**
	 * Get Troll Kit Damage
	 *
	 * @return Troll Damage
	 */
	public int getTrollKitDamage() {
		return trollKitDamage;
	}

	/**
	 * Get Troll Kit Damage Taken
	 *
	 * @return Troll Damage Taken
	 */
	public int getTrollKitDamageTaken() {
		return trollKitDamageTaken;
	}

	/**
	 * Get Troll Kit Fall Damage
	 *
	 * @return Troll Fall Damage
	 */
	public int getTrollKitFallDamage() {
		return trollKitFallDamage;
	}

	/**
	 * Get Troll Kit Chests Opened
	 *
	 * @return Troll Chests Opened
	 */
	public int getTrollKitChestsOpened() {
		return trollKitChestsOpened;
	}

	/**
	 * Get Troll Kit Items Enchanted
	 *
	 * @return Troll Items Enchanted
	 */
	public int getTrollKitItemsEnchanted() {
		return trollKitItemsEnchanted;
	}

	/**
	 * Get Troll Kit Arrows Fired
	 *
	 * @return Troll Arrows Fired
	 */
	public int getTrollKitArrowsFired() {
		return trollKitArrowsFired;
	}

	/**
	 * Get Troll Kit Arrows Hit
	 *
	 * @return Troll Arrows Hit
	 */
	public int getTrollKitArrowsHit() {
		return trollKitArrowsHit;
	}

	/**
	 * Get Troll Kit Potions Drunk
	 *
	 * @return Troll Potions Drunk
	 */
	public int getTrollKitPotionsDrunk() {
		return trollKitPotionsDrunk;
	}

	/**
	 * Get Troll Kit Potion Thrown
	 *
	 * @return Troll Potions Thrown
	 */
	public int getTrollKitPotionsThrown() {
		return trollKitPotionsThrown;
	}

	/**
	 * Get Troll Kit Egg Thrown
	 *
	 * @return Troll Egg Thrown
	 */
	public int getTrollKitEggThrown() {
		return trollKitEggThrown;
	}

	/**
	 * Get Troll Kit Mobs Spawned
	 *
	 * @return Troll Mobs Spawned
	 */
	public int getTrollKitMobsSpawned() {
		return trollKitMobsSpawned;
	}


	/**
	 * Get Viking Kit Experience
	 *
	 * @return Viking Exp
	 */
	public int getVikingKitExp() {
		return vikingKitExp;
	}

	/**
	 * Get Viking Kit Wins
	 *
	 * @return Viking Wins
	 */
	public int getVikingKitWins() {
		return vikingKitWins;
	}

	/**
	 * Get Viking Kit Wins Team
	 *
	 * @return Viking Wins Team
	 */
	public int getVikingKitWinsTeam() {
		return vikingKitWinsTeam;
	}

	/**
	 * Get Viking Kit Games Played
	 *
	 * @return Viking Games Played
	 */
	public int getVikingKitGamesPlayed() {
		return vikingKitGamesPlayed;
	}

	/**
	 * Get Viking Kit Time played
	 *
	 * @return Viking Time Played
	 */
	public int getVikingKitTimePlayed() {
		return vikingKitTimePlayed;
	}

	/**
	 * Get Viking Kit Kills
	 *
	 * @return Viking Kills
	 */
	public int getVikingKitKills() {
		return vikingKitKills;
	}

	/**
	 * Get Viking Kit Taunt Kills
	 *
	 * @return Viking Taunt Kills
	 */
	public int getVikingKitTauntKills() {
		return vikingKitTauntKills;
	}

	/**
	 * Get Viking Kit Damage
	 *
	 * @return Viking Damage
	 */
	public int getVikingKitDamage() {
		return vikingKitDamage;
	}

	/**
	 * Get Viking Kit Damage Taken
	 *
	 * @return Viking Damage Taken
	 */
	public int getVikingKitDamageTaken() {
		return vikingKitDamageTaken;
	}

	/**
	 * Get Viking Kit Fall Damage
	 *
	 * @return Viking Fall Damage
	 */
	public int getVikingKitFallDamage() {
		return vikingKitFallDamage;
	}

	/**
	 * Get Viking Kit Chests Opened
	 *
	 * @return Viking Chests Opened
	 */
	public int getVikingKitChestsOpened() {
		return vikingKitChestsOpened;
	}

	/**
	 * Get Viking Kit Items Enchanted
	 *
	 * @return Viking Items Enchanted
	 */
	public int getVikingKitItemsEnchanted() {
		return vikingKitItemsEnchanted;
	}

	/**
	 * Get Viking Kit Arrows Fired
	 *
	 * @return Viking Arrows Fired
	 */
	public int getVikingKitArrowsFired() {
		return vikingKitArrowsFired;
	}

	/**
	 * Get Viking Kit Arrows Hit
	 *
	 * @return Viking Arrows Hit
	 */
	public int getVikingKitArrowsHit() {
		return vikingKitArrowsHit;
	}

	/**
	 * Get Viking Kit Potions Drunk
	 *
	 * @return Viking Potions Drunk
	 */
	public int getVikingKitPotionsDrunk() {
		return vikingKitPotionsDrunk;
	}

	/**
	 * Get Viking Kit Potion Thrown
	 *
	 * @return Viking Potions Thrown
	 */
	public int getVikingKitPotionsThrown() {
		return vikingKitPotionsThrown;
	}

	/**
	 * Get Viking Kit Egg Thrown
	 *
	 * @return Viking Egg Thrown
	 */
	public int getVikingKitEggThrown() {
		return vikingKitEggThrown;
	}

	/**
	 * Get Viking Kit Mobs Spawned
	 *
	 * @return Viking Mobs Spawned
	 */
	public int getVikingKitMobsSpawned() {
		return vikingKitMobsSpawned;
	}


	/**
	 * Get Warlock Kit Experience
	 *
	 * @return Warlock Exp
	 */
	public int getWarlockKitExp() {
		return warlockKitExp;
	}

	/**
	 * Get Warlock Kit Wins
	 *
	 * @return Warlock Wins
	 */
	public int getWarlockKitWins() {
		return warlockKitWins;
	}

	/**
	 * Get Warlock Kit Wins Team
	 *
	 * @return Warlock Wins Team
	 */
	public int getWarlockKitWinsTeam() {
		return warlockKitWinsTeam;
	}

	/**
	 * Get Warlock Kit Games Played
	 *
	 * @return Warlock Games Played
	 */
	public int getWarlockKitGamesPlayed() {
		return warlockKitGamesPlayed;
	}

	/**
	 * Get Warlock Kit Time played
	 *
	 * @return Warlock Time Played
	 */
	public int getWarlockKitTimePlayed() {
		return warlockKitTimePlayed;
	}

	/**
	 * Get Warlock Kit Kills
	 *
	 * @return Warlock Kills
	 */
	public int getWarlockKitKills() {
		return warlockKitKills;
	}

	/**
	 * Get Warlock Kit Taunt Kills
	 *
	 * @return Warlock Taunt Kills
	 */
	public int getWarlockKitTauntKills() {
		return warlockKitTauntKills;
	}

	/**
	 * Get Warlock Kit Damage
	 *
	 * @return Warlock Damage
	 */
	public int getWarlockKitDamage() {
		return warlockKitDamage;
	}

	/**
	 * Get Warlock Kit Damage Taken
	 *
	 * @return Warlock Damage Taken
	 */
	public int getWarlockKitDamageTaken() {
		return warlockKitDamageTaken;
	}

	/**
	 * Get Warlock Kit Fall Damage
	 *
	 * @return Warlock Fall Damage
	 */
	public int getWarlockKitFallDamage() {
		return warlockKitFallDamage;
	}

	/**
	 * Get Warlock Kit Chests Opened
	 *
	 * @return Warlock Chests Opened
	 */
	public int getWarlockKitChestsOpened() {
		return warlockKitChestsOpened;
	}

	/**
	 * Get Warlock Kit Items Enchanted
	 *
	 * @return Warlock Items Enchanted
	 */
	public int getWarlockKitItemsEnchanted() {
		return warlockKitItemsEnchanted;
	}

	/**
	 * Get Warlock Kit Arrows Fired
	 *
	 * @return Warlock Arrows Fired
	 */
	public int getWarlockKitArrowsFired() {
		return warlockKitArrowsFired;
	}

	/**
	 * Get Warlock Kit Arrows Hit
	 *
	 * @return Warlock Arrows Hit
	 */
	public int getWarlockKitArrowsHit() {
		return warlockKitArrowsHit;
	}

	/**
	 * Get Warlock Kit Potions Drunk
	 *
	 * @return Warlock Potions Drunk
	 */
	public int getWarlockKitPotionsDrunk() {
		return warlockKitPotionsDrunk;
	}

	/**
	 * Get Warlock Kit Potion Thrown
	 *
	 * @return Warlock Potions Thrown
	 */
	public int getWarlockKitPotionsThrown() {
		return warlockKitPotionsThrown;
	}

	/**
	 * Get Warlock Kit Egg Thrown
	 *
	 * @return Warlock Egg Thrown
	 */
	public int getWarlockKitEggThrown() {
		return warlockKitEggThrown;
	}

	/**
	 * Get Warlock Kit Mobs Spawned
	 *
	 * @return Warlock Mobs Spawned
	 */
	public int getWarlockKitMobsSpawned() {
		return warlockKitMobsSpawned;
	}


	/**
	 * Get Warrior Kit Experience
	 *
	 * @return Warrior Exp
	 */
	public int getWarriorKitExp() {
		return warriorKitExp;
	}

	/**
	 * Get Warrior Kit Wins
	 *
	 * @return Warrior Wins
	 */
	public int getWarriorKitWins() {
		return warriorKitWins;
	}

	/**
	 * Get Warrior Kit Wins Team
	 *
	 * @return Warrior Wins Team
	 */
	public int getWarriorKitWinsTeam() {
		return warriorKitWinsTeam;
	}

	/**
	 * Get Warrior Kit Games Played
	 *
	 * @return Warrior Games Played
	 */
	public int getWarriorKitGamesPlayed() {
		return warriorKitGamesPlayed;
	}

	/**
	 * Get Warrior Kit Time played
	 *
	 * @return Warrior Time Played
	 */
	public int getWarriorKitTimePlayed() {
		return warriorKitTimePlayed;
	}

	/**
	 * Get Warrior Kit Kills
	 *
	 * @return Warrior Kills
	 */
	public int getWarriorKitKills() {
		return warriorKitKills;
	}

	/**
	 * Get Warrior Kit Taunt Kills
	 *
	 * @return Warrior Taunt Kills
	 */
	public int getWarriorKitTauntKills() {
		return warriorKitTauntKills;
	}

	/**
	 * Get Warrior Kit Damage
	 *
	 * @return Warrior Damage
	 */
	public int getWarriorKitDamage() {
		return warriorKitDamage;
	}

	/**
	 * Get Warrior Kit Damage Taken
	 *
	 * @return Warrior Damage Taken
	 */
	public int getWarriorKitDamageTaken() {
		return warriorKitDamageTaken;
	}

	/**
	 * Get Warrior Kit Fall Damage
	 *
	 * @return Warrior Fall Damage
	 */
	public int getWarriorKitFallDamage() {
		return warriorKitFallDamage;
	}

	/**
	 * Get Warrior Kit Chests Opened
	 *
	 * @return Warrior Chests Opened
	 */
	public int getWarriorKitChestsOpened() {
		return warriorKitChestsOpened;
	}

	/**
	 * Get Warrior Kit Items Enchanted
	 *
	 * @return Warrior Items Enchanted
	 */
	public int getWarriorKitItemsEnchanted() {
		return warriorKitItemsEnchanted;
	}

	/**
	 * Get Warrior Kit Arrows Fired
	 *
	 * @return Warrior Arrows Fired
	 */
	public int getWarriorKitArrowsFired() {
		return warriorKitArrowsFired;
	}

	/**
	 * Get Warrior Kit Arrows Hit
	 *
	 * @return Warrior Arrows Hit
	 */
	public int getWarriorKitArrowsHit() {
		return warriorKitArrowsHit;
	}

	/**
	 * Get Warrior Kit Potions Drunk
	 *
	 * @return Warrior Potions Drunk
	 */
	public int getWarriorKitPotionsDrunk() {
		return warriorKitPotionsDrunk;
	}

	/**
	 * Get Warrior Kit Potion Thrown
	 *
	 * @return Warrior Potions Thrown
	 */
	public int getWarriorKitPotionsThrown() {
		return warriorKitPotionsThrown;
	}

	/**
	 * Get Warrior Kit Egg Thrown
	 *
	 * @return Warrior Egg Thrown
	 */
	public int getWarriorKitEggThrown() {
		return warriorKitEggThrown;
	}

	/**
	 * Get Warrior Kit Mobs Spawned
	 *
	 * @return Warrior Mobs Spawned
	 */
	public int getWarriorKitMobsSpawned() {
		return warriorKitMobsSpawned;
	}


	/**
	 * Get Wolf Tamer Kit Experience
	 *
	 * @return Wolf Tamer Exp
	 */
	public int getWolfTamerKitExp() {
		return wolfTamerKitExp;
	}

	/**
	 * Get Wolf Tamer Kit Wins
	 *
	 * @return Wolf Tamer Wins
	 */
	public int getWolfTamerKitWins() {
		return wolfTamerKitWins;
	}

	/**
	 * Get Wolf Tamer Kit Wins Team
	 *
	 * @return Wolf Tamer Wins Team
	 */
	public int getWolfTamerKitWinsTeam() {
		return wolfTamerKitWinsTeam;
	}

	/**
	 * Get Wolf Tamer Kit Games Played
	 *
	 * @return Wolf Tamer Games Played
	 */
	public int getWolfTamerKitGamesPlayed() {
		return wolfTamerKitGamesPlayed;
	}

	/**
	 * Get Wolf Tamer Kit Time played
	 *
	 * @return Wolf Tamer Time Played
	 */
	public int getWolfTamerKitTimePlayed() {
		return wolfTamerKitTimePlayed;
	}

	/**
	 * Get Wolf Tamer Kit Kills
	 *
	 * @return Wolf Tamer Kills
	 */
	public int getWolfTamerKitKills() {
		return wolfTamerKitKills;
	}

	/**
	 * Get Wolf Tamer Kit Taunt Kills
	 *
	 * @return Wolf Tamer Taunt Kills
	 */
	public int getWolfTamerKitTauntKills() {
		return wolfTamerKitTauntKills;
	}

	/**
	 * Get Wolf Tamer Kit Damage
	 *
	 * @return Wolf Tamer Damage
	 */
	public int getWolfTamerKitDamage() {
		return wolfTamerKitDamage;
	}

	/**
	 * Get Wolf Tamer Kit Damage Taken
	 *
	 * @return Wolf Tamer Damage Taken
	 */
	public int getWolfTamerKitDamageTaken() {
		return wolfTamerKitDamageTaken;
	}

	/**
	 * Get Wolf Tamer Kit Fall Damage
	 *
	 * @return Wolf Tamer Fall Damage
	 */
	public int getWolfTamerKitFallDamage() {
		return wolfTamerKitFallDamage;
	}

	/**
	 * Get Wolf Tamer Kit Chests Opened
	 *
	 * @return Wolf Tamer Chests Opened
	 */
	public int getWolfTamerKitChestsOpened() {
		return wolfTamerKitChestsOpened;
	}

	/**
	 * Get Wolf Tamer Kit Items Enchanted
	 *
	 * @return Wolf Tamer Items Enchanted
	 */
	public int getWolfTamerKitItemsEnchanted() {
		return wolfTamerKitItemsEnchanted;
	}

	/**
	 * Get Wolf Tamer Kit Arrows Fired
	 *
	 * @return Wolf Tamer Arrows Fired
	 */
	public int getWolfTamerKitArrowsFired() {
		return wolfTamerKitArrowsFired;
	}

	/**
	 * Get Wolf Tamer Kit Arrows Hit
	 *
	 * @return Wolf Tamer Arrows Hit
	 */
	public int getWolfTamerKitArrowsHit() {
		return wolfTamerKitArrowsHit;
	}

	/**
	 * Get Wolf Tamer Kit Potions Drunk
	 *
	 * @return Wolf Tamer Potions Drunk
	 */
	public int getWolfTamerKitPotionsDrunk() {
		return wolfTamerKitPotionsDrunk;
	}

	/**
	 * Get Wolf Tamer Kit Potion Thrown
	 *
	 * @return Wolf Tamer Potions Thrown
	 */
	public int getWolfTamerKitPotionsThrown() {
		return wolfTamerKitPotionsThrown;
	}

	/**
	 * Get Wolf Tamer Kit Egg Thrown
	 *
	 * @return Wolf Tamer Egg Thrown
	 */
	public int getWolfTamerKitEggThrown() {
		return wolfTamerKitEggThrown;
	}

	/**
	 * Get Wolf Tamer Kit Mobs Spawned
	 *
	 * @return Wolf Tamer Mobs Spawned
	 */
	public int getWolfTamerKitMobsSpawned() {
		return wolfTamerKitMobsSpawned;
	}

	@Override
	public String toString() {
		return "HungerGames{" +
				"coins=" + coins +
				", taunt='" + taunt + '\'' +
				", victoryDance='" + victoryDance + '\'' +
				", deaths=" + deaths +
				", kills=" + kills +
				", unlockedPackages=" + unlockedPackages +
				", wins=" + wins +
				", teamWins=" + teamWins +
				", defaultKit='" + defaultKit + '\'' +
				", finisher='" + finisher + '\'' +
				", combatTracker=" + combatTracker +
				", autoArmor=" + autoArmor +
				", tauntKills=" + tauntKills +
				", potionDrunk=" + potionDrunk +
				", damage=" + damage +
				", mobsSpawned=" + mobsSpawned +
				", timePlayed=" + timePlayed +
				", chestsOpened=" + chestsOpened +
				", arrowsHit=" + arrowsHit +
				", damageTaken=" + damageTaken +
				", gamesPlayed=" + gamesPlayed +
				", potionThrown=" + potionThrown +
				", arrowsFired=" + arrowsFired +
				", blitzStarUses=" + blitzStarUses +
				", soloNormalWins=" + soloNormalWins +
				", teamNormalWins=" + teamNormalWins +
				", soloNormalKills=" + soloNormalKills +
				", soloChaosWins=" + soloChaosWins +
				", soloChaosKills=" + soloChaosKills +
				'}';
	}
}
