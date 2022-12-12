# EmailApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionEnableEmailRss**](EmailApi.md#actionEnableEmailRss) | **POST** /campaigns/email/rss/{campaign_hash}/actions/enable | Enables a rss email campaign |
| [**actionSendEmail**](EmailApi.md#actionSendEmail) | **POST** /campaigns/email/{campaign_hash}/actions/send | Send email message |
| [**createEmailCampaign**](EmailApi.md#createEmailCampaign) | **POST** /campaigns/email | Create new email campaign |
| [**createEmailRssCampaign**](EmailApi.md#createEmailRssCampaign) | **POST** /campaigns/email/rss | Create new email rss campaign |
| [**patchEmailCampaign**](EmailApi.md#patchEmailCampaign) | **PATCH** /campaigns/email/{campaign_hash} | Update a specific email campaign |


<a name="actionEnableEmailRss"></a>
# **actionEnableEmailRss**
> AcceptedResponse actionEnableEmailRss(campaignHash)

Enables a rss email campaign

Enables a rss email message

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EmailApi apiInstance = new EmailApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    try {
      AcceptedResponse result = apiInstance.actionEnableEmailRss(campaignHash);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailApi#actionEnableEmailRss");
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
| **campaignHash** | **String**| ID of the Campaign | |

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
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="actionSendEmail"></a>
# **actionSendEmail**
> AcceptedResponse actionSendEmail(campaignHash, campaignEmailSendRequest)

Send email message

Deploys and sends an email message

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EmailApi apiInstance = new EmailApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    CampaignEmailSendRequest campaignEmailSendRequest = new CampaignEmailSendRequest(); // CampaignEmailSendRequest | Parameters for the 'send email' action
    try {
      AcceptedResponse result = apiInstance.actionSendEmail(campaignHash, campaignEmailSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailApi#actionSendEmail");
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
| **campaignHash** | **String**| ID of the Campaign | |
| **campaignEmailSendRequest** | [**CampaignEmailSendRequest**](CampaignEmailSendRequest.md)| Parameters for the &#39;send email&#39; action | |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **408** | Request Timeout |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="createEmailCampaign"></a>
# **createEmailCampaign**
> HashcodeCampaign createEmailCampaign(emailCampaignCreate)

Create new email campaign

Create a new email campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EmailApi apiInstance = new EmailApi(defaultClient);
    EmailCampaignCreate emailCampaignCreate = new EmailCampaignCreate(); // EmailCampaignCreate | Parameters for the Email Campaign
    try {
      HashcodeCampaign result = apiInstance.createEmailCampaign(emailCampaignCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailApi#createEmailCampaign");
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
| **emailCampaignCreate** | [**EmailCampaignCreate**](EmailCampaignCreate.md)| Parameters for the Email Campaign | |

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

<a name="createEmailRssCampaign"></a>
# **createEmailRssCampaign**
> HashcodeCampaign createEmailRssCampaign(emailRssCampaignCreate)

Create new email rss campaign

Create a new email rss campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EmailApi apiInstance = new EmailApi(defaultClient);
    EmailRssCampaignCreate emailRssCampaignCreate = new EmailRssCampaignCreate(); // EmailRssCampaignCreate | Parameters for the Email Campaign
    try {
      HashcodeCampaign result = apiInstance.createEmailRssCampaign(emailRssCampaignCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailApi#createEmailRssCampaign");
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
| **emailRssCampaignCreate** | [**EmailRssCampaignCreate**](EmailRssCampaignCreate.md)| Parameters for the Email Campaign | |

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

<a name="patchEmailCampaign"></a>
# **patchEmailCampaign**
> HashcodeCampaign patchEmailCampaign(campaignHash, emailCampaignPatch)

Update a specific email campaign

Update email campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EmailApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EmailApi apiInstance = new EmailApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    EmailCampaignPatch emailCampaignPatch = new EmailCampaignPatch(); // EmailCampaignPatch | Parameters for the Email Campaign
    try {
      HashcodeCampaign result = apiInstance.patchEmailCampaign(campaignHash, emailCampaignPatch);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailApi#patchEmailCampaign");
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
| **campaignHash** | **String**| ID of the Campaign | |
| **emailCampaignPatch** | [**EmailCampaignPatch**](EmailCampaignPatch.md)| Parameters for the Email Campaign | |

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

