# CampaignsApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteCampaigns**](CampaignsApi.md#deleteCampaigns) | **DELETE** /campaigns/{campaign_hash} | Remove Campaign
[**getAllCampaigns**](CampaignsApi.md#getAllCampaigns) | **GET** /campaigns | Get all Campaigns


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
    String campaignHash = "campaignHash_example"; // String | ID of the Campaign
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignHash** | **String**| ID of the Campaign |

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
**409** | Conflict |  -  |
**500** | Internal Server Error |  -  |

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
    String channel = "channel_example"; // String | Channel of the campaign
    String campaignHash = "campaignHash_example"; // String | Hash of the campaign
    Integer listId = 56; // Integer | ID of the list where the campaign belongs
    String status = "status_example"; // String | Status of the campaign
    String internalName = "internalName_example"; // String | Internal name of the campaign
    Integer createdBy = 56; // Integer | ID of the user who created the campaign
    Integer groupId = 56; // Integer | ID of the group where the campaign belongs
    OffsetDateTime createdMin = new OffsetDateTime(); // OffsetDateTime | Created initial date
    OffsetDateTime createdMax = new OffsetDateTime(); // OffsetDateTime | Created finish
    OffsetDateTime updatedMin = new OffsetDateTime(); // OffsetDateTime | Updated initial
    OffsetDateTime updatedMax = new OffsetDateTime(); // OffsetDateTime | Updated finish
    LocalDate startDateMin = new LocalDate(); // LocalDate | Start date initial
    LocalDate startDateMax = new LocalDate(); // LocalDate | Start date finish
    LocalDate endDateMin = new LocalDate(); // LocalDate | End Date initial
    LocalDate endDateMax = new LocalDate(); // LocalDate | End Date finish
    LocalDate scheduleDateMin = new LocalDate(); // LocalDate | Schedule Date initial
    LocalDate scheduleDateMax = new LocalDate(); // LocalDate | Schedule Date finish
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "desc"; // String | Type of order
    String orderBy = "created"; // String | Reference attribute to order campaigns
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **channel** | **String**| Channel of the campaign | [optional] [enum: email, push, sms, smart_sms, voice, web_push]
 **campaignHash** | **String**| Hash of the campaign | [optional]
 **listId** | **Integer**| ID of the list where the campaign belongs | [optional]
 **status** | **String**| Status of the campaign | [optional] [enum: draft, canceled, queued, paused, sending, sent]
 **internalName** | **String**| Internal name of the campaign | [optional]
 **createdBy** | **Integer**| ID of the user who created the campaign | [optional]
 **groupId** | **Integer**| ID of the group where the campaign belongs | [optional]
 **createdMin** | **OffsetDateTime**| Created initial date | [optional]
 **createdMax** | **OffsetDateTime**| Created finish | [optional]
 **updatedMin** | **OffsetDateTime**| Updated initial | [optional]
 **updatedMax** | **OffsetDateTime**| Updated finish | [optional]
 **startDateMin** | **LocalDate**| Start date initial | [optional]
 **startDateMax** | **LocalDate**| Start date finish | [optional]
 **endDateMin** | **LocalDate**| End Date initial | [optional]
 **endDateMax** | **LocalDate**| End Date finish | [optional]
 **scheduleDateMin** | **LocalDate**| Schedule Date initial | [optional]
 **scheduleDateMax** | **LocalDate**| Schedule Date finish | [optional]
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc]
 **orderBy** | **String**| Reference attribute to order campaigns | [optional] [default to created] [enum: list_id, internal_name, created_by, group_id, created]

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

