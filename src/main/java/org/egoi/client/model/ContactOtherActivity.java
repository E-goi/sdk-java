/*
 * APIv3 (Beta)
 *  # Introduction Just a quick pick!!! This is our new version of API. Remember, it is not stable yet!!! But we invite you play with it and give us your feedback ;) # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # HTTP Methods for RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  <security-definitions/>
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
import org.threeten.bp.OffsetDateTime;

/**
 * Other contact activity schema
 */
@ApiModel(description = "Other contact activity schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:12:38.678183Z[Europe/Lisbon]")
public class ContactOtherActivity  implements ContactActivity {
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
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

