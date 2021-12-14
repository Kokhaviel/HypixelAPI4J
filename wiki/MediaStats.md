# Player Medias Data

## Location :

Use the 'Medias' Class From 'fr.kokhaviel.api.hypixel.player' package to get access to Player Medias Data.

```java
import fr.kokhaviel.api.hypixel.player.Medias;

class Main {
	//Your Code Here
}
```

## Usage :

Use getPlayerData(String) Method from HypixelAPI Class to get access to all Statistics.

```java
import fr.kokhaviel.api.hypixel.player.Medias;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Medias medias = hypixelAPI.getPlayerData("Kokhaviel").getPlayer().getMedias();
        System.out.println(medias.getDiscord());
        //Returns Kokhaviel Registered Discord Tag
	}
}
```
