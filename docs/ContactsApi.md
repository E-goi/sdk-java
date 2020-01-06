# ContactsApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionAttachTag**](ContactsApi.md#actionAttachTag) | **POST** /lists/{list_id}/contacts/actions/attach-tag | Attach tag to contact
[**actionDetachTag**](ContactsApi.md#actionDetachTag) | **POST** /lists/{list_id}/contacts/actions/detach-tag | Detach tag to contact
[**actionExportContacts**](ContactsApi.md#actionExportContacts) | **POST** /lists/{list_id}/contacts/actions/export | Exports a list of contacts
[**actionStartAutomation**](ContactsApi.md#actionStartAutomation) | **POST** /lists/{list_id}/contacts/actions/start-automation | Start automation
[**actionUnsubscribeContact**](ContactsApi.md#actionUnsubscribeContact) | **POST** /lists/{list_id}/contacts/actions/unsubscribe | Unsubscribes contacts
[**createContact**](ContactsApi.md#createContact) | **POST** /lists/{list_id}/contacts | Create new contact
[**getAllContactActivities**](ContactsApi.md#getAllContactActivities) | **GET** /lists/{list_id}/contacts/{contact_id}/activities | Get all contact activities
[**getAllContacts**](ContactsApi.md#getAllContacts) | **GET** /lists/{list_id}/contacts | Get all contacts
[**getContact**](ContactsApi.md#getContact) | **GET** /lists/{list_id}/contacts/{contact_id} | Get contact
[**patchContact**](ContactsApi.md#patchContact) | **PATCH** /lists/{list_id}/contacts/{contact_id} | Update a specific contact


<a name="actionAttachTag"></a>
# **actionAttachTag**
> AttachTagResponse actionAttachTag(listId, attachTagRequest)

Attach tag to contact

Attaches a tag to the provided contacts

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

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
**409** | Conflict |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="getAllContacts"></a>
# **getAllContacts**
> ContactCollection getAllContacts(listId, offset, limit)

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
    try {
      ContactCollection result = apiInstance.getAllContacts(listId, offset, limit);
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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

