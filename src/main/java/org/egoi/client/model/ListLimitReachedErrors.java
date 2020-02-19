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
 * ListLimitReachedErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-19T15:12:15.913371Z[Europe/Lisbon]")
public class ListLimitReachedErrors   {
  /**
   * Occurs when an account reaches the maximum number of lists allowed in its plan
   */
  @JsonAdapter(ListLimitReachedEnum.Adapter.class)
  public enum ListLimitReachedEnum {
    THE_MAXIMUM_NUMBER_OF_ALLOWED_LISTS_WAS_REACHED("The maximum number of allowed lists was reached");

    private String value;

    ListLimitReachedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ListLimitReachedEnum fromValue(String value) {
      for (ListLimitReachedEnum b : ListLimitReachedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ListLimitReachedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ListLimitReachedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ListLimitReachedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ListLimitReachedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_LIST_LIMIT_REACHED = "list_limit_reached";
  @SerializedName(SERIALIZED_NAME_LIST_LIMIT_REACHED)
  private ListLimitReachedEnum listLimitReached;


  public ListLimitReachedErrors listLimitReached(ListLimitReachedEnum listLimitReached) {
    
    this.listLimitReached = listLimitReached;
    return this;
  }

   /**
   * Occurs when an account reaches the maximum number of lists allowed in its plan
   * @return listLimitReached
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Occurs when an account reaches the maximum number of lists allowed in its plan")

  public ListLimitReachedEnum getListLimitReached() {
    return listLimitReached;
  }


  public void setListLimitReached(ListLimitReachedEnum listLimitReached) {
    this.listLimitReached = listLimitReached;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListLimitReachedErrors listLimitReachedErrors = (ListLimitReachedErrors) o;
    return Objects.equals(this.listLimitReached, listLimitReachedErrors.listLimitReached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listLimitReached);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListLimitReachedErrors {\n");
    sb.append("    listLimitReached: ").append(toIndentedString(listLimitReached)).append("\n");
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

