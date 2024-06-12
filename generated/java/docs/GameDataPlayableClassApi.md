# GameDataPlayableClassApi

All URIs are relative to *https://eu.api.blizzard.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPlayableRace**](GameDataPlayableClassApi.md#getPlayableRace) | **GET** /data/wow/playable-race/{playableRaceId} | Returns a playable race by ID. |
| [**getPlayableRacesIndex**](GameDataPlayableClassApi.md#getPlayableRacesIndex) | **GET** /data/wow/playable-race/index | Returns an index of playable races. |


<a id="getPlayableRace"></a>
# **getPlayableRace**
> PlayableRaceDetailsDTO getPlayableRace(namespace, playableRaceId)

Returns a playable race by ID.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.GameDataPlayableClassApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    GameDataPlayableClassApi apiInstance = new GameDataPlayableClassApi(defaultClient);
    String namespace = "static-eu"; // String | 
    Integer playableRaceId = 56; // Integer | 
    try {
      PlayableRaceDetailsDTO result = apiInstance.getPlayableRace(namespace, playableRaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataPlayableClassApi#getPlayableRace");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **namespace** | **String**|  | [default to static-eu] |
| **playableRaceId** | **Integer**|  | |

### Return type

[**PlayableRaceDetailsDTO**](PlayableRaceDetailsDTO.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Http 200 |  -  |
| **4XX** | Http 4XX |  -  |

<a id="getPlayableRacesIndex"></a>
# **getPlayableRacesIndex**
> PlayableRacesIndexDTO getPlayableRacesIndex(namespace)

Returns an index of playable races.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.GameDataPlayableClassApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    GameDataPlayableClassApi apiInstance = new GameDataPlayableClassApi(defaultClient);
    String namespace = "static-eu"; // String | 
    try {
      PlayableRacesIndexDTO result = apiInstance.getPlayableRacesIndex(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataPlayableClassApi#getPlayableRacesIndex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **namespace** | **String**|  | [default to static-eu] |

### Return type

[**PlayableRacesIndexDTO**](PlayableRacesIndexDTO.md)

### Authorization

[accessToken](../README.md#accessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Http 200 |  -  |
| **4XX** | Http 4XX |  -  |

