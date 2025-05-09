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


package org.egoi.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
                .registerTypeSelector(org.egoi.client.model.ActivateContactsRequest.class, new TypeSelector<org.egoi.client.model.ActivateContactsRequest>() {
                    @Override
                    public Class<? extends org.egoi.client.model.ActivateContactsRequest> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ActivateContactsAll", org.egoi.client.model.ActivateContactsAll.class);
                        classByDiscriminatorValue.put("ActivateContactsMany", org.egoi.client.model.ActivateContactsMany.class);
                        classByDiscriminatorValue.put("all", org.egoi.client.model.ActivateContactsAll.class);
                        classByDiscriminatorValue.put("contacts", org.egoi.client.model.ActivateContactsMany.class);
                        classByDiscriminatorValue.put("ActivateContactsRequest", org.egoi.client.model.ActivateContactsRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.AdvancedReportCampaignsObject.class, new TypeSelector<org.egoi.client.model.AdvancedReportCampaignsObject>() {
                    @Override
                    public Class<? extends org.egoi.client.model.AdvancedReportCampaignsObject> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ReportCampaignsAll", org.egoi.client.model.ReportCampaignsAll.class);
                        classByDiscriminatorValue.put("ReportCampaignsGroup", org.egoi.client.model.ReportCampaignsGroup.class);
                        classByDiscriminatorValue.put("ReportCampaignsLast", org.egoi.client.model.ReportCampaignsLast.class);
                        classByDiscriminatorValue.put("ReportCampaignsSpecific", org.egoi.client.model.ReportCampaignsSpecific.class);
                        classByDiscriminatorValue.put("all", org.egoi.client.model.ReportCampaignsAll.class);
                        classByDiscriminatorValue.put("group", org.egoi.client.model.ReportCampaignsGroup.class);
                        classByDiscriminatorValue.put("last", org.egoi.client.model.ReportCampaignsLast.class);
                        classByDiscriminatorValue.put("specific", org.egoi.client.model.ReportCampaignsSpecific.class);
                        classByDiscriminatorValue.put("AdvancedReportCampaignsObject", org.egoi.client.model.AdvancedReportCampaignsObject.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CampaignEmailContent.class, new TypeSelector<org.egoi.client.model.CampaignEmailContent>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CampaignEmailContent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CampaignEmailContentFile", org.egoi.client.model.CampaignEmailContentFile.class);
                        classByDiscriminatorValue.put("CampaignEmailContentHtml", org.egoi.client.model.CampaignEmailContentHtml.class);
                        classByDiscriminatorValue.put("CampaignEmailContentTemplate", org.egoi.client.model.CampaignEmailContentTemplate.class);
                        classByDiscriminatorValue.put("CampaignEmailContentWebPage", org.egoi.client.model.CampaignEmailContentWebPage.class);
                        classByDiscriminatorValue.put("file", org.egoi.client.model.CampaignEmailContentFile.class);
                        classByDiscriminatorValue.put("html", org.egoi.client.model.CampaignEmailContentHtml.class);
                        classByDiscriminatorValue.put("template", org.egoi.client.model.CampaignEmailContentTemplate.class);
                        classByDiscriminatorValue.put("web_page", org.egoi.client.model.CampaignEmailContentWebPage.class);
                        classByDiscriminatorValue.put("CampaignEmailContent", org.egoi.client.model.CampaignEmailContent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CampaignEmailRssContent.class, new TypeSelector<org.egoi.client.model.CampaignEmailRssContent>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CampaignEmailRssContent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CampaignEmailRssContentHtml", org.egoi.client.model.CampaignEmailRssContentHtml.class);
                        classByDiscriminatorValue.put("html", org.egoi.client.model.CampaignEmailRssContentHtml.class);
                        classByDiscriminatorValue.put("CampaignEmailRssContent", org.egoi.client.model.CampaignEmailRssContent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CampaignPushContent.class, new TypeSelector<org.egoi.client.model.CampaignPushContent>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CampaignPushContent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CampaignPushContentTemplate", org.egoi.client.model.CampaignPushContentTemplate.class);
                        classByDiscriminatorValue.put("CampaignPushContentText", org.egoi.client.model.CampaignPushContentText.class);
                        classByDiscriminatorValue.put("template", org.egoi.client.model.CampaignPushContentTemplate.class);
                        classByDiscriminatorValue.put("text", org.egoi.client.model.CampaignPushContentText.class);
                        classByDiscriminatorValue.put("CampaignPushContent", org.egoi.client.model.CampaignPushContent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CampaignPushContentTemplate.class, new TypeSelector<org.egoi.client.model.CampaignPushContentTemplate>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CampaignPushContentTemplate> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CampaignPushContentTemplate", org.egoi.client.model.CampaignPushContentTemplate.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CampaignPushContentText.class, new TypeSelector<org.egoi.client.model.CampaignPushContentText>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CampaignPushContentText> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CampaignPushContentText", org.egoi.client.model.CampaignPushContentText.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CampaignSmartSmsPageContent.class, new TypeSelector<org.egoi.client.model.CampaignSmartSmsPageContent>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CampaignSmartSmsPageContent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CampaignSmartSmsHtml", org.egoi.client.model.CampaignSmartSmsHtml.class);
                        classByDiscriminatorValue.put("CampaignSmartSmsImport", org.egoi.client.model.CampaignSmartSmsImport.class);
                        classByDiscriminatorValue.put("CampaignSmartSmsRedirect", org.egoi.client.model.CampaignSmartSmsRedirect.class);
                        classByDiscriminatorValue.put("html", org.egoi.client.model.CampaignSmartSmsHtml.class);
                        classByDiscriminatorValue.put("import", org.egoi.client.model.CampaignSmartSmsImport.class);
                        classByDiscriminatorValue.put("redirect", org.egoi.client.model.CampaignSmartSmsRedirect.class);
                        classByDiscriminatorValue.put("CampaignSmartSmsPageContent", org.egoi.client.model.CampaignSmartSmsPageContent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CampaignSmsContent.class, new TypeSelector<org.egoi.client.model.CampaignSmsContent>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CampaignSmsContent> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("CampaignSmsContentTemplate", org.egoi.client.model.CampaignSmsContentTemplate.class);
                        classByDiscriminatorValue.put("CampaignSmsContentText", org.egoi.client.model.CampaignSmsContentText.class);
                        classByDiscriminatorValue.put("template", org.egoi.client.model.CampaignSmsContentTemplate.class);
                        classByDiscriminatorValue.put("text", org.egoi.client.model.CampaignSmsContentText.class);
                        classByDiscriminatorValue.put("CampaignSmsContent", org.egoi.client.model.CampaignSmsContent.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CellphoneSender.class, new TypeSelector<org.egoi.client.model.CellphoneSender>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CellphoneSender> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("AlphanumericCellphoneSender", org.egoi.client.model.AlphanumericCellphoneSender.class);
                        classByDiscriminatorValue.put("NumericCellphoneSender", org.egoi.client.model.NumericCellphoneSender.class);
                        classByDiscriminatorValue.put("alpha_numeric", org.egoi.client.model.AlphanumericCellphoneSender.class);
                        classByDiscriminatorValue.put("numeric", org.egoi.client.model.NumericCellphoneSender.class);
                        classByDiscriminatorValue.put("CellphoneSender", org.egoi.client.model.CellphoneSender.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CellphoneSenderPost.class, new TypeSelector<org.egoi.client.model.CellphoneSenderPost>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CellphoneSenderPost> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("AlphanumericCellphoneSenderPost", org.egoi.client.model.AlphanumericCellphoneSenderPost.class);
                        classByDiscriminatorValue.put("NumericCellphoneSenderPost", org.egoi.client.model.NumericCellphoneSenderPost.class);
                        classByDiscriminatorValue.put("alpha_numeric", org.egoi.client.model.AlphanumericCellphoneSenderPost.class);
                        classByDiscriminatorValue.put("numeric", org.egoi.client.model.NumericCellphoneSenderPost.class);
                        classByDiscriminatorValue.put("CellphoneSenderPost", org.egoi.client.model.CellphoneSenderPost.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.ContentVoice.class, new TypeSelector<org.egoi.client.model.ContentVoice>() {
                    @Override
                    public Class<? extends org.egoi.client.model.ContentVoice> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ContentVoiceAudio", org.egoi.client.model.ContentVoiceAudio.class);
                        classByDiscriminatorValue.put("ContentVoiceTemplate", org.egoi.client.model.ContentVoiceTemplate.class);
                        classByDiscriminatorValue.put("none", org.egoi.client.model.ContentVoiceAudio.class);
                        classByDiscriminatorValue.put("segment", org.egoi.client.model.ContentVoiceTemplate.class);
                        classByDiscriminatorValue.put("ContentVoice", org.egoi.client.model.ContentVoice.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.CreateSuppressionListRequest.class, new TypeSelector<org.egoi.client.model.CreateSuppressionListRequest>() {
                    @Override
                    public Class<? extends org.egoi.client.model.CreateSuppressionListRequest> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SuppressionTypeCellphone", org.egoi.client.model.SuppressionTypeCellphone.class);
                        classByDiscriminatorValue.put("SuppressionTypeEmail", org.egoi.client.model.SuppressionTypeEmail.class);
                        classByDiscriminatorValue.put("SuppressionTypeEmailDomain", org.egoi.client.model.SuppressionTypeEmailDomain.class);
                        classByDiscriminatorValue.put("SuppressionTypePhone", org.egoi.client.model.SuppressionTypePhone.class);
                        classByDiscriminatorValue.put("SuppressionTypeUserEmail", org.egoi.client.model.SuppressionTypeUserEmail.class);
                        classByDiscriminatorValue.put("cellphone", org.egoi.client.model.SuppressionTypeCellphone.class);
                        classByDiscriminatorValue.put("email", org.egoi.client.model.SuppressionTypeEmail.class);
                        classByDiscriminatorValue.put("email_domain", org.egoi.client.model.SuppressionTypeEmailDomain.class);
                        classByDiscriminatorValue.put("email_user", org.egoi.client.model.SuppressionTypeUserEmail.class);
                        classByDiscriminatorValue.put("phone", org.egoi.client.model.SuppressionTypePhone.class);
                        classByDiscriminatorValue.put("CreateSuppressionListRequest", org.egoi.client.model.CreateSuppressionListRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.DeactivateContactsRequest.class, new TypeSelector<org.egoi.client.model.DeactivateContactsRequest>() {
                    @Override
                    public Class<? extends org.egoi.client.model.DeactivateContactsRequest> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("DeactivateContactsAll", org.egoi.client.model.DeactivateContactsAll.class);
                        classByDiscriminatorValue.put("DeactivateContactsMany", org.egoi.client.model.DeactivateContactsMany.class);
                        classByDiscriminatorValue.put("all", org.egoi.client.model.DeactivateContactsAll.class);
                        classByDiscriminatorValue.put("contacts", org.egoi.client.model.DeactivateContactsMany.class);
                        classByDiscriminatorValue.put("DeactivateContactsRequest", org.egoi.client.model.DeactivateContactsRequest.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.EmailSendSegment.class, new TypeSelector<org.egoi.client.model.EmailSendSegment>() {
                    @Override
                    public Class<? extends org.egoi.client.model.EmailSendSegment> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendEmailContact", org.egoi.client.model.SendEmailContact.class);
                        classByDiscriminatorValue.put("SendNone", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("SendSegment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("contact", org.egoi.client.model.SendEmailContact.class);
                        classByDiscriminatorValue.put("none", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("segment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("EmailSendSegment", org.egoi.client.model.EmailSendSegment.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.GoalInfo.class, new TypeSelector<org.egoi.client.model.GoalInfo>() {
                    @Override
                    public Class<? extends org.egoi.client.model.GoalInfo> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("GoalAutommaticInfo", org.egoi.client.model.GoalAutommaticInfo.class);
                        classByDiscriminatorValue.put("GoalManualInfo", org.egoi.client.model.GoalManualInfo.class);
                        classByDiscriminatorValue.put("GoalTimeInfo", org.egoi.client.model.GoalTimeInfo.class);
                        classByDiscriminatorValue.put("automatic", org.egoi.client.model.GoalAutommaticInfo.class);
                        classByDiscriminatorValue.put("manual", org.egoi.client.model.GoalManualInfo.class);
                        classByDiscriminatorValue.put("time", org.egoi.client.model.GoalTimeInfo.class);
                        classByDiscriminatorValue.put("GoalInfo", org.egoi.client.model.GoalInfo.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.LimitContactsPercentActionSend.class, new TypeSelector<org.egoi.client.model.LimitContactsPercentActionSend>() {
                    @Override
                    public Class<? extends org.egoi.client.model.LimitContactsPercentActionSend> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("LimitContactsPercentActionSend", org.egoi.client.model.LimitContactsPercentActionSend.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.LimitContactsValueActionSend.class, new TypeSelector<org.egoi.client.model.LimitContactsValueActionSend>() {
                    @Override
                    public Class<? extends org.egoi.client.model.LimitContactsValueActionSend> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("LimitContactsValueActionSend", org.egoi.client.model.LimitContactsValueActionSend.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.OLimitContactsActionSend.class, new TypeSelector<org.egoi.client.model.OLimitContactsActionSend>() {
                    @Override
                    public Class<? extends org.egoi.client.model.OLimitContactsActionSend> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("LimitContactsPercentActionSend", org.egoi.client.model.LimitContactsPercentActionSend.class);
                        classByDiscriminatorValue.put("LimitContactsValueActionSend", org.egoi.client.model.LimitContactsValueActionSend.class);
                        classByDiscriminatorValue.put("percent", org.egoi.client.model.LimitContactsPercentActionSend.class);
                        classByDiscriminatorValue.put("value", org.egoi.client.model.LimitContactsValueActionSend.class);
                        classByDiscriminatorValue.put("OLimitContactsActionSend", org.egoi.client.model.OLimitContactsActionSend.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.OSegmentsActionSend.class, new TypeSelector<org.egoi.client.model.OSegmentsActionSend>() {
                    @Override
                    public Class<? extends org.egoi.client.model.OSegmentsActionSend> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendContact", org.egoi.client.model.SendContact.class);
                        classByDiscriminatorValue.put("SendNone", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("SendSegment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("contact", org.egoi.client.model.SendContact.class);
                        classByDiscriminatorValue.put("none", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("segment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("OSegmentsActionSend", org.egoi.client.model.OSegmentsActionSend.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.OSegmentsWithoutContactActionSend.class, new TypeSelector<org.egoi.client.model.OSegmentsWithoutContactActionSend>() {
                    @Override
                    public Class<? extends org.egoi.client.model.OSegmentsWithoutContactActionSend> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendNone", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("SendSegment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("none", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("segment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("OSegmentsWithoutContactActionSend", org.egoi.client.model.OSegmentsWithoutContactActionSend.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.PushNotificationSoundSchema.class, new TypeSelector<org.egoi.client.model.PushNotificationSoundSchema>() {
                    @Override
                    public Class<? extends org.egoi.client.model.PushNotificationSoundSchema> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("PushNotificationSoundSchemaDefault", org.egoi.client.model.PushNotificationSoundSchemaDefault.class);
                        classByDiscriminatorValue.put("PushNotificationSoundSchemaNone", org.egoi.client.model.PushNotificationSoundSchemaNone.class);
                        classByDiscriminatorValue.put("PushNotificationSoundSchemaUrl", org.egoi.client.model.PushNotificationSoundSchemaUrl.class);
                        classByDiscriminatorValue.put("custom", org.egoi.client.model.PushNotificationSoundSchemaUrl.class);
                        classByDiscriminatorValue.put("default", org.egoi.client.model.PushNotificationSoundSchemaDefault.class);
                        classByDiscriminatorValue.put("none", org.egoi.client.model.PushNotificationSoundSchemaNone.class);
                        classByDiscriminatorValue.put("PushNotificationSoundSchema", org.egoi.client.model.PushNotificationSoundSchema.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.PushNotificationSoundSchemaDefault.class, new TypeSelector<org.egoi.client.model.PushNotificationSoundSchemaDefault>() {
                    @Override
                    public Class<? extends org.egoi.client.model.PushNotificationSoundSchemaDefault> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("PushNotificationSoundSchemaDefault", org.egoi.client.model.PushNotificationSoundSchemaDefault.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.PushNotificationSoundSchemaNone.class, new TypeSelector<org.egoi.client.model.PushNotificationSoundSchemaNone>() {
                    @Override
                    public Class<? extends org.egoi.client.model.PushNotificationSoundSchemaNone> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("PushNotificationSoundSchemaNone", org.egoi.client.model.PushNotificationSoundSchemaNone.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.PushNotificationSoundSchemaUrl.class, new TypeSelector<org.egoi.client.model.PushNotificationSoundSchemaUrl>() {
                    @Override
                    public Class<? extends org.egoi.client.model.PushNotificationSoundSchemaUrl> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("PushNotificationSoundSchemaUrl", org.egoi.client.model.PushNotificationSoundSchemaUrl.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.Segment.class, new TypeSelector<org.egoi.client.model.Segment>() {
                    @Override
                    public Class<? extends org.egoi.client.model.Segment> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("AutomaticSegment", org.egoi.client.model.AutomaticSegment.class);
                        classByDiscriminatorValue.put("SavedSegment", org.egoi.client.model.SavedSegment.class);
                        classByDiscriminatorValue.put("TagSegment", org.egoi.client.model.TagSegment.class);
                        classByDiscriminatorValue.put("auto", org.egoi.client.model.AutomaticSegment.class);
                        classByDiscriminatorValue.put("saved", org.egoi.client.model.SavedSegment.class);
                        classByDiscriminatorValue.put("tag", org.egoi.client.model.TagSegment.class);
                        classByDiscriminatorValue.put("Segment", org.egoi.client.model.Segment.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.SendContact.class, new TypeSelector<org.egoi.client.model.SendContact>() {
                    @Override
                    public Class<? extends org.egoi.client.model.SendContact> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendContact", org.egoi.client.model.SendContact.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.SendContactCellphone.class, new TypeSelector<org.egoi.client.model.SendContactCellphone>() {
                    @Override
                    public Class<? extends org.egoi.client.model.SendContactCellphone> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendContactCellphone", org.egoi.client.model.SendContactCellphone.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.SendEmailContact.class, new TypeSelector<org.egoi.client.model.SendEmailContact>() {
                    @Override
                    public Class<? extends org.egoi.client.model.SendEmailContact> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendEmailContact", org.egoi.client.model.SendEmailContact.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.SendNone.class, new TypeSelector<org.egoi.client.model.SendNone>() {
                    @Override
                    public Class<? extends org.egoi.client.model.SendNone> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendNone", org.egoi.client.model.SendNone.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.SendSegment.class, new TypeSelector<org.egoi.client.model.SendSegment>() {
                    @Override
                    public Class<? extends org.egoi.client.model.SendSegment> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendSegment", org.egoi.client.model.SendSegment.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.SmartSmsSegmentsActionSend.class, new TypeSelector<org.egoi.client.model.SmartSmsSegmentsActionSend>() {
                    @Override
                    public Class<? extends org.egoi.client.model.SmartSmsSegmentsActionSend> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendContactCellphone", org.egoi.client.model.SendContactCellphone.class);
                        classByDiscriminatorValue.put("SendNone", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("SendSegment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("contact", org.egoi.client.model.SendContactCellphone.class);
                        classByDiscriminatorValue.put("none", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("segment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("SmartSmsSegmentsActionSend", org.egoi.client.model.SmartSmsSegmentsActionSend.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
                .registerTypeSelector(org.egoi.client.model.SmsSegmentsActionSend.class, new TypeSelector<org.egoi.client.model.SmsSegmentsActionSend>() {
                    @Override
                    public Class<? extends org.egoi.client.model.SmsSegmentsActionSend> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("SendContactCellphone", org.egoi.client.model.SendContactCellphone.class);
                        classByDiscriminatorValue.put("SendNone", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("SendSegment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("contact", org.egoi.client.model.SendContactCellphone.class);
                        classByDiscriminatorValue.put("none", org.egoi.client.model.SendNone.class);
                        classByDiscriminatorValue.put("segment", org.egoi.client.model.SendSegment.class);
                        classByDiscriminatorValue.put("SmsSegmentsActionSend", org.egoi.client.model.SmsSegmentsActionSend.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "type"));
                    }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractCampaignSendRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractCampaignSendRequestSegments.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractCampaignTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractCellphoneSender.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractCellphoneSenderAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractSegment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractSendEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractSendVoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractSendVoiceAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractSendVoiceAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AbstractSuppresionList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AcceptedResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ActivateContactsAll.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ActivateContactsMany.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ActivateContactsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ActivityCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportCampaignsObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportContactActivityColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportContactActivityOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailBouncesColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailBouncesOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailClicksByContactColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailClicksByContactOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailClicksByUrlColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailClicksByUrlOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailEventsColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailEventsOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailUnsubscriptionsColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportEmailUnsubscriptionsOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportFormsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportListExtraFieldsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportModels.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportRange.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportSendsColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportSendsOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportSmsBouncesColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportSmsBouncesOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportSmsEventsColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportSmsEventsOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportSubscriptionsColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportSubscriptionsOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportUnsubscriptionsColumns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportUnsubscriptionsOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportsCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AdvancedReportsModelsCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AlphanumericCellphoneSender.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AlphanumericCellphoneSenderPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AlphanumericCellphoneSenderPostAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AppStructure.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AppStructureList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AttachByContacts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AttachByFieldId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AttachBySegment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AttachTagRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AttachTagResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AutomaticSegment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AutomaticSegmentAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Automation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AutomationActions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AutomationActionsAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AutomationActionsCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AutomationAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AutomationCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AutomationPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.AutomationPostAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BadRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BalanceInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BalanceInfoBalanceInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BaseConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BasicProduct.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BasicSender.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BillingInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BillingInfoAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BillingInfoAllOfBillingInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BillingInfoAllOfBillingInfoCountry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.BulkActionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CName.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CNamePost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CNamesCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Campaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailBaseContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentFileAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentHtml.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentHtmlAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentHtmlPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentHtmlPatchAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentTemplateAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentWebPage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailContentWebPageAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailRssContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailRssContentHtml.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailRssContentHtmlAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailScheduleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailScheduleRequestAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailSendNowRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignEmailSendRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignGroupAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignGroupCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignGroupPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignGroupPostAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignHash.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignPushContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignPushContentTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignPushContentText.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignPushScheduleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignPushSendRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignScheduleDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSentLast30Days.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSentLast30DaysErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmartSmsHtml.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmartSmsImport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmartSmsOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmartSmsPageContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmartSmsRedirect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmartSmsScheduleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmartSmsSendRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmsContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmsContentTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmsContentText.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmsOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmsScheduleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignSmsSendRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignVoiceScheduleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignVoiceSendRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignWebPushScheduleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignWebPushSendRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CampaignsCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Cart.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CartPatchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Catalog.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CatalogCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CatalogPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CatalogPostRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CellphoneSender.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CellphoneSenderCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CellphoneSenderPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ClientAlreadyEnabled.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ClientAlreadyEnabledErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ClientIsBeingEnabled.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ClientIsBeingEnabledErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CnameExists.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CnameExistsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ComplexContact.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ComplexField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ComplexFieldAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ComplexList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ComplexListAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ComplexListAllOfStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ComplexUser.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ComplexUserAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ComplexUserPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Conflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConflictAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesDomain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesDomainDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesEmbedForm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesGeneralProductAppDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesGeneralProductAppDetailGlobal.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesGeneralProductFormDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesGeneralProductFormDetailGlobal.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesGeneralProductTEDetailGlobal.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesProductEmbedFormDetail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ConnectedSitesProducts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Contact.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Contact1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Contact2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactActivityAbstractActionsWithAutomations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactActivityAbstractActionsWithCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactActivityAbstractActionsWithData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactActivityAbstractActionsWithTags.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactActivityActivitiesFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactActivityClick.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactActivityClickAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactActivityClickAllOfActionData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactAdvertisingPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactAdvertisingPostSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactAdvertisingPostSchemaAdvertising.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactAutomationsActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactAutomationsActivityAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactAutomationsActivityAllOfActionData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseExtra.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseExtraBulk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseExtraFull.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseExtraPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseFieldsBulkSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseFieldsBulkSchemaBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseFieldsPostSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseFieldsPostSchemaBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseFieldsSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseFieldsSchemaBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseFieldsWithIdSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseFieldsWithIdSchemaBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseStatusExtra.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseStatusExtraBulk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseStatusExtraNoRemoved.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusFieldsBulkSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusFieldsBulkSchemaBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusFieldsNoTokensSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusFieldsNoTokensSchemaBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusFieldsSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusFieldsSchemaBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusNoRemovedFieldsSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusNoRemovedFieldsSchemaBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBulk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBulkFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBulkFileAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBulkFileAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBulkFileAllOf2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactBulkFileAllOf3.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactByFieldFieldsPostSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactByFieldFieldsPostSchemaCompareField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactCampaignActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactCampaignActivityAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactCampaignActivityAllOfActionData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactCompareFieldPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExportRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldCellphone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldCellphoneBulk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldEmailBulk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldNumber.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldPhone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldPhoneBulk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldText.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldsBulk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldsBulkSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactExtraFieldsSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactFieldIdBaseExtraPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactFieldMappingFileBulkSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactForgetRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactInsideBase.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactInsideBaseBulk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactInsideBasePost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactInsideBaseWithId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactOtherActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactReferrerPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactReferrerPostSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactReferrerPostSchemaReferrer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactSearchResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatsEmailStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatsPushStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatsSmsStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatsTrafficStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatsTrafficStatsAdvertising.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatsTrafficStatsReferrer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatsTrafficStatsUtm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatsVoiceStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatsWebpushStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatusFieldsBulkSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactStatusFieldsSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactTagActivity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactTagActivityAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactTagActivityAllOfActionData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactTags.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactTagsBulk.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactUtmPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactUtmPostSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactUtmPostSchemaUtm.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactUtmReferrerAdvertisingPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContactsActionUpdateContactsSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContentVoice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContentVoiceAudio.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContentVoicePatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ContentVoiceTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Country.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CountryCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CreateCartResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CreateContactResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CreateOrder.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CreateOrderResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.CreateSuppressionListRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeactivateContactsAll.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeactivateContactsMany.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeactivateContactsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeleteCampaignsConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeleteFieldsConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeleteListsConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeleteListsConflictsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeleteSegmentsConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeleteSegmentsConflictsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DeleteSuppressionListConflictsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DetachByContacts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DetachByFieldId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DetachBySegment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DetachTagRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Domain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DomainAlreadyDefined.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DomainAlreadyDefinedErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DomainCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DomainListRequired.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.DomainListRequiredErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailBouncesCampaignFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailBouncesListStatsFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailCampaignCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailCampaignPatch.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailCampaignTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailCampaignTemplateAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailCampaignTemplateAllOfReplyToData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailCampaignTemplateAllOfSenderData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailClicksByContactCampaignFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailClicksByContactListStatsFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailClicksByUrlCampaignFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailClicksByUrlListStatsFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailEventsCampaignFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailEventsListStatsFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByDate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByDateDateInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByDomain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByDomainDomainInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByEcommerce.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByEcommerceEcommerce.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByHour.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByHourHourInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByLocation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByLocationLocationInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByReader.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByReaderReaderInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByUrl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByUrlUrlInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByWeekday.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportByWeekdayWeekdayInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportOverall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailReportOverallOverall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailRssCampaignCreate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailSendSegment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailSender.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailSenderAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailSenderCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailSenderPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailSenderPutRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailUnsubscriptionsCampaignFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EmailUnsubscriptionsListStatsFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EnableTeConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EnableTeConflictsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EnableTeRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EnableTransactionalConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.EnableTransactionalConflictsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ExportContactsWebhookData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ExportReportWebhookData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Field.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.FieldInUse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.FieldInUseErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.FieldInUseErrorsFieldInUseData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.FieldOption.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.FieldOptionPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.FieldOptionsCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Forbidden.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Form.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GeneralInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GeneralInfoAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GeneralInfoAllOfGeneralInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateByModelReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateContactActivityReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateEmailBouncesReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateEmailClicksByContactReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateEmailClicksByUrlReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateEmailEventsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateEmailUnsubscriptionsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateFormAnswersReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateSendsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateSmsBouncesReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateSmsEventsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateSubscriptionsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GenerateUnsubscriptionsReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GetAllContactsExtraFieldIdParameter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GetAllProductsCustomAttributesParameter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Goal.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GoalAutommaticInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GoalCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GoalInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GoalManualInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.GoalTimeInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasAutomations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasAutomationsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasCampaignsLastThirtyDays.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasCampaignsLastThirtyDaysErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasPushApp.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasPushAppErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasQueuedCampaigns.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasQueuedCampaignsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasQueuedOperations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasQueuedOperationsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasWebPushSite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HasWebPushSiteErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HashcodeCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HeaderFooter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HeaderFooterFooterLinks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HeaderFooterHeaderLinks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.HeaderFooterTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ImportBulkFileRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ImportBulkFileRequestSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ImportBulkFileRequestSchemaFile.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ImportBulkRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ImportContactsWebhookData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ImportOrdersBulkBulkRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ImportOrdersBulkBulkRequestItems.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.InternalServerError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.InvalidSegmentType.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.InvalidSegmentTypeErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.LimitContactsActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.LimitContactsPercentActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.LimitContactsValueActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.LimitHourActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.LimitHourActionSendLimitHour.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.LimitSpeedActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ListCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ListCollection1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ListLimitReached.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ListLimitReachedErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.MessageWebPush.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.MessageWebPushPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.MessageWebPushRss.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ModelList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ModuleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ModuleInfoModuleInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ModuleInfoModuleInfoTe.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.MyAccount.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.NameAlreadyExists.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.NameAlreadyExistsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.NotFound.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.NotifyUserIdArrayActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Now.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.NumericCellphoneSender.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.NumericCellphoneSenderPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.NumericCellphoneSenderPostAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OLimitContactsActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OSegmentsActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OSegmentsWithoutContactActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Operation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OperationActionRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OperationActionResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OperationActionResponseError.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OperationOperationData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OperationsCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Order.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OrderPatchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OrderProduct.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Overall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.OverallOverall.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PatchRequestBaseField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PatchRequestField.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PatchRequestList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PatchVoiceCampaign200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PayloadTooLarge.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PhoneCampaignTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PhoneCampaignTemplateAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PhoneReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PhoneReportAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PhoneReportAllOfNetworks.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PhoneSender.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PhoneSenderAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PhoneSenderCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PhoneSenderPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Ping.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PlanInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PlanInfoPlanInfo.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PostCNameConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PostContactsConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PostListsConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PostProductsConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PostRequestList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PostWebpushSiteConflict.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Product.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ProductAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ProductAlreadyExists.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ProductAlreadyExistsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ProductBulkRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ProductCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ProductCustomAttributes.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ProductPatchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ProductPostRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushCampaignPatchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushCampaignPatchRequestContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushCampaignPatchRequestGeoOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushCampaignPostRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushCampaignPostRequestActions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushCampaignPostRequestGeoOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushCampaignPostRequestNotificationOptions.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushEvent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushNotificationSoundSchema.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushNotificationSoundSchemaDefault.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushNotificationSoundSchemaNone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushNotificationSoundSchemaUrl.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushReportOperatingSystemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushReportOperatingSystemsInnerAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.PushTokenTwoStepsData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.RemoveRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.RemoveResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.RemoveResponseErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ReportCampaignsAll.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ReportCampaignsGroup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ReportCampaignsLast.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ReportCampaignsSpecific.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.RequestEntityTooLarge.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.RequestItemsUnsubscribe.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.RequestItemsUnsubscribeAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.RequestTimeout.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SavedSegment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SavedSegmentAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SavedSegmentAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SavedSegmentAllOf1SegmentFilter.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SavedSegmentAllOf1SegmentFilterSegmentFilterArray.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SearchContacts200Response.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Segment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SegmentCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SegmentsActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SegmentsWithoutContactActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendContact.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendContactCellphone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendEmailContact.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendNone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendPush.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendPushAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendSegment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendSmartSms.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendSmartSmsAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendSmartSmsAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendSmartSmsAllOf2.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendSms.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendSmsAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendSmsAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendWebPush.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendWebPushAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SendsCampaignFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.ServiceUnavailable.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SingleCartObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SingleOrderObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmartSmsCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmartSmsCampaignCampaignContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmartSmsCampaignPatchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmartSmsCampaignPatchRequestCampaignContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmartSmsCampaignPatchRequestPageContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmartSmsSegmentsActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsBouncesCampaignFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsBouncesListStatsFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsCampaignPatchRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsCampaignPatchRequestContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsCampaignTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsCampaignTemplateAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsEventsCampaignFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsEventsListStatsFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SmsSegmentsActionSend.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.StartAutomationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.StartAutomationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SubscriptionsListStatsFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionList.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionListItems.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeCellphone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeCellphoneAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeCellphoneAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeEmailAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeEmailAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeEmailDomain.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeEmailDomainAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeEmailDomainAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypePhone.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypePhoneAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypePhoneAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeUserEmail.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeUserEmailAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.SuppressionTypeUserEmailAllOf1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Tag.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.TagCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.TagCollection1.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.TagRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.TagSegment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.TagSegmentAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.TeResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.TeResponseAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.TooManyRequests.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Unauthorized.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UniqueFieldInUse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UniqueFieldInUseErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UnprocessableEntity.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UnremovableEntry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UnremovableEntryErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UnsubscriptionObject.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UnsubscriptionsListStatsFields.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UpdateByContact.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UpdateBySegment.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UpdateContactsRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UpdateForAll.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UsedInAutomations.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UsedInAutomationsErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UsedInRecurringMessages.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UsedInRecurringMessagesErrors.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.User.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UserAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UserCollection.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UserPost.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UserPostAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UserPostRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.UserPostRequestAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.VoiceCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.VoiceCampaignAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.VoiceCampaignTemplate.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.VoiceCampaignTemplateAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.VoicePatchCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.VoicePatchCampaignAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushPatchCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportBrowsersInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportBrowsersInnerVersionsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportBrowsersInnerVersionsInnerAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportDevicesInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportDevicesInnerAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportOperatingSystemsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportOperatingSystemsInnerVersionsInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportOperatingSystemsInnerVersionsInnerAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportUrlInner.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushReportUrlInnerAllOf.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushRssCampaign.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushSite.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebPushStats.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.Webhook.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new org.egoi.client.model.WebpushActionsInner.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
