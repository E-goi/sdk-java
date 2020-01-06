# CampaignGroupsApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCampaignGroup**](CampaignGroupsApi.md#createCampaignGroup) | **POST** /campaign-groups | Create new campaign group
[**deleteCampaignGroup**](CampaignGroupsApi.md#deleteCampaignGroup) | **DELETE** /campaign-groups/{group_id} | Remove Campaign Group
[**getAllCampaignGroups**](CampaignGroupsApi.md#getAllCampaignGroups) | **GET** /campaign-groups | Get all campaign groups
[**updateCampaignGroup**](CampaignGroupsApi.md#updateCampaignGroup) | **PUT** /campaign-groups/{group_id} | Update a specific campaign group


<a name="createCampaignGroup"></a>
# **createCampaignGroup**
> CampaignGroup createCampaignGroup(campaignGroup)

Create new campaign group

Create a new campaign group

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.CampaignGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    CampaignGroupsApi apiInstance = new CampaignGroupsApi(defaultClient);
    CampaignGroup campaignGroup = new CampaignGroup(); // CampaignGroup | Parameters for the Campaign Group
    try {
      CampaignGroup result = apiInstance.createCampaignGroup(campaignGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupsApi#createCampaignGroup");
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
 **campaignGroup** | [**CampaignGroup**](CampaignGroup.md)| Parameters for the Campaign Group |

### Return type

[**CampaignGroup**](CampaignGroup.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**409** | Conflict |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="deleteCampaignGroup"></a>
# **deleteCampaignGroup**
> deleteCampaignGroup(groupId)

Remove Campaign Group

Remove campaign group information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.CampaignGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    CampaignGroupsApi apiInstance = new CampaignGroupsApi(defaultClient);
    Integer groupId = 56; // Integer | ID of the Campaign Group
    try {
      apiInstance.deleteCampaignGroup(groupId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupsApi#deleteCampaignGroup");
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
 **groupId** | **Integer**| ID of the Campaign Group |

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

<a name="getAllCampaignGroups"></a>
# **getAllCampaignGroups**
> CampaignGroupCollection getAllCampaignGroups(groupId, name, limit, offset)

Get all campaign groups

Returns all campaign groups

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.CampaignGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    CampaignGroupsApi apiInstance = new CampaignGroupsApi(defaultClient);
    Integer groupId = 56; // Integer | Reference attribute to campaign group id
    String name = "name_example"; // String | Reference attribute to campaign group id
    Integer limit = 10; // Integer | Number of items to return
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    try {
      CampaignGroupCollection result = apiInstance.getAllCampaignGroups(groupId, name, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupsApi#getAllCampaignGroups");
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
 **groupId** | **Integer**| Reference attribute to campaign group id | [optional]
 **name** | **String**| Reference attribute to campaign group id | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]

### Return type

[**CampaignGroupCollection**](CampaignGroupCollection.md)

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

<a name="updateCampaignGroup"></a>
# **updateCampaignGroup**
> CampaignGroup updateCampaignGroup(groupId, campaignGroup)

Update a specific campaign group

Update a campaign group

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.CampaignGroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    CampaignGroupsApi apiInstance = new CampaignGroupsApi(defaultClient);
    Integer groupId = 56; // Integer | ID of the Campaign Group
    CampaignGroup campaignGroup = new CampaignGroup(); // CampaignGroup | Parameters for the Campaign Group
    try {
      CampaignGroup result = apiInstance.updateCampaignGroup(groupId, campaignGroup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignGroupsApi#updateCampaignGroup");
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
 **groupId** | **Integer**| ID of the Campaign Group |
 **campaignGroup** | [**CampaignGroup**](CampaignGroup.md)| Parameters for the Campaign Group |

### Return type

[**CampaignGroup**](CampaignGroup.md)

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

