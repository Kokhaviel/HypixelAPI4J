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

package fr.kokhaviel.api.hypixel.resources.guild;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Guilds Permissions Data
 *
 * @author Kokhaviel
 * @since 3.4
 */
public class Permissions {

	final JsonObject jsonObject;
	final JsonArray permissionsObject;
	final Map<String, Permission> permissionMap = new HashMap<>();
	final boolean success;
	final long lastUpdate;

	public Permissions(JsonObject jsonObject) {
		this.jsonObject = jsonObject;
		this.success = jsonObject.get("success").getAsBoolean();
		this.lastUpdate = jsonObject.get("lastUpdated").getAsLong();
		this.permissionsObject = jsonObject.get("permissions").getAsJsonArray();
		putPermissionsData();
	}

	void putPermissionsData() {
		permissionMap.put("CHANGE_GUILD_NAME", new Permission(permissionsObject.get(0).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("CHANGE_MOTD", new Permission(permissionsObject.get(1).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("CHANGE_GUILD_TAG", new Permission(permissionsObject.get(2).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("CHANGE_GUILD_RANKS", new Permission(permissionsObject.get(3).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("CHANGE_GUILD_FINDER", new Permission(permissionsObject.get(4).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("OFFICER_CHAT", new Permission(permissionsObject.get(5).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("KICK_MEMBERS", new Permission(permissionsObject.get(6).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("MUTE_MEMBERS", new Permission(permissionsObject.get(7).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("INVITE_MEMBERS", new Permission(permissionsObject.get(8).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("VIEW_AUDIT_LOG", new Permission(permissionsObject.get(9).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("VIEW_MEMBER_STATS", new Permission(permissionsObject.get(10).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("GUILD_PARTY", new Permission(permissionsObject.get(11).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("CHANGE_GUILD_SETTINGS", new Permission(permissionsObject.get(12).getAsJsonObject().get("en_us").getAsJsonObject()));
		permissionMap.put("CHANGE_GUILD_DISCORD", new Permission(permissionsObject.get(13).getAsJsonObject().get("en_us").getAsJsonObject()));
	}

	/**
	 * Get Success Status of the Request
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Get Last Data Update Timestamp
	 */
	public long getLastUpdate() {
		return lastUpdate;
	}

	/**
	 * Get Permissions
	 */
	public Map<String, Permission> getPermissionMap() {
		return permissionMap;
	}

	/**
	 * Permission Data
	 *
	 * @author Kokhaviel
	 * @since 3.4
	 */
	public static class Permission {
		final String name;
		final String description;
		final String item;

		public Permission(JsonObject permissionObject) {

			this.name = permissionObject.get("name").getAsString();
			this.description = permissionObject.get("description").getAsString();
			this.item = permissionObject.get("item").getAsJsonObject().get("name").getAsString();
		}

		/**
		 * Get Permission Full Name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Get Permission Description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * Get Associated Item
		 */
		public String getItem() {
			return item;
		}
	}
}
