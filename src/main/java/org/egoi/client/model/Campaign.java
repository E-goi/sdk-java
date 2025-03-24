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
import java.time.OffsetDateTime;
import org.egoi.client.model.CampaignScheduleDate;

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
 * Campaign schema
 */
@ApiModel(description = "Campaign schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T11:21:14.263836Z[Europe/Lisbon]")
public class Campaign {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CAMPAIGN_HASH = "campaign_hash";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_HASH)
  private String campaignHash;

  /**
   * Status of the campaign
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DRAFT("draft"),
    
    CANCELED("canceled"),
    
    QUEUED("queued"),
    
    PAUSED("paused"),
    
    SENDING("sending"),
    
    SENT("sent");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail;

  /**
   * Channel of the campaign
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    EMAIL("email"),
    
    PUSH("push"),
    
    SMS("sms"),
    
    SMART_SMS("smart_sms"),
    
    VOICE("voice"),
    
    WEB_PUSH("web_push");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel;

  public static final String SERIALIZED_NAME_INTERNAL_NAME = "internal_name";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NAME)
  private String internalName;

  public static final String SERIALIZED_NAME_LIST_ID = "list_id";
  @SerializedName(SERIALIZED_NAME_LIST_ID)
  private Integer listId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_CREATED_BY = "created_by";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private Integer createdBy;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Integer groupId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private OffsetDateTime startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private OffsetDateTime endDate;

  public static final String SERIALIZED_NAME_SCHEDULE_DATE = "schedule_date";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_DATE)
  private CampaignScheduleDate scheduleDate;

  public static final String SERIALIZED_NAME_PROCESSED_MESSAGES = "processed_messages";
  @SerializedName(SERIALIZED_NAME_PROCESSED_MESSAGES)
  private Integer processedMessages;

  public static final String SERIALIZED_NAME_AUTOMATION_ID = "automation_id";
  @SerializedName(SERIALIZED_NAME_AUTOMATION_ID)
  private Integer automationId;

  public Campaign() {
  }

  
  public Campaign(
     Integer id, 
     String campaignHash, 
     Integer listId, 
     Integer createdBy, 
     Integer groupId
  ) {
    this();
    this.id = id;
    this.campaignHash = campaignHash;
    this.listId = listId;
    this.createdBy = createdBy;
    this.groupId = groupId;
  }

   /**
   * Get id
   * minimum: 1
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getId() {
    return id;
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




  public Campaign status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the campaign
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sent", value = "Status of the campaign")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Campaign thumbnail(String thumbnail) {
    
    this.thumbnail = thumbnail;
    return this;
  }

   /**
   * Thumbnail of the campaign
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "//bo29.e-goi.com/recursos/resource_folder/listas/name_image.jpg", value = "Thumbnail of the campaign")

  public String getThumbnail() {
    return thumbnail;
  }


  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }


  public Campaign channel(ChannelEnum channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * Channel of the campaign
   * @return channel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "email", value = "Channel of the campaign")

  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }


  public Campaign internalName(String internalName) {
    
    this.internalName = internalName;
    return this;
  }

   /**
   * Internal name of the campaign
   * @return internalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your internal name", value = "Internal name of the campaign")

  public String getInternalName() {
    return internalName;
  }


  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }


   /**
   * Get listId
   * minimum: 1
   * @return listId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getListId() {
    return listId;
  }




  public Campaign title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Subject of the campaign
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "subject of campaign", value = "Subject of the campaign")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


   /**
   * Get createdBy
   * minimum: 1
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getCreatedBy() {
    return createdBy;
  }




   /**
   * Get groupId
   * minimum: 1
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getGroupId() {
    return groupId;
  }




  public Campaign created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Campaign updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public Campaign startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Campaign endDate(OffsetDateTime endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public Campaign scheduleDate(CampaignScheduleDate scheduleDate) {
    
    this.scheduleDate = scheduleDate;
    return this;
  }

   /**
   * Get scheduleDate
   * @return scheduleDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignScheduleDate getScheduleDate() {
    return scheduleDate;
  }


  public void setScheduleDate(CampaignScheduleDate scheduleDate) {
    this.scheduleDate = scheduleDate;
  }


  public Campaign processedMessages(Integer processedMessages) {
    
    this.processedMessages = processedMessages;
    return this;
  }

   /**
   * Total number of processed messages
   * minimum: 0
   * @return processedMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Total number of processed messages")

  public Integer getProcessedMessages() {
    return processedMessages;
  }


  public void setProcessedMessages(Integer processedMessages) {
    this.processedMessages = processedMessages;
  }


  public Campaign automationId(Integer automationId) {
    
    this.automationId = automationId;
    return this;
  }

   /**
   * The automation id of the campaign
   * @return automationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The automation id of the campaign")

  public Integer getAutomationId() {
    return automationId;
  }


  public void setAutomationId(Integer automationId) {
    this.automationId = automationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Campaign campaign = (Campaign) o;
    return Objects.equals(this.id, campaign.id) &&
        Objects.equals(this.campaignHash, campaign.campaignHash) &&
        Objects.equals(this.status, campaign.status) &&
        Objects.equals(this.thumbnail, campaign.thumbnail) &&
        Objects.equals(this.channel, campaign.channel) &&
        Objects.equals(this.internalName, campaign.internalName) &&
        Objects.equals(this.listId, campaign.listId) &&
        Objects.equals(this.title, campaign.title) &&
        Objects.equals(this.createdBy, campaign.createdBy) &&
        Objects.equals(this.groupId, campaign.groupId) &&
        Objects.equals(this.created, campaign.created) &&
        Objects.equals(this.updated, campaign.updated) &&
        Objects.equals(this.startDate, campaign.startDate) &&
        Objects.equals(this.endDate, campaign.endDate) &&
        Objects.equals(this.scheduleDate, campaign.scheduleDate) &&
        Objects.equals(this.processedMessages, campaign.processedMessages) &&
        Objects.equals(this.automationId, campaign.automationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, campaignHash, status, thumbnail, channel, internalName, listId, title, createdBy, groupId, created, updated, startDate, endDate, scheduleDate, processedMessages, automationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Campaign {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    campaignHash: ").append(toIndentedString(campaignHash)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    listId: ").append(toIndentedString(listId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    scheduleDate: ").append(toIndentedString(scheduleDate)).append("\n");
    sb.append("    processedMessages: ").append(toIndentedString(processedMessages)).append("\n");
    sb.append("    automationId: ").append(toIndentedString(automationId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("campaign_hash");
    openapiFields.add("status");
    openapiFields.add("thumbnail");
    openapiFields.add("channel");
    openapiFields.add("internal_name");
    openapiFields.add("list_id");
    openapiFields.add("title");
    openapiFields.add("created_by");
    openapiFields.add("group_id");
    openapiFields.add("created");
    openapiFields.add("updated");
    openapiFields.add("start_date");
    openapiFields.add("end_date");
    openapiFields.add("schedule_date");
    openapiFields.add("processed_messages");
    openapiFields.add("automation_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Campaign
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Campaign.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Campaign is not found in the empty JSON string", Campaign.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Campaign.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Campaign` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("campaign_hash") != null && !jsonObj.get("campaign_hash").isJsonNull()) && !jsonObj.get("campaign_hash").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaign_hash` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaign_hash").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("thumbnail") != null && !jsonObj.get("thumbnail").isJsonNull()) && !jsonObj.get("thumbnail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnail").toString()));
      }
      if ((jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonNull()) && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
      if ((jsonObj.get("internal_name") != null && !jsonObj.get("internal_name").isJsonNull()) && !jsonObj.get("internal_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `internal_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("internal_name").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the optional field `created`
      if (jsonObj.get("created") != null && !jsonObj.get("created").isJsonNull()) {
        OffsetDateTime.validateJsonObject(jsonObj.getAsJsonObject("created"));
      }
      // validate the optional field `updated`
      if (jsonObj.get("updated") != null && !jsonObj.get("updated").isJsonNull()) {
        OffsetDateTime.validateJsonObject(jsonObj.getAsJsonObject("updated"));
      }
      // validate the optional field `start_date`
      if (jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonNull()) {
        OffsetDateTime.validateJsonObject(jsonObj.getAsJsonObject("start_date"));
      }
      // validate the optional field `end_date`
      if (jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonNull()) {
        OffsetDateTime.validateJsonObject(jsonObj.getAsJsonObject("end_date"));
      }
      // validate the optional field `schedule_date`
      if (jsonObj.get("schedule_date") != null && !jsonObj.get("schedule_date").isJsonNull()) {
        CampaignScheduleDate.validateJsonObject(jsonObj.getAsJsonObject("schedule_date"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Campaign.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Campaign' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Campaign> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Campaign.class));

       return (TypeAdapter<T>) new TypeAdapter<Campaign>() {
           @Override
           public void write(JsonWriter out, Campaign value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Campaign read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Campaign given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Campaign
  * @throws IOException if the JSON string is invalid with respect to Campaign
  */
  public static Campaign fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Campaign.class);
  }

 /**
  * Convert an instance of Campaign to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

