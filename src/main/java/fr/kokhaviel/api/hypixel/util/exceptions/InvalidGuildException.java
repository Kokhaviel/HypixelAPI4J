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

public class InvalidGuildException extends HypixelAPIException {

	/**
	 * Constructs a New Invalid Guild Exception With the Specified Guild Name.
	 *
	 * @param guild The Guild name
	 */
	public InvalidGuildException(String guild) {
		super(guild + " is an Invalid Guild Name");
	}

	/**
	 * Constructs a New Simple Invalid Guild Exception.
	 */
	public InvalidGuildException() {
		super("This is an Invalid Guild Name");
	}
}
