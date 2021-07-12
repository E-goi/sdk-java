# AutomationsApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteAutomation**](AutomationsApi.md#deleteAutomation) | **DELETE** /automations/{automation_id} | Remove automation
[**getAllAutomations**](AutomationsApi.md#getAllAutomations) | **GET** /automations | Get all automations


<a name="deleteAutomation"></a>
# **deleteAutomation**
> deleteAutomation(automationId)

Remove automation

Remove automation information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AutomationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AutomationsApi apiInstance = new AutomationsApi(defaultClient);
    Integer automationId = 56; // Integer | ID of the Automation
    try {
      apiInstance.deleteAutomation(automationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#deleteAutomation");
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
 **automationId** | **Integer**| ID of the Automation |

### Return type

null (empty response body)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**409** | Conflict |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="getAllAutomations"></a>
# **getAllAutomations**
> AutomationCollection getAllAutomations(automationId, title, createdBy, listId, status, offset, limit, order, orderBy)

Get all automations

Returns all automations

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AutomationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AutomationsApi apiInstance = new AutomationsApi(defaultClient);
    Integer automationId = 56; // Integer | Reference attribute to automation id
    String title = "title_example"; // String | Reference attribute to title
    Integer createdBy = 56; // Integer | Reference attribute to created by
    Integer listId = 56; // Integer | ID of the list that owns the automation
    String status = "status_example"; // String | Automation status
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "desc"; // String | Type of order
    String orderBy = "automation_id"; // String | Reference attribute to order automations
    try {
      AutomationCollection result = apiInstance.getAllAutomations(automationId, title, createdBy, listId, status, offset, limit, order, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationsApi#getAllAutomations");
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
 **automationId** | **Integer**| Reference attribute to automation id | [optional]
 **title** | **String**| Reference attribute to title | [optional]
 **createdBy** | **Integer**| Reference attribute to created by | [optional]
 **listId** | **Integer**| ID of the list that owns the automation | [optional]
 **status** | **String**| Automation status | [optional] [enum: active, inactive]
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc]
 **orderBy** | **String**| Reference attribute to order automations | [optional] [default to automation_id] [enum: automation_id, title, list_id, created_by]

### Return type

[**AutomationCollection**](AutomationCollection.md)

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

