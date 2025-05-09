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


import org.egoi.client.model.CampaignsCollection;
import org.egoi.client.model.DeleteCampaignsConflict;
import org.egoi.client.model.Forbidden;
import org.egoi.client.model.InternalServerError;
import org.egoi.client.model.NotFound;
import java.time.OffsetDateTime;
import org.egoi.client.model.RequestTimeout;
import org.egoi.client.model.ServiceUnavailable;
import org.egoi.client.model.TooManyRequests;
import org.egoi.client.model.Unauthorized;
import org.egoi.client.model.UnprocessableEntity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class CampaignsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CampaignsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CampaignsApi(ApiClient apiClient) {
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
     * Build call for deleteCampaigns
     * @param campaignHash Hash of the Campaign (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCampaignsCall(String campaignHash, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/campaigns/{campaign_hash}"
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
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteCampaignsValidateBeforeCall(String campaignHash, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling deleteCampaigns(Async)");
        }

        return deleteCampaignsCall(campaignHash, _callback);

    }

    /**
     * Remove Campaign
     * Remove campaign information given its ID
     * @param campaignHash Hash of the Campaign (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public void deleteCampaigns(String campaignHash) throws ApiException {
        deleteCampaignsWithHttpInfo(campaignHash);
    }

    /**
     * Remove Campaign
     * Remove campaign information given its ID
     * @param campaignHash Hash of the Campaign (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteCampaignsWithHttpInfo(String campaignHash) throws ApiException {
        okhttp3.Call localVarCall = deleteCampaignsValidateBeforeCall(campaignHash, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove Campaign (asynchronously)
     * Remove campaign information given its ID
     * @param campaignHash Hash of the Campaign (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Conflict </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCampaignsAsync(String campaignHash, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteCampaignsValidateBeforeCall(campaignHash, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllCampaigns
     * @param channel Channel of the campaign (optional)
     * @param campaignHash Hash of the campaign (optional)
     * @param listId ID of the list where the campaign belongs (optional)
     * @param status Status of the campaign (optional)
     * @param internalName Internal name of the campaign (optional)
     * @param createdBy ID of the user who created the campaign (optional)
     * @param groupId ID of the group where the campaign belongs (optional)
     * @param createdMin Created initial date (optional)
     * @param createdMax Created finish (optional)
     * @param updatedMin Updated initial (optional)
     * @param updatedMax Updated finish (optional)
     * @param startDateMin Start date initial (optional)
     * @param startDateMax Start date finish (optional)
     * @param endDateMin End Date initial (optional)
     * @param endDateMax End Date finish (optional)
     * @param scheduleDateMin Schedule Date initial (optional)
     * @param scheduleDateMax Schedule Date finish (optional)
     * @param offset Element offset (starting at zero for the first element) (optional)
     * @param limit Number of items to return (optional, default to 100)
     * @param order Type of order (optional, default to desc)
     * @param orderBy Reference attribute to order campaigns (optional, default to created)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllCampaignsCall(String channel, String campaignHash, Integer listId, String status, String internalName, Integer createdBy, Integer groupId, OffsetDateTime createdMin, OffsetDateTime createdMax, OffsetDateTime updatedMin, OffsetDateTime updatedMax, OffsetDateTime startDateMin, OffsetDateTime startDateMax, OffsetDateTime endDateMin, OffsetDateTime endDateMax, OffsetDateTime scheduleDateMin, OffsetDateTime scheduleDateMax, Integer offset, Integer limit, String order, String orderBy, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/campaigns";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (channel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("channel", channel));
        }

        if (campaignHash != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("campaign_hash", campaignHash));
        }

        if (listId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("list_id", listId));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (internalName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("internal_name", internalName));
        }

        if (createdBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_by", createdBy));
        }

        if (groupId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("group_id", groupId));
        }

        if (createdMin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_min", createdMin));
        }

        if (createdMax != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("created_max", createdMax));
        }

        if (updatedMin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("updated_min", updatedMin));
        }

        if (updatedMax != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("updated_max", updatedMax));
        }

        if (startDateMin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date_min", startDateMin));
        }

        if (startDateMax != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date_max", startDateMax));
        }

        if (endDateMin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date_min", endDateMin));
        }

        if (endDateMax != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date_max", endDateMax));
        }

        if (scheduleDateMin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("schedule_date_min", scheduleDateMin));
        }

        if (scheduleDateMax != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("schedule_date_max", scheduleDateMax));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (order != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order", order));
        }

        if (orderBy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by", orderBy));
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

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllCampaignsValidateBeforeCall(String channel, String campaignHash, Integer listId, String status, String internalName, Integer createdBy, Integer groupId, OffsetDateTime createdMin, OffsetDateTime createdMax, OffsetDateTime updatedMin, OffsetDateTime updatedMax, OffsetDateTime startDateMin, OffsetDateTime startDateMax, OffsetDateTime endDateMin, OffsetDateTime endDateMax, OffsetDateTime scheduleDateMin, OffsetDateTime scheduleDateMax, Integer offset, Integer limit, String order, String orderBy, final ApiCallback _callback) throws ApiException {
        return getAllCampaignsCall(channel, campaignHash, listId, status, internalName, createdBy, groupId, createdMin, createdMax, updatedMin, updatedMax, startDateMin, startDateMax, endDateMin, endDateMax, scheduleDateMin, scheduleDateMax, offset, limit, order, orderBy, _callback);

    }

    /**
     * Get all Campaigns
     * Returns all campaigns
     * @param channel Channel of the campaign (optional)
     * @param campaignHash Hash of the campaign (optional)
     * @param listId ID of the list where the campaign belongs (optional)
     * @param status Status of the campaign (optional)
     * @param internalName Internal name of the campaign (optional)
     * @param createdBy ID of the user who created the campaign (optional)
     * @param groupId ID of the group where the campaign belongs (optional)
     * @param createdMin Created initial date (optional)
     * @param createdMax Created finish (optional)
     * @param updatedMin Updated initial (optional)
     * @param updatedMax Updated finish (optional)
     * @param startDateMin Start date initial (optional)
     * @param startDateMax Start date finish (optional)
     * @param endDateMin End Date initial (optional)
     * @param endDateMax End Date finish (optional)
     * @param scheduleDateMin Schedule Date initial (optional)
     * @param scheduleDateMax Schedule Date finish (optional)
     * @param offset Element offset (starting at zero for the first element) (optional)
     * @param limit Number of items to return (optional, default to 100)
     * @param order Type of order (optional, default to desc)
     * @param orderBy Reference attribute to order campaigns (optional, default to created)
     * @return CampaignsCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public CampaignsCollection getAllCampaigns(String channel, String campaignHash, Integer listId, String status, String internalName, Integer createdBy, Integer groupId, OffsetDateTime createdMin, OffsetDateTime createdMax, OffsetDateTime updatedMin, OffsetDateTime updatedMax, OffsetDateTime startDateMin, OffsetDateTime startDateMax, OffsetDateTime endDateMin, OffsetDateTime endDateMax, OffsetDateTime scheduleDateMin, OffsetDateTime scheduleDateMax, Integer offset, Integer limit, String order, String orderBy) throws ApiException {
        ApiResponse<CampaignsCollection> localVarResp = getAllCampaignsWithHttpInfo(channel, campaignHash, listId, status, internalName, createdBy, groupId, createdMin, createdMax, updatedMin, updatedMax, startDateMin, startDateMax, endDateMin, endDateMax, scheduleDateMin, scheduleDateMax, offset, limit, order, orderBy);
        return localVarResp.getData();
    }

    /**
     * Get all Campaigns
     * Returns all campaigns
     * @param channel Channel of the campaign (optional)
     * @param campaignHash Hash of the campaign (optional)
     * @param listId ID of the list where the campaign belongs (optional)
     * @param status Status of the campaign (optional)
     * @param internalName Internal name of the campaign (optional)
     * @param createdBy ID of the user who created the campaign (optional)
     * @param groupId ID of the group where the campaign belongs (optional)
     * @param createdMin Created initial date (optional)
     * @param createdMax Created finish (optional)
     * @param updatedMin Updated initial (optional)
     * @param updatedMax Updated finish (optional)
     * @param startDateMin Start date initial (optional)
     * @param startDateMax Start date finish (optional)
     * @param endDateMin End Date initial (optional)
     * @param endDateMax End Date finish (optional)
     * @param scheduleDateMin Schedule Date initial (optional)
     * @param scheduleDateMax Schedule Date finish (optional)
     * @param offset Element offset (starting at zero for the first element) (optional)
     * @param limit Number of items to return (optional, default to 100)
     * @param order Type of order (optional, default to desc)
     * @param orderBy Reference attribute to order campaigns (optional, default to created)
     * @return ApiResponse&lt;CampaignsCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CampaignsCollection> getAllCampaignsWithHttpInfo(String channel, String campaignHash, Integer listId, String status, String internalName, Integer createdBy, Integer groupId, OffsetDateTime createdMin, OffsetDateTime createdMax, OffsetDateTime updatedMin, OffsetDateTime updatedMax, OffsetDateTime startDateMin, OffsetDateTime startDateMax, OffsetDateTime endDateMin, OffsetDateTime endDateMax, OffsetDateTime scheduleDateMin, OffsetDateTime scheduleDateMax, Integer offset, Integer limit, String order, String orderBy) throws ApiException {
        okhttp3.Call localVarCall = getAllCampaignsValidateBeforeCall(channel, campaignHash, listId, status, internalName, createdBy, groupId, createdMin, createdMax, updatedMin, updatedMax, startDateMin, startDateMax, endDateMin, endDateMax, scheduleDateMin, scheduleDateMax, offset, limit, order, orderBy, null);
        Type localVarReturnType = new TypeToken<CampaignsCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all Campaigns (asynchronously)
     * Returns all campaigns
     * @param channel Channel of the campaign (optional)
     * @param campaignHash Hash of the campaign (optional)
     * @param listId ID of the list where the campaign belongs (optional)
     * @param status Status of the campaign (optional)
     * @param internalName Internal name of the campaign (optional)
     * @param createdBy ID of the user who created the campaign (optional)
     * @param groupId ID of the group where the campaign belongs (optional)
     * @param createdMin Created initial date (optional)
     * @param createdMax Created finish (optional)
     * @param updatedMin Updated initial (optional)
     * @param updatedMax Updated finish (optional)
     * @param startDateMin Start date initial (optional)
     * @param startDateMax Start date finish (optional)
     * @param endDateMin End Date initial (optional)
     * @param endDateMax End Date finish (optional)
     * @param scheduleDateMin Schedule Date initial (optional)
     * @param scheduleDateMax Schedule Date finish (optional)
     * @param offset Element offset (starting at zero for the first element) (optional)
     * @param limit Number of items to return (optional, default to 100)
     * @param order Type of order (optional, default to desc)
     * @param orderBy Reference attribute to order campaigns (optional, default to created)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllCampaignsAsync(String channel, String campaignHash, Integer listId, String status, String internalName, Integer createdBy, Integer groupId, OffsetDateTime createdMin, OffsetDateTime createdMax, OffsetDateTime updatedMin, OffsetDateTime updatedMax, OffsetDateTime startDateMin, OffsetDateTime startDateMax, OffsetDateTime endDateMin, OffsetDateTime endDateMax, OffsetDateTime scheduleDateMin, OffsetDateTime scheduleDateMax, Integer offset, Integer limit, String order, String orderBy, final ApiCallback<CampaignsCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllCampaignsValidateBeforeCall(channel, campaignHash, listId, status, internalName, createdBy, groupId, createdMin, createdMax, updatedMin, updatedMax, startDateMin, startDateMax, endDateMin, endDateMax, scheduleDateMin, scheduleDateMax, offset, limit, order, orderBy, _callback);
        Type localVarReturnType = new TypeToken<CampaignsCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
