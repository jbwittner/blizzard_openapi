# ProfileAccountProfileApi

All URIs are relative to *https://eu.api.blizzard.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAccountProfile**](ProfileAccountProfileApi.md#getAccountProfile) | **GET** /profile/user/wow | Returns a profile summary for an account. |


<a id="getAccountProfile"></a>
# **getAccountProfile**
> WowProfileDTO getAccountProfile(namespace)

Returns a profile summary for an account.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.ProfileAccountProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    ProfileAccountProfileApi apiInstance = new ProfileAccountProfileApi(defaultClient);
    String namespace = "profile-eu"; // String | 
    try {
      WowProfileDTO result = apiInstance.getAccountProfile(namespace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileAccountProfileApi#getAccountProfile");
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
| **namespace** | **String**|  | [default to profile-eu] |

### Return type

[**WowProfileDTO**](WowProfileDTO.md)

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

