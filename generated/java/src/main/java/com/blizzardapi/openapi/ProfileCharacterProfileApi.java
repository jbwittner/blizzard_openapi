/*
 * Blizzard API
 * OpenAPI specification for Blizzard API
 *
 * The version of the OpenAPI document: 0.4.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.blizzardapi.openapi;

import com.blizzardapi.ApiCallback;
import com.blizzardapi.ApiClient;
import com.blizzardapi.ApiException;
import com.blizzardapi.ApiResponse;
import com.blizzardapi.Configuration;
import com.blizzardapi.Pair;
import com.blizzardapi.ProgressRequestBody;
import com.blizzardapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.blizzardapi.openapi.model.ApiErrorDTO;
import com.blizzardapi.openapi.model.CharacterProfileSummaryDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProfileCharacterProfileApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProfileCharacterProfileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProfileCharacterProfileApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getCharacterProfile
     * @param namespace  (required)
     * @param realmSlug  (required)
     * @param characterName  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCharacterProfileCall(String namespace, String realmSlug, String characterName, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/profile/wow/character/{realmSlug}/{characterName}"
            .replace("{" + "realmSlug" + "}", localVarApiClient.escapeString(realmSlug.toString()))
            .replace("{" + "characterName" + "}", localVarApiClient.escapeString(characterName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "accessToken" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCharacterProfileValidateBeforeCall(String namespace, String realmSlug, String characterName, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getCharacterProfile(Async)");
        }

        // verify the required parameter 'realmSlug' is set
        if (realmSlug == null) {
            throw new ApiException("Missing the required parameter 'realmSlug' when calling getCharacterProfile(Async)");
        }

        // verify the required parameter 'characterName' is set
        if (characterName == null) {
            throw new ApiException("Missing the required parameter 'characterName' when calling getCharacterProfile(Async)");
        }

        return getCharacterProfileCall(namespace, realmSlug, characterName, _callback);

    }

    /**
     * Returns a profile summary for a character.
     * 
     * @param namespace  (required)
     * @param realmSlug  (required)
     * @param characterName  (required)
     * @return CharacterProfileSummaryDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public CharacterProfileSummaryDTO getCharacterProfile(String namespace, String realmSlug, String characterName) throws ApiException {
        ApiResponse<CharacterProfileSummaryDTO> localVarResp = getCharacterProfileWithHttpInfo(namespace, realmSlug, characterName);
        return localVarResp.getData();
    }

    /**
     * Returns a profile summary for a character.
     * 
     * @param namespace  (required)
     * @param realmSlug  (required)
     * @param characterName  (required)
     * @return ApiResponse&lt;CharacterProfileSummaryDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CharacterProfileSummaryDTO> getCharacterProfileWithHttpInfo(String namespace, String realmSlug, String characterName) throws ApiException {
        okhttp3.Call localVarCall = getCharacterProfileValidateBeforeCall(namespace, realmSlug, characterName, null);
        Type localVarReturnType = new TypeToken<CharacterProfileSummaryDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a profile summary for a character. (asynchronously)
     * 
     * @param namespace  (required)
     * @param realmSlug  (required)
     * @param characterName  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCharacterProfileAsync(String namespace, String realmSlug, String characterName, final ApiCallback<CharacterProfileSummaryDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCharacterProfileValidateBeforeCall(namespace, realmSlug, characterName, _callback);
        Type localVarReturnType = new TypeToken<CharacterProfileSummaryDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
