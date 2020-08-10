# EcommerceApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCatalog**](EcommerceApi.md#createCatalog) | **POST** /catalogs | Create new catalog
[**createProduct**](EcommerceApi.md#createProduct) | **POST** /catalogs/{catalog_id}/products | Create new product
[**deleteCatalog**](EcommerceApi.md#deleteCatalog) | **DELETE** /catalogs/{catalog_id} | Remove catalog
[**deleteProduct**](EcommerceApi.md#deleteProduct) | **DELETE** /catalogs/{catalog_id}/products/{product_identifier} | Remove product
[**getAllCatalogs**](EcommerceApi.md#getAllCatalogs) | **GET** /catalogs | Get all catalogs
[**getAllProducts**](EcommerceApi.md#getAllProducts) | **GET** /catalogs/{catalog_id}/products | Get all products
[**getProduct**](EcommerceApi.md#getProduct) | **GET** /catalogs/{catalog_id}/products/{product_identifier} | Get product
[**importOrdersBulk**](EcommerceApi.md#importOrdersBulk) | **POST** /lists/{list_id}/orders | Orders import bulk request
[**importProducts**](EcommerceApi.md#importProducts) | **POST** /catalogs/{catalog_id}/products/actions/import | Import products
[**updateProduct**](EcommerceApi.md#updateProduct) | **PATCH** /catalogs/{catalog_id}/products/{product_identifier} | Update product


<a name="createCatalog"></a>
# **createCatalog**
> Catalog createCatalog(catalogPostRequest)

Create new catalog

Creates a new catalog

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    CatalogPostRequest catalogPostRequest = new CatalogPostRequest(); // CatalogPostRequest | Parameters for the Catalog
    try {
      Catalog result = apiInstance.createCatalog(catalogPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#createCatalog");
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
 **catalogPostRequest** | [**CatalogPostRequest**](CatalogPostRequest.md)| Parameters for the Catalog |

### Return type

[**Catalog**](Catalog.md)

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
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="createProduct"></a>
# **createProduct**
> Product createProduct(catalogId, productPostRequest)

Create new product

Creates a new product

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    Integer catalogId = 56; // Integer | ID of the Catalog
    ProductPostRequest productPostRequest = new ProductPostRequest(); // ProductPostRequest | Parameters for the Product
    try {
      Product result = apiInstance.createProduct(catalogId, productPostRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#createProduct");
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
 **catalogId** | **Integer**| ID of the Catalog |
 **productPostRequest** | [**ProductPostRequest**](ProductPostRequest.md)| Parameters for the Product |

### Return type

[**Product**](Product.md)

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
**404** | NotFound |  -  |
**409** | Conflict |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="deleteCatalog"></a>
# **deleteCatalog**
> deleteCatalog(catalogId)

Remove catalog

Remove catalog information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    Integer catalogId = 56; // Integer | ID of the Catalog
    try {
      apiInstance.deleteCatalog(catalogId);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteCatalog");
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
 **catalogId** | **Integer**| ID of the Catalog |

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
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="deleteProduct"></a>
# **deleteProduct**
> deleteProduct(catalogId, productIdentifier)

Remove product

Remove product information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    Integer catalogId = 56; // Integer | ID of the Catalog
    String productIdentifier = "productIdentifier_example"; // String | ID of the Product
    try {
      apiInstance.deleteProduct(catalogId, productIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#deleteProduct");
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
 **catalogId** | **Integer**| ID of the Catalog |
 **productIdentifier** | **String**| ID of the Product |

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
**204** | No Content |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

<a name="getAllCatalogs"></a>
# **getAllCatalogs**
> CatalogCollection getAllCatalogs()

Get all catalogs

Returns all catalogs

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    try {
      CatalogCollection result = apiInstance.getAllCatalogs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getAllCatalogs");
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

[**CatalogCollection**](CatalogCollection.md)

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
**500** | Internal Server Error |  -  |

<a name="getAllProducts"></a>
# **getAllProducts**
> ProductCollection getAllProducts(catalogId, productIdentifier, offset, limit)

Get all products

Returns all products for the given catalog

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    Integer catalogId = 56; // Integer | ID of the Catalog
    String productIdentifier = "productIdentifier_example"; // String | Product ID in your store
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    try {
      ProductCollection result = apiInstance.getAllProducts(catalogId, productIdentifier, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getAllProducts");
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
 **catalogId** | **Integer**| ID of the Catalog |
 **productIdentifier** | **String**| Product ID in your store | [optional]
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]

### Return type

[**ProductCollection**](ProductCollection.md)

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
**404** | NotFound |  -  |
**500** | Internal Server Error |  -  |

<a name="getProduct"></a>
# **getProduct**
> Product getProduct(catalogId, productIdentifier)

Get product

Returns product information given its ID

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    Integer catalogId = 56; // Integer | ID of the Catalog
    String productIdentifier = "productIdentifier_example"; // String | ID of the Product
    try {
      Product result = apiInstance.getProduct(catalogId, productIdentifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#getProduct");
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
 **catalogId** | **Integer**| ID of the Catalog |
 **productIdentifier** | **String**| ID of the Product |

### Return type

[**Product**](Product.md)

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
**500** | Internal Server Error |  -  |

<a name="importOrdersBulk"></a>
# **importOrdersBulk**
> AcceptedResponse importOrdersBulk(listId, importOrdersBulkBulkRequest)

Orders import bulk request

Creates new bulk orders syncronization

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    Integer listId = 56; // Integer | ID of the List
    List<ImportOrdersBulkBulkRequest> importOrdersBulkBulkRequest = Arrays.asList(); // List<ImportOrdersBulkBulkRequest> | Parameters for the Orders
    try {
      AcceptedResponse result = apiInstance.importOrdersBulk(listId, importOrdersBulkBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#importOrdersBulk");
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
 **importOrdersBulkBulkRequest** | [**List&lt;ImportOrdersBulkBulkRequest&gt;**](ImportOrdersBulkBulkRequest.md)| Parameters for the Orders |

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
**404** | NotFound |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="importProducts"></a>
# **importProducts**
> AcceptedResponse importProducts(catalogId, productBulkRequest)

Import products

Imports a collection of products&lt;/br&gt;      **DISCLAIMER:** stream limits applied. [view here](#section/Stream-Limits &#39;Stream Limits&#39;)

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    Integer catalogId = 56; // Integer | ID of the Catalog
    ProductBulkRequest productBulkRequest = new ProductBulkRequest(); // ProductBulkRequest | Parameters for the Product
    try {
      AcceptedResponse result = apiInstance.importProducts(catalogId, productBulkRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#importProducts");
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
 **catalogId** | **Integer**| ID of the Catalog |
 **productBulkRequest** | [**ProductBulkRequest**](ProductBulkRequest.md)| Parameters for the Product |

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
**404** | NotFound |  -  |
**422** | Unprocessable Entity |  -  |
**500** | Internal Server Error |  -  |

<a name="updateProduct"></a>
# **updateProduct**
> Product updateProduct(catalogId, productIdentifier, productPatchRequest)

Update product

Updates a product

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.EcommerceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    EcommerceApi apiInstance = new EcommerceApi(defaultClient);
    Integer catalogId = 56; // Integer | ID of the Catalog
    String productIdentifier = "productIdentifier_example"; // String | ID of the Product
    ProductPatchRequest productPatchRequest = new ProductPatchRequest(); // ProductPatchRequest | Parameters for the product
    try {
      Product result = apiInstance.updateProduct(catalogId, productIdentifier, productPatchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#updateProduct");
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
 **catalogId** | **Integer**| ID of the Catalog |
 **productIdentifier** | **String**| ID of the Product |
 **productPatchRequest** | [**ProductPatchRequest**](ProductPatchRequest.md)| Parameters for the product |

### Return type

[**Product**](Product.md)

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

