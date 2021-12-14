# Player Status Data

## Location :

Use the 'fr.kokhaviel.api.hypixel.status' package to get access to Player Status Data.

```java
import fr.kokhaviel.api.hypixel.status.*;

class Main {
	//Your Code Here
}
```

## Usage :

Use getStatus(String) Method from HypixelAPI Class to get access to all Status Data.

```java
import fr.kokhaviel.api.hypixel.status.Status;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Status status = hypixelAPI.getStatus("Kokhaviel");
        System.out.println(status.getSession().getGameType());
        //Returns Current Game Type Played by Kokhaviel
	}
}
```

## Note : 

If Session.isOnline() returns false, the other variables will keep their default values.
