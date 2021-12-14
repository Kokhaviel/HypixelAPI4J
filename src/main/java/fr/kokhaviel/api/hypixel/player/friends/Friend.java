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
import fr.kokhaviel.api.hypixel.HypixelAPI;

import java.net.MalformedURLException;
import java.util.UUID;

/**
 * Hypixel Friend Information
 *
 * @author Kokhaviel
 * @since 1.2
 */
public class Friend {

	/**
	 * Id of the Friend Request
	 */
	@SerializedName("_id")
	String id = "";

	/**
	 * UUID of the Friend Request Sender
	 */
	@SerializedName("uuidSender")
	String sender = "";

	/**
	 * UUID of the Friend Request Receiver
	 */
	@SerializedName("uuidReceiver")
	String receiver = "";

	/**
	 * Timestamp of the Request Accept
	 */
	@SerializedName("started")
	long started = 0;


	/**
	 * Get Id of the Friend Request
	 *
	 * @return Id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Get Sender UUID
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * Get Receiver UUID
	 */
	public String getReceiver() {
		return receiver;
	}

	/**
	 * Get Timestamp of the Request Accept
	 *
	 * @return Timestamp
	 */
	public long getStarted() {
		return started;
	}

	/**
	 * Get Friend Request Sender Username
	 *
	 * @param key Your Hypixel API Key
	 * @return Sender Username
	 */
	public String getSenderName(String key) throws MalformedURLException {
		return new HypixelAPI(key).getPlayerData(UUID.fromString(
				sender.replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5"))
		).getPlayer().getDisplayName();
	}

	/**
	 * Get Friend Request Receiver Username
	 *
	 * @param key Your Hypixel API Key
	 * @return Receiver Username
	 */
	public String getReceiverName(String key) throws MalformedURLException {
		return new HypixelAPI(key).getPlayerData(UUID.fromString(
				receiver.replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5"))
		).getPlayer().getDisplayName();
	}

	@Override
	public String toString() {
		return "Friend{" +
				"id='" + id + '\'' +
				", sender='" + sender + '\'' +
				", receiver='" + receiver + '\'' +
				", started=" + started +
				'}';
	}
}
