# SmsApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actionSendSms**](SmsApi.md#actionSendSms) | **POST** /campaigns/sms/{campaign_hash}/actions/send | Send sms message |
| [**createSmsCampaign**](SmsApi.md#createSmsCampaign) | **POST** /campaigns/sms | Create new sms campaign |
| [**patchSmsCampaign**](SmsApi.md#patchSmsCampaign) | **PATCH** /campaigns/sms/{campaign_hash} | Update a specific sms campaign |


<a name="actionSendSms"></a>
# **actionSendSms**
> AcceptedResponse actionSendSms(campaignHash, campaignSmsSendRequest)

Send sms message

Deploys and sends an sms message

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SmsApi apiInstance = new SmsApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    CampaignSmsSendRequest campaignSmsSendRequest = new CampaignSmsSendRequest(); // CampaignSmsSendRequest | Parameters for the 'send sms' action
    try {
      AcceptedResponse result = apiInstance.actionSendSms(campaignHash, campaignSmsSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsApi#actionSendSms");
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
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="createSmsCampaign"></a>
# **createSmsCampaign**
> HashcodeCampaign createSmsCampaign(smsCampaign)

Create new sms campaign

Create a new sms campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SmsApi apiInstance = new SmsApi(defaultClient);
    SmsCampaign smsCampaign = new SmsCampaign(); // SmsCampaign | Parameters for the Sms Campaign
    try {
      HashcodeCampaign result = apiInstance.createSmsCampaign(smsCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsApi#createSmsCampaign");
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
| **smsCampaign** | [**SmsCampaign**](SmsCampaign.md)| Parameters for the Sms Campaign | |

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
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="patchSmsCampaign"></a>
# **patchSmsCampaign**
> HashcodeCampaign patchSmsCampaign(campaignHash, smsCampaignPatchRequest)

Update a specific sms campaign

Update sms campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SmsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SmsApi apiInstance = new SmsApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    SmsCampaignPatchRequest smsCampaignPatchRequest = new SmsCampaignPatchRequest(); // SmsCampaignPatchRequest | Parameters for the Sms Campaign
    try {
      HashcodeCampaign result = apiInstance.patchSmsCampaign(campaignHash, smsCampaignPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SmsApi#patchSmsCampaign");
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
| **smsCampaignPatchRequest** | [**SmsCampaignPatchRequest**](SmsCampaignPatchRequest.md)| Parameters for the Sms Campaign | |

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

