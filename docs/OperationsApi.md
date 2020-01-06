# OperationsApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionApproveOperation**](OperationsApi.md#actionApproveOperation) | **POST** /operations/actions/approve | Approve operation
[**actionCancelOperation**](OperationsApi.md#actionCancelOperation) | **POST** /operations/actions/cancel | Cancel operation
[**actionPauseOperation**](OperationsApi.md#actionPauseOperation) | **POST** /operations/actions/pause | Pause operation
[**actionResumeOperation**](OperationsApi.md#actionResumeOperation) | **POST** /operations/actions/resume | Resume operation
[**getAllOperations**](OperationsApi.md#getAllOperations) | **GET** /operations | Get all queued operations


<a name="actionApproveOperation"></a>
# **actionApproveOperation**
> OperationActionResponse actionApproveOperation(operationActionRequest)

Approve operation

Approves an operation

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    OperationActionRequest operationActionRequest = new OperationActionRequest(); // OperationActionRequest | Parameters for the request
    try {
      OperationActionResponse result = apiInstance.actionApproveOperation(operationActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#actionApproveOperation");
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
 **operationActionRequest** | [**OperationActionRequest**](OperationActionRequest.md)| Parameters for the request |

### Return type

[**OperationActionResponse**](OperationActionResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="actionCancelOperation"></a>
# **actionCancelOperation**
> OperationActionResponse actionCancelOperation(operationActionRequest)

Cancel operation

Cancels an operation

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    OperationActionRequest operationActionRequest = new OperationActionRequest(); // OperationActionRequest | Parameters for the request
    try {
      OperationActionResponse result = apiInstance.actionCancelOperation(operationActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#actionCancelOperation");
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
 **operationActionRequest** | [**OperationActionRequest**](OperationActionRequest.md)| Parameters for the request |

### Return type

[**OperationActionResponse**](OperationActionResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="actionPauseOperation"></a>
# **actionPauseOperation**
> OperationActionResponse actionPauseOperation(operationActionRequest)

Pause operation

Pauses an operation

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    OperationActionRequest operationActionRequest = new OperationActionRequest(); // OperationActionRequest | Parameters for the request
    try {
      OperationActionResponse result = apiInstance.actionPauseOperation(operationActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#actionPauseOperation");
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
 **operationActionRequest** | [**OperationActionRequest**](OperationActionRequest.md)| Parameters for the request |

### Return type

[**OperationActionResponse**](OperationActionResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="actionResumeOperation"></a>
# **actionResumeOperation**
> OperationActionResponse actionResumeOperation(operationActionRequest)

Resume operation

Resumes an operation

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    OperationActionRequest operationActionRequest = new OperationActionRequest(); // OperationActionRequest | Parameters for the request
    try {
      OperationActionResponse result = apiInstance.actionResumeOperation(operationActionRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#actionResumeOperation");
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
 **operationActionRequest** | [**OperationActionRequest**](OperationActionRequest.md)| Parameters for the request |

### Return type

[**OperationActionResponse**](OperationActionResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="getAllOperations"></a>
# **getAllOperations**
> OperationsCollection getAllOperations(type, status, offset, limit, order, orderBy)

Get all queued operations

Returns all operations in queue

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.OperationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    OperationsApi apiInstance = new OperationsApi(defaultClient);
    String type = "type_example"; // String | Operation type
    String status = "status_example"; // String | Operation state
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "desc"; // String | Type of order
    String orderBy = "orderBy_example"; // String | Reference attribute to order operations
    try {
      OperationsCollection result = apiInstance.getAllOperations(type, status, offset, limit, order, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OperationsApi#getAllOperations");
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
 **type** | **String**| Operation type | [optional] [enum: import_contacts, export_contacts, export_reports, advanced_report, email, sms, smart_sms, voice, push, webpush, ads, segment_generation, mass_operation, unify]
 **status** | **String**| Operation state | [optional] [enum: queued, processing, executing, paused]
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc]
 **orderBy** | **String**| Reference attribute to order operations | [optional] [enum: operation_id, created, start_date]

### Return type

[**OperationsCollection**](OperationsCollection.md)

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

