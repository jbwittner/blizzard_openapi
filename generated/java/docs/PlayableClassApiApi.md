# PlayableClassApiApi

All URIs are relative to *https://eu.api.blizzard.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPlayableClass**](PlayableClassApiApi.md#getPlayableClass) | **GET** /data/wow/playable-class/{classId} | Returns a playable class by ID. |
| [**getPlayableClassesIndex**](PlayableClassApiApi.md#getPlayableClassesIndex) | **GET** /data/wow/playable-class/index | Returns an index of playable races. |


<a id="getPlayableClass"></a>
# **getPlayableClass**
> PlayableClassDetailsDTO getPlayableClass(namespace, classId)

Returns a playable class by ID.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.PlayableClassApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    PlayableClassApiApi apiInstance = new PlayableClassApiApi(defaultClient);
    String namespace = "static-eu"; // String | 
    Integer classId = 56; // Integer | 
    try {
      PlayableClassDetailsDTO result = apiInstance.getPlayableClass(namespace, classId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayableClassApiApi#getPlayableClass");
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
| **classId** | **Integer**|  | |

### Return type

[**PlayableClassDetailsDTO**](PlayableClassDetailsDTO.md)

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

<a id="getPlayableClassesIndex"></a>
# **getPlayableClassesIndex**
> PlayableClassesIndexDTO getPlayableClassesIndex(namespace)

Returns an index of playable races.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.PlayableClassApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    PlayableClassApiApi apiInstance = new PlayableClassApiApi(defaultClient);
    String namespace = "static-eu"; // String | 
    try {
      PlayableClassesIndexDTO result = apiInstance.getPlayableClassesIndex(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayableClassApiApi#getPlayableClassesIndex");
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

[**PlayableClassesIndexDTO**](PlayableClassesIndexDTO.md)

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

