/*
 * APIv3 (Beta)
 *  # Introduction Just a quick peek!!! This is our new version of API. Remember, it is not stable yet!!! But we invite you play with it and give us your feedback ;) # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB. <security-definitions/>
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
 * UnprocessableEntity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T12:53:53.038698+01:00[Europe/Lisbon]")
public class UnprocessableEntity   {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Object errors;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  /**
   * Error title
   */
  @JsonAdapter(TitleEnum.Adapter.class)
  public enum TitleEnum {
    UNPROCESSABLE_ENTITY("Unprocessable Entity");

    private String value;

    TitleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TitleEnum fromValue(String value) {
      for (TitleEnum b : TitleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TitleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TitleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TitleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TitleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private TitleEnum title;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_DETAIL = "detail";
  @SerializedName(SERIALIZED_NAME_DETAIL)
  private String detail;


  public UnprocessableEntity errors(Object errors) {
    
    this.errors = errors;
    return this;
  }

   /**
   * Information about the input validation
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the input validation")

  public Object getErrors() {
    return errors;
  }


  public void setErrors(Object errors) {
    this.errors = errors;
  }


  public UnprocessableEntity type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * RFC for status code definitions
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html", value = "RFC for status code definitions")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public UnprocessableEntity title(TitleEnum title) {
    
    this.title = title;
    return this;
  }

   /**
   * Error title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error title")

  public TitleEnum getTitle() {
    return title;
  }


  public void setTitle(TitleEnum title) {
    this.title = title;
  }


  public UnprocessableEntity status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status code
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "422", value = "Status code")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public UnprocessableEntity detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * Error detail
   * @return detail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "The server understands the content type of the request entity, and the syntax of the request entity is correct but was unable to process the contained instructions", value = "Error detail")

  public String getDetail() {
    return detail;
  }


  public void setDetail(String detail) {
    this.detail = detail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnprocessableEntity unprocessableEntity = (UnprocessableEntity) o;
    return Objects.equals(this.errors, unprocessableEntity.errors) &&
        Objects.equals(this.type, unprocessableEntity.type) &&
        Objects.equals(this.title, unprocessableEntity.title) &&
        Objects.equals(this.status, unprocessableEntity.status) &&
        Objects.equals(this.detail, unprocessableEntity.detail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, type, title, status, detail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnprocessableEntity {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

