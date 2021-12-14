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

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import fr.kokhaviel.api.hypixel.GameType;
import fr.kokhaviel.api.hypixel.util.exceptions.HypixelAPIException;

/**
 * Hypixel Boosters Data
 * @author Kokhaviel
 * @since 5.0
 */
public class Boosters {

	final Gson GSON = new Gson();
	final boolean success;
	final JsonArray boostersArray;

	public Boosters(JsonObject boostersObject) {
		this.success = boostersObject.get("success").getAsBoolean();
		this.boostersArray = boostersObject.getAsJsonArray("boosters");
	}

	/**
	 * Get Success Status of the Request
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Booster From Index
	 * @param boosterIndex Booster Index
	 * @return Requested Booster Data
	 */
	public Booster getBooster(int boosterIndex) {
		if(boosterIndex < 0) throw new HypixelAPIException("Index Cannot be under 0");
		if(boosterIndex > boostersArray.size()) throw new HypixelAPIException("Maximum Index is " + boostersArray.size());

		return GSON.fromJson(boostersArray.get(boosterIndex).getAsJsonObject(), Booster.class);
	}

	public static class Booster {


		@SerializedName("_id")
		String id = "";

		@SerializedName("purchaserUuid")
		String purchaserUUID = "";

		@SerializedName("amount")
		int amount = 0;

		@SerializedName("originalLength")
		int boostLength = 0;

		@SerializedName("gameType")
		int gameType = 0;

		@SerializedName("dateActivated")
		long activationDate = 0;


		/**
		 * Get Booster ID
		 */
		public String getId() {
			return id;
		}

		/**
		 * Get UUID of the Player who Purchased Booster
		 */
		public String getPurchaserUUID() {
			return purchaserUUID;
		}

		/**
		 * Get Booster Amount
		 */
		public int getAmount() {
			return amount;
		}

		/**
		 * Get Booster Length (in Minutes)
		 */
		public int getBoostLength() {
			return boostLength;
		}

		/**
		 * Get Booster Game Type
		 */
		public String getGameType() {
			return GameType.cleanFromID(gameType);
		}

		/**
		 * Get Booster Activation Timestamp
		 */
		public long getActivationDate() {
			return activationDate;
		}

		@Override
		public String toString() {
			return "Booster{" +
					"id='" + id + '\'' +
					", purchaserUUID='" + purchaserUUID + '\'' +
					", amount=" + amount +
					", boostLength=" + boostLength +
					", gameType=" + gameType +
					", activationDate=" + activationDate +
					'}';
		}
	}

	@Override
	public String toString() {
		return "Boosters{" +
				"success=" + success +
				", boostersArray=" + boostersArray +
				'}';
	}
}
