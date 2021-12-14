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
 * Hypixel Player Status
 *
 * @author Kokhaviel
 * @since 1.4
 */
public class Status {

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
	 * Current Session of the Player
	 */
	@SerializedName("session")
	Session session = new Session();


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
	 * Get Current Session of the Player
	 *
	 * @return Session Information
	 */
	public Session getSession() {
		return session;
	}

	@Override
	public String toString() {
		return "Status{" +
				"success=" + success +
				", uuid='" + uuid + '\'' +
				", session=" + session +
				'}';
	}
}
