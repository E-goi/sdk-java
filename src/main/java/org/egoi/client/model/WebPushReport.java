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
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.WebPushReportBrowsers;
import org.egoi.client.model.WebPushReportOperatingSystems;
import org.egoi.client.model.WebPushStats;

/**
 * Webpush report schema
 */
@ApiModel(description = "Webpush report schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:12:38.678183Z[Europe/Lisbon]")
public class WebPushReport   {
  public static final String SERIALIZED_NAME_CAMPAIGN_HASH = "campaign_hash";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_HASH)
  private String campaignHash;

  public static final String SERIALIZED_NAME_OVERALL = "overall";
  @SerializedName(SERIALIZED_NAME_OVERALL)
  private WebPushStats overall;

  public static final String SERIALIZED_NAME_DEVICES = "devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<Object> devices = null;

  public static final String SERIALIZED_NAME_OPERATING_SYSTEMS = "operating_systems";
  @SerializedName(SERIALIZED_NAME_OPERATING_SYSTEMS)
  private List<WebPushReportOperatingSystems> operatingSystems = null;

  public static final String SERIALIZED_NAME_BROWSERS = "browsers";
  @SerializedName(SERIALIZED_NAME_BROWSERS)
  private List<WebPushReportBrowsers> browsers = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private List<Object> url = null;


   /**
   * Get campaignHash
   * @return campaignHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCampaignHash() {
    return campaignHash;
  }




  public WebPushReport overall(WebPushStats overall) {
    
    this.overall = overall;
    return this;
  }

   /**
   * Get overall
   * @return overall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebPushStats getOverall() {
    return overall;
  }


  public void setOverall(WebPushStats overall) {
    this.overall = overall;
  }


  public WebPushReport devices(List<Object> devices) {
    
    this.devices = devices;
    return this;
  }

  public WebPushReport addDevicesItem(Object devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<Object>();
    }
    this.devices.add(devicesItem);
    return this;
  }

   /**
   * Stats of the campaign for each device
   * @return devices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stats of the campaign for each device")

  public List<Object> getDevices() {
    return devices;
  }


  public void setDevices(List<Object> devices) {
    this.devices = devices;
  }


  public WebPushReport operatingSystems(List<WebPushReportOperatingSystems> operatingSystems) {
    
    this.operatingSystems = operatingSystems;
    return this;
  }

  public WebPushReport addOperatingSystemsItem(WebPushReportOperatingSystems operatingSystemsItem) {
    if (this.operatingSystems == null) {
      this.operatingSystems = new ArrayList<WebPushReportOperatingSystems>();
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

  public List<WebPushReportOperatingSystems> getOperatingSystems() {
    return operatingSystems;
  }


  public void setOperatingSystems(List<WebPushReportOperatingSystems> operatingSystems) {
    this.operatingSystems = operatingSystems;
  }


  public WebPushReport browsers(List<WebPushReportBrowsers> browsers) {
    
    this.browsers = browsers;
    return this;
  }

  public WebPushReport addBrowsersItem(WebPushReportBrowsers browsersItem) {
    if (this.browsers == null) {
      this.browsers = new ArrayList<WebPushReportBrowsers>();
    }
    this.browsers.add(browsersItem);
    return this;
  }

   /**
   * Stats of the campaign for each browser
   * @return browsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stats of the campaign for each browser")

  public List<WebPushReportBrowsers> getBrowsers() {
    return browsers;
  }


  public void setBrowsers(List<WebPushReportBrowsers> browsers) {
    this.browsers = browsers;
  }


  public WebPushReport url(List<Object> url) {
    
    this.url = url;
    return this;
  }

  public WebPushReport addUrlItem(Object urlItem) {
    if (this.url == null) {
      this.url = new ArrayList<Object>();
    }
    this.url.add(urlItem);
    return this;
  }

   /**
   * Stats of the campaign for each url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stats of the campaign for each url")

  public List<Object> getUrl() {
    return url;
  }


  public void setUrl(List<Object> url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebPushReport webPushReport = (WebPushReport) o;
    return Objects.equals(this.campaignHash, webPushReport.campaignHash) &&
        Objects.equals(this.overall, webPushReport.overall) &&
        Objects.equals(this.devices, webPushReport.devices) &&
        Objects.equals(this.operatingSystems, webPushReport.operatingSystems) &&
        Objects.equals(this.browsers, webPushReport.browsers) &&
        Objects.equals(this.url, webPushReport.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignHash, overall, devices, operatingSystems, browsers, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebPushReport {\n");
    sb.append("    campaignHash: ").append(toIndentedString(campaignHash)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    operatingSystems: ").append(toIndentedString(operatingSystems)).append("\n");
    sb.append("    browsers: ").append(toIndentedString(browsers)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
