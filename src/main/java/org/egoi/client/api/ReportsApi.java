/*
 * APIv3 (New)
 *  # Introduction This is our new version of API. We invite you to start using it and give us your feedback # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB.  # Timeouts Timeouts set a maximum waiting time on a request's response. Our API, sets a default timeout for each request and when breached, you'll receive an HTTP **408 (Request Timeout)** error code. You should take into consideration that response times can vary widely based on the complexity of the request, amount of data being analyzed, and the load on the system and workspace at the time of the query. When dealing with such errors, you should first attempt to reduce the complexity and amount of data under analysis, and only then, if problems are still occurring ask for support.  For all these reasons, the default timeout for each request is **10 Seconds** and any request that creates or modifies data (**POST**, **PATCH** and **PUT**) will have a timeout of **60 Seconds**. Specific timeouts may exist for specific requests, these can be found in the request's documentation.  <security-definitions/>
 *
 * The version of the OpenAPI document: 3.0.0
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


import org.egoi.client.model.Forbidden;
import org.egoi.client.model.InternalServerError;
import org.egoi.client.model.NotFound;
import org.egoi.client.model.PhoneReport;
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

public class ReportsApi {
    private ApiClient localVarApiClient;

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

    /**
     * Build call for getSMSReport
     * @param campaignHash ID of the Campaign (required)
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
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reports/sms/{campaign_hash}"
            .replaceAll("\\{" + "campaign_hash" + "\\}", localVarApiClient.escapeString(campaignHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (networks != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("networks", networks));
        }

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

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSMSReportValidateBeforeCall(String campaignHash, Boolean networks, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling getSMSReport(Async)");
        }
        

        okhttp3.Call localVarCall = getSMSReportCall(campaignHash, networks, _callback);
        return localVarCall;

    }

    /**
     * Get sms report
     * Returns sms report given the campaign hash
     * @param campaignHash ID of the Campaign (required)
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
     * @param campaignHash ID of the Campaign (required)
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
     * @param campaignHash ID of the Campaign (required)
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
     * @param campaignHash ID of the Campaign (required)
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
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reports/voice/{campaign_hash}"
            .replaceAll("\\{" + "campaign_hash" + "\\}", localVarApiClient.escapeString(campaignHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (networks != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("networks", networks));
        }

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

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getVoiceReportValidateBeforeCall(String campaignHash, Boolean networks, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling getVoiceReport(Async)");
        }
        

        okhttp3.Call localVarCall = getVoiceReportCall(campaignHash, networks, _callback);
        return localVarCall;

    }

    /**
     * Get voice report
     * Returns voice report given the campaign hash
     * @param campaignHash ID of the Campaign (required)
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
     * @param campaignHash ID of the Campaign (required)
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
     * @param campaignHash ID of the Campaign (required)
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
     * @param campaignHash ID of the Campaign (required)
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
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/reports/web-push/{campaign_hash}"
            .replaceAll("\\{" + "campaign_hash" + "\\}", localVarApiClient.escapeString(campaignHash.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
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

        String[] localVarAuthNames = new String[] { "Apikey" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getWebPushReportValidateBeforeCall(String campaignHash, Boolean devices, Boolean operatingSystems, Boolean browsers, Boolean url, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'campaignHash' is set
        if (campaignHash == null) {
            throw new ApiException("Missing the required parameter 'campaignHash' when calling getWebPushReport(Async)");
        }
        

        okhttp3.Call localVarCall = getWebPushReportCall(campaignHash, devices, operatingSystems, browsers, url, _callback);
        return localVarCall;

    }

    /**
     * Get webpush report
     * Returns webpush report given the campaign hash
     * @param campaignHash ID of the Campaign (required)
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
     * @param campaignHash ID of the Campaign (required)
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
     * @param campaignHash ID of the Campaign (required)
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
