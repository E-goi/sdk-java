# SendersApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCellphoneSender**](SendersApi.md#createCellphoneSender) | **POST** /senders/cellphone | Create cellphone sender |
| [**createEmailSender**](SendersApi.md#createEmailSender) | **POST** /senders/email | Create email sender |
| [**createPhoneSender**](SendersApi.md#createPhoneSender) | **POST** /senders/phone | Create phone sender |
| [**deleteCellphoneSender**](SendersApi.md#deleteCellphoneSender) | **DELETE** /senders/cellphone/{sender_id} | Remove cellphone sender |
| [**deleteEmailSender**](SendersApi.md#deleteEmailSender) | **DELETE** /senders/email/{sender_id} | Remove email sender |
| [**deletePhoneSender**](SendersApi.md#deletePhoneSender) | **DELETE** /senders/phone/{sender_id} | Remove phone sender |
| [**getAllCellphoneSenders**](SendersApi.md#getAllCellphoneSenders) | **GET** /senders/cellphone | Get all cellphone senders |
| [**getAllEmailSenders**](SendersApi.md#getAllEmailSenders) | **GET** /senders/email | Get all email senders |
| [**getAllPhoneSenders**](SendersApi.md#getAllPhoneSenders) | **GET** /senders/phone | Get all phone senders |
| [**putEmailSender**](SendersApi.md#putEmailSender) | **PUT** /senders/email/{sender_id} | Update email sender |


<a name="createCellphoneSender"></a>
# **createCellphoneSender**
> CellphoneSender createCellphoneSender(cellphoneSenderPost)

Create cellphone sender

Creates a cellphone sender

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    CellphoneSenderPost cellphoneSenderPost = new CellphoneSenderPost(); // CellphoneSenderPost | Parameters for the sender
    try {
      CellphoneSender result = apiInstance.createCellphoneSender(cellphoneSenderPost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#createCellphoneSender");
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
| **cellphoneSenderPost** | [**CellphoneSenderPost**](CellphoneSenderPost.md)| Parameters for the sender | |

### Return type

[**CellphoneSender**](CellphoneSender.md)

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

<a name="createEmailSender"></a>
# **createEmailSender**
> EmailSender createEmailSender(emailSenderPost)

Create email sender

Creates an email sender

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    EmailSenderPost emailSenderPost = new EmailSenderPost(); // EmailSenderPost | Parameters for the sender
    try {
      EmailSender result = apiInstance.createEmailSender(emailSenderPost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#createEmailSender");
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
| **emailSenderPost** | [**EmailSenderPost**](EmailSenderPost.md)| Parameters for the sender | |

### Return type

[**EmailSender**](EmailSender.md)

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

<a name="createPhoneSender"></a>
# **createPhoneSender**
> PhoneSender createPhoneSender(phoneSenderPost)

Create phone sender

Creates a phone sender

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    PhoneSenderPost phoneSenderPost = new PhoneSenderPost(); // PhoneSenderPost | Parameters for the sender
    try {
      PhoneSender result = apiInstance.createPhoneSender(phoneSenderPost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#createPhoneSender");
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
| **phoneSenderPost** | [**PhoneSenderPost**](PhoneSenderPost.md)| Parameters for the sender | |

### Return type

[**PhoneSender**](PhoneSender.md)

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

<a name="deleteCellphoneSender"></a>
# **deleteCellphoneSender**
> deleteCellphoneSender(senderId)

Remove cellphone sender

Remove sender information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    Integer senderId = 56; // Integer | ID of the Sender
    try {
      apiInstance.deleteCellphoneSender(senderId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#deleteCellphoneSender");
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
| **senderId** | **Integer**| ID of the Sender | |

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

<a name="deleteEmailSender"></a>
# **deleteEmailSender**
> deleteEmailSender(senderId)

Remove email sender

Remove sender information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    Integer senderId = 56; // Integer | ID of the Sender
    try {
      apiInstance.deleteEmailSender(senderId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#deleteEmailSender");
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
| **senderId** | **Integer**| ID of the Sender | |

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

<a name="deletePhoneSender"></a>
# **deletePhoneSender**
> deletePhoneSender(senderId)

Remove phone sender

Remove sender information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    Integer senderId = 56; // Integer | ID of the Sender
    try {
      apiInstance.deletePhoneSender(senderId);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#deletePhoneSender");
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
| **senderId** | **Integer**| ID of the Sender | |

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

<a name="getAllCellphoneSenders"></a>
# **getAllCellphoneSenders**
> CellphoneSenderCollection getAllCellphoneSenders(offset, limit, status)

Get all cellphone senders

Returns all cellphone senders

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String status = "active"; // String | Status filter
    try {
      CellphoneSenderCollection result = apiInstance.getAllCellphoneSenders(offset, limit, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#getAllCellphoneSenders");
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
| **status** | **String**| Status filter | [optional] [enum: active, moderation, rejected] |

### Return type

[**CellphoneSenderCollection**](CellphoneSenderCollection.md)

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

<a name="getAllEmailSenders"></a>
# **getAllEmailSenders**
> EmailSenderCollection getAllEmailSenders(offset, limit, status)

Get all email senders

Returns all email senders

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String status = "active"; // String | Status filter
    try {
      EmailSenderCollection result = apiInstance.getAllEmailSenders(offset, limit, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#getAllEmailSenders");
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
| **status** | **String**| Status filter | [optional] [enum: active, moderation, rejected] |

### Return type

[**EmailSenderCollection**](EmailSenderCollection.md)

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

<a name="getAllPhoneSenders"></a>
# **getAllPhoneSenders**
> PhoneSenderCollection getAllPhoneSenders(offset, limit, status)

Get all phone senders

Returns all phone senders

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String status = "active"; // String | Status filter
    try {
      PhoneSenderCollection result = apiInstance.getAllPhoneSenders(offset, limit, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#getAllPhoneSenders");
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
| **status** | **String**| Status filter | [optional] [enum: active, moderation, rejected] |

### Return type

[**PhoneSenderCollection**](PhoneSenderCollection.md)

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

<a name="putEmailSender"></a>
# **putEmailSender**
> EmailSender putEmailSender(senderId, emailSenderPutRequest)

Update email sender

Updates an email sender

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.SendersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    SendersApi apiInstance = new SendersApi(defaultClient);
    Integer senderId = 56; // Integer | ID of the Sender
    EmailSenderPutRequest emailSenderPutRequest = new EmailSenderPutRequest(); // EmailSenderPutRequest | Parameters for the contact
    try {
      EmailSender result = apiInstance.putEmailSender(senderId, emailSenderPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SendersApi#putEmailSender");
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
| **senderId** | **Integer**| ID of the Sender | |
| **emailSenderPutRequest** | [**EmailSenderPutRequest**](EmailSenderPutRequest.md)| Parameters for the contact | |

### Return type

[**EmailSender**](EmailSender.md)

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

