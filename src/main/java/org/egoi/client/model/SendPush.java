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
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.NotifyUserIdArrayActionSend;
import org.egoi.client.model.OSegmentsWithoutContactActionSend;
import org.egoi.client.model.SegmentsWithoutContactActionSend;
import org.egoi.client.model.SendPushAllOf;

/**
 * SendPush
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T16:12:38.678183Z[Europe/Lisbon]")
public class SendPush  implements CampaignPushSendRequest {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Integer appId;

  public static final String SERIALIZED_NAME_SEGMENTS = "segments";
  @SerializedName(SERIALIZED_NAME_SEGMENTS)
  private OSegmentsWithoutContactActionSend segments;

  public static final String SERIALIZED_NAME_NOTIFY = "notify";
  @SerializedName(SERIALIZED_NAME_NOTIFY)
  private List<Integer> notify = null;


  public SendPush appId(Integer appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * minimum: 1
   * @return appId
  **/
  @ApiModelProperty(example = "1", required = true, value = "")

  public Integer getAppId() {
    return appId;
  }


  public void setAppId(Integer appId) {
    this.appId = appId;
  }


  public SendPush segments(OSegmentsWithoutContactActionSend segments) {
    
    this.segments = segments;
    return this;
  }

   /**
   * Get segments
   * @return segments
  **/
  @ApiModelProperty(required = true, value = "")

  public OSegmentsWithoutContactActionSend getSegments() {
    return segments;
  }


  public void setSegments(OSegmentsWithoutContactActionSend segments) {
    this.segments = segments;
  }


  public SendPush notify(List<Integer> notify) {
    
    this.notify = notify;
    return this;
  }

  public SendPush addNotifyItem(Integer notifyItem) {
    if (this.notify == null) {
      this.notify = new ArrayList<Integer>();
    }
    this.notify.add(notifyItem);
    return this;
  }

   /**
   * Array of IDs of the users to notify
   * @return notify
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of IDs of the users to notify")

  public List<Integer> getNotify() {
    return notify;
  }


  public void setNotify(List<Integer> notify) {
    this.notify = notify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendPush sendPush = (SendPush) o;
    return Objects.equals(this.appId, sendPush.appId) &&
        Objects.equals(this.segments, sendPush.segments) &&
        Objects.equals(this.notify, sendPush.notify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, segments, notify);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendPush {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
    sb.append("    notify: ").append(toIndentedString(notify)).append("\n");
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

