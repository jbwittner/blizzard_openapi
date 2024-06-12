# GameDataRealmApi

All URIs are relative to *https://eu.api.blizzard.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRealm**](GameDataRealmApi.md#getRealm) | **GET** /data/wow/realm/{realmSlug} | Returns a single realm by slug or ID. |
| [**getRealmsIndex**](GameDataRealmApi.md#getRealmsIndex) | **GET** /data/wow/realm/index | Returns an index of realms. |


<a id="getRealm"></a>
# **getRealm**
> RealmDetailsDTO getRealm(namespace, realmSlug)

Returns a single realm by slug or ID.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.GameDataRealmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    GameDataRealmApi apiInstance = new GameDataRealmApi(defaultClient);
    String namespace = "dynamic-eu"; // String | 
    String realmSlug = "realmSlug_example"; // String | 
    try {
      RealmDetailsDTO result = apiInstance.getRealm(namespace, realmSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataRealmApi#getRealm");
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
| **namespace** | **String**|  | [default to dynamic-eu] |
| **realmSlug** | **String**|  | |

### Return type

[**RealmDetailsDTO**](RealmDetailsDTO.md)

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

<a id="getRealmsIndex"></a>
# **getRealmsIndex**
> RealmsIndexDTO getRealmsIndex(namespace)

Returns an index of realms.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.GameDataRealmApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    GameDataRealmApi apiInstance = new GameDataRealmApi(defaultClient);
    String namespace = "dynamic-eu"; // String | 
    try {
      RealmsIndexDTO result = apiInstance.getRealmsIndex(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GameDataRealmApi#getRealmsIndex");
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
| **namespace** | **String**|  | [default to dynamic-eu] |

### Return type

[**RealmsIndexDTO**](RealmsIndexDTO.md)

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

