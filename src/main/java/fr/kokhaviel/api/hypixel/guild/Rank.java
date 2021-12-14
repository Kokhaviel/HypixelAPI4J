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
 * Hypixel Guild Rank Statistics
 *
 * @author Kokhaviel
 * @since 2.0
 */
public class Rank {

	/**
	 * Name of the Guild Rank
	 */
	@SerializedName("name")
	String name = "";

	/**
	 * Is Rank Default for new Members
	 */
	@SerializedName("default")
	boolean default_ = false;

	/**
	 * Tag of the Guild Rank
	 */
	@SerializedName("tag")
	String tag = "";

	/**
	 * Timestamp of the Creation of the Rank
	 */
	@SerializedName("created")
	long created = 0;

	/**
	 * Rank Priority
	 */
	@SerializedName("priority")
	int priority = 0;


	/**
	 * Get Name of Guild Rank
	 *
	 * @return Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Is Rank Default for new Player
	 */
	public boolean isDefault() {
		return default_;
	}

	/**
	 * Get Tag of the Guild Rank
	 *
	 * @return Rank Tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * Get Timestamp of the Creation of the Rank
	 *
	 * @return Timestamp
	 */
	public long getCreated() {
		return created;
	}

	public int getPriority() {
		return priority;
	}

	@Override
	public String toString() {
		return "Rank{" +
				"name='" + name + '\'' +
				", default_=" + default_ +
				", tag='" + tag + '\'' +
				", created=" + created +
				", priority=" + priority +
				'}';
	}
}
