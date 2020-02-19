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
 * HasAutomationsErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-19T15:12:15.913371Z[Europe/Lisbon]")
public class HasAutomationsErrors   {
  /**
   * Occurs when a list has automations
   */
  @JsonAdapter(HasAutomationsEnum.Adapter.class)
  public enum HasAutomationsEnum {
    THE_LIST_HAS_AUTOMATIONS("The list has automations");

    private String value;

    HasAutomationsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static HasAutomationsEnum fromValue(String value) {
      for (HasAutomationsEnum b : HasAutomationsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<HasAutomationsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final HasAutomationsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public HasAutomationsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return HasAutomationsEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_HAS_AUTOMATIONS = "has_automations";
  @SerializedName(SERIALIZED_NAME_HAS_AUTOMATIONS)
  private HasAutomationsEnum hasAutomations;


  public HasAutomationsErrors hasAutomations(HasAutomationsEnum hasAutomations) {
    
    this.hasAutomations = hasAutomations;
    return this;
  }

   /**
   * Occurs when a list has automations
   * @return hasAutomations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Occurs when a list has automations")

  public HasAutomationsEnum getHasAutomations() {
    return hasAutomations;
  }


  public void setHasAutomations(HasAutomationsEnum hasAutomations) {
    this.hasAutomations = hasAutomations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HasAutomationsErrors hasAutomationsErrors = (HasAutomationsErrors) o;
    return Objects.equals(this.hasAutomations, hasAutomationsErrors.hasAutomations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasAutomations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HasAutomationsErrors {\n");
    sb.append("    hasAutomations: ").append(toIndentedString(hasAutomations)).append("\n");
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

