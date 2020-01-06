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
 * CampaignSentLast30DaysErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:12:38.678183Z[Europe/Lisbon]")
public class CampaignSentLast30DaysErrors   {
  /**
   * Occurs when the campaign was sent in the last 30 days
   */
  @JsonAdapter(CampaignSentLast30DaysEnum.Adapter.class)
  public enum CampaignSentLast30DaysEnum {
    THIS_CAMPAIGN_CAN_T_BE_DELETED_SINCE_IT_WAS_SENT_IN_THE_LAST_30_DAYS("This campaign can't be deleted since it was sent in the last 30 days");

    private String value;

    CampaignSentLast30DaysEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CampaignSentLast30DaysEnum fromValue(String value) {
      for (CampaignSentLast30DaysEnum b : CampaignSentLast30DaysEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CampaignSentLast30DaysEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CampaignSentLast30DaysEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CampaignSentLast30DaysEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CampaignSentLast30DaysEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CAMPAIGN_SENT_LAST30_DAYS = "campaign_sent_last_30_days";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_SENT_LAST30_DAYS)
  private CampaignSentLast30DaysEnum campaignSentLast30Days;


  public CampaignSentLast30DaysErrors campaignSentLast30Days(CampaignSentLast30DaysEnum campaignSentLast30Days) {
    
    this.campaignSentLast30Days = campaignSentLast30Days;
    return this;
  }

   /**
   * Occurs when the campaign was sent in the last 30 days
   * @return campaignSentLast30Days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Occurs when the campaign was sent in the last 30 days")

  public CampaignSentLast30DaysEnum getCampaignSentLast30Days() {
    return campaignSentLast30Days;
  }


  public void setCampaignSentLast30Days(CampaignSentLast30DaysEnum campaignSentLast30Days) {
    this.campaignSentLast30Days = campaignSentLast30Days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSentLast30DaysErrors campaignSentLast30DaysErrors = (CampaignSentLast30DaysErrors) o;
    return Objects.equals(this.campaignSentLast30Days, campaignSentLast30DaysErrors.campaignSentLast30Days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignSentLast30Days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSentLast30DaysErrors {\n");
    sb.append("    campaignSentLast30Days: ").append(toIndentedString(campaignSentLast30Days)).append("\n");
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
