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
 * List stats fields to include in the report
 */
@ApiModel(description = "List stats fields to include in the report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-19T15:12:15.913371Z[Europe/Lisbon]")
public class EmailClicksByUrlListStatsFields   {
  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Boolean clicks;

  public static final String SERIALIZED_NAME_UNIQUE_CLICKS = "unique_clicks";
  @SerializedName(SERIALIZED_NAME_UNIQUE_CLICKS)
  private Boolean uniqueClicks;

  public static final String SERIALIZED_NAME_CLICK_RATE_PER_URL = "click_rate_per_url";
  @SerializedName(SERIALIZED_NAME_CLICK_RATE_PER_URL)
  private Boolean clickRatePerUrl;


  public EmailClicksByUrlListStatsFields clicks(Boolean clicks) {
    
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


  public EmailClicksByUrlListStatsFields uniqueClicks(Boolean uniqueClicks) {
    
    this.uniqueClicks = uniqueClicks;
    return this;
  }

   /**
   * True to include unique clicks, false otherwise
   * @return uniqueClicks
  **/
  @ApiModelProperty(required = true, value = "True to include unique clicks, false otherwise")

  public Boolean getUniqueClicks() {
    return uniqueClicks;
  }


  public void setUniqueClicks(Boolean uniqueClicks) {
    this.uniqueClicks = uniqueClicks;
  }


  public EmailClicksByUrlListStatsFields clickRatePerUrl(Boolean clickRatePerUrl) {
    
    this.clickRatePerUrl = clickRatePerUrl;
    return this;
  }

   /**
   * True to include click rate per URL, false otherwise
   * @return clickRatePerUrl
  **/
  @ApiModelProperty(required = true, value = "True to include click rate per URL, false otherwise")

  public Boolean getClickRatePerUrl() {
    return clickRatePerUrl;
  }


  public void setClickRatePerUrl(Boolean clickRatePerUrl) {
    this.clickRatePerUrl = clickRatePerUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailClicksByUrlListStatsFields emailClicksByUrlListStatsFields = (EmailClicksByUrlListStatsFields) o;
    return Objects.equals(this.clicks, emailClicksByUrlListStatsFields.clicks) &&
        Objects.equals(this.uniqueClicks, emailClicksByUrlListStatsFields.uniqueClicks) &&
        Objects.equals(this.clickRatePerUrl, emailClicksByUrlListStatsFields.clickRatePerUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clicks, uniqueClicks, clickRatePerUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailClicksByUrlListStatsFields {\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    uniqueClicks: ").append(toIndentedString(uniqueClicks)).append("\n");
    sb.append("    clickRatePerUrl: ").append(toIndentedString(clickRatePerUrl)).append("\n");
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

