# ProfileCharacterProfileApi

All URIs are relative to *https://eu.api.blizzard.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCharacterProfile**](ProfileCharacterProfileApi.md#getCharacterProfile) | **GET** /profile/wow/character/{realmSlug}/{characterName} | Returns a profile summary for a character. |


<a id="getCharacterProfile"></a>
# **getCharacterProfile**
> CharacterProfileSummaryDTO getCharacterProfile(namespace, realmSlug, characterName)

Returns a profile summary for a character.

### Example
```java
// Import classes:
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.Configuration;
import com.blizzardapi.auth.*;
import com.blizzardapi.models.*;
import com.blizzardapi.openapi.ProfileCharacterProfileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure HTTP bearer authorization: accessToken
    HttpBearerAuth accessToken = (HttpBearerAuth) defaultClient.getAuthentication("accessToken");
    accessToken.setBearerToken("BEARER TOKEN");

    ProfileCharacterProfileApi apiInstance = new ProfileCharacterProfileApi(defaultClient);
    String namespace = "profile-eu"; // String | 
    String realmSlug = "realmSlug_example"; // String | 
    String characterName = "characterName_example"; // String | 
    try {
      CharacterProfileSummaryDTO result = apiInstance.getCharacterProfile(namespace, realmSlug, characterName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProfileCharacterProfileApi#getCharacterProfile");
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
| **realmSlug** | **String**|  | |
| **characterName** | **String**|  | |

### Return type

[**CharacterProfileSummaryDTO**](CharacterProfileSummaryDTO.md)

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

