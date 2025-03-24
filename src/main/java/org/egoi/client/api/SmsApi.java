/*
 * Marketing API
 *  # Introduction Welcome to the E-goi Marketing API! <br><br>This API enables you to integrate, automate, and manage all the marketing functionalities offered by E-goi. With it, you can interact with contact lists, send email campaigns, SMS, push notifications, and much more. <br><br>Our API is designed to simplify integration in a straightforward, efficient, and secure way, meeting the needs of developers and businesses looking to optimize their digital marketing operations. <br><br>Explore the documentation to discover all the possibilities and start creating integrations that drive your marketing results. # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.  The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.      BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Transport Layer Security (TLS) Transport Layer Security (TLS) is a widely used authentication and encryption protocol that establishes a secure communications channel for data-in-transit while ensuring that the client and server can validate one another.<br> Our API requires TLS 1.2 or TLS 1.3. We recommend <b>TLS 1.3</b>.<br><br> <b>TLS 1.3 ciphers</b> * TLS_AES_256_GCM_SHA384 (0x1302) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_CHACHA20_POLY1305_SHA256 (0x1303) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_AES_128_GCM_SHA256 (0x1301) ECDH x25519 (eq. 3072 bits RSA) FS  <b>TLS 1.2 ciphers</b> * TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 (0xc030) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 (0xc02f) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 (0x9f) DH 4096 bits FS * TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 (0x9e) DH 4096 bits FS  # Rate Limits Rate limits are used to control the amount of traffic that is allowed to flow between the client and the server.<br> This is done to prevent abuse and ensure that the API is available to all users.<br> The rate limits are applied to ensure the stability and security of our API and are based on the number of requests made in a given time period.<br> If the rate limit is exceeded, the API will return a 429 status code and the request will be rejected.<br> Each API response includes headers providing real-time rate limit information: * **X-RateLimit-Limit**: The maximum number of requests that the consumer is permitted to make in a given time period. * **X-RateLimit-Remaining**: The number of requests remaining in the current rate limit window. * **X-RateLimit-Reset**: The remaining time in seconds until the rate limit window resets.  # Account Limit The account limit is a rate limit that is applied to the account as a whole.<br> This limit is applied to all requests made by the account, regardless of the client making the request.<br> The account limit is applied to ensure that the account does not exceed the maximum number of requests allowed in a given time period. Each account has an overall usage limit per hour. If the account limit is exceeded, the API will return a 429 status code and the request will be rejected.<br> Each API response includes headers providing real-time rate limit information: * **X-Account-Limit**: The maximum number of requests that the account is permitted to make in a given time period. * **X-Account-Remaining**: The number of requests remaining in the current rate limit window. * **X-Account-Reset**: The remaining time in seconds until the rate limit window resets.   # Authentication  We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:     #!/bin/bash     curl -X GET 'https://api.egoiapp.com/my-account' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:     #!/bin/bash     curl -X POST 'http://api.egoiapp.com/tags' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>' \\     -H 'Content-Type: application/json' \\     -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB.  # Timeouts Timeouts set a maximum waiting time on a request's response. Our API, sets a default timeout for each request and when breached, you'll receive an HTTP **408 (Request Timeout)** error code. You should take into consideration that response times can vary widely based on the complexity of the request, amount of data being analyzed, and the load on the system and workspace at the time of the query. When dealing with such errors, you should first attempt to reduce the complexity and amount of data under analysis, and only then, if problems are still occurring ask for support.  For all these reasons, the default timeout for each request is **10 Seconds** and any request that creates or modifies data (**POST**, **PATCH** and **PUT**) will have a timeout of **60 Seconds**. Specific timeouts may exist for specific requests, these can be found in the request's documentation.  # Callbacks A callback is an asynchronous API request that originates from the API server and is sent to the client in response to a previous request sent by that client.  The API will make a **POST** request to the address defined in the URL with the information regarding the event of interest and share data related to that event.  <a href='/usecases/callbacks/' target='_blank'>[Go to callbacks documentation]</a>  ***Note:*** Only http or https protocols are supported in the Url parameter.  <security-definitions/>
 *
 * The version of the OpenAPI document: V3
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
import org.egoi.client.model.RequestTimeout;
import org.egoi.client.model.ServiceUnavailable;
import org.egoi.client.model.SmsCampaign;
import org.egoi.client.model.SmsCampaignPatchRequest;
import org.egoi.client.model.TooManyRequests;
import org.egoi.client.model.Unauthorized;
import org.egoi.client.model.UnprocessableEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class SmsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

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
     * Build call for actionSendSms
     * @param campaignHash Hash of the Campaign (required)
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
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call actionSendSmsCall(String campaignHash, CampaignSmsSendRequest campaignSmsSendRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = campaignSmsSendRequest;

        // create path and map variables
        String localVarPath = "/campaigns/sms/{campaign_hash}/actions/send"
            .replace("{" + "campaign_hash" + "}", localVarApiClient.escapeString(campaignHash.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return actionSendSmsCall(campaignHash, campaignSmsSendRequest, _callback);

    }

    /**
     * Send sms message
     * Deploys and sends an sms message
     * @param campaignHash Hash of the Campaign (required)
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
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public AcceptedResponse actionSendSms(String campaignHash, CampaignSmsSendRequest campaignSmsSendRequest) throws ApiException {
        ApiResponse<AcceptedResponse> localVarResp = actionSendSmsWithHttpInfo(campaignHash, campaignSmsSendRequest);
        return localVarResp.getData();
    }

    /**
     * Send sms message
     * Deploys and sends an sms message
     * @param campaignHash Hash of the Campaign (required)
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
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
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
     * @param campaignHash Hash of the Campaign (required)
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
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
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
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSmsCampaignCall(SmsCampaign smsCampaign, final ApiCallback _callback) throws ApiException {
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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSmsCampaignValidateBeforeCall(SmsCampaign smsCampaign, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'smsCampaign' is set
        if (smsCampaign == null) {
            throw new ApiException("Missing the required parameter 'smsCampaign' when calling createSmsCampaign(Async)");
        }

        return createSmsCampaignCall(smsCampaign, _callback);

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
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
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
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
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
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
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
     * @param campaignHash Hash of the Campaign (required)
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
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchSmsCampaignCall(String campaignHash, SmsCampaignPatchRequest smsCampaignPatchRequest, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = smsCampaignPatchRequest;

        // create path and map variables
        String localVarPath = "/campaigns/sms/{campaign_hash}"
            .replace("{" + "campaign_hash" + "}", localVarApiClient.escapeString(campaignHash.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
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

        return patchSmsCampaignCall(campaignHash, smsCampaignPatchRequest, _callback);

    }

    /**
     * Update a specific sms campaign
     * Update sms campaign
     * @param campaignHash Hash of the Campaign (required)
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
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public HashcodeCampaign patchSmsCampaign(String campaignHash, SmsCampaignPatchRequest smsCampaignPatchRequest) throws ApiException {
        ApiResponse<HashcodeCampaign> localVarResp = patchSmsCampaignWithHttpInfo(campaignHash, smsCampaignPatchRequest);
        return localVarResp.getData();
    }

    /**
     * Update a specific sms campaign
     * Update sms campaign
     * @param campaignHash Hash of the Campaign (required)
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
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
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
     * @param campaignHash Hash of the Campaign (required)
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
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call patchSmsCampaignAsync(String campaignHash, SmsCampaignPatchRequest smsCampaignPatchRequest, final ApiCallback<HashcodeCampaign> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchSmsCampaignValidateBeforeCall(campaignHash, smsCampaignPatchRequest, _callback);
        Type localVarReturnType = new TypeToken<HashcodeCampaign>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
