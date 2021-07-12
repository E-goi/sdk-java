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

/**
 * List stats fields to include in the report
 */
@ApiModel(description = "List stats fields to include in the report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T20:27:19.076308+01:00[Europe/Lisbon]")
public class EmailEventsListStatsFields   {
  public static final String SERIALIZED_NAME_OPENS = "opens";
  @SerializedName(SERIALIZED_NAME_OPENS)
  private Boolean opens;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Boolean clicks;

  public static final String SERIALIZED_NAME_COMPLAINTS = "complaints";
  @SerializedName(SERIALIZED_NAME_COMPLAINTS)
  private Boolean complaints;

  public static final String SERIALIZED_NAME_UNSUBSCRIBES = "unsubscribes";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBES)
  private Boolean unsubscribes;

  public static final String SERIALIZED_NAME_BOUNCES = "bounces";
  @SerializedName(SERIALIZED_NAME_BOUNCES)
  private Boolean bounces;

  public static final String SERIALIZED_NAME_FORWARDS = "forwards";
  @SerializedName(SERIALIZED_NAME_FORWARDS)
  private Boolean forwards;

  public static final String SERIALIZED_NAME_FORWARDS_CONVERSION = "forwards_conversion";
  @SerializedName(SERIALIZED_NAME_FORWARDS_CONVERSION)
  private Boolean forwardsConversion;

  public static final String SERIALIZED_NAME_FB_LIKES = "fb_likes";
  @SerializedName(SERIALIZED_NAME_FB_LIKES)
  private Boolean fbLikes;

  public static final String SERIALIZED_NAME_FB_SHARES = "fb_shares";
  @SerializedName(SERIALIZED_NAME_FB_SHARES)
  private Boolean fbShares;

  public static final String SERIALIZED_NAME_TW_SHARES = "tw_shares";
  @SerializedName(SERIALIZED_NAME_TW_SHARES)
  private Boolean twShares;

  public static final String SERIALIZED_NAME_SOCIAL_SHARES = "social_shares";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SHARES)
  private Boolean socialShares;


  public EmailEventsListStatsFields opens(Boolean opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * True to include opens, false otherwise
   * @return opens
  **/
  @ApiModelProperty(required = true, value = "True to include opens, false otherwise")

  public Boolean getOpens() {
    return opens;
  }


  public void setOpens(Boolean opens) {
    this.opens = opens;
  }


  public EmailEventsListStatsFields clicks(Boolean clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * True to include clicks, false otherwise
   * @return clicks
  **/
  @ApiModelProperty(required = true, value = "True to include clicks, false otherwise")

  public Boolean getClicks() {
    return clicks;
  }


  public void setClicks(Boolean clicks) {
    this.clicks = clicks;
  }


  public EmailEventsListStatsFields complaints(Boolean complaints) {
    
    this.complaints = complaints;
    return this;
  }

   /**
   * True to include complaints, false otherwise
   * @return complaints
  **/
  @ApiModelProperty(required = true, value = "True to include complaints, false otherwise")

  public Boolean getComplaints() {
    return complaints;
  }


  public void setComplaints(Boolean complaints) {
    this.complaints = complaints;
  }


  public EmailEventsListStatsFields unsubscribes(Boolean unsubscribes) {
    
    this.unsubscribes = unsubscribes;
    return this;
  }

   /**
   * True to include unsubscriptions, false otherwise
   * @return unsubscribes
  **/
  @ApiModelProperty(required = true, value = "True to include unsubscriptions, false otherwise")

  public Boolean getUnsubscribes() {
    return unsubscribes;
  }


  public void setUnsubscribes(Boolean unsubscribes) {
    this.unsubscribes = unsubscribes;
  }


  public EmailEventsListStatsFields bounces(Boolean bounces) {
    
    this.bounces = bounces;
    return this;
  }

   /**
   * True to include bounces, false otherwise
   * @return bounces
  **/
  @ApiModelProperty(required = true, value = "True to include bounces, false otherwise")

  public Boolean getBounces() {
    return bounces;
  }


  public void setBounces(Boolean bounces) {
    this.bounces = bounces;
  }


  public EmailEventsListStatsFields forwards(Boolean forwards) {
    
    this.forwards = forwards;
    return this;
  }

   /**
   * True to include forwards, false otherwise
   * @return forwards
  **/
  @ApiModelProperty(required = true, value = "True to include forwards, false otherwise")

  public Boolean getForwards() {
    return forwards;
  }


  public void setForwards(Boolean forwards) {
    this.forwards = forwards;
  }


  public EmailEventsListStatsFields forwardsConversion(Boolean forwardsConversion) {
    
    this.forwardsConversion = forwardsConversion;
    return this;
  }

   /**
   * True to include converted forwards, false otherwise
   * @return forwardsConversion
  **/
  @ApiModelProperty(required = true, value = "True to include converted forwards, false otherwise")

  public Boolean getForwardsConversion() {
    return forwardsConversion;
  }


  public void setForwardsConversion(Boolean forwardsConversion) {
    this.forwardsConversion = forwardsConversion;
  }


  public EmailEventsListStatsFields fbLikes(Boolean fbLikes) {
    
    this.fbLikes = fbLikes;
    return this;
  }

   /**
   * True to include facebook likes, false otherwise
   * @return fbLikes
  **/
  @ApiModelProperty(required = true, value = "True to include facebook likes, false otherwise")

  public Boolean getFbLikes() {
    return fbLikes;
  }


  public void setFbLikes(Boolean fbLikes) {
    this.fbLikes = fbLikes;
  }


  public EmailEventsListStatsFields fbShares(Boolean fbShares) {
    
    this.fbShares = fbShares;
    return this;
  }

   /**
   * True to include facebook shares, false otherwise
   * @return fbShares
  **/
  @ApiModelProperty(required = true, value = "True to include facebook shares, false otherwise")

  public Boolean getFbShares() {
    return fbShares;
  }


  public void setFbShares(Boolean fbShares) {
    this.fbShares = fbShares;
  }


  public EmailEventsListStatsFields twShares(Boolean twShares) {
    
    this.twShares = twShares;
    return this;
  }

   /**
   * True to include twitter shares, false otherwise
   * @return twShares
  **/
  @ApiModelProperty(required = true, value = "True to include twitter shares, false otherwise")

  public Boolean getTwShares() {
    return twShares;
  }


  public void setTwShares(Boolean twShares) {
    this.twShares = twShares;
  }


  public EmailEventsListStatsFields socialShares(Boolean socialShares) {
    
    this.socialShares = socialShares;
    return this;
  }

   /**
   * True to include social shares, false otherwise
   * @return socialShares
  **/
  @ApiModelProperty(required = true, value = "True to include social shares, false otherwise")

  public Boolean getSocialShares() {
    return socialShares;
  }


  public void setSocialShares(Boolean socialShares) {
    this.socialShares = socialShares;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailEventsListStatsFields emailEventsListStatsFields = (EmailEventsListStatsFields) o;
    return Objects.equals(this.opens, emailEventsListStatsFields.opens) &&
        Objects.equals(this.clicks, emailEventsListStatsFields.clicks) &&
        Objects.equals(this.complaints, emailEventsListStatsFields.complaints) &&
        Objects.equals(this.unsubscribes, emailEventsListStatsFields.unsubscribes) &&
        Objects.equals(this.bounces, emailEventsListStatsFields.bounces) &&
        Objects.equals(this.forwards, emailEventsListStatsFields.forwards) &&
        Objects.equals(this.forwardsConversion, emailEventsListStatsFields.forwardsConversion) &&
        Objects.equals(this.fbLikes, emailEventsListStatsFields.fbLikes) &&
        Objects.equals(this.fbShares, emailEventsListStatsFields.fbShares) &&
        Objects.equals(this.twShares, emailEventsListStatsFields.twShares) &&
        Objects.equals(this.socialShares, emailEventsListStatsFields.socialShares);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opens, clicks, complaints, unsubscribes, bounces, forwards, forwardsConversion, fbLikes, fbShares, twShares, socialShares);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailEventsListStatsFields {\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    complaints: ").append(toIndentedString(complaints)).append("\n");
    sb.append("    unsubscribes: ").append(toIndentedString(unsubscribes)).append("\n");
    sb.append("    bounces: ").append(toIndentedString(bounces)).append("\n");
    sb.append("    forwards: ").append(toIndentedString(forwards)).append("\n");
    sb.append("    forwardsConversion: ").append(toIndentedString(forwardsConversion)).append("\n");
    sb.append("    fbLikes: ").append(toIndentedString(fbLikes)).append("\n");
    sb.append("    fbShares: ").append(toIndentedString(fbShares)).append("\n");
    sb.append("    twShares: ").append(toIndentedString(twShares)).append("\n");
    sb.append("    socialShares: ").append(toIndentedString(socialShares)).append("\n");
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

