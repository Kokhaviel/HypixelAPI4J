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

package fr.kokhaviel.api.hypixel.key;

import com.google.gson.annotations.SerializedName;

/**
 * Hypixel Api Key Information
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class KeyData {

	/**
	 * Success Status
	 */
	@SerializedName("success")
	boolean success = false;

	/**
	 * Api Key Data
	 */
	@SerializedName("record")
	Key key = new Key();

	/**
	 * Success Status
	 *
	 * @return true = success / false = failed
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Api Key Data
	 *
	 * @return Key Data
	 */
	public Key getKeyData() {
		return key;
	}

	/**
	 * Hypixel API Key Data
	 * @author Kokhaviel
	 * @since 1.0
	 */
	public static class Key {

		/**
		 * Current Api Key
		 */
		@SerializedName("key")
		String key = "";

		/**
		 * Owner Minecraft UUID
		 */
		@SerializedName("owner")
		String owner = "";

		/**
		 * Api Key Limit per Minutes (Base Limit = 120)
		 */
		@SerializedName("limit")
		int limit = 120;

		/**
		 * Total Queries in the Last Minute
		 */
		@SerializedName("queriesInPastMin")
		int queriesLastMinute = 0;

		/**
		 * Total Queries for this Key
		 */
		@SerializedName("totalQueries")
		int queries = 0;


		/**
		 * Get Current Api Key
		 *
		 * @return Key UUID
		 */
		public String getKey() {
			return key;
		}

		/**
		 * Get Owner Minecraft UUID
		 *
		 * @return Owner UUID
		 */
		public String getOwner() {
			return owner;
		}

		/**
		 * Get Api Key Limit Queries per Minutes
		 *
		 * @return Limit Queries
		 */
		public int getLimit() {
			return limit;
		}

		/**
		 * Get Total Queries in the Last Minute
		 *
		 * @return Last Minute Queries
		 */
		public int getQueriesLastMinute() {
			return queriesLastMinute;
		}

		/**
		 * Get Total Queries for this Api Key
		 *
		 * @return Total Queries
		 */
		public int getQueries() {
			return queries;
		}

		@Override
		public String toString() {
			return "Key{" +
					"key='" + key + '\'' +
					", owner='" + owner + '\'' +
					", limit=" + limit +
					", queriesLastMinute=" + queriesLastMinute +
					", queries=" + queries +
					'}';
		}
	}

	@Override
	public String toString() {
		return "KeyData{" +
				"success=" + success +
				", key=" + key +
				'}';
	}
}
