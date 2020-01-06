# ReportsApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSMSReport**](ReportsApi.md#getSMSReport) | **GET** /reports/sms/{campaign_hash} | Get sms report
[**getVoiceReport**](ReportsApi.md#getVoiceReport) | **GET** /reports/voice/{campaign_hash} | Get voice report
[**getWebPushReport**](ReportsApi.md#getWebPushReport) | **GET** /reports/web-push/{campaign_hash} | Get webpush report


<a name="getSMSReport"></a>
# **getSMSReport**
> PhoneReport getSMSReport(campaignHash, networks)

Get sms report

Returns sms report given the campaign hash

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    Boolean networks = true; // Boolean | True to show network stats
    try {
      PhoneReport result = apiInstance.getSMSReport(campaignHash, networks);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getSMSReport");
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
 **networks** | **Boolean**| True to show network stats | [optional] [default to true]

### Return type

[**PhoneReport**](PhoneReport.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | NotFound |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="getVoiceReport"></a>
# **getVoiceReport**
> PhoneReport getVoiceReport(campaignHash, networks)

Get voice report

Returns voice report given the campaign hash

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    Boolean networks = true; // Boolean | True to show network stats
    try {
      PhoneReport result = apiInstance.getVoiceReport(campaignHash, networks);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getVoiceReport");
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
 **networks** | **Boolean**| True to show network stats | [optional] [default to true]

### Return type

[**PhoneReport**](PhoneReport.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | NotFound |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="getWebPushReport"></a>
# **getWebPushReport**
> WebPushReport getWebPushReport(campaignHash, devices, operatingSystems, browsers, url)

Get webpush report

Returns webpush report given the campaign hash

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
    Boolean devices = true; // Boolean | True to show device stats
    Boolean operatingSystems = true; // Boolean | True to show operating systems stats
    Boolean browsers = true; // Boolean | True to show browser stats
    Boolean url = true; // Boolean | True to show url stats
    try {
      WebPushReport result = apiInstance.getWebPushReport(campaignHash, devices, operatingSystems, browsers, url);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getWebPushReport");
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
 **devices** | **Boolean**| True to show device stats | [optional] [default to true]
 **operatingSystems** | **Boolean**| True to show operating systems stats | [optional] [default to true]
 **browsers** | **Boolean**| True to show browser stats | [optional] [default to true]
 **url** | **Boolean**| True to show url stats | [optional] [default to true]

### Return type

[**WebPushReport**](WebPushReport.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | NotFound |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

