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
import java.util.ArrayList;
import java.util.List;

/**
 * UniqueFieldInUseErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T20:27:19.076308+01:00[Europe/Lisbon]")
public class UniqueFieldInUseErrors   {
  /**
   * Occurs when a provided field is already in use
   */
  @JsonAdapter(UniqueFieldInUseEnum.Adapter.class)
  public enum UniqueFieldInUseEnum {
    A_UNIQUE_FIELD_IS_ALREADY_BEING_USED("A unique field is already being used");

    private String value;

    UniqueFieldInUseEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static UniqueFieldInUseEnum fromValue(String value) {
      for (UniqueFieldInUseEnum b : UniqueFieldInUseEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<UniqueFieldInUseEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final UniqueFieldInUseEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public UniqueFieldInUseEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return UniqueFieldInUseEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_UNIQUE_FIELD_IN_USE = "unique_field_in_use";
  @SerializedName(SERIALIZED_NAME_UNIQUE_FIELD_IN_USE)
  private UniqueFieldInUseEnum uniqueFieldInUse;

  public static final String SERIALIZED_NAME_FIELD_ID = "field_id";
  @SerializedName(SERIALIZED_NAME_FIELD_ID)
  private String fieldId;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private List<String> contacts = null;


  public UniqueFieldInUseErrors uniqueFieldInUse(UniqueFieldInUseEnum uniqueFieldInUse) {
    
    this.uniqueFieldInUse = uniqueFieldInUse;
    return this;
  }

   /**
   * Occurs when a provided field is already in use
   * @return uniqueFieldInUse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Occurs when a provided field is already in use")

  public UniqueFieldInUseEnum getUniqueFieldInUse() {
    return uniqueFieldInUse;
  }


  public void setUniqueFieldInUse(UniqueFieldInUseEnum uniqueFieldInUse) {
    this.uniqueFieldInUse = uniqueFieldInUse;
  }


  public UniqueFieldInUseErrors fieldId(String fieldId) {
    
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Field ID
   * @return fieldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Field ID")

  public String getFieldId() {
    return fieldId;
  }


  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  public UniqueFieldInUseErrors contacts(List<String> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public UniqueFieldInUseErrors addContactsItem(String contactsItem) {
    if (this.contacts == null) {
      this.contacts = new ArrayList<String>();
    }
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Get contacts
   * @return contacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getContacts() {
    return contacts;
  }


  public void setContacts(List<String> contacts) {
    this.contacts = contacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UniqueFieldInUseErrors uniqueFieldInUseErrors = (UniqueFieldInUseErrors) o;
    return Objects.equals(this.uniqueFieldInUse, uniqueFieldInUseErrors.uniqueFieldInUse) &&
        Objects.equals(this.fieldId, uniqueFieldInUseErrors.fieldId) &&
        Objects.equals(this.contacts, uniqueFieldInUseErrors.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uniqueFieldInUse, fieldId, contacts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UniqueFieldInUseErrors {\n");
    sb.append("    uniqueFieldInUse: ").append(toIndentedString(uniqueFieldInUse)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

