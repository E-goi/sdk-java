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
import org.egoi.client.model.AdvancedReportCampaignsObject;
import org.egoi.client.model.AdvancedReportEmailClicksByUrlColumns;
import org.egoi.client.model.AdvancedReportEmailClicksByUrlOptions;
import org.egoi.client.model.AdvancedReportRange;

/**
 * Generate email clicks by URL report schema
 */
@ApiModel(description = "Generate email clicks by URL report schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T20:27:19.076308+01:00[Europe/Lisbon]")
public class GenerateEmailClicksByUrlReport   {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private AdvancedReportRange range;

  public static final String SERIALIZED_NAME_CAMPAIGNS = "campaigns";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS)
  private List<AdvancedReportCampaignsObject> campaigns = new ArrayList<AdvancedReportCampaignsObject>();

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private AdvancedReportEmailClicksByUrlColumns columns;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private AdvancedReportEmailClicksByUrlOptions options;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callback_url";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;


  public GenerateEmailClicksByUrlReport title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Advanced report title
   * @return title
  **/
  @ApiModelProperty(example = "Report title", required = true, value = "Advanced report title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public GenerateEmailClicksByUrlReport range(AdvancedReportRange range) {
    
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(required = true, value = "")

  public AdvancedReportRange getRange() {
    return range;
  }


  public void setRange(AdvancedReportRange range) {
    this.range = range;
  }


  public GenerateEmailClicksByUrlReport campaigns(List<AdvancedReportCampaignsObject> campaigns) {
    
    this.campaigns = campaigns;
    return this;
  }

  public GenerateEmailClicksByUrlReport addCampaignsItem(AdvancedReportCampaignsObject campaignsItem) {
    this.campaigns.add(campaignsItem);
    return this;
  }

   /**
   * Campaigns of the report
   * @return campaigns
  **/
  @ApiModelProperty(required = true, value = "Campaigns of the report")

  public List<AdvancedReportCampaignsObject> getCampaigns() {
    return campaigns;
  }


  public void setCampaigns(List<AdvancedReportCampaignsObject> campaigns) {
    this.campaigns = campaigns;
  }


  public GenerateEmailClicksByUrlReport columns(AdvancedReportEmailClicksByUrlColumns columns) {
    
    this.columns = columns;
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @ApiModelProperty(required = true, value = "")

  public AdvancedReportEmailClicksByUrlColumns getColumns() {
    return columns;
  }


  public void setColumns(AdvancedReportEmailClicksByUrlColumns columns) {
    this.columns = columns;
  }


  public GenerateEmailClicksByUrlReport options(AdvancedReportEmailClicksByUrlOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @ApiModelProperty(required = true, value = "")

  public AdvancedReportEmailClicksByUrlOptions getOptions() {
    return options;
  }


  public void setOptions(AdvancedReportEmailClicksByUrlOptions options) {
    this.options = options;
  }


  public GenerateEmailClicksByUrlReport callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * URL which will receive the information of the report
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL which will receive the information of the report")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateEmailClicksByUrlReport generateEmailClicksByUrlReport = (GenerateEmailClicksByUrlReport) o;
    return Objects.equals(this.title, generateEmailClicksByUrlReport.title) &&
        Objects.equals(this.range, generateEmailClicksByUrlReport.range) &&
        Objects.equals(this.campaigns, generateEmailClicksByUrlReport.campaigns) &&
        Objects.equals(this.columns, generateEmailClicksByUrlReport.columns) &&
        Objects.equals(this.options, generateEmailClicksByUrlReport.options) &&
        Objects.equals(this.callbackUrl, generateEmailClicksByUrlReport.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, range, campaigns, columns, options, callbackUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateEmailClicksByUrlReport {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
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

