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
import org.egoi.client.model.PushNotificationSoundSchema;

/**
 * Push notification options
 */
@ApiModel(description = "Push notification options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-19T15:12:15.913371Z[Europe/Lisbon]")
public class PushCampaignPostRequestNotificationOptions   {
  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_BADGE = "badge";
  @SerializedName(SERIALIZED_NAME_BADGE)
  private Integer badge;

  public static final String SERIALIZED_NAME_SOUND = "sound";
  @SerializedName(SERIALIZED_NAME_SOUND)
  private PushNotificationSoundSchema sound;


  public PushCampaignPostRequestNotificationOptions icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * Url for the icon of the notification
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Url for the icon of the notification")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public PushCampaignPostRequestNotificationOptions badge(Integer badge) {
    
    this.badge = badge;
    return this;
  }

   /**
   * Maximum number of notifications
   * minimum: 0
   * @return badge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of notifications")

  public Integer getBadge() {
    return badge;
  }


  public void setBadge(Integer badge) {
    this.badge = badge;
  }


  public PushCampaignPostRequestNotificationOptions sound(PushNotificationSoundSchema sound) {
    
    this.sound = sound;
    return this;
  }

   /**
   * Get sound
   * @return sound
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PushNotificationSoundSchema getSound() {
    return sound;
  }


  public void setSound(PushNotificationSoundSchema sound) {
    this.sound = sound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushCampaignPostRequestNotificationOptions pushCampaignPostRequestNotificationOptions = (PushCampaignPostRequestNotificationOptions) o;
    return Objects.equals(this.icon, pushCampaignPostRequestNotificationOptions.icon) &&
        Objects.equals(this.badge, pushCampaignPostRequestNotificationOptions.badge) &&
        Objects.equals(this.sound, pushCampaignPostRequestNotificationOptions.sound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, badge, sound);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushCampaignPostRequestNotificationOptions {\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    badge: ").append(toIndentedString(badge)).append("\n");
    sb.append("    sound: ").append(toIndentedString(sound)).append("\n");
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

