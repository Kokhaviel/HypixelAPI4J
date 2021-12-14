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

import fr.kokhaviel.api.hypixel.HypixelAPI;
import fr.kokhaviel.api.hypixel.ILevel;

import java.net.MalformedURLException;

public class Level {

	final HypixelAPI hypixelAPI;
	final String player;

	public Level(HypixelAPI hypixelAPI, String player) {
		this.hypixelAPI = hypixelAPI;
		this.player = player;
	}

	public int getNetworkLevel() throws MalformedURLException {
		return ILevel.getNetworkLevel(hypixelAPI, player);
	}

	public int getExpToNextLevel() throws MalformedURLException {
		return ILevel.getExpToNextLevel(hypixelAPI, player);
	}

	public int getPercentageToNextLevel() throws MalformedURLException {
		return ILevel.getPercentageToNextLevel(hypixelAPI, player);
	}

	@Override
	public String toString() {
		return "Level{" +
				"hypixelAPI=" + hypixelAPI +
				", player='" + player + '\'' +
				'}';
	}
}
