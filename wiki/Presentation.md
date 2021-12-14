#   HypixelAPI
Get full access to the [Hypixel Api](https://api.hypixel.net/) easily due to many utility classes !

[releases_shield]: https://img.shields.io/github/v/release/Kokhaviel/HypixelAPI?include_prereleases
[releases]: https://github.com/Kokhaviel/HypixelAPI/releases/latest/
[license_shield]: https://img.shields.io/github/license/Kokhaviel/HypixelAPI
[license]: https://github.com/Kokhaviel/HypixelAPI/blob/master/LICENSE
[issues_shield]: https://img.shields.io/github/issues/Kokhaviel/HypixelAPI
[issues]: https://github.com/Kokhaviel/HypixelAPI/issues
[commits_shield]: https://img.shields.io/github/commit-activity/m/Kokhaviel/HypixelAPI
[commits]: https://github.com/Kokhaviel/HypixelAPI/commits/master
[last_commit_shield]: https://img.shields.io/github/last-commit/Kokhaviel/HypixelAPI

[![releases_shield][]][releases]
[![license_shield][]][license]
[![issues_shield][]][issues]
[![commits_shield][]][commits]
[![last_commit_shield][]][commits]

## Downloads :
Assets available on the [release](https://github.com/Kokhaviel/HypixelAPI/releases) page !

## Installation :
### Gradle :
```groovy
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation group: 'com.github.Kokhaviel', name:'HypixelAPI', version:'master'
    implementation group: 'com.google.code.gson', name: 'gson', version: '2.8.7'
}
```

### Maven :

```xml
<project>
    <repositories>
        <repository>
            <id>jitpack</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.github.Kokhaviel</groupId>
            <artifactId>HypixelAPI</artifactId>
            <version>master</version>
        </dependency>
     <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.7</version>
        </dependency>
    </dependencies>
</project>
```

## Usage :
First, create a new HypixelAPI Object with your Api Key in parameter.

```java
import fr.kokhaviel.api.hypixel.HypixelAPI;

class Main {
	public static void main(String[] args) {
		HypixelAPI hypixelAPI = new HypixelAPI("58546852-b96f-74a3-bb87-b5a64137c98c");
		//This is not a working api key !
	}
}
```

Then, you can use the API with the help of the [documentation](https://kokhaviel.github.io/javadoc/hypixelapi/) !

## Information :
This API works with the Gson Library

## Contributing :
You can contribute to this project by opening issues for this repo.

## License
This project is licensed under the Apache-2.0 License

