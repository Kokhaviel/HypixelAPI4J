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

package fr.kokhaviel.api.hypixel.status;

import com.google.gson.annotations.SerializedName;

/**
 * Hypixel Player Online Session
 *
 * @author Kokhaviel
 * @since 1.4
 */
public class Session {

	/**
	 * Online Status of the Player
	 */
	@SerializedName("online")
	boolean online = false;

	/**
	 * Current Type of Game
	 */
	@SerializedName("gameType")
	String type = "";

	/**
	 * Current Mode of the Game
	 */
	@SerializedName("mode")
	String mode = "";

	/**
	 * Current Map of the Game
	 */
	@SerializedName("map")
	String map = "";


	/**
	 * Online Status of the Player
	 * If online = false, others variables won't be fill.
	 *
	 * @return Online Status
	 */
	public boolean isOnline() {
		return online;
	}

	/**
	 * Get Current Type of the Game Session
	 */
	public String getType() {
		return type;
	}

	/**
	 * Get Current Mode of the Game Session
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * Get Current Map of the Game Session
	 */
	public String getMap() {
		return map;
	}

	@Override
	public String toString() {
		return "Session{" +
				"online=" + online +
				", type='" + type + '\'' +
				", mode='" + mode + '\'' +
				", map='" + map + '\'' +
				'}';
	}
}
