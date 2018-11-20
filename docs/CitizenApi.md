# CitizenApi

All URIs are relative to *http://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCitizen**](CitizenApi.md#createCitizen) | **POST** /citizen | Create citizen
[**deleteCitizen**](CitizenApi.md#deleteCitizen) | **DELETE** /citizen/{citizenId} | Delete citizen by ID
[**getAllCitizens**](CitizenApi.md#getAllCitizens) | **GET** /citizen | List citizens
[**getCitizenDetails**](CitizenApi.md#getCitizenDetails) | **GET** /citizen/{citizenId} | Find citizen by ID
[**updateCitizen**](CitizenApi.md#updateCitizen) | **PUT** /citizen/{citizenId} | Update citizen


<a name="createCitizen"></a>
# **createCitizen**
> Citizen createCitizen()

Create citizen

Creates a new Citizen

### Example
```java
// Import classes:
//import id.koneko096.swagger.invoker.ApiException;
//import id.koneko096.swagger.api.CitizenApi;


CitizenApi apiInstance = new CitizenApi();
try {
    Citizen result = apiInstance.createCitizen();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CitizenApi#createCitizen");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Citizen**](Citizen.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="deleteCitizen"></a>
# **deleteCitizen**
> deleteCitizen(citizenId)

Delete citizen by ID

Deletes a single Citizen

### Example
```java
// Import classes:
//import id.koneko096.swagger.invoker.ApiException;
//import id.koneko096.swagger.api.CitizenApi;


CitizenApi apiInstance = new CitizenApi();
Long citizenId = 789L; // Long | ID of Citizen to delete
try {
    apiInstance.deleteCitizen(citizenId);
} catch (ApiException e) {
    System.err.println("Exception when calling CitizenApi#deleteCitizen");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **citizenId** | **Long**| ID of Citizen to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getAllCitizens"></a>
# **getAllCitizens**
> List&lt;Citizen&gt; getAllCitizens()

List citizens

Returns list of Citizen

### Example
```java
// Import classes:
//import id.koneko096.swagger.invoker.ApiException;
//import id.koneko096.swagger.api.CitizenApi;


CitizenApi apiInstance = new CitizenApi();
try {
    List<Citizen> result = apiInstance.getAllCitizens();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CitizenApi#getAllCitizens");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Citizen&gt;**](Citizen.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCitizenDetails"></a>
# **getCitizenDetails**
> Citizen getCitizenDetails(citizenId)

Find citizen by ID

Returns a single Citizen

### Example
```java
// Import classes:
//import id.koneko096.swagger.invoker.ApiException;
//import id.koneko096.swagger.api.CitizenApi;


CitizenApi apiInstance = new CitizenApi();
Long citizenId = 789L; // Long | ID of Citizen to return
try {
    Citizen result = apiInstance.getCitizenDetails(citizenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CitizenApi#getCitizenDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **citizenId** | **Long**| ID of Citizen to return |

### Return type

[**Citizen**](Citizen.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCitizen"></a>
# **updateCitizen**
> Citizen updateCitizen(citizenId)

Update citizen

Updates an existing Citizen

### Example
```java
// Import classes:
//import id.koneko096.swagger.invoker.ApiException;
//import id.koneko096.swagger.api.CitizenApi;


CitizenApi apiInstance = new CitizenApi();
Long citizenId = 789L; // Long | ID of Citizen to update
try {
    Citizen result = apiInstance.updateCitizen(citizenId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CitizenApi#updateCitizen");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **citizenId** | **Long**| ID of Citizen to update |

### Return type

[**Citizen**](Citizen.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

