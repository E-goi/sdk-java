/*
 * APIv3 (New)
 *  # Introduction This is our new version of API. We invite you to start using it and give us your feedback # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB.  # Timeouts Timeouts set a maximum waiting time on a request's response. Our API, sets a default timeout for each request and when breached, you'll receive an HTTP **408 (Request Timeout)** error code. You should take into consideration that response times can vary widely based on the complexity of the request, amount of data being analyzed, and the load on the system and workspace at the time of the query. When dealing with such errors, you should first attempt to reduce the complexity and amount of data under analysis, and only then, if problems are still occurring ask for support.  For all these reasons, the default timeout for each request is **10 Seconds** and any request that creates or modifies data (**POST**, **PATCH** and **PUT**) will have a timeout of **60 Seconds**. Specific timeouts may exist for specific requests, these can be found in the request's documentation.  <security-definitions/>
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
import org.threeten.bp.OffsetDateTime;

/**
 * Webpush stats of the contact
 */
@ApiModel(description = "Webpush stats of the contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T20:27:19.076308+01:00[Europe/Lisbon]")
public class ComplexContactAllOfWebpushStats   {
  public static final String SERIALIZED_NAME_SENT = "sent";
  @SerializedName(SERIALIZED_NAME_SENT)
  private Integer sent;

  public static final String SERIALIZED_NAME_DELIVERED = "delivered";
  @SerializedName(SERIALIZED_NAME_DELIVERED)
  private Integer delivered;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Integer clicks;

  public static final String SERIALIZED_NAME_BOUNCES = "bounces";
  @SerializedName(SERIALIZED_NAME_BOUNCES)
  private Integer bounces;

  public static final String SERIALIZED_NAME_LAST_SEND_DATE = "last_send_date";
  @SerializedName(SERIALIZED_NAME_LAST_SEND_DATE)
  private OffsetDateTime lastSendDate;

  public static final String SERIALIZED_NAME_LAST_DELIVERY_DATE = "last_delivery_date";
  @SerializedName(SERIALIZED_NAME_LAST_DELIVERY_DATE)
  private OffsetDateTime lastDeliveryDate;

  public static final String SERIALIZED_NAME_LAST_CLICK_DATE = "last_click_date";
  @SerializedName(SERIALIZED_NAME_LAST_CLICK_DATE)
  private OffsetDateTime lastClickDate;

  public static final String SERIALIZED_NAME_LAST_BOUNCE_DATE = "last_bounce_date";
  @SerializedName(SERIALIZED_NAME_LAST_BOUNCE_DATE)
  private OffsetDateTime lastBounceDate;


  public ComplexContactAllOfWebpushStats sent(Integer sent) {
    
    this.sent = sent;
    return this;
  }

   /**
   * Webpush messages sent to the contact
   * @return sent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "Webpush messages sent to the contact")

  public Integer getSent() {
    return sent;
  }


  public void setSent(Integer sent) {
    this.sent = sent;
  }


  public ComplexContactAllOfWebpushStats delivered(Integer delivered) {
    
    this.delivered = delivered;
    return this;
  }

   /**
   * Webpush messages delivered to the contact
   * @return delivered
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7", value = "Webpush messages delivered to the contact")

  public Integer getDelivered() {
    return delivered;
  }


  public void setDelivered(Integer delivered) {
    this.delivered = delivered;
  }


  public ComplexContactAllOfWebpushStats clicks(Integer clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * Total number of clicks made by the contact
   * @return clicks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "Total number of clicks made by the contact")

  public Integer getClicks() {
    return clicks;
  }


  public void setClicks(Integer clicks) {
    this.clicks = clicks;
  }


  public ComplexContactAllOfWebpushStats bounces(Integer bounces) {
    
    this.bounces = bounces;
    return this;
  }

   /**
   * Bounces for the contact
   * @return bounces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Bounces for the contact")

  public Integer getBounces() {
    return bounces;
  }


  public void setBounces(Integer bounces) {
    this.bounces = bounces;
  }


  public ComplexContactAllOfWebpushStats lastSendDate(OffsetDateTime lastSendDate) {
    
    this.lastSendDate = lastSendDate;
    return this;
  }

   /**
   * Date of the last webpush message sent to the contact
   * @return lastSendDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the last webpush message sent to the contact")

  public OffsetDateTime getLastSendDate() {
    return lastSendDate;
  }


  public void setLastSendDate(OffsetDateTime lastSendDate) {
    this.lastSendDate = lastSendDate;
  }


  public ComplexContactAllOfWebpushStats lastDeliveryDate(OffsetDateTime lastDeliveryDate) {
    
    this.lastDeliveryDate = lastDeliveryDate;
    return this;
  }

   /**
   * Date of the last webpush message delivered to the contact
   * @return lastDeliveryDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the last webpush message delivered to the contact")

  public OffsetDateTime getLastDeliveryDate() {
    return lastDeliveryDate;
  }


  public void setLastDeliveryDate(OffsetDateTime lastDeliveryDate) {
    this.lastDeliveryDate = lastDeliveryDate;
  }


  public ComplexContactAllOfWebpushStats lastClickDate(OffsetDateTime lastClickDate) {
    
    this.lastClickDate = lastClickDate;
    return this;
  }

   /**
   * Date of the last webpush message clicked by the contact
   * @return lastClickDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the last webpush message clicked by the contact")

  public OffsetDateTime getLastClickDate() {
    return lastClickDate;
  }


  public void setLastClickDate(OffsetDateTime lastClickDate) {
    this.lastClickDate = lastClickDate;
  }


  public ComplexContactAllOfWebpushStats lastBounceDate(OffsetDateTime lastBounceDate) {
    
    this.lastBounceDate = lastBounceDate;
    return this;
  }

   /**
   * Date of the last webpush bounce for the contact
   * @return lastBounceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the last webpush bounce for the contact")

  public OffsetDateTime getLastBounceDate() {
    return lastBounceDate;
  }


  public void setLastBounceDate(OffsetDateTime lastBounceDate) {
    this.lastBounceDate = lastBounceDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplexContactAllOfWebpushStats complexContactAllOfWebpushStats = (ComplexContactAllOfWebpushStats) o;
    return Objects.equals(this.sent, complexContactAllOfWebpushStats.sent) &&
        Objects.equals(this.delivered, complexContactAllOfWebpushStats.delivered) &&
        Objects.equals(this.clicks, complexContactAllOfWebpushStats.clicks) &&
        Objects.equals(this.bounces, complexContactAllOfWebpushStats.bounces) &&
        Objects.equals(this.lastSendDate, complexContactAllOfWebpushStats.lastSendDate) &&
        Objects.equals(this.lastDeliveryDate, complexContactAllOfWebpushStats.lastDeliveryDate) &&
        Objects.equals(this.lastClickDate, complexContactAllOfWebpushStats.lastClickDate) &&
        Objects.equals(this.lastBounceDate, complexContactAllOfWebpushStats.lastBounceDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sent, delivered, clicks, bounces, lastSendDate, lastDeliveryDate, lastClickDate, lastBounceDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplexContactAllOfWebpushStats {\n");
    sb.append("    sent: ").append(toIndentedString(sent)).append("\n");
    sb.append("    delivered: ").append(toIndentedString(delivered)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    bounces: ").append(toIndentedString(bounces)).append("\n");
    sb.append("    lastSendDate: ").append(toIndentedString(lastSendDate)).append("\n");
    sb.append("    lastDeliveryDate: ").append(toIndentedString(lastDeliveryDate)).append("\n");
    sb.append("    lastClickDate: ").append(toIndentedString(lastClickDate)).append("\n");
    sb.append("    lastBounceDate: ").append(toIndentedString(lastBounceDate)).append("\n");
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

