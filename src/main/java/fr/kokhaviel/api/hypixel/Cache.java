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

package fr.kokhaviel.api.hypixel;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Cache {

	public static void createCacheIfNotExists() throws IOException {
		File cacheUpdateDir = new File(System.getProperty("user.home") + "/.hypixel-api/");
		File cacheUpdate = new File(cacheUpdateDir.getPath() + "/update.json");

		final boolean mkdirs = cacheUpdateDir.mkdirs();
		if(!cacheUpdate.exists()) {
			final boolean newFile = cacheUpdate.createNewFile();
			JsonObject jsonObject = new JsonObject();
			new FileOutputStream(cacheUpdate).write(jsonObject.getAsJsonObject().toString().getBytes(StandardCharsets.UTF_8));
		}
	}

	public static void clearOneHourCache() throws IOException {

		File cacheUpdate = new File(System.getProperty("user.home") + "/.hypixel-api/update.json");

		StringBuilder builder = new StringBuilder();
		Files.readAllLines(cacheUpdate.toPath()).forEach(builder::append);

		JsonObject updateObj = JsonParser.parseString(builder.toString()).getAsJsonObject();

		List<String> presentCaches = updateObj.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toCollection(ArrayList::new));

		presentCaches.forEach(entry -> {
			final long now = System.currentTimeMillis();
			if(now - updateObj.get(entry).getAsLong() > 3600000) {
				try {
					Files.delete(Paths.get(System.getProperty("user.home") + "/.hypixel-api/" + entry + ".json"));
					updateObj.remove(entry);
				} catch(IOException e) {
					e.printStackTrace();
				} finally {
					try {
						new FileOutputStream(cacheUpdate).write(updateObj.toString().getBytes(StandardCharsets.UTF_8));
					} catch(IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
	}

	public static void invalidateFiveMinutesCache(String cacheName) throws IOException {
		File cacheUpdate = new File(System.getProperty("user.home") + "/.hypixel-api/update.json");

		StringBuilder builder = new StringBuilder();
		Files.readAllLines(cacheUpdate.toPath()).forEach(builder::append);

		JsonObject updateObj = JsonParser.parseString(builder.toString()).getAsJsonObject();

		final long now = System.currentTimeMillis();
		if(!Files.exists(Paths.get(System.getProperty("user.home") + "/.hypixel-api/" + cacheName + ".json"))) return;
		if(now - updateObj.get(cacheName).getAsLong() > 300000) {
			try {
				Files.delete(Paths.get(System.getProperty("user.home") + "/.hypixel-api/" + cacheName + ".json"));
				updateObj.remove(cacheName);
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				new FileOutputStream(cacheUpdate).write(updateObj.toString().getBytes(StandardCharsets.UTF_8));
			}
		}
	}

	public static void cleanCache() throws IOException {
		File cacheDir = new File(System.getProperty("user.home") + "/.hypixel-api/");
		Arrays.asList(Objects.requireNonNull(cacheDir.listFiles())).forEach(file -> {
			if(file.getName().equals("update.json")) return;
			final boolean delete = file.delete();
		});

		File cacheUpdate = new File(System.getProperty("user.home") + "/.hypixel-api/update.json");
		StringBuilder builder = new StringBuilder();
		Files.readAllLines(cacheUpdate.toPath()).forEach(builder::append);

		JsonObject updateObj = JsonParser.parseString(builder.toString()).getAsJsonObject();
		List<String> presentCaches = updateObj.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toCollection(ArrayList::new));
		presentCaches.forEach(updateObj::remove);
		new FileOutputStream(cacheUpdate).write(updateObj.toString().getBytes(StandardCharsets.UTF_8));
	}

	public static void createCache(String cacheName, String contents) throws IOException {
		File cacheDir = new File(System.getProperty("user.home") + "/.hypixel-api/");
		File cacheFile = new File(cacheDir.getPath() + "/" + cacheName + ".json");
		File cacheUpdate = new File(cacheDir.getPath() + "/update.json");

		StringBuilder builder = new StringBuilder();
		Files.readAllLines(cacheUpdate.toPath()).forEach(builder::append);

		JsonObject updateObj = JsonParser.parseString(builder.toString()).getAsJsonObject();

		final boolean mkdirs = cacheDir.mkdirs();
		if(!cacheFile.exists()) {
			final boolean newFile = cacheFile.createNewFile();
			new FileOutputStream(cacheFile).write(contents.getBytes(StandardCharsets.UTF_8));
			updateObj.addProperty(cacheName, System.currentTimeMillis());
			new FileOutputStream(cacheUpdate).write(updateObj.toString().getBytes(StandardCharsets.UTF_8));
		}
	}
}
