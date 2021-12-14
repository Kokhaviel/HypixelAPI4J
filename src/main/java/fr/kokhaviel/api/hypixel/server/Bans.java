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

package fr.kokhaviel.api.hypixel.server;

import com.google.gson.annotations.SerializedName;

//Watchdog = Hypixel Anti Cheat

public class Bans {


	@SerializedName("success")
	boolean success = false;

	@SerializedName("watchdog_lastMinute")
	int watchdogLastMinute = 0;

	@SerializedName("staff_rollingDaily")
	int staffDaily = 0;

	@SerializedName("staff_total")
	int staffTotal = 0;

	@SerializedName("watchdog_rollingDaily")
	int watchdogDaily = 0;

	@SerializedName("watchdog_total")
	int watchdogTotal = 0;


	/**
	 * Get Success Status of the Request
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Last Minute Watchdog Bans
	 */
	public int getWatchdogLastMinute() {
		return watchdogLastMinute;
	}

	/**
	 * Get Last Day Staff Bans
	 */
	public int getStaffDaily() {
		return staffDaily;
	}

	/**
	 * Get Total Staff Bans
	 */
	public int getStaffTotal() {
		return staffTotal;
	}

	/**
	 * Get Last Day Watchdog Bans
	 */
	public int getWatchdogDaily() {
		return watchdogDaily;
	}

	/**
	 * Get Total Watchdog Bans
	 */
	public int getWatchdogTotal() {
		return watchdogTotal;
	}

	@Override
	public String toString() {
		return "Bans{" +
				"success=" + success +
				", watchdogLastMinute=" + watchdogLastMinute +
				", staffDaily=" + staffDaily +
				", staffTotal=" + staffTotal +
				", watchdogDaily=" + watchdogDaily +
				", watchdogTotal=" + watchdogTotal +
				'}';
	}
}
