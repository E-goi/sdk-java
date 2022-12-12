# ReportsApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEmailReport**](ReportsApi.md#getEmailReport) | **GET** /reports/email/{campaign_hash} | Get email report |
| [**getSMSReport**](ReportsApi.md#getSMSReport) | **GET** /reports/sms/{campaign_hash} | Get sms report |
| [**getVoiceReport**](ReportsApi.md#getVoiceReport) | **GET** /reports/voice/{campaign_hash} | Get voice report |
| [**getWebPushReport**](ReportsApi.md#getWebPushReport) | **GET** /reports/web-push/{campaign_hash} | Get webpush report |


<a name="getEmailReport"></a>
# **getEmailReport**
> EmailReport getEmailReport(campaignHash, date, weekday, hour, location, domain, url, reader)

Get email report

Returns email report given the campaign hash

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
    Boolean date = true; // Boolean | True to show date stats
    Boolean weekday = true; // Boolean | True to show weekday stats
    Boolean hour = true; // Boolean | True to show hour stats
    Boolean location = true; // Boolean | True to show location stats
    Boolean domain = true; // Boolean | True to show Domain stats
    Boolean url = true; // Boolean | True to show Url stats
    Boolean reader = true; // Boolean | True to show Reader stats
    try {
      EmailReport result = apiInstance.getEmailReport(campaignHash, date, weekday, hour, location, domain, url, reader);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getEmailReport");
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
| **date** | **Boolean**| True to show date stats | [optional] [default to true] |
| **weekday** | **Boolean**| True to show weekday stats | [optional] [default to true] |
| **hour** | **Boolean**| True to show hour stats | [optional] [default to true] |
| **location** | **Boolean**| True to show location stats | [optional] [default to true] |
| **domain** | **Boolean**| True to show Domain stats | [optional] [default to true] |
| **url** | **Boolean**| True to show Url stats | [optional] [default to true] |
| **reader** | **Boolean**| True to show Reader stats | [optional] [default to true] |

### Return type

[**EmailReport**](EmailReport.md)

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
| **404** | NotFound |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignHash** | **String**| ID of the Campaign | |
| **networks** | **Boolean**| True to show network stats | [optional] [default to true] |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | NotFound |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignHash** | **String**| ID of the Campaign | |
| **networks** | **Boolean**| True to show network stats | [optional] [default to true] |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | NotFound |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignHash** | **String**| ID of the Campaign | |
| **devices** | **Boolean**| True to show device stats | [optional] [default to true] |
| **operatingSystems** | **Boolean**| True to show operating systems stats | [optional] [default to true] |
| **browsers** | **Boolean**| True to show browser stats | [optional] [default to true] |
| **url** | **Boolean**| True to show url stats | [optional] [default to true] |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | NotFound |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

