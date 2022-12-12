# SuppressionListApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSuppressionList**](SuppressionListApi.md#createSuppressionList) | **POST** /suppression-list | Add to suppression list |
| [**deleteSuppressionList**](SuppressionListApi.md#deleteSuppressionList) | **DELETE** /suppression-list/{suppression_id} | Delete from suppression list |
| [**getAllSuppressionList**](SuppressionListApi.md#getAllSuppressionList) | **GET** /suppression-list | Get the suppression list |


<a name="createSuppressionList"></a>
# **createSuppressionList**
> AcceptedResponse createSuppressionList(createSuppressionListRequest)

Add to suppression list

Adds a collection of values to the suppression list

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SuppressionListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SuppressionListApi apiInstance = new SuppressionListApi(defaultClient);
    CreateSuppressionListRequest createSuppressionListRequest = new CreateSuppressionListRequest(); // CreateSuppressionListRequest | Parameters for the request
    try {
      AcceptedResponse result = apiInstance.createSuppressionList(createSuppressionListRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionListApi#createSuppressionList");
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
| **createSuppressionListRequest** | [**CreateSuppressionListRequest**](CreateSuppressionListRequest.md)| Parameters for the request | |

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
| **404** | Not Found |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="deleteSuppressionList"></a>
# **deleteSuppressionList**
> deleteSuppressionList(suppressionId)

Delete from suppression list

Deletes a suppression list value given its ID if it&#39;s creation method was ´manual´

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SuppressionListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SuppressionListApi apiInstance = new SuppressionListApi(defaultClient);
    Integer suppressionId = 56; // Integer | ID of Suppression List
    try {
      apiInstance.deleteSuppressionList(suppressionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionListApi#deleteSuppressionList");
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
| **suppressionId** | **Integer**| ID of Suppression List | |

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

<a name="getAllSuppressionList"></a>
# **getAllSuppressionList**
> SuppressionListItems getAllSuppressionList(type, method, value, campaignHash, createdMin, createdMax, offset, limit, order, orderBy)

Get the suppression list

Returns the suppression list

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SuppressionListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SuppressionListApi apiInstance = new SuppressionListApi(defaultClient);
    String type = "email"; // String | Suppression type
    String method = "unsubscribe"; // String | Suppression method
    String value = "value_example"; // String | Reference attribute to value suppression list
    String campaignHash = "campaignHash_example"; // String | Reference attribute to campaign id
    OffsetDateTime createdMin = OffsetDateTime.now(); // OffsetDateTime | Created initial date
    OffsetDateTime createdMax = OffsetDateTime.now(); // OffsetDateTime | Created finish
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "asc"; // String | Type of order
    String orderBy = "id"; // String | Reference attribute to order the suppression list
    try {
      SuppressionListItems result = apiInstance.getAllSuppressionList(type, method, value, campaignHash, createdMin, createdMax, offset, limit, order, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuppressionListApi#getAllSuppressionList");
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
| **type** | **String**| Suppression type | [optional] [enum: email, email_domain, email_user, cellphone, phone] |
| **method** | **String**| Suppression method | [optional] [enum: unsubscribe, bounce, manual, other, forgotten] |
| **value** | **String**| Reference attribute to value suppression list | [optional] |
| **campaignHash** | **String**| Reference attribute to campaign id | [optional] |
| **createdMin** | **OffsetDateTime**| Created initial date | [optional] |
| **createdMax** | **OffsetDateTime**| Created finish | [optional] |
| **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional] |
| **limit** | **Integer**| Number of items to return | [optional] [default to 10] |
| **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc] |
| **orderBy** | **String**| Reference attribute to order the suppression list | [optional] [default to id] [enum: id, value, created] |

### Return type

[**SuppressionListItems**](SuppressionListItems.md)

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
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

