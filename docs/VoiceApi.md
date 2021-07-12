# VoiceApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionSendVoice**](VoiceApi.md#actionSendVoice) | **POST** /campaigns/voice/{campaign_hash}/actions/send | Send voice message
[**createVoiceCampaign**](VoiceApi.md#createVoiceCampaign) | **POST** /campaigns/voice | Create new voice campaign
[**patchVoiceCampaign**](VoiceApi.md#patchVoiceCampaign) | **PATCH** /campaigns/voice/{campaign_hash} | Update a specific voice campaign


<a name="actionSendVoice"></a>
# **actionSendVoice**
> AcceptedResponse actionSendVoice(campaignHash, campaignVoiceSendRequest)

Send voice message

Deploys and sends an voice message

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.VoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    VoiceApi apiInstance = new VoiceApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    CampaignVoiceSendRequest campaignVoiceSendRequest = {"schedule_date":"2019-04-01 12:30:23","list_id":1,"segments":{"type":"none"},"notify":[0],"destination_field":"cellphone","limit_contacts":{"type":"percent","value":10},"limit_hour":{"hour_start":"01:00","hour_end":"04:00"},"limit_speed":1}; // CampaignVoiceSendRequest | Parameters for the 'send voice' action
    try {
      AcceptedResponse result = apiInstance.actionSendVoice(campaignHash, campaignVoiceSendRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoiceApi#actionSendVoice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignHash** | **String**| ID of the Campaign |
 **campaignVoiceSendRequest** | [**CampaignVoiceSendRequest**](CampaignVoiceSendRequest.md)| Parameters for the &#39;send voice&#39; action |

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
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="createVoiceCampaign"></a>
# **createVoiceCampaign**
> CampaignHash createVoiceCampaign(voiceCampaign)

Create new voice campaign

Create a new voice campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.VoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    VoiceApi apiInstance = new VoiceApi(defaultClient);
    VoiceCampaign voiceCampaign = new VoiceCampaign(); // VoiceCampaign | Parameters for the Voice Campaign
    try {
      CampaignHash result = apiInstance.createVoiceCampaign(voiceCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoiceApi#createVoiceCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **voiceCampaign** | [**VoiceCampaign**](VoiceCampaign.md)| Parameters for the Voice Campaign |

### Return type

[**CampaignHash**](CampaignHash.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**409** | Conflict |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="patchVoiceCampaign"></a>
# **patchVoiceCampaign**
> CampaignHash patchVoiceCampaign(campaignHash, voicePatchCampaign)

Update a specific voice campaign

Update a voice campaign

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.VoiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    VoiceApi apiInstance = new VoiceApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    VoicePatchCampaign voicePatchCampaign = new VoicePatchCampaign(); // VoicePatchCampaign | Parameters for the Voice Campaign
    try {
      CampaignHash result = apiInstance.patchVoiceCampaign(campaignHash, voicePatchCampaign);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VoiceApi#patchVoiceCampaign");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignHash** | **String**| ID of the Campaign |
 **voicePatchCampaign** | [**VoicePatchCampaign**](VoicePatchCampaign.md)| Parameters for the Voice Campaign |

### Return type

[**CampaignHash**](CampaignHash.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

