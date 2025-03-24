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


import org.egoi.client.model.EmailReport;
import org.egoi.client.model.Forbidden;
import org.egoi.client.model.InternalServerError;
import org.egoi.client.model.NotFound;
import org.egoi.client.model.PhoneReport;
import org.egoi.client.model.PushReport;
import org.egoi.client.model.RequestTimeout;
import org.egoi.client.model.ServiceUnavailable;
import org.egoi.client.model.TooManyRequests;
import org.egoi.client.model.Unauthorized;
import org.egoi.client.model.UnprocessableEntity;
import org.egoi.client.model.WebPushReport;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ReportsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportsApi(ApiClient apiClient) {
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
     * Build call for getEmailReport
     * @param campaignHash Hash of the Campaign (required)
     * @param date True to show date stats (optional, default to true)
     * @param weekday True to show weekday stats (optional, default to true)
     * @param hour True to show hour stats (optional, default to true)
     * @param location True to show location stats (optional, default to true)
     * @param domain True to show Domain stats (optional, default to true)
     * @param url True to show Url stats (optional, default to true)
     * @param reader True to show Reader stats (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEmailReportCall(String campaignHash, Boolean date, Boolean weekday, Boolean hour, Boolean location, Boolean domain, Boolean url, Boolean reader, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/reports/email/{campaign_hash}"
            .replace("{" + "campaign_hash" + "}", localVarApiClient.escapeString(campaignHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (date != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("date", date));
        }

        if (weekday != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("weekday", weekday));
        }

        if (hour != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("hour", hour));
        }

        if (location != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("location", location));
        }

        if (domain != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("domain", domain));
        }

        if (url != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("url", url));
        }

        if (reader != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("reader", reader));
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
    private okhttp3.Call getEmailReportValidateBeforeCall(String campaignHash, Boolean date, Boolean weekday, Boolean hour, Boolean location, Boolean domain, Boolean url, Boolean reader, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling getEmailReport(Async)");
        }

        return getEmailReportCall(campaignHash, date, weekday, hour, location, domain, url, reader, _callback);

    }

    /**
     * Get email report
     * Returns email report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param date True to show date stats (optional, default to true)
     * @param weekday True to show weekday stats (optional, default to true)
     * @param hour True to show hour stats (optional, default to true)
     * @param location True to show location stats (optional, default to true)
     * @param domain True to show Domain stats (optional, default to true)
     * @param url True to show Url stats (optional, default to true)
     * @param reader True to show Reader stats (optional, default to true)
     * @return EmailReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public EmailReport getEmailReport(String campaignHash, Boolean date, Boolean weekday, Boolean hour, Boolean location, Boolean domain, Boolean url, Boolean reader) throws ApiException {
        ApiResponse<EmailReport> localVarResp = getEmailReportWithHttpInfo(campaignHash, date, weekday, hour, location, domain, url, reader);
        return localVarResp.getData();
    }

    /**
     * Get email report
     * Returns email report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param date True to show date stats (optional, default to true)
     * @param weekday True to show weekday stats (optional, default to true)
     * @param hour True to show hour stats (optional, default to true)
     * @param location True to show location stats (optional, default to true)
     * @param domain True to show Domain stats (optional, default to true)
     * @param url True to show Url stats (optional, default to true)
     * @param reader True to show Reader stats (optional, default to true)
     * @return ApiResponse&lt;EmailReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EmailReport> getEmailReportWithHttpInfo(String campaignHash, Boolean date, Boolean weekday, Boolean hour, Boolean location, Boolean domain, Boolean url, Boolean reader) throws ApiException {
        okhttp3.Call localVarCall = getEmailReportValidateBeforeCall(campaignHash, date, weekday, hour, location, domain, url, reader, null);
        Type localVarReturnType = new TypeToken<EmailReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get email report (asynchronously)
     * Returns email report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param date True to show date stats (optional, default to true)
     * @param weekday True to show weekday stats (optional, default to true)
     * @param hour True to show hour stats (optional, default to true)
     * @param location True to show location stats (optional, default to true)
     * @param domain True to show Domain stats (optional, default to true)
     * @param url True to show Url stats (optional, default to true)
     * @param reader True to show Reader stats (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEmailReportAsync(String campaignHash, Boolean date, Boolean weekday, Boolean hour, Boolean location, Boolean domain, Boolean url, Boolean reader, final ApiCallback<EmailReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEmailReportValidateBeforeCall(campaignHash, date, weekday, hour, location, domain, url, reader, _callback);
        Type localVarReturnType = new TypeToken<EmailReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPushReport
     * @param campaignHash Hash of the Campaign (required)
     * @param operatingSystems True to show operating system stats (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPushReportCall(String campaignHash, Boolean operatingSystems, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/reports/push/{campaign_hash}"
            .replace("{" + "campaign_hash" + "}", localVarApiClient.escapeString(campaignHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (operatingSystems != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("operating_systems", operatingSystems));
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
    private okhttp3.Call getPushReportValidateBeforeCall(String campaignHash, Boolean operatingSystems, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling getPushReport(Async)");
        }

        return getPushReportCall(campaignHash, operatingSystems, _callback);

    }

    /**
     * Get push report
     * Returns a push report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param operatingSystems True to show operating system stats (optional, default to true)
     * @return PushReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public PushReport getPushReport(String campaignHash, Boolean operatingSystems) throws ApiException {
        ApiResponse<PushReport> localVarResp = getPushReportWithHttpInfo(campaignHash, operatingSystems);
        return localVarResp.getData();
    }

    /**
     * Get push report
     * Returns a push report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param operatingSystems True to show operating system stats (optional, default to true)
     * @return ApiResponse&lt;PushReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PushReport> getPushReportWithHttpInfo(String campaignHash, Boolean operatingSystems) throws ApiException {
        okhttp3.Call localVarCall = getPushReportValidateBeforeCall(campaignHash, operatingSystems, null);
        Type localVarReturnType = new TypeToken<PushReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get push report (asynchronously)
     * Returns a push report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param operatingSystems True to show operating system stats (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getPushReportAsync(String campaignHash, Boolean operatingSystems, final ApiCallback<PushReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPushReportValidateBeforeCall(campaignHash, operatingSystems, _callback);
        Type localVarReturnType = new TypeToken<PushReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSMSReport
     * @param campaignHash Hash of the Campaign (required)
     * @param networks True to show network stats (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSMSReportCall(String campaignHash, Boolean networks, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/reports/sms/{campaign_hash}"
            .replace("{" + "campaign_hash" + "}", localVarApiClient.escapeString(campaignHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (networks != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("networks", networks));
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
    private okhttp3.Call getSMSReportValidateBeforeCall(String campaignHash, Boolean networks, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling getSMSReport(Async)");
        }

        return getSMSReportCall(campaignHash, networks, _callback);

    }

    /**
     * Get sms report
     * Returns sms report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param networks True to show network stats (optional, default to true)
     * @return PhoneReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public PhoneReport getSMSReport(String campaignHash, Boolean networks) throws ApiException {
        ApiResponse<PhoneReport> localVarResp = getSMSReportWithHttpInfo(campaignHash, networks);
        return localVarResp.getData();
    }

    /**
     * Get sms report
     * Returns sms report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param networks True to show network stats (optional, default to true)
     * @return ApiResponse&lt;PhoneReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PhoneReport> getSMSReportWithHttpInfo(String campaignHash, Boolean networks) throws ApiException {
        okhttp3.Call localVarCall = getSMSReportValidateBeforeCall(campaignHash, networks, null);
        Type localVarReturnType = new TypeToken<PhoneReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get sms report (asynchronously)
     * Returns sms report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param networks True to show network stats (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSMSReportAsync(String campaignHash, Boolean networks, final ApiCallback<PhoneReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSMSReportValidateBeforeCall(campaignHash, networks, _callback);
        Type localVarReturnType = new TypeToken<PhoneReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getVoiceReport
     * @param campaignHash Hash of the Campaign (required)
     * @param networks True to show network stats (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVoiceReportCall(String campaignHash, Boolean networks, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/reports/voice/{campaign_hash}"
            .replace("{" + "campaign_hash" + "}", localVarApiClient.escapeString(campaignHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (networks != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("networks", networks));
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
    private okhttp3.Call getVoiceReportValidateBeforeCall(String campaignHash, Boolean networks, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling getVoiceReport(Async)");
        }

        return getVoiceReportCall(campaignHash, networks, _callback);

    }

    /**
     * Get voice report
     * Returns voice report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param networks True to show network stats (optional, default to true)
     * @return PhoneReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public PhoneReport getVoiceReport(String campaignHash, Boolean networks) throws ApiException {
        ApiResponse<PhoneReport> localVarResp = getVoiceReportWithHttpInfo(campaignHash, networks);
        return localVarResp.getData();
    }

    /**
     * Get voice report
     * Returns voice report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param networks True to show network stats (optional, default to true)
     * @return ApiResponse&lt;PhoneReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PhoneReport> getVoiceReportWithHttpInfo(String campaignHash, Boolean networks) throws ApiException {
        okhttp3.Call localVarCall = getVoiceReportValidateBeforeCall(campaignHash, networks, null);
        Type localVarReturnType = new TypeToken<PhoneReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get voice report (asynchronously)
     * Returns voice report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param networks True to show network stats (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getVoiceReportAsync(String campaignHash, Boolean networks, final ApiCallback<PhoneReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = getVoiceReportValidateBeforeCall(campaignHash, networks, _callback);
        Type localVarReturnType = new TypeToken<PhoneReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getWebPushReport
     * @param campaignHash Hash of the Campaign (required)
     * @param devices True to show device stats (optional, default to true)
     * @param operatingSystems True to show operating systems stats (optional, default to true)
     * @param browsers True to show browser stats (optional, default to true)
     * @param url True to show url stats (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWebPushReportCall(String campaignHash, Boolean devices, Boolean operatingSystems, Boolean browsers, Boolean url, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/reports/web-push/{campaign_hash}"
            .replace("{" + "campaign_hash" + "}", localVarApiClient.escapeString(campaignHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (devices != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("devices", devices));
        }

        if (operatingSystems != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("operating_systems", operatingSystems));
        }

        if (browsers != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("browsers", browsers));
        }

        if (url != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("url", url));
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
    private okhttp3.Call getWebPushReportValidateBeforeCall(String campaignHash, Boolean devices, Boolean operatingSystems, Boolean browsers, Boolean url, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling getWebPushReport(Async)");
        }

        return getWebPushReportCall(campaignHash, devices, operatingSystems, browsers, url, _callback);

    }

    /**
     * Get webpush report
     * Returns webpush report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param devices True to show device stats (optional, default to true)
     * @param operatingSystems True to show operating systems stats (optional, default to true)
     * @param browsers True to show browser stats (optional, default to true)
     * @param url True to show url stats (optional, default to true)
     * @return WebPushReport
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public WebPushReport getWebPushReport(String campaignHash, Boolean devices, Boolean operatingSystems, Boolean browsers, Boolean url) throws ApiException {
        ApiResponse<WebPushReport> localVarResp = getWebPushReportWithHttpInfo(campaignHash, devices, operatingSystems, browsers, url);
        return localVarResp.getData();
    }

    /**
     * Get webpush report
     * Returns webpush report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param devices True to show device stats (optional, default to true)
     * @param operatingSystems True to show operating systems stats (optional, default to true)
     * @param browsers True to show browser stats (optional, default to true)
     * @param url True to show url stats (optional, default to true)
     * @return ApiResponse&lt;WebPushReport&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<WebPushReport> getWebPushReportWithHttpInfo(String campaignHash, Boolean devices, Boolean operatingSystems, Boolean browsers, Boolean url) throws ApiException {
        okhttp3.Call localVarCall = getWebPushReportValidateBeforeCall(campaignHash, devices, operatingSystems, browsers, url, null);
        Type localVarReturnType = new TypeToken<WebPushReport>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get webpush report (asynchronously)
     * Returns webpush report given the campaign hash
     * @param campaignHash Hash of the Campaign (required)
     * @param devices True to show device stats (optional, default to true)
     * @param operatingSystems True to show operating systems stats (optional, default to true)
     * @param browsers True to show browser stats (optional, default to true)
     * @param url True to show url stats (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> NotFound </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getWebPushReportAsync(String campaignHash, Boolean devices, Boolean operatingSystems, Boolean browsers, Boolean url, final ApiCallback<WebPushReport> _callback) throws ApiException {

        okhttp3.Call localVarCall = getWebPushReportValidateBeforeCall(campaignHash, devices, operatingSystems, browsers, url, _callback);
        Type localVarReturnType = new TypeToken<WebPushReport>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
