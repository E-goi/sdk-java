# CampaignsApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCampaigns**](CampaignsApi.md#deleteCampaigns) | **DELETE** /campaigns/{campaign_hash} | Remove Campaign |
| [**getAllCampaigns**](CampaignsApi.md#getAllCampaigns) | **GET** /campaigns | Get all Campaigns |


<a name="deleteCampaigns"></a>
# **deleteCampaigns**
> deleteCampaigns(campaignHash)

Remove Campaign

Remove campaign information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String campaignHash = "campaignHash_example"; // String | Hash of the Campaign
    try {
      apiInstance.deleteCampaigns(campaignHash);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#deleteCampaigns");
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

null (empty response body)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **408** | Request Timeout |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="getAllCampaigns"></a>
# **getAllCampaigns**
> CampaignsCollection getAllCampaigns(channel, campaignHash, listId, status, internalName, createdBy, groupId, createdMin, createdMax, updatedMin, updatedMax, startDateMin, startDateMax, endDateMin, endDateMax, scheduleDateMin, scheduleDateMax, offset, limit, order, orderBy)

Get all Campaigns

Returns all campaigns

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.CampaignsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    CampaignsApi apiInstance = new CampaignsApi(defaultClient);
    String channel = "email"; // String | Channel of the campaign
    String campaignHash = "campaignHash_example"; // String | Hash of the campaign
    Integer listId = 56; // Integer | ID of the list where the campaign belongs
    String status = "draft"; // String | Status of the campaign
    String internalName = "internalName_example"; // String | Internal name of the campaign
    Integer createdBy = 56; // Integer | ID of the user who created the campaign
    Integer groupId = 56; // Integer | ID of the group where the campaign belongs
    OffsetDateTime createdMin = OffsetDateTime.now(); // OffsetDateTime | Created initial date
    OffsetDateTime createdMax = OffsetDateTime.now(); // OffsetDateTime | Created finish
    OffsetDateTime updatedMin = OffsetDateTime.now(); // OffsetDateTime | Updated initial
    OffsetDateTime updatedMax = OffsetDateTime.now(); // OffsetDateTime | Updated finish
    OffsetDateTime startDateMin = OffsetDateTime.now(); // OffsetDateTime | Start date initial
    OffsetDateTime startDateMax = OffsetDateTime.now(); // OffsetDateTime | Start date finish
    OffsetDateTime endDateMin = OffsetDateTime.now(); // OffsetDateTime | End Date initial
    OffsetDateTime endDateMax = OffsetDateTime.now(); // OffsetDateTime | End Date finish
    OffsetDateTime scheduleDateMin = OffsetDateTime.now(); // OffsetDateTime | Schedule Date initial
    OffsetDateTime scheduleDateMax = OffsetDateTime.now(); // OffsetDateTime | Schedule Date finish
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 100; // Integer | Number of items to return
    String order = "asc"; // String | Type of order
    String orderBy = "list_id"; // String | Reference attribute to order campaigns
    try {
      CampaignsCollection result = apiInstance.getAllCampaigns(channel, campaignHash, listId, status, internalName, createdBy, groupId, createdMin, createdMax, updatedMin, updatedMax, startDateMin, startDateMax, endDateMin, endDateMax, scheduleDateMin, scheduleDateMax, offset, limit, order, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignsApi#getAllCampaigns");
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
| **channel** | **String**| Channel of the campaign | [optional] [enum: email, push, sms, smart_sms, voice, web_push] |
| **campaignHash** | **String**| Hash of the campaign | [optional] |
| **listId** | **Integer**| ID of the list where the campaign belongs | [optional] |
| **status** | **String**| Status of the campaign | [optional] [enum: draft, canceled, queued, paused, sending, sent] |
| **internalName** | **String**| Internal name of the campaign | [optional] |
| **createdBy** | **Integer**| ID of the user who created the campaign | [optional] |
| **groupId** | **Integer**| ID of the group where the campaign belongs | [optional] |
| **createdMin** | **OffsetDateTime**| Created initial date | [optional] |
| **createdMax** | **OffsetDateTime**| Created finish | [optional] |
| **updatedMin** | **OffsetDateTime**| Updated initial | [optional] |
| **updatedMax** | **OffsetDateTime**| Updated finish | [optional] |
| **startDateMin** | **OffsetDateTime**| Start date initial | [optional] |
| **startDateMax** | **OffsetDateTime**| Start date finish | [optional] |
| **endDateMin** | **OffsetDateTime**| End Date initial | [optional] |
| **endDateMax** | **OffsetDateTime**| End Date finish | [optional] |
| **scheduleDateMin** | **OffsetDateTime**| Schedule Date initial | [optional] |
| **scheduleDateMax** | **OffsetDateTime**| Schedule Date finish | [optional] |
| **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional] |
| **limit** | **Integer**| Number of items to return | [optional] [default to 100] |
| **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc] |
| **orderBy** | **String**| Reference attribute to order campaigns | [optional] [default to created] [enum: list_id, internal_name, created_by, group_id, created] |

### Return type

[**CampaignsCollection**](CampaignsCollection.md)

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

