# Player Recent Games Data

## Location

Use the 'fr.kokhaviel.api.hypixel.recent' package to get access to Recent Games Data.

```java
import fr.kokhaviel.api.hypixel.recent.*;

class Main {
	//Your Code Here
}
```


## Usage :

Use getRecentGames(String) Method from HypixelAPI Class to get access to all Statistics.

```java
import fr.kokhaviel.api.hypixel.recent.*;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Game game = hypixelAPI.getRecentGames("Kokhaviel").getGamesList().get(0);
        System.out.println(game.getType());
        //Returns Kokhaviel Last Played Game Type.
	}
}
```

