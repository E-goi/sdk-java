# ContactsApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionActivateContacts**](ContactsApi.md#actionActivateContacts) | **POST** /lists/{list_id}/contacts/actions/activate | Activate contacts
[**actionAttachTag**](ContactsApi.md#actionAttachTag) | **POST** /lists/{list_id}/contacts/actions/attach-tag | Attach tag to contact
[**actionDeactivateContacts**](ContactsApi.md#actionDeactivateContacts) | **POST** /lists/{list_id}/contacts/actions/deactivate | Deactivate contacts
[**actionDetachTag**](ContactsApi.md#actionDetachTag) | **POST** /lists/{list_id}/contacts/actions/detach-tag | Detach tag to contact
[**actionExportContacts**](ContactsApi.md#actionExportContacts) | **POST** /lists/{list_id}/contacts/actions/export | Exports a list of contacts
[**actionForgetContacts**](ContactsApi.md#actionForgetContacts) | **POST** /lists/{list_id}/contacts/actions/forget | Forget contacts
[**actionImportBulk**](ContactsApi.md#actionImportBulk) | **POST** /lists/{list_id}/contacts/actions/import-bulk | Import collection of contacts
[**actionStartAutomation**](ContactsApi.md#actionStartAutomation) | **POST** /lists/{list_id}/contacts/actions/start-automation | Start automation
[**actionUnsubscribeContact**](ContactsApi.md#actionUnsubscribeContact) | **POST** /lists/{list_id}/contacts/actions/unsubscribe | Unsubscribes contacts
[**createContact**](ContactsApi.md#createContact) | **POST** /lists/{list_id}/contacts | Create new contact
[**getAllContactActivities**](ContactsApi.md#getAllContactActivities) | **GET** /lists/{list_id}/contacts/{contact_id}/activities | Get all contact activities
[**getAllContacts**](ContactsApi.md#getAllContacts) | **GET** /lists/{list_id}/contacts | Get all contacts
[**getAllContactsBySegment**](ContactsApi.md#getAllContactsBySegment) | **GET** /lists/{list_id}/contacts/segment/{segment_id} | Get all contacts by Segment Id
[**getContact**](ContactsApi.md#getContact) | **GET** /lists/{list_id}/contacts/{contact_id} | Get contact
[**patchContact**](ContactsApi.md#patchContact) | **PATCH** /lists/{list_id}/contacts/{contact_id} | Update a specific contact
[**searchContacts**](ContactsApi.md#searchContacts) | **GET** /contacts/search | Search contact


<a name="actionActivateContacts"></a>
# **actionActivateContacts**
> AcceptedResponse actionActivateContacts(listId, activateContactsRequest)

Activate contacts

Activates a collection of contacts (does not apply to removed contacts)

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    ActivateContactsRequest activateContactsRequest = new ActivateContactsRequest(); // ActivateContactsRequest | Parameters for the request
    try {
      AcceptedResponse result = apiInstance.actionActivateContacts(listId, activateContactsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#actionActivateContacts");
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
 **listId** | **Integer**| ID of the List |
 **activateContactsRequest** | [**ActivateContactsRequest**](ActivateContactsRequest.md)| Parameters for the request |

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
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="actionAttachTag"></a>
# **actionAttachTag**
> AttachTagResponse actionAttachTag(listId, attachTagRequest)

Attach tag to contact

Attaches a tag to the provided contacts. &lt;br&gt;***Note:***&lt;br&gt; If you provide the array of **contacts** there will be a maximum limit of 1000 contacts in the payload, but if you provide a **segment_id** instead of     the array of contacts you will get an asynchronous response with the status code 202

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    AttachTagRequest attachTagRequest = new AttachTagRequest(); // AttachTagRequest | Parameters for the Tag
    try {
      AttachTagResponse result = apiInstance.actionAttachTag(listId, attachTagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#actionAttachTag");
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
 **listId** | **Integer**| ID of the List |
 **attachTagRequest** | [**AttachTagRequest**](AttachTagRequest.md)| Parameters for the Tag |

### Return type

[**AttachTagResponse**](AttachTagResponse.md)

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="actionDeactivateContacts"></a>
# **actionDeactivateContacts**
> AcceptedResponse actionDeactivateContacts(listId, deactivateContactsRequest)

Deactivate contacts

Deactivates a collection of contacts (does not apply to removed contacts)

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    DeactivateContactsRequest deactivateContactsRequest = new DeactivateContactsRequest(); // DeactivateContactsRequest | Parameters for the request
    try {
      AcceptedResponse result = apiInstance.actionDeactivateContacts(listId, deactivateContactsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#actionDeactivateContacts");
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
 **listId** | **Integer**| ID of the List |
 **deactivateContactsRequest** | [**DeactivateContactsRequest**](DeactivateContactsRequest.md)| Parameters for the request |

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
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="actionDetachTag"></a>
# **actionDetachTag**
> AttachTagResponse actionDetachTag(listId, attachTagRequest)

Detach tag to contact

Detach a tag to the provided contacts

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    AttachTagRequest attachTagRequest = new AttachTagRequest(); // AttachTagRequest | Parameters for the Tag
    try {
      AttachTagResponse result = apiInstance.actionDetachTag(listId, attachTagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#actionDetachTag");
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
 **listId** | **Integer**| ID of the List |
 **attachTagRequest** | [**AttachTagRequest**](AttachTagRequest.md)| Parameters for the Tag |

### Return type

[**AttachTagResponse**](AttachTagResponse.md)

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="actionExportContacts"></a>
# **actionExportContacts**
> AcceptedResponse actionExportContacts(listId, contactExportRequest)

Exports a list of contacts

Exports a list of contacts to the desired callback url

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    ContactExportRequest contactExportRequest = new ContactExportRequest(); // ContactExportRequest | Parameters for export
    try {
      AcceptedResponse result = apiInstance.actionExportContacts(listId, contactExportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#actionExportContacts");
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
 **listId** | **Integer**| ID of the List |
 **contactExportRequest** | [**ContactExportRequest**](ContactExportRequest.md)| Parameters for export |

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
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="actionForgetContacts"></a>
# **actionForgetContacts**
> AcceptedResponse actionForgetContacts(listId, contactForgetRequest)

Forget contacts

Forgets a list of contacts to the desired callback url

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    ContactForgetRequest contactForgetRequest = new ContactForgetRequest(); // ContactForgetRequest | Parameters for the action
    try {
      AcceptedResponse result = apiInstance.actionForgetContacts(listId, contactForgetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#actionForgetContacts");
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
 **listId** | **Integer**| ID of the List |
 **contactForgetRequest** | [**ContactForgetRequest**](ContactForgetRequest.md)| Parameters for the action |

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
**202** | Accepted |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="actionImportBulk"></a>
# **actionImportBulk**
> AcceptedResponse actionImportBulk(listId, importBulkRequest)

Import collection of contacts

Imports a collection of contacts &lt;/br&gt;      **DISCLAIMER:** stream limits applied. [view here](#section/Stream-Limits &#39;Stream Limits&#39;)&lt;br&gt; ***Note:*** minimum of 2 contacts to use this method. [use Create new contact method instead](#operation/createContact &#39;Create new contact&#39;)

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    ImportBulkRequest importBulkRequest = new ImportBulkRequest(); // ImportBulkRequest | Parameters for the bulk import
    try {
      AcceptedResponse result = apiInstance.actionImportBulk(listId, importBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#actionImportBulk");
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
 **listId** | **Integer**| ID of the List |
 **importBulkRequest** | [**ImportBulkRequest**](ImportBulkRequest.md)| Parameters for the bulk import |

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
**202** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="actionStartAutomation"></a>
# **actionStartAutomation**
> StartAutomationResponse actionStartAutomation(listId, startAutomationRequest)

Start automation

Start automation to the provided contacts

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    StartAutomationRequest startAutomationRequest = new StartAutomationRequest(); // StartAutomationRequest | Parameters for the operation to start automation
    try {
      StartAutomationResponse result = apiInstance.actionStartAutomation(listId, startAutomationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#actionStartAutomation");
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
 **listId** | **Integer**| ID of the List |
 **startAutomationRequest** | [**StartAutomationRequest**](StartAutomationRequest.md)| Parameters for the operation to start automation |

### Return type

[**StartAutomationResponse**](StartAutomationResponse.md)

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="actionUnsubscribeContact"></a>
# **actionUnsubscribeContact**
> RemoveResponse actionUnsubscribeContact(listId, removeRequest)

Unsubscribes contacts

Unsubscribes contacts

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    RemoveRequest removeRequest = new RemoveRequest(); // RemoveRequest | Parameters for the contact to unsubscribe
    try {
      RemoveResponse result = apiInstance.actionUnsubscribeContact(listId, removeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#actionUnsubscribeContact");
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
 **listId** | **Integer**| ID of the List |
 **removeRequest** | [**RemoveRequest**](RemoveRequest.md)| Parameters for the contact to unsubscribe |

### Return type

[**RemoveResponse**](RemoveResponse.md)

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="createContact"></a>
# **createContact**
> CreateContactResponse createContact(listId, contactBaseExtra)

Create new contact

Create a new contact

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the list where the contact belongs
    ContactBaseExtra contactBaseExtra = new ContactBaseExtra(); // ContactBaseExtra | Parameters for the Contact
    try {
      CreateContactResponse result = apiInstance.createContact(listId, contactBaseExtra);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createContact");
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
 **listId** | **Integer**| ID of the list where the contact belongs |
 **contactBaseExtra** | [**ContactBaseExtra**](ContactBaseExtra.md)| Parameters for the Contact |

### Return type

[**CreateContactResponse**](CreateContactResponse.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**409** | Conflict |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="getAllContactActivities"></a>
# **getAllContactActivities**
> ActivityCollection getAllContactActivities(contactId, listId, offset, limit, dateMin, dateMax)

Get all contact activities

Returns all contact activities

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String contactId = "contactId_example"; // String | ID of the Contact
    Integer listId = 56; // Integer | ID of the List
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    OffsetDateTime dateMin = new OffsetDateTime(); // OffsetDateTime | Start date
    OffsetDateTime dateMax = new OffsetDateTime(); // OffsetDateTime | End date
    try {
      ActivityCollection result = apiInstance.getAllContactActivities(contactId, listId, offset, limit, dateMin, dateMax);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getAllContactActivities");
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
 **contactId** | **String**| ID of the Contact |
 **listId** | **Integer**| ID of the List |
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **dateMin** | **OffsetDateTime**| Start date | [optional]
 **dateMax** | **OffsetDateTime**| End date | [optional]

### Return type

[**ActivityCollection**](ActivityCollection.md)

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="getAllContacts"></a>
# **getAllContacts**
> ContactCollection getAllContacts(listId, offset, limit, firstName, lastName, email, emailStatus, cellphone, cellphoneStatus, phone, phoneStatus, birthDate, language, extraFieldId)

Get all contacts

Returns all contacts

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String firstName = "firstName_example"; // String | First name of the contacts to return
    String lastName = "lastName_example"; // String | Last name of the contacts to return
    String email = "email_example"; // String | Email of the contacts to return
    Boolean emailStatus = true; // Boolean | EmailStatus of the contacts to return
    String cellphone = "cellphone_example"; // String | Cellphone of the contacts to return
    Boolean cellphoneStatus = true; // Boolean | CellphoneStatus of the contacts to return
    String phone = "phone_example"; // String | Phone of the contacts to return
    Boolean phoneStatus = true; // Boolean | PhoneStatus of the contacts to return
    LocalDate birthDate = new LocalDate(); // LocalDate | Birth date of the contacts to return
    String language = "language_example"; // String | Language date of the contacts to return
    List<String> extraFieldId = Arrays.asList(); // List<String> | Extra field of contacts, extra_field_id[field_id]=value
    try {
      ContactCollection result = apiInstance.getAllContacts(listId, offset, limit, firstName, lastName, email, emailStatus, cellphone, cellphoneStatus, phone, phoneStatus, birthDate, language, extraFieldId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getAllContacts");
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
 **listId** | **Integer**| ID of the List |
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **firstName** | **String**| First name of the contacts to return | [optional]
 **lastName** | **String**| Last name of the contacts to return | [optional]
 **email** | **String**| Email of the contacts to return | [optional]
 **emailStatus** | **Boolean**| EmailStatus of the contacts to return | [optional]
 **cellphone** | **String**| Cellphone of the contacts to return | [optional]
 **cellphoneStatus** | **Boolean**| CellphoneStatus of the contacts to return | [optional]
 **phone** | **String**| Phone of the contacts to return | [optional]
 **phoneStatus** | **Boolean**| PhoneStatus of the contacts to return | [optional]
 **birthDate** | [**LocalDate**](.md)| Birth date of the contacts to return | [optional] [default to null]
 **language** | **String**| Language date of the contacts to return | [optional] [enum: pt, en, es, br, fr, de]
 **extraFieldId** | [**List&lt;String&gt;**](String.md)| Extra field of contacts, extra_field_id[field_id]&#x3D;value | [optional]

### Return type

[**ContactCollection**](ContactCollection.md)

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
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="getAllContactsBySegment"></a>
# **getAllContactsBySegment**
> ContactCollection getAllContactsBySegment(listId, segmentId, offset, limit, showRemoved)

Get all contacts by Segment Id

Returns all contacts filtered by Segment Id

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    String segmentId = "segmentId_example"; // String | ID of the Segment
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    Boolean showRemoved = false; // Boolean | Show removed contacts
    try {
      ContactCollection result = apiInstance.getAllContactsBySegment(listId, segmentId, offset, limit, showRemoved);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getAllContactsBySegment");
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
 **listId** | **Integer**| ID of the List |
 **segmentId** | **String**| ID of the Segment |
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **showRemoved** | **Boolean**| Show removed contacts | [optional] [default to false]

### Return type

[**ContactCollection**](ContactCollection.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="getContact"></a>
# **getContact**
> ComplexContact getContact(contactId, listId)

Get contact

Returns contact information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String contactId = "contactId_example"; // String | ID of the Contact
    Integer listId = 56; // Integer | ID of the List
    try {
      ComplexContact result = apiInstance.getContact(contactId, listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getContact");
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
 **contactId** | **String**| ID of the Contact |
 **listId** | **Integer**| ID of the List |

### Return type

[**ComplexContact**](ComplexContact.md)

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
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="patchContact"></a>
# **patchContact**
> CreateContactResponse patchContact(contactId, listId, contactBaseStatusExtra)

Update a specific contact

Update contact

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String contactId = "contactId_example"; // String | ID of the Contact
    Integer listId = 56; // Integer | ID of the List
    ContactBaseStatusExtra contactBaseStatusExtra = new ContactBaseStatusExtra(); // ContactBaseStatusExtra | Parameters for the contact
    try {
      CreateContactResponse result = apiInstance.patchContact(contactId, listId, contactBaseStatusExtra);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#patchContact");
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
 **contactId** | **String**| ID of the Contact |
 **listId** | **Integer**| ID of the List |
 **contactBaseStatusExtra** | [**ContactBaseStatusExtra**](ContactBaseStatusExtra.md)| Parameters for the contact |

### Return type

[**CreateContactResponse**](CreateContactResponse.md)

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="searchContacts"></a>
# **searchContacts**
> InlineResponse200 searchContacts(contact, type)

Search contact

Searches a contact across all lists and returns a collection of contacts found

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ContactsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ContactsApi apiInstance = new ContactsApi(defaultClient);
    String contact = "contact_example"; // String | Contact to search
    String type = "email"; // String | Type of contact to search (defaults to 'email')
    try {
      InlineResponse200 result = apiInstance.searchContacts(contact, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#searchContacts");
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
 **contact** | **String**| Contact to search |
 **type** | **String**| Type of contact to search (defaults to &#39;email&#39;) | [optional] [default to email] [enum: email, cellphone, phone]

### Return type

[**InlineResponse200**](InlineResponse200.md)

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
**404** | Not Found |  -  |
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

