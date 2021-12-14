# API Key Statistics

## Location : 

Use the 'fr.kokhaviel.api.hypixel.key' package to get access to API Key Statistics.

```java
import fr.kokhaviel.api.hypixel.guild.*;

class Main {
	//Your Code Here
}
```

## Usage :

Use getGuildData(String) Method from HypixelAPI Class to get access to all Guild Statistics.

```java
import fr.kokhaviel.api.hypixel.key.*;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Key key = hypixelAPI.getKeyData();
        System.out.println(key.getKeyData().getQueries());
        //Returns Kokhaviel Guild Name
	}
}
```
