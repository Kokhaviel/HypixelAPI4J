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

/**
 * Recent Games Information
 *
 * @author Kokhaviel
 * @since 1.3
 */
public class Game {

	/**
	 * Timestamp of Start of the Game
	 */
	@SerializedName("date")
	long started = 0;

	/**
	 * Type of the Game
	 */
	@SerializedName("gameType")
	String type = "";

	/**
	 * Mode of the Game
	 */
	@SerializedName("mode")
	String mode = "";

	/**
	 * Map of the Game
	 */
	@SerializedName("map")
	String map = "";

	/**
	 * Timestamp of the End of the Game
	 */
	@SerializedName("ended")
	long ended = 0;


	/**
	 * Get Timestamp of the Start of the Game
	 *
	 * @return Timestamp
	 */
	public long getStarted() {
		return started;
	}

	/**
	 * Get Type of the Game
	 *
	 * @return Game Name
	 */
	public String getType() {
		return type;
	}

	/**
	 * Get Mode of the Game
	 *
	 * @return Mode Name
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * Gat Map of the Game
	 *
	 * @return Map Name
	 */
	public String getMap() {
		return map;
	}

	/**
	 * Get Timestamp of the End of the Game
	 *
	 * @return Timestamp
	 */
	public long getEnded() {
		return ended;
	}

	@Override
	public String toString() {
		return "Game{" +
				"started=" + started +
				", type='" + type + '\'' +
				", mode='" + mode + '\'' +
				", map='" + map + '\'' +
				", ended=" + ended +
				'}';
	}
}
