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

package fr.kokhaviel.api.hypixel.util.exceptions;

public class InvalidPlayerException extends HypixelAPIException {

	/**
	 * Constructs a New Simple Invalid Player Exception Without Specified Player Name.
	 */
	public InvalidPlayerException() {
		super("This is an Invalid Minecraft Username");
	}

	/**
	 * Constructs a New Invalid Player Exception With the Specified Player Name.
	 *
	 * @param playerName The Minecraft Player Username
	 */
	public InvalidPlayerException(String playerName) {
		super(playerName + " is an Invalid Minecraft Player Username");
	}

}
