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

package fr.kokhaviel.api.hypixel.player.friends;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Hypixel Player Friends
 *
 * @author Kokhaviel
 * @since 1.2
 */
public class Friends {

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
	 * All Friends of the Player
	 */
	@SerializedName("records")
	List<Friend> friendList = new ArrayList<>();


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
	 * Get All Friends of the Player
	 *
	 * @return List of Friend
	 */
	public List<Friend> getFriendList() {
		return friendList;
	}

	@Override
	public String toString() {
		return "Friends{" +
				"success=" + success +
				", uuid='" + uuid + '\'' +
				", friendList=" + friendList +
				'}';
	}
}
