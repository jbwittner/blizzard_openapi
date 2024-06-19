/*
 * Blizzard API
 * An OpenAPI specification for Blizzard API
 *
 * The version of the OpenAPI document: 0.4.0
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
import com.blizzardapi.openapi.model.PlayableClassDetailsDTO;
import com.blizzardapi.openapi.model.PlayableClassesIndexDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameDataPlayableClassApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GameDataPlayableClassApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GameDataPlayableClassApi(ApiClient apiClient) {
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
     * Build call for getPlayableClass
     * @param namespace  (required)
     * @param classId  (required)
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
    public okhttp3.Call getPlayableClassCall(String namespace, Integer classId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/data/wow/playable-class/{classId}"
            .replace("{" + "classId" + "}", localVarApiClient.escapeString(classId.toString()));

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
    private okhttp3.Call getPlayableClassValidateBeforeCall(String namespace, Integer classId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getPlayableClass(Async)");
        }

        // verify the required parameter 'classId' is set
        if (classId == null) {
            throw new ApiException("Missing the required parameter 'classId' when calling getPlayableClass(Async)");
        }

        return getPlayableClassCall(namespace, classId, _callback);

    }

    /**
     * Returns a playable class by ID.
     * 
     * @param namespace  (required)
     * @param classId  (required)
     * @return PlayableClassDetailsDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public PlayableClassDetailsDTO getPlayableClass(String namespace, Integer classId) throws ApiException {
        ApiResponse<PlayableClassDetailsDTO> localVarResp = getPlayableClassWithHttpInfo(namespace, classId);
        return localVarResp.getData();
    }

    /**
     * Returns a playable class by ID.
     * 
     * @param namespace  (required)
     * @param classId  (required)
     * @return ApiResponse&lt;PlayableClassDetailsDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayableClassDetailsDTO> getPlayableClassWithHttpInfo(String namespace, Integer classId) throws ApiException {
        okhttp3.Call localVarCall = getPlayableClassValidateBeforeCall(namespace, classId, null);
        Type localVarReturnType = new TypeToken<PlayableClassDetailsDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a playable class by ID. (asynchronously)
     * 
     * @param namespace  (required)
     * @param classId  (required)
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
    public okhttp3.Call getPlayableClassAsync(String namespace, Integer classId, final ApiCallback<PlayableClassDetailsDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayableClassValidateBeforeCall(namespace, classId, _callback);
        Type localVarReturnType = new TypeToken<PlayableClassDetailsDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPlayableClassesIndex
     * @param namespace  (required)
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
    public okhttp3.Call getPlayableClassesIndexCall(String namespace, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/data/wow/playable-class/index";

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
    private okhttp3.Call getPlayableClassesIndexValidateBeforeCall(String namespace, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getPlayableClassesIndex(Async)");
        }

        return getPlayableClassesIndexCall(namespace, _callback);

    }

    /**
     * Returns an index of playable class.
     * 
     * @param namespace  (required)
     * @return PlayableClassesIndexDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public PlayableClassesIndexDTO getPlayableClassesIndex(String namespace) throws ApiException {
        ApiResponse<PlayableClassesIndexDTO> localVarResp = getPlayableClassesIndexWithHttpInfo(namespace);
        return localVarResp.getData();
    }

    /**
     * Returns an index of playable class.
     * 
     * @param namespace  (required)
     * @return ApiResponse&lt;PlayableClassesIndexDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayableClassesIndexDTO> getPlayableClassesIndexWithHttpInfo(String namespace) throws ApiException {
        okhttp3.Call localVarCall = getPlayableClassesIndexValidateBeforeCall(namespace, null);
        Type localVarReturnType = new TypeToken<PlayableClassesIndexDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns an index of playable class. (asynchronously)
     * 
     * @param namespace  (required)
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
    public okhttp3.Call getPlayableClassesIndexAsync(String namespace, final ApiCallback<PlayableClassesIndexDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayableClassesIndexValidateBeforeCall(namespace, _callback);
        Type localVarReturnType = new TypeToken<PlayableClassesIndexDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
