# PlayableSpecializationApiApi

All URIs are relative to *https://eu.api.blizzard.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPlayableSpecialization**](PlayableSpecializationApiApi.md#getPlayableSpecialization) | **GET** /data/wow/playable-specialization/{specId} | Returns a playable race by ID. |
| [**getPlayableSpecializationsIndex**](PlayableSpecializationApiApi.md#getPlayableSpecializationsIndex) | **GET** /data/wow/playable-specialization/index | Returns an index of playable specializations. |


<a id="getPlayableSpecialization"></a>
# **getPlayableSpecialization**
> PlayableSpecializationDetailsDTO getPlayableSpecialization(namespace, specId)

Returns a playable race by ID.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.PlayableSpecializationApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    PlayableSpecializationApiApi apiInstance = new PlayableSpecializationApiApi(defaultClient);
    String namespace = "static-eu"; // String | 
    Integer specId = 56; // Integer | 
    try {
      PlayableSpecializationDetailsDTO result = apiInstance.getPlayableSpecialization(namespace, specId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayableSpecializationApiApi#getPlayableSpecialization");
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
| **specId** | **Integer**|  | |

### Return type

[**PlayableSpecializationDetailsDTO**](PlayableSpecializationDetailsDTO.md)

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

<a id="getPlayableSpecializationsIndex"></a>
# **getPlayableSpecializationsIndex**
> PlayableSpecializationIndexDTO getPlayableSpecializationsIndex(namespace)

Returns an index of playable specializations.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.PlayableSpecializationApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    PlayableSpecializationApiApi apiInstance = new PlayableSpecializationApiApi(defaultClient);
    String namespace = "static-eu"; // String | 
    try {
      PlayableSpecializationIndexDTO result = apiInstance.getPlayableSpecializationsIndex(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayableSpecializationApiApi#getPlayableSpecializationsIndex");
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

[**PlayableSpecializationIndexDTO**](PlayableSpecializationIndexDTO.md)

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

