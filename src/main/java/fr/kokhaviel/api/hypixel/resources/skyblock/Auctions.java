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

package fr.kokhaviel.api.hypixel.resources.skyblock;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import fr.kokhaviel.api.hypixel.HypixelAPI;
import fr.kokhaviel.api.hypixel.util.exceptions.HypixelAPIException;

/**
 * Hypixel Skyblock Auctions Data
 * @author Kokhaviel
 * @since 4.2
 */
public class Auctions {

	private interface IAuction {
		String getUuid();
		String getAuctioneer();
		String getProfileId();
		String getCoop();
		long getStart();
		long getEnd();
		String getItemName();
		String getItemLore();
		String getExtraName();
		String getCategory();
		String getTier();
		long getStartBid();
		boolean isClaimed();
		long getHighestBidAmount();
		Bid getBids(int bid);
	}

	private interface IBid {
		String getAuctionId();
		String getBidder();
		String getProfileId();
		long getBidAmount();
		long getBidTimestamp();
	}

	final boolean success;
	final int page;
	final int totalPages;
	final int totalAuctions;
	final long lastUpdate;
	final JsonArray auctionsArray;
	final HypixelAPI hypixelAPI;

	public Auctions(JsonObject auctionsObject, HypixelAPI hypixelAPI) {
		this.success = auctionsObject.get("success").getAsBoolean();
		this.page = auctionsObject.get("page").getAsInt();
		this.totalPages = auctionsObject.get("totalPages").getAsInt();
		this.totalAuctions = auctionsObject.get("totalAuctions").getAsInt();
		this.lastUpdate = auctionsObject.get("lastUpdated").getAsLong();
		this.auctionsArray = auctionsObject.get("auctions").getAsJsonArray();
		this.hypixelAPI = hypixelAPI;
	}

	/**
	 * Get Success Status of the Request
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Auction Page Used
	 */
	public int getPage() {
		return page;
	}

	/**
	 * Get Total Auction Pages Available
	 */
	public int getTotalPages() {
		return totalPages;
	}

	/**
	 * Get Total Auctions Available
	 */
	public int getTotalAuctions() {
		return totalAuctions;
	}

	/**
	 * Get Last Data Update Timestamp
	 */
	public long getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Get Auctions with His Number
	 * @param auctionNumber Auction Number
	 * @return Request Auction Data
	 */
	public Auction getAuction(int auctionNumber) {
		if(auctionNumber < 0) throw new HypixelAPIException("Auction Number Cannot Be Less Than 0");
		else if(auctionNumber > 0 && auctionNumber < 999) return new Auction(auctionsArray.get(auctionNumber).getAsJsonObject());
		else if(auctionNumber > 999) {
			int newPage = Math.floorDiv(auctionNumber, 1000);
			int newAuctionNumber = Auctions.getAuctionNumber(auctionNumber);
			return new HypixelAPI(null /* 'null' Because Api Key is Not Used */).getActiveAuctions(newPage).getAuction(newAuctionNumber);
		}
		return new Auction(new JsonObject());
	}

	/**
	 * Auction Data
	 * @author Kokhaviel
	 * @since 4.2
	 */
	public static class Auction implements IAuction {

		final String uuid;
		final String auctioneer;
		final String profileId;
		final JsonArray coopArray;
		final long start;
		final long end;
		final String itemName;
		final String itemLore;
		final String extraName;
		final String category;
		final String tier;
		final long startBid;
		final boolean claimed;
		final long highestBid;
		final JsonArray bidsArray;

		public Auction(JsonObject auctionObject) {
			this.uuid = auctionObject.get("uuid").getAsString();
			this.auctioneer = auctionObject.get("auctioneer").getAsString();
			this.profileId = auctionObject.get("profile_id").getAsString();
			this.coopArray = auctionObject.get("coop").getAsJsonArray();
			this.start = auctionObject.get("start").getAsLong();
			this.end = auctionObject.get("end").getAsLong();
			this.itemName = auctionObject.get("item_name").getAsString();
			this.itemLore = auctionObject.get("item_lore").getAsString();
			this.extraName = auctionObject.get("extra").getAsString();
			this.category = auctionObject.get("category").getAsString();
			this.tier = auctionObject.get("tier").getAsString();
			this.startBid = auctionObject.get("starting_bid").getAsLong();
			this.claimed = auctionObject.get("claimed").getAsBoolean();
			this.highestBid = auctionObject.get("highest_bid_amount").getAsLong();
			this.bidsArray = auctionObject.get("bids").getAsJsonArray();
		}

		/**
		 * Get Auction UUID
		 */
		@Override
		public String getUuid() {
			return this.uuid;
		}

		/**
		 * Get Auctioneer UUID
		 */
		@Override
		public String getAuctioneer() {
			return this.auctioneer;
		}

		/**
		 * Get Auction Profile ID
		 */
		@Override
		public String getProfileId() {
			return this.profileId;
		}

		/**
		 * Get Auction Coop UUIDs
		 */
		@Override
		public String getCoop() {
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < coopArray.size(); i++) {
				sb.append(coopArray.get(i).getAsString()).append("; ");
			}
			return sb.toString();
		}

		/**
		 * Get Auction Start Timestamp
		 */
		@Override
		public long getStart() {
			return this.start;
		}

		/**
		 * Get Auction End Timestamp
		 */
		@Override
		public long getEnd() {
			return this.end;
		}

		/**
		 * Get Auction Item Name
		 */
		@Override
		public String getItemName() {
			return this.itemName;
		}

		/**
		 * Get Auction Item Lore
		 */
		@Override
		public String getItemLore() {
			return this.itemLore;
		}

		/**
		 * Get Auction Extra Name
		 */
		@Override
		public String getExtraName() {
			return this.extraName;
		}

		/**
		 * Get Auction Item Category
		 */
		@Override
		public String getCategory() {
			return this.category;
		}

		/**
		 * Get Auction Rarity Tier
		 */
		@Override
		public String getTier() {
			return this.tier;
		}

		/**
		 * Get Auction Start Bid
		 */
		@Override
		public long getStartBid() {
			return this.startBid;
		}

		/**
		 * Is Auction Claimed
		 */
		@Override
		public boolean isClaimed() {
			return this.claimed;
		}

		/**
		 * Get Auction Highest Bid Amount
		 */
		@Override
		public long getHighestBidAmount() {
			return this.highestBid;
		}

		/**.
		 * Get Bid from Index
		 * @param bid Bid Index
		 * @return Requested Bid Data
		 */
		@Override
		public Bid getBids(int bid) {
			if(bid < 0) throw new HypixelAPIException("Index Cannot Be 0, 1 is minimum");
			if(bid > bidsArray.size()) throw new HypixelAPIException("Maximum Index is " + bidsArray.size());
			return new Bid(bidsArray.get(bid).getAsJsonObject());
		}
	}

	/**
	 * Auction Bid Data
	 * @author Kokhaviel
	 * @since 4.2
	 */
	public static class Bid implements IBid {

		final String auctionId;
		final String bidder;
		final String profileId;
		final long bidAmount;
		final long bidTimestamp;

		public Bid(JsonObject bidObject) {
			this.auctionId = bidObject.get("auction_id").getAsString();
			this.bidder = bidObject.get("bidder").getAsString();
			this.profileId = bidObject.get("profile_id").getAsString();
			this.bidAmount = bidObject.get("amount").getAsLong();
			this.bidTimestamp = bidObject.get("timestamp").getAsLong();
		}

		/**
		 * Get Auction ID
		 */
		@Override
		public String getAuctionId() {
			return this.auctionId;
		}

		/**
		 * Get Bid Player UUID
		 */
		@Override
		public String getBidder() {
			return this.bidder;
		}

		/**
		 * Get Profile ID
		 */
		@Override
		public String getProfileId() {
			return this.profileId;
		}

		/**
		 * Get Bid Amount
		 */
		@Override
		public long getBidAmount() {
			return this.bidAmount;
		}

		/**
		 * Get Bid Timestamp
		 */
		@Override
		public long getBidTimestamp() {
			return this.bidTimestamp;
		}
	}
	
	static int getAuctionNumber(int auction) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			int remainder = auction % 10;
			sb.append(remainder);
			auction /= 10;
		}

		return Integer.parseInt(sb.reverse().toString());
	}
}
