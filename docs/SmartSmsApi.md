# SmartSmsApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionSendSmartSms**](SmartSmsApi.md#actionSendSmartSms) | **POST** /campaigns/smart-sms/{campaign_hash}/actions/send | Send smart sms message |
| [**createSmartSmsCampaign**](SmartSmsApi.md#createSmartSmsCampaign) | **POST** /campaigns/smart-sms | Create new smart sms campaign |
| [**patchSmartSmsCampaign**](SmartSmsApi.md#patchSmartSmsCampaign) | **PATCH** /campaigns/smart-sms/{campaign_hash} | Update a specific smart sms campaign |


<a name="actionSendSmartSms"></a>
# **actionSendSmartSms**
> AcceptedResponse actionSendSmartSms(campaignHash, campaignSmsSendRequest)

Send smart sms message

Deploys and sends a smart sms message

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SmartSmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SmartSmsApi apiInstance = new SmartSmsApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | Hash of the Campaign
    CampaignSmsSendRequest campaignSmsSendRequest = new CampaignSmsSendRequest(); // CampaignSmsSendRequest | Parameters for the 'send sms' action
    try {
      AcceptedResponse result = apiInstance.actionSendSmartSms(campaignHash, campaignSmsSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmartSmsApi#actionSendSmartSms");
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
| **campaignSmsSendRequest** | [**CampaignSmsSendRequest**](CampaignSmsSendRequest.md)| Parameters for the &#39;send sms&#39; action | |

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
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="createSmartSmsCampaign"></a>
# **createSmartSmsCampaign**
> HashcodeCampaign createSmartSmsCampaign(smartSmsCampaign)

Create new smart sms campaign

Creates a new smart sms campaign.                         **DISCLAIMER:** A URL will be added at the end of your SMS

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SmartSmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SmartSmsApi apiInstance = new SmartSmsApi(defaultClient);
    SmartSmsCampaign smartSmsCampaign = new SmartSmsCampaign(); // SmartSmsCampaign | Parameters for the Smart Sms Campaign
    try {
      HashcodeCampaign result = apiInstance.createSmartSmsCampaign(smartSmsCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmartSmsApi#createSmartSmsCampaign");
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
| **smartSmsCampaign** | [**SmartSmsCampaign**](SmartSmsCampaign.md)| Parameters for the Smart Sms Campaign | |

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
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="patchSmartSmsCampaign"></a>
# **patchSmartSmsCampaign**
> HashcodeCampaign patchSmartSmsCampaign(campaignHash, smartSmsCampaignPatchRequest)

Update a specific smart sms campaign

Update smart sms campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SmartSmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SmartSmsApi apiInstance = new SmartSmsApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | Hash of the Campaign
    SmartSmsCampaignPatchRequest smartSmsCampaignPatchRequest = new SmartSmsCampaignPatchRequest(); // SmartSmsCampaignPatchRequest | Parameters for the Smart Sms Campaign
    try {
      HashcodeCampaign result = apiInstance.patchSmartSmsCampaign(campaignHash, smartSmsCampaignPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmartSmsApi#patchSmartSmsCampaign");
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
| **smartSmsCampaignPatchRequest** | [**SmartSmsCampaignPatchRequest**](SmartSmsCampaignPatchRequest.md)| Parameters for the Smart Sms Campaign | |

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

