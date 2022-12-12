# ConnectedSitesApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createConnectedSites**](ConnectedSitesApi.md#createConnectedSites) | **POST** /connectedsites | Creates a Connected Site |
| [**deleteConnectedSites**](ConnectedSitesApi.md#deleteConnectedSites) | **DELETE** /connectedsites/{domain} | Deletes a Connected Site |
| [**getAllConnectedSites**](ConnectedSitesApi.md#getAllConnectedSites) | **GET** /connectedsites | Get all Connected Sites |
| [**getConnectedSites**](ConnectedSitesApi.md#getConnectedSites) | **GET** /connectedsites/{domain} | Get a Connected Site |


<a name="createConnectedSites"></a>
# **createConnectedSites**
> ConnectedSitesDomainDetail createConnectedSites(connectedSitesDomain)

Creates a Connected Site

Creates a domain usable in Connected Sites

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ConnectedSitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ConnectedSitesApi apiInstance = new ConnectedSitesApi(defaultClient);
    ConnectedSitesDomain connectedSitesDomain = new ConnectedSitesDomain(); // ConnectedSitesDomain | Parameters for new Connected Site
    try {
      ConnectedSitesDomainDetail result = apiInstance.createConnectedSites(connectedSitesDomain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectedSitesApi#createConnectedSites");
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
| **connectedSitesDomain** | [**ConnectedSitesDomain**](ConnectedSitesDomain.md)| Parameters for new Connected Site | |

### Return type

[**ConnectedSitesDomainDetail**](ConnectedSitesDomainDetail.md)

### Authorization

[Apikey](../README.md#Apikey)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="deleteConnectedSites"></a>
# **deleteConnectedSites**
> deleteConnectedSites(domain)

Deletes a Connected Site

Deletes a domain from Connected Sites

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ConnectedSitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ConnectedSitesApi apiInstance = new ConnectedSitesApi(defaultClient);
    String domain = "domain_example"; // String | Domain
    try {
      apiInstance.deleteConnectedSites(domain);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectedSitesApi#deleteConnectedSites");
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
| **domain** | **String**| Domain | |

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
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="getAllConnectedSites"></a>
# **getAllConnectedSites**
> DomainCollection getAllConnectedSites()

Get all Connected Sites

Returns all domains usable in Connected Sites

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ConnectedSitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ConnectedSitesApi apiInstance = new ConnectedSitesApi(defaultClient);
    try {
      DomainCollection result = apiInstance.getAllConnectedSites();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectedSitesApi#getAllConnectedSites");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DomainCollection**](DomainCollection.md)

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

<a name="getConnectedSites"></a>
# **getConnectedSites**
> ConnectedSitesDomainDetail getConnectedSites(domain)

Get a Connected Site

Returns domain info in Connected Sites

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.ConnectedSitesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    ConnectedSitesApi apiInstance = new ConnectedSitesApi(defaultClient);
    String domain = "domain_example"; // String | Domain
    try {
      ConnectedSitesDomainDetail result = apiInstance.getConnectedSites(domain);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectedSitesApi#getConnectedSites");
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
| **domain** | **String**| Domain | |

### Return type

[**ConnectedSitesDomainDetail**](ConnectedSitesDomainDetail.md)

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
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

