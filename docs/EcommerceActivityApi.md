# EcommerceActivityApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**importOrdersBulk**](EcommerceActivityApi.md#importOrdersBulk) | **POST** /lists/{list_id}/orders | Orders import bulk request |


<a name="importOrdersBulk"></a>
# **importOrdersBulk**
> AcceptedResponse importOrdersBulk(listId, importOrdersBulkBulkRequest)

Orders import bulk request

Creates new bulk orders syncronization &lt;/br&gt;      **DISCLAIMER:** stream limits applied. [view here](#section/Stream-Limits &#39;Stream Limits&#39;)

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceActivityApi apiInstance = new EcommerceActivityApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    List<ImportOrdersBulkBulkRequest> importOrdersBulkBulkRequest = Arrays.asList(); // List<ImportOrdersBulkBulkRequest> | Parameters for the Orders
    try {
      AcceptedResponse result = apiInstance.importOrdersBulk(listId, importOrdersBulkBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceActivityApi#importOrdersBulk");
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
| **importOrdersBulkBulkRequest** | [**List&lt;ImportOrdersBulkBulkRequest&gt;**](ImportOrdersBulkBulkRequest.md)| Parameters for the Orders | |

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
| **202** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | NotFound |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

