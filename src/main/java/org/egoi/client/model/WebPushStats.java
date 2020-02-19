/*
 * APIv3 (Beta)
 *  # Introduction Just a quick peek!!! This is our new version of API. Remember, it is not stable yet!!! But we invite you play with it and give us your feedback ;) # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services. * <b><a href='https://github.com/E-goi/sdk-java'>Java</a></b> * <b><a href='https://github.com/E-goi/sdk-php'>PHP</a></b> * <b><a href='https://github.com/E-goi/sdk-python'>Python</a></b>  <security-definitions/>
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
 * Webpush report stats schema
 */
@ApiModel(description = "Webpush report stats schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-19T15:12:15.913371Z[Europe/Lisbon]")
public class WebPushStats   {
  public static final String SERIALIZED_NAME_OPENS = "opens";
  @SerializedName(SERIALIZED_NAME_OPENS)
  private Integer opens;

  public static final String SERIALIZED_NAME_SENDS = "sends";
  @SerializedName(SERIALIZED_NAME_SENDS)
  private Integer sends;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Integer clicks;

  public static final String SERIALIZED_NAME_BOUNCES = "bounces";
  @SerializedName(SERIALIZED_NAME_BOUNCES)
  private Integer bounces;


  public WebPushStats opens(Integer opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * Total number of opened messages
   * minimum: 0
   * @return opens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of opened messages")

  public Integer getOpens() {
    return opens;
  }


  public void setOpens(Integer opens) {
    this.opens = opens;
  }


  public WebPushStats sends(Integer sends) {
    
    this.sends = sends;
    return this;
  }

   /**
   * Total number of sent messages
   * minimum: 0
   * @return sends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Total number of sent messages")

  public Integer getSends() {
    return sends;
  }


  public void setSends(Integer sends) {
    this.sends = sends;
  }


  public WebPushStats clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * Total number of clicked messages
   * minimum: 0
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of clicked messages")

  public Integer getClicks() {
    return clicks;
  }


  public void setClicks(Integer clicks) {
    this.clicks = clicks;
  }


  public WebPushStats bounces(Integer bounces) {
    
    this.bounces = bounces;
    return this;
  }

   /**
   * Total number of bounces
   * minimum: 0
   * @return bounces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Total number of bounces")

  public Integer getBounces() {
    return bounces;
  }


  public void setBounces(Integer bounces) {
    this.bounces = bounces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebPushStats webPushStats = (WebPushStats) o;
    return Objects.equals(this.opens, webPushStats.opens) &&
        Objects.equals(this.sends, webPushStats.sends) &&
        Objects.equals(this.clicks, webPushStats.clicks) &&
        Objects.equals(this.bounces, webPushStats.bounces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opens, sends, clicks, bounces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebPushStats {\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    sends: ").append(toIndentedString(sends)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    bounces: ").append(toIndentedString(bounces)).append("\n");
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

