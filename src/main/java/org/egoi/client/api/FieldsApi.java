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


import org.egoi.client.model.BadRequest;
import org.egoi.client.model.ComplexField;
import org.egoi.client.model.DeleteFieldsConflict;
import org.egoi.client.model.Field;
import org.egoi.client.model.FieldOption;
import org.egoi.client.model.FieldOptionPost;
import org.egoi.client.model.FieldOptionsCollection;
import org.egoi.client.model.Forbidden;
import org.egoi.client.model.InternalServerError;
import org.egoi.client.model.NotFound;
import org.egoi.client.model.PatchRequestBaseField;
import org.egoi.client.model.PatchRequestField;
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

public class FieldsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FieldsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FieldsApi(ApiClient apiClient) {
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
     * Build call for createExtraField
     * @param listId ID of the List (required)
     * @param field Parameters for the extra field (required)
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
    public okhttp3.Call createExtraFieldCall(Integer listId, Field field, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = field;

        // create path and map variables
        String localVarPath = "/lists/{list_id}/fields/extra"
            .replace("{" + "list_id" + "}", localVarApiClient.escapeString(listId.toString()));

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
    private okhttp3.Call createExtraFieldValidateBeforeCall(Integer listId, Field field, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling createExtraField(Async)");
        }

        // verify the required parameter 'field' is set
        if (field == null) {
            throw new ApiException("Missing the required parameter 'field' when calling createExtraField(Async)");
        }

        return createExtraFieldCall(listId, field, _callback);

    }

    /**
     * Create extra field
     * Creates an extra field
     * @param listId ID of the List (required)
     * @param field Parameters for the extra field (required)
     * @return Field
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
    public Field createExtraField(Integer listId, Field field) throws ApiException {
        ApiResponse<Field> localVarResp = createExtraFieldWithHttpInfo(listId, field);
        return localVarResp.getData();
    }

    /**
     * Create extra field
     * Creates an extra field
     * @param listId ID of the List (required)
     * @param field Parameters for the extra field (required)
     * @return ApiResponse&lt;Field&gt;
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
    public ApiResponse<Field> createExtraFieldWithHttpInfo(Integer listId, Field field) throws ApiException {
        okhttp3.Call localVarCall = createExtraFieldValidateBeforeCall(listId, field, null);
        Type localVarReturnType = new TypeToken<Field>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create extra field (asynchronously)
     * Creates an extra field
     * @param listId ID of the List (required)
     * @param field Parameters for the extra field (required)
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
    public okhttp3.Call createExtraFieldAsync(Integer listId, Field field, final ApiCallback<Field> _callback) throws ApiException {

        okhttp3.Call localVarCall = createExtraFieldValidateBeforeCall(listId, field, _callback);
        Type localVarReturnType = new TypeToken<Field>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for createFieldOption
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param fieldOptionPost Parameters for the field option (required)
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
        <tr><td> 404 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFieldOptionCall(Integer listId, Integer fieldId, FieldOptionPost fieldOptionPost, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = fieldOptionPost;

        // create path and map variables
        String localVarPath = "/lists/{list_id}/fields/extra/{field_id}/options"
            .replace("{" + "list_id" + "}", localVarApiClient.escapeString(listId.toString()))
            .replace("{" + "field_id" + "}", localVarApiClient.escapeString(fieldId.toString()));

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
    private okhttp3.Call createFieldOptionValidateBeforeCall(Integer listId, Integer fieldId, FieldOptionPost fieldOptionPost, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling createFieldOption(Async)");
        }

        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling createFieldOption(Async)");
        }

        // verify the required parameter 'fieldOptionPost' is set
        if (fieldOptionPost == null) {
            throw new ApiException("Missing the required parameter 'fieldOptionPost' when calling createFieldOption(Async)");
        }

        return createFieldOptionCall(listId, fieldId, fieldOptionPost, _callback);

    }

    /**
     * Create new field option
     * Creates a field option
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param fieldOptionPost Parameters for the field option (required)
     * @return FieldOption
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public FieldOption createFieldOption(Integer listId, Integer fieldId, FieldOptionPost fieldOptionPost) throws ApiException {
        ApiResponse<FieldOption> localVarResp = createFieldOptionWithHttpInfo(listId, fieldId, fieldOptionPost);
        return localVarResp.getData();
    }

    /**
     * Create new field option
     * Creates a field option
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param fieldOptionPost Parameters for the field option (required)
     * @return ApiResponse&lt;FieldOption&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FieldOption> createFieldOptionWithHttpInfo(Integer listId, Integer fieldId, FieldOptionPost fieldOptionPost) throws ApiException {
        okhttp3.Call localVarCall = createFieldOptionValidateBeforeCall(listId, fieldId, fieldOptionPost, null);
        Type localVarReturnType = new TypeToken<FieldOption>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create new field option (asynchronously)
     * Creates a field option
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param fieldOptionPost Parameters for the field option (required)
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
        <tr><td> 404 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createFieldOptionAsync(Integer listId, Integer fieldId, FieldOptionPost fieldOptionPost, final ApiCallback<FieldOption> _callback) throws ApiException {

        okhttp3.Call localVarCall = createFieldOptionValidateBeforeCall(listId, fieldId, fieldOptionPost, _callback);
        Type localVarReturnType = new TypeToken<FieldOption>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteExtraField
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
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
    public okhttp3.Call deleteExtraFieldCall(Integer listId, Integer fieldId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/lists/{list_id}/fields/extra/{field_id}"
            .replace("{" + "list_id" + "}", localVarApiClient.escapeString(listId.toString()))
            .replace("{" + "field_id" + "}", localVarApiClient.escapeString(fieldId.toString()));

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
    private okhttp3.Call deleteExtraFieldValidateBeforeCall(Integer listId, Integer fieldId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling deleteExtraField(Async)");
        }

        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling deleteExtraField(Async)");
        }

        return deleteExtraFieldCall(listId, fieldId, _callback);

    }

    /**
     * Remove extra field
     * Removes an extra field given its ID
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
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
    public void deleteExtraField(Integer listId, Integer fieldId) throws ApiException {
        deleteExtraFieldWithHttpInfo(listId, fieldId);
    }

    /**
     * Remove extra field
     * Removes an extra field given its ID
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
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
    public ApiResponse<Void> deleteExtraFieldWithHttpInfo(Integer listId, Integer fieldId) throws ApiException {
        okhttp3.Call localVarCall = deleteExtraFieldValidateBeforeCall(listId, fieldId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove extra field (asynchronously)
     * Removes an extra field given its ID
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
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
    public okhttp3.Call deleteExtraFieldAsync(Integer listId, Integer fieldId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteExtraFieldValidateBeforeCall(listId, fieldId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteFieldOption
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param optionId ID of the field option (required)
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
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFieldOptionCall(Integer listId, Integer fieldId, Integer optionId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/lists/{list_id}/fields/extra/{field_id}/options/{option_id}"
            .replace("{" + "list_id" + "}", localVarApiClient.escapeString(listId.toString()))
            .replace("{" + "field_id" + "}", localVarApiClient.escapeString(fieldId.toString()))
            .replace("{" + "option_id" + "}", localVarApiClient.escapeString(optionId.toString()));

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
    private okhttp3.Call deleteFieldOptionValidateBeforeCall(Integer listId, Integer fieldId, Integer optionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling deleteFieldOption(Async)");
        }

        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling deleteFieldOption(Async)");
        }

        // verify the required parameter 'optionId' is set
        if (optionId == null) {
            throw new ApiException("Missing the required parameter 'optionId' when calling deleteFieldOption(Async)");
        }

        return deleteFieldOptionCall(listId, fieldId, optionId, _callback);

    }

    /**
     * Deletes an option
     * Deletes an option of a list of values field
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param optionId ID of the field option (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public void deleteFieldOption(Integer listId, Integer fieldId, Integer optionId) throws ApiException {
        deleteFieldOptionWithHttpInfo(listId, fieldId, optionId);
    }

    /**
     * Deletes an option
     * Deletes an option of a list of values field
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param optionId ID of the field option (required)
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
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteFieldOptionWithHttpInfo(Integer listId, Integer fieldId, Integer optionId) throws ApiException {
        okhttp3.Call localVarCall = deleteFieldOptionValidateBeforeCall(listId, fieldId, optionId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Deletes an option (asynchronously)
     * Deletes an option of a list of values field
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param optionId ID of the field option (required)
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
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteFieldOptionAsync(Integer listId, Integer fieldId, Integer optionId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteFieldOptionValidateBeforeCall(listId, fieldId, optionId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllFieldOptions
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllFieldOptionsCall(Integer listId, Integer fieldId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/lists/{list_id}/fields/extra/{field_id}/options"
            .replace("{" + "list_id" + "}", localVarApiClient.escapeString(listId.toString()))
            .replace("{" + "field_id" + "}", localVarApiClient.escapeString(fieldId.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllFieldOptionsValidateBeforeCall(Integer listId, Integer fieldId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling getAllFieldOptions(Async)");
        }

        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling getAllFieldOptions(Async)");
        }

        return getAllFieldOptionsCall(listId, fieldId, _callback);

    }

    /**
     * Get all field options
     * Returns all options of a given field
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @return FieldOptionsCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public FieldOptionsCollection getAllFieldOptions(Integer listId, Integer fieldId) throws ApiException {
        ApiResponse<FieldOptionsCollection> localVarResp = getAllFieldOptionsWithHttpInfo(listId, fieldId);
        return localVarResp.getData();
    }

    /**
     * Get all field options
     * Returns all options of a given field
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @return ApiResponse&lt;FieldOptionsCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FieldOptionsCollection> getAllFieldOptionsWithHttpInfo(Integer listId, Integer fieldId) throws ApiException {
        okhttp3.Call localVarCall = getAllFieldOptionsValidateBeforeCall(listId, fieldId, null);
        Type localVarReturnType = new TypeToken<FieldOptionsCollection>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all field options (asynchronously)
     * Returns all options of a given field
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 408 </td><td> Request Timeout </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllFieldOptionsAsync(Integer listId, Integer fieldId, final ApiCallback<FieldOptionsCollection> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllFieldOptionsValidateBeforeCall(listId, fieldId, _callback);
        Type localVarReturnType = new TypeToken<FieldOptionsCollection>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllFields
     * @param listId ID of the List (required)
     * @param offset Element offset (starting at zero for the first element) (optional)
     * @param limit Number of items to return (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllFieldsCall(Integer listId, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/lists/{list_id}/fields"
            .replace("{" + "list_id" + "}", localVarApiClient.escapeString(listId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call getAllFieldsValidateBeforeCall(Integer listId, Integer offset, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling getAllFields(Async)");
        }

        return getAllFieldsCall(listId, offset, limit, _callback);

    }

    /**
     * Get all fields
     * Returns all fields
     * @param listId ID of the List (required)
     * @param offset Element offset (starting at zero for the first element) (optional)
     * @param limit Number of items to return (optional, default to 10)
     * @return List&lt;ComplexField&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public List<ComplexField> getAllFields(Integer listId, Integer offset, Integer limit) throws ApiException {
        ApiResponse<List<ComplexField>> localVarResp = getAllFieldsWithHttpInfo(listId, offset, limit);
        return localVarResp.getData();
    }

    /**
     * Get all fields
     * Returns all fields
     * @param listId ID of the List (required)
     * @param offset Element offset (starting at zero for the first element) (optional)
     * @param limit Number of items to return (optional, default to 10)
     * @return ApiResponse&lt;List&lt;ComplexField&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ComplexField>> getAllFieldsWithHttpInfo(Integer listId, Integer offset, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = getAllFieldsValidateBeforeCall(listId, offset, limit, null);
        Type localVarReturnType = new TypeToken<List<ComplexField>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all fields (asynchronously)
     * Returns all fields
     * @param listId ID of the List (required)
     * @param offset Element offset (starting at zero for the first element) (optional)
     * @param limit Number of items to return (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Unprocessable Entity </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
        <tr><td> 503 </td><td> Service Unavailable </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllFieldsAsync(Integer listId, Integer offset, Integer limit, final ApiCallback<List<ComplexField>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllFieldsValidateBeforeCall(listId, offset, limit, _callback);
        Type localVarReturnType = new TypeToken<List<ComplexField>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchBaseField
     * @param listId ID of the List (required)
     * @param fieldId ID of the base field (required)
     * @param patchRequestBaseField Parameters for the extra field (required)
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
    public okhttp3.Call patchBaseFieldCall(Integer listId, String fieldId, PatchRequestBaseField patchRequestBaseField, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = patchRequestBaseField;

        // create path and map variables
        String localVarPath = "/lists/{list_id}/fields/base/{field_id}"
            .replace("{" + "list_id" + "}", localVarApiClient.escapeString(listId.toString()))
            .replace("{" + "field_id" + "}", localVarApiClient.escapeString(fieldId.toString()));

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
    private okhttp3.Call patchBaseFieldValidateBeforeCall(Integer listId, String fieldId, PatchRequestBaseField patchRequestBaseField, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling patchBaseField(Async)");
        }

        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling patchBaseField(Async)");
        }

        // verify the required parameter 'patchRequestBaseField' is set
        if (patchRequestBaseField == null) {
            throw new ApiException("Missing the required parameter 'patchRequestBaseField' when calling patchBaseField(Async)");
        }

        return patchBaseFieldCall(listId, fieldId, patchRequestBaseField, _callback);

    }

    /**
     * Update base field
     * Updates a base field
     * @param listId ID of the List (required)
     * @param fieldId ID of the base field (required)
     * @param patchRequestBaseField Parameters for the extra field (required)
     * @return Field
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
    public Field patchBaseField(Integer listId, String fieldId, PatchRequestBaseField patchRequestBaseField) throws ApiException {
        ApiResponse<Field> localVarResp = patchBaseFieldWithHttpInfo(listId, fieldId, patchRequestBaseField);
        return localVarResp.getData();
    }

    /**
     * Update base field
     * Updates a base field
     * @param listId ID of the List (required)
     * @param fieldId ID of the base field (required)
     * @param patchRequestBaseField Parameters for the extra field (required)
     * @return ApiResponse&lt;Field&gt;
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
    public ApiResponse<Field> patchBaseFieldWithHttpInfo(Integer listId, String fieldId, PatchRequestBaseField patchRequestBaseField) throws ApiException {
        okhttp3.Call localVarCall = patchBaseFieldValidateBeforeCall(listId, fieldId, patchRequestBaseField, null);
        Type localVarReturnType = new TypeToken<Field>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update base field (asynchronously)
     * Updates a base field
     * @param listId ID of the List (required)
     * @param fieldId ID of the base field (required)
     * @param patchRequestBaseField Parameters for the extra field (required)
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
    public okhttp3.Call patchBaseFieldAsync(Integer listId, String fieldId, PatchRequestBaseField patchRequestBaseField, final ApiCallback<Field> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchBaseFieldValidateBeforeCall(listId, fieldId, patchRequestBaseField, _callback);
        Type localVarReturnType = new TypeToken<Field>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for patchExtraField
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param patchRequestField Parameters for the extra field (required)
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
    public okhttp3.Call patchExtraFieldCall(Integer listId, Integer fieldId, PatchRequestField patchRequestField, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = patchRequestField;

        // create path and map variables
        String localVarPath = "/lists/{list_id}/fields/extra/{field_id}"
            .replace("{" + "list_id" + "}", localVarApiClient.escapeString(listId.toString()))
            .replace("{" + "field_id" + "}", localVarApiClient.escapeString(fieldId.toString()));

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
    private okhttp3.Call patchExtraFieldValidateBeforeCall(Integer listId, Integer fieldId, PatchRequestField patchRequestField, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling patchExtraField(Async)");
        }

        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling patchExtraField(Async)");
        }

        // verify the required parameter 'patchRequestField' is set
        if (patchRequestField == null) {
            throw new ApiException("Missing the required parameter 'patchRequestField' when calling patchExtraField(Async)");
        }

        return patchExtraFieldCall(listId, fieldId, patchRequestField, _callback);

    }

    /**
     * Update extra field
     * Updates an extra field
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param patchRequestField Parameters for the extra field (required)
     * @return Field
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
    public Field patchExtraField(Integer listId, Integer fieldId, PatchRequestField patchRequestField) throws ApiException {
        ApiResponse<Field> localVarResp = patchExtraFieldWithHttpInfo(listId, fieldId, patchRequestField);
        return localVarResp.getData();
    }

    /**
     * Update extra field
     * Updates an extra field
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param patchRequestField Parameters for the extra field (required)
     * @return ApiResponse&lt;Field&gt;
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
    public ApiResponse<Field> patchExtraFieldWithHttpInfo(Integer listId, Integer fieldId, PatchRequestField patchRequestField) throws ApiException {
        okhttp3.Call localVarCall = patchExtraFieldValidateBeforeCall(listId, fieldId, patchRequestField, null);
        Type localVarReturnType = new TypeToken<Field>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update extra field (asynchronously)
     * Updates an extra field
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param patchRequestField Parameters for the extra field (required)
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
    public okhttp3.Call patchExtraFieldAsync(Integer listId, Integer fieldId, PatchRequestField patchRequestField, final ApiCallback<Field> _callback) throws ApiException {

        okhttp3.Call localVarCall = patchExtraFieldValidateBeforeCall(listId, fieldId, patchRequestField, _callback);
        Type localVarReturnType = new TypeToken<Field>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateFieldOption
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param optionId ID of the field option (required)
     * @param fieldOptionPost Parameters for the field option (required)
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
    public okhttp3.Call updateFieldOptionCall(Integer listId, Integer fieldId, Integer optionId, FieldOptionPost fieldOptionPost, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = fieldOptionPost;

        // create path and map variables
        String localVarPath = "/lists/{list_id}/fields/extra/{field_id}/options/{option_id}"
            .replace("{" + "list_id" + "}", localVarApiClient.escapeString(listId.toString()))
            .replace("{" + "field_id" + "}", localVarApiClient.escapeString(fieldId.toString()))
            .replace("{" + "option_id" + "}", localVarApiClient.escapeString(optionId.toString()));

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
    private okhttp3.Call updateFieldOptionValidateBeforeCall(Integer listId, Integer fieldId, Integer optionId, FieldOptionPost fieldOptionPost, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling updateFieldOption(Async)");
        }

        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new ApiException("Missing the required parameter 'fieldId' when calling updateFieldOption(Async)");
        }

        // verify the required parameter 'optionId' is set
        if (optionId == null) {
            throw new ApiException("Missing the required parameter 'optionId' when calling updateFieldOption(Async)");
        }

        // verify the required parameter 'fieldOptionPost' is set
        if (fieldOptionPost == null) {
            throw new ApiException("Missing the required parameter 'fieldOptionPost' when calling updateFieldOption(Async)");
        }

        return updateFieldOptionCall(listId, fieldId, optionId, fieldOptionPost, _callback);

    }

    /**
     * Update field option
     * Updates a field option
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param optionId ID of the field option (required)
     * @param fieldOptionPost Parameters for the field option (required)
     * @return FieldOption
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
    public FieldOption updateFieldOption(Integer listId, Integer fieldId, Integer optionId, FieldOptionPost fieldOptionPost) throws ApiException {
        ApiResponse<FieldOption> localVarResp = updateFieldOptionWithHttpInfo(listId, fieldId, optionId, fieldOptionPost);
        return localVarResp.getData();
    }

    /**
     * Update field option
     * Updates a field option
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param optionId ID of the field option (required)
     * @param fieldOptionPost Parameters for the field option (required)
     * @return ApiResponse&lt;FieldOption&gt;
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
    public ApiResponse<FieldOption> updateFieldOptionWithHttpInfo(Integer listId, Integer fieldId, Integer optionId, FieldOptionPost fieldOptionPost) throws ApiException {
        okhttp3.Call localVarCall = updateFieldOptionValidateBeforeCall(listId, fieldId, optionId, fieldOptionPost, null);
        Type localVarReturnType = new TypeToken<FieldOption>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update field option (asynchronously)
     * Updates a field option
     * @param listId ID of the List (required)
     * @param fieldId ID of the Field (required)
     * @param optionId ID of the field option (required)
     * @param fieldOptionPost Parameters for the field option (required)
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
    public okhttp3.Call updateFieldOptionAsync(Integer listId, Integer fieldId, Integer optionId, FieldOptionPost fieldOptionPost, final ApiCallback<FieldOption> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateFieldOptionValidateBeforeCall(listId, fieldId, optionId, fieldOptionPost, _callback);
        Type localVarReturnType = new TypeToken<FieldOption>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
