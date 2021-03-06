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
import org.egoi.client.model.AppStructureList;

/**
 * Structure of an E-goi app.
 */
@ApiModel(description = "Structure of an E-goi app.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T20:27:19.076308+01:00[Europe/Lisbon]")
public class AppStructure   {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId;

  public static final String SERIALIZED_NAME_LIST = "list";
  @SerializedName(SERIALIZED_NAME_LIST)
  private AppStructureList list;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TWO_STEPS_CONFIG = "two_steps_config";
  @SerializedName(SERIALIZED_NAME_TWO_STEPS_CONFIG)
  private String twoStepsConfig;

  public static final String SERIALIZED_NAME_DEVELOPMENT = "development";
  @SerializedName(SERIALIZED_NAME_DEVELOPMENT)
  private Boolean development;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private String created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private String updated;


  public AppStructure appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * The ID of the app.
   * @return appId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the app.")

  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public AppStructure list(AppStructureList list) {
    
    this.list = list;
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AppStructureList getList() {
    return list;
  }


  public void setList(AppStructureList list) {
    this.list = list;
  }


  public AppStructure name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the app.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the app.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AppStructure description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the app.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the app.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public AppStructure twoStepsConfig(String twoStepsConfig) {
    
    this.twoStepsConfig = twoStepsConfig;
    return this;
  }

   /**
   * The column of the list used to map the token.
   * @return twoStepsConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The column of the list used to map the token.")

  public String getTwoStepsConfig() {
    return twoStepsConfig;
  }


  public void setTwoStepsConfig(String twoStepsConfig) {
    this.twoStepsConfig = twoStepsConfig;
  }


  public AppStructure development(Boolean development) {
    
    this.development = development;
    return this;
  }

   /**
   * Is app a development app.
   * @return development
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is app a development app.")

  public Boolean getDevelopment() {
    return development;
  }


  public void setDevelopment(Boolean development) {
    this.development = development;
  }


  public AppStructure created(String created) {
    
    this.created = created;
    return this;
  }

   /**
   * When the app was created.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the app was created.")

  public String getCreated() {
    return created;
  }


  public void setCreated(String created) {
    this.created = created;
  }


  public AppStructure updated(String updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * The last time the app was updated.
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last time the app was updated.")

  public String getUpdated() {
    return updated;
  }


  public void setUpdated(String updated) {
    this.updated = updated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppStructure appStructure = (AppStructure) o;
    return Objects.equals(this.appId, appStructure.appId) &&
        Objects.equals(this.list, appStructure.list) &&
        Objects.equals(this.name, appStructure.name) &&
        Objects.equals(this.description, appStructure.description) &&
        Objects.equals(this.twoStepsConfig, appStructure.twoStepsConfig) &&
        Objects.equals(this.development, appStructure.development) &&
        Objects.equals(this.created, appStructure.created) &&
        Objects.equals(this.updated, appStructure.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, list, name, description, twoStepsConfig, development, created, updated);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStructure {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    twoStepsConfig: ").append(toIndentedString(twoStepsConfig)).append("\n");
    sb.append("    development: ").append(toIndentedString(development)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

