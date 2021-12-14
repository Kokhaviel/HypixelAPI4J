# Games Statistics

## Location :

Use the 'fr.kokhaviel.api.hypixel.games' package to get access to Game Statistics.

```java
import fr.kokhaviel.api.hypixel.games.*;

class Main {
	//Your Code Here
}
```

## Usage :

Use getPlayerData(String) Method from HypixelAPI Class to get access to all Statistics.

```java
import fr.kokhaviel.api.hypixel.games.*;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Skywars skywars = hypixelAPI.getPlayerData("Kokhaviel").getPlayer().getStats().getSkywars();
        System.out.println(skywars.getCoins());
        //Returns Skywars Coins of the Player 'Kokhaviel'.
	}
}
```
