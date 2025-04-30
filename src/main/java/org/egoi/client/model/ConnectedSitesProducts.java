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
import org.egoi.client.model.ConnectedSitesEmbedForm;
import org.egoi.client.model.ConnectedSitesGeneralProductAppDetailGlobal;
import org.egoi.client.model.ConnectedSitesGeneralProductFormDetailGlobal;
import org.egoi.client.model.ConnectedSitesGeneralProductTEDetailGlobal;

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
 * Connected Sites Products
 */
@ApiModel(description = "Connected Sites Products")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-30T16:00:36.862706+01:00[Europe/Lisbon]")
public class ConnectedSitesProducts {
  public static final String SERIALIZED_NAME_TRACK_AND_ENGAGE = "track_and_engage";
  @SerializedName(SERIALIZED_NAME_TRACK_AND_ENGAGE)
  private ConnectedSitesGeneralProductTEDetailGlobal trackAndEngage;

  public static final String SERIALIZED_NAME_ON_SITE_MESSAGE = "on_site_message";
  @SerializedName(SERIALIZED_NAME_ON_SITE_MESSAGE)
  private ConnectedSitesGeneralProductFormDetailGlobal onSiteMessage;

  public static final String SERIALIZED_NAME_POPUP_FORMS = "popup_forms";
  @SerializedName(SERIALIZED_NAME_POPUP_FORMS)
  private ConnectedSitesGeneralProductFormDetailGlobal popupForms;

  public static final String SERIALIZED_NAME_WHATSAPP = "whatsapp";
  @SerializedName(SERIALIZED_NAME_WHATSAPP)
  private ConnectedSitesGeneralProductFormDetailGlobal whatsapp;

  public static final String SERIALIZED_NAME_WEB_PUSH = "web_push";
  @SerializedName(SERIALIZED_NAME_WEB_PUSH)
  private ConnectedSitesGeneralProductAppDetailGlobal webPush;

  public static final String SERIALIZED_NAME_EMBED_FORMS = "embed_forms";
  @SerializedName(SERIALIZED_NAME_EMBED_FORMS)
  private ConnectedSitesEmbedForm embedForms;

  public ConnectedSitesProducts() {
  }

  public ConnectedSitesProducts trackAndEngage(ConnectedSitesGeneralProductTEDetailGlobal trackAndEngage) {
    
    this.trackAndEngage = trackAndEngage;
    return this;
  }

   /**
   * Get trackAndEngage
   * @return trackAndEngage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectedSitesGeneralProductTEDetailGlobal getTrackAndEngage() {
    return trackAndEngage;
  }


  public void setTrackAndEngage(ConnectedSitesGeneralProductTEDetailGlobal trackAndEngage) {
    this.trackAndEngage = trackAndEngage;
  }


  public ConnectedSitesProducts onSiteMessage(ConnectedSitesGeneralProductFormDetailGlobal onSiteMessage) {
    
    this.onSiteMessage = onSiteMessage;
    return this;
  }

   /**
   * Get onSiteMessage
   * @return onSiteMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectedSitesGeneralProductFormDetailGlobal getOnSiteMessage() {
    return onSiteMessage;
  }


  public void setOnSiteMessage(ConnectedSitesGeneralProductFormDetailGlobal onSiteMessage) {
    this.onSiteMessage = onSiteMessage;
  }


  public ConnectedSitesProducts popupForms(ConnectedSitesGeneralProductFormDetailGlobal popupForms) {
    
    this.popupForms = popupForms;
    return this;
  }

   /**
   * Get popupForms
   * @return popupForms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectedSitesGeneralProductFormDetailGlobal getPopupForms() {
    return popupForms;
  }


  public void setPopupForms(ConnectedSitesGeneralProductFormDetailGlobal popupForms) {
    this.popupForms = popupForms;
  }


  public ConnectedSitesProducts whatsapp(ConnectedSitesGeneralProductFormDetailGlobal whatsapp) {
    
    this.whatsapp = whatsapp;
    return this;
  }

   /**
   * Get whatsapp
   * @return whatsapp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectedSitesGeneralProductFormDetailGlobal getWhatsapp() {
    return whatsapp;
  }


  public void setWhatsapp(ConnectedSitesGeneralProductFormDetailGlobal whatsapp) {
    this.whatsapp = whatsapp;
  }


  public ConnectedSitesProducts webPush(ConnectedSitesGeneralProductAppDetailGlobal webPush) {
    
    this.webPush = webPush;
    return this;
  }

   /**
   * Get webPush
   * @return webPush
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectedSitesGeneralProductAppDetailGlobal getWebPush() {
    return webPush;
  }


  public void setWebPush(ConnectedSitesGeneralProductAppDetailGlobal webPush) {
    this.webPush = webPush;
  }


  public ConnectedSitesProducts embedForms(ConnectedSitesEmbedForm embedForms) {
    
    this.embedForms = embedForms;
    return this;
  }

   /**
   * Get embedForms
   * @return embedForms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectedSitesEmbedForm getEmbedForms() {
    return embedForms;
  }


  public void setEmbedForms(ConnectedSitesEmbedForm embedForms) {
    this.embedForms = embedForms;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectedSitesProducts connectedSitesProducts = (ConnectedSitesProducts) o;
    return Objects.equals(this.trackAndEngage, connectedSitesProducts.trackAndEngage) &&
        Objects.equals(this.onSiteMessage, connectedSitesProducts.onSiteMessage) &&
        Objects.equals(this.popupForms, connectedSitesProducts.popupForms) &&
        Objects.equals(this.whatsapp, connectedSitesProducts.whatsapp) &&
        Objects.equals(this.webPush, connectedSitesProducts.webPush) &&
        Objects.equals(this.embedForms, connectedSitesProducts.embedForms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trackAndEngage, onSiteMessage, popupForms, whatsapp, webPush, embedForms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectedSitesProducts {\n");
    sb.append("    trackAndEngage: ").append(toIndentedString(trackAndEngage)).append("\n");
    sb.append("    onSiteMessage: ").append(toIndentedString(onSiteMessage)).append("\n");
    sb.append("    popupForms: ").append(toIndentedString(popupForms)).append("\n");
    sb.append("    whatsapp: ").append(toIndentedString(whatsapp)).append("\n");
    sb.append("    webPush: ").append(toIndentedString(webPush)).append("\n");
    sb.append("    embedForms: ").append(toIndentedString(embedForms)).append("\n");
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
    openapiFields.add("track_and_engage");
    openapiFields.add("on_site_message");
    openapiFields.add("popup_forms");
    openapiFields.add("whatsapp");
    openapiFields.add("web_push");
    openapiFields.add("embed_forms");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectedSitesProducts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectedSitesProducts.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectedSitesProducts is not found in the empty JSON string", ConnectedSitesProducts.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConnectedSitesProducts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConnectedSitesProducts` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `track_and_engage`
      if (jsonObj.get("track_and_engage") != null && !jsonObj.get("track_and_engage").isJsonNull()) {
        ConnectedSitesGeneralProductTEDetailGlobal.validateJsonObject(jsonObj.getAsJsonObject("track_and_engage"));
      }
      // validate the optional field `on_site_message`
      if (jsonObj.get("on_site_message") != null && !jsonObj.get("on_site_message").isJsonNull()) {
        ConnectedSitesGeneralProductFormDetailGlobal.validateJsonObject(jsonObj.getAsJsonObject("on_site_message"));
      }
      // validate the optional field `popup_forms`
      if (jsonObj.get("popup_forms") != null && !jsonObj.get("popup_forms").isJsonNull()) {
        ConnectedSitesGeneralProductFormDetailGlobal.validateJsonObject(jsonObj.getAsJsonObject("popup_forms"));
      }
      // validate the optional field `whatsapp`
      if (jsonObj.get("whatsapp") != null && !jsonObj.get("whatsapp").isJsonNull()) {
        ConnectedSitesGeneralProductFormDetailGlobal.validateJsonObject(jsonObj.getAsJsonObject("whatsapp"));
      }
      // validate the optional field `web_push`
      if (jsonObj.get("web_push") != null && !jsonObj.get("web_push").isJsonNull()) {
        ConnectedSitesGeneralProductAppDetailGlobal.validateJsonObject(jsonObj.getAsJsonObject("web_push"));
      }
      // validate the optional field `embed_forms`
      if (jsonObj.get("embed_forms") != null && !jsonObj.get("embed_forms").isJsonNull()) {
        ConnectedSitesEmbedForm.validateJsonObject(jsonObj.getAsJsonObject("embed_forms"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectedSitesProducts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectedSitesProducts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectedSitesProducts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectedSitesProducts.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectedSitesProducts>() {
           @Override
           public void write(JsonWriter out, ConnectedSitesProducts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectedSitesProducts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConnectedSitesProducts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectedSitesProducts
  * @throws IOException if the JSON string is invalid with respect to ConnectedSitesProducts
  */
  public static ConnectedSitesProducts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectedSitesProducts.class);
  }

 /**
  * Convert an instance of ConnectedSitesProducts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

