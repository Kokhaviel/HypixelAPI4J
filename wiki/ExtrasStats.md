# Player Extra Statistics

## Location :

Use Extras class in 'fr.kokhaviel.api.hypixel.player' package.

```java
import fr.kokhaviel.api.hypixel.player.Extras;

class Main {
	//Your Code Here
}
```

## Usage

Use getPlayerData(String).getExtras() Method from HypixelAPI Class to get access to all Extras Statistics.

```java
import fr.kokhaviel.api.hypixel.player.Extras;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Extras extras = hypixelAPI.getPlayerData("Kokhaviel").getExtras();
        System.out.println(extras.getDuelsExtras().getKillsDeathsRatio());
        //Returns Kokhaviel Duels KDR
	}
}
```

## Network Level

Use getNetworkLevel() Method from Extras Class to Get Player Network Level.

```java
import fr.kokhaviel.api.hypixel.player.Extras;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Extras extras = hypixelAPI.getPlayerData("Kokhaviel").getExtras();
        System.out.println(extras.getNetworkLevel());
        //Returns Kokhaviel Hypixel Network
	}
}
```

## Needed Xp :

Use getExpToNextLevel() Method from Extras Class to Get Needed Exp to Reach Next Network Level.

```java
import fr.kokhaviel.api.hypixel.player.Extras;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Extras extras = hypixelAPI.getPlayerData("Kokhaviel").getExtras();
        System.out.println(extras.getExpToNextLevel());
        //Returns Kokhaviel Needed Exp to Reach Next Network Level
	}
}
```