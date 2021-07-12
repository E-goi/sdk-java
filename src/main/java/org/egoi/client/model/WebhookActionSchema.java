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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Action that will trigger the webhook
 */
@JsonAdapter(WebhookActionSchema.Adapter.class)
public enum WebhookActionSchema {
  
  FORGET_SUBSCRIPTION("forget_subscription"),
  
  CHANGE_CONSENT("change_consent"),
  
  WEB_PUSH_BOUNCE("web_push_bounce"),
  
  WEB_PUSH_CLICK("web_push_click"),
  
  WEB_PUSH_DELIVERED("web_push_delivered"),
  
  WEB_PUSH_OPEN("web_push_open"),
  
  WEB_PUSH_SEND("web_push_send"),
  
  WEB_PUSH_SUBSCRIPTION("web_push_subscription"),
  
  WEB_PUSH_UNSUBSCRIPTION("web_push_unsubscription"),
  
  EMAIL_SEND("email_send"),
  
  EMAIL_OPEN("email_open"),
  
  EMAIL_CLICK("email_click"),
  
  EMAIL_SOFT_BOUNCE("email_soft_bounce"),
  
  EMAIL_HARD_BOUNCE("email_hard_bounce"),
  
  SMS_SEND("sms_send"),
  
  VOICE_SEND("voice_send"),
  
  UNSUBSCRIBE("unsubscribe"),
  
  SUBSCRIPTION("subscription"),
  
  RESUBSCRIPTION("resubscription"),
  
  FACEBOOK_LIKE("facebook_like"),
  
  SOCIAL_SHARE("social_share"),
  
  DOUBLE_OPTIN("double_optin"),
  
  EMAIL_SPAM_COMPLAINT("email_spam_complaint"),
  
  EMAIL_FIELD_DISABLE("email_field_disable"),
  
  CELLPHONE_FIELD_DISABLE("cellphone_field_disable"),
  
  PHONE_FIELD_DISABLE("phone_field_disable"),
  
  PUSH_SEND("push_send"),
  
  PUSH_OPEN("push_open"),
  
  PUSH_CLICK("push_click"),
  
  PUSH_RECEIVED("push_received"),
  
  PUSH_ERROR("push_error"),
  
  PUSH_CANCELED("push_canceled");

  private String value;

  WebhookActionSchema(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WebhookActionSchema fromValue(String value) {
    for (WebhookActionSchema b : WebhookActionSchema.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<WebhookActionSchema> {
    @Override
    public void write(final JsonWriter jsonWriter, final WebhookActionSchema enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WebhookActionSchema read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WebhookActionSchema.fromValue(value);
    }
  }
}

