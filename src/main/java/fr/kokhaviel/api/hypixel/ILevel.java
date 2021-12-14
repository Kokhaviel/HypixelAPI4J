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

import java.net.MalformedURLException;
import java.text.DecimalFormat;

public interface ILevel {

	/**
	 * Get Exact Network Level of the Player
	 * (Format : lvl.progress, ie 117.56 means the Player Level is 117 and the Progression to the Level 118 is 56%)
	 *
	 * @return Network Level Formatted
	 * @since 1.1
	 */
	static double getExactNetworkLevel(HypixelAPI hypixelAPI, String player) throws MalformedURLException {
		int exp = hypixelAPI.getPlayerData(player).getPlayer().getNetworkExperience();
		double level = (Math.sqrt(exp + 15312.5) - (125 / Math.sqrt(2))) / (25 * Math.sqrt(2));
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
		return Double.parseDouble(df.format(level).replace(",", "."));
	}

	/**
	 * Get Needed Experience to Reach the Next Network Level
	 *
	 * @return Number of Exp
	 * @since 1.1
	 */
	static int getExpToNextLevel(HypixelAPI hypixelAPI, String player) throws MalformedURLException {
		int exp = hypixelAPI.getPlayerData(player).getPlayer().getNetworkExperience();
		double nextLevel = Math.floor(ILevel.getNetworkLevel(hypixelAPI, player)) + 1;
		int neededExp = (int) (Math.pow((25 * Math.sqrt(2) * nextLevel + (125 / Math.sqrt(2))), 2) - 15312.5);

		return (neededExp - exp);
	}

	/**
	 * Get Network Level without Progression Percentage
	 *
	 * @return Network Level
	 * @since 5.0
	 */
	static int getNetworkLevel(HypixelAPI hypixelAPI, String player) throws MalformedURLException {
		return (int) Math.floor(getExactNetworkLevel(hypixelAPI, player));
	}

	/**
	 * Get Progression Percentage to the Next Level
	 *
	 * @return Progression Percentage
	 * @since 5.0
	 */
	static int getPercentageToNextLevel(HypixelAPI hypixelAPI, String player) throws MalformedURLException {
		double exactLevel = ILevel.getExactNetworkLevel(hypixelAPI, player);
		int level = ILevel.getNetworkLevel(hypixelAPI, player);

		double percentage = exactLevel - level;

		return (int) (percentage * 100);
	}
}