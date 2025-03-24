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
 * Contact Urchin Tracking Module (utm) fields
 */
@ApiModel(description = "Contact Urchin Tracking Module (utm) fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T11:21:14.263836Z[Europe/Lisbon]")
public class ContactUtmPostSchemaUtm {
  public static final String SERIALIZED_NAME_UTM_SOURCE = "utm_source";
  @SerializedName(SERIALIZED_NAME_UTM_SOURCE)
  private String utmSource;

  public static final String SERIALIZED_NAME_UTM_MEDIUM = "utm_medium";
  @SerializedName(SERIALIZED_NAME_UTM_MEDIUM)
  private String utmMedium;

  public static final String SERIALIZED_NAME_UTM_CAMPAIGN = "utm_campaign";
  @SerializedName(SERIALIZED_NAME_UTM_CAMPAIGN)
  private String utmCampaign;

  public static final String SERIALIZED_NAME_UTM_CONTENT = "utm_content";
  @SerializedName(SERIALIZED_NAME_UTM_CONTENT)
  private String utmContent;

  public static final String SERIALIZED_NAME_UTM_TERM = "utm_term";
  @SerializedName(SERIALIZED_NAME_UTM_TERM)
  private String utmTerm;

  public ContactUtmPostSchemaUtm() {
  }

  public ContactUtmPostSchemaUtm utmSource(String utmSource) {
    
    this.utmSource = utmSource;
    return this;
  }

   /**
   * Utm source value
   * @return utmSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "source", value = "Utm source value")

  public String getUtmSource() {
    return utmSource;
  }


  public void setUtmSource(String utmSource) {
    this.utmSource = utmSource;
  }


  public ContactUtmPostSchemaUtm utmMedium(String utmMedium) {
    
    this.utmMedium = utmMedium;
    return this;
  }

   /**
   * Utm medium value
   * @return utmMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "medium", value = "Utm medium value")

  public String getUtmMedium() {
    return utmMedium;
  }


  public void setUtmMedium(String utmMedium) {
    this.utmMedium = utmMedium;
  }


  public ContactUtmPostSchemaUtm utmCampaign(String utmCampaign) {
    
    this.utmCampaign = utmCampaign;
    return this;
  }

   /**
   * Utm campaign value
   * @return utmCampaign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "campaign", value = "Utm campaign value")

  public String getUtmCampaign() {
    return utmCampaign;
  }


  public void setUtmCampaign(String utmCampaign) {
    this.utmCampaign = utmCampaign;
  }


  public ContactUtmPostSchemaUtm utmContent(String utmContent) {
    
    this.utmContent = utmContent;
    return this;
  }

   /**
   * Utm content value
   * @return utmContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "content", value = "Utm content value")

  public String getUtmContent() {
    return utmContent;
  }


  public void setUtmContent(String utmContent) {
    this.utmContent = utmContent;
  }


  public ContactUtmPostSchemaUtm utmTerm(String utmTerm) {
    
    this.utmTerm = utmTerm;
    return this;
  }

   /**
   * Utm source value
   * @return utmTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "term", value = "Utm source value")

  public String getUtmTerm() {
    return utmTerm;
  }


  public void setUtmTerm(String utmTerm) {
    this.utmTerm = utmTerm;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactUtmPostSchemaUtm contactUtmPostSchemaUtm = (ContactUtmPostSchemaUtm) o;
    return Objects.equals(this.utmSource, contactUtmPostSchemaUtm.utmSource) &&
        Objects.equals(this.utmMedium, contactUtmPostSchemaUtm.utmMedium) &&
        Objects.equals(this.utmCampaign, contactUtmPostSchemaUtm.utmCampaign) &&
        Objects.equals(this.utmContent, contactUtmPostSchemaUtm.utmContent) &&
        Objects.equals(this.utmTerm, contactUtmPostSchemaUtm.utmTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utmSource, utmMedium, utmCampaign, utmContent, utmTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactUtmPostSchemaUtm {\n");
    sb.append("    utmSource: ").append(toIndentedString(utmSource)).append("\n");
    sb.append("    utmMedium: ").append(toIndentedString(utmMedium)).append("\n");
    sb.append("    utmCampaign: ").append(toIndentedString(utmCampaign)).append("\n");
    sb.append("    utmContent: ").append(toIndentedString(utmContent)).append("\n");
    sb.append("    utmTerm: ").append(toIndentedString(utmTerm)).append("\n");
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
    openapiFields.add("utm_source");
    openapiFields.add("utm_medium");
    openapiFields.add("utm_campaign");
    openapiFields.add("utm_content");
    openapiFields.add("utm_term");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactUtmPostSchemaUtm
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContactUtmPostSchemaUtm.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactUtmPostSchemaUtm is not found in the empty JSON string", ContactUtmPostSchemaUtm.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactUtmPostSchemaUtm.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactUtmPostSchemaUtm` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("utm_source") != null && !jsonObj.get("utm_source").isJsonNull()) && !jsonObj.get("utm_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_source").toString()));
      }
      if ((jsonObj.get("utm_medium") != null && !jsonObj.get("utm_medium").isJsonNull()) && !jsonObj.get("utm_medium").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_medium` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_medium").toString()));
      }
      if ((jsonObj.get("utm_campaign") != null && !jsonObj.get("utm_campaign").isJsonNull()) && !jsonObj.get("utm_campaign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_campaign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_campaign").toString()));
      }
      if ((jsonObj.get("utm_content") != null && !jsonObj.get("utm_content").isJsonNull()) && !jsonObj.get("utm_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_content").toString()));
      }
      if ((jsonObj.get("utm_term") != null && !jsonObj.get("utm_term").isJsonNull()) && !jsonObj.get("utm_term").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `utm_term` to be a primitive type in the JSON string but got `%s`", jsonObj.get("utm_term").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactUtmPostSchemaUtm.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactUtmPostSchemaUtm' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactUtmPostSchemaUtm> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactUtmPostSchemaUtm.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactUtmPostSchemaUtm>() {
           @Override
           public void write(JsonWriter out, ContactUtmPostSchemaUtm value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactUtmPostSchemaUtm read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactUtmPostSchemaUtm given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactUtmPostSchemaUtm
  * @throws IOException if the JSON string is invalid with respect to ContactUtmPostSchemaUtm
  */
  public static ContactUtmPostSchemaUtm fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactUtmPostSchemaUtm.class);
  }

 /**
  * Convert an instance of ContactUtmPostSchemaUtm to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

