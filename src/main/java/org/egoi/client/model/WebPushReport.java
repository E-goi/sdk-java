/*
 * Marketing API
 *  # Introduction Welcome to the E-goi Marketing API! <br><br>This API enables you to integrate, automate, and manage all the marketing functionalities offered by E-goi. With it, you can interact with contact lists, send email campaigns, SMS, push notifications, and much more. <br><br>Our API is designed to simplify integration in a straightforward, efficient, and secure way, meeting the needs of developers and businesses looking to optimize their digital marketing operations. <br><br>Explore the documentation to discover all the possibilities and start creating integrations that drive your marketing results. # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.  The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.      BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Transport Layer Security (TLS) Transport Layer Security (TLS) is a widely used authentication and encryption protocol that establishes a secure communications channel for data-in-transit while ensuring that the client and server can validate one another.<br> Our API requires TLS 1.2 or TLS 1.3. We recommend <b>TLS 1.3</b>.<br><br> <b>TLS 1.3 ciphers</b> * TLS_AES_256_GCM_SHA384 (0x1302) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_CHACHA20_POLY1305_SHA256 (0x1303) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_AES_128_GCM_SHA256 (0x1301) ECDH x25519 (eq. 3072 bits RSA) FS  <b>TLS 1.2 ciphers</b> * TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 (0xc030) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 (0xc02f) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 (0x9f) DH 4096 bits FS * TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 (0x9e) DH 4096 bits FS  # Rate Limits Rate limits are used to control the amount of traffic that is allowed to flow between the client and the server.<br> This is done to prevent abuse and ensure that the API is available to all users.<br> The rate limits are applied to ensure the stability and security of our API and are based on the number of requests made in a given time period.<br> If the rate limit is exceeded, the API will return a 429 status code and the request will be rejected.<br> Each API response includes headers providing real-time rate limit information: * **X-RateLimit-Limit**: The maximum number of requests that the consumer is permitted to make in a given time period. * **X-RateLimit-Remaining**: The number of requests remaining in the current rate limit window. * **X-RateLimit-Reset**: The remaining time in seconds until the rate limit window resets.  # Account Limit The account limit is a rate limit that is applied to the account as a whole.<br> This limit is applied to all requests made by the account, regardless of the client making the request.<br> The account limit is applied to ensure that the account does not exceed the maximum number of requests allowed in a given time period. Each account has an overall usage limit per hour. If the account limit is exceeded, the API will return a 429 status code and the request will be rejected.<br> Each API response includes headers providing real-time rate limit information: * **X-Account-Limit**: The maximum number of requests that the account is permitted to make in a given time period. * **X-Account-Remaining**: The number of requests remaining in the current rate limit window. * **X-Account-Reset**: The remaining time in seconds until the rate limit window resets.   # Authentication  We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:     #!/bin/bash     curl -X GET 'https://api.egoiapp.com/my-account' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:     #!/bin/bash     curl -X POST 'http://api.egoiapp.com/tags' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>' \\     -H 'Content-Type: application/json' \\     -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB.  # Timeouts Timeouts set a maximum waiting time on a request's response. Our API, sets a default timeout for each request and when breached, you'll receive an HTTP **408 (Request Timeout)** error code. You should take into consideration that response times can vary widely based on the complexity of the request, amount of data being analyzed, and the load on the system and workspace at the time of the query. When dealing with such errors, you should first attempt to reduce the complexity and amount of data under analysis, and only then, if problems are still occurring ask for support.  For all these reasons, the default timeout for each request is **10 Seconds** and any request that creates or modifies data (**POST**, **PATCH** and **PUT**) will have a timeout of **60 Seconds**. Specific timeouts may exist for specific requests, these can be found in the request's documentation.  # Callbacks A callback is an asynchronous API request that originates from the API server and is sent to the client in response to a previous request sent by that client.  The API will make a **POST** request to the address defined in the URL with the information regarding the event of interest and share data related to that event.  <a href='/usecases/callbacks/' target='_blank'>[Go to callbacks documentation]</a>  ***Note:*** Only http or https protocols are supported in the Url parameter.  <security-definitions/>
 *
 * The version of the OpenAPI document: V3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.egoi.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.WebPushReportBrowsersInner;
import org.egoi.client.model.WebPushReportDevicesInner;
import org.egoi.client.model.WebPushReportOperatingSystemsInner;
import org.egoi.client.model.WebPushReportUrlInner;
import org.egoi.client.model.WebPushStats;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.egoi.client.JSON;

/**
 * Webpush report schema
 */
@ApiModel(description = "Webpush report schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-30T16:00:36.862706+01:00[Europe/Lisbon]")
public class WebPushReport {
  public static final String SERIALIZED_NAME_CAMPAIGN_HASH = "campaign_hash";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_HASH)
  private String campaignHash;

  public static final String SERIALIZED_NAME_OVERALL = "overall";
  @SerializedName(SERIALIZED_NAME_OVERALL)
  private WebPushStats overall;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<WebPushReportDevicesInner> devices = null;

  public static final String SERIALIZED_NAME_OPERATING_SYSTEMS = "operating_systems";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEMS)
  private List<WebPushReportOperatingSystemsInner> operatingSystems = null;

  public static final String SERIALIZED_NAME_BROWSERS = "browsers";
  @SerializedName(SERIALIZED_NAME_BROWSERS)
  private List<WebPushReportBrowsersInner> browsers = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private List<WebPushReportUrlInner> url = null;

  public WebPushReport() {
  }

  
  public WebPushReport(
     String campaignHash
  ) {
    this();
    this.campaignHash = campaignHash;
  }

   /**
   * Get campaignHash
   * @return campaignHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCampaignHash() {
    return campaignHash;
  }




  public WebPushReport overall(WebPushStats overall) {
    
    this.overall = overall;
    return this;
  }

   /**
   * Get overall
   * @return overall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebPushStats getOverall() {
    return overall;
  }


  public void setOverall(WebPushStats overall) {
    this.overall = overall;
  }


  public WebPushReport devices(List<WebPushReportDevicesInner> devices) {
    
    this.devices = devices;
    return this;
  }

  public WebPushReport addDevicesItem(WebPushReportDevicesInner devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Stats of the campaign for each device
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stats of the campaign for each device")

  public List<WebPushReportDevicesInner> getDevices() {
    return devices;
  }


  public void setDevices(List<WebPushReportDevicesInner> devices) {
    this.devices = devices;
  }


  public WebPushReport operatingSystems(List<WebPushReportOperatingSystemsInner> operatingSystems) {
    
    this.operatingSystems = operatingSystems;
    return this;
  }

  public WebPushReport addOperatingSystemsItem(WebPushReportOperatingSystemsInner operatingSystemsItem) {
    if (this.operatingSystems == null) {
      this.operatingSystems = new ArrayList<>();
    }
    this.operatingSystems.add(operatingSystemsItem);
    return this;
  }

   /**
   * Stats of the campaign for each operating system
   * @return operatingSystems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stats of the campaign for each operating system")

  public List<WebPushReportOperatingSystemsInner> getOperatingSystems() {
    return operatingSystems;
  }


  public void setOperatingSystems(List<WebPushReportOperatingSystemsInner> operatingSystems) {
    this.operatingSystems = operatingSystems;
  }


  public WebPushReport browsers(List<WebPushReportBrowsersInner> browsers) {
    
    this.browsers = browsers;
    return this;
  }

  public WebPushReport addBrowsersItem(WebPushReportBrowsersInner browsersItem) {
    if (this.browsers == null) {
      this.browsers = new ArrayList<>();
    }
    this.browsers.add(browsersItem);
    return this;
  }

   /**
   * Stats of the campaign for each browser
   * @return browsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stats of the campaign for each browser")

  public List<WebPushReportBrowsersInner> getBrowsers() {
    return browsers;
  }


  public void setBrowsers(List<WebPushReportBrowsersInner> browsers) {
    this.browsers = browsers;
  }


  public WebPushReport url(List<WebPushReportUrlInner> url) {
    
    this.url = url;
    return this;
  }

  public WebPushReport addUrlItem(WebPushReportUrlInner urlItem) {
    if (this.url == null) {
      this.url = new ArrayList<>();
    }
    this.url.add(urlItem);
    return this;
  }

   /**
   * Stats of the campaign for each url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stats of the campaign for each url")

  public List<WebPushReportUrlInner> getUrl() {
    return url;
  }


  public void setUrl(List<WebPushReportUrlInner> url) {
    this.url = url;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebPushReport webPushReport = (WebPushReport) o;
    return Objects.equals(this.campaignHash, webPushReport.campaignHash) &&
        Objects.equals(this.overall, webPushReport.overall) &&
        Objects.equals(this.devices, webPushReport.devices) &&
        Objects.equals(this.operatingSystems, webPushReport.operatingSystems) &&
        Objects.equals(this.browsers, webPushReport.browsers) &&
        Objects.equals(this.url, webPushReport.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignHash, overall, devices, operatingSystems, browsers, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebPushReport {\n");
    sb.append("    campaignHash: ").append(toIndentedString(campaignHash)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
    sb.append("    browsers: ").append(toIndentedString(browsers)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("campaign_hash");
    openapiFields.add("overall");
    openapiFields.add("devices");
    openapiFields.add("operating_systems");
    openapiFields.add("browsers");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WebPushReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WebPushReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WebPushReport is not found in the empty JSON string", WebPushReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WebPushReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WebPushReport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("campaign_hash") != null && !jsonObj.get("campaign_hash").isJsonNull()) && !jsonObj.get("campaign_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_hash").toString()));
      }
      // validate the optional field `overall`
      if (jsonObj.get("overall") != null && !jsonObj.get("overall").isJsonNull()) {
        WebPushStats.validateJsonObject(jsonObj.getAsJsonObject("overall"));
      }
      if (jsonObj.get("devices") != null && !jsonObj.get("devices").isJsonNull()) {
        JsonArray jsonArraydevices = jsonObj.getAsJsonArray("devices");
        if (jsonArraydevices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("devices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `devices` to be an array in the JSON string but got `%s`", jsonObj.get("devices").toString()));
          }

          // validate the optional field `devices` (array)
          for (int i = 0; i < jsonArraydevices.size(); i++) {
            WebPushReportDevicesInner.validateJsonObject(jsonArraydevices.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("operating_systems") != null && !jsonObj.get("operating_systems").isJsonNull()) {
        JsonArray jsonArrayoperatingSystems = jsonObj.getAsJsonArray("operating_systems");
        if (jsonArrayoperatingSystems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("operating_systems").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `operating_systems` to be an array in the JSON string but got `%s`", jsonObj.get("operating_systems").toString()));
          }

          // validate the optional field `operating_systems` (array)
          for (int i = 0; i < jsonArrayoperatingSystems.size(); i++) {
            WebPushReportOperatingSystemsInner.validateJsonObject(jsonArrayoperatingSystems.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("browsers") != null && !jsonObj.get("browsers").isJsonNull()) {
        JsonArray jsonArraybrowsers = jsonObj.getAsJsonArray("browsers");
        if (jsonArraybrowsers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("browsers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `browsers` to be an array in the JSON string but got `%s`", jsonObj.get("browsers").toString()));
          }

          // validate the optional field `browsers` (array)
          for (int i = 0; i < jsonArraybrowsers.size(); i++) {
            WebPushReportBrowsersInner.validateJsonObject(jsonArraybrowsers.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) {
        JsonArray jsonArrayurl = jsonObj.getAsJsonArray("url");
        if (jsonArrayurl != null) {
          // ensure the json data is an array
          if (!jsonObj.get("url").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `url` to be an array in the JSON string but got `%s`", jsonObj.get("url").toString()));
          }

          // validate the optional field `url` (array)
          for (int i = 0; i < jsonArrayurl.size(); i++) {
            WebPushReportUrlInner.validateJsonObject(jsonArrayurl.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WebPushReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WebPushReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WebPushReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WebPushReport.class));

       return (TypeAdapter<T>) new TypeAdapter<WebPushReport>() {
           @Override
           public void write(JsonWriter out, WebPushReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WebPushReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WebPushReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WebPushReport
  * @throws IOException if the JSON string is invalid with respect to WebPushReport
  */
  public static WebPushReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WebPushReport.class);
  }

 /**
  * Convert an instance of WebPushReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

