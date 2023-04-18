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
 * Campaign fields to include in the report
 */
@ApiModel(description = "Campaign fields to include in the report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-18T08:41:12.682597+01:00[Europe/Lisbon]")
public class SmsBouncesCampaignFields {
  public static final String SERIALIZED_NAME_INTERNAL_NAME = "internal_name";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NAME)
  private Boolean internalName;

  public static final String SERIALIZED_NAME_CAMPAIGN_HASH = "campaign_hash";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_HASH)
  private Boolean campaignHash;

  public static final String SERIALIZED_NAME_SEND_DATE = "send_date";
  @SerializedName(SERIALIZED_NAME_SEND_DATE)
  private Boolean sendDate;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private Boolean group;

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private Boolean channel;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Boolean type;

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private Boolean sender;

  public SmsBouncesCampaignFields() {
  }

  public SmsBouncesCampaignFields internalName(Boolean internalName) {
    
    this.internalName = internalName;
    return this;
  }

   /**
   * True to include the internal name of the campaign, false otherwise
   * @return internalName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include the internal name of the campaign, false otherwise")

  public Boolean getInternalName() {
    return internalName;
  }


  public void setInternalName(Boolean internalName) {
    this.internalName = internalName;
  }


  public SmsBouncesCampaignFields campaignHash(Boolean campaignHash) {
    
    this.campaignHash = campaignHash;
    return this;
  }

   /**
   * True to include the hash of the campaign, false otherwise
   * @return campaignHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include the hash of the campaign, false otherwise")

  public Boolean getCampaignHash() {
    return campaignHash;
  }


  public void setCampaignHash(Boolean campaignHash) {
    this.campaignHash = campaignHash;
  }


  public SmsBouncesCampaignFields sendDate(Boolean sendDate) {
    
    this.sendDate = sendDate;
    return this;
  }

   /**
   * True to include the send date of the campaign, false otherwise
   * @return sendDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include the send date of the campaign, false otherwise")

  public Boolean getSendDate() {
    return sendDate;
  }


  public void setSendDate(Boolean sendDate) {
    this.sendDate = sendDate;
  }


  public SmsBouncesCampaignFields group(Boolean group) {
    
    this.group = group;
    return this;
  }

   /**
   * True to include the group of the campaign, false otherwise
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True to include the group of the campaign, false otherwise")

  public Boolean getGroup() {
    return group;
  }


  public void setGroup(Boolean group) {
    this.group = group;
  }


  public SmsBouncesCampaignFields channel(Boolean channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * True to include the channel of the campaign, false otherwise
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True to include the channel of the campaign, false otherwise")

  public Boolean getChannel() {
    return channel;
  }


  public void setChannel(Boolean channel) {
    this.channel = channel;
  }


  public SmsBouncesCampaignFields type(Boolean type) {
    
    this.type = type;
    return this;
  }

   /**
   * True to include the type of the campaign, false otherwise
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True to include the type of the campaign, false otherwise")

  public Boolean getType() {
    return type;
  }


  public void setType(Boolean type) {
    this.type = type;
  }


  public SmsBouncesCampaignFields sender(Boolean sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * True to include the sender of the campaign, false otherwise
   * @return sender
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include the sender of the campaign, false otherwise")

  public Boolean getSender() {
    return sender;
  }


  public void setSender(Boolean sender) {
    this.sender = sender;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsBouncesCampaignFields smsBouncesCampaignFields = (SmsBouncesCampaignFields) o;
    return Objects.equals(this.internalName, smsBouncesCampaignFields.internalName) &&
        Objects.equals(this.campaignHash, smsBouncesCampaignFields.campaignHash) &&
        Objects.equals(this.sendDate, smsBouncesCampaignFields.sendDate) &&
        Objects.equals(this.group, smsBouncesCampaignFields.group) &&
        Objects.equals(this.channel, smsBouncesCampaignFields.channel) &&
        Objects.equals(this.type, smsBouncesCampaignFields.type) &&
        Objects.equals(this.sender, smsBouncesCampaignFields.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalName, campaignHash, sendDate, group, channel, type, sender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsBouncesCampaignFields {\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    campaignHash: ").append(toIndentedString(campaignHash)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
    openapiFields.add("campaign_hash");
    openapiFields.add("send_date");
    openapiFields.add("group");
    openapiFields.add("channel");
    openapiFields.add("type");
    openapiFields.add("sender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("internal_name");
    openapiRequiredFields.add("campaign_hash");
    openapiRequiredFields.add("send_date");
    openapiRequiredFields.add("sender");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SmsBouncesCampaignFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SmsBouncesCampaignFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SmsBouncesCampaignFields is not found in the empty JSON string", SmsBouncesCampaignFields.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SmsBouncesCampaignFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SmsBouncesCampaignFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SmsBouncesCampaignFields.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SmsBouncesCampaignFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SmsBouncesCampaignFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SmsBouncesCampaignFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SmsBouncesCampaignFields.class));

       return (TypeAdapter<T>) new TypeAdapter<SmsBouncesCampaignFields>() {
           @Override
           public void write(JsonWriter out, SmsBouncesCampaignFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SmsBouncesCampaignFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SmsBouncesCampaignFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SmsBouncesCampaignFields
  * @throws IOException if the JSON string is invalid with respect to SmsBouncesCampaignFields
  */
  public static SmsBouncesCampaignFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SmsBouncesCampaignFields.class);
  }

 /**
  * Convert an instance of SmsBouncesCampaignFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

