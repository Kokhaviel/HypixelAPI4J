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

package fr.kokhaviel.api.hypixel.recent;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Hypixel Player Recent Games
 *
 * @author Kokahviel
 * @since 1.3
 */
public class RecentGames {


	/**
	 * Success Status
	 */
	@SerializedName("success")
	boolean success = false;

	/**
	 * UUID of the Player
	 */
	@SerializedName("uuid")
	String uuid = "";

	/**
	 * All Recent Games of the Player
	 */
	@SerializedName("games")
	List<Game> gamesList = new ArrayList<>();


	/**
	 * Get Success Status
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get UUID of the Player
	 *
	 * @return UUID
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * Get All Recent Games of the Player
	 *
	 * @return List of Games
	 */
	public List<Game> getGamesList() {
		return gamesList;
	}

	@Override
	public String toString() {
		return "RecentGames{" +
				"success=" + success +
				", uuid='" + uuid + '\'' +
				", gamesList=" + gamesList +
				'}';
	}
}
