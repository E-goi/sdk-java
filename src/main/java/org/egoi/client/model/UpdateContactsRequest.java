/*
 * APIv3 (New)
 *  # Introduction This is our new version of API. We invite you to start using it and give us your feedback # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.  The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.      BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication  We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:     #!/bin/bash     curl -X GET 'https://api.egoiapp.com/my-account' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:     #!/bin/bash     curl -X POST 'http://api.egoiapp.com/tags' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>' \\     -H 'Content-Type: application/json' \\     -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB.  # Timeouts Timeouts set a maximum waiting time on a request's response. Our API, sets a default timeout for each request and when breached, you'll receive an HTTP **408 (Request Timeout)** error code. You should take into consideration that response times can vary widely based on the complexity of the request, amount of data being analyzed, and the load on the system and workspace at the time of the query. When dealing with such errors, you should first attempt to reduce the complexity and amount of data under analysis, and only then, if problems are still occurring ask for support.  For all these reasons, the default timeout for each request is **10 Seconds** and any request that creates or modifies data (**POST**, **PATCH** and **PUT**) will have a timeout of **60 Seconds**. Specific timeouts may exist for specific requests, these can be found in the request's documentation.  # Callbacks A callback is an asynchronous API request that originates from the API server and is sent to the client in response to a previous request sent by that client.  The API will make a **POST** request to the address defined in the URL with the information regarding the event of interest and share data related to that event.  ***Note:*** Only http or https protocols are supported in the Url parameter.  <security-definitions/>
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.egoi.client.model.ContactBaseWithStatusFieldsNoTokensSchemaBase;
import org.egoi.client.model.ContactExtraFields;

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
 * Updates contacts request schema
 */
@ApiModel(description = "Updates contacts request schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-12T17:30:24.773899Z[Europe/Lisbon]")
public class UpdateContactsRequest {
  /**
   * Updates the contacts in the whole list (excluding removed contacts)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    ALL("all");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_CONTACTS = "contacts";
  @SerializedName(SERIALIZED_NAME_CONTACTS)
  private Set<String> contacts = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_SEGMENT_ID = "segment_id";
  @SerializedName(SERIALIZED_NAME_SEGMENT_ID)
  private String segmentId;

  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private ContactBaseWithStatusFieldsNoTokensSchemaBase base;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private List<ContactExtraFields> extra = null;

  public UpdateContactsRequest() {
  }

  public UpdateContactsRequest type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Updates the contacts in the whole list (excluding removed contacts)
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Updates the contacts in the whole list (excluding removed contacts)")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public UpdateContactsRequest contacts(Set<String> contacts) {
    
    this.contacts = contacts;
    return this;
  }

  public UpdateContactsRequest addContactsItem(String contactsItem) {
    this.contacts.add(contactsItem);
    return this;
  }

   /**
   * Array of contact IDs to update
   * @return contacts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of contact IDs to update")

  public Set<String> getContacts() {
    return contacts;
  }


  public void setContacts(Set<String> contacts) {
    this.contacts = contacts;
  }


  public UpdateContactsRequest segmentId(String segmentId) {
    
    this.segmentId = segmentId;
    return this;
  }

   /**
   * Segment ID to update channel field
   * @return segmentId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Segment ID to update channel field")

  public String getSegmentId() {
    return segmentId;
  }


  public void setSegmentId(String segmentId) {
    this.segmentId = segmentId;
  }


  public UpdateContactsRequest base(ContactBaseWithStatusFieldsNoTokensSchemaBase base) {
    
    this.base = base;
    return this;
  }

   /**
   * Get base
   * @return base
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ContactBaseWithStatusFieldsNoTokensSchemaBase getBase() {
    return base;
  }


  public void setBase(ContactBaseWithStatusFieldsNoTokensSchemaBase base) {
    this.base = base;
  }


  public UpdateContactsRequest extra(List<ContactExtraFields> extra) {
    
    this.extra = extra;
    return this;
  }

  public UpdateContactsRequest addExtraItem(ContactExtraFields extraItem) {
    if (this.extra == null) {
      this.extra = new ArrayList<>();
    }
    this.extra.add(extraItem);
    return this;
  }

   /**
   * Array of the contact&#39;s extra fields
   * @return extra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of the contact's extra fields")

  public List<ContactExtraFields> getExtra() {
    return extra;
  }


  public void setExtra(List<ContactExtraFields> extra) {
    this.extra = extra;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateContactsRequest updateContactsRequest = (UpdateContactsRequest) o;
    return Objects.equals(this.type, updateContactsRequest.type) &&
        Objects.equals(this.contacts, updateContactsRequest.contacts) &&
        Objects.equals(this.segmentId, updateContactsRequest.segmentId) &&
        Objects.equals(this.base, updateContactsRequest.base) &&
        Objects.equals(this.extra, updateContactsRequest.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, contacts, segmentId, base, extra);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateContactsRequest {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
    sb.append("    segmentId: ").append(toIndentedString(segmentId)).append("\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("contacts");
    openapiFields.add("segment_id");
    openapiFields.add("base");
    openapiFields.add("extra");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("contacts");
    openapiRequiredFields.add("segment_id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateContactsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateContactsRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateContactsRequest is not found in the empty JSON string", UpdateContactsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateContactsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateContactsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateContactsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("contacts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("contacts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `contacts` to be an array in the JSON string but got `%s`", jsonObj.get("contacts").toString()));
      }
      if (!jsonObj.get("segment_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `segment_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("segment_id").toString()));
      }
      // validate the optional field `base`
      if (jsonObj.get("base") != null && !jsonObj.get("base").isJsonNull()) {
        ContactBaseWithStatusFieldsNoTokensSchemaBase.validateJsonObject(jsonObj.getAsJsonObject("base"));
      }
      if (jsonObj.get("extra") != null && !jsonObj.get("extra").isJsonNull()) {
        JsonArray jsonArrayextra = jsonObj.getAsJsonArray("extra");
        if (jsonArrayextra != null) {
          // ensure the json data is an array
          if (!jsonObj.get("extra").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `extra` to be an array in the JSON string but got `%s`", jsonObj.get("extra").toString()));
          }

          // validate the optional field `extra` (array)
          for (int i = 0; i < jsonArrayextra.size(); i++) {
            ContactExtraFields.validateJsonObject(jsonArrayextra.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateContactsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateContactsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateContactsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateContactsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateContactsRequest>() {
           @Override
           public void write(JsonWriter out, UpdateContactsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateContactsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateContactsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateContactsRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateContactsRequest
  */
  public static UpdateContactsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateContactsRequest.class);
  }

 /**
  * Convert an instance of UpdateContactsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

