# AdvancedReportsApi

All URIs are relative to *https://api.egoiapp.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateEmailBouncesReport**](AdvancedReportsApi.md#generateEmailBouncesReport) | **POST** /reports/advanced/email-bounces | Generate email bounces report
[**generateEmailClicksByContactReport**](AdvancedReportsApi.md#generateEmailClicksByContactReport) | **POST** /reports/advanced/email-clicks-by-contact | Generate email clicks by contact report
[**generateEmailClicksByUrlReport**](AdvancedReportsApi.md#generateEmailClicksByUrlReport) | **POST** /reports/advanced/email-clicks-by-url | Generate email clicks by URL report
[**generateEmailEventsReport**](AdvancedReportsApi.md#generateEmailEventsReport) | **POST** /reports/advanced/email-events | Generate email events report
[**generateEmailSmsReport**](AdvancedReportsApi.md#generateEmailSmsReport) | **POST** /reports/advanced/sms-bounces | Generate SMS bounces report
[**generateEmailUnsubscriptionsReport**](AdvancedReportsApi.md#generateEmailUnsubscriptionsReport) | **POST** /reports/advanced/email-unsubscriptions | Generate email unsubscriptions report
[**generateFormAnswersReport**](AdvancedReportsApi.md#generateFormAnswersReport) | **POST** /reports/advanced/form-answers | Generate form answers report
[**generateSendsReport**](AdvancedReportsApi.md#generateSendsReport) | **POST** /reports/advanced/sends | Generate sends report
[**generateSmsEventsReport**](AdvancedReportsApi.md#generateSmsEventsReport) | **POST** /reports/advanced/sms-events | Generate SMS events report
[**generateSubscriptionsReport**](AdvancedReportsApi.md#generateSubscriptionsReport) | **POST** /reports/advanced/subscriptions | Generate subscriptions report
[**generateUnsubscriptionsReport**](AdvancedReportsApi.md#generateUnsubscriptionsReport) | **POST** /reports/advanced/unsubscriptions | Generate unsubscriptions report
[**getAllAdvancedReports**](AdvancedReportsApi.md#getAllAdvancedReports) | **GET** /reports/advanced | Get all advanced reports


<a name="generateEmailBouncesReport"></a>
# **generateEmailBouncesReport**
> AcceptedResponse generateEmailBouncesReport(generateEmailBouncesReport)

Generate email bounces report

Generates a new email bounces report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateEmailBouncesReport generateEmailBouncesReport = new GenerateEmailBouncesReport(); // GenerateEmailBouncesReport | Parameters for the email bounces report
    try {
      AcceptedResponse result = apiInstance.generateEmailBouncesReport(generateEmailBouncesReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateEmailBouncesReport");
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
 **generateEmailBouncesReport** | [**GenerateEmailBouncesReport**](GenerateEmailBouncesReport.md)| Parameters for the email bounces report |

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
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateEmailClicksByContactReport"></a>
# **generateEmailClicksByContactReport**
> AcceptedResponse generateEmailClicksByContactReport(generateEmailClicksByContactReport)

Generate email clicks by contact report

Generates a new email clicks by contact report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateEmailClicksByContactReport generateEmailClicksByContactReport = new GenerateEmailClicksByContactReport(); // GenerateEmailClicksByContactReport | Parameters for the email clicks by contact report
    try {
      AcceptedResponse result = apiInstance.generateEmailClicksByContactReport(generateEmailClicksByContactReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateEmailClicksByContactReport");
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
 **generateEmailClicksByContactReport** | [**GenerateEmailClicksByContactReport**](GenerateEmailClicksByContactReport.md)| Parameters for the email clicks by contact report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateEmailClicksByUrlReport"></a>
# **generateEmailClicksByUrlReport**
> AcceptedResponse generateEmailClicksByUrlReport(generateEmailClicksByUrlReport)

Generate email clicks by URL report

Generates a new email clicks by URL report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateEmailClicksByUrlReport generateEmailClicksByUrlReport = new GenerateEmailClicksByUrlReport(); // GenerateEmailClicksByUrlReport | Parameters for the email clicks by URL report
    try {
      AcceptedResponse result = apiInstance.generateEmailClicksByUrlReport(generateEmailClicksByUrlReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateEmailClicksByUrlReport");
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
 **generateEmailClicksByUrlReport** | [**GenerateEmailClicksByUrlReport**](GenerateEmailClicksByUrlReport.md)| Parameters for the email clicks by URL report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateEmailEventsReport"></a>
# **generateEmailEventsReport**
> AcceptedResponse generateEmailEventsReport(generateEmailEventsReport)

Generate email events report

Generates a new email events report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateEmailEventsReport generateEmailEventsReport = new GenerateEmailEventsReport(); // GenerateEmailEventsReport | Parameters for the email events report
    try {
      AcceptedResponse result = apiInstance.generateEmailEventsReport(generateEmailEventsReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateEmailEventsReport");
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
 **generateEmailEventsReport** | [**GenerateEmailEventsReport**](GenerateEmailEventsReport.md)| Parameters for the email events report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateEmailSmsReport"></a>
# **generateEmailSmsReport**
> AcceptedResponse generateEmailSmsReport(generateSmsBouncesReport)

Generate SMS bounces report

Generates a new SMS bounces report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateSmsBouncesReport generateSmsBouncesReport = new GenerateSmsBouncesReport(); // GenerateSmsBouncesReport | Parameters for the SMS bounces report
    try {
      AcceptedResponse result = apiInstance.generateEmailSmsReport(generateSmsBouncesReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateEmailSmsReport");
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
 **generateSmsBouncesReport** | [**GenerateSmsBouncesReport**](GenerateSmsBouncesReport.md)| Parameters for the SMS bounces report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateEmailUnsubscriptionsReport"></a>
# **generateEmailUnsubscriptionsReport**
> AcceptedResponse generateEmailUnsubscriptionsReport(generateEmailUnsubscriptionsReport)

Generate email unsubscriptions report

Generates a new email unsubscriptions report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateEmailUnsubscriptionsReport generateEmailUnsubscriptionsReport = new GenerateEmailUnsubscriptionsReport(); // GenerateEmailUnsubscriptionsReport | Parameters for the email unsubscriptions report
    try {
      AcceptedResponse result = apiInstance.generateEmailUnsubscriptionsReport(generateEmailUnsubscriptionsReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateEmailUnsubscriptionsReport");
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
 **generateEmailUnsubscriptionsReport** | [**GenerateEmailUnsubscriptionsReport**](GenerateEmailUnsubscriptionsReport.md)| Parameters for the email unsubscriptions report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateFormAnswersReport"></a>
# **generateFormAnswersReport**
> AcceptedResponse generateFormAnswersReport(generateFormAnswersReport)

Generate form answers report

Generates a new form answers report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateFormAnswersReport generateFormAnswersReport = new GenerateFormAnswersReport(); // GenerateFormAnswersReport | Parameters for the form answers report
    try {
      AcceptedResponse result = apiInstance.generateFormAnswersReport(generateFormAnswersReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateFormAnswersReport");
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
 **generateFormAnswersReport** | [**GenerateFormAnswersReport**](GenerateFormAnswersReport.md)| Parameters for the form answers report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateSendsReport"></a>
# **generateSendsReport**
> AcceptedResponse generateSendsReport(generateSendsReport)

Generate sends report

Generates a new sends report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateSendsReport generateSendsReport = new GenerateSendsReport(); // GenerateSendsReport | Parameters for the sends report
    try {
      AcceptedResponse result = apiInstance.generateSendsReport(generateSendsReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateSendsReport");
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
 **generateSendsReport** | [**GenerateSendsReport**](GenerateSendsReport.md)| Parameters for the sends report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateSmsEventsReport"></a>
# **generateSmsEventsReport**
> AcceptedResponse generateSmsEventsReport(generateSmsEventsReport)

Generate SMS events report

Generates a new SMS events report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateSmsEventsReport generateSmsEventsReport = new GenerateSmsEventsReport(); // GenerateSmsEventsReport | Parameters for the SMS events report
    try {
      AcceptedResponse result = apiInstance.generateSmsEventsReport(generateSmsEventsReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateSmsEventsReport");
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
 **generateSmsEventsReport** | [**GenerateSmsEventsReport**](GenerateSmsEventsReport.md)| Parameters for the SMS events report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateSubscriptionsReport"></a>
# **generateSubscriptionsReport**
> AcceptedResponse generateSubscriptionsReport(generateSubscriptionsReport)

Generate subscriptions report

Generates a new subscriptions report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateSubscriptionsReport generateSubscriptionsReport = new GenerateSubscriptionsReport(); // GenerateSubscriptionsReport | Parameters for the subscriptions report
    try {
      AcceptedResponse result = apiInstance.generateSubscriptionsReport(generateSubscriptionsReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateSubscriptionsReport");
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
 **generateSubscriptionsReport** | [**GenerateSubscriptionsReport**](GenerateSubscriptionsReport.md)| Parameters for the subscriptions report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="generateUnsubscriptionsReport"></a>
# **generateUnsubscriptionsReport**
> AcceptedResponse generateUnsubscriptionsReport(generateUnsubscriptionsReport)

Generate unsubscriptions report

Generates a new unsubscriptions report

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateUnsubscriptionsReport generateUnsubscriptionsReport = new GenerateUnsubscriptionsReport(); // GenerateUnsubscriptionsReport | Parameters for the unsubscriptions report
    try {
      AcceptedResponse result = apiInstance.generateUnsubscriptionsReport(generateUnsubscriptionsReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateUnsubscriptionsReport");
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
 **generateUnsubscriptionsReport** | [**GenerateUnsubscriptionsReport**](GenerateUnsubscriptionsReport.md)| Parameters for the unsubscriptions report |

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
**408** | Request Timeout |  -  |
**422** | Unprocessable Entity |  -  |
**429** | Too Many Requests |  -  |
**500** | Internal Server Error |  -  |
**503** | Service Unavailable |  -  |

<a name="getAllAdvancedReports"></a>
# **getAllAdvancedReports**
> AdvancedReportsCollection getAllAdvancedReports(status, title, createdMin, createdMax, offset, limit, order, orderBy)

Get all advanced reports

Returns all advanced reports

### Example
```java
// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    String status = "status_example"; // String | Advanced report status
    String title = "title_example"; // String | Advanced report title
    OffsetDateTime createdMin = new OffsetDateTime(); // OffsetDateTime | Created initial date
    OffsetDateTime createdMax = new OffsetDateTime(); // OffsetDateTime | Created finish
    Integer offset = 56; // Integer | Element offset (starting at zero for the first element)
    Integer limit = 10; // Integer | Number of items to return
    String order = "desc"; // String | Type of order
    String orderBy = "advanced_report_id"; // String | Reference attribute to order the advanced reports
    try {
      AdvancedReportsCollection result = apiInstance.getAllAdvancedReports(status, title, createdMin, createdMax, offset, limit, order, orderBy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#getAllAdvancedReports");
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
 **status** | **String**| Advanced report status | [optional] [enum: queued, running, finished, stopped, canceled, paused, error]
 **title** | **String**| Advanced report title | [optional]
 **createdMin** | **OffsetDateTime**| Created initial date | [optional]
 **createdMax** | **OffsetDateTime**| Created finish | [optional]
 **offset** | **Integer**| Element offset (starting at zero for the first element) | [optional]
 **limit** | **Integer**| Number of items to return | [optional] [default to 10]
 **order** | **String**| Type of order | [optional] [default to desc] [enum: asc, desc]
 **orderBy** | **String**| Reference attribute to order the advanced reports | [optional] [default to advanced_report_id] [enum: advanced_report_id, title, created]

### Return type

[**AdvancedReportsCollection**](AdvancedReportsCollection.md)

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

