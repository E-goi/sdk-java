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

/**
 * SavedSegmentAllOfSegmentFilterSegmentFilterArray
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T20:27:19.076308+01:00[Europe/Lisbon]")
public class SavedSegmentAllOfSegmentFilterSegmentFilterArray   {
  public static final String SERIALIZED_NAME_SEGMENT_FIELD = "segment_field";
  @SerializedName(SERIALIZED_NAME_SEGMENT_FIELD)
  private String segmentField;

  /**
   * Segment operator used for comparison. When using a range of dates split them                                             using the following format: date1||date2
   */
  @JsonAdapter(SegmentOperatorEnum.Adapter.class)
  public enum SegmentOperatorEnum {
    EQUAL_TO("equal_to"),
    
    NOT_EQUAL_TO("not_equal_to"),
    
    GREATER_OR_EQUAL_TO("greater_or_equal_to"),
    
    GREATER_THAN("greater_than"),
    
    LESS_OR_EQUAL_TO("less_or_equal_to"),
    
    LESS_THAN("less_than"),
    
    CONTAINS("contains"),
    
    DOES_NOT_CONTAIN("does_not_contain"),
    
    BEGINS_WITH("begins_with"),
    
    ENDS_WITH("ends_with"),
    
    DATE_RANGE("date_range");

    private String value;

    SegmentOperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SegmentOperatorEnum fromValue(String value) {
      for (SegmentOperatorEnum b : SegmentOperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SegmentOperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SegmentOperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SegmentOperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SegmentOperatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEGMENT_OPERATOR = "segment_operator";
  @SerializedName(SERIALIZED_NAME_SEGMENT_OPERATOR)
  private SegmentOperatorEnum segmentOperator;

  public static final String SERIALIZED_NAME_SEGMENT_VALUE = "segment_value";
  @SerializedName(SERIALIZED_NAME_SEGMENT_VALUE)
  private String segmentValue;


  public SavedSegmentAllOfSegmentFilterSegmentFilterArray segmentField(String segmentField) {
    
    this.segmentField = segmentField;
    return this;
  }

   /**
   * Field internal name (retrieve fields using GET: /lists/{list_id}/fields)
   * @return segmentField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field internal name (retrieve fields using GET: /lists/{list_id}/fields)")

  public String getSegmentField() {
    return segmentField;
  }


  public void setSegmentField(String segmentField) {
    this.segmentField = segmentField;
  }


  public SavedSegmentAllOfSegmentFilterSegmentFilterArray segmentOperator(SegmentOperatorEnum segmentOperator) {
    
    this.segmentOperator = segmentOperator;
    return this;
  }

   /**
   * Segment operator used for comparison. When using a range of dates split them                                             using the following format: date1||date2
   * @return segmentOperator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Segment operator used for comparison. When using a range of dates split them                                             using the following format: date1||date2")

  public SegmentOperatorEnum getSegmentOperator() {
    return segmentOperator;
  }


  public void setSegmentOperator(SegmentOperatorEnum segmentOperator) {
    this.segmentOperator = segmentOperator;
  }


  public SavedSegmentAllOfSegmentFilterSegmentFilterArray segmentValue(String segmentValue) {
    
    this.segmentValue = segmentValue;
    return this;
  }

   /**
   * Segment search value
   * @return segmentValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Segment search value")

  public String getSegmentValue() {
    return segmentValue;
  }


  public void setSegmentValue(String segmentValue) {
    this.segmentValue = segmentValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedSegmentAllOfSegmentFilterSegmentFilterArray savedSegmentAllOfSegmentFilterSegmentFilterArray = (SavedSegmentAllOfSegmentFilterSegmentFilterArray) o;
    return Objects.equals(this.segmentField, savedSegmentAllOfSegmentFilterSegmentFilterArray.segmentField) &&
        Objects.equals(this.segmentOperator, savedSegmentAllOfSegmentFilterSegmentFilterArray.segmentOperator) &&
        Objects.equals(this.segmentValue, savedSegmentAllOfSegmentFilterSegmentFilterArray.segmentValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segmentField, segmentOperator, segmentValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedSegmentAllOfSegmentFilterSegmentFilterArray {\n");
    sb.append("    segmentField: ").append(toIndentedString(segmentField)).append("\n");
    sb.append("    segmentOperator: ").append(toIndentedString(segmentOperator)).append("\n");
    sb.append("    segmentValue: ").append(toIndentedString(segmentValue)).append("\n");
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

