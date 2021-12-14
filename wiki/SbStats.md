# Skyblock Player Statistics 

## Location :

Skyblock Statistics Location are 'SkyblockProfiles' Class in package 'fr.kokhaviel.api.hypixel.resources.skyblock'.

```java
import fr.kokhaviel.api.hypixel.resources.skyblock.SkyblockProfiles;

class Main {
	//Your Code Here
}
```

## Usage :

Use getSkyblockData(String) Method from HypixelAPI Class to get access to all Skyblock Statistics.

```java
import fr.kokhaviel.api.hypixel.resources.skyblock.SkyblockProfiles.*;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Member member = hypixelAPI.getSkyblockData("Kokhaviel").getProfile(2).getMember(1);
        System.out.println(member.getFarmingExp());
        //Returns Skyblock Farming Experience of the Player 'Kokhaviel' on Profile 2.
	}
}
```