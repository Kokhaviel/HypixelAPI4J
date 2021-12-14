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

package fr.kokhaviel.api.hypixel.player;

import com.google.gson.annotations.SerializedName;

/**
 * Hypixel Player Social Medias
 *
 * @author Kokhaviel
 * @since 1.0
 */
public class Medias {

	/**
	 * Social Medias Links of the Player
	 */
	@SerializedName("links")
	Links links = new Links();

	/**
	 * Get Social Medias Links of the Player
	 *
	 * @return Social Medias Links
	 */
	public Links getLinks() {
		return links;
	}

	/**
	 * Hypixel Player Social Medias Links
	 *
	 * @author Kokhaviel
	 * @since 1.0
	 */
	public static class Links {

		/**
		 * Twitter Link of the Player
		 */
		@SerializedName("TWITTER")
		String twitter = "None";

		/**
		 * Youtube Link of the Player
		 */
		@SerializedName("YOUTUBE")
		String youtube = "None";

		/**
		 * Instagram Link of the Player
		 */
		@SerializedName("INSTAGRAM")
		String instagram = "None";

		/**
		 * Twitch Link of the Player
		 */
		@SerializedName("TWITCH")
		String twitch = "None";

		/**
		 * Discord Link of the Player
		 */
		@SerializedName("DISCORD")
		String discord = "None";

		/**
		 * Hypixel Forums Link of the Player
		 */
		@SerializedName("HYPIXEL")
		String hypixel = "None";


		/**
		 * Get Twitter Link of the Player
		 *
		 * @return Twitter Link
		 */
		public String getTwitter() {
			return twitter;
		}

		/**
		 * Get Youtube Link of the Player
		 *
		 * @return Youtube Link
		 */
		public String getYoutube() {
			return youtube;
		}

		/**
		 * Get Instagram Link of the Player
		 *
		 * @return Instagram Link
		 */
		public String getInstagram() {
			return instagram;
		}

		/**
		 * Get Twitch Link of the Player
		 *
		 * @return Twitch Link
		 */
		public String getTwitch() {
			return twitch;
		}

		/**
		 * Get Discord Link of the Player
		 *
		 * @return Discord Link
		 */
		public String getDiscord() {
			return discord;
		}

		/**
		 * Get Hypixel Forums Link of the Player
		 *
		 * @return Hypixel Forums Link
		 */
		public String getHypixel() {
			return hypixel;
		}

		@Override
		public String toString() {
			return "Links{" +
					"twitter='" + twitter + '\'' +
					", youtube='" + youtube + '\'' +
					", instagram='" + instagram + '\'' +
					", twitch='" + twitch + '\'' +
					", discord='" + discord + '\'' +
					", hypixel='" + hypixel + '\'' +
					'}';
		}
	}

	@Override
	public String toString() {
		return "Medias{" +
				"links=" + links +
				'}';
	}
}
