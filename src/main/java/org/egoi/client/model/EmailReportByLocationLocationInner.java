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
 * EmailReportByLocationLocationInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-30T16:00:36.862706+01:00[Europe/Lisbon]")
public class EmailReportByLocationLocationInner {
  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;

  public static final String SERIALIZED_NAME_OPENS = "opens";
  @SerializedName(SERIALIZED_NAME_OPENS)
  private Integer opens;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Integer clicks;

  public static final String SERIALIZED_NAME_HARD_BOUNCES = "hard_bounces";
  @SerializedName(SERIALIZED_NAME_HARD_BOUNCES)
  private Integer hardBounces;

  public static final String SERIALIZED_NAME_SOFT_BOUNCES = "soft_bounces";
  @SerializedName(SERIALIZED_NAME_SOFT_BOUNCES)
  private Integer softBounces;

  public static final String SERIALIZED_NAME_COMPLAINTS = "complaints";
  @SerializedName(SERIALIZED_NAME_COMPLAINTS)
  private Integer complaints;

  public static final String SERIALIZED_NAME_UNSUBSCRIPTIONS = "unsubscriptions";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIPTIONS)
  private Integer unsubscriptions;

  public EmailReportByLocationLocationInner() {
  }

  public EmailReportByLocationLocationInner location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * Location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Matosinhos", value = "Location")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public EmailReportByLocationLocationInner region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Porto", value = "Region")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public EmailReportByLocationLocationInner country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Portugal", value = "Country")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public EmailReportByLocationLocationInner opens(Integer opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * Total number of open messages
   * minimum: 0
   * @return opens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Total number of open messages")

  public Integer getOpens() {
    return opens;
  }


  public void setOpens(Integer opens) {
    this.opens = opens;
  }


  public EmailReportByLocationLocationInner clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * Total number of clicks in message
   * minimum: 0
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Total number of clicks in message")

  public Integer getClicks() {
    return clicks;
  }


  public void setClicks(Integer clicks) {
    this.clicks = clicks;
  }


  public EmailReportByLocationLocationInner hardBounces(Integer hardBounces) {
    
    this.hardBounces = hardBounces;
    return this;
  }

   /**
   * Total number of hard bounces
   * minimum: 0
   * @return hardBounces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Total number of hard bounces")

  public Integer getHardBounces() {
    return hardBounces;
  }


  public void setHardBounces(Integer hardBounces) {
    this.hardBounces = hardBounces;
  }


  public EmailReportByLocationLocationInner softBounces(Integer softBounces) {
    
    this.softBounces = softBounces;
    return this;
  }

   /**
   * Total number of soft bounces
   * minimum: 0
   * @return softBounces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Total number of soft bounces")

  public Integer getSoftBounces() {
    return softBounces;
  }


  public void setSoftBounces(Integer softBounces) {
    this.softBounces = softBounces;
  }


  public EmailReportByLocationLocationInner complaints(Integer complaints) {
    
    this.complaints = complaints;
    return this;
  }

   /**
   * Total number of complaints
   * minimum: 0
   * @return complaints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Total number of complaints")

  public Integer getComplaints() {
    return complaints;
  }


  public void setComplaints(Integer complaints) {
    this.complaints = complaints;
  }


  public EmailReportByLocationLocationInner unsubscriptions(Integer unsubscriptions) {
    
    this.unsubscriptions = unsubscriptions;
    return this;
  }

   /**
   * Total number of unsubscriptions
   * minimum: 0
   * @return unsubscriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Total number of unsubscriptions")

  public Integer getUnsubscriptions() {
    return unsubscriptions;
  }


  public void setUnsubscriptions(Integer unsubscriptions) {
    this.unsubscriptions = unsubscriptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailReportByLocationLocationInner emailReportByLocationLocationInner = (EmailReportByLocationLocationInner) o;
    return Objects.equals(this.location, emailReportByLocationLocationInner.location) &&
        Objects.equals(this.region, emailReportByLocationLocationInner.region) &&
        Objects.equals(this.country, emailReportByLocationLocationInner.country) &&
        Objects.equals(this.opens, emailReportByLocationLocationInner.opens) &&
        Objects.equals(this.clicks, emailReportByLocationLocationInner.clicks) &&
        Objects.equals(this.hardBounces, emailReportByLocationLocationInner.hardBounces) &&
        Objects.equals(this.softBounces, emailReportByLocationLocationInner.softBounces) &&
        Objects.equals(this.complaints, emailReportByLocationLocationInner.complaints) &&
        Objects.equals(this.unsubscriptions, emailReportByLocationLocationInner.unsubscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, region, country, opens, clicks, hardBounces, softBounces, complaints, unsubscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailReportByLocationLocationInner {\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    hardBounces: ").append(toIndentedString(hardBounces)).append("\n");
    sb.append("    softBounces: ").append(toIndentedString(softBounces)).append("\n");
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    unsubscriptions: ").append(toIndentedString(unsubscriptions)).append("\n");
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
    openapiFields.add("location");
    openapiFields.add("region");
    openapiFields.add("country");
    openapiFields.add("opens");
    openapiFields.add("clicks");
    openapiFields.add("hard_bounces");
    openapiFields.add("soft_bounces");
    openapiFields.add("complaints");
    openapiFields.add("unsubscriptions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailReportByLocationLocationInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmailReportByLocationLocationInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailReportByLocationLocationInner is not found in the empty JSON string", EmailReportByLocationLocationInner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EmailReportByLocationLocationInner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailReportByLocationLocationInner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("region") != null && !jsonObj.get("region").isJsonNull()) && !jsonObj.get("region").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region").toString()));
      }
      if ((jsonObj.get("country") != null && !jsonObj.get("country").isJsonNull()) && !jsonObj.get("country").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `country` to be a primitive type in the JSON string but got `%s`", jsonObj.get("country").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailReportByLocationLocationInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailReportByLocationLocationInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailReportByLocationLocationInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailReportByLocationLocationInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailReportByLocationLocationInner>() {
           @Override
           public void write(JsonWriter out, EmailReportByLocationLocationInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailReportByLocationLocationInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailReportByLocationLocationInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailReportByLocationLocationInner
  * @throws IOException if the JSON string is invalid with respect to EmailReportByLocationLocationInner
  */
  public static EmailReportByLocationLocationInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailReportByLocationLocationInner.class);
  }

 /**
  * Convert an instance of EmailReportByLocationLocationInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

