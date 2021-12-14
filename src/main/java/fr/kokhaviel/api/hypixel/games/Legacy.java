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

/**
 * Legacy Hypixel Player Statistics
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Legacy {

	/**
	 * Current Preferred Channel of the Player
	 */
	@SerializedName("preferredChannel")
	String channel = "";

	/**
	 * Tokens of the Player
	 */
	@SerializedName("tokens")
	int tokens = 0;

	/**
	 * Total Tokens of the Player
	 */
	@SerializedName("total_tokens")
	int totalTokens = 0;

	/**
	 * Total Gingerbread Tokens of the Player
	 */
	@SerializedName("gingerbread_tokens")
	int gingerBreadTokens = 0;

	/**
	 * Total Walls Tokens of the Player
	 */
	@SerializedName("walls_tokens")
	int wallsTokens = 0;

	/**
	 * Total Arena Tokens of the Player
	 */
	@SerializedName("arena_tokens")
	int arenaTokens = 0;

	/**
	 * Total QuakeCraft Tokens of the Player
	 */
	@SerializedName("quakecraft_tokens")
	int quakeCraftTokens = 0;

	/**
	 * Total Paintball Tokens of the Player
	 */
	@SerializedName("paintball_tokens")
	int paintballTokens = 0;

	/**
	 * Total VampireZ Tokens of the Player
	 */
	@SerializedName("vampirez_tokens")
	int vampireZTokens = 0;


	/**
	 * Get Current Preferred Channel of the Player
	 *
	 * @return Channel name
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * Get Tokens of the Player
	 *
	 * @return Current Tokens
	 */
	public int getTokens() {
		return tokens;
	}

	/**
	 * Get Total Tokens of the Player
	 *
	 * @return Total Tokens
	 */
	public int getTotalTokens() {
		return totalTokens;
	}


	/**
	 * Get Total Ginger Bread Tokens of the Player
	 *
	 * @return Ginger Bread Tokens
	 */
	public int getGingerBreadTokens() {
		return gingerBreadTokens;
	}

	/**
	 * Get Total Walls Tokens of the Player
	 *
	 * @return Walls Tokens
	 */
	public int getWallsTokens() {
		return wallsTokens;
	}

	/**
	 * Get Total Arena Tokens of the Player
	 *
	 * @return Arena Tokens
	 */
	public int getArenaTokens() {
		return arenaTokens;
	}

	/**
	 * Get QuakeCraft Tokens of the Player
	 *
	 * @return QuakeCraft Tokens
	 */
	public int getQuakeCraftTokens() {
		return quakeCraftTokens;
	}

	/**
	 * Get Total Paintball Tokens of the Player
	 *
	 * @return Paintball Tokens
	 */
	public int getPaintballTokens() {
		return paintballTokens;
	}

	/**
	 * Get Total VampireZ Tokens of the Player
	 *
	 * @return VampireZ Tokens
	 */
	public int getVampireZTokens() {
		return vampireZTokens;
	}

	@Override
	public String toString() {
		return "Legacy{" +
				"channel='" + channel + '\'' +
				", tokens=" + tokens +
				", totalTokens=" + totalTokens +
				", gingerBreadTokens=" + gingerBreadTokens +
				", wallsTokens=" + wallsTokens +
				", arenaTokens=" + arenaTokens +
				", quakeCraftTokens=" + quakeCraftTokens +
				", paintballTokens=" + paintballTokens +
				", vampireZTokens=" + vampireZTokens +
				'}';
	}
}

