# grpc

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>id.koneko096</groupId>
    <artifactId>grpc</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "id.koneko096:grpc:0.0.1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/grpc-0.0.1-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import id.koneko096.swagger.invoker.*;
import id.koneko096.swagger.invoker.auth.*;
import id.koneko096.swagger.data.model.*;
import id.koneko096.swagger.api.CitizenApi;

import java.io.File;
import java.util.*;

public class CitizenApiExample {

    public static void main(String[] args) {
        
        CitizenApi apiInstance = new CitizenApi();
        try {
            Citizen result = apiInstance.createCitizen();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CitizenApi#createCitizen");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CitizenApi* | [**createCitizen**](docs/CitizenApi.md#createCitizen) | **POST** /citizen | Create citizen
*CitizenApi* | [**deleteCitizen**](docs/CitizenApi.md#deleteCitizen) | **DELETE** /citizen/{citizenId} | Delete citizen by ID
*CitizenApi* | [**getAllCitizens**](docs/CitizenApi.md#getAllCitizens) | **GET** /citizen | List citizens
*CitizenApi* | [**getCitizenDetails**](docs/CitizenApi.md#getCitizenDetails) | **GET** /citizen/{citizenId} | Find citizen by ID
*CitizenApi* | [**updateCitizen**](docs/CitizenApi.md#updateCitizen) | **PUT** /citizen/{citizenId} | Update citizen


## Documentation for Models

 - [Citizen](docs/Citizen.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



