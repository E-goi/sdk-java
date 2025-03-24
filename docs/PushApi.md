# PushApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionSendPush**](PushApi.md#actionSendPush) | **POST** /campaigns/push/{campaign_hash}/actions/send | Send push message |
| [**createPushCampaign**](PushApi.md#createPushCampaign) | **POST** /campaigns/push | Create new push campaign |
| [**getPushApp**](PushApi.md#getPushApp) | **GET** /push/apps/{app_id} | Get a Push application from E-goi |
| [**getPushApps**](PushApi.md#getPushApps) | **GET** /push/apps | Get all Push applications from E-goi |
| [**patchPushCampaign**](PushApi.md#patchPushCampaign) | **PATCH** /campaigns/push/{campaign_hash} | Update a specific push campaign |
| [**registerPushEvent**](PushApi.md#registerPushEvent) | **POST** /push/apps/{app_id}/event | Registers an event from the push notification. |
| [**registerPushToken**](PushApi.md#registerPushToken) | **POST** /push/apps/{app_id}/token | Registers a Firebase token |


<a name="actionSendPush"></a>
# **actionSendPush**
> AcceptedResponse actionSendPush(campaignHash, campaignPushSendRequest)

Send push message

Deploys and sends a push message

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.PushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    PushApi apiInstance = new PushApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | Hash of the Campaign
    CampaignPushSendRequest campaignPushSendRequest = new CampaignPushSendRequest(); // CampaignPushSendRequest | Parameters for the 'send push' action
    try {
      AcceptedResponse result = apiInstance.actionSendPush(campaignHash, campaignPushSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#actionSendPush");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignHash** | **String**| Hash of the Campaign | |
| **campaignPushSendRequest** | [**CampaignPushSendRequest**](CampaignPushSendRequest.md)| Parameters for the &#39;send push&#39; action | |

### Return type

[**AcceptedResponse**](AcceptedResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="createPushCampaign"></a>
# **createPushCampaign**
> HashcodeCampaign createPushCampaign(pushCampaignPostRequest)

Create new push campaign

Create a new push campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.PushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    PushApi apiInstance = new PushApi(defaultClient);
    PushCampaignPostRequest pushCampaignPostRequest = new PushCampaignPostRequest(); // PushCampaignPostRequest | Parameters for the push campaign
    try {
      HashcodeCampaign result = apiInstance.createPushCampaign(pushCampaignPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#createPushCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pushCampaignPostRequest** | [**PushCampaignPostRequest**](PushCampaignPostRequest.md)| Parameters for the push campaign | |

### Return type

[**HashcodeCampaign**](HashcodeCampaign.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="getPushApp"></a>
# **getPushApp**
> AppStructure getPushApp(appId)

Get a Push application from E-goi

Get a Push application from E-goi

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.PushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    PushApi apiInstance = new PushApi(defaultClient);
    String appId = "appId_example"; // String | ID of the E-goi push app.
    try {
      AppStructure result = apiInstance.getPushApp(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getPushApp");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| ID of the E-goi push app. | |

### Return type

[**AppStructure**](AppStructure.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="getPushApps"></a>
# **getPushApps**
> List&lt;AppStructure&gt; getPushApps(listId)

Get all Push applications from E-goi

Get all Push applications from E-goi

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.PushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    PushApi apiInstance = new PushApi(defaultClient);
    Integer listId = 56; // Integer | ID of the list to search for.
    try {
      List<AppStructure> result = apiInstance.getPushApps(listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#getPushApps");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **Integer**| ID of the list to search for. | [optional] |

### Return type

[**List&lt;AppStructure&gt;**](AppStructure.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **401** | Unauthorized |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="patchPushCampaign"></a>
# **patchPushCampaign**
> HashcodeCampaign patchPushCampaign(campaignHash, pushCampaignPatchRequest)

Update a specific push campaign

Update push campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.PushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    PushApi apiInstance = new PushApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | Hash of the Campaign
    PushCampaignPatchRequest pushCampaignPatchRequest = new PushCampaignPatchRequest(); // PushCampaignPatchRequest | Parameters for the push campaign
    try {
      HashcodeCampaign result = apiInstance.patchPushCampaign(campaignHash, pushCampaignPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#patchPushCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignHash** | **String**| Hash of the Campaign | |
| **pushCampaignPatchRequest** | [**PushCampaignPatchRequest**](PushCampaignPatchRequest.md)| Parameters for the push campaign | |

### Return type

[**HashcodeCampaign**](HashcodeCampaign.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="registerPushEvent"></a>
# **registerPushEvent**
> PushResponse registerPushEvent(appId, pushEvent)

Registers an event from the push notification.

Registers a Firebase token

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.PushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    PushApi apiInstance = new PushApi(defaultClient);
    String appId = "appId_example"; // String | ID of the E-goi push app.
    PushEvent pushEvent = new PushEvent(); // PushEvent | Parameters for the event
    try {
      PushResponse result = apiInstance.registerPushEvent(appId, pushEvent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#registerPushEvent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| ID of the E-goi push app. | |
| **pushEvent** | [**PushEvent**](PushEvent.md)| Parameters for the event | |

### Return type

[**PushResponse**](PushResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **401** | Unauthorized |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="registerPushToken"></a>
# **registerPushToken**
> PushResponse registerPushToken(appId, pushToken)

Registers a Firebase token

Registers a Firebase token

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.PushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    PushApi apiInstance = new PushApi(defaultClient);
    String appId = "appId_example"; // String | ID of the E-goi push app.
    PushToken pushToken = new PushToken(); // PushToken | Parameters for the token
    try {
      PushResponse result = apiInstance.registerPushToken(appId, pushToken);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PushApi#registerPushToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appId** | **String**| ID of the E-goi push app. | |
| **pushToken** | [**PushToken**](PushToken.md)| Parameters for the token | |

### Return type

[**PushResponse**](PushResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **401** | Unauthorized |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

