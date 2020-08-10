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
import org.egoi.client.model.CampaignSmsOptions;
import org.egoi.client.model.SmartSmsCampaignPatchRequestCampaignContent;
import org.egoi.client.model.SmartSmsCampaignPatchRequestPageContent;

/**
 * SmartSmsCampaignPatchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T12:53:53.038698+01:00[Europe/Lisbon]")
public class SmartSmsCampaignPatchRequest   {
  public static final String SERIALIZED_NAME_INTERNAL_NAME = "internal_name";
  @SerializedName(SERIALIZED_NAME_INTERNAL_NAME)
  private String internalName;

  public static final String SERIALIZED_NAME_CAMPAIGN_CONTENT = "campaign_content";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_CONTENT)
  private SmartSmsCampaignPatchRequestCampaignContent campaignContent;

  public static final String SERIALIZED_NAME_PAGE_CONTENT = "page_content";
  @SerializedName(SERIALIZED_NAME_PAGE_CONTENT)
  private SmartSmsCampaignPatchRequestPageContent pageContent;

  public static final String SERIALIZED_NAME_SENDER_ID = "sender_id";
  @SerializedName(SERIALIZED_NAME_SENDER_ID)
  private Integer senderId;

  public static final String SERIALIZED_NAME_CNAME_ID = "cname_id";
  @SerializedName(SERIALIZED_NAME_CNAME_ID)
  private Integer cnameId;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private CampaignSmsOptions options;


  public SmartSmsCampaignPatchRequest internalName(String internalName) {
    
    this.internalName = internalName;
    return this;
  }

   /**
   * SMS campaign internal name
   * @return internalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Internal Title", value = "SMS campaign internal name")

  public String getInternalName() {
    return internalName;
  }


  public void setInternalName(String internalName) {
    this.internalName = internalName;
  }


  public SmartSmsCampaignPatchRequest campaignContent(SmartSmsCampaignPatchRequestCampaignContent campaignContent) {
    
    this.campaignContent = campaignContent;
    return this;
  }

   /**
   * Get campaignContent
   * @return campaignContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SmartSmsCampaignPatchRequestCampaignContent getCampaignContent() {
    return campaignContent;
  }


  public void setCampaignContent(SmartSmsCampaignPatchRequestCampaignContent campaignContent) {
    this.campaignContent = campaignContent;
  }


  public SmartSmsCampaignPatchRequest pageContent(SmartSmsCampaignPatchRequestPageContent pageContent) {
    
    this.pageContent = pageContent;
    return this;
  }

   /**
   * Get pageContent
   * @return pageContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SmartSmsCampaignPatchRequestPageContent getPageContent() {
    return pageContent;
  }


  public void setPageContent(SmartSmsCampaignPatchRequestPageContent pageContent) {
    this.pageContent = pageContent;
  }


  public SmartSmsCampaignPatchRequest senderId(Integer senderId) {
    
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


  public SmartSmsCampaignPatchRequest cnameId(Integer cnameId) {
    
    this.cnameId = cnameId;
    return this;
  }

   /**
   * Get cnameId
   * minimum: 1
   * @return cnameId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getCnameId() {
    return cnameId;
  }


  public void setCnameId(Integer cnameId) {
    this.cnameId = cnameId;
  }


  public SmartSmsCampaignPatchRequest options(CampaignSmsOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CampaignSmsOptions getOptions() {
    return options;
  }


  public void setOptions(CampaignSmsOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartSmsCampaignPatchRequest smartSmsCampaignPatchRequest = (SmartSmsCampaignPatchRequest) o;
    return Objects.equals(this.internalName, smartSmsCampaignPatchRequest.internalName) &&
        Objects.equals(this.campaignContent, smartSmsCampaignPatchRequest.campaignContent) &&
        Objects.equals(this.pageContent, smartSmsCampaignPatchRequest.pageContent) &&
        Objects.equals(this.senderId, smartSmsCampaignPatchRequest.senderId) &&
        Objects.equals(this.cnameId, smartSmsCampaignPatchRequest.cnameId) &&
        Objects.equals(this.options, smartSmsCampaignPatchRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(internalName, campaignContent, pageContent, senderId, cnameId, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartSmsCampaignPatchRequest {\n");
    sb.append("    internalName: ").append(toIndentedString(internalName)).append("\n");
    sb.append("    campaignContent: ").append(toIndentedString(campaignContent)).append("\n");
    sb.append("    pageContent: ").append(toIndentedString(pageContent)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    cnameId: ").append(toIndentedString(cnameId)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

