# SuppressionListApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSuppressionList**](SuppressionListApi.md#getAllSuppressionList) | **GET** /suppression-list | Get the suppression list


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
    String type = "type_example"; // String | Suppression type
    String method = "method_example"; // String | Suppression method
    String value = "value_example"; // String | Reference attribute to value suppression list
    String campaignHash = "campaignHash_example"; // String | Reference attribute to campaign id
    OffsetDateTime createdMin = new OffsetDateTime(); // OffsetDateTime | Created initial date
    OffsetDateTime createdMax = new OffsetDateTime(); // OffsetDateTime | Created finish
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "desc"; // String | Type of order
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

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Suppression type | [optional] [enum: email, email_domain, email_user, cellphone, phone]
 **method** | **String**| Suppression method | [optional] [enum: unsubscribe, bounce, manual, other, forgotten]
 **value** | **String**| Reference attribute to value suppression list | [optional]
 **campaignHash** | **String**| Reference attribute to campaign id | [optional]
 **createdMin** | **OffsetDateTime**| Created initial date | [optional]
 **createdMax** | **OffsetDateTime**| Created finish | [optional]
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc]
 **orderBy** | **String**| Reference attribute to order the suppression list | [optional] [default to id] [enum: id, value, created]

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

