# Server Statistics 

## Location :

Use the 'fr.kokhaviel.api.hypixel.server' package to get access to Game Statistics.

```java
import fr.kokhaviel.api.hypixel.server.*;

class Main {
	//Your Code Here
}
```

## Usage :

```java
import fr.kokhaviel.api.hypixel.games.*;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Bans bans = hypixelAPI.getBansData();
        Boosters boosters = hypixelAPI.getActiveBoosters();
        Counts counts = hypixelAPI.getPlayerCounts();
        Leaderboards leaderboards = hypixelAPI.getLeaderboardsData();
        System.out.println(bans.getStaffTotal());
        //Returns Total Staff Bans
	}
}
```
