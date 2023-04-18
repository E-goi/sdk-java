/*
 * APIv3 (New)
 *  # Introduction This is our new version of API. We invite you to start using it and give us your feedback # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.  The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.      BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication  We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:     #!/bin/bash     curl -X GET 'https://api.egoiapp.com/my-account' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:     #!/bin/bash     curl -X POST 'http://api.egoiapp.com/tags' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>' \\     -H 'Content-Type: application/json' \\     -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB.  # Timeouts Timeouts set a maximum waiting time on a request's response. Our API, sets a default timeout for each request and when breached, you'll receive an HTTP **408 (Request Timeout)** error code. You should take into consideration that response times can vary widely based on the complexity of the request, amount of data being analyzed, and the load on the system and workspace at the time of the query. When dealing with such errors, you should first attempt to reduce the complexity and amount of data under analysis, and only then, if problems are still occurring ask for support.  For all these reasons, the default timeout for each request is **10 Seconds** and any request that creates or modifies data (**POST**, **PATCH** and **PUT**) will have a timeout of **60 Seconds**. Specific timeouts may exist for specific requests, these can be found in the request's documentation.  # Callbacks A callback is an asynchronous API request that originates from the API server and is sent to the client in response to a previous request sent by that client.  The API will make a **POST** request to the address defined in the URL with the information regarding the event of interest and share data related to that event.  <a href='/usecases/callbacks/' target='_blank'>[Go to callbacks documentation]</a>  ***Note:*** Only http or https protocols are supported in the Url parameter.  <security-definitions/>
 *
 * The version of the OpenAPI document: 3.0.0
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
import org.egoi.client.model.CampaignEmailContentHtmlPatch;
import org.egoi.client.model.HeaderFooter;

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
 * Email campaign schema
 */
@ApiModel(description = "Email campaign schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-18T08:41:12.682597+01:00[Europe/Lisbon]")
public class EmailCampaignPatch {
  public static final String SERIALIZED_NAME_INTERNAL_NAME = "internal_name";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NAME)
  private String internalName;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private CampaignEmailContentHtmlPatch content;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private Integer senderId;

  public static final String SERIALIZED_NAME_REPLY_TO = "reply_to";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private Integer replyTo;

  public static final String SERIALIZED_NAME_HEADER_FOOTER = "header_footer";
  @SerializedName(SERIALIZED_NAME_HEADER_FOOTER)
  private HeaderFooter headerFooter;

  public EmailCampaignPatch() {
  }

  public EmailCampaignPatch internalName(String internalName) {
    
    this.internalName = internalName;
    return this;
  }

   /**
   * Campaign internal name
   * @return internalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Campaign internal name", value = "Campaign internal name")

  public String getInternalName() {
    return internalName;
  }


  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }


  public EmailCampaignPatch subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Campaign subject. If no value is sent, defaults to &#39;internal_name&#39; property value
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Campaign subject", value = "Campaign subject. If no value is sent, defaults to 'internal_name' property value")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public EmailCampaignPatch content(CampaignEmailContentHtmlPatch content) {
    
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignEmailContentHtmlPatch getContent() {
    return content;
  }


  public void setContent(CampaignEmailContentHtmlPatch content) {
    this.content = content;
  }


  public EmailCampaignPatch senderId(Integer senderId) {
    
    this.senderId = senderId;
    return this;
  }

   /**
   * Get senderId
   * minimum: 1
   * @return senderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getSenderId() {
    return senderId;
  }


  public void setSenderId(Integer senderId) {
    this.senderId = senderId;
  }


  public EmailCampaignPatch replyTo(Integer replyTo) {
    
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * minimum: 1
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(Integer replyTo) {
    this.replyTo = replyTo;
  }


  public EmailCampaignPatch headerFooter(HeaderFooter headerFooter) {
    
    this.headerFooter = headerFooter;
    return this;
  }

   /**
   * Get headerFooter
   * @return headerFooter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HeaderFooter getHeaderFooter() {
    return headerFooter;
  }


  public void setHeaderFooter(HeaderFooter headerFooter) {
    this.headerFooter = headerFooter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailCampaignPatch emailCampaignPatch = (EmailCampaignPatch) o;
    return Objects.equals(this.internalName, emailCampaignPatch.internalName) &&
        Objects.equals(this.subject, emailCampaignPatch.subject) &&
        Objects.equals(this.content, emailCampaignPatch.content) &&
        Objects.equals(this.senderId, emailCampaignPatch.senderId) &&
        Objects.equals(this.replyTo, emailCampaignPatch.replyTo) &&
        Objects.equals(this.headerFooter, emailCampaignPatch.headerFooter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalName, subject, content, senderId, replyTo, headerFooter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailCampaignPatch {\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    headerFooter: ").append(toIndentedString(headerFooter)).append("\n");
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
    openapiFields.add("internal_name");
    openapiFields.add("subject");
    openapiFields.add("content");
    openapiFields.add("sender_id");
    openapiFields.add("reply_to");
    openapiFields.add("header_footer");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmailCampaignPatch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmailCampaignPatch.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmailCampaignPatch is not found in the empty JSON string", EmailCampaignPatch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EmailCampaignPatch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EmailCampaignPatch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("internal_name") != null && !jsonObj.get("internal_name").isJsonNull()) && !jsonObj.get("internal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internal_name").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      // validate the optional field `content`
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) {
        CampaignEmailContentHtmlPatch.validateJsonObject(jsonObj.getAsJsonObject("content"));
      }
      // validate the optional field `header_footer`
      if (jsonObj.get("header_footer") != null && !jsonObj.get("header_footer").isJsonNull()) {
        HeaderFooter.validateJsonObject(jsonObj.getAsJsonObject("header_footer"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmailCampaignPatch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmailCampaignPatch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmailCampaignPatch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmailCampaignPatch.class));

       return (TypeAdapter<T>) new TypeAdapter<EmailCampaignPatch>() {
           @Override
           public void write(JsonWriter out, EmailCampaignPatch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EmailCampaignPatch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EmailCampaignPatch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmailCampaignPatch
  * @throws IOException if the JSON string is invalid with respect to EmailCampaignPatch
  */
  public static EmailCampaignPatch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmailCampaignPatch.class);
  }

 /**
  * Convert an instance of EmailCampaignPatch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

