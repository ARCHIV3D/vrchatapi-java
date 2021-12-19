/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.5
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.api;

import io.github.vrchatapi.ApiCallback;
import io.github.vrchatapi.ApiClient;
import io.github.vrchatapi.ApiException;
import io.github.vrchatapi.ApiResponse;
import io.github.vrchatapi.Configuration;
import io.github.vrchatapi.Pair;
import io.github.vrchatapi.ProgressRequestBody;
import io.github.vrchatapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.vrchatapi.model.Error;
import io.github.vrchatapi.model.Instance;
import io.github.vrchatapi.model.Success;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstancesApi {
    private ApiClient localVarApiClient;

    public InstancesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InstancesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getInstance
     * @param worldId  (required)
     * @param instanceId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Instance object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstanceCall(String worldId, String instanceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/instances/{worldId}:{instanceId}"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()))
            .replaceAll("\\{" + "instanceId" + "\\}", localVarApiClient.escapeString(instanceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyCookie", "authCookie" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getInstanceValidateBeforeCall(String worldId, String instanceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling getInstance(Async)");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new ApiException("Missing the required parameter 'instanceId' when calling getInstance(Async)");
        }
        

        okhttp3.Call localVarCall = getInstanceCall(worldId, instanceId, _callback);
        return localVarCall;

    }

    /**
     * Get Instance
     * Returns an instance. Please read [Instances Tutorial](https://vrchatapi.github.io/tutorials/instances/) for more information on Instances.  If an invalid instanceId is provided, this endpoint will simply return \&quot;null\&quot;!
     * @param worldId  (required)
     * @param instanceId  (required)
     * @return Instance
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Instance object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Instance getInstance(String worldId, String instanceId) throws ApiException {
        ApiResponse<Instance> localVarResp = getInstanceWithHttpInfo(worldId, instanceId);
        return localVarResp.getData();
    }

    /**
     * Get Instance
     * Returns an instance. Please read [Instances Tutorial](https://vrchatapi.github.io/tutorials/instances/) for more information on Instances.  If an invalid instanceId is provided, this endpoint will simply return \&quot;null\&quot;!
     * @param worldId  (required)
     * @param instanceId  (required)
     * @return ApiResponse&lt;Instance&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Instance object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Instance> getInstanceWithHttpInfo(String worldId, String instanceId) throws ApiException {
        okhttp3.Call localVarCall = getInstanceValidateBeforeCall(worldId, instanceId, null);
        Type localVarReturnType = new TypeToken<Instance>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Instance (asynchronously)
     * Returns an instance. Please read [Instances Tutorial](https://vrchatapi.github.io/tutorials/instances/) for more information on Instances.  If an invalid instanceId is provided, this endpoint will simply return \&quot;null\&quot;!
     * @param worldId  (required)
     * @param instanceId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns a single Instance object. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getInstanceAsync(String worldId, String instanceId, final ApiCallback<Instance> _callback) throws ApiException {

        okhttp3.Call localVarCall = getInstanceValidateBeforeCall(worldId, instanceId, _callback);
        Type localVarReturnType = new TypeToken<Instance>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getShortName
     * @param worldId  (required)
     * @param instanceId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns an instance short name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getShortNameCall(String worldId, String instanceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/instances/{worldId}:{instanceId}/shortName"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()))
            .replaceAll("\\{" + "instanceId" + "\\}", localVarApiClient.escapeString(instanceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyCookie", "authCookie" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getShortNameValidateBeforeCall(String worldId, String instanceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling getShortName(Async)");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new ApiException("Missing the required parameter 'instanceId' when calling getShortName(Async)");
        }
        

        okhttp3.Call localVarCall = getShortNameCall(worldId, instanceId, _callback);
        return localVarCall;

    }

    /**
     * Get Instance Short Name
     * Returns an instance short name.
     * @param worldId  (required)
     * @param instanceId  (required)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns an instance short name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public String getShortName(String worldId, String instanceId) throws ApiException {
        ApiResponse<String> localVarResp = getShortNameWithHttpInfo(worldId, instanceId);
        return localVarResp.getData();
    }

    /**
     * Get Instance Short Name
     * Returns an instance short name.
     * @param worldId  (required)
     * @param instanceId  (required)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns an instance short name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<String> getShortNameWithHttpInfo(String worldId, String instanceId) throws ApiException {
        okhttp3.Call localVarCall = getShortNameValidateBeforeCall(worldId, instanceId, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Instance Short Name (asynchronously)
     * Returns an instance short name.
     * @param worldId  (required)
     * @param instanceId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returns an instance short name. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getShortNameAsync(String worldId, String instanceId, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getShortNameValidateBeforeCall(worldId, instanceId, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for sendSelfInvite
     * @param worldId  (required)
     * @param instanceId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after sending an invite to yourself to the instance. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendSelfInviteCall(String worldId, String instanceId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/instances/{worldId}:{instanceId}/invite"
            .replaceAll("\\{" + "worldId" + "\\}", localVarApiClient.escapeString(worldId.toString()))
            .replaceAll("\\{" + "instanceId" + "\\}", localVarApiClient.escapeString(instanceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "apiKeyCookie", "authCookie" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call sendSelfInviteValidateBeforeCall(String worldId, String instanceId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'worldId' is set
        if (worldId == null) {
            throw new ApiException("Missing the required parameter 'worldId' when calling sendSelfInvite(Async)");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new ApiException("Missing the required parameter 'instanceId' when calling sendSelfInvite(Async)");
        }
        

        okhttp3.Call localVarCall = sendSelfInviteCall(worldId, instanceId, _callback);
        return localVarCall;

    }

    /**
     * Send Self Invite
     * Sends an invite to the instance to yourself.
     * @param worldId  (required)
     * @param instanceId  (required)
     * @return Success
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after sending an invite to yourself to the instance. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public Success sendSelfInvite(String worldId, String instanceId) throws ApiException {
        ApiResponse<Success> localVarResp = sendSelfInviteWithHttpInfo(worldId, instanceId);
        return localVarResp.getData();
    }

    /**
     * Send Self Invite
     * Sends an invite to the instance to yourself.
     * @param worldId  (required)
     * @param instanceId  (required)
     * @return ApiResponse&lt;Success&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after sending an invite to yourself to the instance. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Success> sendSelfInviteWithHttpInfo(String worldId, String instanceId) throws ApiException {
        okhttp3.Call localVarCall = sendSelfInviteValidateBeforeCall(worldId, instanceId, null);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send Self Invite (asynchronously)
     * Sends an invite to the instance to yourself.
     * @param worldId  (required)
     * @param instanceId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success response after sending an invite to yourself to the instance. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Error response due to missing apiKey or auth cookie. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call sendSelfInviteAsync(String worldId, String instanceId, final ApiCallback<Success> _callback) throws ApiException {

        okhttp3.Call localVarCall = sendSelfInviteValidateBeforeCall(worldId, instanceId, _callback);
        Type localVarReturnType = new TypeToken<Success>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}