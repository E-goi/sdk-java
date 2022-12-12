# EcommerceApi

All URIs are relative to *https://api.egoiapp.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCart**](EcommerceApi.md#createCart) | **POST** /{domain}/carts | Create cart |
| [**createCatalog**](EcommerceApi.md#createCatalog) | **POST** /catalogs | Create new catalog |
| [**createOrder**](EcommerceApi.md#createOrder) | **POST** /{domain}/orders | Create order |
| [**createProduct**](EcommerceApi.md#createProduct) | **POST** /catalogs/{catalog_id}/products | Create new product |
| [**deleteCatalog**](EcommerceApi.md#deleteCatalog) | **DELETE** /catalogs/{catalog_id} | Remove catalog |
| [**deleteProduct**](EcommerceApi.md#deleteProduct) | **DELETE** /catalogs/{catalog_id}/products/{product_identifier} | Remove product |
| [**getAllCatalogs**](EcommerceApi.md#getAllCatalogs) | **GET** /catalogs | Get all catalogs |
| [**getAllProducts**](EcommerceApi.md#getAllProducts) | **GET** /catalogs/{catalog_id}/products | Get all products |
| [**getProduct**](EcommerceApi.md#getProduct) | **GET** /catalogs/{catalog_id}/products/{product_identifier} | Get product |
| [**importProducts**](EcommerceApi.md#importProducts) | **POST** /catalogs/{catalog_id}/products/actions/import | Import products |
| [**updateProduct**](EcommerceApi.md#updateProduct) | **PATCH** /catalogs/{catalog_id}/products/{product_identifier} | Update product |


<a name="createCart"></a>
# **createCart**
> AcceptedResponse createCart(domain, cart)

Create cart

Creates a new cart. If ***contact_id*** is specified, order will be atached to the contact, if the contact propreties are specified, we&#39;ll create the user, if its already in your list it will get the correct contact (**make sure you are sending atleast all configured list&#39;s unique fields**). This same logic is also applied to the **product_identifier**.

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
    String domain = "domain_example"; // String | Domain
    Cart cart = new Cart(); // Cart | Parameters for the Carts
    try {
      AcceptedResponse result = apiInstance.createCart(domain, cart);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#createCart");
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
| **cart** | [**Cart**](Cart.md)| Parameters for the Carts | |

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
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogPostRequest** | [**CatalogPostRequest**](CatalogPostRequest.md)| Parameters for the Catalog | |

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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="createOrder"></a>
# **createOrder**
> AcceptedResponse createOrder(domain, createOrder)

Create order

Creates a new order. If **contact_id** is specified, order will be atached to the contact, if the contact propreties are specified, we&#39;ll create the user, if its already in your list it will get the correct contact (***make sure you are sending atleast all configured list&#39;s unique fields***). This same logic is also applied to the **product_identifier**.

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
    String domain = "domain_example"; // String | Domain
    CreateOrder createOrder = new CreateOrder(); // CreateOrder | Parameters for the Orders
    try {
      AcceptedResponse result = apiInstance.createOrder(domain, createOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EcommerceApi#createOrder");
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
| **createOrder** | [**CreateOrder**](CreateOrder.md)| Parameters for the Orders | |

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
| **408** | Request Timeout |  -  |
| **413** | Request Entity Too Large |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **Integer**| ID of the Catalog | |
| **productPostRequest** | [**ProductPostRequest**](ProductPostRequest.md)| Parameters for the Product | |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **Integer**| ID of the Catalog | |

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
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **Integer**| ID of the Catalog | |
| **productIdentifier** | **String**| ID of the Product | |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **408** | Request Timeout |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

<a name="getAllProducts"></a>
# **getAllProducts**
> ProductCollection getAllProducts(catalogId, productIdentifier, name, description, sku, upc, ean, gtin, mpn, price, salePrice, brand, customAttributes, offset, limit)

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
    String productIdentifier = "productIdentifier_example"; // String | Filter by product ID in your store
    String name = "name_example"; // String | Filter by name of the product
    String description = "description_example"; // String | Filter by description of the product
    String sku = "sku_example"; // String | Filter by Stock Keeping Unit
    String upc = "upc_example"; // String | Filter by Universal Product Code
    String ean = "ean_example"; // String | Filter by European Article Numbering
    String gtin = "gtin_example"; // String | Filter by Global Trade Item Number
    String mpn = "mpn_example"; // String | Filter by Manufacturer Part Number
    BigDecimal price = new BigDecimal(78); // BigDecimal | Filter by price of the product
    BigDecimal salePrice = new BigDecimal(78); // BigDecimal | Filter by sale price of the product
    String brand = "brand_example"; // String | Filter by brand of the product
    GetAllProductsCustomAttributesParameter customAttributes = new HashMap(); // GetAllProductsCustomAttributesParameter | Filter by custom attributes of products<div><span class='sc-cJSrbW cWGDGi'> Example: </span> <span class='sc-uJMKN cTkJKI'> 'custom_attributes[alias]=value' </span></div>
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    try {
      ProductCollection result = apiInstance.getAllProducts(catalogId, productIdentifier, name, description, sku, upc, ean, gtin, mpn, price, salePrice, brand, customAttributes, offset, limit);
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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **Integer**| ID of the Catalog | |
| **productIdentifier** | **String**| Filter by product ID in your store | [optional] |
| **name** | **String**| Filter by name of the product | [optional] |
| **description** | **String**| Filter by description of the product | [optional] |
| **sku** | **String**| Filter by Stock Keeping Unit | [optional] |
| **upc** | **String**| Filter by Universal Product Code | [optional] |
| **ean** | **String**| Filter by European Article Numbering | [optional] |
| **gtin** | **String**| Filter by Global Trade Item Number | [optional] |
| **mpn** | **String**| Filter by Manufacturer Part Number | [optional] |
| **price** | **BigDecimal**| Filter by price of the product | [optional] |
| **salePrice** | **BigDecimal**| Filter by sale price of the product | [optional] |
| **brand** | **String**| Filter by brand of the product | [optional] |
| **customAttributes** | [**GetAllProductsCustomAttributesParameter**](.md)| Filter by custom attributes of products&lt;div&gt;&lt;span class&#x3D;&#39;sc-cJSrbW cWGDGi&#39;&gt; Example: &lt;/span&gt; &lt;span class&#x3D;&#39;sc-uJMKN cTkJKI&#39;&gt; &#39;custom_attributes[alias]&#x3D;value&#39; &lt;/span&gt;&lt;/div&gt; | [optional] |
| **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional] |
| **limit** | **Integer**| Number of items to return | [optional] [default to 10] |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **Integer**| ID of the Catalog | |
| **productIdentifier** | **String**| ID of the Product | |

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
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **408** | Request Timeout |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **Integer**| ID of the Catalog | |
| **productBulkRequest** | [**ProductBulkRequest**](ProductBulkRequest.md)| Parameters for the Product | |

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
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **408** | Request Timeout |  -  |
| **413** | Payload Too Large |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

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

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **catalogId** | **Integer**| ID of the Catalog | |
| **productIdentifier** | **String**| ID of the Product | |
| **productPatchRequest** | [**ProductPatchRequest**](ProductPatchRequest.md)| Parameters for the product | |

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

