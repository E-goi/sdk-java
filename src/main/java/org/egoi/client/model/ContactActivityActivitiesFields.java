/*
 * Marketing API
 *  # Introduction Welcome to the E-goi Marketing API! <br><br>This API enables you to integrate, automate, and manage all the marketing functionalities offered by E-goi. With it, you can interact with contact lists, send email campaigns, SMS, push notifications, and much more. <br><br>Our API is designed to simplify integration in a straightforward, efficient, and secure way, meeting the needs of developers and businesses looking to optimize their digital marketing operations. <br><br>Explore the documentation to discover all the possibilities and start creating integrations that drive your marketing results. # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.  The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.      BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Transport Layer Security (TLS) Transport Layer Security (TLS) is a widely used authentication and encryption protocol that establishes a secure communications channel for data-in-transit while ensuring that the client and server can validate one another.<br> Our API requires TLS 1.2 or TLS 1.3. We recommend <b>TLS 1.3</b>.<br><br> <b>TLS 1.3 ciphers</b> * TLS_AES_256_GCM_SHA384 (0x1302) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_CHACHA20_POLY1305_SHA256 (0x1303) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_AES_128_GCM_SHA256 (0x1301) ECDH x25519 (eq. 3072 bits RSA) FS  <b>TLS 1.2 ciphers</b> * TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 (0xc030) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 (0xc02f) ECDH x25519 (eq. 3072 bits RSA) FS * TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 (0x9f) DH 4096 bits FS * TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 (0x9e) DH 4096 bits FS  # Rate Limits Rate limits are used to control the amount of traffic that is allowed to flow between the client and the server.<br> This is done to prevent abuse and ensure that the API is available to all users.<br> The rate limits are applied to ensure the stability and security of our API and are based on the number of requests made in a given time period.<br> If the rate limit is exceeded, the API will return a 429 status code and the request will be rejected.<br> Each API response includes headers providing real-time rate limit information: * **X-RateLimit-Limit**: The maximum number of requests that the consumer is permitted to make in a given time period. * **X-RateLimit-Remaining**: The number of requests remaining in the current rate limit window. * **X-RateLimit-Reset**: The remaining time in seconds until the rate limit window resets.  # Account Limit The account limit is a rate limit that is applied to the account as a whole.<br> This limit is applied to all requests made by the account, regardless of the client making the request.<br> The account limit is applied to ensure that the account does not exceed the maximum number of requests allowed in a given time period. Each account has an overall usage limit per hour. If the account limit is exceeded, the API will return a 429 status code and the request will be rejected.<br> Each API response includes headers providing real-time rate limit information: * **X-Account-Limit**: The maximum number of requests that the account is permitted to make in a given time period. * **X-Account-Remaining**: The number of requests remaining in the current rate limit window. * **X-Account-Reset**: The remaining time in seconds until the rate limit window resets.   # Authentication  We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:     #!/bin/bash     curl -X GET 'https://api.egoiapp.com/my-account' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:     #!/bin/bash     curl -X POST 'http://api.egoiapp.com/tags' \\     -H 'accept: application/json' \\     -H 'Apikey: <YOUR_APY_KEY>' \\     -H 'Content-Type: application/json' \\     -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB.  # Timeouts Timeouts set a maximum waiting time on a request's response. Our API, sets a default timeout for each request and when breached, you'll receive an HTTP **408 (Request Timeout)** error code. You should take into consideration that response times can vary widely based on the complexity of the request, amount of data being analyzed, and the load on the system and workspace at the time of the query. When dealing with such errors, you should first attempt to reduce the complexity and amount of data under analysis, and only then, if problems are still occurring ask for support.  For all these reasons, the default timeout for each request is **10 Seconds** and any request that creates or modifies data (**POST**, **PATCH** and **PUT**) will have a timeout of **60 Seconds**. Specific timeouts may exist for specific requests, these can be found in the request's documentation.  # Callbacks A callback is an asynchronous API request that originates from the API server and is sent to the client in response to a previous request sent by that client.  The API will make a **POST** request to the address defined in the URL with the information regarding the event of interest and share data related to that event.  <a href='/usecases/callbacks/' target='_blank'>[Go to callbacks documentation]</a>  ***Note:*** Only http or https protocols are supported in the Url parameter.  <security-definitions/>
 *
 * The version of the OpenAPI document: V3
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
 * List of contacts activities to include in the report
 */
@ApiModel(description = "List of contacts activities to include in the report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-30T16:00:36.862706+01:00[Europe/Lisbon]")
public class ContactActivityActivitiesFields {
  public static final String SERIALIZED_NAME_OPENS = "opens";
  @SerializedName(SERIALIZED_NAME_OPENS)
  private Boolean opens;

  public static final String SERIALIZED_NAME_CLICKS = "clicks";
  @SerializedName(SERIALIZED_NAME_CLICKS)
  private Boolean clicks;

  public static final String SERIALIZED_NAME_RECOMMENDS = "recommends";
  @SerializedName(SERIALIZED_NAME_RECOMMENDS)
  private Boolean recommends;

  public static final String SERIALIZED_NAME_CONVERSION = "conversion";
  @SerializedName(SERIALIZED_NAME_CONVERSION)
  private Boolean conversion;

  public static final String SERIALIZED_NAME_EMAIL_SEND = "email_send";
  @SerializedName(SERIALIZED_NAME_EMAIL_SEND)
  private Boolean emailSend;

  public static final String SERIALIZED_NAME_SMS_SEND = "sms_send";
  @SerializedName(SERIALIZED_NAME_SMS_SEND)
  private Boolean smsSend;

  public static final String SERIALIZED_NAME_SMS_REPORT = "sms_report";
  @SerializedName(SERIALIZED_NAME_SMS_REPORT)
  private Boolean smsReport;

  public static final String SERIALIZED_NAME_VOICE_SEND = "voice_send";
  @SerializedName(SERIALIZED_NAME_VOICE_SEND)
  private Boolean voiceSend;

  public static final String SERIALIZED_NAME_VOICE_REPORT = "voice_report";
  @SerializedName(SERIALIZED_NAME_VOICE_REPORT)
  private Boolean voiceReport;

  public static final String SERIALIZED_NAME_INVITATION_SEND = "invitation_send";
  @SerializedName(SERIALIZED_NAME_INVITATION_SEND)
  private Boolean invitationSend;

  public static final String SERIALIZED_NAME_INVITATION_OPEN = "invitation_open";
  @SerializedName(SERIALIZED_NAME_INVITATION_OPEN)
  private Boolean invitationOpen;

  public static final String SERIALIZED_NAME_UNSUBSCRIBE = "unsubscribe";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBE)
  private Boolean unsubscribe;

  public static final String SERIALIZED_NAME_EMAIL_SOFT_BOUNCE = "email_soft_bounce";
  @SerializedName(SERIALIZED_NAME_EMAIL_SOFT_BOUNCE)
  private Boolean emailSoftBounce;

  public static final String SERIALIZED_NAME_EMAIL_HARD_BOUNCE = "email_hard_bounce";
  @SerializedName(SERIALIZED_NAME_EMAIL_HARD_BOUNCE)
  private Boolean emailHardBounce;

  public static final String SERIALIZED_NAME_SUBSCRIPTION = "subscription";
  @SerializedName(SERIALIZED_NAME_SUBSCRIPTION)
  private Boolean subscription;

  public static final String SERIALIZED_NAME_RESUBSCRIPTION = "resubscription";
  @SerializedName(SERIALIZED_NAME_RESUBSCRIPTION)
  private Boolean resubscription;

  public static final String SERIALIZED_NAME_UNSUBSCRIBE_REASON = "unsubscribe_reason";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBE_REASON)
  private Boolean unsubscribeReason;

  public static final String SERIALIZED_NAME_FACEBOOK_LIKE = "facebook_like";
  @SerializedName(SERIALIZED_NAME_FACEBOOK_LIKE)
  private Boolean facebookLike;

  public static final String SERIALIZED_NAME_SOCIAL_SHARE = "social_share";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SHARE)
  private Boolean socialShare;

  public static final String SERIALIZED_NAME_UNSUBSCRIBE_MANUAL = "unsubscribe_manual";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBE_MANUAL)
  private Boolean unsubscribeManual;

  public static final String SERIALIZED_NAME_DOUBLE_OPTIN = "double_optin";
  @SerializedName(SERIALIZED_NAME_DOUBLE_OPTIN)
  private Boolean doubleOptin;

  public static final String SERIALIZED_NAME_EMAIL_SPAM_COMPLAINT = "email_spam_complaint";
  @SerializedName(SERIALIZED_NAME_EMAIL_SPAM_COMPLAINT)
  private Boolean emailSpamComplaint;

  public static final String SERIALIZED_NAME_EMAIL_FIELD_DISABLE = "email_field_disable";
  @SerializedName(SERIALIZED_NAME_EMAIL_FIELD_DISABLE)
  private Boolean emailFieldDisable;

  public static final String SERIALIZED_NAME_CELLPHONE_FIELD_DISABLE = "cellphone_field_disable";
  @SerializedName(SERIALIZED_NAME_CELLPHONE_FIELD_DISABLE)
  private Boolean cellphoneFieldDisable;

  public static final String SERIALIZED_NAME_PHONE_FIELD_DISABLE = "phone_field_disable";
  @SerializedName(SERIALIZED_NAME_PHONE_FIELD_DISABLE)
  private Boolean phoneFieldDisable;

  public static final String SERIALIZED_NAME_UNSUBSCRIBE_API = "unsubscribe_api";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBE_API)
  private Boolean unsubscribeApi;

  public static final String SERIALIZED_NAME_EMAIL_FIELD_ENABLE = "email_field_enable";
  @SerializedName(SERIALIZED_NAME_EMAIL_FIELD_ENABLE)
  private Boolean emailFieldEnable;

  public static final String SERIALIZED_NAME_CELLPHONE_FIELD_ENABLE = "cellphone_field_enable";
  @SerializedName(SERIALIZED_NAME_CELLPHONE_FIELD_ENABLE)
  private Boolean cellphoneFieldEnable;

  public static final String SERIALIZED_NAME_PHONE_FIELD_ENABLE = "phone_field_enable";
  @SerializedName(SERIALIZED_NAME_PHONE_FIELD_ENABLE)
  private Boolean phoneFieldEnable;

  public static final String SERIALIZED_NAME_EDIT_SUBSCRIPTION = "edit_subscription";
  @SerializedName(SERIALIZED_NAME_EDIT_SUBSCRIPTION)
  private Boolean editSubscription;

  public static final String SERIALIZED_NAME_AUTOMATION_EVENT = "automation_event";
  @SerializedName(SERIALIZED_NAME_AUTOMATION_EVENT)
  private Boolean automationEvent;

  public static final String SERIALIZED_NAME_PUSH_SEND = "push_send";
  @SerializedName(SERIALIZED_NAME_PUSH_SEND)
  private Boolean pushSend;

  public static final String SERIALIZED_NAME_PUSH_DELIVERED = "push_delivered";
  @SerializedName(SERIALIZED_NAME_PUSH_DELIVERED)
  private Boolean pushDelivered;

  public static final String SERIALIZED_NAME_PUSH_ERROR = "push_error";
  @SerializedName(SERIALIZED_NAME_PUSH_ERROR)
  private Boolean pushError;

  public static final String SERIALIZED_NAME_PUSH_RECEIVED = "push_received";
  @SerializedName(SERIALIZED_NAME_PUSH_RECEIVED)
  private Boolean pushReceived;

  public static final String SERIALIZED_NAME_PUSH_OPEN = "push_open";
  @SerializedName(SERIALIZED_NAME_PUSH_OPEN)
  private Boolean pushOpen;

  public static final String SERIALIZED_NAME_PUSH_CANCELED = "push_canceled";
  @SerializedName(SERIALIZED_NAME_PUSH_CANCELED)
  private Boolean pushCanceled;

  public static final String SERIALIZED_NAME_PUSH_UNSUBSCRIPTION = "push_unsubscription";
  @SerializedName(SERIALIZED_NAME_PUSH_UNSUBSCRIPTION)
  private Boolean pushUnsubscription;

  public static final String SERIALIZED_NAME_REPLY_TO_EMAIL = "reply_to_email";
  @SerializedName(SERIALIZED_NAME_REPLY_TO_EMAIL)
  private Boolean replyToEmail;

  public static final String SERIALIZED_NAME_WEB_PUSH_SEND = "web_push_send";
  @SerializedName(SERIALIZED_NAME_WEB_PUSH_SEND)
  private Boolean webPushSend;

  public static final String SERIALIZED_NAME_WEB_PUSH_DELIVERED = "web_push_delivered";
  @SerializedName(SERIALIZED_NAME_WEB_PUSH_DELIVERED)
  private Boolean webPushDelivered;

  public static final String SERIALIZED_NAME_WEB_PUSH_OPEN = "web_push_open";
  @SerializedName(SERIALIZED_NAME_WEB_PUSH_OPEN)
  private Boolean webPushOpen;

  public static final String SERIALIZED_NAME_WEB_PUSH_BOUNCE = "web_push_bounce";
  @SerializedName(SERIALIZED_NAME_WEB_PUSH_BOUNCE)
  private Boolean webPushBounce;

  public static final String SERIALIZED_NAME_WEB_PUSH_CLICK = "web_push_click";
  @SerializedName(SERIALIZED_NAME_WEB_PUSH_CLICK)
  private Boolean webPushClick;

  public static final String SERIALIZED_NAME_WEB_PUSH_SUBSCRIPTION = "web_push_subscription";
  @SerializedName(SERIALIZED_NAME_WEB_PUSH_SUBSCRIPTION)
  private Boolean webPushSubscription;

  public static final String SERIALIZED_NAME_WEB_PUSH_UNSUBSCRIPTION = "web_push_unsubscription";
  @SerializedName(SERIALIZED_NAME_WEB_PUSH_UNSUBSCRIPTION)
  private Boolean webPushUnsubscription;

  public static final String SERIALIZED_NAME_FORGET_SUBSCRIPTION = "forget_subscription";
  @SerializedName(SERIALIZED_NAME_FORGET_SUBSCRIPTION)
  private Boolean forgetSubscription;

  public static final String SERIALIZED_NAME_CHANGE_CONSENT = "change_consent";
  @SerializedName(SERIALIZED_NAME_CHANGE_CONSENT)
  private Boolean changeConsent;

  public static final String SERIALIZED_NAME_DOUBLE_OPTIN_RESEND = "double_optin_resend";
  @SerializedName(SERIALIZED_NAME_DOUBLE_OPTIN_RESEND)
  private Boolean doubleOptinResend;

  public static final String SERIALIZED_NAME_DOUBLE_OPTEDIT = "double_optedit";
  @SerializedName(SERIALIZED_NAME_DOUBLE_OPTEDIT)
  private Boolean doubleOptedit;

  public ContactActivityActivitiesFields() {
  }

  public ContactActivityActivitiesFields opens(Boolean opens) {
    
    this.opens = opens;
    return this;
  }

   /**
   * True to include opens, false otherwise
   * @return opens
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include opens, false otherwise")

  public Boolean getOpens() {
    return opens;
  }


  public void setOpens(Boolean opens) {
    this.opens = opens;
  }


  public ContactActivityActivitiesFields clicks(Boolean clicks) {
    
    this.clicks = clicks;
    return this;
  }

   /**
   * True to include clicks, false otherwise
   * @return clicks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include clicks, false otherwise")

  public Boolean getClicks() {
    return clicks;
  }


  public void setClicks(Boolean clicks) {
    this.clicks = clicks;
  }


  public ContactActivityActivitiesFields recommends(Boolean recommends) {
    
    this.recommends = recommends;
    return this;
  }

   /**
   * True to include recommends, false otherwise
   * @return recommends
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include recommends, false otherwise")

  public Boolean getRecommends() {
    return recommends;
  }


  public void setRecommends(Boolean recommends) {
    this.recommends = recommends;
  }


  public ContactActivityActivitiesFields conversion(Boolean conversion) {
    
    this.conversion = conversion;
    return this;
  }

   /**
   * True to include convertions, false otherwise
   * @return conversion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include convertions, false otherwise")

  public Boolean getConversion() {
    return conversion;
  }


  public void setConversion(Boolean conversion) {
    this.conversion = conversion;
  }


  public ContactActivityActivitiesFields emailSend(Boolean emailSend) {
    
    this.emailSend = emailSend;
    return this;
  }

   /**
   * True to include email sends, false otherwise
   * @return emailSend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include email sends, false otherwise")

  public Boolean getEmailSend() {
    return emailSend;
  }


  public void setEmailSend(Boolean emailSend) {
    this.emailSend = emailSend;
  }


  public ContactActivityActivitiesFields smsSend(Boolean smsSend) {
    
    this.smsSend = smsSend;
    return this;
  }

   /**
   * True to include sms sends, false otherwise
   * @return smsSend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include sms sends, false otherwise")

  public Boolean getSmsSend() {
    return smsSend;
  }


  public void setSmsSend(Boolean smsSend) {
    this.smsSend = smsSend;
  }


  public ContactActivityActivitiesFields smsReport(Boolean smsReport) {
    
    this.smsReport = smsReport;
    return this;
  }

   /**
   * True to include sms report, false otherwise
   * @return smsReport
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include sms report, false otherwise")

  public Boolean getSmsReport() {
    return smsReport;
  }


  public void setSmsReport(Boolean smsReport) {
    this.smsReport = smsReport;
  }


  public ContactActivityActivitiesFields voiceSend(Boolean voiceSend) {
    
    this.voiceSend = voiceSend;
    return this;
  }

   /**
   * True to include voice sends, false otherwise
   * @return voiceSend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include voice sends, false otherwise")

  public Boolean getVoiceSend() {
    return voiceSend;
  }


  public void setVoiceSend(Boolean voiceSend) {
    this.voiceSend = voiceSend;
  }


  public ContactActivityActivitiesFields voiceReport(Boolean voiceReport) {
    
    this.voiceReport = voiceReport;
    return this;
  }

   /**
   * True to include voice report, false otherwise
   * @return voiceReport
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include voice report, false otherwise")

  public Boolean getVoiceReport() {
    return voiceReport;
  }


  public void setVoiceReport(Boolean voiceReport) {
    this.voiceReport = voiceReport;
  }


  public ContactActivityActivitiesFields invitationSend(Boolean invitationSend) {
    
    this.invitationSend = invitationSend;
    return this;
  }

   /**
   * True to include invitation sends, false otherwise
   * @return invitationSend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include invitation sends, false otherwise")

  public Boolean getInvitationSend() {
    return invitationSend;
  }


  public void setInvitationSend(Boolean invitationSend) {
    this.invitationSend = invitationSend;
  }


  public ContactActivityActivitiesFields invitationOpen(Boolean invitationOpen) {
    
    this.invitationOpen = invitationOpen;
    return this;
  }

   /**
   * True to include invitation opens, false otherwise
   * @return invitationOpen
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include invitation opens, false otherwise")

  public Boolean getInvitationOpen() {
    return invitationOpen;
  }


  public void setInvitationOpen(Boolean invitationOpen) {
    this.invitationOpen = invitationOpen;
  }


  public ContactActivityActivitiesFields unsubscribe(Boolean unsubscribe) {
    
    this.unsubscribe = unsubscribe;
    return this;
  }

   /**
   * True to include unsubscriptions, false otherwise
   * @return unsubscribe
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include unsubscriptions, false otherwise")

  public Boolean getUnsubscribe() {
    return unsubscribe;
  }


  public void setUnsubscribe(Boolean unsubscribe) {
    this.unsubscribe = unsubscribe;
  }


  public ContactActivityActivitiesFields emailSoftBounce(Boolean emailSoftBounce) {
    
    this.emailSoftBounce = emailSoftBounce;
    return this;
  }

   /**
   * True to include email soft bounces, false otherwise
   * @return emailSoftBounce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include email soft bounces, false otherwise")

  public Boolean getEmailSoftBounce() {
    return emailSoftBounce;
  }


  public void setEmailSoftBounce(Boolean emailSoftBounce) {
    this.emailSoftBounce = emailSoftBounce;
  }


  public ContactActivityActivitiesFields emailHardBounce(Boolean emailHardBounce) {
    
    this.emailHardBounce = emailHardBounce;
    return this;
  }

   /**
   * True to include email hard bounces, false otherwise
   * @return emailHardBounce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include email hard bounces, false otherwise")

  public Boolean getEmailHardBounce() {
    return emailHardBounce;
  }


  public void setEmailHardBounce(Boolean emailHardBounce) {
    this.emailHardBounce = emailHardBounce;
  }


  public ContactActivityActivitiesFields subscription(Boolean subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * True to include subscriptions, false otherwise
   * @return subscription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include subscriptions, false otherwise")

  public Boolean getSubscription() {
    return subscription;
  }


  public void setSubscription(Boolean subscription) {
    this.subscription = subscription;
  }


  public ContactActivityActivitiesFields resubscription(Boolean resubscription) {
    
    this.resubscription = resubscription;
    return this;
  }

   /**
   * True to include re-subscriptions, false otherwise
   * @return resubscription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include re-subscriptions, false otherwise")

  public Boolean getResubscription() {
    return resubscription;
  }


  public void setResubscription(Boolean resubscription) {
    this.resubscription = resubscription;
  }


  public ContactActivityActivitiesFields unsubscribeReason(Boolean unsubscribeReason) {
    
    this.unsubscribeReason = unsubscribeReason;
    return this;
  }

   /**
   * True to include unsubscription reason, false otherwise
   * @return unsubscribeReason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include unsubscription reason, false otherwise")

  public Boolean getUnsubscribeReason() {
    return unsubscribeReason;
  }


  public void setUnsubscribeReason(Boolean unsubscribeReason) {
    this.unsubscribeReason = unsubscribeReason;
  }


  public ContactActivityActivitiesFields facebookLike(Boolean facebookLike) {
    
    this.facebookLike = facebookLike;
    return this;
  }

   /**
   * True to include facebook likes, false otherwise
   * @return facebookLike
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include facebook likes, false otherwise")

  public Boolean getFacebookLike() {
    return facebookLike;
  }


  public void setFacebookLike(Boolean facebookLike) {
    this.facebookLike = facebookLike;
  }


  public ContactActivityActivitiesFields socialShare(Boolean socialShare) {
    
    this.socialShare = socialShare;
    return this;
  }

   /**
   * True to include social shares, false otherwise
   * @return socialShare
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include social shares, false otherwise")

  public Boolean getSocialShare() {
    return socialShare;
  }


  public void setSocialShare(Boolean socialShare) {
    this.socialShare = socialShare;
  }


  public ContactActivityActivitiesFields unsubscribeManual(Boolean unsubscribeManual) {
    
    this.unsubscribeManual = unsubscribeManual;
    return this;
  }

   /**
   * True to include manual unsubscriptions, false otherwise
   * @return unsubscribeManual
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include manual unsubscriptions, false otherwise")

  public Boolean getUnsubscribeManual() {
    return unsubscribeManual;
  }


  public void setUnsubscribeManual(Boolean unsubscribeManual) {
    this.unsubscribeManual = unsubscribeManual;
  }


  public ContactActivityActivitiesFields doubleOptin(Boolean doubleOptin) {
    
    this.doubleOptin = doubleOptin;
    return this;
  }

   /**
   * True to include double optins, false otherwise
   * @return doubleOptin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include double optins, false otherwise")

  public Boolean getDoubleOptin() {
    return doubleOptin;
  }


  public void setDoubleOptin(Boolean doubleOptin) {
    this.doubleOptin = doubleOptin;
  }


  public ContactActivityActivitiesFields emailSpamComplaint(Boolean emailSpamComplaint) {
    
    this.emailSpamComplaint = emailSpamComplaint;
    return this;
  }

   /**
   * True to include spam complaints, false otherwise
   * @return emailSpamComplaint
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include spam complaints, false otherwise")

  public Boolean getEmailSpamComplaint() {
    return emailSpamComplaint;
  }


  public void setEmailSpamComplaint(Boolean emailSpamComplaint) {
    this.emailSpamComplaint = emailSpamComplaint;
  }


  public ContactActivityActivitiesFields emailFieldDisable(Boolean emailFieldDisable) {
    
    this.emailFieldDisable = emailFieldDisable;
    return this;
  }

   /**
   * True to include email field disable, false otherwise
   * @return emailFieldDisable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include email field disable, false otherwise")

  public Boolean getEmailFieldDisable() {
    return emailFieldDisable;
  }


  public void setEmailFieldDisable(Boolean emailFieldDisable) {
    this.emailFieldDisable = emailFieldDisable;
  }


  public ContactActivityActivitiesFields cellphoneFieldDisable(Boolean cellphoneFieldDisable) {
    
    this.cellphoneFieldDisable = cellphoneFieldDisable;
    return this;
  }

   /**
   * True to include cellphone field disable, false otherwise
   * @return cellphoneFieldDisable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include cellphone field disable, false otherwise")

  public Boolean getCellphoneFieldDisable() {
    return cellphoneFieldDisable;
  }


  public void setCellphoneFieldDisable(Boolean cellphoneFieldDisable) {
    this.cellphoneFieldDisable = cellphoneFieldDisable;
  }


  public ContactActivityActivitiesFields phoneFieldDisable(Boolean phoneFieldDisable) {
    
    this.phoneFieldDisable = phoneFieldDisable;
    return this;
  }

   /**
   * True to include phone field disable, false otherwise
   * @return phoneFieldDisable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include phone field disable, false otherwise")

  public Boolean getPhoneFieldDisable() {
    return phoneFieldDisable;
  }


  public void setPhoneFieldDisable(Boolean phoneFieldDisable) {
    this.phoneFieldDisable = phoneFieldDisable;
  }


  public ContactActivityActivitiesFields unsubscribeApi(Boolean unsubscribeApi) {
    
    this.unsubscribeApi = unsubscribeApi;
    return this;
  }

   /**
   * True to include api unsubscriptions, false otherwise
   * @return unsubscribeApi
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include api unsubscriptions, false otherwise")

  public Boolean getUnsubscribeApi() {
    return unsubscribeApi;
  }


  public void setUnsubscribeApi(Boolean unsubscribeApi) {
    this.unsubscribeApi = unsubscribeApi;
  }


  public ContactActivityActivitiesFields emailFieldEnable(Boolean emailFieldEnable) {
    
    this.emailFieldEnable = emailFieldEnable;
    return this;
  }

   /**
   * True to include email field enable, false otherwise
   * @return emailFieldEnable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include email field enable, false otherwise")

  public Boolean getEmailFieldEnable() {
    return emailFieldEnable;
  }


  public void setEmailFieldEnable(Boolean emailFieldEnable) {
    this.emailFieldEnable = emailFieldEnable;
  }


  public ContactActivityActivitiesFields cellphoneFieldEnable(Boolean cellphoneFieldEnable) {
    
    this.cellphoneFieldEnable = cellphoneFieldEnable;
    return this;
  }

   /**
   * True to include cellphone field enable, false otherwise
   * @return cellphoneFieldEnable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include cellphone field enable, false otherwise")

  public Boolean getCellphoneFieldEnable() {
    return cellphoneFieldEnable;
  }


  public void setCellphoneFieldEnable(Boolean cellphoneFieldEnable) {
    this.cellphoneFieldEnable = cellphoneFieldEnable;
  }


  public ContactActivityActivitiesFields phoneFieldEnable(Boolean phoneFieldEnable) {
    
    this.phoneFieldEnable = phoneFieldEnable;
    return this;
  }

   /**
   * True to include phone field enable, false otherwise
   * @return phoneFieldEnable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include phone field enable, false otherwise")

  public Boolean getPhoneFieldEnable() {
    return phoneFieldEnable;
  }


  public void setPhoneFieldEnable(Boolean phoneFieldEnable) {
    this.phoneFieldEnable = phoneFieldEnable;
  }


  public ContactActivityActivitiesFields editSubscription(Boolean editSubscription) {
    
    this.editSubscription = editSubscription;
    return this;
  }

   /**
   * True to include edit subscriptions, false otherwise
   * @return editSubscription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include edit subscriptions, false otherwise")

  public Boolean getEditSubscription() {
    return editSubscription;
  }


  public void setEditSubscription(Boolean editSubscription) {
    this.editSubscription = editSubscription;
  }


  public ContactActivityActivitiesFields automationEvent(Boolean automationEvent) {
    
    this.automationEvent = automationEvent;
    return this;
  }

   /**
   * True to include automation events, false otherwise
   * @return automationEvent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include automation events, false otherwise")

  public Boolean getAutomationEvent() {
    return automationEvent;
  }


  public void setAutomationEvent(Boolean automationEvent) {
    this.automationEvent = automationEvent;
  }


  public ContactActivityActivitiesFields pushSend(Boolean pushSend) {
    
    this.pushSend = pushSend;
    return this;
  }

   /**
   * True to include push events, false otherwise
   * @return pushSend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include push events, false otherwise")

  public Boolean getPushSend() {
    return pushSend;
  }


  public void setPushSend(Boolean pushSend) {
    this.pushSend = pushSend;
  }


  public ContactActivityActivitiesFields pushDelivered(Boolean pushDelivered) {
    
    this.pushDelivered = pushDelivered;
    return this;
  }

   /**
   * True to include push delivered, false otherwise
   * @return pushDelivered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include push delivered, false otherwise")

  public Boolean getPushDelivered() {
    return pushDelivered;
  }


  public void setPushDelivered(Boolean pushDelivered) {
    this.pushDelivered = pushDelivered;
  }


  public ContactActivityActivitiesFields pushError(Boolean pushError) {
    
    this.pushError = pushError;
    return this;
  }

   /**
   * True to include push error, false otherwise
   * @return pushError
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include push error, false otherwise")

  public Boolean getPushError() {
    return pushError;
  }


  public void setPushError(Boolean pushError) {
    this.pushError = pushError;
  }


  public ContactActivityActivitiesFields pushReceived(Boolean pushReceived) {
    
    this.pushReceived = pushReceived;
    return this;
  }

   /**
   * True to include push received, false otherwise
   * @return pushReceived
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include push received, false otherwise")

  public Boolean getPushReceived() {
    return pushReceived;
  }


  public void setPushReceived(Boolean pushReceived) {
    this.pushReceived = pushReceived;
  }


  public ContactActivityActivitiesFields pushOpen(Boolean pushOpen) {
    
    this.pushOpen = pushOpen;
    return this;
  }

   /**
   * True to include push open, false otherwise
   * @return pushOpen
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include push open, false otherwise")

  public Boolean getPushOpen() {
    return pushOpen;
  }


  public void setPushOpen(Boolean pushOpen) {
    this.pushOpen = pushOpen;
  }


  public ContactActivityActivitiesFields pushCanceled(Boolean pushCanceled) {
    
    this.pushCanceled = pushCanceled;
    return this;
  }

   /**
   * True to include push canceled, false otherwise
   * @return pushCanceled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include push canceled, false otherwise")

  public Boolean getPushCanceled() {
    return pushCanceled;
  }


  public void setPushCanceled(Boolean pushCanceled) {
    this.pushCanceled = pushCanceled;
  }


  public ContactActivityActivitiesFields pushUnsubscription(Boolean pushUnsubscription) {
    
    this.pushUnsubscription = pushUnsubscription;
    return this;
  }

   /**
   * True to include push unsubscriptions, false otherwise
   * @return pushUnsubscription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include push unsubscriptions, false otherwise")

  public Boolean getPushUnsubscription() {
    return pushUnsubscription;
  }


  public void setPushUnsubscription(Boolean pushUnsubscription) {
    this.pushUnsubscription = pushUnsubscription;
  }


  public ContactActivityActivitiesFields replyToEmail(Boolean replyToEmail) {
    
    this.replyToEmail = replyToEmail;
    return this;
  }

   /**
   * True to include reply to email, false otherwise
   * @return replyToEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include reply to email, false otherwise")

  public Boolean getReplyToEmail() {
    return replyToEmail;
  }


  public void setReplyToEmail(Boolean replyToEmail) {
    this.replyToEmail = replyToEmail;
  }


  public ContactActivityActivitiesFields webPushSend(Boolean webPushSend) {
    
    this.webPushSend = webPushSend;
    return this;
  }

   /**
   * True to include web push send, false otherwise
   * @return webPushSend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include web push send, false otherwise")

  public Boolean getWebPushSend() {
    return webPushSend;
  }


  public void setWebPushSend(Boolean webPushSend) {
    this.webPushSend = webPushSend;
  }


  public ContactActivityActivitiesFields webPushDelivered(Boolean webPushDelivered) {
    
    this.webPushDelivered = webPushDelivered;
    return this;
  }

   /**
   * True to include web push delivered, false otherwise
   * @return webPushDelivered
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include web push delivered, false otherwise")

  public Boolean getWebPushDelivered() {
    return webPushDelivered;
  }


  public void setWebPushDelivered(Boolean webPushDelivered) {
    this.webPushDelivered = webPushDelivered;
  }


  public ContactActivityActivitiesFields webPushOpen(Boolean webPushOpen) {
    
    this.webPushOpen = webPushOpen;
    return this;
  }

   /**
   * True to include web push open, false otherwise
   * @return webPushOpen
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include web push open, false otherwise")

  public Boolean getWebPushOpen() {
    return webPushOpen;
  }


  public void setWebPushOpen(Boolean webPushOpen) {
    this.webPushOpen = webPushOpen;
  }


  public ContactActivityActivitiesFields webPushBounce(Boolean webPushBounce) {
    
    this.webPushBounce = webPushBounce;
    return this;
  }

   /**
   * True to include web push bounces, false otherwise
   * @return webPushBounce
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include web push bounces, false otherwise")

  public Boolean getWebPushBounce() {
    return webPushBounce;
  }


  public void setWebPushBounce(Boolean webPushBounce) {
    this.webPushBounce = webPushBounce;
  }


  public ContactActivityActivitiesFields webPushClick(Boolean webPushClick) {
    
    this.webPushClick = webPushClick;
    return this;
  }

   /**
   * True to include web push clicks, false otherwise
   * @return webPushClick
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include web push clicks, false otherwise")

  public Boolean getWebPushClick() {
    return webPushClick;
  }


  public void setWebPushClick(Boolean webPushClick) {
    this.webPushClick = webPushClick;
  }


  public ContactActivityActivitiesFields webPushSubscription(Boolean webPushSubscription) {
    
    this.webPushSubscription = webPushSubscription;
    return this;
  }

   /**
   * True to include web push subscriptions, false otherwise
   * @return webPushSubscription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include web push subscriptions, false otherwise")

  public Boolean getWebPushSubscription() {
    return webPushSubscription;
  }


  public void setWebPushSubscription(Boolean webPushSubscription) {
    this.webPushSubscription = webPushSubscription;
  }


  public ContactActivityActivitiesFields webPushUnsubscription(Boolean webPushUnsubscription) {
    
    this.webPushUnsubscription = webPushUnsubscription;
    return this;
  }

   /**
   * True to include web push unsubscriptions, false otherwise
   * @return webPushUnsubscription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include web push unsubscriptions, false otherwise")

  public Boolean getWebPushUnsubscription() {
    return webPushUnsubscription;
  }


  public void setWebPushUnsubscription(Boolean webPushUnsubscription) {
    this.webPushUnsubscription = webPushUnsubscription;
  }


  public ContactActivityActivitiesFields forgetSubscription(Boolean forgetSubscription) {
    
    this.forgetSubscription = forgetSubscription;
    return this;
  }

   /**
   * True to include forget subscriptions, false otherwise
   * @return forgetSubscription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include forget subscriptions, false otherwise")

  public Boolean getForgetSubscription() {
    return forgetSubscription;
  }


  public void setForgetSubscription(Boolean forgetSubscription) {
    this.forgetSubscription = forgetSubscription;
  }


  public ContactActivityActivitiesFields changeConsent(Boolean changeConsent) {
    
    this.changeConsent = changeConsent;
    return this;
  }

   /**
   * True to include consent change, false otherwise
   * @return changeConsent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include consent change, false otherwise")

  public Boolean getChangeConsent() {
    return changeConsent;
  }


  public void setChangeConsent(Boolean changeConsent) {
    this.changeConsent = changeConsent;
  }


  public ContactActivityActivitiesFields doubleOptinResend(Boolean doubleOptinResend) {
    
    this.doubleOptinResend = doubleOptinResend;
    return this;
  }

   /**
   * True to include optin resends, false otherwise
   * @return doubleOptinResend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include optin resends, false otherwise")

  public Boolean getDoubleOptinResend() {
    return doubleOptinResend;
  }


  public void setDoubleOptinResend(Boolean doubleOptinResend) {
    this.doubleOptinResend = doubleOptinResend;
  }


  public ContactActivityActivitiesFields doubleOptedit(Boolean doubleOptedit) {
    
    this.doubleOptedit = doubleOptedit;
    return this;
  }

   /**
   * True to include double optedit, false otherwise
   * @return doubleOptedit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "True to include double optedit, false otherwise")

  public Boolean getDoubleOptedit() {
    return doubleOptedit;
  }


  public void setDoubleOptedit(Boolean doubleOptedit) {
    this.doubleOptedit = doubleOptedit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactActivityActivitiesFields contactActivityActivitiesFields = (ContactActivityActivitiesFields) o;
    return Objects.equals(this.opens, contactActivityActivitiesFields.opens) &&
        Objects.equals(this.clicks, contactActivityActivitiesFields.clicks) &&
        Objects.equals(this.recommends, contactActivityActivitiesFields.recommends) &&
        Objects.equals(this.conversion, contactActivityActivitiesFields.conversion) &&
        Objects.equals(this.emailSend, contactActivityActivitiesFields.emailSend) &&
        Objects.equals(this.smsSend, contactActivityActivitiesFields.smsSend) &&
        Objects.equals(this.smsReport, contactActivityActivitiesFields.smsReport) &&
        Objects.equals(this.voiceSend, contactActivityActivitiesFields.voiceSend) &&
        Objects.equals(this.voiceReport, contactActivityActivitiesFields.voiceReport) &&
        Objects.equals(this.invitationSend, contactActivityActivitiesFields.invitationSend) &&
        Objects.equals(this.invitationOpen, contactActivityActivitiesFields.invitationOpen) &&
        Objects.equals(this.unsubscribe, contactActivityActivitiesFields.unsubscribe) &&
        Objects.equals(this.emailSoftBounce, contactActivityActivitiesFields.emailSoftBounce) &&
        Objects.equals(this.emailHardBounce, contactActivityActivitiesFields.emailHardBounce) &&
        Objects.equals(this.subscription, contactActivityActivitiesFields.subscription) &&
        Objects.equals(this.resubscription, contactActivityActivitiesFields.resubscription) &&
        Objects.equals(this.unsubscribeReason, contactActivityActivitiesFields.unsubscribeReason) &&
        Objects.equals(this.facebookLike, contactActivityActivitiesFields.facebookLike) &&
        Objects.equals(this.socialShare, contactActivityActivitiesFields.socialShare) &&
        Objects.equals(this.unsubscribeManual, contactActivityActivitiesFields.unsubscribeManual) &&
        Objects.equals(this.doubleOptin, contactActivityActivitiesFields.doubleOptin) &&
        Objects.equals(this.emailSpamComplaint, contactActivityActivitiesFields.emailSpamComplaint) &&
        Objects.equals(this.emailFieldDisable, contactActivityActivitiesFields.emailFieldDisable) &&
        Objects.equals(this.cellphoneFieldDisable, contactActivityActivitiesFields.cellphoneFieldDisable) &&
        Objects.equals(this.phoneFieldDisable, contactActivityActivitiesFields.phoneFieldDisable) &&
        Objects.equals(this.unsubscribeApi, contactActivityActivitiesFields.unsubscribeApi) &&
        Objects.equals(this.emailFieldEnable, contactActivityActivitiesFields.emailFieldEnable) &&
        Objects.equals(this.cellphoneFieldEnable, contactActivityActivitiesFields.cellphoneFieldEnable) &&
        Objects.equals(this.phoneFieldEnable, contactActivityActivitiesFields.phoneFieldEnable) &&
        Objects.equals(this.editSubscription, contactActivityActivitiesFields.editSubscription) &&
        Objects.equals(this.automationEvent, contactActivityActivitiesFields.automationEvent) &&
        Objects.equals(this.pushSend, contactActivityActivitiesFields.pushSend) &&
        Objects.equals(this.pushDelivered, contactActivityActivitiesFields.pushDelivered) &&
        Objects.equals(this.pushError, contactActivityActivitiesFields.pushError) &&
        Objects.equals(this.pushReceived, contactActivityActivitiesFields.pushReceived) &&
        Objects.equals(this.pushOpen, contactActivityActivitiesFields.pushOpen) &&
        Objects.equals(this.pushCanceled, contactActivityActivitiesFields.pushCanceled) &&
        Objects.equals(this.pushUnsubscription, contactActivityActivitiesFields.pushUnsubscription) &&
        Objects.equals(this.replyToEmail, contactActivityActivitiesFields.replyToEmail) &&
        Objects.equals(this.webPushSend, contactActivityActivitiesFields.webPushSend) &&
        Objects.equals(this.webPushDelivered, contactActivityActivitiesFields.webPushDelivered) &&
        Objects.equals(this.webPushOpen, contactActivityActivitiesFields.webPushOpen) &&
        Objects.equals(this.webPushBounce, contactActivityActivitiesFields.webPushBounce) &&
        Objects.equals(this.webPushClick, contactActivityActivitiesFields.webPushClick) &&
        Objects.equals(this.webPushSubscription, contactActivityActivitiesFields.webPushSubscription) &&
        Objects.equals(this.webPushUnsubscription, contactActivityActivitiesFields.webPushUnsubscription) &&
        Objects.equals(this.forgetSubscription, contactActivityActivitiesFields.forgetSubscription) &&
        Objects.equals(this.changeConsent, contactActivityActivitiesFields.changeConsent) &&
        Objects.equals(this.doubleOptinResend, contactActivityActivitiesFields.doubleOptinResend) &&
        Objects.equals(this.doubleOptedit, contactActivityActivitiesFields.doubleOptedit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opens, clicks, recommends, conversion, emailSend, smsSend, smsReport, voiceSend, voiceReport, invitationSend, invitationOpen, unsubscribe, emailSoftBounce, emailHardBounce, subscription, resubscription, unsubscribeReason, facebookLike, socialShare, unsubscribeManual, doubleOptin, emailSpamComplaint, emailFieldDisable, cellphoneFieldDisable, phoneFieldDisable, unsubscribeApi, emailFieldEnable, cellphoneFieldEnable, phoneFieldEnable, editSubscription, automationEvent, pushSend, pushDelivered, pushError, pushReceived, pushOpen, pushCanceled, pushUnsubscription, replyToEmail, webPushSend, webPushDelivered, webPushOpen, webPushBounce, webPushClick, webPushSubscription, webPushUnsubscription, forgetSubscription, changeConsent, doubleOptinResend, doubleOptedit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactActivityActivitiesFields {\n");
    sb.append("    opens: ").append(toIndentedString(opens)).append("\n");
    sb.append("    clicks: ").append(toIndentedString(clicks)).append("\n");
    sb.append("    recommends: ").append(toIndentedString(recommends)).append("\n");
    sb.append("    conversion: ").append(toIndentedString(conversion)).append("\n");
    sb.append("    emailSend: ").append(toIndentedString(emailSend)).append("\n");
    sb.append("    smsSend: ").append(toIndentedString(smsSend)).append("\n");
    sb.append("    smsReport: ").append(toIndentedString(smsReport)).append("\n");
    sb.append("    voiceSend: ").append(toIndentedString(voiceSend)).append("\n");
    sb.append("    voiceReport: ").append(toIndentedString(voiceReport)).append("\n");
    sb.append("    invitationSend: ").append(toIndentedString(invitationSend)).append("\n");
    sb.append("    invitationOpen: ").append(toIndentedString(invitationOpen)).append("\n");
    sb.append("    unsubscribe: ").append(toIndentedString(unsubscribe)).append("\n");
    sb.append("    emailSoftBounce: ").append(toIndentedString(emailSoftBounce)).append("\n");
    sb.append("    emailHardBounce: ").append(toIndentedString(emailHardBounce)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    resubscription: ").append(toIndentedString(resubscription)).append("\n");
    sb.append("    unsubscribeReason: ").append(toIndentedString(unsubscribeReason)).append("\n");
    sb.append("    facebookLike: ").append(toIndentedString(facebookLike)).append("\n");
    sb.append("    socialShare: ").append(toIndentedString(socialShare)).append("\n");
    sb.append("    unsubscribeManual: ").append(toIndentedString(unsubscribeManual)).append("\n");
    sb.append("    doubleOptin: ").append(toIndentedString(doubleOptin)).append("\n");
    sb.append("    emailSpamComplaint: ").append(toIndentedString(emailSpamComplaint)).append("\n");
    sb.append("    emailFieldDisable: ").append(toIndentedString(emailFieldDisable)).append("\n");
    sb.append("    cellphoneFieldDisable: ").append(toIndentedString(cellphoneFieldDisable)).append("\n");
    sb.append("    phoneFieldDisable: ").append(toIndentedString(phoneFieldDisable)).append("\n");
    sb.append("    unsubscribeApi: ").append(toIndentedString(unsubscribeApi)).append("\n");
    sb.append("    emailFieldEnable: ").append(toIndentedString(emailFieldEnable)).append("\n");
    sb.append("    cellphoneFieldEnable: ").append(toIndentedString(cellphoneFieldEnable)).append("\n");
    sb.append("    phoneFieldEnable: ").append(toIndentedString(phoneFieldEnable)).append("\n");
    sb.append("    editSubscription: ").append(toIndentedString(editSubscription)).append("\n");
    sb.append("    automationEvent: ").append(toIndentedString(automationEvent)).append("\n");
    sb.append("    pushSend: ").append(toIndentedString(pushSend)).append("\n");
    sb.append("    pushDelivered: ").append(toIndentedString(pushDelivered)).append("\n");
    sb.append("    pushError: ").append(toIndentedString(pushError)).append("\n");
    sb.append("    pushReceived: ").append(toIndentedString(pushReceived)).append("\n");
    sb.append("    pushOpen: ").append(toIndentedString(pushOpen)).append("\n");
    sb.append("    pushCanceled: ").append(toIndentedString(pushCanceled)).append("\n");
    sb.append("    pushUnsubscription: ").append(toIndentedString(pushUnsubscription)).append("\n");
    sb.append("    replyToEmail: ").append(toIndentedString(replyToEmail)).append("\n");
    sb.append("    webPushSend: ").append(toIndentedString(webPushSend)).append("\n");
    sb.append("    webPushDelivered: ").append(toIndentedString(webPushDelivered)).append("\n");
    sb.append("    webPushOpen: ").append(toIndentedString(webPushOpen)).append("\n");
    sb.append("    webPushBounce: ").append(toIndentedString(webPushBounce)).append("\n");
    sb.append("    webPushClick: ").append(toIndentedString(webPushClick)).append("\n");
    sb.append("    webPushSubscription: ").append(toIndentedString(webPushSubscription)).append("\n");
    sb.append("    webPushUnsubscription: ").append(toIndentedString(webPushUnsubscription)).append("\n");
    sb.append("    forgetSubscription: ").append(toIndentedString(forgetSubscription)).append("\n");
    sb.append("    changeConsent: ").append(toIndentedString(changeConsent)).append("\n");
    sb.append("    doubleOptinResend: ").append(toIndentedString(doubleOptinResend)).append("\n");
    sb.append("    doubleOptedit: ").append(toIndentedString(doubleOptedit)).append("\n");
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
    openapiFields.add("opens");
    openapiFields.add("clicks");
    openapiFields.add("recommends");
    openapiFields.add("conversion");
    openapiFields.add("email_send");
    openapiFields.add("sms_send");
    openapiFields.add("sms_report");
    openapiFields.add("voice_send");
    openapiFields.add("voice_report");
    openapiFields.add("invitation_send");
    openapiFields.add("invitation_open");
    openapiFields.add("unsubscribe");
    openapiFields.add("email_soft_bounce");
    openapiFields.add("email_hard_bounce");
    openapiFields.add("subscription");
    openapiFields.add("resubscription");
    openapiFields.add("unsubscribe_reason");
    openapiFields.add("facebook_like");
    openapiFields.add("social_share");
    openapiFields.add("unsubscribe_manual");
    openapiFields.add("double_optin");
    openapiFields.add("email_spam_complaint");
    openapiFields.add("email_field_disable");
    openapiFields.add("cellphone_field_disable");
    openapiFields.add("phone_field_disable");
    openapiFields.add("unsubscribe_api");
    openapiFields.add("email_field_enable");
    openapiFields.add("cellphone_field_enable");
    openapiFields.add("phone_field_enable");
    openapiFields.add("edit_subscription");
    openapiFields.add("automation_event");
    openapiFields.add("push_send");
    openapiFields.add("push_delivered");
    openapiFields.add("push_error");
    openapiFields.add("push_received");
    openapiFields.add("push_open");
    openapiFields.add("push_canceled");
    openapiFields.add("push_unsubscription");
    openapiFields.add("reply_to_email");
    openapiFields.add("web_push_send");
    openapiFields.add("web_push_delivered");
    openapiFields.add("web_push_open");
    openapiFields.add("web_push_bounce");
    openapiFields.add("web_push_click");
    openapiFields.add("web_push_subscription");
    openapiFields.add("web_push_unsubscription");
    openapiFields.add("forget_subscription");
    openapiFields.add("change_consent");
    openapiFields.add("double_optin_resend");
    openapiFields.add("double_optedit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("opens");
    openapiRequiredFields.add("clicks");
    openapiRequiredFields.add("recommends");
    openapiRequiredFields.add("conversion");
    openapiRequiredFields.add("email_send");
    openapiRequiredFields.add("sms_send");
    openapiRequiredFields.add("sms_report");
    openapiRequiredFields.add("voice_send");
    openapiRequiredFields.add("voice_report");
    openapiRequiredFields.add("invitation_send");
    openapiRequiredFields.add("invitation_open");
    openapiRequiredFields.add("unsubscribe");
    openapiRequiredFields.add("email_soft_bounce");
    openapiRequiredFields.add("email_hard_bounce");
    openapiRequiredFields.add("subscription");
    openapiRequiredFields.add("resubscription");
    openapiRequiredFields.add("unsubscribe_reason");
    openapiRequiredFields.add("facebook_like");
    openapiRequiredFields.add("social_share");
    openapiRequiredFields.add("unsubscribe_manual");
    openapiRequiredFields.add("double_optin");
    openapiRequiredFields.add("email_spam_complaint");
    openapiRequiredFields.add("email_field_disable");
    openapiRequiredFields.add("cellphone_field_disable");
    openapiRequiredFields.add("phone_field_disable");
    openapiRequiredFields.add("unsubscribe_api");
    openapiRequiredFields.add("email_field_enable");
    openapiRequiredFields.add("cellphone_field_enable");
    openapiRequiredFields.add("phone_field_enable");
    openapiRequiredFields.add("edit_subscription");
    openapiRequiredFields.add("automation_event");
    openapiRequiredFields.add("push_send");
    openapiRequiredFields.add("push_delivered");
    openapiRequiredFields.add("push_error");
    openapiRequiredFields.add("push_received");
    openapiRequiredFields.add("push_open");
    openapiRequiredFields.add("push_canceled");
    openapiRequiredFields.add("push_unsubscription");
    openapiRequiredFields.add("reply_to_email");
    openapiRequiredFields.add("web_push_send");
    openapiRequiredFields.add("web_push_delivered");
    openapiRequiredFields.add("web_push_open");
    openapiRequiredFields.add("web_push_bounce");
    openapiRequiredFields.add("web_push_click");
    openapiRequiredFields.add("web_push_subscription");
    openapiRequiredFields.add("web_push_unsubscription");
    openapiRequiredFields.add("forget_subscription");
    openapiRequiredFields.add("change_consent");
    openapiRequiredFields.add("double_optin_resend");
    openapiRequiredFields.add("double_optedit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactActivityActivitiesFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContactActivityActivitiesFields.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactActivityActivitiesFields is not found in the empty JSON string", ContactActivityActivitiesFields.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactActivityActivitiesFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactActivityActivitiesFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ContactActivityActivitiesFields.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactActivityActivitiesFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactActivityActivitiesFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactActivityActivitiesFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactActivityActivitiesFields.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactActivityActivitiesFields>() {
           @Override
           public void write(JsonWriter out, ContactActivityActivitiesFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactActivityActivitiesFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactActivityActivitiesFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactActivityActivitiesFields
  * @throws IOException if the JSON string is invalid with respect to ContactActivityActivitiesFields
  */
  public static ContactActivityActivitiesFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactActivityActivitiesFields.class);
  }

 /**
  * Convert an instance of ContactActivityActivitiesFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

