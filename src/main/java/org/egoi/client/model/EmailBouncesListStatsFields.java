/*
 * APIv3 (Beta)
 *  # Introduction Just a quick pick!!! This is our new version of API. Remember, it is not stable yet!!! But we invite you play with it and give us your feedback ;) # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # HTTP Methods for RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  <security-definitions/>
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:12:38.678183Z[Europe/Lisbon]")
public class EmailBouncesListStatsFields   {
  public static final String SERIALIZED_NAME_BOUNCE_DATE = "bounce_date";
  @SerializedName(SERIALIZED_NAME_BOUNCE_DATE)
  private Boolean bounceDate;

  public static final String SERIALIZED_NAME_BOUNCE_TYPE = "bounce_type";
  @SerializedName(SERIALIZED_NAME_BOUNCE_TYPE)
  private Boolean bounceType;

  public static final String SERIALIZED_NAME_BOUNCE_DETAIL = "bounce_detail";
  @SerializedName(SERIALIZED_NAME_BOUNCE_DETAIL)
  private Boolean bounceDetail;


  public EmailBouncesListStatsFields bounceDate(Boolean bounceDate) {
    
    this.bounceDate = bounceDate;
    return this;
  }

   /**
   * True to include bounce date, false otherwise
   * @return bounceDate
  **/
  @ApiModelProperty(required = true, value = "True to include bounce date, false otherwise")

  public Boolean getBounceDate() {
    return bounceDate;
  }


  public void setBounceDate(Boolean bounceDate) {
    this.bounceDate = bounceDate;
  }


  public EmailBouncesListStatsFields bounceType(Boolean bounceType) {
    
    this.bounceType = bounceType;
    return this;
  }

   /**
   * True to include bounce type, false otherwise
   * @return bounceType
  **/
  @ApiModelProperty(required = true, value = "True to include bounce type, false otherwise")

  public Boolean getBounceType() {
    return bounceType;
  }


  public void setBounceType(Boolean bounceType) {
    this.bounceType = bounceType;
  }


  public EmailBouncesListStatsFields bounceDetail(Boolean bounceDetail) {
    
    this.bounceDetail = bounceDetail;
    return this;
  }

   /**
   * True to include bounce detail, false otherwise
   * @return bounceDetail
  **/
  @ApiModelProperty(required = true, value = "True to include bounce detail, false otherwise")

  public Boolean getBounceDetail() {
    return bounceDetail;
  }


  public void setBounceDetail(Boolean bounceDetail) {
    this.bounceDetail = bounceDetail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmailBouncesListStatsFields emailBouncesListStatsFields = (EmailBouncesListStatsFields) o;
    return Objects.equals(this.bounceDate, emailBouncesListStatsFields.bounceDate) &&
        Objects.equals(this.bounceType, emailBouncesListStatsFields.bounceType) &&
        Objects.equals(this.bounceDetail, emailBouncesListStatsFields.bounceDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bounceDate, bounceType, bounceDetail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmailBouncesListStatsFields {\n");
    sb.append("    bounceDate: ").append(toIndentedString(bounceDate)).append("\n");
    sb.append("    bounceType: ").append(toIndentedString(bounceType)).append("\n");
    sb.append("    bounceDetail: ").append(toIndentedString(bounceDetail)).append("\n");
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

