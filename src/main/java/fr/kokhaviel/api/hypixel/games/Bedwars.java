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
 * Bedwars Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Bedwars {

	/**
	 * Packages (Cosmetics) Unlocked
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Bedwars Experience of the Player
	 */
	@SerializedName("Experience")
	int experience = 0;

	/**
	 * Bedwars Boxes of the Player
	 */
	@SerializedName("bedwars_boxes")
	int boxes = 0;

	/**
	 * Loot Chest History (5 Items)
	 */
	@SerializedName("chest_history_new")
	List<String> chestHistory = new ArrayList<>();

	/**
	 * Current Bedwars Island Topper of the Player
	 */
	@SerializedName("activeIslandTopper")
	String islandTopper = "";

	/**
	 * Current Bedwars Glyph of the Player
	 */
	@SerializedName("activeGlyph")
	String glyph = "";

	/**
	 * Bedwars Final Deaths of the Player
	 */
	@SerializedName("final_deaths_bedwars")
	int finalDeaths = 0;

	/**
	 * Bedwars Gold Collected by the Player
	 */
	@SerializedName("gold_resources_collected_bedwars")
	int goldCollected = 0;

	/**
	 * Bedwars Diamonds Collected by the Player
	 */
	@SerializedName("diamond_resources_collected_bedwars")
	int diamondsCollected = 0;

	/**
	 * Bedwars Deaths of the Player
	 */
	@SerializedName("deaths_bedwars")
	int deaths = 0;

	/**
	 * Bedwars Void Deaths of the Player
	 */
	@SerializedName("void_deaths_bedwars")
	int voidDeaths = 0;

	/**
	 * Bedwars Resources Collected by the Player
	 */
	@SerializedName("resources_collected_bedwars")
	int resourcesCollected = 0;

	/**
	 * Bedwars Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Bedwars Games Played of the Player
	 */
	@SerializedName("games_played_bedwars")
	int gamesPlayed = 0;

	/**
	 * Bedwars Beds Lost by the Player
	 */
	@SerializedName("beds_lost_bedwars")
	int bedsLost = 0;

	/**
	 * Bedwars Void Final Deaths of the Player
	 */
	@SerializedName("void_final_deaths_bedwars")
	int voidFinalDeaths = 0;

	/**
	 * Bedwars Losses of the Player
	 */
	@SerializedName("losses_bedwars")
	int losses = 0;

	/**
	 * Bedwars Items Purchased by the Player
	 */
	@SerializedName("items_purchased_bedwars")
	int itemsPurchased = 0;

	/**
	 * Bedwars Final Kills of the Player
	 */
	@SerializedName("final_kills_bedwars")
	int finalKills = 0;

	/**
	 * Bedwars Iron Collected by the Player
	 */
	@SerializedName("iron_resources_collected_bedwars")
	int ironCollected = 0;

	/**
	 * Bedwars Beds Broken by the Player
	 */
	@SerializedName("beds_broken_bedwars")
	int bedsBroken = 0;

	/**
	 * Bedwars Current Winstreak of the Player
	 */
	@SerializedName("winstreak")
	int winstreak = 0;

	/**
	 * Bedwars Void Kills of the Player
	 */
	@SerializedName("void_kills_bedwars")
	int voidKills = 0;

	/**
	 * Bedwars Kills of the Player
	 */
	@SerializedName("kills_bedwars")
	int kills = 0;

	/**
	 * Bedwars Void Final Kills of the Player
	 */
	@SerializedName("void_final_kills_bedwars")
	int voidFinalKills = 0;

	/**
	 * Bedwars Wins of the Player
	 */
	@SerializedName("wins_bedwars")
	int wins = 0;

	/**
	 * Bedwars Emerald Collected by the Player
	 */
	@SerializedName("emerald_resources_collected_bedwars")
	int emeraldCollected = 0;

	/**
	 * Bedwars Current Death Cry of the Player
	 */
	@SerializedName("activeDeathCry")
	String deathCry = "";

	/**
	 * Bedwars Current Projectile Trail of the Player
	 */
	@SerializedName("activeProjectileTrail")
	String projectileTrail = "";

	/**
	 * Bedwars Current Sprays of the Player
	 */
	@SerializedName("activeSprays")
	String sprays = "";

	/**
	 * Bedwars Glyph Shield of the Player
	 */
	@SerializedName("spray_glyph_field")
	String glyphShield = "";

	/**
	 * Bedwars Fall Kills of the Player
	 */
	@SerializedName("fall_kills_bedwars")
	int fallKills = 0;

	/**
	 * Bedwars Fall Deaths of the Player
	 */
	@SerializedName("fall_deaths_bedwars")
	int fallsDeaths = 0;

	/**
	 * Bedwars Projectile Deaths of the Player
	 */
	@SerializedName("projectile_deaths_bedwars")
	int projectileDeaths = 0;

	/**
	 * Bedwars Current NPC Skin of the Player
	 */
	@SerializedName("activeNPCSkin")
	String npcSkin = "";

	/**
	 * Bedwars Current Victory Dance of the Player
	 */
	@SerializedName("activeVictoryDance")
	String victoryDance = "";

	/**
	 * Bedwars Current Kill Messages
	 */
	@SerializedName("activeKillMessages")
	String killMessages = "";

	/**
	 * Bedwars Fall Final Kills of the Player
	 */
	@SerializedName("fall_final_kills_bedwars")
	int fallFinalKills = 0;

	/**
	 * Bedwars Current Kill Effect of the Player
	 */
	@SerializedName("activeKillEffect")
	String killEffect = "";

	/**
	 * Bedwars Favourites Items (1/2) of the Player
	 */
	@SerializedName("favourites_1")
	String favourite1 = "";

	/**
	 * Bedwars Projectile Final Deaths of the Player
	 */
	@SerializedName("projectile_final_deaths_bedwars")
	int projectileFinalDeaths = 0;

	/**
	 * Bedwars Projectile Kills of the Player
	 */
	@SerializedName("projectile_kills_bedwars")
	int projectileKills = 0;

	/**
	 * Bedwars Fall Final Deaths of the Player
	 */
	@SerializedName("fall_final_deaths_bedwars")
	int fallFinalDeaths = 0;

	/**
	 * Bedwars Projectile Final Kills of the Player
	 */
	@SerializedName("projectile_final_kills_bedwars")
	int projectileFinalKills = 0;

	/**
	 * Bedwars Favourite Items (2/2) of the Player
	 */
	@SerializedName("favourites_2")
	String favourite2 = "";

	/**
	 * Bedwars Current Bed Destroy Effect of the Player
	 */
	@SerializedName("activeBedDestroy")
	String bedDestroyEffect = "";

	/**
	 * Bedwars Current Selected Ultimate of the Player (Ultimate Mode)
	 */
	@SerializedName("selected_ultimate")
	String selectedUltimate = "";

	/**
	 * Bedwars Permanent Items Purchased by the Player
	 */
	@SerializedName("permanent_items_purchased_bedwars")
	int permanentItemsPurchased = 0;

	/**
	 * Solo Bedwars Beds Lost of the Player
	 */
	@SerializedName("eight_one_beds_lost_bedwars")
	int soloBedsLost = 0;

	/**
	 * Bedwars Solo Final Deaths
	 */
	@SerializedName("eight_one_final_deaths_bedwars")
	int soloFinalDeaths = 0;

	/**
	 * Bedwars Solo Deaths of the Player
	 */
	@SerializedName("eight_one_deaths_bedwars")
	int soloDeaths = 0;

	/**
	 * Bedwars Solo Void Deaths of the Player
	 */
	@SerializedName("eight_one_void_deaths_bedwars")
	int soloVoidDeaths = 0;

	/**
	 * Bedwars Solo Games Played by the Player
	 */
	@SerializedName("eight_one_games_played_bedwars")
	int soloGamesPlayed = 0;

	/**
	 * Bedwars Solo Final Kills of the Player
	 */
	@SerializedName("eight_one_final_kills_bedwars")
	int soloFinalKills = 0;

	/**
	 * Bedwars Beds Broken by the Player
	 */
	@SerializedName("eight_one_beds_broken_bedwars")
	int soloBedsBroken = 0;

	/**
	 * Bedwars Solo Permanent Items Purchased by the Player
	 */
	@SerializedName("eight_one_permanent_items_purchased_bedwars")
	int soloPermanentItemsPurchased = 0;

	/**
	 * Bedwars Solo Projectile Final Kills of the Player
	 */
	@SerializedName("eight_one_projectile_final_kills_bedwars")
	int soloProjectileFinalKills = 0;

	/**
	 * Bedwars Solo Losses of the Player
	 */
	@SerializedName("eight_one_losses_bedwars")
	int soloLosses = 0;

	/**
	 * Bedwars Solo Iron Collected by the Player
	 */
	@SerializedName("eight_one_iron_resources_collected_bedwars")
	int soloIronCollected = 0;

	/**
	 * Bedwars Solo Diamonds Collected by the Player
	 */
	@SerializedName("eight_one_diamond_resources_collected_bedwars")
	int soloDiamondsCollected = 0;

	/**
	 * Bedwars Solo Void Final Deaths of the Player
	 */
	@SerializedName("eight_one_void_final_deaths_bedwars")
	int soloVoidFinalDeaths = 0;

	/**
	 * Bedwars Solo Resources Collected by the Player
	 */
	@SerializedName("eight_one_resources_collected_bedwars")
	int soloResourcesCollected = 0;

	/**
	 * Bedwars Solo Gold Resources by the Player
	 */
	@SerializedName("eight_one_gold_resources_collected_bedwars")
	int soloGoldCollected = 0;

	/**
	 * Bedwars Solo Void Kills of the Player
	 */
	@SerializedName("eight_one_void_kills_bedwars")
	int soloVoidKills = 0;

	/**
	 * Bedwars Solo Void Final Kills of the Player
	 */
	@SerializedName("eight_one_void_final_kills_bedwars")
	int soloVoidFinalKills = 0;

	/**
	 * Bedwars Solo Kills of the Player
	 */
	@SerializedName("eight_one_kills_bedwars")
	int soloKills = 0;

	/**
	 * Bedwars Solo Emerald Collected by the Player
	 */
	@SerializedName("eight_one_emerald_resources_collected_bedwars")
	int soloEmeraldCollected = 0;

	/**
	 * Bedwars Solo Wins of the Player
	 */
	@SerializedName("eight_one_wins_bedwars")
	int soloWins = 0;

	/**
	 * Bedwars Solo Fall Final Deaths of the Player
	 */
	@SerializedName("eight_one_fall_final_deaths_bedwars")
	int soloFallFinalDeaths = 0;

	/**
	 * Bedwars Solo Fall Final Kills of the Player
	 */
	@SerializedName("eight_one_fall_final_kills_bedwars")
	int soloFallFinalKills = 0;

	/**
	 * Bedwars Solo Fall Kills of the Player
	 */
	@SerializedName("eight_one_fall_kills_bedwars")
	int soloFallKills = 0;

	/**
	 * Bedwars Solo Projectile Deaths of the Player
	 */
	@SerializedName("eight_one_projectile_deaths_bedwars")
	int soloProjectileDeaths = 0;

	/**
	 * Bedwars Current Solo Winstreak of the Player
	 */
	@SerializedName("eight_one_winstreak")
	int soloWinstreak = 0;

	/**
	 * Bedwars Double Void Deaths of the Player
	 */
	@SerializedName("eight_two_void_deaths_bedwars")
	int doubleVoidDeaths = 0;

	/**
	 * Bedwars Double Resources Collected by the Player
	 */
	@SerializedName("eight_two_resources_collected_bedwars")
	int doubleResourcesCollected = 0;

	/**
	 * Bedwars Double Kills of the Player
	 */
	@SerializedName("eight_two_kills_bedwars")
	int doubleKills = 0;

	/**
	 * Bedwars Double Iron Collected by the Player
	 */
	@SerializedName("eight_two_iron_resources_collected_bedwars")
	int doubleIronCollected = 0;

	/**
	 * Bedwars Double Void Kills of the Player
	 */
	@SerializedName("eight_two_void_kills_bedwars")
	int doubleVoidKills = 0;

	/**
	 * Bedwars Double Final Deaths of the Player
	 */
	@SerializedName("eight_two_final_deaths_bedwars")
	int doubleFinalDeaths = 0;

	/**
	 * Bedwars Double Void Final Deaths of the Player
	 */
	@SerializedName("eight_two_void_final_deaths_bedwars")
	int doubleVoidFinalDeaths = 0;

	/**
	 * Bedwars Double Deaths of the Player
	 */
	@SerializedName("eight_two_deaths_bedwars")
	int doubleDeaths = 0;

	/**
	 * Bedwars Double Games Played by the Player
	 */
	@SerializedName("eight_two_games_played_bedwars")
	int doubleGamesPlayed = 0;

	/**
	 * Bedwars Double Items Purchased by the Player
	 */
	@SerializedName("eight_two_items_purchased_bedwars")
	int doubleItemsPurchased = 0;

	/**
	 * Bedwars Double Beds Lost of the Player
	 */
	@SerializedName("eight_two_beds_lost_bedwars")
	int doubleBedsLost = 0;

	/**
	 * Bedwars Double Gold Collected by the Player
	 */
	@SerializedName("eight_two_gold_resources_collected_bedwars")
	int doubleGoldCollected = 0;

	/**
	 * Bedwars Double Losses of the Player
	 */
	@SerializedName("eight_two_losses_bedwars")
	int doubleLosses = 0;

	/**
	 * Bedwars Double Final kills of the Player
	 */
	@SerializedName("eight_two_final_kills_bedwars")
	int doubleFinalKills = 0;

	/**
	 * Bedwars Double Diamonds Collected by the Player
	 */
	@SerializedName("eight_two_diamond_resources_collected_bedwars")
	int doubleDiamondsCollected = 0;

	/**
	 * Bedwars Double Emerald Collected by the Player
	 */
	@SerializedName("eight_two_emerald_resources_collected_bedwars")
	int doubleEmeraldCollected = 0;

	/**
	 * Bedwars Double Beds Broken by the Player
	 */
	@SerializedName("eight_two_beds_broken_bedwars")
	int doubleBedsBroken = 0;

	/**
	 * Bedwars Double Wins of the Player
	 */
	@SerializedName("eight_two_wins_bedwars")
	int doubleWins = 0;

	/**
	 * Bedwars Double Void Final Kills of the Player
	 */
	@SerializedName("eight_two_void_final_kills_bedwars")
	int doubleVoidFinalKills = 0;

	/**
	 * Bedwars Double Fall Deaths of the Player
	 */
	@SerializedName("eight_two_fall_deaths_bedwars")
	int doubleFallDeaths = 0;

	/**
	 * Bedwars Double Projectile Deaths of the Player
	 */
	@SerializedName("eight_two_projectile_deaths_bedwars")
	int doubleProjectileDeaths = 0;

	/**
	 * Bedwars Double Fall Kills of the Player
	 */
	@SerializedName("eight_two_fall_kills_bedwars")
	int doubleFallKills = 0;

	/**
	 * Bedwars Double Projectile Final Kills of the Player
	 */
	@SerializedName("eight_two_projectile_final_kills_bedwars")
	int doubleProjectileFinalKills = 0;

	/**
	 * Bedwars Double Fall Final Kills
	 */
	@SerializedName("eight_two_fall_final_kills_bedwars")
	int doubleFallFinalKills = 0;

	/**
	 * Bedwars Double Fall Final Deaths of the Player
	 */
	@SerializedName("eight_two_fall_final_deaths_bedwars")
	int doubleFallFinalDeaths = 0;

	/**
	 * Bedwars Double Projectile Final Deaths of the Player
	 */
	@SerializedName("eight_two_projectile_final_deaths_bedwars")
	int doubleProjectileFinalDeaths = 0;

	/**
	 * Bedwars Current Double Winstreak of the Player
	 */
	@SerializedName("eight_two_winstreak")
	int doubleWinstreak = 0;

	/**
	 * Bedwars Double Projectile Kills of the Player
	 */
	@SerializedName("eight_two_projectile_kills_bedwars")
	int doubleProjectileKills = 0;

	/**
	 * Bedwars Double Permanent Items Purchased by the Player
	 */
	@SerializedName("eight_two_permanent_items_purchased_bedwars")
	int doublePermanentItemsPurchased = 0;

	/**
	 * Bedwars 3v3v3v3 Void Final Kills of the Player
	 */
	@SerializedName("four_three_void_final_kills_bedwars")
	int threeVoidFinalKills = 0;

	/**
	 * Bedwars 3v3v3v3 Void Kills of the Player
	 */
	@SerializedName("four_three_void_kills_bedwars")
	int threeVoidKills = 0;

	/**
	 * Bedwars 3v3v3v3 Iron Collected by the Player
	 */
	@SerializedName("four_three_iron_resources_collected_bedwars")
	int threeIronCollected = 0;

	/**
	 * Bedwars 3v3v3v3 Games Played of the Player
	 */
	@SerializedName("four_three_games_played_bedwars")
	int threeGamesPlayed = 0;

	/**
	 * Bedwars 3v3v3v3 Void Deaths of the Player
	 */
	@SerializedName("four_three_void_deaths_bedwars")
	int threeVoidDeaths = 0;

	/**
	 * Bedwars 3v3v3v3 Beds Lost by the Player
	 */
	@SerializedName("four_three_beds_lost_bedwars")
	int threeBedsLost = 0;

	/**
	 * Bedwars 3v3v3v3 Gold Collected by the Player
	 */
	@SerializedName("four_three_gold_resources_collected_bedwars")
	int threeGoldCollected = 0;

	/**
	 * Bedwars 3v3v3v3 Deaths of the Player
	 */
	@SerializedName("four_three_deaths_bedwars")
	int threeDeaths = 0;

	/**
	 * Bedwars 3v3v3v3 Beds Broken by the Player
	 */
	@SerializedName("four_three_beds_broken_bedwars")
	int threeBedsBroken = 0;

	/**
	 * Bedwars 3v3v3v3 Losses of the Player
	 */
	@SerializedName("four_three_losses_bedwars")
	int threeLosses = 0;

	/**
	 * Bedwars 3v3v3v3 Diamonds Collected by the Player
	 */
	@SerializedName("four_three_diamond_resources_collected_bedwars")
	int threeDiamondsCollected = 0;

	/**
	 * Bedwars 3v3v3v3 Final Kills of the Player
	 */
	@SerializedName("four_three_final_kills_bedwars")
	int threeFinalKills = 0;

	/**
	 * Bedwars 3v3v3v3 Items Purchased by the Player
	 */
	@SerializedName("four_three_items_purchased_bedwars")
	int threeItemsPurchased = 0;

	/**
	 * Bedwars 3v3v3v3 Kills of the Player
	 */
	@SerializedName("four_three_kills_bedwars")
	int threeKills = 0;

	/**
	 * Bedwars 3v3v3v3 Final Deaths of the Player
	 */
	@SerializedName("four_three_final_deaths_bedwars")
	int threeFinalDeaths = 0;

	/**
	 * Bedwars 3v3v3v3 Resources Collected by the Player
	 */
	@SerializedName("four_three_resources_collected_bedwars")
	int threeResourcesCollected = 0;

	/**
	 * Bedwars 3v3v3v3 Emerald Collected by the Player
	 */
	@SerializedName("four_three_emerald_resources_collected_bedwars")
	int threeEmeraldCollected = 0;

	/**
	 * Bedwars 3v3v3v3 Void Final Deaths of the Player
	 */
	@SerializedName("four_three_void_final_deaths_bedwars")
	int threeVoidFinalDeaths = 0;

	/**
	 * Bedwars 3v3v3v3 Wins of the Player
	 */
	@SerializedName("four_three_wins_bedwars")
	int threeWins = 0;

	/**
	 * Bedwars 3v3v3v3 Projectile Deaths of the Player
	 */
	@SerializedName("four_three_projectile_deaths_bedwars")
	int threeProjectileDeaths = 0;

	/**
	 * Bedwars 3v3v3v3 Fall Kills of the Player
	 */
	@SerializedName("four_three_fall_kills_bedwars")
	int threeFallKills = 0;

	/**
	 * Bedwars 3v3v3v3 Projectile Final Kills of the Player
	 */
	@SerializedName("four_three_projectile_final_kills_bedwars")
	int threeProjectileFinalKills = 0;

	/**
	 * Bedwars 3v3v3v3 Fall Final Kills of the Player
	 */
	@SerializedName("four_three_fall_final_kills_bedwars")
	int threeFallFinalKills = 0;

	/**
	 * Bedwars Solo Fall Deaths of the Player
	 */
	@SerializedName("eight_one_fall_deaths_bedwars")
	int soloFallDeaths = 0;

	/**
	 * Bedwars 3v3v3v3 Fall Deaths of the Player
	 */
	@SerializedName("four_three_fall_deaths_bedwars")
	int threeFallDeaths = 0;

	/**
	 * Bedwars 3v3v3v3 Projectile Kills of the Player
	 */
	@SerializedName("four_three_projectile_kills_bedwars")
	int threeProjectileKills = 0;

	/**
	 * Bedwars 3v3v3v3 Fall Final Deaths of the Player
	 */
	@SerializedName("four_three_fall_final_deaths_bedwars")
	int threeFallFinalDeaths = 0;

	/**
	 * Bedwars Current 3v3v3v3 Winstreak of the Player
	 */
	@SerializedName("four_three_winstreak")
	int threeWinstreak = 0;

	/**
	 * Bedwars 3v3v3v3 Permanent Items Purchased by the Player
	 */
	@SerializedName("four_three_permanent_items_purchased_bedwars")
	int threePermanentItemsPurchased = 0;

	/**
	 * Bedwars 4v4v4v4 Void Kills of the Player
	 */
	@SerializedName("four_four_void_kills_bedwars")
	int fourVoidKills = 0;

	/**
	 * Bedwars 4v4v4v4 Kills of the Player
	 */
	@SerializedName("four_four_kills_bedwars")
	int fourKills = 0;

	/**
	 * Bedwars 4v4v4v4 Final Deaths of the Player
	 */
	@SerializedName("four_four_final_deaths_bedwars")
	int fourFinalDeaths = 0;

	/**
	 * Bedwars 4v4v4v4 Gold Collected by the Player
	 */
	@SerializedName("four_four_gold_resources_collected_bedwars")
	int fourGoldCollected = 0;

	/**
	 * Bedwars 4v4v4v4 Beds Lost of the Player
	 */
	@SerializedName("four_four_beds_lost_bedwars")
	int fourBedsLost = 0;

	/**
	 * Bedwars 4v4v4v4 Losses of the Player
	 */
	@SerializedName("four_four_losses_bedwars")
	int fourLosses = 0;

	/**
	 * Bedwars 4v4v4v4 Iron Collected by the Player
	 */
	@SerializedName("four_four_iron_resources_collected_bedwars")
	int fourIronCollected = 0;

	/**
	 * Bedwars 4v4v4v4 Games Played of the Player
	 */
	@SerializedName("four_four_games_played_bedwars")
	int fourGamesPlayed = 0;

	/**
	 * bedwars 4v4v4v4 Resources Collected by the Player
	 */
	@SerializedName("four_four_resources_collected_bedwars")
	int fourResourcesCollected = 0;

	/**
	 * Bedwars 4v4v4v4 Items Purchased by the player
	 */
	@SerializedName("four_four_items_purchased_bedwars")
	int fourItemsPurchased = 0;

	/**
	 * Bedwars 4v4v4v4 Wins of the Player
	 */
	@SerializedName("four_four_wins_bedwars")
	int fourWins = 0;

	/**
	 * Bedwars 4v4v4v4 Deaths of the Player
	 */
	@SerializedName("four_four_deaths_bedwars")
	int fourDeaths = 0;

	/**
	 * Bedwars 4v4v4v4 Diamonds Collected by the Player
	 */
	@SerializedName("four_four_diamond_resources_collected_bedwars")
	int fourDiamondsCollected = 0;

	/**
	 * Bedwars 4v4v4v4 Final Kills of the Player
	 */
	@SerializedName("four_four_void_final_kills_bedwars")
	int fourVoidFinalKills = 0;

	/**
	 * Bedwars 4v4v4v4 Void Deaths of the Player
	 */
	@SerializedName("four_four_void_deaths_bedwars")
	int fourVoidDeaths = 0;

	/**
	 * Bedwars 4v4v4v4 Final Kills of the Player
	 */
	@SerializedName("four_four_final_kills_bedwars")
	int fourFinalKills = 0;

	/**
	 * Bedwars 4v4v4v4 Emerald Collected by the Player
	 */
	@SerializedName("four_four_emerald_resources_collected_bedwars")
	int fourEmeraldCollected = 0;

	/**
	 * Bedwars 4v4v4v4 Void Final Deaths of the Player
	 */
	@SerializedName("four_four_void_final_deaths_bedwars")
	int fourVoidFinalDeaths = 0;

	/**
	 * Bedwars 4v4v4v4 Projectile Kills of the Player
	 */
	@SerializedName("four_four_projectile_kills_bedwars")
	int fourProjectileKills = 0;

	/**
	 * Bedwars 4v4v4v4 Fall Kills of the Player
	 */
	@SerializedName("four_four_fall_kills_bedwars")
	int fourFallKills = 0;

	/**
	 * Bedwars 4v4v4v4 Fall Deaths of the Player
	 */
	@SerializedName("four_four_fall_deaths_bedwars")
	int fourFallDeaths = 0;

	/**
	 * Bedwars 4v4v4v4 Beds Broken by the Player
	 */
	@SerializedName("four_four_beds_broken_bedwars")
	int fourBedsBroken = 0;

	/**
	 * Bedwars 4v4v4v4 Projectile Deaths of the Player
	 */
	@SerializedName("four_four_projectile_deaths_bedwars")
	int fourProjectileDeaths = 0;

	/**
	 * Bedwars 4v4v4v4 Fall Final Kills of the Player
	 */
	@SerializedName("four_four_fall_final_kills_bedwars")
	int fourFallFinalKills = 0;

	/**
	 * Bedwars 4v4v4v4 Projectile Final Deaths of the Player
	 */
	@SerializedName("four_four_projectile_final_deaths_bedwars")
	int fourProjectileFinalDeaths = 0;

	/**
	 * Bedwars 4v4v4v4 Fall Final Deaths of the Player
	 */
	@SerializedName("four_four_fall_final_deaths_bedwars")
	int fourFallFinalDeaths = 0;

	/**
	 * Bedwars Current 4v4v4v4 Winstreak of the Player
	 */
	@SerializedName("four_four_winstreak")
	int fourWinstreak = 0;

	/**
	 * Bedwars 4v4v4v4 Projectile Final Kills of the Player
	 */
	@SerializedName("four_four_projectile_final_kills_bedwars")
	int fourProjectileFinalKills = 0;

	/**
	 * Bedwars 4v4v4v4 Permanent Items Purchased by the Player
	 */
	@SerializedName("four_four_permanent_items_purchased_bedwars")
	int fourPermanentItemsPurchased = 0;

	/**
	 * Bedwars 4v4 Current Winstreak of the Player
	 */
	@SerializedName("two_four_winstreak")
	int twoFourWinstreak = 0;

	/**
	 * Bedwars 4v4 Deaths of the Player
	 */
	@SerializedName("two_four_deaths_bedwars")
	int twoFourDeaths = 0;

	/**
	 * Bedwars 4v4 Games Played by the Player
	 */
	@SerializedName("two_four_games_played_bedwars")
	int twoFourGamesPlayed = 0;

	/**
	 * Bedwars 4v4 Gold Collected by the Player
	 */
	@SerializedName("two_four_gold_resources_collected_bedwars")
	int twoFourGoldCollected = 0;

	/**
	 * Bedwars 4v4 Iron Collected by the Player
	 */
	@SerializedName("two_four_iron_resources_collected_bedwars")
	int twoFourIronCollected = 0;

	/**
	 * Bedwars 4v4 Items Purchased by the Player
	 */
	@SerializedName("two_four_items_purchased_bedwars")
	int twoFourItemsPurchased = 0;

	/**
	 * Bedwars 4v4 Resources Collected by the Player
	 */
	@SerializedName("two_four_resources_collected_bedwars")
	int twoFourResourcesCollected = 0;

	/**
	 * Bedwars 4v4 Void Deaths of the Player
	 */
	@SerializedName("two_four_void_deaths_bedwars")
	int twoFourVoidDeaths = 0;

	/**
	 * Bedwars 4v4 Wins of the Player
	 */
	@SerializedName("two_four_wins_bedwars")
	int twoFourWins = 0;

	/**
	 * Bedwars 4v4 Kills of the Player
	 */
	@SerializedName("two_four_kills_bedwars")
	int twoFourKills = 0;

	/**
	 * Bedwars 4v4 Void Kills of the Player
	 */
	@SerializedName("two_four_void_kills_bedwars")
	int twoFourVoidKills = 0;

	/**
	 * Bedwars 4v4 Final Kills of the Player
	 */
	@SerializedName("two_four_final_kills_bedwars")
	int twoFourFinalKills = 0;

	/**
	 * Bedwars 4v4 Void Final Kills of the Player
	 */
	@SerializedName("two_four_void_final_kills_bedwars")
	int twoFourVoidFinalKills = 0;

	/**
	 * Bedwars 4v4 Beds Broken by the Player
	 */
	@SerializedName("two_four_beds_broken_bedwars")
	int twoFourBedsBroken = 0;

	/**
	 * Bedwars 4v4 Emerald Collected by the Player
	 */
	@SerializedName("two_four_emerald_resources_collected_bedwars")
	int twoFourEmeraldCollected = 0;

	/**
	 * Bedwars 4v4 Fall Deaths of the Player
	 */
	@SerializedName("two_four_fall_deaths_bedwars")
	int twoFourFallDeaths = 0;

	/**
	 * Bedwars 4v4 Fall Kills of the Player
	 */
	@SerializedName("two_four_fall_kills_bedwars")
	int twoFourFallKills = 0;

	/**
	 * Bedwars 4v4 Beds Lost by the Player
	 */
	@SerializedName("two_four_beds_lost_bedwars")
	int twoFourBedsLost = 0;

	/**
	 * Bedwars 4v4 Fall Final Kills of the Player
	 */
	@SerializedName("two_four_fall_final_kills_bedwars")
	int twoFourFallFinalKills = 0;

	/**
	 * Bedwars 4v4 Final Deaths of the Player
	 */
	@SerializedName("two_four_final_deaths_bedwars")
	int twoFourFinalDeaths = 0;

	/**
	 * Bedwars 4v4 Void Final Deaths of the Player
	 */
	@SerializedName("two_four_void_final_deaths_bedwars")
	int twoFourVoidFinalDeaths = 0;

	/**
	 * bedwars 4v4 Losses of the Player
	 */
	@SerializedName("two_four_losses_bedwars")
	int twoFourLosses = 0;

	/**
	 * Bedwars 4v4 Fall Fina Deaths of the Player
	 */
	@SerializedName("two_four_fall_final_deaths_bedwars")
	int twoFourFallFinalDeaths = 0;

	/**
	 * Bedwars 4v4 Projectile Final Kills of the Player
	 */
	@SerializedName("two_four_projectile_final_kills_bedwars")
	int twoFourProjectileFinalKills = 0;

	/**
	 * Bedwars 4v4 Diamonds Collected by the Player
	 */
	@SerializedName("two_four_diamond_resources_collected_bedwars")
	int twoFourDiamondsCollected = 0;

	/**
	 * Bedwars 4v4 Projectile Kills of the Player
	 */
	@SerializedName("two_four_projectile_kills_bedwars")
	int twoFourProjectileKills = 0;

	/**
	 * Bedwars 4v4 Permanent Items Purchased by the Player
	 */
	@SerializedName("two_four_permanent_items_purchased_bedwars")
	int twoFourPermanentItemsPurchased = 0;

	/**
	 * Bedwars Private Games Settings
	 */
	@SerializedName("privategames")
	PrivateGames privateGames = new PrivateGames();

	@SerializedName("practice")
	Practice practice = new Practice();


	/**
	 * Get All Unlocked Packages (Cosmetics) of the Player
	 *
	 * @return List of All Bedwars Unlocked Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Bedwars Experience of the Player
	 *
	 * @return Experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * Get Total Boxes of the Player
	 *
	 * @return Total Boxes
	 */
	public int getBoxes() {
		return boxes;
	}

	/**
	 * Get Last 5 Items Found in Chests
	 *
	 * @return Chests History
	 */
	public List<String> getChestHistory() {
		return chestHistory;
	}

	/**
	 * Get Current Island Topper used by the Player
	 *
	 * @return Island Topper
	 */
	public String getIslandTopper() {
		return islandTopper;
	}

	/**
	 * Get Current Glyph used by the Player
	 *
	 * @return Glyph
	 */
	public String getGlyph() {
		return glyph;
	}

	/**
	 * Get Total Final Deaths of the Player
	 *
	 * @return Final Deaths
	 */
	public int getFinalDeaths() {
		return finalDeaths;
	}

	/**
	 * Get Total Gold Collected by the Player
	 *
	 * @return Gold Collected
	 */
	public int getGoldCollected() {
		return goldCollected;
	}

	/**
	 * Get Total Diamonds Collected by the Player
	 *
	 * @return Diamonds Collected
	 */
	public int getDiamondsCollected() {
		return diamondsCollected;
	}

	/**
	 * Get Total Deaths of the Player
	 *
	 * @return Deaths
	 */
	public int getDeaths() {
		return deaths;
	}

	/**
	 * Get Total Void Deaths of the Player
	 *
	 * @return Void Deaths
	 */
	public int getVoidDeaths() {
		return voidDeaths;
	}

	/**
	 * Get Total Resources Collected by the Player
	 *
	 * @return Resources Collected
	 */
	public int getResourcesCollected() {
		return resourcesCollected;
	}

	/**
	 * Get Bedwars Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Games Played by the Player
	 *
	 * @return Games Played
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	/**
	 * Get Total Beds Lost by the Player
	 *
	 * @return Beds Lost
	 */
	public int getBedsLost() {
		return bedsLost;
	}

	/**
	 * Get Total Void Final Deaths of the Player
	 *
	 * @return Void Final Deaths
	 */
	public int getVoidFinalDeaths() {
		return voidFinalDeaths;
	}

	/**
	 * Get Total Losses of the player
	 *
	 * @return Losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * Get Total Items Purchased by the Player
	 *
	 * @return Items Purchased
	 */
	public int getItemsPurchased() {
		return itemsPurchased;
	}

	/**
	 * Get Total Final Kills of the Player
	 *
	 * @return Final Kills
	 */
	public int getFinalKills() {
		return finalKills;
	}

	/**
	 * Get Total Iron Collected by the Player
	 *
	 * @return Iron Collected
	 */
	public int getIronCollected() {
		return ironCollected;
	}

	/**
	 * Get Total Beds Broken by the player
	 *
	 * @return Beds Broken
	 */
	public int getBedsBroken() {
		return bedsBroken;
	}

	/**
	 * Get Current Winstreak of the Player
	 *
	 * @return Current Winstreak
	 */
	public int getWinstreak() {
		return winstreak;
	}

	/**
	 * Get Total Void Kills of the Player
	 *
	 * @return Void Kills
	 */
	public int getVoidKills() {
		return voidKills;
	}

	/**
	 * Get Total Kills of the Player
	 *
	 * @return Kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * Get Total Void Final Kills of the Player
	 *
	 * @return Void Final Kills
	 */
	public int getVoidFinalKills() {
		return voidFinalKills;
	}

	/**
	 * Get Total Wins of the Player
	 *
	 * @return Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Total Emeralds Collected by the Player
	 *
	 * @return Emeralds Collected
	 */
	public int getEmeraldCollected() {
		return emeraldCollected;
	}

	/**
	 * Get Current Death Cry of the Player
	 *
	 * @return Death Cry
	 */
	public String getDeathCry() {
		return deathCry;
	}

	/**
	 * Get Current Projectile Trail of the Player
	 *
	 * @return Projectile Trail
	 */
	public String getProjectileTrail() {
		return projectileTrail;
	}

	/**
	 * Get Current Spray of the Player
	 *
	 * @return Spray
	 */
	public String getSprays() {
		return sprays;
	}

	/**
	 * Get Current Glyph Shield of the Player
	 *
	 * @return Glyph Shield
	 */
	public String getGlyphShield() {
		return glyphShield;
	}

	/**
	 * Get Total Fall Kills of the Player
	 *
	 * @return Fall Kills
	 */
	public int getFallKills() {
		return fallKills;
	}

	/**
	 * Get Total Fall Deaths of the Player
	 *
	 * @return Fall Deaths
	 */
	public int getFallsDeaths() {
		return fallsDeaths;
	}

	/**
	 * Get Total Projectile Deaths of the Player
	 *
	 * @return Projectile Deaths
	 */
	public int getProjectileDeaths() {
		return projectileDeaths;
	}

	/**
	 * Get Current NPC Shop Skin of the Player
	 *
	 * @return Current NPC Skin
	 */
	public String getNpcSkin() {
		return npcSkin;
	}

	/**
	 * Get Current Victory Dance of the Player
	 *
	 * @return Current Victory Dance
	 */
	public String getVictoryDance() {
		return victoryDance;
	}

	/**
	 * Get Current Kill Messages of the Player
	 *
	 * @return Current Kill Messages
	 */
	public String getKillMessages() {
		return killMessages;
	}

	/**
	 * Get Total Fall Final Kills of the Player
	 *
	 * @return Fall Final Kills
	 */
	public int getFallFinalKills() {
		return fallFinalKills;
	}

	/**
	 * Get Current Kill Effect of the Player
	 *
	 * @return Current Kill Effect
	 */
	public String getKillEffect() {
		return killEffect;
	}

	/**
	 * Get Favourite Shop Items (1/2) of the Player
	 *
	 * @return Favourite Items (1/2)
	 */
	public String getFavourite1() {
		return favourite1;
	}

	/**
	 * Get Total Projectile Final Deaths of the Player
	 *
	 * @return Projectile Final Deaths
	 */
	public int getProjectileFinalDeaths() {
		return projectileFinalDeaths;
	}

	/**
	 * Get Total Projectile Kills of the Player
	 *
	 * @return Projectile Kills
	 */
	public int getProjectileKills() {
		return projectileKills;
	}

	/**
	 * Get Total Fall Final Deaths of the Player
	 *
	 * @return Fall Final Deaths
	 */
	public int getFallFinalDeaths() {
		return fallFinalDeaths;
	}

	/**
	 * Get Total Projectile Final Kills of the Player
	 *
	 * @return Projectile Final Kills
	 */
	public int getProjectileFinalKills() {
		return projectileFinalKills;
	}

	/**
	 * Get Favourite Shop Items (2/2) of the Player
	 *
	 * @return Favourite Shop Items (2/2)
	 */
	public String getFavourite2() {
		return favourite2;
	}

	/**
	 * Get Current Bed Destroy Effect of the Player
	 *
	 * @return Bed Destroy Effect
	 */
	public String getBedDestroyEffect() {
		return bedDestroyEffect;
	}

	/**
	 * Get Current Selected Ultimate (Ultimate Mode) of the player
	 *
	 * @return Selected Ultimate
	 */
	public String getSelectedUltimate() {
		return selectedUltimate;
	}

	/**
	 * Get Total Permanent Items Purchased by the Player
	 *
	 * @return Permanent Items Purchased
	 */
	public int getPermanentItemsPurchased() {
		return permanentItemsPurchased;
	}

	/**
	 * Get Solo Beds Lost by the Player
	 *
	 * @return Solo Beds Lost
	 */
	public int getSoloBedsLost() {
		return soloBedsLost;
	}

	/**
	 * Get Solo Final Deaths of the Player
	 *
	 * @return Solo Final Deaths
	 */
	public int getSoloFinalDeaths() {
		return soloFinalDeaths;
	}

	/**
	 * Get Solo Deaths of the Player
	 *
	 * @return Solo Deaths
	 */
	public int getSoloDeaths() {
		return soloDeaths;
	}

	/**
	 * Get Solo Void Deaths of the Player
	 *
	 * @return Solo Void Deaths
	 */
	public int getSoloVoidDeaths() {
		return soloVoidDeaths;
	}

	/**
	 * Get Solo Games Played by the Player
	 *
	 * @return Solo Games Played
	 */
	public int getSoloGamesPlayed() {
		return soloGamesPlayed;
	}

	/**
	 * Get Solo Final Kills of the Player
	 *
	 * @return Solo Final Kills
	 */
	public int getSoloFinalKills() {
		return soloFinalKills;
	}

	/**
	 * Get Solo Beds Broken by the Player
	 *
	 * @return Solo Beds Broken
	 */
	public int getSoloBedsBroken() {
		return soloBedsBroken;
	}

	/**
	 * Get Solo Permanent Items Purchased by the Player
	 *
	 * @return Solo Permanent Items Purchased
	 */
	public int getSoloPermanentItemsPurchased() {
		return soloPermanentItemsPurchased;
	}

	/**
	 * Get Solo Projectile Final Kills of the Player
	 *
	 * @return Solo Projectile Final Kills
	 */
	public int getSoloProjectileFinalKills() {
		return soloProjectileFinalKills;
	}

	/**
	 * Get Solo Losses of the Player
	 *
	 * @return Solo Losses
	 */
	public int getSoloLosses() {
		return soloLosses;
	}

	/**
	 * Get Solo Iron Collected by the Player
	 *
	 * @return Solo Iron Collected
	 */
	public int getSoloIronCollected() {
		return soloIronCollected;
	}

	/**
	 * Get Solo Diamonds Collected by the Player
	 *
	 * @return Solo Diamonds Collected
	 */
	public int getSoloDiamondsCollected() {
		return soloDiamondsCollected;
	}

	/**
	 * Get Solo Void Final Deaths of the Player
	 *
	 * @return Solo VOid Final Deaths
	 */
	public int getSoloVoidFinalDeaths() {
		return soloVoidFinalDeaths;
	}

	/**
	 * Get Solo Resources Collected by the Player
	 *
	 * @return Solo Resources Collected
	 */
	public int getSoloResourcesCollected() {
		return soloResourcesCollected;
	}

	/**
	 * Get Solo Gold Collected by the Player
	 *
	 * @return Solo Gold Collected
	 */
	public int getSoloGoldCollected() {
		return soloGoldCollected;
	}

	/**
	 * Get Solo Void Kills of the Player
	 *
	 * @return Solo Void Kills
	 */
	public int getSoloVoidKills() {
		return soloVoidKills;
	}

	/**
	 * Get Solo Void Final Kills of the Player
	 *
	 * @return Solo Void Final Kills
	 */
	public int getSoloVoidFinalKills() {
		return soloVoidFinalKills;
	}

	/**
	 * Get Solo Kills of the Player
	 *
	 * @return Solo Kills
	 */
	public int getSoloKills() {
		return soloKills;
	}

	/**
	 * Get Solo Emeralds Collected by the Player
	 *
	 * @return Solo Emeralds Collected
	 */
	public int getSoloEmeraldCollected() {
		return soloEmeraldCollected;
	}

	/**
	 * Get Solo Wins of the Player
	 *
	 * @return Solo Wins
	 */
	public int getSoloWins() {
		return soloWins;
	}

	/**
	 * Get Solo Fall Final Deaths of the Player
	 *
	 * @return Solo Fall Final Deaths
	 */
	public int getSoloFallFinalDeaths() {
		return soloFallFinalDeaths;
	}

	/**
	 * Get Solo Fall Final Kills of the Player
	 *
	 * @return Solo Fall Final Kills
	 */
	public int getSoloFallFinalKills() {
		return soloFallFinalKills;
	}

	/**
	 * Get Solo Fall Kills of the Player
	 *
	 * @return Solo Fall Kills
	 */
	public int getSoloFallKills() {
		return soloFallKills;
	}

	/**
	 * Get Solo Projectile Deaths of the Player
	 *
	 * @return Solo Projectile Deaths
	 */
	public int getSoloProjectileDeaths() {
		return soloProjectileDeaths;
	}

	/**
	 * Get Current Solo Winstreak of the Player
	 *
	 * @return Current Solo Winstreak
	 */
	public int getSoloWinstreak() {
		return soloWinstreak;
	}

	/**
	 * Get Double Void Deaths of the Player
	 *
	 * @return Double Void Deaths
	 */
	public int getDoubleVoidDeaths() {
		return doubleVoidDeaths;
	}

	/**
	 * Get Double Resources Collected by the Player
	 *
	 * @return Double Resources Collected
	 */
	public int getDoubleResourcesCollected() {
		return doubleResourcesCollected;
	}

	/**
	 * Get Double Kills of the Player
	 *
	 * @return Double Kills
	 */
	public int getDoubleKills() {
		return doubleKills;
	}

	/**
	 * Get Double Iron Collected by the Player
	 *
	 * @return Double Iron Collected
	 */
	public int getDoubleIronCollected() {
		return doubleIronCollected;
	}

	/**
	 * Get Double Void Kills of the Player
	 *
	 * @return Double Void Kills
	 */
	public int getDoubleVoidKills() {
		return doubleVoidKills;
	}

	/**
	 * Get Double Final Deaths of the Player
	 *
	 * @return Double Final Deaths
	 */
	public int getDoubleFinalDeaths() {
		return doubleFinalDeaths;
	}

	/**
	 * Get Double Void Final Deaths of the Player
	 *
	 * @return Double Void Final Deaths
	 */
	public int getDoubleVoidFinalDeaths() {
		return doubleVoidFinalDeaths;
	}

	/**
	 * Get Double Deaths of the Player
	 *
	 * @return Double Deaths
	 */
	public int getDoubleDeaths() {
		return doubleDeaths;
	}

	/**
	 * Get Double Games Played by the Player
	 *
	 * @return Double Games Played
	 */
	public int getDoubleGamesPlayed() {
		return doubleGamesPlayed;
	}

	/**
	 * Get Double Items Purchased by the Player
	 *
	 * @return Double Items Purchased
	 */
	public int getDoubleItemsPurchased() {
		return doubleItemsPurchased;
	}

	/**
	 * Get Double Beds Lost by the Player
	 *
	 * @return Double Beds Lost
	 */
	public int getDoubleBedsLost() {
		return doubleBedsLost;
	}

	/**
	 * Get Double Gold Collected by the Player
	 *
	 * @return Double Gold Colelcted
	 */
	public int getDoubleGoldCollected() {
		return doubleGoldCollected;
	}

	/**
	 * Get Double Losses of the Player
	 *
	 * @return Double Losses
	 */
	public int getDoubleLosses() {
		return doubleLosses;
	}

	/**
	 * Get Double Final Kills of the Player
	 *
	 * @return Double Final Kills
	 */
	public int getDoubleFinalKills() {
		return doubleFinalKills;
	}

	/**
	 * Get Double Diamonds Collected by the Player
	 *
	 * @return Double Diamonds Colelcted
	 */
	public int getDoubleDiamondsCollected() {
		return doubleDiamondsCollected;
	}

	/**
	 * Get Double Emerald Collected by the Player
	 *
	 * @return Double Emerald Collected
	 */
	public int getDoubleEmeraldCollected() {
		return doubleEmeraldCollected;
	}

	/**
	 * Get Double Beds Broken by the Player
	 *
	 * @return Double Beds Broken
	 */
	public int getDoubleBedsBroken() {
		return doubleBedsBroken;
	}

	/**
	 * Get Double Wins of the Player
	 *
	 * @return Double Wins
	 */
	public int getDoubleWins() {
		return doubleWins;
	}

	/**
	 * Get Double Void Final Kills of the Player
	 *
	 * @return Double Void Final Kills
	 */
	public int getDoubleVoidFinalKills() {
		return doubleVoidFinalKills;
	}

	/**
	 * Get Double Fall Deaths of the Player
	 *
	 * @return Double Fall Deaths
	 */
	public int getDoubleFallDeaths() {
		return doubleFallDeaths;
	}

	/**
	 * Get Double Projectile Deaths of the Player
	 *
	 * @return Double Projectile Deaths
	 */
	public int getDoubleProjectileDeaths() {
		return doubleProjectileDeaths;
	}

	/**
	 * Get Double Fall Kills of the Player
	 *
	 * @return Double Fall Kills
	 */
	public int getDoubleFallKills() {
		return doubleFallKills;
	}

	/**
	 * Get Double Projectile Final Kills of the Player
	 *
	 * @return Double Projectile Final Kills
	 */
	public int getDoubleProjectileFinalKills() {
		return doubleProjectileFinalKills;
	}

	/**
	 * Get Double Fall Final Kills of the Player
	 *
	 * @return Double Fall Final Kills
	 */
	public int getDoubleFallFinalKills() {
		return doubleFallFinalKills;
	}

	/**
	 * Get Double Fall Final Deaths
	 *
	 * @return Double Fall Final Deaths
	 */
	public int getDoubleFallFinalDeaths() {
		return doubleFallFinalDeaths;
	}

	/**
	 * Get Double Projectile Final Deaths of the Player
	 *
	 * @return Double Projectile Final Deaths
	 */
	public int getDoubleProjectileFinalDeaths() {
		return doubleProjectileFinalDeaths;
	}

	/**
	 * Get Current Double Winstreak of the Player
	 *
	 * @return Current Double Winstreak
	 */
	public int getDoubleWinstreak() {
		return doubleWinstreak;
	}

	/**
	 * Get Double Projectile Kills of the Player
	 *
	 * @return Double Projectile Kills
	 */
	public int getDoubleProjectileKills() {
		return doubleProjectileKills;
	}

	/**
	 * Get Double Permanent Items Purchased by the Player
	 *
	 * @return Double Permanent Items Purchased
	 */
	public int getDoublePermanentItemsPurchased() {
		return doublePermanentItemsPurchased;
	}

	/**
	 * Get 3v3v3v3 Void Final Kills of the Player
	 *
	 * @return 3v3v3v3 Void
	 */
	public int getThreeVoidFinalKills() {
		return threeVoidFinalKills;
	}

	/**
	 * Get 3v3v3v3 Void Kills of the Player
	 *
	 * @return 3v3v3v3 Void Kills
	 */
	public int getThreeVoidKills() {
		return threeVoidKills;
	}

	/**
	 * Get 3v3v3v3 Iron Collected by the Player
	 *
	 * @return 3v3v3v3 Iron Collected
	 */
	public int getThreeIronCollected() {
		return threeIronCollected;
	}

	/**
	 * Get 3v3v3v3 Games Played by the Player
	 *
	 * @return 3v3v3v3 Games Played
	 */
	public int getThreeGamesPlayed() {
		return threeGamesPlayed;
	}

	/**
	 * Get 3v3v3v3 Void Deaths of the Player
	 *
	 * @return 3v3v3v3 Void Deaths
	 */
	public int getThreeVoidDeaths() {
		return threeVoidDeaths;
	}

	/**
	 * Get 3v3v3v3 Beds Lost by the Player
	 *
	 * @return 3v3v3v3 Beds Lost
	 */
	public int getThreeBedsLost() {
		return threeBedsLost;
	}

	/**
	 * Get 3v3v3v3 Gold Collected by the Player
	 *
	 * @return 3v3v3v3 Gold Collected
	 */
	public int getThreeGoldCollected() {
		return threeGoldCollected;
	}

	/**
	 * Get 3v3v3v3 Deaths of the Player
	 *
	 * @return 3v3v3v3 Deaths
	 */
	public int getThreeDeaths() {
		return threeDeaths;
	}

	/**
	 * Get 3v3v3v3 Beds Broken by the Player
	 *
	 * @return 3v3v3v3 Beds Broken
	 */
	public int getThreeBedsBroken() {
		return threeBedsBroken;
	}

	/**
	 * Get 3v3v3v3 Losses of the Player
	 *
	 * @return 3v3v3v3 Losses
	 */
	public int getThreeLosses() {
		return threeLosses;
	}

	/**
	 * Get 3v3v3v3 Diamonds Collected by the Player
	 *
	 * @return 3v3v3v3 Diamonds Collected
	 */
	public int getThreeDiamondsCollected() {
		return threeDiamondsCollected;
	}

	/**
	 * Get 3v3v3v3 Final Kills of the Player
	 *
	 * @return 3v3v3v3 Final Kills
	 */
	public int getThreeFinalKills() {
		return threeFinalKills;
	}

	/**
	 * Get 3v3v3v3 Items Purchased by the Player
	 *
	 * @return 3v3v3v3 Items Purchased
	 */
	public int getThreeItemsPurchased() {
		return threeItemsPurchased;
	}

	/**
	 * Get 3v3v3v3 Kills of the Player
	 *
	 * @return 3v3v3v3 Kills
	 */
	public int getThreeKills() {
		return threeKills;
	}

	/**
	 * Get 3v3v3v3 Final Deaths of the Player
	 *
	 * @return 3v3v3v3 Final Deaths
	 */
	public int getThreeFinalDeaths() {
		return threeFinalDeaths;
	}

	/**
	 * Get 3v3v3v3 Resources Collected by the Player
	 *
	 * @return 3v3v3v3 Resources Collected
	 */
	public int getThreeResourcesCollected() {
		return threeResourcesCollected;
	}

	/**
	 * Get 3v3v3v3 Emeralds Collected by the Player
	 *
	 * @return 3v3v3v3 Emeralds Collected
	 */
	public int getThreeEmeraldCollected() {
		return threeEmeraldCollected;
	}

	/**
	 * Get 3v3v3v3 Void Final Deaths of the Player
	 *
	 * @return 3v3v3v3 Void Final Deaths
	 */
	public int getThreeVoidFinalDeaths() {
		return threeVoidFinalDeaths;
	}

	/**
	 * Get 3v3v3v3 Wins of the Player
	 *
	 * @return 3v3v3v3 Wins
	 */
	public int getThreeWins() {
		return threeWins;
	}

	/**
	 * Get 3v3v3v3 Projectile Deaths of the Player
	 *
	 * @return 3v3v3v3 Projectile Deaths
	 */
	public int getThreeProjectileDeaths() {
		return threeProjectileDeaths;
	}

	/**
	 * Get 3v3v3v3 Fall Kills of the Player
	 *
	 * @return 3v3v3v3 Fall Kills
	 */
	public int getThreeFallKills() {
		return threeFallKills;
	}

	/**
	 * Get 3v3v3v3 Projectile Final Kills of the Player
	 *
	 * @return 3v3v3v3 Projectile Final Kills
	 */
	public int getThreeProjectileFinalKills() {
		return threeProjectileFinalKills;
	}

	/**
	 * Get 3v3v3v3 Fall Final Kills of the Player
	 *
	 * @return 3v3v3v3 Fall Final Kills
	 */
	public int getThreeFallFinalKills() {
		return threeFallFinalKills;
	}

	/**
	 * Get 3v3v3v3 Fall Deaths of the Player
	 *
	 * @return 3v3v3v3 Fall Deaths
	 */
	public int getSoloFallDeaths() {
		return soloFallDeaths;
	}

	/**
	 * Get 3v3v3v3 Fall Deaths of the Player
	 *
	 * @return 3v3v3v3 Fall Deaths
	 */
	public int getThreeFallDeaths() {
		return threeFallDeaths;
	}

	/**
	 * Get 3v3v3v3 Projectile Kills of the Player
	 *
	 * @return 3v3v3v3 Projectile Kills
	 */
	public int getThreeProjectileKills() {
		return threeProjectileKills;
	}

	/**
	 * Get 3v3v3v3 Fall Final Kills of the Player
	 *
	 * @return 3v3v3v3 Fall Final Kills
	 */
	public int getThreeFallFinalDeaths() {
		return threeFallFinalDeaths;
	}

	/**
	 * Get 3v3v3v3 Current Winstreak of the Player
	 *
	 * @return Current 3v3v3v3 Winstreak
	 */
	public int getThreeWinstreak() {
		return threeWinstreak;
	}

	/**
	 * Get 3v3v3v3 Permanent Items Purchased by the Player
	 *
	 * @return 3v3v3v3 Permanent Items Purchased
	 */
	public int getThreePermanentItemsPurchased() {
		return threePermanentItemsPurchased;
	}

	/**
	 * Get 4v4v4v4 Void Kills of the Player
	 *
	 * @return 4v4v4v4 Void Kills
	 */
	public int getFourVoidKills() {
		return fourVoidKills;
	}

	/**
	 * Get 4v4v4v4 Kills of the Player
	 *
	 * @return 4v4v4v4 Kills
	 */
	public int getFourKills() {
		return fourKills;
	}

	/**
	 * Get 4v4v4v4 Final Deaths of the Player
	 *
	 * @return 4v4v4v4 Final Deaths
	 */
	public int getFourFinalDeaths() {
		return fourFinalDeaths;
	}

	/**
	 * Get 4v4v4v4 Gold Collected by the Player
	 *
	 * @return 4v4v4v4 Gold Collected
	 */
	public int getFourGoldCollected() {
		return fourGoldCollected;
	}

	/**
	 * Get 4v4v4v4 Beds Lost of the Player
	 *
	 * @return 4v4v4v4 Beds Lost
	 */
	public int getFourBedsLost() {
		return fourBedsLost;
	}

	/**
	 * Get 4v4v4v4 Losses of the Player
	 *
	 * @return 4v4v4v4 Losses
	 */
	public int getFourLosses() {
		return fourLosses;
	}

	/**
	 * Get 4v4v4v4 Iron Collected by the Player
	 *
	 * @return 4v4v4v4 Iron Collected
	 */
	public int getFourIronCollected() {
		return fourIronCollected;
	}

	/**
	 * Get 4v4v4v4 Games Played by the Player
	 *
	 * @return 4v4v4v4 Games Played
	 */
	public int getFourGamesPlayed() {
		return fourGamesPlayed;
	}

	/**
	 * Get 4v4v4v4 Resources Collected by the Player
	 *
	 * @return 4v4v4v4 Resources Collected
	 */
	public int getFourResourcesCollected() {
		return fourResourcesCollected;
	}

	/**
	 * Get 4v4v4v4 Items Purchased by the Player
	 *
	 * @return 4v4v4v4 Items Purchased
	 */
	public int getFourItemsPurchased() {
		return fourItemsPurchased;
	}

	/**
	 * Get 4v4v4v4 Wins of the Player
	 *
	 * @return 4v4v4v4 Wins
	 */
	public int getFourWins() {
		return fourWins;
	}

	/**
	 * Get 4v4v4v4 Deaths of the Player
	 *
	 * @return 4v4v4v4 Deaths
	 */
	public int getFourDeaths() {
		return fourDeaths;
	}

	/**
	 * Get 4v4v4v4 Diamonds Collected by the Player
	 *
	 * @return 4v4v4v4 Diamonds Collected
	 */
	public int getFourDiamondsCollected() {
		return fourDiamondsCollected;
	}

	/**
	 * Get 4v4v4v4 Void Final Kills of the Player
	 *
	 * @return 4v4v4v4 Void
	 */
	public int getFourVoidFinalKills() {
		return fourVoidFinalKills;
	}

	/**
	 * Get 4v4v4v4 Void Deaths of the Player
	 *
	 * @return 4v4v4v4 Void Deaths
	 */
	public int getFourVoidDeaths() {
		return fourVoidDeaths;
	}

	/**
	 * Get 4v4v4v4 Final Kills of the player
	 *
	 * @return 4v4v4v4 Final Kills
	 */
	public int getFourFinalKills() {
		return fourFinalKills;
	}

	/**
	 * Get 4v4v4v4 Emeralds Collected by the Player
	 *
	 * @return 4v4v4v4 Emeralds Collected
	 */
	public int getFourEmeraldCollected() {
		return fourEmeraldCollected;
	}

	/**
	 * Get 4v4v4v4 Void Final Deaths of the Player
	 *
	 * @return 4v4v4v4 Void Final Deaths
	 */
	public int getFourVoidFinalDeaths() {
		return fourVoidFinalDeaths;
	}

	/**
	 * Get 4v4v4v4 Projectile Kills of the Player
	 *
	 * @return 4v4v4v4 Projectile Kills
	 */
	public int getFourProjectileKills() {
		return fourProjectileKills;
	}

	/**
	 * Get 4v4v4v4 Fall Kills of the Player
	 *
	 * @return 4v4v4v4 Fall Kills
	 */
	public int getFourFallKills() {
		return fourFallKills;
	}

	/**
	 * Get 4v4v4v4 Fall Deaths of the Player
	 *
	 * @return 4v4v4v4 Fall Deaths
	 */
	public int getFourFallDeaths() {
		return fourFallDeaths;
	}

	/**
	 * Get 4v4v4v4 Beds Broken by the Player
	 *
	 * @return 4v4v4v4 Beds Broken
	 */
	public int getFourBedsBroken() {
		return fourBedsBroken;
	}

	/**
	 * Get 4v4v4v4 Projectile Deaths of the Player
	 *
	 * @return 4v4v4v4 Projectile Deaths
	 */
	public int getFourProjectileDeaths() {
		return fourProjectileDeaths;
	}

	/**
	 * Get 4v4v4v4 Fall Final Kills of the Player
	 *
	 * @return 4v4v4v4 Fall Final Kills
	 */
	public int getFourFallFinalKills() {
		return fourFallFinalKills;
	}

	/**
	 * Get 4v4v4v4 Projectile Final Deaths of the Player
	 *
	 * @return 4v4v4v4 Projectile Final Deaths
	 */
	public int getFourProjectileFinalDeaths() {
		return fourProjectileFinalDeaths;
	}

	/**
	 * Get 4v4v4v4 Fall Final Deaths of the Player
	 *
	 * @return 4v4v4v4 Fall Final Deaths
	 */
	public int getFourFallFinalDeaths() {
		return fourFallFinalDeaths;
	}

	/**
	 * Get 4v4v4v4 Current Winstreak of the Player
	 *
	 * @return 4v4v4v4 Current WWinstreak
	 */
	public int getFourWinstreak() {
		return fourWinstreak;
	}

	/**
	 * Get 4v4v4v4 Projectile Final Kills of the Player
	 *
	 * @return 4v4v4v4 Projectile Final Kills
	 */
	public int getFourProjectileFinalKills() {
		return fourProjectileFinalKills;
	}

	/**
	 * Get 4v4v4v4 Permanent Items Purchased by the Player
	 *
	 * @return 4v4v4v4 Permanent Items Purchased
	 */
	public int getFourPermanentItemsPurchased() {
		return fourPermanentItemsPurchased;
	}

	/**
	 * Get 4v4 Current Winstreak of the Player
	 *
	 * @return 4v4 Current Winstreak
	 */
	public int getTwoFourWinstreak() {
		return twoFourWinstreak;
	}

	/**
	 * Get 4v4 Deaths of the Player
	 *
	 * @return 4v4 Deaths
	 */
	public int getTwoFourDeaths() {
		return twoFourDeaths;
	}

	/**
	 * Get 4v4 Games Played by the Player
	 *
	 * @return 4v4 Games Played
	 */
	public int getTwoFourGamesPlayed() {
		return twoFourGamesPlayed;
	}

	/**
	 * Get 4v4 Gold Collected by the Player
	 *
	 * @return 4v4 Gold Collected
	 */
	public int getTwoFourGoldCollected() {
		return twoFourGoldCollected;
	}

	/**
	 * Get 4v4 Iron Collected by the Player
	 *
	 * @return 4v4 Iron Collected
	 */
	public int getTwoFourIronCollected() {
		return twoFourIronCollected;
	}

	/**
	 * Get 4v4 Items Purchased by the Player
	 *
	 * @return 4v4 Items Purchased
	 */
	public int getTwoFourItemsPurchased() {
		return twoFourItemsPurchased;
	}

	/**
	 * Get 4v4 Resources Collected by the Player
	 *
	 * @return 4v4 Resources Collected
	 */
	public int getTwoFourResourcesCollected() {
		return twoFourResourcesCollected;
	}

	/**
	 * Get 4v4 Void Deaths of  the Player
	 *
	 * @return 4v4 Void Deaths
	 */
	public int getTwoFourVoidDeaths() {
		return twoFourVoidDeaths;
	}

	/**
	 * Get 4v4 Wins of the Player
	 *
	 * @return 4v4 Wins
	 */
	public int getTwoFourWins() {
		return twoFourWins;
	}

	/**
	 * Get 4v4 Kills of the Player
	 *
	 * @return 4v4 Kills
	 */
	public int getTwoFourKills() {
		return twoFourKills;
	}

	/**
	 * Get 4v4 Void Kills of the Player
	 *
	 * @return 4v4 Void Kills
	 */
	public int getTwoFourVoidKills() {
		return twoFourVoidKills;
	}

	/**
	 * Get 4v4 Final Kills of the Player
	 *
	 * @return 4v4 Final Kills
	 */
	public int getTwoFourFinalKills() {
		return twoFourFinalKills;
	}

	/**
	 * Get 4v4 Void Final Kills of the Player
	 *
	 * @return 4v4 Void Final Kills
	 */
	public int getTwoFourVoidFinalKills() {
		return twoFourVoidFinalKills;
	}

	/**
	 * Get 4v4 Beds Broken by the Player
	 *
	 * @return 4v4 Beds Broken
	 */
	public int getTwoFourBedsBroken() {
		return twoFourBedsBroken;
	}

	/**
	 * Get 4v4 Emeralds Collected by the player
	 *
	 * @return 4v4 Emeralds Collected
	 */
	public int getTwoFourEmeraldCollected() {
		return twoFourEmeraldCollected;
	}

	/**
	 * Get 4v4 Fall Deaths of the Player
	 *
	 * @return 4v4 Fall Deaths
	 */
	public int getTwoFourFallDeaths() {
		return twoFourFallDeaths;
	}

	/**
	 * Get 4v4 Fall Kills of the Player
	 *
	 * @return 4v4 Fall Kills
	 */
	public int getTwoFourFallKills() {
		return twoFourFallKills;
	}

	/**
	 * Get 4v4 Beds Lost by the Player
	 *
	 * @return 4v4 Beds Lost
	 */
	public int getTwoFourBedsLost() {
		return twoFourBedsLost;
	}

	/**
	 * Get 4v4 Fall Final Kills of the Player
	 *
	 * @return 4v4 Fall Final Kills
	 */
	public int getTwoFourFallFinalKills() {
		return twoFourFallFinalKills;
	}

	/**
	 * Get 4v4 Final Deaths of the Player
	 *
	 * @return 4v4 Final Deaths
	 */
	public int getTwoFourFinalDeaths() {
		return twoFourFinalDeaths;
	}

	/**
	 * Get 4v4 Void Final Deaths of the Player
	 *
	 * @return 4v4 Void Final Deaths
	 */
	public int getTwoFourVoidFinalDeaths() {
		return twoFourVoidFinalDeaths;
	}

	/**
	 * Get 4v4 Losses of the Player
	 *
	 * @return 4v4 Losses
	 */
	public int getTwoFourLosses() {
		return twoFourLosses;
	}

	/**
	 * Get 4v4 Fall Final Deaths of the Player
	 *
	 * @return 4v4 Fall Final Deaths
	 */
	public int getTwoFourFallFinalDeaths() {
		return twoFourFallFinalDeaths;
	}

	/**
	 * Get 4v4 Projectile Final Kills of the Player
	 *
	 * @return 4v4 Projectile Final Kills
	 */
	public int getTwoFourProjectileFinalKills() {
		return twoFourProjectileFinalKills;
	}

	/**
	 * Get 4v4 Diamonds Collected by the Player
	 *
	 * @return 4v4 Diamonds Collected
	 */
	public int getTwoFourDiamondsCollected() {
		return twoFourDiamondsCollected;
	}

	/**
	 * Get 4v4 Projectile Kills of the Player
	 *
	 * @return 4v4 Projectile Kills
	 */
	public int getTwoFourProjectileKills() {
		return twoFourProjectileKills;
	}

	/**
	 * Get 4v4 Permanent Items Purchased by the Player
	 *
	 * @return 4v4 Permanent Items Purchased
	 */
	public int getTwoFourPermanentItemsPurchased() {
		return twoFourPermanentItemsPurchased;
	}

	/**
	 * Get Private Games Settings of the Player
	 *
	 * @return Private Games Settings
	 */
	public PrivateGames getPrivateGames() {
		return privateGames;
	}

	/**
	 * Get Bedwars Practice Statistics of the Player
	 *
	 * @return Practice Statistics
	 */
	public Practice getPractice() {
		return practice;
	}


	/**
	 * Bedwars Private Games Settings of the Player
	 *
	 * @author Kokhaviel
	 * @since 1.0
	 */
	public static class PrivateGames {

		/**
		 * Private Games Speed Level
		 */
		@SerializedName("speed")
		String speed = "";

		/**
		 * Private Games Low Gravity
		 */
		@SerializedName("low_gravity")
		boolean lowGravity = false;

		/**
		 * Private Games Event Time
		 */
		@SerializedName("event_time")
		String time = "";

		/**
		 * Private Games Respawn Time
		 */
		@SerializedName("respawn_time")
		String respawnTime = "";

		/**
		 * Private Games One Hit One Kill (On or Off)
		 */
		@SerializedName("one_hit_one_kill")
		boolean oneHitOneKill = false;

		/**
		 * Private Games Max Team Upgrades (On or Off)
		 */
		@SerializedName("max_team_upgrades")
		boolean maxTeamUpgrades = false;

		/**
		 * Private Games Diamonds On or Off (True = On)
		 */
		@SerializedName("no_diamonds")
		boolean noDiamond = false;

		/**
		 * Private Games Emeralds On or Off (True = On)
		 */
		@SerializedName("no_emeralds")
		boolean noEmerald = false;

		/**
		 * Private Games Health Buff Level
		 */
		@SerializedName("health_buff")
		String healthBuff = "";


		/**
		 * Get Private Games Speed Level
		 *
		 * @return Speed Level
		 */
		public String getSpeed() {
			return speed;
		}

		/**
		 * Get Private Games Low Gravity On or Off
		 *
		 * @return Low Gravity (On or Off)
		 */
		public boolean isLowGravity() {
			return lowGravity;
		}

		/**
		 * Get Private Games Event Time
		 *
		 * @return Event Time
		 */
		public String getTime() {
			return time;
		}

		/**
		 * Get Private Games Player Respawn Time
		 *
		 * @return Respawn Time
		 */
		public String getRespawnTime() {
			return respawnTime;
		}

		/**
		 * Get Private Games One Hit One Kill (On or Off)
		 *
		 * @return One Hit One Kill (On or Off)
		 */
		public boolean isOneHitOneKill() {
			return oneHitOneKill;
		}

		/**
		 * Get Private Games Max Team Upgrades (On or Off)
		 *
		 * @return Max Team Upgrades (On or Off)
		 */
		public boolean isMaxTeamUpgrades() {
			return maxTeamUpgrades;
		}

		/**
		 * Get No Diamonds Mode (On or Off) (True = On)
		 *
		 * @return No Diamonds (On or Off)
		 */
		public boolean isNoDiamond() {
			return noDiamond;
		}

		/**
		 * Get No Emeralds Mode (On or Off) (True = On)
		 *
		 * @return No Emeralds (On or Off)
		 */
		public boolean isNoEmerald() {
			return noEmerald;
		}

		/**
		 * Get Private Games Health Buff Level
		 *
		 * @return Health Buff
		 */
		public String getHealthBuff() {
			return healthBuff;
		}

		@Override
		public String toString() {
			return "Bedwars PrivateGames{" +
					"speed='" + speed + '\'' +
					", lowGravity=" + lowGravity +
					", time='" + time + '\'' +
					", respawnTime='" + respawnTime + '\'' +
					", oneHitOneKill=" + oneHitOneKill +
					", maxTeamUpgrades=" + maxTeamUpgrades +
					", noDiamond=" + noDiamond +
					", noEmerald=" + noEmerald +
					", healthBuff='" + healthBuff + '\'' +
					'}';
		}
	}

	/**
	 * Bedwars Practice Mode Stats
	 *
	 * @author Kokhaviel
	 * @since 1.0
	 */
	public static class Practice {

		/**
		 * Bedwars Current Practice Selected
		 */
		@SerializedName("selected")
		String practiceSelected = "";

		/**
		 * MLG Practice Stats
		 */
		@SerializedName("mlg")
		MLG mlg = new MLG();

		/**
		 * Bridging Practice Stats
		 */
		@SerializedName("bridging")
		Bridging bridging = new Bridging();

		/**
		 * Jump Practice Stats
		 */
		@SerializedName("fireball_jumping")
		Jump jump = new Jump();

		/**
		 * Get Practice Currently Selected
		 *
		 * @return Selected Practice
		 */
		public String getPracticeSelected() {
			return practiceSelected;
		}

		/**
		 * Get MLG Practice Stats
		 *
		 * @return MLG Stats
		 */
		public MLG getMlg() {
			return mlg;
		}

		/**
		 * Get Bridging Practice Stats
		 *
		 * @return Bridging Stats
		 */
		public Bridging getBridging() {
			return bridging;
		}

		/**
		 * Get Jump Practice Stats
		 *
		 * @return Jump Stats
		 */
		public Jump getJump() {
			return jump;
		}

		/**
		 * MLG Practice Statistics
		 *
		 * @author Kokhaviel
		 * @since 1.0
		 */
		public static class MLG {

			/**
			 * Successful MLG Attempts
			 */
			@SerializedName("successful_attempts")
			int success = 0;

			/**
			 * Failed MLG Attempts
			 */
			@SerializedName("failed_attempts")
			int failed = 0;

			/**
			 * Get Successful Attempts
			 *
			 * @return Success
			 */
			public int getSuccess() {
				return success;
			}

			/**
			 * Get Failed Attempts
			 *
			 * @return Fail
			 */
			public int getFailed() {
				return failed;
			}

			@Override
			public String toString() {
				return "Bedwars Practice MLG{" +
						"success=" + success +
						", failed=" + failed +
						'}';
			}
		}

		/**
		 * Bridging Practice Statistics
		 *
		 * @author Kokhaviel
		 * @since 1.0
		 */
		public static class Bridging {

			/**
			 * Successful Bridging Attempts
			 */
			@SerializedName("successful_attempts")
			int success = 0;

			/**
			 * Failed Bridging Attempts
			 */
			@SerializedName("failed_attempts")
			int failed = 0;

			/**
			 * Bridging Blocks Placed
			 */
			@SerializedName("blocks_placed")
			int blocksPlaced = 0;

			/**
			 * Get Successful Attempts
			 *
			 * @return Success
			 */
			public int getSuccess() {
				return success;
			}

			/**
			 * Get Failed Attempts
			 *
			 * @return Fail
			 */
			public int getFailed() {
				return failed;
			}

			/**
			 * Get Blocks Placed
			 *
			 * @return Blocks Placed
			 */
			public int getBlocksPlaced() {
				return blocksPlaced;
			}

			@Override
			public String toString() {
				return "Bedwars Practice Bridging{" +
						"success=" + success +
						", failed=" + failed +
						", blocksPlaced=" + blocksPlaced +
						'}';
			}
		}

		/**
		 * Fireball Jumping Practice Statistics
		 *
		 * @author Kokhaviel
		 * @since 1.0
		 */
		public static class Jump {

			/**
			 * Successful Jump Attempts
			 */
			@SerializedName("successful_attempts")
			int success = 0;

			/**
			 * Failed Jump Attempts
			 */
			@SerializedName("failed_attempts")
			int failed = 0;


			/**
			 * Jump Blocks Placed
			 */
			@SerializedName("blocks_placed")
			int blocksPlaced = 0;

			/**
			 * Get Successful Attempts
			 *
			 * @return Success
			 */
			public int getSuccess() {
				return success;
			}

			/**
			 * Get Failed Attempts
			 *
			 * @return Fail
			 */
			public int getFailed() {
				return failed;
			}

			/**
			 * Get Blocks Placed
			 *
			 * @return Blocks Placed
			 */
			public int getBlocksPlaced() {
				return blocksPlaced;
			}

			@Override
			public String toString() {
				return "Bedwars Practice Jump{" +
						"success=" + success +
						", failed=" + failed +
						", blocksPlaced=" + blocksPlaced +
						'}';
			}
		}

		@Override
		public String toString() {
			return "Bedwars Practice{" +
					"practiceSelected='" + practiceSelected + '\'' +
					", mlg=" + mlg +
					", bridging=" + bridging +
					", jump=" + jump +
					'}';
		}
	}

	@Override
	public String toString() {
		return "Bedwars{" +
				"unlockedPackages=" + unlockedPackages +
				", experience=" + experience +
				", boxes=" + boxes +
				", chestHistory=" + chestHistory +
				", islandTopper='" + islandTopper + '\'' +
				", glyph='" + glyph + '\'' +
				", finalDeaths=" + finalDeaths +
				", goldCollected=" + goldCollected +
				", diamondsCollected=" + diamondsCollected +
				", deaths=" + deaths +
				", voidDeaths=" + voidDeaths +
				", resourcesCollected=" + resourcesCollected +
				", coins=" + coins +
				", gamesPlayed=" + gamesPlayed +
				", bedsLost=" + bedsLost +
				", voidFinalDeaths=" + voidFinalDeaths +
				", losses=" + losses +
				", itemsPurchased=" + itemsPurchased +
				", finalKills=" + finalKills +
				", ironCollected=" + ironCollected +
				", bedsBroken=" + bedsBroken +
				", winstreak=" + winstreak +
				", voidKills=" + voidKills +
				", kills=" + kills +
				", voidFinalKills=" + voidFinalKills +
				", wins=" + wins +
				", emeraldCollected=" + emeraldCollected +
				", deathCry='" + deathCry + '\'' +
				", projectileTrail='" + projectileTrail + '\'' +
				", sprays='" + sprays + '\'' +
				", glyphShield='" + glyphShield + '\'' +
				", fallKills=" + fallKills +
				", fallsDeaths=" + fallsDeaths +
				", projectileDeaths=" + projectileDeaths +
				", npcSkin='" + npcSkin + '\'' +
				", victoryDance='" + victoryDance + '\'' +
				", killMessages='" + killMessages + '\'' +
				", fallFinalKills=" + fallFinalKills +
				", killEffect='" + killEffect + '\'' +
				", favourite1='" + favourite1 + '\'' +
				", projectileFinalDeaths=" + projectileFinalDeaths +
				", projectileKills=" + projectileKills +
				", fallFinalDeaths=" + fallFinalDeaths +
				", projectileFinalKills=" + projectileFinalKills +
				", favourite2='" + favourite2 + '\'' +
				", bedDestroyEffect='" + bedDestroyEffect + '\'' +
				", selectedUltimate='" + selectedUltimate + '\'' +
				", permanentItemsPurchased=" + permanentItemsPurchased +
				'}';
	}
}

