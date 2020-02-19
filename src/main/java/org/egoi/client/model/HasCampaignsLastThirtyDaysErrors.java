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
 * HasCampaignsLastThirtyDaysErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-19T15:12:15.913371Z[Europe/Lisbon]")
public class HasCampaignsLastThirtyDaysErrors   {
  /**
   * Occurs when a list has campaigns sent in the last thirty days
   */
  @JsonAdapter(HasCampaignsLastThirtyDaysEnum.Adapter.class)
  public enum HasCampaignsLastThirtyDaysEnum {
    THE_LIST_HAS_SENT_CAMPAIGNS_IN_THE_LAST_THIRTY_DAYS("The list has sent campaigns in the last thirty days");

    private String value;

    HasCampaignsLastThirtyDaysEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HasCampaignsLastThirtyDaysEnum fromValue(String value) {
      for (HasCampaignsLastThirtyDaysEnum b : HasCampaignsLastThirtyDaysEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HasCampaignsLastThirtyDaysEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HasCampaignsLastThirtyDaysEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HasCampaignsLastThirtyDaysEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HasCampaignsLastThirtyDaysEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HAS_CAMPAIGNS_LAST_THIRTY_DAYS = "has_campaigns_last_thirty_days";
  @SerializedName(SERIALIZED_NAME_HAS_CAMPAIGNS_LAST_THIRTY_DAYS)
  private HasCampaignsLastThirtyDaysEnum hasCampaignsLastThirtyDays;


  public HasCampaignsLastThirtyDaysErrors hasCampaignsLastThirtyDays(HasCampaignsLastThirtyDaysEnum hasCampaignsLastThirtyDays) {
    
    this.hasCampaignsLastThirtyDays = hasCampaignsLastThirtyDays;
    return this;
  }

   /**
   * Occurs when a list has campaigns sent in the last thirty days
   * @return hasCampaignsLastThirtyDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Occurs when a list has campaigns sent in the last thirty days")

  public HasCampaignsLastThirtyDaysEnum getHasCampaignsLastThirtyDays() {
    return hasCampaignsLastThirtyDays;
  }


  public void setHasCampaignsLastThirtyDays(HasCampaignsLastThirtyDaysEnum hasCampaignsLastThirtyDays) {
    this.hasCampaignsLastThirtyDays = hasCampaignsLastThirtyDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HasCampaignsLastThirtyDaysErrors hasCampaignsLastThirtyDaysErrors = (HasCampaignsLastThirtyDaysErrors) o;
    return Objects.equals(this.hasCampaignsLastThirtyDays, hasCampaignsLastThirtyDaysErrors.hasCampaignsLastThirtyDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasCampaignsLastThirtyDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HasCampaignsLastThirtyDaysErrors {\n");
    sb.append("    hasCampaignsLastThirtyDays: ").append(toIndentedString(hasCampaignsLastThirtyDays)).append("\n");
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

