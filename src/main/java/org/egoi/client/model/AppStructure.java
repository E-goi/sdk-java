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
import org.egoi.client.model.AppStructureList;

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
 * Structure of an E-goi app.
 */
@ApiModel(description = "Structure of an E-goi app.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T11:21:14.263836Z[Europe/Lisbon]")
public class AppStructure {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private AppStructureList _list;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TWO_STEPS_CONFIG = "two_steps_config";
  @SerializedName(SERIALIZED_NAME_TWO_STEPS_CONFIG)
  private String twoStepsConfig;

  public static final String SERIALIZED_NAME_DEVELOPMENT = "development";
  @SerializedName(SERIALIZED_NAME_DEVELOPMENT)
  private Boolean development;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private String updated;

  public AppStructure() {
  }

  public AppStructure appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * The ID of the app.
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the app.")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public AppStructure _list(AppStructureList _list) {
    
    this._list = _list;
    return this;
  }

   /**
   * Get _list
   * @return _list
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppStructureList getList() {
    return _list;
  }


  public void setList(AppStructureList _list) {
    this._list = _list;
  }


  public AppStructure name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the app.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the app.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AppStructure description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the app.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the app.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AppStructure twoStepsConfig(String twoStepsConfig) {
    
    this.twoStepsConfig = twoStepsConfig;
    return this;
  }

   /**
   * The column of the list used to map the token.
   * @return twoStepsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The column of the list used to map the token.")

  public String getTwoStepsConfig() {
    return twoStepsConfig;
  }


  public void setTwoStepsConfig(String twoStepsConfig) {
    this.twoStepsConfig = twoStepsConfig;
  }


  public AppStructure development(Boolean development) {
    
    this.development = development;
    return this;
  }

   /**
   * Is app a development app.
   * @return development
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is app a development app.")

  public Boolean getDevelopment() {
    return development;
  }


  public void setDevelopment(Boolean development) {
    this.development = development;
  }


  public AppStructure created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * When the app was created.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the app was created.")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public AppStructure updated(String updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * The last time the app was updated.
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last time the app was updated.")

  public String getUpdated() {
    return updated;
  }


  public void setUpdated(String updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStructure appStructure = (AppStructure) o;
    return Objects.equals(this.appId, appStructure.appId) &&
        Objects.equals(this._list, appStructure._list) &&
        Objects.equals(this.name, appStructure.name) &&
        Objects.equals(this.description, appStructure.description) &&
        Objects.equals(this.twoStepsConfig, appStructure.twoStepsConfig) &&
        Objects.equals(this.development, appStructure.development) &&
        Objects.equals(this.created, appStructure.created) &&
        Objects.equals(this.updated, appStructure.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, _list, name, description, twoStepsConfig, development, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStructure {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    twoStepsConfig: ").append(toIndentedString(twoStepsConfig)).append("\n");
    sb.append("    development: ").append(toIndentedString(development)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("list");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("two_steps_config");
    openapiFields.add("development");
    openapiFields.add("created");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AppStructure
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AppStructure.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AppStructure is not found in the empty JSON string", AppStructure.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AppStructure.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AppStructure` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("app_id") != null && !jsonObj.get("app_id").isJsonNull()) && !jsonObj.get("app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_id").toString()));
      }
      // validate the optional field `list`
      if (jsonObj.get("list") != null && !jsonObj.get("list").isJsonNull()) {
        AppStructureList.validateJsonObject(jsonObj.getAsJsonObject("list"));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("two_steps_config") != null && !jsonObj.get("two_steps_config").isJsonNull()) && !jsonObj.get("two_steps_config").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `two_steps_config` to be a primitive type in the JSON string but got `%s`", jsonObj.get("two_steps_config").toString()));
      }
      if ((jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) && !jsonObj.get("created").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `created` to be a primitive type in the JSON string but got `%s`", jsonObj.get("created").toString()));
      }
      if ((jsonObj.get("updated") != null && !jsonObj.get("updated").isJsonNull()) && !jsonObj.get("updated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updated").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AppStructure.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AppStructure' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AppStructure> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AppStructure.class));

       return (TypeAdapter<T>) new TypeAdapter<AppStructure>() {
           @Override
           public void write(JsonWriter out, AppStructure value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AppStructure read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AppStructure given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AppStructure
  * @throws IOException if the JSON string is invalid with respect to AppStructure
  */
  public static AppStructure fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AppStructure.class);
  }

 /**
  * Convert an instance of AppStructure to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

