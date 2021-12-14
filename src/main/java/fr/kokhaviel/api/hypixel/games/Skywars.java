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
 * Skywars Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Skywars {

	/**
	 * Skywars Winstreak of the Player
	 */
	@SerializedName("winstreak")
	int winstreak = 0;

	/**
	 * Skywars Killstreak of the Player
	 */
	@SerializedName("killstreak")
	int killStreak = 0;

	/**
	 * Skywars Highest Killstreak of the Player
	 */
	@SerializedName("highestKillstreak")
	int highestKillstreak = 0;

	/**
	 * Skywars Highest Winstreak of the Player
	 */
	@SerializedName("highestWinstreak")
	int highestWinstreak = 0;

	/**
	 * Skywars Total Survived Players of the Player
	 */
	@SerializedName("survived_players")
	int survivedPlayers = 0;

	/**
	 * Skywars Total Losses of the Player
	 */
	@SerializedName("losses")
	int losses = 0;

	/**
	 * Skywars Total Losses of the Player
	 */
	@SerializedName("deaths")
	int deaths = 0;

	/**
	 * Skywars Total Quits of the Player
	 */
	@SerializedName("quits")
	int quits = 0;

	/**
	 * Skywars Coins of the Player
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Skywars Total Blocks Broken by the Player
	 */
	@SerializedName("blocks_broken")
	int blocksBroken = 0;

	/**
	 * Skywars Unlocked Packages (Cosmetics) of the Player
	 */
	@SerializedName("packages")
	List<String> unlockedPackages = new ArrayList<>();

	/**
	 * Skywars Total Games Played by the Player
	 */
	@SerializedName("games")
	int gamesPlayed = 0;

	/**
	 * Skywars Total Blocks Placed by the Player
	 */
	@SerializedName("blocks_placed")
	int blocksPlaced = 0;

	/**
	 * Skywars Total Kills of the Player
	 */
	@SerializedName("kills")
	int kills = 0;

	/**
	 * Skywars Total Egg Thrown by the Player
	 */
	@SerializedName("egg_thrown")
	int eggThrown = 0;

	/**
	 * Skywars Total Souls Gathered by the Player
	 */
	@SerializedName("souls_gathered")
	int soulsGathered = 0;

	/**
	 * Skywars Current Souls of the Player
	 */
	@SerializedName("souls")
	int souls = 0;

	/**
	 * Skywars Total Arrows Hit of the Player
	 */
	@SerializedName("arrows_hit")
	int arrowsHit = 0;

	/**
	 * Skywars Total Arrows Shot by the Player
	 */
	@SerializedName("arrows_shot")
	int arrowsShot = 0;

	/**
	 * Skywars Total Enderpearls Thrown by the Player
	 */
	@SerializedName("enderpearls_thrown")
	int enderpearlsThrown = 0;

	/**
	 * Skywars Total Assists of the Player
	 */
	@SerializedName("assists")
	int assists = 0;

	/**
	 * Skywars Total Wins of the Player
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Skywars Total Items Enchanted of the Player
	 */
	@SerializedName("items_enchanted")
	int itemsEnchanted = 0;

	/**
	 * Skywars Total Soul Well Spin of the Player
	 */
	@SerializedName("soul_well")
	int soulWell = 0;

	/**
	 * Skywars Total Soul Well Rares Found Items of the Player
	 */
	@SerializedName("soul_well_rares")
	int soulWellRares = 0;

	/**
	 * Skywars Total Soul Well Legendary Found Items of the Player
	 */
	@SerializedName("soul_well_legendaries")
	int soulWellLegendaries = 0;

	/**
	 * Skywars Total Paid Souls of the Player
	 */
	@SerializedName("paid_souls")
	int paidSouls = 0;

	/**
	 * Skywars Current Cage Used by the Player
	 */
	@SerializedName("activeCage")
	String activeCage = "DEFAULT";

	/**
	 * Skywars Total Chests Opened by the Player
	 */
	@SerializedName("chests_opened")
	int chestsOpened = 0;

	/**
	 * Skywars Total Time Played of the Player (in Minutes)
	 */
	@SerializedName("time_played")
	int timePlayed = 0;

	/**
	 * Skywars Total Void Kills of the Player
	 */
	@SerializedName("void_kills")
	int voidKills = 0;

	/**
	 * Skywars Most Kills in one Game of the Player
	 */
	@SerializedName("most_kills_game")
	int mostKills = 0;

	/**
	 * Skywars Longest Bow Shot of the Player
	 */
	@SerializedName("longest_bow_shot")
	int longestBowShot = 0;

	/**
	 * Skywars Fastest Win of the Player
	 */
	@SerializedName("fastest_win")
	int fastestWin = 0;

	/**
	 * Skywars Total Melee Kills of the Player
	 */
	@SerializedName("melee_kills")
	int meleeKills = 0;

	/**
	 * Skywars Total Mob Kills of the Player
	 */
	@SerializedName("mob_kills")
	int mobKills = 0;

	/**
	 * Skywars Last Played Mode of the Player
	 */
	@SerializedName("lastMode")
	String lastMode = "NONE";

	/**
	 * Skywars Current Projectile Trail Used by the Player
	 */
	@SerializedName("activeProjectileTrail")
	String activeProjectileTrail = "DEFAULT";

	/**
	 * Skywars Current Victory Dance used by the Player
	 */
	@SerializedName("activeVictoryDance")
	String activeVictoryDance = "DEFAULT";

	/**
	 * Skywars Current Kill Effect Used by the Player
	 */
	@SerializedName("activeKillEffect")
	String activeKillEffect = "DEFAULT";

	/**
	 * Skywars Longest Bow Kill of the Player
	 */
	@SerializedName("longest_bow_kill")
	int longestBowKill = 0;

	/**
	 * Skywars Total Cosmetic Tokens of the Player
	 */
	@SerializedName("cosmetic_tokens")
	int tokens = 0;

	/**
	 * Skywars Current Death Cry Used by the Player
	 */
	@SerializedName("active_deathcry")
	String activeDeathCry = "DEFAULT";

	/**
	 * Skywars Total Bow Kills of the Player
	 */
	@SerializedName("bow_kills")
	int bowKills = 0;

	/**
	 * Skywars Current Spray Used by the Player
	 */
	@SerializedName("active_sprays")
	String activeSprays = "DEFAULT";

	/**
	 * Skywars Current Balloon
	 */
	@SerializedName("active_balloon")
	String activeBalloon = "DEFAULT";

	/**
	 * Skywars Experience of the Player
	 */
	@SerializedName("skywars_experience")
	int experience = 0;

	/**
	 * Skywars Current Prestige Icon of the Player
	 */
	@SerializedName("selected_prestige_icon")
	String prestigeIcon = "DEFAULT";

	/**
	 * Skywars Angel of the Death Level of the Player
	 */
	@SerializedName("angel_of_death_level")
	int angelDeathLevel = 0;

	/**
	 * Skywars Total Opals of the Player
	 */
	@SerializedName("opals")
	int opals = 0;

	/**
	 * Skywars Shard of the Player
	 */
	@SerializedName("shard")
	int shard = 0;

	/**
	 * Skywars Total Fall Kills of the Player
	 */
	@SerializedName("fall_kills")
	int fallKills = 0;

	/**
	 * Skywars Solo Survived Players of the Player
	 */
	@SerializedName("survived_players_solo")
	int survivedPlayersSolo = 0;

	/**
	 * Skywars Normal Mode Solo Deaths of the Player
	 */
	@SerializedName("deaths_solo_normal")
	int deathsSoloNormal = 0;

	/**
	 * Skywars Solo Losses of the Player
	 */
	@SerializedName("losses_solo")
	int lossesSolo = 0;

	/**
	 * Skywars Normal Mode Solo Losses of the Player
	 */
	@SerializedName("losses_solo_normal")
	int lossesSoloNormal = 0;

	/**
	 * Skywars Solo Deaths of the Player
	 */
	@SerializedName("deaths_solo")
	int deathsSolo = 0;

	/**
	 * Skywars Normal Mode Solo Kills of the Player
	 */
	@SerializedName("kills_solo_normal")
	int killsSoloNormal = 0;

	/**
	 * Skywars Solo Kills of the Player
	 */
	@SerializedName("kills_solo")
	int killsSolo = 0;

	/**
	 * Skywars Solo Games Played by the Player
	 */
	@SerializedName("games_solo")
	int gamesPlayedSolo = 0;

	/**
	 * Skywars Insane Mode Solo Losses of the Player
	 */
	@SerializedName("losses_solo_insane")
	int lossesSoloInsane = 0;

	/**
	 * Skywars Insane Mode Solo Deaths of the Player
	 */
	@SerializedName("deaths_solo_insane")
	int deathsSoloInsane = 0;

	/**
	 * Skywars Insane Mode Solo Kills of the Player
	 */
	@SerializedName("kills_solo_insane")
	int killsSoloInsane = 0;

	/**
	 * Skywars Current Solo Killstreak of the Player
	 */
	@SerializedName("killstreak_solo")
	int soloKillstreak = 0;

	/**
	 * Skywars Insane Mode Solo Wins of the Player
	 */
	@SerializedName("wins_solo_insane")
	int winsSoloInsane = 0;

	/**
	 * Skywars Current Solo Winstreak of the Player
	 */
	@SerializedName("winstreak_solo")
	int soloWinstreak = 0;

	/**
	 * Skywars Solo Wins of the Player
	 */
	@SerializedName("wins_solo")
	int winsSolo = 0;

	/**
	 * Skywars Solo Assists of the Player
	 */
	@SerializedName("assists_solo")
	int assistsSolo = 0;

	/**
	 * Skywars Current Solo Kit of the Player
	 */
	@SerializedName("activeKit_SOLO")
	String activeKitSolo = "DEFAULT";

	/**
	 * Skywars Normal Mode Solo Wins of the Player
	 */
	@SerializedName("wins_solo_normal")
	int winsSoloNormal = 0;

	/**
	 * Skywars Solo Mode Chests Opened by the Player
	 */
	@SerializedName("chests_opened_solo")
	int chestsOpenedSolo = 0;

	/**
	 * Skywars Solo Mode Time Played of the Player (in Minutes
	 */
	@SerializedName("time_played_solo")
	int timePlayedSolo = 0;

	/**
	 * Skywars Solo Mode Most Kills in one Game of the Player
	 */
	@SerializedName("most_kills_game_solo")
	int mostKillsSolo = 0;

	/**
	 * Skywars Solo Mode Void Kills of the Player
	 */
	@SerializedName("void_kills_solo")
	int voidKillsSolo = 0;

	/**
	 * Skywars Solo Mode Longest Bow Shot of the Player
	 */
	@SerializedName("longest_bow_shot_solo")
	int longestBowShotSolo = 0;

	/**
	 * Skywars Solo Mode Arrows Hit of the Player
	 */
	@SerializedName("arrows_hit_solo")
	int arrowsHitSolo = 0;

	/**
	 * Skywars Solo Mode Arrows Shot by the Player
	 */
	@SerializedName("arrows_shot_solo")
	int arrowsShotSolo = 0;

	/**
	 * Skywars Solo Mode Fastest Win of the Player
	 */
	@SerializedName("fastest_win_solo")
	int fastestWinSolo = 0;

	/**
	 * Skywars Solo Mode Melee Kills of the Player
	 */
	@SerializedName("melee_kills_solo")
	int meleeKillsSolo = 0;

	/**
	 * Skywars Solo Mode Mob Kills of the Player
	 */
	@SerializedName("mob_kills_solo")
	int mobKillsSolo = 0;

	/**
	 * Skywars Solo Mode Bow Kills of the Player
	 */
	@SerializedName("bow_kills_solo")
	int bowKillsSolo = 0;

	/**
	 * Skywars Solo Mode Longest Bow Kill of the Player
	 */
	@SerializedName("longest_bow_kill_solo")
	int longestBowKillSolo = 0;

	/**
	 * Skywars Solo Mode Fall Kills of the Player
	 */
	@SerializedName("fall_kills_solo")
	int fallKillsSolo = 0;

	/**
	 * Skywars Solo Mode Fastest Win of the Player
	 */
	@SerializedName("fastest_win_team")
	int fastestWinTeam = 0;

	/**
	 * Skywars Normal Mode Deaths Team of the Player
	 */
	@SerializedName("deaths_team_normal")
	int deathsTeamNormal = 0;

	/**
	 * Skywars Normal Mode Team Losses of the Player
	 */
	@SerializedName("losses_team_normal")
	int lossesTeamNormal = 0;

	/**
	 * Skywars Deaths Team
	 */
	@SerializedName("deaths_team")
	int deathsTeam = 0;

	/**
	 * Skywars Team Survived Players of the Player
	 */
	@SerializedName("survived_players_team")
	int survivedPlayersTeam = 0;

	/**
	 * Skywars Team Losses of the Player
	 */
	@SerializedName("losses_team")
	int lossesTeam = 0;

	/**
	 * Skywars Team Games Played by the Player
	 */
	@SerializedName("games_team")
	int gamesPlayedTeam = 0;

	/**
	 * Skywars Insane Mode Team Deaths of the Player
	 */
	@SerializedName("deaths_team_insane")
	int deathsInsaneTeam = 0;

	/**
	 * Skywars Insane Mode Team Losses of the Player
	 */
	@SerializedName("losses_team_insane")
	int lossesTeamInsane = 0;

	/**
	 * Skywars Team Assists of the Player
	 */
	@SerializedName("assists_team")
	int assistsTeam = 0;

	/**
	 * Skywars Insane Mode Team Wins of the Player
	 */
	@SerializedName("wins_team_insane")
	int winsTeamInsane = 0;

	/**
	 * Skywars Team Wins of the Player
	 */
	@SerializedName("wins_team")
	int winsTeam = 0;

	/**
	 * Skywars Current Team Winstreak of the Player
	 */
	@SerializedName("winstreak_team")
	int winstreakTeam = 0;

	/**
	 * Skywars Current Team Kit of the Player
	 */
	@SerializedName("activeKit_TEAM")
	String activeKitTeam = "DEFAULT";

	/**
	 * Skywars Normal Mode Team Wins of the Player
	 */
	@SerializedName("wins_team_normal")
	int winsTeamNormal = 0;

	/**
	 * Skywars Insane Mode Team Kills of the Player
	 */
	@SerializedName("kills_team_insane")
	int killsTeamInsane = 0;

	/**
	 * Skywars Team Kills of the Player
	 */
	@SerializedName("kills_team")
	int killsTeam = 0;

	/**
	 * Skywars Current Team Killstreak of the Player
	 */
	@SerializedName("killstreak_team")
	int killstreakTeam = 0;

	/**
	 * Skywars Normal Mode Team Kills of the Player
	 */
	@SerializedName("kills_team_normal")
	int killsTeamNormal = 0;

	/**
	 * Skywars Team Mode Melee Kills of the Player
	 */
	@SerializedName("melee_kills_team")
	int meleeKillsTeam = 0;

	/**
	 * Skywars Team Mode Most Kills in one Game of the Player
	 */
	@SerializedName("most_kills_game_team")
	int mostKillsTeam = 0;

	/**
	 * Skywars Team Mode Chests Opened by the Player
	 */
	@SerializedName("chests_opened_team")
	int chestsOpenedTeam = 0;

	/**
	 * Skywars Team Mode Time Played of the Player (in Minutes)
	 */
	@SerializedName("time_played_team")
	int timePlayedTeam = 0;

	/**
	 * Skywars Team Mode Longest Bow Shot of the Player
	 */
	@SerializedName("longest_bow_shot_team")
	int longestBowShotTeam = 0;

	/**
	 * Skywars Team Mode Arrows Shot by the Player
	 */
	@SerializedName("arrows_shot_team")
	int arrowsShotTeam = 0;

	/**
	 * Skywars Team Mode Arrows Hit of the Player
	 */
	@SerializedName("arrows_hit_team")
	int arrowsHitTeam = 0;

	/**
	 * Skywars Team Mode Void Kills of the Player
	 */
	@SerializedName("void_kills_team")
	int voidKillsTeam = 0;

	/**
	 * Skywars Team Mode Mob Kills of the Player
	 */
	@SerializedName("mob_kills_team")
	int mobKillsTeam = 0;

	/**
	 * Skywars Team Mode Longest Bow Kill of the Player
	 */
	@SerializedName("longest_bow_kill_team")
	int longestBowKillTeam = 0;

	/**
	 * Skywars Team Mode Bow Kills of the Player
	 */
	@SerializedName("bow_kills_team")
	int bowKillsTeam = 0;

	/**
	 * Skywars Team Mode Heads Collected by the Player
	 */
	@SerializedName("heads_team")
	int headsTeam = 0;

	/**
	 * Skywars Team Mode Fall Kills of the Player
	 */
	@SerializedName("fall_kills_team")
	int fallKillsTeam = 0;

	/**
	 * Skywars Ranked Mode Bow Kills of the Player
	 */
	@SerializedName("bow_kills_ranked")
	int bowKillsRanked = 0;

	/**
	 * Skywars Ranked Mode Longest Bow Kill of the Player
	 */
	@SerializedName("longest_bow_kill_ranked")
	int longestBowKillRanked = 0;

	/**
	 * Skywars Ranked Mode Mob Kills of the Player
	 */
	@SerializedName("mob_kills_ranked")
	int mobKillsRanked = 0;

	/**
	 * Skywars Ranked Mode Longest Bow Shot of the Player
	 */
	@SerializedName("longest_bow_shot_ranked")
	int longestBowShotRanked = 0;

	/**
	 * Skywars Ranked Mode Arrows Hit of the Player
	 */
	@SerializedName("arrows_hit_ranked")
	int arrowsHitRanked = 0;

	/**
	 * Skywars Current Ranked Active Kit of the Player
	 */
	@SerializedName("activeKit_RANKED")
	String activeKitRanked = "DEFAULT";

	/**
	 * Skywars Ranked Mode Arrows Shot by the Player
	 */
	@SerializedName("arrows_shot_ranked")
	int arrowsShotRanked = 0;

	/**
	 * Skywars Total Ranked Mode Games Played by the Player
	 */
	@SerializedName("games_ranked")
	int gamesPlayedRanked = 0;

	/**
	 * Skywars Total Ranked Mode Deaths of the Player
	 */
	@SerializedName("deaths_ranked")
	int deathsRanked = 0;

	/**
	 * Skywars Total Ranked Mode Losses of the Player
	 */
	@SerializedName("losses_ranked")
	int lossesRanked = 0;

	/**
	 * Skywars Ranked Mode Survived Players of the Player
	 */
	@SerializedName("survived_players_ranked")
	int survivedPlayersRanked = 0;

	/**
	 * Skywars Ranked Mode Chests Opened by the Player
	 */
	@SerializedName("chests_opened_ranked")
	int chestsOpenedRanked = 0;

	/**
	 * Skywars Ranked Mode Time Played of the Player (in Minutes)
	 */
	@SerializedName("time_played_ranked")
	int timePlayedRanked = 0;

	/**
	 * Skywars Ranked Mode Kills of the Player
	 */
	@SerializedName("kills_ranked")
	int killsRanked = 0;

	/**
	 * Skywars Ranked Mode Void Kills of the Player
	 */
	@SerializedName("void_kills_ranked")
	int voidKillsRanked = 0;

	/**
	 * Skywars Ranked Mode Most Kills in one Game of the Player
	 */
	@SerializedName("most_kills_game_ranked")
	int mostKillsRanked = 0;

	/**
	 * Skywars Ranked Mode Melee Kills of the Player
	 */
	@SerializedName("melee_kills_ranked")
	int meleeKillsRanked = 0;

	/**
	 * Skywars Ranked Mode Assists of the Player
	 */
	@SerializedName("assists_ranked")
	int assistsRanked = 0;

	/**
	 * Skywars Ranked Mode Fastest Win of the Player
	 */
	@SerializedName("fastest_win_ranked")
	int fastestWinRanked = 0;

	/**
	 * Skywars Ranked Mode Current Winstreak of the Player
	 */
	@SerializedName("winstreak_ranked")
	int winstreakRanked = 0;

	/**
	 * Skywars Ranked Mode Killstreak of the Player
	 */
	@SerializedName("killstreak_ranked")
	int killstreakRanked = 0;

	/**
	 * Skywars Ranked Mode Wins of the Player
	 */
	@SerializedName("wins_ranked")
	int winsRanked = 0;

	/**
	 * Skywars Ranked Mode Fall Kills of the Player
	 */
	@SerializedName("fall_kills_ranked")
	int fallKillsRanked = 0;

	/**
	 * Skywars Current Mega Mode Kit of the Player
	 */
	@SerializedName("activeKit_MEGA")
	String activeKitMega = "DEFAULT";

	/**
	 * Skywars Mega Mode Deaths of the Player
	 */
	@SerializedName("deaths_mega")
	int deathsMega = 0;

	/**
	 * Skywars Mega Mode Survived Players of the Player
	 */
	@SerializedName("survived_players_mega")
	int survivedPlayersMega = 0;

	/**
	 * Skywars Total Mega Mode Losses of the Player
	 */
	@SerializedName("losses_mega")
	int lossesMega = 0;

	/**
	 * Skywars Total Mega Mode Kills of the Player
	 */
	@SerializedName("kills_mega")
	int killsMega = 0;

	/**
	 * Skywars Mega Mode Assists of the Player
	 */
	@SerializedName("assists_mega")
	int assistsMega = 0;

	/**
	 * Skywars Total Games Played by the Player
	 */
	@SerializedName("games_mega")
	int gamesPlayedMega = 0;

	/**
	 * Skywars Current Mega Mode Winstreak of the Player
	 */
	@SerializedName("winstreak_mega")
	int winstreakMega = 0;

	/**
	 * Skywars Total Mega Mode Wins of the Player
	 */
	@SerializedName("wins_mega")
	int winsMega = 0;

	/**
	 * Skywars Mega Mode Longest Bow Kill of the Player
	 */
	@SerializedName("longest_bow_kill_mega")
	int longestBowKillMega = 0;

	/**
	 * Skywars Mega Mode Bow Kills of the Player
	 */
	@SerializedName("bow_kills_mega")
	int bowKillsMega = 0;

	/**
	 * Skywars Mega Mode Fall Kills of the Player
	 */
	@SerializedName("fall_kills_mega")
	int fallKillsMega = 0;

	/**
	 * Skywars Ranked Mode Chests Opened by the Player
	 */
	@SerializedName("chests_opened_mega")
	int chestsOpenedMega = 0;

	/**
	 * Skywars Mega Mode Most Kills in one Game of the Player
	 */
	@SerializedName("most_kills_game_mega")
	int mostKillsMega = 0;

	/**
	 * Skywars Mega Mode Melee Kills of the Player
	 */
	@SerializedName("melee_kills_mega")
	int meleeKillsMega = 0;

	/**
	 * Skywars Mega Mode Time Played of the Player (in Minutes)
	 */
	@SerializedName("time_played_mega")
	int timePlayedMega = 0;

	/**
	 * Skywars Mega Mode Longest Bow Shot of the Player
	 */
	@SerializedName("longest_bow_shot_mega")
	int longestBowShotMega = 0;

	/**
	 * Skywars Mega Mode Arrows Shot by the Player
	 */
	@SerializedName("arrows_shot_mega")
	int arrowsShotMega = 0;

	/**
	 * Skywars Mega Mode Arrows Hit of the Player
	 */
	@SerializedName("arrows_hit_mega")
	int arrowsHitMega = 0;

	/**
	 * Skywars Mega Mode Void Kills of the Player
	 */
	@SerializedName("void_kills_mega")
	int voidKillsMega = 0;

	/**
	 * Skywars Mega Mode Fastest Win of the Player
	 */
	@SerializedName("fastest_win_mega")
	int fastestWinMega = 0;

	/**
	 * Skywars Mega Mode Mob Kills of the Player
	 */
	@SerializedName("mob_kills_mega")
	int mobKillsMega = 0;

	/**
	 * Skywars Mega Mode Current Killstreak of the Player
	 */
	@SerializedName("killstreak_mega")
	int killstreakMega = 0;

	/**
	 * Skywars Lab Solo Mode Fastest Win of the Player
	 */
	@SerializedName("fastest_win_lab_solo")
	int fastestWinLabSolo = 0;

	/**
	 * Skywars Lab Team Mode Survived Player of the Player
	 */
	@SerializedName("survived_players_lab_team")
	int survivedPlayersLabTeam = 0;

	/**
	 * Skywars Lab Team Mode Chests Opened by the Player
	 */
	@SerializedName("chests_opened_lab_team")
	int chestsOpenedLabTeam = 0;

	/**
	 * Skywars Lab Team Mode Time Played of the Player (in Minutes)
	 */
	@SerializedName("time_played_lab_team")
	int timePlayedLabTeam = 0;

	/**
	 * Skywars Lab Mode Deaths of the Player
	 */
	@SerializedName("deaths_lab")
	int deathsLab = 0;

	/**
	 * Skywars Lab Mode Time Played of the Player (in Minutes)
	 */
	@SerializedName("time_played_lab")
	int timePlayedLab = 0;

	/**
	 * Skywars Lab Team Team Mode Assists of the Player
	 */
	@SerializedName("assists_lab_team")
	int assistsLabTeam = 0;

	/**
	 * Skywars Lab Mode Survived Players of the Player
	 */
	@SerializedName("survived_players_lab")
	int survivedPlayersLab = 0;

	/**
	 * Skywars Lab Mode Coins Gained by the Player
	 */
	@SerializedName("coins_gained_lab")
	int coinsGainedLab = 0;

	/**
	 * Skywars Lab Mode Chests Opened by the Player
	 */
	@SerializedName("chests_opened_lab")
	int chestsOpenedLab = 0;

	/**
	 * Skywars Lab Mode Assists of the Player
	 */
	@SerializedName("assists_lab")
	int assistsLab = 0;

	/**
	 * Skywars Lab Team Mode Losses of the Player
	 */
	@SerializedName("losses_lab_team")
	int lossesLabTeam = 0;

	/**
	 * Skywars Lab Mode Losses of the Player
	 */
	@SerializedName("losses_lab")
	int lossesLab = 0;

	/**
	 * Skywars Lab Mode Quits of the Player
	 */
	@SerializedName("quits_lab")
	int quitsLab = 0;

	/**
	 * Skywars Lab Mode Enderpearls Thrown by the Player
	 */
	@SerializedName("enderpearls_thrown_lab")
	int enderpearlsThrownLab = 0;

	/**
	 * Skywars Lab Team Mode Deaths of the Player
	 */
	@SerializedName("deaths_lab_team")
	int deathsLabTeam = 0;

	/**
	 * Skywars Lab Mode Wins of the Player
	 */
	@SerializedName("wins_lab")
	int winsLab = 0;

	/**
	 * Skywars Lab Mode Current Killstreak of the Player
	 */
	@SerializedName("killstreak_lab")
	int killstreakLab = 0;

	/**
	 * Skywars Lab Mode Void Kills of the Player
	 */
	@SerializedName("void_kills_lab")
	int voidKillsLab = 0;

	/**
	 * Skywars Lab Mode Souls Gathered by the Player
	 */
	@SerializedName("souls_gathered_lab")
	int soulsGatheredLab = 0;

	/**
	 * Skywars Lab Mode Games Played by the Player
	 */
	@SerializedName("games_lab")
	int gamesPlayedLab = 0;

	/**
	 * Skywars Lab Mode Kills of the Player
	 */
	@SerializedName("kills_lab")
	int killsLab = 0;

	/**
	 * Skywars Lab Mode Current Winstreak of the Player
	 */
	@SerializedName("winstreak_lab")
	int winstreakLab = 0;

	/**
	 * Skywars Lab Team Mode Melee Kills of the Player
	 */
	@SerializedName("melee_kills_lab_team")
	int meleeKillsLabTeam = 0;

	/**
	 * Skywars Lab Team Mode Kills of the Player
	 */
	@SerializedName("kills_lab_team")
	int killsLabTeam = 0;

	/**
	 * Skywars Lab Team Mode Current Winstreak of the Player
	 */
	@SerializedName("winstreak_lab_team")
	int winstreakLabTeam = 0;

	/**
	 * Skywars Lab Team Mode Games Played of the Player
	 */
	@SerializedName("games_lab_team")
	int gamesPlayedLabTeam = 0;

	/**
	 * Skywars Lab Team Mode Current Killstreak of the Player
	 */
	@SerializedName("killstreak_lab_team")
	int killstreakLabTeam = 0;

	/**
	 * Skywars Lab Mode Melee Kills of the Player
	 */
	@SerializedName("melee_kills_lab")
	int meleeKillsLab = 0;

	/**
	 * Skywars Lab Team Mode Wins of the Player
	 */
	@SerializedName("wins_lab_team")
	int winsLabTeam = 0;

	/**
	 * Skywars Lab Mode Souls of the Player
	 */
	@SerializedName("souls_lab")
	int soulsLab = 0;

	/**
	 * Skywars Lab Team Mode Void Kills of the Player
	 */
	@SerializedName("void_kills_lab_team")
	int voidKillsLabTeam = 0;

	/**
	 * Skywars Lab Mode Blocks Broken by the Player
	 */
	@SerializedName("blocks_broken_lab")
	int blocksBrokenLab = 0;

	/**
	 * Skywars Lab Team Mode Fastest Win of the Player
	 */
	@SerializedName("fastest_win_lab_team")
	int fastestWinLabTeam = 0;

	/**
	 * Skywars Lab Mode Fastest Win of the Player
	 */
	@SerializedName("fastest_win_lab")
	int fastestWinLab = 0;

	/**
	 * Skywars Lab Mode Fastest Win of the Player
	 */
	@SerializedName("egg_thrown_lab")
	int eggThrownLab = 0;

	/**
	 * Skywars Lab Solo Mode Survived Players of the Player
	 */
	@SerializedName("survived_players_lab_solo")
	int survivedPlayersLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Losses of the Player
	 */
	@SerializedName("losses_lab_solo")
	int lossesLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Melee Kills of the Player
	 */
	@SerializedName("melee_kills_lab_solo")
	int meleeKillsLabSolo = 0;

	/**
	 * Skywars Lab Solo Kills of the Player
	 */
	@SerializedName("kills_lab_solo")
	int killsLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Chests Opened by the Player
	 */
	@SerializedName("chests_opened_lab_solo")
	int chestsOpenedLabSolo = 0;

	/**
	 * Skywars Lab Solo Deaths of the Player
	 */
	@SerializedName("deaths_lab_solo")
	int deathsLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Time Played of the Player (in Minutes)
	 */
	@SerializedName("time_played_lab_solo")
	int timePlayedLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Games Played by the Player
	 */
	@SerializedName("games_lab_solo")
	int gamesPlayedLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Current Winstreak of the Player
	 */
	@SerializedName("winstreak_lab_solo")
	int winstreakLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Current Killstreak of the Player
	 */
	@SerializedName("killstreak_lab_solo")
	int killstreakLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Wins of the Player
	 */
	@SerializedName("wins_lab_solo")
	int winsLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Void Kills of the Player
	 */
	@SerializedName("void_kills_lab_solo")
	int voidKillsLabSolo = 0;

	/**
	 * Skywars Lab Mode Blocks Placed by the Player
	 */
	@SerializedName("blocks_placed_lab")
	int blocksPlacedLab = 0;

	/**
	 * Skywars Lab Solo Mode Assists of the Player
	 */
	@SerializedName("assists_lab_solo")
	int assistsLabSolo = 0;

	/**
	 * Skywars Lab Solo Mode Arrows Shot by the Player
	 */
	@SerializedName("arrows_shot_lab_solo")
	int arrowsShotLabSolo = 0;

	/**
	 * Skywars Lab Mode Arrows Shot by the Player
	 */
	@SerializedName("arrows_shot_lab")
	int arrowsShotLab = 0;

	/**
	 * Skywars Lab Team Mode Arrows Hit of the Player
	 */
	@SerializedName("arrows_hit_lab_team")
	int arrowsHitLabTeam = 0;

	/**
	 * Skywars Lab Team Mode Arrows Shot by the Player
	 */
	@SerializedName("arrows_shot_lab_team")
	int arrowsShotLabTeam = 0;

	/**
	 * Skywars Lab Mode Arrows Hit of the Player
	 */
	@SerializedName("arrows_hit_lab")
	int arrowsHitLab = 0;

	/**
	 * Skywars Lab Team Mob Kills of the Player
	 */
	@SerializedName("mob_kills_lab_team")
	int mobKillsLabTeam = 0;

	/**
	 * Skywars Lab Mode Mob Kills of the Player
	 */
	@SerializedName("mob_kills_lab")
	int mobKillsLab = 0;

	/**
	 * Skywars Lab Mode Longest Bow Shot of the Player
	 */
	@SerializedName("longest_bow_shot_lab")
	int longestBowShotLab = 0;

	/**
	 * Skywars Lab Team Mode Longest Bow Shot of the Player
	 */
	@SerializedName("longest_bow_shot_lab_team")
	int longestBowShotLabTeam = 0;

	/**
	 * Skywars Lab Solo Mode Arrows Hit of the Player
	 */
	@SerializedName("arrows_hit_lab_solo")
	int arrowsHitLabSolo = 0;

	/**
	 * Skywars Lab Solo Longest Bow Shot of the Player
	 */
	@SerializedName("longest_bow_shot_lab_solo")
	int longestBowShotLabSolo = 0;

	/**
	 * Skywars Lab Solo Mob Kills of the Player
	 */
	@SerializedName("mob_kills_lab_solo")
	int mobKillsLabSolo = 0;

	/**
	 * Skywars lab Mode Bow Kills of the Player
	 */
	@SerializedName("bow_kills_lab")
	int bowKillsLab = 0;

	/**
	 * Skywars Lab Solo Mode Bow Kills of the Player
	 */
	@SerializedName("bow_kills_lab_solo")
	int bowKillsLabSolo = 0;

	/**
	 * Skywars Lab Mode Shard Gathered by the Player
	 */
	@SerializedName("shard_lab")
	int shardLab = 0;

	/**
	 * Skywars Lab Mode Fall Kills of the Player
	 */
	@SerializedName("fall_kills_lab")
	int fallKillsLab = 0;

	/**
	 * Skywars Lab Solo Mode Fall Kills of the Player
	 */
	@SerializedName("fall_kills_lab_solo")
	int fallKillsLabSolo = 0;

	/**
	 * Skywars Total Heads Collected by the Player
	 */
	@SerializedName("heads")
	int heads = 0;

	/**
	 * Skywars Heads Eww Collected by the Player
	 */
	@SerializedName("heads_eww")
	int headsEww = 0;

	/**
	 * Skywars Solo Mode Heads Collected by the Player
	 */
	@SerializedName("heads_solo")
	int headsSolo = 0;

	/**
	 * Skywars Heads Tasty Collected by the Player
	 */
	@SerializedName("heads_tasty")
	int headsTasty = 0;

	/**
	 * Skywars heads Divine Collected by the Player
	 */
	@SerializedName("heads_divine")
	int headsDivine = 0;

	/**
	 * Skywars Heads Succulent Collected by the Player
	 */
	@SerializedName("heads_succulent")
	int headsSucculent = 0;

	/**
	 * Skywars Heads Yucky Collected by the Player
	 */
	@SerializedName("heads_yucky")
	int headsYucky = 0;

	/**
	 * Skywars Heads Salty Collected by the Player
	 */
	@SerializedName("heads_salty")
	int headsSalty = 0;

	/**
	 * Skywars Heads Decent Collected by the Player
	 */
	@SerializedName("heads_decent")
	int headsDecent = 0;

	/**
	 * Skywars Heads Meh Collected by the Player
	 */
	@SerializedName("heads_meh")
	int headsMeh = 0;

	/**
	 * Skywars Heads Heavenly Collected by the Player
	 */
	@SerializedName("heads_heavenly")
	int headsHeavenly = 0;

	/**
	 * Skywars Heads Sweet Collected by the Player
	 */
	@SerializedName("heads_sweet")
	int headsSweet = 0;

	/**
	 * Private Games Settings of the Player
	 */
	@SerializedName("privategames")
	PrivateGames privateGames = new PrivateGames();


	/**
	 * Get Current Skywars Winstreak of the Player
	 *
	 * @return Current Winstreak
	 */
	public int getWinstreak() {
		return winstreak;
	}

	/**
	 * Get Current Skywars Killstreak of the Player
	 *
	 * @return Current Killstreak
	 */
	public int getKillStreak() {
		return killStreak;
	}

	/**
	 * Get Highest Skywars Killstreak of the Player
	 *
	 * @return Highest Killstreak
	 */
	public int getHighestKillstreak() {
		return highestKillstreak;
	}

	/**
	 * Get Highest Skywars Winstreak of the Player
	 *
	 * @return Highest Winstreak
	 */
	public int getHighestWinstreak() {
		return highestWinstreak;
	}

	/**
	 * Get Total Skywars Survived Players of the Player
	 *
	 * @return Survived Players
	 */
	public int getSurvivedPlayers() {
		return survivedPlayers;
	}

	/**
	 * Get Total Skywars Losses of the Player
	 *
	 * @return Losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * Get Total Skywars Deaths of the Player
	 *
	 * @return Deaths
	 */
	public int getDeaths() {
		return deaths;
	}

	/**
	 * Get Total Skywars Quits of the Player
	 *
	 * @return Quits
	 */
	public int getQuits() {
		return quits;
	}

	/**
	 * Get Total Skywars Coins of the Player
	 *
	 * @return Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Total Skywars Blocks Broken by the Player
	 *
	 * @return Blocks Broken
	 */
	public int getBlocksBroken() {
		return blocksBroken;
	}

	/**
	 * Get Skywars Unlocked Packaged (Cosmetics) of the Player
	 *
	 * @return List of All Unlocked Packages
	 */
	public List<String> getUnlockedPackages() {
		return unlockedPackages;
	}

	/**
	 * Get Total Skywars Games Played by the Player
	 *
	 * @return Games Played
	 */
	public int getGamesPlayed() {
		return gamesPlayed;
	}

	/**
	 * Get Total Skywars Blocks Placed by the Player
	 *
	 * @return Blocks Placed
	 */
	public int getBlocksPlaced() {
		return blocksPlaced;
	}

	/**
	 * Get Total Skywars Kills of the Player
	 *
	 * @return Kills
	 */
	public int getKills() {
		return kills;
	}

	/**
	 * Get Total Skywars Egg Thrown by the Player
	 *
	 * @return Egg Thrown
	 */
	public int getEggThrown() {
		return eggThrown;
	}

	/**
	 * Get Total Skywars Souls Gathered by the Player
	 *
	 * @return Souls Gathered
	 */
	public int getSoulsGathered() {
		return soulsGathered;
	}

	/**
	 * Get Total Skywars Souls of the Player
	 *
	 * @return Souls
	 */
	public int getSouls() {
		return souls;
	}

	/**
	 * Get Total Skywars Arrows Hit of the Playerz
	 *
	 * @return Arrows Hit
	 */
	public int getArrowsHit() {
		return arrowsHit;
	}

	/**
	 * Get Total Skywars Arrows Shot by the Player
	 *
	 * @return Arrows Shot
	 */
	public int getArrowsShot() {
		return arrowsShot;
	}

	/**
	 * Get Total Skywars Enderpearls Thrown by the Player
	 *
	 * @return Enderpearls Thrown
	 */
	public int getEnderpearlsThrown() {
		return enderpearlsThrown;
	}

	/**
	 * Get Total Skywars Assists of the Player
	 *
	 * @return Assists
	 */
	public int getAssists() {
		return assists;
	}

	/**
	 * Get Total Skywars Wins of the Player
	 *
	 * @return Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Total Skywars Items Enchanted by the Player
	 *
	 * @return Items Enchanted
	 */
	public int getItemsEnchanted() {
		return itemsEnchanted;
	}

	/**
	 * Get Total Skywars Soul Well Spin of the Player
	 *
	 * @return Soul Well Spin
	 */
	public int getSoulWell() {
		return soulWell;
	}

	/**
	 * Get Soul Well Rares Found Items of the Player
	 *
	 * @return Soul Well Rares Items
	 */
	public int getSoulWellRares() {
		return soulWellRares;
	}

	/**
	 * Get Soul Well Legendaries Found Items of the Player
	 *
	 * @return Soul Well Legendaries Items
	 */
	public int getSoulWellLegendaries() {
		return soulWellLegendaries;
	}

	/**
	 * Get Total Skywars Paid Souls
	 *
	 * @return Paid Souls
	 */
	public int getPaidSouls() {
		return paidSouls;
	}

	/**
	 * Get Current Cage Used by the Player
	 *
	 * @return Pre-Game Cage
	 */
	public String getActiveCage() {
		return activeCage;
	}

	/**
	 * Get Total Skywars Chests Opened by the Player
	 *
	 * @return Chests Opened
	 */
	public int getChestsOpened() {
		return chestsOpened;
	}

	/**
	 * Get Total Skywars Time Played of the Player (in Minutes)
	 *
	 * @return Time Played
	 */
	public int getTimePlayed() {
		return timePlayed;
	}

	/**
	 * Get Total Skywars Void Kills of the Player
	 *
	 * @return Void Kills
	 */
	public int getVoidKills() {
		return voidKills;
	}

	/**
	 * Get Most Kills in one Game of the Player
	 *
	 * @return Most Kills in one Game
	 */
	public int getMostKills() {
		return mostKills;
	}

	/**
	 * Get Skywars Longest Bow Shot of the Player
	 *
	 * @return Longest Bow Shot
	 */
	public int getLongestBowShot() {
		return longestBowShot;
	}

	/**
	 * Get Skywars Fastest Win of the Player (in Seconds)
	 *
	 * @return Fastest Win
	 */
	public int getFastestWin() {
		return fastestWin;
	}

	/**
	 * Get Total Skywars Melee Kills of the Player
	 *
	 * @return Melee Kills
	 */
	public int getMeleeKills() {
		return meleeKills;
	}

	/**
	 * Get Total Skywars Mob Kills of the Player
	 *
	 * @return Mob Kills
	 */
	public int getMobKills() {
		return mobKills;
	}

	/**
	 * Get Last Skywars Mode Played by the Player
	 *
	 * @return Last Mode
	 */
	public String getLastMode() {
		return lastMode;
	}

	/**
	 * Get Skywars Projectile Trail of the Player
	 *
	 * @return Projectile Trail
	 */
	public String getActiveProjectileTrail() {
		return activeProjectileTrail;
	}

	/**
	 * Get Skywars Victory Dance of the Player
	 *
	 * @return Victory Dance
	 */
	public String getActiveVictoryDance() {
		return activeVictoryDance;
	}

	/**
	 * Get Skywars Kill Effect of the Player
	 *
	 * @return Kill Effect
	 */
	public String getActiveKillEffect() {
		return activeKillEffect;
	}

	/**
	 * Get Skywars Longest Bow Kills of the Player
	 *
	 * @return Longest Bow Kill
	 */
	public int getLongestBowKill() {
		return longestBowKill;
	}

	/**
	 * Get Total Skywars Cosmetics Tokens of the Player
	 *
	 * @return Cosmetics Tokens
	 */
	public int getTokens() {
		return tokens;
	}

	/**
	 * Get Current Skywars Death Cry of the Player
	 *
	 * @return Death Cry
	 */
	public String getActiveDeathCry() {
		return activeDeathCry;
	}

	/**
	 * Get Total Skywars Bow Kills of the Player
	 *
	 * @return Bow Kills
	 */
	public int getBowKills() {
		return bowKills;
	}

	/**
	 * Get Current Skywars Spray of the Player
	 *
	 * @return Spray
	 */
	public String getActiveSprays() {
		return activeSprays;
	}

	/**
	 * Get Current Skywars Balloon of the Player
	 *
	 * @return Balloon
	 */
	public String getActiveBalloon() {
		return activeBalloon;
	}

	/**
	 * Get Total Skywars Experience of the Player
	 *
	 * @return Skywars Experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * Get Skywars Prestige Icon of the Player
	 *
	 * @return Prestige Icon
	 */
	public String getPrestigeIcon() {
		return prestigeIcon;
	}

	/**
	 * Get Skywars Angel of the Death Level of the Player
	 *
	 * @return Angel of the Deaths Level
	 */
	public int getAngelDeathLevel() {
		return angelDeathLevel;
	}

	/**
	 * Get Skywars Opals of the Player
	 *
	 * @return Opals
	 */
	public int getOpals() {
		return opals;
	}

	/**
	 * Get Skywars Shard of the Player
	 *
	 * @return Shard
	 */
	public int getShard() {
		return shard;
	}

	/**
	 * Get Total Skywars Fall Kills of the Player
	 *
	 * @return Fall Kills
	 */
	public int getFallKills() {
		return fallKills;
	}

	/**
	 * Get Solo Mode Survived Players of the Player
	 *
	 * @return Solo Survived Players
	 */
	public int getSurvivedPlayersSolo() {
		return survivedPlayersSolo;
	}

	/**
	 * Get Solo Mode Deaths of the Player
	 *
	 * @return Solo Deaths
	 */
	public int getDeathsSoloNormal() {
		return deathsSoloNormal;
	}

	/**
	 * Get Solo Mode Losses of the Player
	 *
	 * @return Solo Losses
	 */
	public int getLossesSolo() {
		return lossesSolo;
	}

	/**
	 * Get Solo Normal Mode Losses of the Player
	 *
	 * @return Solo Normal Losses
	 */
	public int getLossesSoloNormal() {
		return lossesSoloNormal;
	}

	/**
	 * Get Solo Mode Deaths of the Player
	 *
	 * @return Solo Deaths
	 */
	public int getDeathsSolo() {
		return deathsSolo;
	}

	/**
	 * Get Solo Normal Mode Deaths of the Player
	 *
	 * @return Solo Normal Deaths
	 */
	public int getKillsSoloNormal() {
		return killsSoloNormal;
	}

	/**
	 * Get Solo Mode Kills of the Player
	 *
	 * @return Solo Kills
	 */
	public int getKillsSolo() {
		return killsSolo;
	}

	/**
	 * Get Solo Mode Games Played by the Player
	 *
	 * @return Solo Games Played
	 */
	public int getGamesPlayedSolo() {
		return gamesPlayedSolo;
	}

	/**
	 * Get Solo Insane Mode Losses of the Player
	 *
	 * @return Solo Insane Losses
	 */
	public int getLossesSoloInsane() {
		return lossesSoloInsane;
	}

	/**
	 * Get Solo Insane Mode Deaths of the Player
	 *
	 * @return Solo Insane Deaths
	 */
	public int getDeathsSoloInsane() {
		return deathsSoloInsane;
	}

	/**
	 * Get Solo Insane Mode Kills of the Player
	 *
	 * @return Solo Insane Kills
	 */
	public int getKillsSoloInsane() {
		return killsSoloInsane;
	}

	/**
	 * Get Solo Mode Current Killstreak of the Player
	 *
	 * @return Solo Killstreak
	 */
	public int getSoloKillstreak() {
		return soloKillstreak;
	}

	/**
	 * Get Solo Insane Mode Wins of the Player
	 *
	 * @return Solo Insane Wins
	 */
	public int getWinsSoloInsane() {
		return winsSoloInsane;
	}

	/**
	 * Get Solo Mode Winstreak of the Player
	 *
	 * @return Solo Winstreak
	 */
	public int getSoloWinstreak() {
		return soloWinstreak;
	}

	/**
	 * Get Solo Mode Wins of the Player
	 *
	 * @return Solo Wins
	 */
	public int getWinsSolo() {
		return winsSolo;
	}

	/**
	 * Get Solo Mode Assists of the Player
	 *
	 * @return Solo Assists
	 */
	public int getAssistsSolo() {
		return assistsSolo;
	}

	/**
	 * Get Current Skywars Active Solo Kit of the Player
	 *
	 * @return Active Solo Kit
	 */
	public String getActiveKitSolo() {
		return activeKitSolo;
	}

	/**
	 * Get Solo Normal Mode Wins of the Player
	 *
	 * @return Solo Normal Wins
	 */
	public int getWinsSoloNormal() {
		return winsSoloNormal;
	}

	/**
	 * Get Solo Mode Chests Opened by the Player
	 *
	 * @return Solo Chests Opened
	 */
	public int getChestsOpenedSolo() {
		return chestsOpenedSolo;
	}

	/**
	 * Get Solo Mode Time Played of the Player (in Minutes)
	 *
	 * @return Solo Time Played
	 */
	public int getTimePlayedSolo() {
		return timePlayedSolo;
	}

	/**
	 * Get Solo Mode Most Kills in one Game of the Player
	 *
	 * @return Solo Most Kills in one Game
	 */
	public int getMostKillsSolo() {
		return mostKillsSolo;
	}

	/**
	 * Get Solo Mode Void Kills of the Player
	 *
	 * @return Solo Void Kills
	 */
	public int getVoidKillsSolo() {
		return voidKillsSolo;
	}

	/**
	 * Get Solo Mode Longest Bow Shot of the Player
	 *
	 * @return Solo Longest Bow Shot
	 */
	public int getLongestBowShotSolo() {
		return longestBowShotSolo;
	}

	/**
	 * Get Solo Mode Arrows Hit of the Player
	 *
	 * @return Solo Arrows Hit
	 */
	public int getArrowsHitSolo() {
		return arrowsHitSolo;
	}

	/**
	 * Get Solo Mode Arrows Shot of the Player
	 *
	 * @return Solo Arrows Shot
	 */
	public int getArrowsShotSolo() {
		return arrowsShotSolo;
	}

	/**
	 * Get Solo Mode Fastest Win of the player (in Seconds)
	 *
	 * @return Solo Fastest Win
	 */
	public int getFastestWinSolo() {
		return fastestWinSolo;
	}

	/**
	 * Get Solo Mode Melee Kills of the Player
	 *
	 * @return Solo Melee Kills
	 */
	public int getMeleeKillsSolo() {
		return meleeKillsSolo;
	}

	/**
	 * Get Solo Mode Mob Kills of the Player
	 *
	 * @return Solo Mob Kills
	 */
	public int getMobKillsSolo() {
		return mobKillsSolo;
	}

	/**
	 * Get Solo Mode Bow Kills of the Player
	 *
	 * @return Solo Bow Kills
	 */
	public int getBowKillsSolo() {
		return bowKillsSolo;
	}

	/**
	 * Get Solo Mode Longest Bow Kill of the Player
	 *
	 * @return Solo Longest Bow Kill
	 */
	public int getLongestBowKillSolo() {
		return longestBowKillSolo;
	}

	/**
	 * Get Solo Mode Fall Kills of the Player
	 *
	 * @return Solo Fall Kills
	 */
	public int getFallKillsSolo() {
		return fallKillsSolo;
	}

	/**
	 * Get Team Mode Fastest Win (in Seconds)
	 *
	 * @return Team Fastest Win
	 */
	public int getFastestWinTeam() {
		return fastestWinTeam;
	}

	/**
	 * Get Team Normal Mode Deaths of the Player
	 *
	 * @return Team Normal Deaths
	 */
	public int getDeathsTeamNormal() {
		return deathsTeamNormal;
	}

	/**
	 * Get Team Normal Mode Losses of the Player
	 *
	 * @return Team Normal Losses
	 */
	public int getLossesTeamNormal() {
		return lossesTeamNormal;
	}

	/**
	 * Get Team Mode Deaths of the Player
	 *
	 * @return Team Deaths
	 */
	public int getDeathsTeam() {
		return deathsTeam;
	}

	/**
	 * Get Team Mode Survived Players of the Player
	 *
	 * @return Team Survived Players
	 */
	public int getSurvivedPlayersTeam() {
		return survivedPlayersTeam;
	}

	/**
	 * Get Team Mode Losses of the Player
	 *
	 * @return Team Losses
	 */
	public int getLossesTeam() {
		return lossesTeam;
	}

	/**
	 * Get Team Mode Games Played by the Player
	 *
	 * @return Team Games Played
	 */
	public int getGamesPlayedTeam() {
		return gamesPlayedTeam;
	}

	/**
	 * Get Team Insane Mode Deaths of the Player
	 *
	 * @return Team Insane Deaths
	 */
	public int getDeathsInsaneTeam() {
		return deathsInsaneTeam;
	}

	/**
	 * Get Team Insane Mode Losses of the Player
	 *
	 * @return Team Insane Losses
	 */
	public int getLossesTeamInsane() {
		return lossesTeamInsane;
	}

	/**
	 * Get Team Mode Assists of the Player
	 *
	 * @return Team Assists
	 */
	public int getAssistsTeam() {
		return assistsTeam;
	}

	/**
	 * Get Team Insane Mode Wins of the Player
	 *
	 * @return Team Insane Wins
	 */
	public int getWinsTeamInsane() {
		return winsTeamInsane;
	}

	/**
	 * Get Team Mode Wins of the Player
	 *
	 * @return Team Wins
	 */
	public int getWinsTeam() {
		return winsTeam;
	}

	/**
	 * Get Team Mode Current Winstreak of the Player
	 *
	 * @return Team Winstreak
	 */
	public int getWinstreakTeam() {
		return winstreakTeam;
	}

	/**
	 * Get Current Active Team Kit of the Player
	 *
	 * @return Active Team Kit
	 */
	public String getActiveKitTeam() {
		return activeKitTeam;
	}

	/**
	 * Get Team Normal Wins of the Player
	 *
	 * @return Team Normal Wins
	 */
	public int getWinsTeamNormal() {
		return winsTeamNormal;
	}

	/**
	 * Get Team Insane Kills of the Player
	 *
	 * @return Team Insane Kills
	 */
	public int getKillsTeamInsane() {
		return killsTeamInsane;
	}

	/**
	 * Get Team Mode Kills of the Player
	 *
	 * @return Team Kills
	 */
	public int getKillsTeam() {
		return killsTeam;
	}

	/**
	 * Get Current Team Mode Killstreak of the Player
	 *
	 * @return Team Killstreak
	 */
	public int getKillstreakTeam() {
		return killstreakTeam;
	}

	/**
	 * Get Team Normal Mode Kills of the Player
	 *
	 * @return Team Normal Kills
	 */
	public int getKillsTeamNormal() {
		return killsTeamNormal;
	}

	/**
	 * Get Team Mode Melee Kills of the Player
	 *
	 * @return Team Melee Kills
	 */
	public int getMeleeKillsTeam() {
		return meleeKillsTeam;
	}

	/**
	 * Get Team Mode Most Kills in one Game of the Player
	 *
	 * @return Team Most Kills in one Game
	 */
	public int getMostKillsTeam() {
		return mostKillsTeam;
	}

	/**
	 * Get Team Mode Chests Opened by the Player
	 *
	 * @return Team Chests Opened
	 */
	public int getChestsOpenedTeam() {
		return chestsOpenedTeam;
	}

	/**
	 * Get Team Mode Time Played of the Player
	 *
	 * @return Team Time Played
	 */
	public int getTimePlayedTeam() {
		return timePlayedTeam;
	}

	/**
	 * Get Team Mode Longest Bow Shot of the Player
	 *
	 * @return Team Longest Bow Shot
	 */
	public int getLongestBowShotTeam() {
		return longestBowShotTeam;
	}

	/**
	 * Get Team Mode Arrows Shot by the Player
	 *
	 * @return Team Arrows Shot
	 */
	public int getArrowsShotTeam() {
		return arrowsShotTeam;
	}

	/**
	 * Get Team Mode Arrows Hit of the Player
	 *
	 * @return Team Arrows Hit
	 */
	public int getArrowsHitTeam() {
		return arrowsHitTeam;
	}

	/**
	 * Get Team Mode Void Kills of the Player
	 *
	 * @return Team Void Kills
	 */
	public int getVoidKillsTeam() {
		return voidKillsTeam;
	}

	/**
	 * Get Team Mode Mob Kills of the Player
	 *
	 * @return Team Mob Kills
	 */
	public int getMobKillsTeam() {
		return mobKillsTeam;
	}

	/**
	 * Get Team Mode Longest Bow Kill of the Player
	 *
	 * @return Team Longest Bow Kill
	 */
	public int getLongestBowKillTeam() {
		return longestBowKillTeam;
	}

	/**
	 * Get Team Mode Bow Kills of the Player
	 *
	 * @return Team Bow Kills
	 */
	public int getBowKillsTeam() {
		return bowKillsTeam;
	}

	/**
	 * Get Team Mode Fall Kills of the Player
	 *
	 * @return Team Fall Kills
	 */
	public int getFallKillsTeam() {
		return fallKillsTeam;
	}

	/**
	 * Get Ranked Mode Bow Kills of the Player
	 *
	 * @return Ranked Bow Kills
	 */
	public int getBowKillsRanked() {
		return bowKillsRanked;
	}

	/**
	 * Get Ranked Mode Longest Bow Kill of the Player
	 *
	 * @return Ranked Longest Bow Kill
	 */
	public int getLongestBowKillRanked() {
		return longestBowKillRanked;
	}

	/**
	 * Get Ranked Mode Mob Kills of the Player
	 *
	 * @return Ranked Mob Kills
	 */
	public int getMobKillsRanked() {
		return mobKillsRanked;
	}

	/**
	 * Get Ranked Mode Longest Bow Shot of the Player
	 *
	 * @return Ranked Longest Bow Shot
	 */
	public int getLongestBowShotRanked() {
		return longestBowShotRanked;
	}

	/**
	 * Get Ranked Mode Arrows Hit of the Player
	 *
	 * @return Ranked Arrows Hit
	 */
	public int getArrowsHitRanked() {
		return arrowsHitRanked;
	}

	/**
	 * Get Skywars Active Ranked Kit of the Player
	 *
	 * @return Active Ranked Kit
	 */
	public String getActiveKitRanked() {
		return activeKitRanked;
	}

	/**
	 * Get Ranked Mode Arrows Shot of the Player
	 *
	 * @return Ranked Arrows Shot
	 */
	public int getArrowsShotRanked() {
		return arrowsShotRanked;
	}

	/**
	 * Get Ranked Mode Games Played by the Player
	 *
	 * @return Ranked Games Played
	 */
	public int getGamesPlayedRanked() {
		return gamesPlayedRanked;
	}

	/**
	 * Get Ranked Mode Deaths of the Player
	 *
	 * @return Ranked Deaths
	 */
	public int getDeathsRanked() {
		return deathsRanked;
	}

	/**
	 * Get Ranked Mode Losses of the Player
	 *
	 * @return Ranked Losses
	 */
	public int getLossesRanked() {
		return lossesRanked;
	}

	/**
	 * Get Ranked Mode Survived Players of the Player
	 *
	 * @return Ranked Survived Players
	 */
	public int getSurvivedPlayersRanked() {
		return survivedPlayersRanked;
	}

	/**
	 * Get Ranked Mode Chests Opened by the Player
	 *
	 * @return Ranked Chests Opened
	 */
	public int getChestsOpenedRanked() {
		return chestsOpenedRanked;
	}

	/**
	 * Get Ranked Mode Time Played of the Player (in Minutes)
	 *
	 * @return Ranked Time Played
	 */
	public int getTimePlayedRanked() {
		return timePlayedRanked;
	}

	/**
	 * Get Ranked Mode Kills of the Player
	 *
	 * @return Ranked Kills
	 */
	public int getKillsRanked() {
		return killsRanked;
	}

	/**
	 * Get Ranked Mode Void Kills of the Player
	 *
	 * @return Ranked Void Kills
	 */
	public int getVoidKillsRanked() {
		return voidKillsRanked;
	}

	/**
	 * Get Ranked Mode Most Kills in one Game of the Player
	 *
	 * @return Ranked Most Kills in one Game
	 */
	public int getMostKillsRanked() {
		return mostKillsRanked;
	}

	/**
	 * Get Ranked Mode Melee Kills of the Player
	 *
	 * @return Ranked Melee Kills
	 */
	public int getMeleeKillsRanked() {
		return meleeKillsRanked;
	}

	/**
	 * Get Ranked Mode Assists of the Player
	 *
	 * @return Ranked Assists
	 */
	public int getAssistsRanked() {
		return assistsRanked;
	}

	/**
	 * Get Ranked Mode Fastest Win of the Player (in Seconds)
	 *
	 * @return Ranked Fastest Win
	 */
	public int getFastestWinRanked() {
		return fastestWinRanked;
	}

	/**
	 * Get Ranked Mode Current Winstreak of the Player
	 *
	 * @return Ranked Winstreak
	 */
	public int getWinstreakRanked() {
		return winstreakRanked;
	}

	/**
	 * Get Ranked Mode Current Killstreak of the Player
	 *
	 * @return Ranked Killstreak
	 */
	public int getKillstreakRanked() {
		return killstreakRanked;
	}

	/**
	 * Get Ranked Wins of the Player
	 *
	 * @return Ranked Wins
	 */
	public int getWinsRanked() {
		return winsRanked;
	}

	/**
	 * Get Ranked Mode Fall Kills of the Player
	 *
	 * @return Ranked Fall Kills
	 */
	public int getFallKillsRanked() {
		return fallKillsRanked;
	}

	/**
	 * Get Skywars Active Mega Kit of the Player
	 *
	 * @return Active Mega Kit
	 */
	public String getActiveKitMega() {
		return activeKitMega;
	}

	/**
	 * Get Mega Mode Deaths of the Player
	 *
	 * @return Mega Deaths
	 */
	public int getDeathsMega() {
		return deathsMega;
	}

	/**
	 * Get Mega Mode Survived Players of the Player
	 *
	 * @return Mega Survived Players
	 */
	public int getSurvivedPlayersMega() {
		return survivedPlayersMega;
	}

	/**
	 * Get Mega Mode Losses of the Player
	 *
	 * @return Mega Losses
	 */
	public int getLossesMega() {
		return lossesMega;
	}

	/**
	 * Get Mega Mode Kills of the Player
	 *
	 * @return Mega Kills
	 */
	public int getKillsMega() {
		return killsMega;
	}

	/**
	 * Get Mega Mode Assists of the Player
	 *
	 * @return Mega Assists
	 */
	public int getAssistsMega() {
		return assistsMega;
	}

	/**
	 * Get Mega Mode Games Played by the Player
	 *
	 * @return Mega Games Played
	 */
	public int getGamesPlayedMega() {
		return gamesPlayedMega;
	}

	/**
	 * Get Mega Mode Current Winstreak of the Player
	 *
	 * @return Mega Current Winstreak
	 */
	public int getWinstreakMega() {
		return winstreakMega;
	}

	/**
	 * Get Mega Mode Wins of the Player
	 *
	 * @return Mega Wins
	 */
	public int getWinsMega() {
		return winsMega;
	}

	/**
	 * Get Mega Mode Longest Bow Kill of the Player
	 *
	 * @return Mega Longest Bow Kill
	 */
	public int getLongestBowKillMega() {
		return longestBowKillMega;
	}

	/**
	 * Get Mega Mode Bow Kills of the Player
	 *
	 * @return Mega Bow Kills
	 */
	public int getBowKillsMega() {
		return bowKillsMega;
	}

	/**
	 * Get Mega Mode Fall Kills of the Player
	 *
	 * @return Mega Fall Kills
	 */
	public int getFallKillsMega() {
		return fallKillsMega;
	}

	/**
	 * Get Mega Mode Chests Opened by the Player
	 *
	 * @return Mega Chests Opened
	 */
	public int getChestsOpenedMega() {
		return chestsOpenedMega;
	}

	/**
	 * Get Mega Mode Most Kills in one game of the Player
	 *
	 * @return Mega Most Kills in one Game
	 */
	public int getMostKillsMega() {
		return mostKillsMega;
	}

	/**
	 * Get Mega Mode Melee Kills of the Player
	 *
	 * @return Mega Melee Kills
	 */
	public int getMeleeKillsMega() {
		return meleeKillsMega;
	}

	/**
	 * Get Mega Mode Time Played of the Player (in Minutes)
	 *
	 * @return Mega Time Played
	 */
	public int getTimePlayedMega() {
		return timePlayedMega;
	}

	/**
	 * Get Mega Mode Longest Bow Shot of the Player
	 *
	 * @return Mega Longest Bow Shot
	 */
	public int getLongestBowShotMega() {
		return longestBowShotMega;
	}

	/**
	 * Get Mega Mode Arrows Shot by the Player
	 *
	 * @return Mega Arrows Shot
	 */
	public int getArrowsShotMega() {
		return arrowsShotMega;
	}

	/**
	 * Get Mega Mode Arrows Hit of the Player
	 *
	 * @return Mega Arrows Hit
	 */
	public int getArrowsHitMega() {
		return arrowsHitMega;
	}

	/**
	 * Get Mega Mode Void Kills of the Player
	 *
	 * @return Mega Void Kills
	 */
	public int getVoidKillsMega() {
		return voidKillsMega;
	}

	/**
	 * Get Mega Mode Fastest Win of the Player (in Seconds)
	 *
	 * @return Mega Fastest Win
	 */
	public int getFastestWinMega() {
		return fastestWinMega;
	}

	/**
	 * Get Mega Mode Mob Kills of the Player
	 *
	 * @return Mega Mob Kills
	 */
	public int getMobKillsMega() {
		return mobKillsMega;
	}

	/**
	 * Get Current Mega Mode Killstreak of the Player
	 *
	 * @return Mega Killstreak
	 */
	public int getKillstreakMega() {
		return killstreakMega;
	}

	/**
	 * Get Lab Solo Mode Fastest Win of the Player (in Seconds)
	 *
	 * @return Lab Solo Fastest Win
	 */
	public int getFastestWinLabSolo() {
		return fastestWinLabSolo;
	}

	/**
	 * Get Lab Team Mode Survived Players of the Player
	 *
	 * @return Lab Team Survived Players
	 */
	public int getSurvivedPlayersLabTeam() {
		return survivedPlayersLabTeam;
	}

	/**
	 * Get Lab Team Mode Chests Opened by the Player
	 *
	 * @return Lab Team Chests Opened
	 */
	public int getChestsOpenedLabTeam() {
		return chestsOpenedLabTeam;
	}

	/**
	 * Get Lab Team Mode Time Played of the Player (in Minutes)
	 *
	 * @return Lab Team Time Played
	 */
	public int getTimePlayedLabTeam() {
		return timePlayedLabTeam;
	}

	/**
	 * Get Lab Mode Deaths of the Player
	 *
	 * @return Lab Deaths
	 */
	public int getDeathsLab() {
		return deathsLab;
	}

	/**
	 * Get Lab Mode Time Played of the Player (in Minutes)
	 *
	 * @return Lab Time Played
	 */
	public int getTimePlayedLab() {
		return timePlayedLab;
	}

	/**
	 * Get Lab Team Mode Assists of the Player
	 *
	 * @return Lab Team Assists
	 */
	public int getAssistsLabTeam() {
		return assistsLabTeam;
	}

	/**
	 * Get Lab Mode Survived Players of the Player
	 *
	 * @return Lab Survived Players
	 */
	public int getSurvivedPlayersLab() {
		return survivedPlayersLab;
	}

	/**
	 * Get Lab Mode Coins Gained by the Player
	 *
	 * @return Lab Coins Gained
	 */
	public int getCoinsGainedLab() {
		return coinsGainedLab;
	}

	/**
	 * Get Lab Mode Chests Opened by the Player
	 *
	 * @return Lab Chests Opened
	 */
	public int getChestsOpenedLab() {
		return chestsOpenedLab;
	}

	/**
	 * Get Lab Mode Assists of the Player
	 *
	 * @return Lab Assist
	 */
	public int getAssistsLab() {
		return assistsLab;
	}

	/**
	 * Get Lab Team Mode Losses of the Player
	 *
	 * @return Lab Team Losses
	 */
	public int getLossesLabTeam() {
		return lossesLabTeam;
	}

	/**
	 * Get Lab Mode Losses of the Player
	 *
	 * @return Lab Losses
	 */
	public int getLossesLab() {
		return lossesLab;
	}

	/**
	 * Get Lab Mode Quits of the Player
	 *
	 * @return Lab Quits
	 */
	public int getQuitsLab() {
		return quitsLab;
	}

	/**
	 * Get Lab Mode Enderpearls Thrown by the Player
	 *
	 * @return Lab Enderpearls Thrown
	 */
	public int getEnderpearlsThrownLab() {
		return enderpearlsThrownLab;
	}

	/**
	 * Get Lab Team Mode Deaths of the Player
	 *
	 * @return Lab Team Deaths
	 */
	public int getDeathsLabTeam() {
		return deathsLabTeam;
	}

	/**
	 * Get Lab Mode Wins of the Player
	 *
	 * @return Lab Wins
	 */
	public int getWinsLab() {
		return winsLab;
	}

	/**
	 * Get Lab Mode Current Killstreak of the Player
	 *
	 * @return Lab Current Killstreak
	 */
	public int getKillstreakLab() {
		return killstreakLab;
	}

	/**
	 * Get Lab Mode Void Kills of the Player
	 *
	 * @return Lab Void Kills
	 */
	public int getVoidKillsLab() {
		return voidKillsLab;
	}

	/**
	 * Get Lab Souls Gathered by the Player
	 *
	 * @return Lab Souls Gathered
	 */
	public int getSoulsGatheredLab() {
		return soulsGatheredLab;
	}

	/**
	 * Get Lab Mode Games Played by the Player
	 *
	 * @return Lab Games Played
	 */
	public int getGamesPlayedLab() {
		return gamesPlayedLab;
	}

	/**
	 * Get Lab Mode Kills of the Player
	 *
	 * @return Lab Kills
	 */
	public int getKillsLab() {
		return killsLab;
	}

	/**
	 * Get Lab Mode Current Winstreak of the Player
	 *
	 * @return Lab Current Winstreak
	 */
	public int getWinstreakLab() {
		return winstreakLab;
	}

	/**
	 * Get Lab Team Mode Melee Kills of the Player
	 *
	 * @return Lab Team Melee Kills
	 */
	public int getMeleeKillsLabTeam() {
		return meleeKillsLabTeam;
	}

	/**
	 * Get Lab Team Mode Kills of the Player
	 *
	 * @return Lab Team Kills
	 */
	public int getKillsLabTeam() {
		return killsLabTeam;
	}

	/**
	 * Get Lab Team Mode Current Winstreak of the Player
	 *
	 * @return Lab Team Current Winstreak
	 */
	public int getWinstreakLabTeam() {
		return winstreakLabTeam;
	}

	/**
	 * Get Lab Team Mode Games Played by the Player
	 *
	 * @return Lab Team Games Played
	 */
	public int getGamesPlayedLabTeam() {
		return gamesPlayedLabTeam;
	}

	/**
	 * Get Lab Team Mode Current Killstreak of the Player
	 *
	 * @return Lab Team Current killstreak
	 */
	public int getKillstreakLabTeam() {
		return killstreakLabTeam;
	}

	/**
	 * Get Lab Mode Melee Kills of the Player
	 *
	 * @return Lab Melee Kills
	 */
	public int getMeleeKillsLab() {
		return meleeKillsLab;
	}

	/**
	 * Get Lab Team Mode Wins of the Player
	 *
	 * @return Lab Team Wins
	 */
	public int getWinsLabTeam() {
		return winsLabTeam;
	}

	/**
	 * Get Lab Mode Souls Gathered by the Player
	 *
	 * @return Lab Souls Gathered
	 */
	public int getSoulsLab() {
		return soulsLab;
	}

	/**
	 * Get Lab Team Mode Void Kills of the Player
	 *
	 * @return Lab team Void Kills
	 */
	public int getVoidKillsLabTeam() {
		return voidKillsLabTeam;
	}

	/**
	 * Get Lab Mode Blocks Broken by the Player
	 *
	 * @return Lab Blocks Broken
	 */
	public int getBlocksBrokenLab() {
		return blocksBrokenLab;
	}

	/**
	 * Get Lab Team Mode Fastest Win of the Player (in Seconds)
	 *
	 * @return Lab Team Fastest Win
	 */
	public int getFastestWinLabTeam() {
		return fastestWinLabTeam;
	}

	/**
	 * Get Lab Mode Fastest Win of the Player (in Seconds)
	 *
	 * @return Lab Fastest Win
	 */
	public int getFastestWinLab() {
		return fastestWinLab;
	}

	/**
	 * Get Lab Solo Mode Egg Thrown by the Player
	 *
	 * @return Lab Solo Egg Thrown
	 */
	public int getEggThrownLab() {
		return eggThrownLab;
	}

	/**
	 * Get Lab Solo Mode Survived Players of the Player
	 *
	 * @return Lab Solo Survived Players
	 */
	public int getSurvivedPlayersLabSolo() {
		return survivedPlayersLabSolo;
	}

	/**
	 * Get Lab Solo Mode Losses of the Player
	 *
	 * @return Lab Solo Losses
	 */
	public int getLossesLabSolo() {
		return lossesLabSolo;
	}

	/**
	 * Get Lab Solo Mode Melee Kills of the Player
	 *
	 * @return Lab Solo Melee Kills
	 */
	public int getMeleeKillsLabSolo() {
		return meleeKillsLabSolo;
	}

	/**
	 * Get Lab Solo Mode Kills of the Player
	 *
	 * @return Lab Solo Kills
	 */
	public int getKillsLabSolo() {
		return killsLabSolo;
	}

	/**
	 * Get Lab Solo Mode Chests Opened by the Player
	 *
	 * @return Lab Solo Chests Opened
	 */
	public int getChestsOpenedLabSolo() {
		return chestsOpenedLabSolo;
	}

	/**
	 * Get Lab Solo Mode Deaths of the Player
	 *
	 * @return Lab Solo Deaths
	 */
	public int getDeathsLabSolo() {
		return deathsLabSolo;
	}

	/**
	 * Get Lab Solo Mode Time Played of the Player (in Minutes)
	 *
	 * @return lab Solo Time Played
	 */
	public int getTimePlayedLabSolo() {
		return timePlayedLabSolo;
	}

	/**
	 * Get Lab Solo Mode Games Played by the Player
	 *
	 * @return Lab Solo Games Played
	 */
	public int getGamesPlayedLabSolo() {
		return gamesPlayedLabSolo;
	}

	/**
	 * Get Lab Solo Mode Current Winstreak of the Player
	 *
	 * @return Lab Solo Current Winstreak
	 */
	public int getWinstreakLabSolo() {
		return winstreakLabSolo;
	}

	/**
	 * Get Lab Solo Mode Current Killstreak of the Player
	 *
	 * @return Lab Solo Current Killstreak
	 */
	public int getKillstreakLabSolo() {
		return killstreakLabSolo;
	}

	/**
	 * Get Lab Solo Mode Wins of the Player
	 *
	 * @return Lab Solo Wins
	 */
	public int getWinsLabSolo() {
		return winsLabSolo;
	}

	/**
	 * Get Lab Solo Mode Void Kills of the Player
	 *
	 * @return Lab Solo Void kills
	 */
	public int getVoidKillsLabSolo() {
		return voidKillsLabSolo;
	}

	/**
	 * Get Lab Mode Blocks Placed of the Player
	 *
	 * @return Lab Blocks Placed
	 */
	public int getBlocksPlacedLab() {
		return blocksPlacedLab;
	}

	/**
	 * Get Lab Solo Mode Assists of the Player
	 *
	 * @return Lab Solo Assists
	 */
	public int getAssistsLabSolo() {
		return assistsLabSolo;
	}

	/**
	 * Get Lab Solo Mode Arrows Shot by the Player
	 *
	 * @return Lab Solo Arrows Shot
	 */
	public int getArrowsShotLabSolo() {
		return arrowsShotLabSolo;
	}

	/**
	 * Get Lab Mode Arrows Shot by the Player
	 *
	 * @return Lab Arrows Shot
	 */
	public int getArrowsShotLab() {
		return arrowsShotLab;
	}

	/**
	 * Get Lab Team Mode Arrows Hit of the Player
	 *
	 * @return Lab Team Arrows Hit
	 */
	public int getArrowsHitLabTeam() {
		return arrowsHitLabTeam;
	}

	/**
	 * get Lab Team Mode Arrows Shot by the Player
	 *
	 * @return Lab Team Arrows Shot
	 */
	public int getArrowsShotLabTeam() {
		return arrowsShotLabTeam;
	}

	/**
	 * Get Lab Mode Arrows Hit of the Player
	 *
	 * @return Lab Arrows Hit
	 */
	public int getArrowsHitLab() {
		return arrowsHitLab;
	}

	/**
	 * Get Lab Team Mode Mob Kills of the Player
	 *
	 * @return Lab Team Mob Kills
	 */
	public int getMobKillsLabTeam() {
		return mobKillsLabTeam;
	}

	/**
	 * Get Lab Mode Mob Kills of the Player
	 *
	 * @return Lab Mob Kills
	 */
	public int getMobKillsLab() {
		return mobKillsLab;
	}

	/**
	 * Get Lab Mode Longest Bow Shot of the Player
	 *
	 * @return lab Longest Bow Shot
	 */
	public int getLongestBowShotLab() {
		return longestBowShotLab;
	}

	/**
	 * Get Lab Team Mode Longest Bow Shot of the Player
	 *
	 * @return Lab Team Longest Bow Shot
	 */
	public int getLongestBowShotLabTeam() {
		return longestBowShotLabTeam;
	}

	/**
	 * Get Lab Solo Mode Arrows Hit of the Player
	 *
	 * @return Lab Solo Arrows Hit
	 */
	public int getArrowsHitLabSolo() {
		return arrowsHitLabSolo;
	}

	/**
	 * Get Lab Solo Mode Longest Bow Shot of the Player
	 *
	 * @return Lab Solo Longest Bow Shot
	 */
	public int getLongestBowShotLabSolo() {
		return longestBowShotLabSolo;
	}

	/**
	 * Get Lab Solo Mode Mob Kills of the Player
	 *
	 * @return Lab Solo Mob Kills
	 */
	public int getMobKillsLabSolo() {
		return mobKillsLabSolo;
	}

	/**
	 * Get Lab Mode Bow Kills of the Player
	 *
	 * @return Lab Bow Kills
	 */
	public int getBowKillsLab() {
		return bowKillsLab;
	}

	/**
	 * Get Lab Solo Mode Bow Kills of the Player
	 *
	 * @return Lab Solo Bow Kills
	 */
	public int getBowKillsLabSolo() {
		return bowKillsLabSolo;
	}

	/**
	 * Get Lab Mode Shard Collected by the Player
	 *
	 * @return Lab Shard Collected
	 */
	public int getShardLab() {
		return shardLab;
	}

	/**
	 * Get Lab Mode Fall Kills of the Player
	 *
	 * @return Lab Fall Kills
	 */
	public int getFallKillsLab() {
		return fallKillsLab;
	}

	/**
	 * Get Lab Solo Mode Fall Kills of the Player
	 *
	 * @return Lab Solo Fall Kills
	 */
	public int getFallKillsLabSolo() {
		return fallKillsLabSolo;
	}

	/**
	 * Get Total Skywars Heads Collected by the Player
	 *
	 * @return Total heads Collected
	 */
	public int getHeads() {
		return heads;
	}

	/**
	 * Get Total Skywars Heads Eww of the Player
	 *
	 * @return Heads Eww
	 */
	public int getHeadsEww() {
		return headsEww;
	}

	/**
	 * Get Solo Mode Skywars Heads Collected by the Player
	 *
	 * @return Solo Heads Collected
	 */
	public int getHeadsSolo() {
		return headsSolo;
	}

	/**
	 * Get Team Mode Skywars Heads Collected by the Player
	 *
	 * @return Team Heads Collected
	 */
	public int getHeadsTeam() {
		return headsTeam;
	}

	/**
	 * Get Total Skywars Heads Tasty of the Player
	 *
	 * @return Heads Tasty
	 */
	public int getHeadsTasty() {
		return headsTasty;
	}

	/**
	 * Get Total Skywars Heads Divine of the Player
	 *
	 * @return Heads Divine
	 */
	public int getHeadsDivine() {
		return headsDivine;
	}

	/**
	 * Get Total Skywars Heads Succulent of the Player
	 *
	 * @return heads Succulent
	 */
	public int getHeadsSucculent() {
		return headsSucculent;
	}

	/**
	 * Get Total Skywars Heads Yucky of the Player
	 *
	 * @return Heads Yucky
	 */
	public int getHeadsYucky() {
		return headsYucky;
	}

	/**
	 * Get Total Skywars Heads Salty of the Player
	 *
	 * @return Heads Salty
	 */
	public int getHeadsSalty() {
		return headsSalty;
	}

	/**
	 * Get Total Skywars Heads Decent of the Player
	 *
	 * @return Heads Decent
	 */
	public int getHeadsDecent() {
		return headsDecent;
	}

	/**
	 * Get Total Skywars Heads Meh of the Player
	 *
	 * @return Heads Meh
	 */
	public int getHeadsMeh() {
		return headsMeh;
	}

	/**
	 * Get Total Skywars Heads Heavenly of the Player
	 *
	 * @return Heads Heavenly
	 */
	public int getHeadsHeavenly() {
		return headsHeavenly;
	}

	/**
	 * Get Total Skywars Heads Sweet of the Player
	 *
	 * @return Heads Sweet
	 */
	public int getHeadsSweet() {
		return headsSweet;
	}

	public PrivateGames getPrivateGames() {
		return privateGames;
	}

	/**
	 * Skywars Private Games Settings of the Player
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
		 * Private Games No Kits (On or Off)
		 */
		@SerializedName("noKits")
		boolean noKits = false;

		/**
		 * Private Games One Hit One Kill (On or Off)
		 */
		@SerializedName("one_hit_one_kill")
		boolean oneHitOneKill = false;

		/**
		 * Private Games Health Buff Level
		 */
		@SerializedName("health_buff")
		String healthBuff = "";

		/**
		 * Private Games Chest Armour Level
		 */
		@SerializedName("chest_armour")
		String chestArmour = "";

		/**
		 * Private Games Chest Bows Level
		 */
		@SerializedName("chest_bows")
		String chestBows = "";

		/**
		 * Private Games Chest Swords Level
		 */
		@SerializedName("chest_swords")
		String chestSwords = "";

		/**
		 * Private Games Legacy Items (On or Off)
		 */
		@SerializedName("enable_legacy_items")
		boolean legacyItems = false;

		/**
		 * Private Games Dragons (On or Off)
		 */
		@SerializedName("dragons")
		String dragons = "";

		/**
		 * Private Games Low Gravity
		 */
		@SerializedName("low_gravity")
		boolean lowGravity = false;

		/**
		 * Private Games Max Kit and Perks (On or Off)
		 */
		@SerializedName("enable_max_kits_and_perks")
		boolean enableMaxKitsPerks = false;

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
		 * Get Private Games One Hit One Kill (On or Off)
		 *
		 * @return One Hit One Kill (On or Off)
		 */
		public boolean isOneHitOneKill() {
			return oneHitOneKill;
		}

		/**
		 * Get Private Games Health Buff Level
		 *
		 * @return Health Buff
		 */
		public String getHealthBuff() {
			return healthBuff;
		}

		/**
		 * Get Private Games No Kits (On or Off)
		 *
		 * @return No Kits (On or Off)
		 */
		public boolean isNoKits() {
			return noKits;
		}

		/**
		 * Get Private Games Chest Armour Level
		 *
		 * @return Chest Armour Level
		 */
		public String getChestArmour() {
			return chestArmour;
		}

		/**
		 * Get Private Games Chest Bows Level
		 *
		 * @return Chest Bows Level
		 */
		public String getChestBows() {
			return chestBows;
		}

		/**
		 * Get Private Games Chest Swords Level
		 *
		 * @return Chest Swords Level
		 */
		public String getChestSwords() {
			return chestSwords;
		}

		/**
		 * Get Private Games Legacy items (On or Off)
		 *
		 * @return Legacy Items (On or Off)
		 */
		public boolean isLegacyItems() {
			return legacyItems;
		}

		/**
		 * Get Private Games Dragons Level
		 *
		 * @return Dragons Level
		 */
		public String getDragons() {
			return dragons;
		}

		/**
		 * Get Private Games Max Kit and Perks (On or Off)
		 *
		 * @return Max Kit and Perks (On or Off)
		 */
		public boolean isEnableMaxKitsPerks() {
			return enableMaxKitsPerks;
		}

		@Override
		public String toString() {
			return "Skywars PrivateGames{" +
					"speed='" + speed + '\'' +
					", noKits=" + noKits +
					", oneHitOneKill=" + oneHitOneKill +
					", healthBuff='" + healthBuff + '\'' +
					", chestArmour='" + chestArmour + '\'' +
					", chestBows='" + chestBows + '\'' +
					", chestSwords='" + chestSwords + '\'' +
					", legacyItems=" + legacyItems +
					", dragons='" + dragons + '\'' +
					", lowGravity=" + lowGravity +
					", enableMaxKitsPerks=" + enableMaxKitsPerks +
					'}';
		}
	}

	@Override
	public String toString() {
		return "Skywars{" +
				"winstreak=" + winstreak +
				", killStreak=" + killStreak +
				", highestKillstreak=" + highestKillstreak +
				", highestWinstreak=" + highestWinstreak +
				", survivedPlayers=" + survivedPlayers +
				", losses=" + losses +
				", deaths=" + deaths +
				", quits=" + quits +
				", coins=" + coins +
				", blocksBroken=" + blocksBroken +
				", unlockedPackages=" + unlockedPackages +
				", gamesPlayed=" + gamesPlayed +
				", blocksPlaced=" + blocksPlaced +
				", kills=" + kills +
				", eggThrown=" + eggThrown +
				", soulsGathered=" + soulsGathered +
				", souls=" + souls +
				", arrowsHit=" + arrowsHit +
				", arrowsShot=" + arrowsShot +
				", enderpearlsThrown=" + enderpearlsThrown +
				", assists=" + assists +
				", wins=" + wins +
				", itemsEnchanted=" + itemsEnchanted +
				", soulWell=" + soulWell +
				", soulWellRares=" + soulWellRares +
				", soulWellLegendaries=" + soulWellLegendaries +
				", paidSouls=" + paidSouls +
				", activeCage='" + activeCage + '\'' +
				", chestsOpened=" + chestsOpened +
				", timePlayed=" + timePlayed +
				", voidKills=" + voidKills +
				", mostKills=" + mostKills +
				", longestBowShot=" + longestBowShot +
				", fastestWin=" + fastestWin +
				", meleeKills=" + meleeKills +
				", mobKills=" + mobKills +
				", lastMode='" + lastMode + '\'' +
				", activeProjectileTrail='" + activeProjectileTrail + '\'' +
				", activeVictoryDance='" + activeVictoryDance + '\'' +
				", activeKillEffect='" + activeKillEffect + '\'' +
				", longestBowKill=" + longestBowKill +
				", tokens=" + tokens +
				", activeDeathCry='" + activeDeathCry + '\'' +
				", bowKills=" + bowKills +
				", activeSprays='" + activeSprays + '\'' +
				", activeBalloon='" + activeBalloon + '\'' +
				", experience=" + experience +
				", prestigeIcon='" + prestigeIcon + '\'' +
				", angelDeathLevel=" + angelDeathLevel +
				", opals=" + opals +
				", shard=" + shard +
				", heads=" + heads +
				", headsEww=" + headsEww +
				", headsSolo=" + headsSolo +
				", headsTasty=" + headsTasty +
				", headsDivine=" + headsDivine +
				", headsSucculent=" + headsSucculent +
				", headsYucky=" + headsYucky +
				", headsSalty=" + headsSalty +
				", headsDecent=" + headsDecent +
				", headsMeh=" + headsMeh +
				", headsHeavenly=" + headsHeavenly +
				", headsSweet=" + headsSweet +
				'}';
	}
}