/*
 * APIv3 (Beta)
 *  # Introduction Just a quick peek!!! This is our new version of API. Remember, it is not stable yet!!! But we invite you play with it and give us your feedback ;) # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB. <security-definitions/>
 *
 * The version of the OpenAPI document: 3.0.0-beta
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

/**
 * Campaign fields to include in the report
 */
@ApiModel(description = "Campaign fields to include in the report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T12:53:53.038698+01:00[Europe/Lisbon]")
public class SmsEventsCampaignFields   {
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

  public static final String SERIALIZED_NAME_SENDER = "sender";
  @SerializedName(SERIALIZED_NAME_SENDER)
  private Boolean sender;


  public SmsEventsCampaignFields internalName(Boolean internalName) {
    
    this.internalName = internalName;
    return this;
  }

   /**
   * True to include the internal name of the campaign, false otherwise
   * @return internalName
  **/
  @ApiModelProperty(required = true, value = "True to include the internal name of the campaign, false otherwise")

  public Boolean getInternalName() {
    return internalName;
  }


  public void setInternalName(Boolean internalName) {
    this.internalName = internalName;
  }


  public SmsEventsCampaignFields campaignHash(Boolean campaignHash) {
    
    this.campaignHash = campaignHash;
    return this;
  }

   /**
   * True to include the hash of the campaign, false otherwise
   * @return campaignHash
  **/
  @ApiModelProperty(required = true, value = "True to include the hash of the campaign, false otherwise")

  public Boolean getCampaignHash() {
    return campaignHash;
  }


  public void setCampaignHash(Boolean campaignHash) {
    this.campaignHash = campaignHash;
  }


  public SmsEventsCampaignFields sendDate(Boolean sendDate) {
    
    this.sendDate = sendDate;
    return this;
  }

   /**
   * True to include the send date of the campaign, false otherwise
   * @return sendDate
  **/
  @ApiModelProperty(required = true, value = "True to include the send date of the campaign, false otherwise")

  public Boolean getSendDate() {
    return sendDate;
  }


  public void setSendDate(Boolean sendDate) {
    this.sendDate = sendDate;
  }


  public SmsEventsCampaignFields group(Boolean group) {
    
    this.group = group;
    return this;
  }

   /**
   * True to include the group of the campaign, false otherwise
   * @return group
  **/
  @ApiModelProperty(required = true, value = "True to include the group of the campaign, false otherwise")

  public Boolean getGroup() {
    return group;
  }


  public void setGroup(Boolean group) {
    this.group = group;
  }


  public SmsEventsCampaignFields sender(Boolean sender) {
    
    this.sender = sender;
    return this;
  }

   /**
   * True to include the sender of the campaign, false otherwise
   * @return sender
  **/
  @ApiModelProperty(required = true, value = "True to include the sender of the campaign, false otherwise")

  public Boolean getSender() {
    return sender;
  }


  public void setSender(Boolean sender) {
    this.sender = sender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmsEventsCampaignFields smsEventsCampaignFields = (SmsEventsCampaignFields) o;
    return Objects.equals(this.internalName, smsEventsCampaignFields.internalName) &&
        Objects.equals(this.campaignHash, smsEventsCampaignFields.campaignHash) &&
        Objects.equals(this.sendDate, smsEventsCampaignFields.sendDate) &&
        Objects.equals(this.group, smsEventsCampaignFields.group) &&
        Objects.equals(this.sender, smsEventsCampaignFields.sender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalName, campaignHash, sendDate, group, sender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmsEventsCampaignFields {\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    campaignHash: ").append(toIndentedString(campaignHash)).append("\n");
    sb.append("    sendDate: ").append(toIndentedString(sendDate)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

