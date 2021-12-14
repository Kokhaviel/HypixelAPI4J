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
 * Tnt Games Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class TntGames {

	/**
	 * Tnt Games Coins
	 */
	@SerializedName("coins")
	int coins = 0;

	/**
	 * Bow Spleef Deaths
	 */
	@SerializedName("deaths_bowspleef")
	int bowSpleefDeaths = 0;

	/**
	 * Capture Deaths
	 */
	@SerializedName("deaths_capture")
	int captureDeaths = 0;

	/**
	 * Tnt Run Double Jump
	 */
	@SerializedName("doublejump_tntrun")
	int doubleJumpTntRun = 0;

	/**
	 * Capture Kills
	 */
	@SerializedName("kills_capture")
	int captureKills = 0;

	/**
	 * Packages (Cosmetics) Unlocked
	 */
	@SerializedName("packages")
	List<String> packagesUnlocked = new ArrayList<>();

	/**
	 * Bow Spleef Double Jump
	 */
	@SerializedName("spleef_doublejump")
	int spleefDoubleJump = 0;

	/**
	 * Bow Spleef Repulse Level
	 */
	@SerializedName("spleef_repulse")
	int spleefRepulse = 0;

	/**
	 * Bow Spleef Triple Shot
	 */
	@SerializedName("spleef_triple")
	int spleefTripleShot = 0;

	/**
	 * Bow Spleef Tags
	 */
	@SerializedName("tags_bowspleef")
	int spleefTags = 0;

	/**
	 * Bow Spleef Wins
	 */
	@SerializedName("wins_bowspleef")
	int spleefWins = 0;

	/**
	 * Capture Wins
	 */
	@SerializedName("wins_capture")
	int captureWins = 0;

	/**
	 * Tnt Tag Wins
	 */
	@SerializedName("wins_tntag")
	int tntTagWins = 0;

	/**
	 * Tnt Run Wins
	 */
	@SerializedName("wins_tntrun")
	int tntRunWins = 0;

	/**
	 * Capture Current Class in Use
	 */
	@SerializedName("capture_class")
	String captureClass = "";

	/**
	 * Tnt Tag Kills
	 */
	@SerializedName("kills_tntag")
	int tntTagKills = 0;

	/**
	 * Capture Assists
	 */
	@SerializedName("assists_capture")
	int captureAssists = 0;

	/**
	 * Tnt Run Record
	 */
	@SerializedName("record_tntrun")
	int tntRunRecord = 0;

	/**
	 * Tnt Tag Speed
	 */
	@SerializedName("tag_speed")
	int tntTagSpeed = 0;

	/**
	 * Pvp Run Record
	 */
	@SerializedName("record_pvprun")
	int pvpRunRecord = 0;

	/**
	 * Pvp Run Wins
	 */
	@SerializedName("wins_pvprun")
	int pvpRunWins = 0;

	/**
	 * Pvp Run Kills
	 */
	@SerializedName("kills_pvprun")
	int pvpRunKills = 0;

	/**
	 * Current Particle Effect in Use
	 */
	@SerializedName("active_particle_effect")
	String particleEffect = "";

	/**
	 * Current Death Effect in Use
	 */
	@SerializedName("active_death_effect")
	String deathEffect = "";

	/**
	 * Current Tnt Games Winstreak
	 */
	@SerializedName("winstreak")
	int winstreak = 0;

	/**
	 * Blast Protection Tags
	 */
	@SerializedName("tag_blastprotection")
	int blastprotectionTags = 0;

	/**
	 * Slow It Down Tags
	 */
	@SerializedName("tag_slowitdown")
	int slowItDownTags = 0;

	/**
	 * Speed It Up Tags
	 */
	@SerializedName("tag_speeditup")
	int speedItUpTags = 0;

	/**
	 * Tnt Run Speed Potions
	 */
	@SerializedName("new_tntrun_speed_potions")
	int tntRunSpeedPotions = 0;

	/**
	 * Tnt Run Slowness Potions
	 */
	@SerializedName("new_tntrun_slowness_potions")
	int tntRunSlownessPotions = 0;

	/**
	 * Tnt Run Potions Splashed On Players
	 */
	@SerializedName("run_potions_splashed_on_players")
	int potionsSplashed = 0;

	/**
	 * Pvp Run Notoriety
	 */
	@SerializedName("new_pvprun_notoriety")
	int pvpRunNotoriety = 0;

	/**
	 * Pvp Run Fortitude
	 */
	@SerializedName("new_pvprun_fortitude")
	int pvpRunFortitude = 0;

	/**
	 * Pvp Run Regeneration
	 */
	@SerializedName("new_pvprun_regeneration")
	int pvpRunRegeneration = 0;

	/**
	 * Pvp Run Deaths
	 */
	@SerializedName("deaths_pvprun")
	int pvpRunDeaths = 0;

	/**
	 * Tnt Run Deaths
	 */
	@SerializedName("deaths_tntrun")
	int tntRunDeaths = 0;

	/**
	 * Current Wizards Class in Use
	 */
	@SerializedName("wizards_selected_class")
	String WizardsClass = "";

	/**
	 * Total Tnt Games Wins
	 */
	@SerializedName("wins")
	int wins = 0;

	/**
	 * Capture Points
	 */
	@SerializedName("points_capture")
	int capturePoints = 0;

	/**
	 * Bow Spleef Arrows Rain Level
	 */
	@SerializedName("new_spleef_arrowrain")
	int spleefArrowsRain = 0;

	/**
	 * Bow Spleef Explosive Dash level
	 */
	@SerializedName("new_spleef_exlosive_dash")
	int spleefExplosiveDash = 0;

	/**
	 * Capture Time Elapsed in Air
	 */
	@SerializedName("air_time_capture")
	int captureAirTime = 0;


	/**
	 * Get Tnt Games Coins of the Player
	 *
	 * @return Tnt Games Coins
	 */
	public int getCoins() {
		return coins;
	}

	/**
	 * Get Bow Spleef Deaths of the Player
	 *
	 * @return Number Bow Spleef Deaths
	 */
	public int getBowSpleefDeaths() {
		return bowSpleefDeaths;
	}

	/**
	 * Get Capture Deaths of the Player
	 *
	 * @return Number of Capture Deaths
	 */
	public int getCaptureDeaths() {
		return captureDeaths;
	}

	/**
	 * Get Current Tnt Run Double Jumps of the Player
	 *
	 * @return Tnt Run Double Jumps
	 */
	public int getDoubleJumpTntRun() {
		return doubleJumpTntRun;
	}

	/**
	 * Get Capture Kills of the Player
	 *
	 * @return Capture Kills
	 */
	public int getCaptureKills() {
		return captureKills;
	}

	/**
	 * Get All Unlocked Tnt Games Packages of the Player
	 *
	 * @return List of All Tnt Games Unlocked Packages
	 */
	public List<String> getPackagesUnlocked() {
		return packagesUnlocked;
	}

	/**
	 * Get Current Bow Spleef Double Jumps of the Player
	 *
	 * @return Bow Spleef Double Jumps
	 */
	public int getSpleefDoubleJump() {
		return spleefDoubleJump;
	}

	/**
	 * Get Bow Spleef Repulse Level of the Player
	 *
	 * @return Bow Spleef Repulse Level
	 */
	public int getSpleefRepulse() {
		return spleefRepulse;
	}

	/**
	 * Get Bow Spleef Triple Shot Level of the Player
	 *
	 * @return Bow Spleef Triple Shot Level
	 */
	public int getSpleefTripleShot() {
		return spleefTripleShot;
	}

	/**
	 * Get Bow Spleef Tags of the Player
	 *
	 * @return Bow Spleef Tags
	 */
	public int getSpleefTags() {
		return spleefTags;
	}

	/**
	 * Get Bow Spleef Wins of the Player
	 *
	 * @return Bow Spleef Wins
	 */
	public int getSpleefWins() {
		return spleefWins;
	}

	/**
	 * Get Capture Wins of the Player
	 *
	 * @return Capture Wins
	 */
	public int getCaptureWins() {
		return captureWins;
	}

	/**
	 * Get Tnt Tag Wins of the Player
	 *
	 * @return Tnt Tag Wins
	 */
	public int getTntTagWins() {
		return tntTagWins;
	}

	/**
	 * Get Tnt Run Wins of the Player
	 *
	 * @return Tnt Run Wins
	 */
	public int getTntRunWins() {
		return tntRunWins;
	}

	/**
	 * Get Current Capture Class of the Player
	 *
	 * @return Current Capture Class
	 */
	public String getCaptureClass() {
		return captureClass;
	}

	/**
	 * Get Tnt Tag Kills of the Player
	 *
	 * @return Tnt Tag kills
	 */
	public int getTntTagKills() {
		return tntTagKills;
	}

	/**
	 * Get Capture Assists of the Player
	 *
	 * @return Capture Assists
	 */
	public int getCaptureAssists() {
		return captureAssists;
	}

	/**
	 * Get Tnt Run Record of the Player
	 *
	 * @return Tnt Run Record
	 */
	public int getTntRunRecord() {
		return tntRunRecord;
	}

	/**
	 * Get Tnt Tag Speed Level of the Player
	 *
	 * @return Tnt Tag Speed Level
	 */
	public int getTntTagSpeed() {
		return tntTagSpeed;
	}

	/**
	 * Get Pvp Run Record of the Player
	 *
	 * @return Pvp Run Record
	 */
	public int getPvpRunRecord() {
		return pvpRunRecord;
	}

	/**
	 * Get Pvp Run Wins of the Player
	 *
	 * @return Pvp Run Wins
	 */
	public int getPvpRunWins() {
		return pvpRunWins;
	}

	/**
	 * Get Pvp Run Kills of the Player
	 *
	 * @return Pvp Run Kills
	 */
	public int getPvpRunKills() {
		return pvpRunKills;
	}

	/**
	 * Get Current Particle Effect of the Player
	 *
	 * @return Current Particle Effect
	 */
	public String getParticleEffect() {
		return particleEffect;
	}

	/**
	 * Get Current Death Effect of the Player
	 *
	 * @return Current Death Effect
	 */
	public String getDeathEffect() {
		return deathEffect;
	}

	/**
	 * Get Current Tnt Games Winstreak of the Player
	 *
	 * @return Winstreak
	 */
	public int getWinstreak() {
		return winstreak;
	}

	/**
	 * Get Blast Protection Tags of the Player
	 *
	 * @return Blast Protection Tags
	 */
	public int getBlastprotectionTags() {
		return blastprotectionTags;
	}

	/**
	 * Get Slow It Down Tags of the Player
	 *
	 * @return Slow It Down Tags
	 */
	public int getSlowItDownTags() {
		return slowItDownTags;
	}

	/**
	 * Get Speed It Up Tags of the Player
	 *
	 * @return Speed It Up Tags
	 */
	public int getSpeedItUpTags() {
		return speedItUpTags;
	}

	/**
	 * Get Tnt Run Speed Potions of the Player (At Start of the Game)
	 *
	 * @return Tnt Run Speed Potions
	 */
	public int getTntRunSpeedPotions() {
		return tntRunSpeedPotions;
	}

	/**
	 * Get Tnt Run Slowness Potions of the Player (At Start of the Game)
	 *
	 * @return Tnt Run Slowness Potions
	 */
	public int getTntRunSlownessPotions() {
		return tntRunSlownessPotions;
	}

	/**
	 * Get Potions Splashed on others Players
	 *
	 * @return Potions Splashed
	 */
	public int getPotionsSplashed() {
		return potionsSplashed;
	}

	/**
	 * Get Pvp Run Notoriety Level of the Player
	 *
	 * @return Pvp Run Notoriety Level
	 */
	public int getPvpRunNotoriety() {
		return pvpRunNotoriety;
	}

	/**
	 * Get Pvp Run Fortitude Level of the Player
	 *
	 * @return Pvp Run Fortitude Level
	 */
	public int getPvpRunFortitude() {
		return pvpRunFortitude;
	}

	/**
	 * Get Pvp Run Regeneration Level of the Player
	 *
	 * @return Pvp Run Regeneration Level
	 */
	public int getPvpRunRegeneration() {
		return pvpRunRegeneration;
	}

	/**
	 * Get Pvp Run Deaths of the Player
	 *
	 * @return Pvp Run Deaths
	 */
	public int getPvpRunDeaths() {
		return pvpRunDeaths;
	}

	/**
	 * Get Tnt Run Deaths of the Player
	 *
	 * @return Tnt Run Deaths
	 */
	public int getTntRunDeaths() {
		return tntRunDeaths;
	}

	/**
	 * Get Current Wizards Class of the Player
	 *
	 * @return Current Wizards Class
	 */
	public String getWizardsClass() {
		return WizardsClass;
	}

	/**
	 * Get Total Tnt Games Wins of the Player
	 *
	 * @return Tnt Games Wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * Get Capture points of the player
	 *
	 * @return Capture Points
	 */
	public int getCapturePoints() {
		return capturePoints;
	}

	/**
	 * Get Bow Spleef Arrows Rain Level of the Player
	 *
	 * @return Bow Spleef Arrows Rain Level
	 */
	public int getSpleefArrowsRain() {
		return spleefArrowsRain;
	}

	/**
	 * Get Bow Spleef Explosive Dash of the Player
	 *
	 * @return Bow Spleef Explosive Dash
	 */
	public int getSpleefExplosiveDash() {
		return spleefExplosiveDash;
	}

	/**
	 * Get Capture Elapsed Time in Air of the Player
	 *
	 * @return Capture Air Time
	 */
	public int getCaptureAirTime() {
		return captureAirTime;
	}

	@Override
	public String toString() {
		return "TntGames{" +
				"coins=" + coins +
				", bowSpleefDeaths=" + bowSpleefDeaths +
				", captureDeaths=" + captureDeaths +
				", doubleJumpTntRun=" + doubleJumpTntRun +
				", captureKills=" + captureKills +
				", packagesUnlocked=" + packagesUnlocked +
				", spleefDoubleJump=" + spleefDoubleJump +
				", spleefRepulse=" + spleefRepulse +
				", spleefTripleShot=" + spleefTripleShot +
				", spleefTags=" + spleefTags +
				", spleefWins=" + spleefWins +
				", captureWins=" + captureWins +
				", tntTagWins=" + tntTagWins +
				", tntRunWins=" + tntRunWins +
				", captureClass='" + captureClass + '\'' +
				", tntTagKills=" + tntTagKills +
				", captureAssists=" + captureAssists +
				", tntRunRecord=" + tntRunRecord +
				", tntTagSpeed=" + tntTagSpeed +
				", pvpRunRecord=" + pvpRunRecord +
				", pvpRunWins=" + pvpRunWins +
				", pvpRunKills=" + pvpRunKills +
				", particleEffect='" + particleEffect + '\'' +
				", deathEffect='" + deathEffect + '\'' +
				", winstreak=" + winstreak +
				", blastprotectionTags=" + blastprotectionTags +
				", slowItDownTags=" + slowItDownTags +
				", speedItUpTags=" + speedItUpTags +
				", tntRunSpeedPotions=" + tntRunSpeedPotions +
				", tntRunSlownessPotions=" + tntRunSlownessPotions +
				", potionsSplashed=" + potionsSplashed +
				", pvpRunNotoriety=" + pvpRunNotoriety +
				", pvpRunFortitude=" + pvpRunFortitude +
				", pvpRunRegeneration=" + pvpRunRegeneration +
				", pvpRunDeaths=" + pvpRunDeaths +
				", tntRunDeaths=" + tntRunDeaths +
				", WizardsClass='" + WizardsClass + '\'' +
				", wins=" + wins +
				", capturePoints=" + capturePoints +
				", spleefArrowsRain=" + spleefArrowsRain +
				", spleefExplosiveDash=" + spleefExplosiveDash +
				", captureAirTime=" + captureAirTime +
				'}';
	}
}
