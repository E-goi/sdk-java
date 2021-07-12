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
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.CampaignHash;
import org.egoi.client.model.Overall;
import org.egoi.client.model.OverallOverall;
import org.egoi.client.model.PushReportAllOf;

/**
 * Push report schema
 */
@ApiModel(description = "Push report schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T20:27:19.076308+01:00[Europe/Lisbon]")
public class PushReport   {
  public static final String SERIALIZED_NAME_CAMPAIGN_HASH = "campaign_hash";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_HASH)
  private String campaignHash;

  public static final String SERIALIZED_NAME_OVERALL = "overall";
  @SerializedName(SERIALIZED_NAME_OVERALL)
  private OverallOverall overall;

  public static final String SERIALIZED_NAME_OPERATING_SYSTEMS = "operating_systems";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEMS)
  private List<Object> operatingSystems = null;

  public static final String SERIALIZED_NAME_BRANDS = "brands";
  @SerializedName(SERIALIZED_NAME_BRANDS)
  private List<Object> brands = null;


   /**
   * Get campaignHash
   * @return campaignHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCampaignHash() {
    return campaignHash;
  }




  public PushReport overall(OverallOverall overall) {
    
    this.overall = overall;
    return this;
  }

   /**
   * Get overall
   * @return overall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OverallOverall getOverall() {
    return overall;
  }


  public void setOverall(OverallOverall overall) {
    this.overall = overall;
  }


  public PushReport operatingSystems(List<Object> operatingSystems) {
    
    this.operatingSystems = operatingSystems;
    return this;
  }

  public PushReport addOperatingSystemsItem(Object operatingSystemsItem) {
    if (this.operatingSystems == null) {
      this.operatingSystems = new ArrayList<Object>();
    }
    this.operatingSystems.add(operatingSystemsItem);
    return this;
  }

   /**
   * Stats of the campaign for each operating system
   * @return operatingSystems
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stats of the campaign for each operating system")

  public List<Object> getOperatingSystems() {
    return operatingSystems;
  }


  public void setOperatingSystems(List<Object> operatingSystems) {
    this.operatingSystems = operatingSystems;
  }


  public PushReport brands(List<Object> brands) {
    
    this.brands = brands;
    return this;
  }

  public PushReport addBrandsItem(Object brandsItem) {
    if (this.brands == null) {
      this.brands = new ArrayList<Object>();
    }
    this.brands.add(brandsItem);
    return this;
  }

   /**
   * Stats of the campaign for each brand
   * @return brands
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stats of the campaign for each brand")

  public List<Object> getBrands() {
    return brands;
  }


  public void setBrands(List<Object> brands) {
    this.brands = brands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushReport pushReport = (PushReport) o;
    return Objects.equals(this.campaignHash, pushReport.campaignHash) &&
        Objects.equals(this.overall, pushReport.overall) &&
        Objects.equals(this.operatingSystems, pushReport.operatingSystems) &&
        Objects.equals(this.brands, pushReport.brands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignHash, overall, operatingSystems, brands);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushReport {\n");
    sb.append("    campaignHash: ").append(toIndentedString(campaignHash)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
    sb.append("    brands: ").append(toIndentedString(brands)).append("\n");
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

