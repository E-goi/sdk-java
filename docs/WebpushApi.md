# WebpushApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionEnableWebPushRss**](WebpushApi.md#actionEnableWebPushRss) | **POST** /campaigns/webpush/rss/{campaign_hash}/actions/enable | Enable a rss webpush campaign |
| [**actionSendWebPush**](WebpushApi.md#actionSendWebPush) | **POST** /campaigns/web-push/{campaign_hash}/actions/send | Send webpush message |
| [**createWebPushCampaign**](WebpushApi.md#createWebPushCampaign) | **POST** /campaigns/web-push | Create new webpush campaign |
| [**createWebPushRssCampaign**](WebpushApi.md#createWebPushRssCampaign) | **POST** /campaigns/webpush/rss | Create new webpush rss campaign |
| [**createWebpushSite**](WebpushApi.md#createWebpushSite) | **POST** /webpush/sites | Creates a webpush site |
| [**getAllWebPushSites**](WebpushApi.md#getAllWebPushSites) | **GET** /webpush/sites | Get all webpush sites |
| [**patchWebPushCampaign**](WebpushApi.md#patchWebPushCampaign) | **PATCH** /campaigns/web-push/{campaign_hash} | Update a specific webpush campaign |


<a name="actionEnableWebPushRss"></a>
# **actionEnableWebPushRss**
> AcceptedResponse actionEnableWebPushRss(campaignHash)

Enable a rss webpush campaign

Enable rss webpush message

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.WebpushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    WebpushApi apiInstance = new WebpushApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | Hash of the Campaign
    try {
      AcceptedResponse result = apiInstance.actionEnableWebPushRss(campaignHash);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebpushApi#actionEnableWebPushRss");
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

### Return type

[**AcceptedResponse**](AcceptedResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="actionSendWebPush"></a>
# **actionSendWebPush**
> AcceptedResponse actionSendWebPush(campaignHash, campaignWebPushSendRequest)

Send webpush message

Deploys and sends a webpush message

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.WebpushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    WebpushApi apiInstance = new WebpushApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | Hash of the Campaign
    CampaignWebPushSendRequest campaignWebPushSendRequest = new CampaignWebPushSendRequest(); // CampaignWebPushSendRequest | Parameters for the 'send web-push' action
    try {
      AcceptedResponse result = apiInstance.actionSendWebPush(campaignHash, campaignWebPushSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebpushApi#actionSendWebPush");
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
| **campaignWebPushSendRequest** | [**CampaignWebPushSendRequest**](CampaignWebPushSendRequest.md)| Parameters for the &#39;send web-push&#39; action | |

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

<a name="createWebPushCampaign"></a>
# **createWebPushCampaign**
> PatchVoiceCampaign200Response createWebPushCampaign(webPushCampaign)

Create new webpush campaign

Create a new webpush campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.WebpushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    WebpushApi apiInstance = new WebpushApi(defaultClient);
    WebPushCampaign webPushCampaign = new WebPushCampaign(); // WebPushCampaign | Parameters for the webpush campaign
    try {
      PatchVoiceCampaign200Response result = apiInstance.createWebPushCampaign(webPushCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebpushApi#createWebPushCampaign");
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
| **webPushCampaign** | [**WebPushCampaign**](WebPushCampaign.md)| Parameters for the webpush campaign | |

### Return type

[**PatchVoiceCampaign200Response**](PatchVoiceCampaign200Response.md)

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

<a name="createWebPushRssCampaign"></a>
# **createWebPushRssCampaign**
> HashcodeCampaign createWebPushRssCampaign(webPushRssCampaign)

Create new webpush rss campaign

Create a new webpush rss campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.WebpushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    WebpushApi apiInstance = new WebpushApi(defaultClient);
    WebPushRssCampaign webPushRssCampaign = new WebPushRssCampaign(); // WebPushRssCampaign | Parameters for the WebPush Campaign
    try {
      HashcodeCampaign result = apiInstance.createWebPushRssCampaign(webPushRssCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebpushApi#createWebPushRssCampaign");
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
| **webPushRssCampaign** | [**WebPushRssCampaign**](WebPushRssCampaign.md)| Parameters for the WebPush Campaign | |

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
| **404** | Not Found |  -  |
| **408** | Request Timeout |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="createWebpushSite"></a>
# **createWebpushSite**
> WebPushSite createWebpushSite(webPushSite)

Creates a webpush site

Create a new webpush site

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.WebpushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    WebpushApi apiInstance = new WebpushApi(defaultClient);
    WebPushSite webPushSite = new WebPushSite(); // WebPushSite | Parameters for the webpush site
    try {
      WebPushSite result = apiInstance.createWebpushSite(webPushSite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebpushApi#createWebpushSite");
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
| **webPushSite** | [**WebPushSite**](WebPushSite.md)| Parameters for the webpush site | |

### Return type

[**WebPushSite**](WebPushSite.md)

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
| **408** | Request Timeout |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a name="getAllWebPushSites"></a>
# **getAllWebPushSites**
> TagCollection1 getAllWebPushSites(offset, limit, order, orderBy, listId)

Get all webpush sites

Returns all wepush&#39;s sites

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.WebpushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    WebpushApi apiInstance = new WebpushApi(defaultClient);
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "asc"; // String | Type of order
    String orderBy = "list_id"; // String | Reference attribute to order sites
    Integer listId = 56; // Integer | Select sites referenced to a list
    try {
      TagCollection1 result = apiInstance.getAllWebPushSites(offset, limit, order, orderBy, listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebpushApi#getAllWebPushSites");
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
| **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional] |
| **limit** | **Integer**| Number of items to return | [optional] [default to 10] |
| **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc] |
| **orderBy** | **String**| Reference attribute to order sites | [optional] [default to list_id] [enum: list_id, created, updated] |
| **listId** | **Integer**| Select sites referenced to a list | [optional] |

### Return type

[**TagCollection1**](TagCollection1.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="patchWebPushCampaign"></a>
# **patchWebPushCampaign**
> PatchVoiceCampaign200Response patchWebPushCampaign(campaignHash, webPushPatchCampaign)

Update a specific webpush campaign

Update a webpush campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.WebpushApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    WebpushApi apiInstance = new WebpushApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | Hash of the Campaign
    WebPushPatchCampaign webPushPatchCampaign = new WebPushPatchCampaign(); // WebPushPatchCampaign | Parameters for the Webpush Campaign
    try {
      PatchVoiceCampaign200Response result = apiInstance.patchWebPushCampaign(campaignHash, webPushPatchCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WebpushApi#patchWebPushCampaign");
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
| **webPushPatchCampaign** | [**WebPushPatchCampaign**](WebPushPatchCampaign.md)| Parameters for the Webpush Campaign | |

### Return type

[**PatchVoiceCampaign200Response**](PatchVoiceCampaign200Response.md)

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

