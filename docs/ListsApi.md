# ListsApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createList**](ListsApi.md#createList) | **POST** /lists | Create new list |
| [**deleteList**](ListsApi.md#deleteList) | **DELETE** /lists/{list_id} | Remove list |
| [**getAllLists**](ListsApi.md#getAllLists) | **GET** /lists | Get all lists |
| [**updateList**](ListsApi.md#updateList) | **PATCH** /lists/{list_id} | Update a specific list |


<a name="createList"></a>
# **createList**
> ModelList createList(postRequestList)

Create new list

Create a new list

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    PostRequestList postRequestList = new PostRequestList(); // PostRequestList | Parameters for the List
    try {
      ModelList result = apiInstance.createList(postRequestList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#createList");
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
| **postRequestList** | [**PostRequestList**](PostRequestList.md)| Parameters for the List | |

### Return type

[**ModelList**](ModelList.md)

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
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="deleteList"></a>
# **deleteList**
> deleteList(listId)

Remove list

Remove list information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    try {
      apiInstance.deleteList(listId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#deleteList");
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
| **listId** | **Integer**| ID of the List | |

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

<a name="getAllLists"></a>
# **getAllLists**
> ListCollection getAllLists(offset, limit, order, orderBy, internalName, publicName, createdMin, createdMax, updatedMin, updatedMax)

Get all lists

Returns all lists

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "asc"; // String | Type of order
    String orderBy = "list_id"; // String | Reference attribute to order lists
    String internalName = "internalName_example"; // String | Internal name of the list
    String publicName = "publicName_example"; // String | Public name of the list
    OffsetDateTime createdMin = OffsetDateTime.now(); // OffsetDateTime | Created initial date
    OffsetDateTime createdMax = OffsetDateTime.now(); // OffsetDateTime | Created finish
    OffsetDateTime updatedMin = OffsetDateTime.now(); // OffsetDateTime | Updated initial
    OffsetDateTime updatedMax = OffsetDateTime.now(); // OffsetDateTime | Updated finish
    try {
      ListCollection result = apiInstance.getAllLists(offset, limit, order, orderBy, internalName, publicName, createdMin, createdMax, updatedMin, updatedMax);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#getAllLists");
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
| **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional] |
| **limit** | **Integer**| Number of items to return | [optional] [default to 10] |
| **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc] |
| **orderBy** | **String**| Reference attribute to order lists | [optional] [default to list_id] [enum: list_id, internal_name, public_name, created, updated] |
| **internalName** | **String**| Internal name of the list | [optional] |
| **publicName** | **String**| Public name of the list | [optional] |
| **createdMin** | **OffsetDateTime**| Created initial date | [optional] |
| **createdMax** | **OffsetDateTime**| Created finish | [optional] |
| **updatedMin** | **OffsetDateTime**| Updated initial | [optional] |
| **updatedMax** | **OffsetDateTime**| Updated finish | [optional] |

### Return type

[**ListCollection**](ListCollection.md)

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

<a name="updateList"></a>
# **updateList**
> ModelList updateList(listId, patchRequestList)

Update a specific list

Update a list

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ListsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ListsApi apiInstance = new ListsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    PatchRequestList patchRequestList = new PatchRequestList(); // PatchRequestList | Parameters for the List
    try {
      ModelList result = apiInstance.updateList(listId, patchRequestList);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListsApi#updateList");
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
| **listId** | **Integer**| ID of the List | |
| **patchRequestList** | [**PatchRequestList**](PatchRequestList.md)| Parameters for the List | |

### Return type

[**ModelList**](ModelList.md)

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

