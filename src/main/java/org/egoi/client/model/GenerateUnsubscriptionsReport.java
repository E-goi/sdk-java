/*
 * APIv3 (New)
 *  # Introduction This is our new version of API. We invite you to start using it and give us your feedback # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.  The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.      BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication  We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:     #!/bin/bash     curl -X GET 'https://api.egoiapp.com/my-account' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:     #!/bin/bash     curl -X POST 'http://api.egoiapp.com/tags' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>' \\     -H 'Content-Type: application/json' \\     -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB.  # Timeouts Timeouts set a maximum waiting time on a request's response. Our API, sets a default timeout for each request and when breached, you'll receive an HTTP **408 (Request Timeout)** error code. You should take into consideration that response times can vary widely based on the complexity of the request, amount of data being analyzed, and the load on the system and workspace at the time of the query. When dealing with such errors, you should first attempt to reduce the complexity and amount of data under analysis, and only then, if problems are still occurring ask for support.  For all these reasons, the default timeout for each request is **10 Seconds** and any request that creates or modifies data (**POST**, **PATCH** and **PUT**) will have a timeout of **60 Seconds**. Specific timeouts may exist for specific requests, these can be found in the request's documentation.  # Callbacks A callback is an asynchronous API request that originates from the API server and is sent to the client in response to a previous request sent by that client.  The API will make a **POST** request to the address defined in the URL with the information regarding the event of interest and share data related to that event.  <a href='/usecases/callbacks/' target='_blank'>[Go to callbacks documentation]</a>  ***Note:*** Only http or https protocols are supported in the Url parameter.  <security-definitions/>
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
import org.egoi.client.model.AdvancedReportRange;
import org.egoi.client.model.AdvancedReportUnsubscriptionsColumns;
import org.egoi.client.model.AdvancedReportUnsubscriptionsOptions;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.egoi.client.JSON;

/**
 * Generate unsubscriptions report schema
 */
@ApiModel(description = "Generate unsubscriptions report schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-18T08:41:12.682597+01:00[Europe/Lisbon]")
public class GenerateUnsubscriptionsReport {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private AdvancedReportRange range;

  public static final String SERIALIZED_NAME_LISTS = "lists";
  @SerializedName(SERIALIZED_NAME_LISTS)
  private List<Integer> lists = new ArrayList<>();

  public static final String SERIALIZED_NAME_COLUMNS = "columns";
  @SerializedName(SERIALIZED_NAME_COLUMNS)
  private AdvancedReportUnsubscriptionsColumns columns;

  public static final String SERIALIZED_NAME_OPTIONS = "options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private AdvancedReportUnsubscriptionsOptions options;

  public static final String SERIALIZED_NAME_CALLBACK_URL = "callback_url";
  @SerializedName(SERIALIZED_NAME_CALLBACK_URL)
  private String callbackUrl;

  public GenerateUnsubscriptionsReport() {
  }

  public GenerateUnsubscriptionsReport title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Advanced report title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Report title", required = true, value = "Advanced report title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public GenerateUnsubscriptionsReport range(AdvancedReportRange range) {
    
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AdvancedReportRange getRange() {
    return range;
  }


  public void setRange(AdvancedReportRange range) {
    this.range = range;
  }


  public GenerateUnsubscriptionsReport lists(List<Integer> lists) {
    
    this.lists = lists;
    return this;
  }

  public GenerateUnsubscriptionsReport addListsItem(Integer listsItem) {
    this.lists.add(listsItem);
    return this;
  }

   /**
   * Array of List Id&#39;s
   * @return lists
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of List Id's")

  public List<Integer> getLists() {
    return lists;
  }


  public void setLists(List<Integer> lists) {
    this.lists = lists;
  }


  public GenerateUnsubscriptionsReport columns(AdvancedReportUnsubscriptionsColumns columns) {
    
    this.columns = columns;
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AdvancedReportUnsubscriptionsColumns getColumns() {
    return columns;
  }


  public void setColumns(AdvancedReportUnsubscriptionsColumns columns) {
    this.columns = columns;
  }


  public GenerateUnsubscriptionsReport options(AdvancedReportUnsubscriptionsOptions options) {
    
    this.options = options;
    return this;
  }

   /**
   * Get options
   * @return options
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public AdvancedReportUnsubscriptionsOptions getOptions() {
    return options;
  }


  public void setOptions(AdvancedReportUnsubscriptionsOptions options) {
    this.options = options;
  }


  public GenerateUnsubscriptionsReport callbackUrl(String callbackUrl) {
    
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * URL which will receive the information of the report &lt;a href&#x3D;&#39;/usecases/callbacks/&#39; target&#x3D;&#39;_blank&#39;&gt;[Go to callback documentation]&lt;/a&gt;
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL which will receive the information of the report <a href='/usecases/callbacks/' target='_blank'>[Go to callback documentation]</a>")

  public String getCallbackUrl() {
    return callbackUrl;
  }


  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateUnsubscriptionsReport generateUnsubscriptionsReport = (GenerateUnsubscriptionsReport) o;
    return Objects.equals(this.title, generateUnsubscriptionsReport.title) &&
        Objects.equals(this.range, generateUnsubscriptionsReport.range) &&
        Objects.equals(this.lists, generateUnsubscriptionsReport.lists) &&
        Objects.equals(this.columns, generateUnsubscriptionsReport.columns) &&
        Objects.equals(this.options, generateUnsubscriptionsReport.options) &&
        Objects.equals(this.callbackUrl, generateUnsubscriptionsReport.callbackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, range, lists, columns, options, callbackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateUnsubscriptionsReport {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("title");
    openapiFields.add("range");
    openapiFields.add("lists");
    openapiFields.add("columns");
    openapiFields.add("options");
    openapiFields.add("callback_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("range");
    openapiRequiredFields.add("lists");
    openapiRequiredFields.add("columns");
    openapiRequiredFields.add("options");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GenerateUnsubscriptionsReport
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GenerateUnsubscriptionsReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GenerateUnsubscriptionsReport is not found in the empty JSON string", GenerateUnsubscriptionsReport.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GenerateUnsubscriptionsReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GenerateUnsubscriptionsReport` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GenerateUnsubscriptionsReport.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      // validate the required field `range`
      AdvancedReportRange.validateJsonObject(jsonObj.getAsJsonObject("range"));
      // ensure the required json array is present
      if (jsonObj.get("lists") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("lists").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lists` to be an array in the JSON string but got `%s`", jsonObj.get("lists").toString()));
      }
      // validate the required field `columns`
      AdvancedReportUnsubscriptionsColumns.validateJsonObject(jsonObj.getAsJsonObject("columns"));
      // validate the required field `options`
      AdvancedReportUnsubscriptionsOptions.validateJsonObject(jsonObj.getAsJsonObject("options"));
      if ((jsonObj.get("callback_url") != null && !jsonObj.get("callback_url").isJsonNull()) && !jsonObj.get("callback_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `callback_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("callback_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GenerateUnsubscriptionsReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GenerateUnsubscriptionsReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GenerateUnsubscriptionsReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GenerateUnsubscriptionsReport.class));

       return (TypeAdapter<T>) new TypeAdapter<GenerateUnsubscriptionsReport>() {
           @Override
           public void write(JsonWriter out, GenerateUnsubscriptionsReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GenerateUnsubscriptionsReport read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GenerateUnsubscriptionsReport given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GenerateUnsubscriptionsReport
  * @throws IOException if the JSON string is invalid with respect to GenerateUnsubscriptionsReport
  */
  public static GenerateUnsubscriptionsReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GenerateUnsubscriptionsReport.class);
  }

 /**
  * Convert an instance of GenerateUnsubscriptionsReport to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

