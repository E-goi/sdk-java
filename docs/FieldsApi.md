# FieldsApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExtraField**](FieldsApi.md#createExtraField) | **POST** /lists/{list_id}/fields/extra | Create extra field |
| [**createFieldOption**](FieldsApi.md#createFieldOption) | **POST** /lists/{list_id}/fields/extra/{field_id}/options | Create new field option |
| [**deleteExtraField**](FieldsApi.md#deleteExtraField) | **DELETE** /lists/{list_id}/fields/extra/{field_id} | Remove extra field |
| [**deleteFieldOption**](FieldsApi.md#deleteFieldOption) | **DELETE** /lists/{list_id}/fields/extra/{field_id}/options/{option_id} | Deletes an option |
| [**getAllFieldOptions**](FieldsApi.md#getAllFieldOptions) | **GET** /lists/{list_id}/fields/extra/{field_id}/options | Get all field options |
| [**getAllFields**](FieldsApi.md#getAllFields) | **GET** /lists/{list_id}/fields | Get all fields |
| [**patchBaseField**](FieldsApi.md#patchBaseField) | **PATCH** /lists/{list_id}/fields/base/{field_id} | Update base field |
| [**patchExtraField**](FieldsApi.md#patchExtraField) | **PATCH** /lists/{list_id}/fields/extra/{field_id} | Update extra field |
| [**updateFieldOption**](FieldsApi.md#updateFieldOption) | **PATCH** /lists/{list_id}/fields/extra/{field_id}/options/{option_id} | Update field option |


<a name="createExtraField"></a>
# **createExtraField**
> Field createExtraField(listId, field)

Create extra field

Creates an extra field

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    Field field = new Field(); // Field | Parameters for the extra field
    try {
      Field result = apiInstance.createExtraField(listId, field);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#createExtraField");
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
| **field** | [**Field**](Field.md)| Parameters for the extra field | |

### Return type

[**Field**](Field.md)

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
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="createFieldOption"></a>
# **createFieldOption**
> FieldOption createFieldOption(listId, fieldId, fieldOptionPost)

Create new field option

Creates a field option

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    Integer fieldId = 56; // Integer | ID of the Field
    FieldOptionPost fieldOptionPost = new FieldOptionPost(); // FieldOptionPost | Parameters for the field option
    try {
      FieldOption result = apiInstance.createFieldOption(listId, fieldId, fieldOptionPost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#createFieldOption");
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
| **fieldId** | **Integer**| ID of the Field | |
| **fieldOptionPost** | [**FieldOptionPost**](FieldOptionPost.md)| Parameters for the field option | |

### Return type

[**FieldOption**](FieldOption.md)

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
| **404** | Forbidden |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="deleteExtraField"></a>
# **deleteExtraField**
> deleteExtraField(listId, fieldId)

Remove extra field

Removes an extra field given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    Integer fieldId = 56; // Integer | ID of the Field
    try {
      apiInstance.deleteExtraField(listId, fieldId);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#deleteExtraField");
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
| **fieldId** | **Integer**| ID of the Field | |

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

<a name="deleteFieldOption"></a>
# **deleteFieldOption**
> deleteFieldOption(listId, fieldId, optionId)

Deletes an option

Deletes an option of a list of values field

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    Integer fieldId = 56; // Integer | ID of the Field
    Integer optionId = 56; // Integer | ID of the field option
    try {
      apiInstance.deleteFieldOption(listId, fieldId, optionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#deleteFieldOption");
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
| **fieldId** | **Integer**| ID of the Field | |
| **optionId** | **Integer**| ID of the field option | |

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
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="getAllFieldOptions"></a>
# **getAllFieldOptions**
> FieldOptionsCollection getAllFieldOptions(listId, fieldId)

Get all field options

Returns all options of a given field

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    Integer fieldId = 56; // Integer | ID of the Field
    try {
      FieldOptionsCollection result = apiInstance.getAllFieldOptions(listId, fieldId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#getAllFieldOptions");
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
| **fieldId** | **Integer**| ID of the Field | |

### Return type

[**FieldOptionsCollection**](FieldOptionsCollection.md)

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
| **404** | Not Found |  -  |
| **408** | Request Timeout |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="getAllFields"></a>
# **getAllFields**
> FieldCollection getAllFields(listId, offset, limit)

Get all fields

Returns all fields

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    try {
      FieldCollection result = apiInstance.getAllFields(listId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#getAllFields");
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
| **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional] |
| **limit** | **Integer**| Number of items to return | [optional] [default to 10] |

### Return type

[**FieldCollection**](FieldCollection.md)

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

<a name="patchBaseField"></a>
# **patchBaseField**
> Field patchBaseField(listId, fieldId, patchRequestBaseField)

Update base field

Updates a base field

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    String fieldId = "fieldId_example"; // String | ID of the base field
    PatchRequestBaseField patchRequestBaseField = new PatchRequestBaseField(); // PatchRequestBaseField | Parameters for the extra field
    try {
      Field result = apiInstance.patchBaseField(listId, fieldId, patchRequestBaseField);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#patchBaseField");
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
| **fieldId** | **String**| ID of the base field | |
| **patchRequestBaseField** | [**PatchRequestBaseField**](PatchRequestBaseField.md)| Parameters for the extra field | |

### Return type

[**Field**](Field.md)

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

<a name="patchExtraField"></a>
# **patchExtraField**
> Field patchExtraField(listId, fieldId, patchRequestField)

Update extra field

Updates an extra field

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    Integer fieldId = 56; // Integer | ID of the Field
    PatchRequestField patchRequestField = new PatchRequestField(); // PatchRequestField | Parameters for the extra field
    try {
      Field result = apiInstance.patchExtraField(listId, fieldId, patchRequestField);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#patchExtraField");
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
| **fieldId** | **Integer**| ID of the Field | |
| **patchRequestField** | [**PatchRequestField**](PatchRequestField.md)| Parameters for the extra field | |

### Return type

[**Field**](Field.md)

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

<a name="updateFieldOption"></a>
# **updateFieldOption**
> FieldOption updateFieldOption(listId, fieldId, optionId, fieldOptionPost)

Update field option

Updates a field option

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.FieldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    FieldsApi apiInstance = new FieldsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    Integer fieldId = 56; // Integer | ID of the Field
    Integer optionId = 56; // Integer | ID of the field option
    FieldOptionPost fieldOptionPost = new FieldOptionPost(); // FieldOptionPost | Parameters for the field option
    try {
      FieldOption result = apiInstance.updateFieldOption(listId, fieldId, optionId, fieldOptionPost);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FieldsApi#updateFieldOption");
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
| **fieldId** | **Integer**| ID of the Field | |
| **optionId** | **Integer**| ID of the field option | |
| **fieldOptionPost** | [**FieldOptionPost**](FieldOptionPost.md)| Parameters for the field option | |

### Return type

[**FieldOption**](FieldOption.md)

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

