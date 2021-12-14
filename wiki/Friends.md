# Player Friends Statistics

## Location :
Use the 'fr.kokhaviel.api.hypixel.player.friends' package to get access to Friends Statistics.

```java
import fr.kokhaviel.api.hypixel.player.friends.*;

class Main {
	//Your Code Here
}
```

## Usage :

Use getFriends(String) Method from HypixelAPI Class to get access to all Friends Statistics.


```java
import fr.kokhaviel.api.hypixel.player.friends.*;
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
        Friend friend = hypixelAPI.getFriends("Kokhaviel").getFriendsList().getFriend(0);
        System.out.println(friend.getSenderName());
        //Returns Sender Name of the First Kokhaviel Friend Request
	}
}
```
