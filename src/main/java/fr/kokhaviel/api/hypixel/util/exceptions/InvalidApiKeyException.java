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

public class InvalidApiKeyException extends HypixelAPIException {

	/**
	 * Constructs a New Simple Invalid Api Key Exception.
	 */
	public InvalidApiKeyException() {
		super("This is an Invalid Hypixel Api Key");
	}

	/**
	 * Constructs a New Invalid Api Key Exception With the Specified Api Key.
	 *
	 * @param key The Hypixel Api Key
	 */
	public InvalidApiKeyException(String key) {
		super(key + " is an Invalid Hypixel Api Key");
	}
}
