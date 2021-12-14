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

package fr.kokhaviel.api.hypixel.guild;

import com.google.gson.annotations.SerializedName;

/**
 * Hypixel Guild Members Statistics
 *
 * @author Kokhaviel
 * @since 2.0
 */
public class Member {

	/**
	 * UUID of the Member
	 */
	@SerializedName("uuid")
	String uuid = "";

	/**
	 * Guild Rank of the Player
	 */
	@SerializedName("rank")
	String rank = "";

	/**
	 * Timestamp of the Join of the Member
	 */
	@SerializedName("joined")
	long joined = 0;

	/**
	 * Total Guild Experience Participation
	 */
	@SerializedName("questParticipation")
	int participation = 0;


	/**
	 * Get UUID of the Member
	 *
	 * @return UUID
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * Get Guild Rank of the Member
	 *
	 * @return Rank Name
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * Timestamp of the Join of the Player
	 */
	public long getJoined() {
		return joined;
	}

	/**
	 * Get Total Guild Experience Participation
	 *
	 * @return Participation
	 */
	public int getParticipation() {
		return participation;
	}

	@Override
	public String toString() {
		return "Member{" +
				"uuid='" + uuid + '\'' +
				", rank='" + rank + '\'' +
				", joined=" + joined +
				", participation=" + participation +
				'}';
	}
}
