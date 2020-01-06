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

/**
 * Start automation to the provided contacts
 */
@ApiModel(description = "Start automation to the provided contacts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:12:38.678183Z[Europe/Lisbon]")
public class StartAutomationResponse   {
  public static final String SERIALIZED_NAME_AUTOMATION_ID = "automation_id";
  @SerializedName(SERIALIZED_NAME_AUTOMATION_ID)
  private Integer automationId;

  public static final String SERIALIZED_NAME_ACTION_ID = "action_id";
  @SerializedName(SERIALIZED_NAME_ACTION_ID)
  private Integer actionId;

  public static final String SERIALIZED_NAME_SUCCESS = "success";
  @SerializedName(SERIALIZED_NAME_SUCCESS)
  private List<String> success = null;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private List<String> error = null;


   /**
   * Get automationId
   * minimum: 1
   * @return automationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getAutomationId() {
    return automationId;
  }




   /**
   * Get actionId
   * minimum: 1
   * @return actionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getActionId() {
    return actionId;
  }




  public StartAutomationResponse success(List<String> success) {
    
    this.success = success;
    return this;
  }

  public StartAutomationResponse addSuccessItem(String successItem) {
    if (this.success == null) {
      this.success = new ArrayList<String>();
    }
    this.success.add(successItem);
    return this;
  }

   /**
   * Array of contacts where the automation was successfully started
   * @return success
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of contacts where the automation was successfully started")

  public List<String> getSuccess() {
    return success;
  }


  public void setSuccess(List<String> success) {
    this.success = success;
  }


  public StartAutomationResponse error(List<String> error) {
    
    this.error = error;
    return this;
  }

  public StartAutomationResponse addErrorItem(String errorItem) {
    if (this.error == null) {
      this.error = new ArrayList<String>();
    }
    this.error.add(errorItem);
    return this;
  }

   /**
   * Array of contacts where the automation was not successfully started
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of contacts where the automation was not successfully started")

  public List<String> getError() {
    return error;
  }


  public void setError(List<String> error) {
    this.error = error;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartAutomationResponse startAutomationResponse = (StartAutomationResponse) o;
    return Objects.equals(this.automationId, startAutomationResponse.automationId) &&
        Objects.equals(this.actionId, startAutomationResponse.actionId) &&
        Objects.equals(this.success, startAutomationResponse.success) &&
        Objects.equals(this.error, startAutomationResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automationId, actionId, success, error);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartAutomationResponse {\n");
    sb.append("    automationId: ").append(toIndentedString(automationId)).append("\n");
    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
