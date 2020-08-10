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
 * Contact status schema
 */
@ApiModel(description = "Contact status schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T12:53:53.038698+01:00[Europe/Lisbon]")
public class ContactStatusFieldsBulkSchema   {
  /**
   * Email channel status
   */
  @JsonAdapter(EmailStatusEnum.Adapter.class)
  public enum EmailStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    EmailStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmailStatusEnum fromValue(String value) {
      for (EmailStatusEnum b : EmailStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EmailStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmailStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmailStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmailStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EMAIL_STATUS = "email_status";
  @SerializedName(SERIALIZED_NAME_EMAIL_STATUS)
  private EmailStatusEnum emailStatus;

  /**
   * Cellphone channel status
   */
  @JsonAdapter(CellphoneStatusEnum.Adapter.class)
  public enum CellphoneStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    CellphoneStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CellphoneStatusEnum fromValue(String value) {
      for (CellphoneStatusEnum b : CellphoneStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CellphoneStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CellphoneStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CellphoneStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CellphoneStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CELLPHONE_STATUS = "cellphone_status";
  @SerializedName(SERIALIZED_NAME_CELLPHONE_STATUS)
  private CellphoneStatusEnum cellphoneStatus;

  /**
   * Phone channel status
   */
  @JsonAdapter(PhoneStatusEnum.Adapter.class)
  public enum PhoneStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    PhoneStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhoneStatusEnum fromValue(String value) {
      for (PhoneStatusEnum b : PhoneStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhoneStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhoneStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHONE_STATUS = "phone_status";
  @SerializedName(SERIALIZED_NAME_PHONE_STATUS)
  private PhoneStatusEnum phoneStatus;


  public ContactStatusFieldsBulkSchema emailStatus(EmailStatusEnum emailStatus) {
    
    this.emailStatus = emailStatus;
    return this;
  }

   /**
   * Email channel status
   * @return emailStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email channel status")

  public EmailStatusEnum getEmailStatus() {
    return emailStatus;
  }


  public void setEmailStatus(EmailStatusEnum emailStatus) {
    this.emailStatus = emailStatus;
  }


  public ContactStatusFieldsBulkSchema cellphoneStatus(CellphoneStatusEnum cellphoneStatus) {
    
    this.cellphoneStatus = cellphoneStatus;
    return this;
  }

   /**
   * Cellphone channel status
   * @return cellphoneStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cellphone channel status")

  public CellphoneStatusEnum getCellphoneStatus() {
    return cellphoneStatus;
  }


  public void setCellphoneStatus(CellphoneStatusEnum cellphoneStatus) {
    this.cellphoneStatus = cellphoneStatus;
  }


  public ContactStatusFieldsBulkSchema phoneStatus(PhoneStatusEnum phoneStatus) {
    
    this.phoneStatus = phoneStatus;
    return this;
  }

   /**
   * Phone channel status
   * @return phoneStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone channel status")

  public PhoneStatusEnum getPhoneStatus() {
    return phoneStatus;
  }


  public void setPhoneStatus(PhoneStatusEnum phoneStatus) {
    this.phoneStatus = phoneStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactStatusFieldsBulkSchema contactStatusFieldsBulkSchema = (ContactStatusFieldsBulkSchema) o;
    return Objects.equals(this.emailStatus, contactStatusFieldsBulkSchema.emailStatus) &&
        Objects.equals(this.cellphoneStatus, contactStatusFieldsBulkSchema.cellphoneStatus) &&
        Objects.equals(this.phoneStatus, contactStatusFieldsBulkSchema.phoneStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailStatus, cellphoneStatus, phoneStatus);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactStatusFieldsBulkSchema {\n");
    sb.append("    emailStatus: ").append(toIndentedString(emailStatus)).append("\n");
    sb.append("    cellphoneStatus: ").append(toIndentedString(cellphoneStatus)).append("\n");
    sb.append("    phoneStatus: ").append(toIndentedString(phoneStatus)).append("\n");
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

