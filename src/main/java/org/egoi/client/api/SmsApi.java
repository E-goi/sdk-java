/*
 * APIv3 (Beta)
 *  # Introduction Just a quick peek!!! This is our new version of API. Remember, it is not stable yet!!! But we invite you play with it and give us your feedback ;) # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services. * <b><a href='https://github.com/E-goi/sdk-java'>Java</a></b> * <b><a href='https://github.com/E-goi/sdk-php'>PHP</a></b> * <b><a href='https://github.com/E-goi/sdk-python'>Python</a></b>  <security-definitions/>
 *
 * The version of the OpenAPI document: 3.0.0-beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.egoi.client.api;

import org.egoi.client.ApiCallback;
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.ApiResponse;
import org.egoi.client.Configuration;
import org.egoi.client.Pair;
import org.egoi.client.ProgressRequestBody;
import org.egoi.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.egoi.client.model.AcceptedResponse;
import org.egoi.client.model.BadRequest;
import org.egoi.client.model.CampaignSmsSendRequest;
import org.egoi.client.model.Forbidden;
import org.egoi.client.model.HashcodeCampaign;
import org.egoi.client.model.InternalServerError;
import org.egoi.client.model.NotFound;
import org.egoi.client.model.SmsCampaign;
import org.egoi.client.model.SmsCampaignPatchRequest;
import org.egoi.client.model.Unauthorized;
import org.egoi.client.model.UnprocessableEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmsApi {
    private ApiClient localVarApiClient;

    public SmsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SmsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for actionSendSms
     * @param campaignHash ID of the Campaign (required)
     * @param campaignSmsSendRequest Parameters for the &#39;send sms&#39; action (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call actionSendSmsCall(String campaignHash, CampaignSmsSendRequest campaignSmsSendRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = campaignSmsSendRequest;

        // create path and map variables
        String localVarPath = "/campaigns/sms/{campaign_hash}/actions/send"
            .replaceAll("\\{" + "campaign_hash" + "\\}", localVarApiClient.escapeString(campaignHash.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call actionSendSmsValidateBeforeCall(String campaignHash, CampaignSmsSendRequest campaignSmsSendRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling actionSendSms(Async)");
        }
        
        // verify the required parameter 'campaignSmsSendRequest' is set
        if (campaignSmsSendRequest == null) {
            throw new ApiException("Missing the required parameter 'campaignSmsSendRequest' when calling actionSendSms(Async)");
        }
        

        okhttp3.Call localVarCall = actionSendSmsCall(campaignHash, campaignSmsSendRequest, _callback);
        return localVarCall;

    }

    /**
     * Send sms message
     * Deploys and sends an sms message
     * @param campaignHash ID of the Campaign (required)
     * @param campaignSmsSendRequest Parameters for the &#39;send sms&#39; action (required)
     * @return AcceptedResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public AcceptedResponse actionSendSms(String campaignHash, CampaignSmsSendRequest campaignSmsSendRequest) throws ApiException {
        ApiResponse<AcceptedResponse> localVarResp = actionSendSmsWithHttpInfo(campaignHash, campaignSmsSendRequest);
        return localVarResp.getData();
    }

    /**
     * Send sms message
     * Deploys and sends an sms message
     * @param campaignHash ID of the Campaign (required)
     * @param campaignSmsSendRequest Parameters for the &#39;send sms&#39; action (required)
     * @return ApiResponse&lt;AcceptedResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AcceptedResponse> actionSendSmsWithHttpInfo(String campaignHash, CampaignSmsSendRequest campaignSmsSendRequest) throws ApiException {
        okhttp3.Call localVarCall = actionSendSmsValidateBeforeCall(campaignHash, campaignSmsSendRequest, null);
        Type localVarReturnType = new TypeToken<AcceptedResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Send sms message (asynchronously)
     * Deploys and sends an sms message
     * @param campaignHash ID of the Campaign (required)
     * @param campaignSmsSendRequest Parameters for the &#39;send sms&#39; action (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 202 </td><td> Accepted </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call actionSendSmsAsync(String campaignHash, CampaignSmsSendRequest campaignSmsSendRequest, final ApiCallback<AcceptedResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = actionSendSmsValidateBeforeCall(campaignHash, campaignSmsSendRequest, _callback);
        Type localVarReturnType = new TypeToken<AcceptedResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createSmsCampaign
     * @param smsCampaign Parameters for the Sms Campaign (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSmsCampaignCall(SmsCampaign smsCampaign, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = smsCampaign;

        // create path and map variables
        String localVarPath = "/campaigns/sms";

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSmsCampaignValidateBeforeCall(SmsCampaign smsCampaign, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'smsCampaign' is set
        if (smsCampaign == null) {
            throw new ApiException("Missing the required parameter 'smsCampaign' when calling createSmsCampaign(Async)");
        }
        

        okhttp3.Call localVarCall = createSmsCampaignCall(smsCampaign, _callback);
        return localVarCall;

    }

    /**
     * Create new sms campaign
     * Create a new sms campaign
     * @param smsCampaign Parameters for the Sms Campaign (required)
     * @return HashcodeCampaign
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public HashcodeCampaign createSmsCampaign(SmsCampaign smsCampaign) throws ApiException {
        ApiResponse<HashcodeCampaign> localVarResp = createSmsCampaignWithHttpInfo(smsCampaign);
        return localVarResp.getData();
    }

    /**
     * Create new sms campaign
     * Create a new sms campaign
     * @param smsCampaign Parameters for the Sms Campaign (required)
     * @return ApiResponse&lt;HashcodeCampaign&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HashcodeCampaign> createSmsCampaignWithHttpInfo(SmsCampaign smsCampaign) throws ApiException {
        okhttp3.Call localVarCall = createSmsCampaignValidateBeforeCall(smsCampaign, null);
        Type localVarReturnType = new TypeToken<HashcodeCampaign>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create new sms campaign (asynchronously)
     * Create a new sms campaign
     * @param smsCampaign Parameters for the Sms Campaign (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSmsCampaignAsync(SmsCampaign smsCampaign, final ApiCallback<HashcodeCampaign> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSmsCampaignValidateBeforeCall(smsCampaign, _callback);
        Type localVarReturnType = new TypeToken<HashcodeCampaign>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchSmsCampaign
     * @param campaignHash ID of the Campaign (required)
     * @param smsCampaignPatchRequest Parameters for the Sms Campaign (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchSmsCampaignCall(String campaignHash, SmsCampaignPatchRequest smsCampaignPatchRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = smsCampaignPatchRequest;

        // create path and map variables
        String localVarPath = "/campaigns/sms/{campaign_hash}"
            .replaceAll("\\{" + "campaign_hash" + "\\}", localVarApiClient.escapeString(campaignHash.toString()));

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
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call patchSmsCampaignValidateBeforeCall(String campaignHash, SmsCampaignPatchRequest smsCampaignPatchRequest, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling patchSmsCampaign(Async)");
        }
        
        // verify the required parameter 'smsCampaignPatchRequest' is set
        if (smsCampaignPatchRequest == null) {
            throw new ApiException("Missing the required parameter 'smsCampaignPatchRequest' when calling patchSmsCampaign(Async)");
        }
        

        okhttp3.Call localVarCall = patchSmsCampaignCall(campaignHash, smsCampaignPatchRequest, _callback);
        return localVarCall;

    }

    /**
     * Update a specific sms campaign
     * Update sms campaign
     * @param campaignHash ID of the Campaign (required)
     * @param smsCampaignPatchRequest Parameters for the Sms Campaign (required)
     * @return HashcodeCampaign
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public HashcodeCampaign patchSmsCampaign(String campaignHash, SmsCampaignPatchRequest smsCampaignPatchRequest) throws ApiException {
        ApiResponse<HashcodeCampaign> localVarResp = patchSmsCampaignWithHttpInfo(campaignHash, smsCampaignPatchRequest);
        return localVarResp.getData();
    }

    /**
     * Update a specific sms campaign
     * Update sms campaign
     * @param campaignHash ID of the Campaign (required)
     * @param smsCampaignPatchRequest Parameters for the Sms Campaign (required)
     * @return ApiResponse&lt;HashcodeCampaign&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<HashcodeCampaign> patchSmsCampaignWithHttpInfo(String campaignHash, SmsCampaignPatchRequest smsCampaignPatchRequest) throws ApiException {
        okhttp3.Call localVarCall = patchSmsCampaignValidateBeforeCall(campaignHash, smsCampaignPatchRequest, null);
        Type localVarReturnType = new TypeToken<HashcodeCampaign>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update a specific sms campaign (asynchronously)
     * Update sms campaign
     * @param campaignHash ID of the Campaign (required)
     * @param smsCampaignPatchRequest Parameters for the Sms Campaign (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchSmsCampaignAsync(String campaignHash, SmsCampaignPatchRequest smsCampaignPatchRequest, final ApiCallback<HashcodeCampaign> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchSmsCampaignValidateBeforeCall(campaignHash, smsCampaignPatchRequest, _callback);
        Type localVarReturnType = new TypeToken<HashcodeCampaign>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
