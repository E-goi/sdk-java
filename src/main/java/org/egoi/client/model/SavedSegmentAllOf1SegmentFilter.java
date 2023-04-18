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
import org.egoi.client.model.SavedSegmentAllOf1SegmentFilterSegmentFilterArray;

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
 * Segment filter conditions
 */
@ApiModel(description = "Segment filter conditions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-18T08:41:12.682597+01:00[Europe/Lisbon]")
public class SavedSegmentAllOf1SegmentFilter {
  public static final String SERIALIZED_NAME_SEGMENT_FILTER_ARRAY = "segment_filter_array";
  @SerializedName(SERIALIZED_NAME_SEGMENT_FILTER_ARRAY)
  private List<SavedSegmentAllOf1SegmentFilterSegmentFilterArray> segmentFilterArray = null;

  /**
   * Boolean operator for all segment conditions
   */
  @JsonAdapter(BooleanOperatorEnum.Adapter.class)
  public enum BooleanOperatorEnum {
    AND("and"),
    
    OR("or");

    private String value;

    BooleanOperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static BooleanOperatorEnum fromValue(String value) {
      for (BooleanOperatorEnum b : BooleanOperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<BooleanOperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final BooleanOperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public BooleanOperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return BooleanOperatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_BOOLEAN_OPERATOR = "boolean_operator";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_OPERATOR)
  private BooleanOperatorEnum booleanOperator = BooleanOperatorEnum.AND;

  public static final String SERIALIZED_NAME_INVERT = "invert";
  @SerializedName(SERIALIZED_NAME_INVERT)
  private Boolean invert = false;

  public SavedSegmentAllOf1SegmentFilter() {
  }

  public SavedSegmentAllOf1SegmentFilter segmentFilterArray(List<SavedSegmentAllOf1SegmentFilterSegmentFilterArray> segmentFilterArray) {
    
    this.segmentFilterArray = segmentFilterArray;
    return this;
  }

  public SavedSegmentAllOf1SegmentFilter addSegmentFilterArrayItem(SavedSegmentAllOf1SegmentFilterSegmentFilterArray segmentFilterArrayItem) {
    if (this.segmentFilterArray == null) {
      this.segmentFilterArray = new ArrayList<>();
    }
    this.segmentFilterArray.add(segmentFilterArrayItem);
    return this;
  }

   /**
   * Array of filters
   * @return segmentFilterArray
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of filters")

  public List<SavedSegmentAllOf1SegmentFilterSegmentFilterArray> getSegmentFilterArray() {
    return segmentFilterArray;
  }


  public void setSegmentFilterArray(List<SavedSegmentAllOf1SegmentFilterSegmentFilterArray> segmentFilterArray) {
    this.segmentFilterArray = segmentFilterArray;
  }


  public SavedSegmentAllOf1SegmentFilter booleanOperator(BooleanOperatorEnum booleanOperator) {
    
    this.booleanOperator = booleanOperator;
    return this;
  }

   /**
   * Boolean operator for all segment conditions
   * @return booleanOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean operator for all segment conditions")

  public BooleanOperatorEnum getBooleanOperator() {
    return booleanOperator;
  }


  public void setBooleanOperator(BooleanOperatorEnum booleanOperator) {
    this.booleanOperator = booleanOperator;
  }


  public SavedSegmentAllOf1SegmentFilter invert(Boolean invert) {
    
    this.invert = invert;
    return this;
  }

   /**
   * If true inverts the search result
   * @return invert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true inverts the search result")

  public Boolean getInvert() {
    return invert;
  }


  public void setInvert(Boolean invert) {
    this.invert = invert;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedSegmentAllOf1SegmentFilter savedSegmentAllOf1SegmentFilter = (SavedSegmentAllOf1SegmentFilter) o;
    return Objects.equals(this.segmentFilterArray, savedSegmentAllOf1SegmentFilter.segmentFilterArray) &&
        Objects.equals(this.booleanOperator, savedSegmentAllOf1SegmentFilter.booleanOperator) &&
        Objects.equals(this.invert, savedSegmentAllOf1SegmentFilter.invert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentFilterArray, booleanOperator, invert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedSegmentAllOf1SegmentFilter {\n");
    sb.append("    segmentFilterArray: ").append(toIndentedString(segmentFilterArray)).append("\n");
    sb.append("    booleanOperator: ").append(toIndentedString(booleanOperator)).append("\n");
    sb.append("    invert: ").append(toIndentedString(invert)).append("\n");
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
    openapiFields.add("segment_filter_array");
    openapiFields.add("boolean_operator");
    openapiFields.add("invert");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SavedSegmentAllOf1SegmentFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SavedSegmentAllOf1SegmentFilter.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SavedSegmentAllOf1SegmentFilter is not found in the empty JSON string", SavedSegmentAllOf1SegmentFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SavedSegmentAllOf1SegmentFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SavedSegmentAllOf1SegmentFilter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("segment_filter_array") != null && !jsonObj.get("segment_filter_array").isJsonNull()) {
        JsonArray jsonArraysegmentFilterArray = jsonObj.getAsJsonArray("segment_filter_array");
        if (jsonArraysegmentFilterArray != null) {
          // ensure the json data is an array
          if (!jsonObj.get("segment_filter_array").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `segment_filter_array` to be an array in the JSON string but got `%s`", jsonObj.get("segment_filter_array").toString()));
          }

          // validate the optional field `segment_filter_array` (array)
          for (int i = 0; i < jsonArraysegmentFilterArray.size(); i++) {
            SavedSegmentAllOf1SegmentFilterSegmentFilterArray.validateJsonObject(jsonArraysegmentFilterArray.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("boolean_operator") != null && !jsonObj.get("boolean_operator").isJsonNull()) && !jsonObj.get("boolean_operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `boolean_operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("boolean_operator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SavedSegmentAllOf1SegmentFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SavedSegmentAllOf1SegmentFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SavedSegmentAllOf1SegmentFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SavedSegmentAllOf1SegmentFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<SavedSegmentAllOf1SegmentFilter>() {
           @Override
           public void write(JsonWriter out, SavedSegmentAllOf1SegmentFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SavedSegmentAllOf1SegmentFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SavedSegmentAllOf1SegmentFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SavedSegmentAllOf1SegmentFilter
  * @throws IOException if the JSON string is invalid with respect to SavedSegmentAllOf1SegmentFilter
  */
  public static SavedSegmentAllOf1SegmentFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SavedSegmentAllOf1SegmentFilter.class);
  }

 /**
  * Convert an instance of SavedSegmentAllOf1SegmentFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

