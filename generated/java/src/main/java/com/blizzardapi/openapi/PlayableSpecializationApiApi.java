/*
 * Blizzard API
 * An OpenAPI specification for Blizzard API
 *
 * The version of the OpenAPI document: 0.2.1
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
import com.blizzardapi.openapi.model.PlayableSpecializationDetailsDTO;
import com.blizzardapi.openapi.model.PlayableSpecializationIndexDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayableSpecializationApiApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PlayableSpecializationApiApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlayableSpecializationApiApi(ApiClient apiClient) {
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
     * Build call for getPlayableSpecialization
     * @param namespace  (required)
     * @param specId  (required)
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
    public okhttp3.Call getPlayableSpecializationCall(String namespace, Integer specId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/data/wow/playable-specialization/{specId}"
            .replace("{" + "specId" + "}", localVarApiClient.escapeString(specId.toString()));

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
    private okhttp3.Call getPlayableSpecializationValidateBeforeCall(String namespace, Integer specId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getPlayableSpecialization(Async)");
        }

        // verify the required parameter 'specId' is set
        if (specId == null) {
            throw new ApiException("Missing the required parameter 'specId' when calling getPlayableSpecialization(Async)");
        }

        return getPlayableSpecializationCall(namespace, specId, _callback);

    }

    /**
     * Returns a playable race by ID.
     * 
     * @param namespace  (required)
     * @param specId  (required)
     * @return PlayableSpecializationDetailsDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public PlayableSpecializationDetailsDTO getPlayableSpecialization(String namespace, Integer specId) throws ApiException {
        ApiResponse<PlayableSpecializationDetailsDTO> localVarResp = getPlayableSpecializationWithHttpInfo(namespace, specId);
        return localVarResp.getData();
    }

    /**
     * Returns a playable race by ID.
     * 
     * @param namespace  (required)
     * @param specId  (required)
     * @return ApiResponse&lt;PlayableSpecializationDetailsDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayableSpecializationDetailsDTO> getPlayableSpecializationWithHttpInfo(String namespace, Integer specId) throws ApiException {
        okhttp3.Call localVarCall = getPlayableSpecializationValidateBeforeCall(namespace, specId, null);
        Type localVarReturnType = new TypeToken<PlayableSpecializationDetailsDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns a playable race by ID. (asynchronously)
     * 
     * @param namespace  (required)
     * @param specId  (required)
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
    public okhttp3.Call getPlayableSpecializationAsync(String namespace, Integer specId, final ApiCallback<PlayableSpecializationDetailsDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayableSpecializationValidateBeforeCall(namespace, specId, _callback);
        Type localVarReturnType = new TypeToken<PlayableSpecializationDetailsDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPlayableSpecializationsIndex
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
    public okhttp3.Call getPlayableSpecializationsIndexCall(String namespace, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/data/wow/playable-specialization/index";

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
    private okhttp3.Call getPlayableSpecializationsIndexValidateBeforeCall(String namespace, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getPlayableSpecializationsIndex(Async)");
        }

        return getPlayableSpecializationsIndexCall(namespace, _callback);

    }

    /**
     * Returns an index of playable specializations.
     * 
     * @param namespace  (required)
     * @return PlayableSpecializationIndexDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public PlayableSpecializationIndexDTO getPlayableSpecializationsIndex(String namespace) throws ApiException {
        ApiResponse<PlayableSpecializationIndexDTO> localVarResp = getPlayableSpecializationsIndexWithHttpInfo(namespace);
        return localVarResp.getData();
    }

    /**
     * Returns an index of playable specializations.
     * 
     * @param namespace  (required)
     * @return ApiResponse&lt;PlayableSpecializationIndexDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Http 200 </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Http 4XX </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayableSpecializationIndexDTO> getPlayableSpecializationsIndexWithHttpInfo(String namespace) throws ApiException {
        okhttp3.Call localVarCall = getPlayableSpecializationsIndexValidateBeforeCall(namespace, null);
        Type localVarReturnType = new TypeToken<PlayableSpecializationIndexDTO>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Returns an index of playable specializations. (asynchronously)
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
    public okhttp3.Call getPlayableSpecializationsIndexAsync(String namespace, final ApiCallback<PlayableSpecializationIndexDTO> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayableSpecializationsIndexValidateBeforeCall(namespace, _callback);
        Type localVarReturnType = new TypeToken<PlayableSpecializationIndexDTO>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
