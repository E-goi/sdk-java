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
import java.time.OffsetDateTime;

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
 * Other contact activity schema
 */
@ApiModel(description = "Other contact activity schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-12T17:30:24.773899Z[Europe/Lisbon]")
public class ContactOtherActivity {
  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private OffsetDateTime date;

  /**
   * Action name
   */
  @JsonAdapter(ActionNameEnum.Adapter.class)
  public enum ActionNameEnum {
    EMAIL_OPEN("email_open"),
    
    FORWARD("forward"),
    
    CONVERSION("conversion"),
    
    EMAIL_SEND("email_send"),
    
    SMS_SEND("sms_send"),
    
    VOICE_SEND("voice_send"),
    
    MMS_SEND("mms_send"),
    
    SMS_REPORT("sms_report"),
    
    VOICE_REPORT("voice_report"),
    
    INVITATION_SEND("invitation_send"),
    
    INVITATION_OPEN("invitation_open"),
    
    MMS_OPEN("mms_open"),
    
    UNSUBSCRIBE("unsubscribe"),
    
    EMAIL_SOFT_BOUNCE("email_soft_bounce"),
    
    EMAIL_HARD_BOUNCE("email_hard_bounce"),
    
    SUBSCRIPTION("subscription"),
    
    RESUBSCRIPTION("resubscription"),
    
    UNSUBSCRIBE_REASON("unsubscribe_reason"),
    
    FACEBOOK_LIKE("facebook_like"),
    
    SOCIAL_SHARE("social_share"),
    
    UNSUBSCRIBE_MANUAL("unsubscribe_manual"),
    
    DOUBLE_OPTIN("double_optin"),
    
    DOUBLE_OPTIN_RESEND("double_optin_resend"),
    
    EMAIL_SPAM_COMPLAINT("email_spam_complaint"),
    
    EMAIL_FIELD_DISABLE("email_field_disable"),
    
    CELLPHONE_FIELD_DISABLE("cellphone_field_disable"),
    
    PHONE_FIELD_DISABLE("phone_field_disable"),
    
    UNSUBSCRIBE_API("unsubscribe_api"),
    
    EMAIL_FIELD_ENABLE("email_field_enable"),
    
    CELLPHONE_FIELD_ENABLE("cellphone_field_enable"),
    
    PHONE_FIELD_ENABLE("phone_field_enable"),
    
    EDIT_SUBSCRIPTION("edit_subscription"),
    
    DOUBLE_OPTEDIT("double_optedit"),
    
    AUTOMATION_EVENT("automation_event"),
    
    PUSH_SEND("push_send"),
    
    PUSH_OPEN("push_open"),
    
    PUSH_RECEIVED("push_received"),
    
    PUSH_ERROR("push_error"),
    
    PUSH_CANCELED("push_canceled"),
    
    REPLY_TO_EMAIL("reply_to_email"),
    
    WEB_PUSH_SEND("web_push_send"),
    
    WEB_PUSH_DELIVERED("web_push_delivered"),
    
    WEB_PUSH_OPEN("web_push_open"),
    
    WEB_PUSH_BOUNCE("web_push_bounce"),
    
    WEB_PUSH_SUBSCRIPTION("web_push_subscription"),
    
    WEB_PUSH_UNSUBSCRIPTION("web_push_unsubscription"),
    
    ADD_PUSH_CONTACT("add_push_contact"),
    
    REMOVE_PUSH_CONTACT("remove_push_contact"),
    
    FORGET_SUBSCRIPTION("forget_subscription"),
    
    CHANGE_CONSENT("change_consent"),
    
    PUSH_UNSUBSCRIPTION("push_unsubscription");

    private String value;

    ActionNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionNameEnum fromValue(String value) {
      for (ActionNameEnum b : ActionNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionNameEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionNameEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION_NAME = "action_name";
  @SerializedName(SERIALIZED_NAME_ACTION_NAME)
  private ActionNameEnum actionName;

  public ContactOtherActivity() {
  }

  public ContactOtherActivity date(OffsetDateTime date) {
    
    this.date = date;
    return this;
  }

   /**
   * The date and time
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time")

  public OffsetDateTime getDate() {
    return date;
  }


  public void setDate(OffsetDateTime date) {
    this.date = date;
  }


  public ContactOtherActivity actionName(ActionNameEnum actionName) {
    
    this.actionName = actionName;
    return this;
  }

   /**
   * Action name
   * @return actionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Action name")

  public ActionNameEnum getActionName() {
    return actionName;
  }


  public void setActionName(ActionNameEnum actionName) {
    this.actionName = actionName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactOtherActivity contactOtherActivity = (ContactOtherActivity) o;
    return Objects.equals(this.date, contactOtherActivity.date) &&
        Objects.equals(this.actionName, contactOtherActivity.actionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, actionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactOtherActivity {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
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
    openapiFields.add("date");
    openapiFields.add("action_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactOtherActivity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContactOtherActivity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactOtherActivity is not found in the empty JSON string", ContactOtherActivity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactOtherActivity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactOtherActivity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("action_name") != null && !jsonObj.get("action_name").isJsonNull()) && !jsonObj.get("action_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactOtherActivity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactOtherActivity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactOtherActivity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactOtherActivity.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactOtherActivity>() {
           @Override
           public void write(JsonWriter out, ContactOtherActivity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactOtherActivity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactOtherActivity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactOtherActivity
  * @throws IOException if the JSON string is invalid with respect to ContactOtherActivity
  */
  public static ContactOtherActivity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactOtherActivity.class);
  }

 /**
  * Convert an instance of ContactOtherActivity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

