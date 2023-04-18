![E-goi](https://www.e-goi.com/wp-content/themes/egoi2019/imgs/svg/logo-egoi.svg)

Almost anything you can do in E-goi, you can do with our API.

The API describes each available method. Learn about parameters, errors, and how to format your requests. That means you can easily call on E-goi actions for your integration.
**API** Full documentation at https://developers.e-goi.com/api/v3/

If you find a bug or something worth fixing, create an issue.

### Changelog
#### 1.1.3RC1
## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.egoi</groupId>
  <artifactId>egoi-java-client</artifactId>
  <version>1.1.3RC1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'egoi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'egoi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.egoi:egoi-java-client:1.1.3RC1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/egoi-java-client-1.1.3RC1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.egoi.client.ApiClient;
import org.egoi.client.ApiException;
import org.egoi.client.Configuration;
import org.egoi.client.auth.*;
import org.egoi.client.models.*;
import org.egoi.client.api.AdvancedReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.egoiapp.com");
    
    // Configure API key authorization: Apikey
    ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
    Apikey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Apikey.setApiKeyPrefix("Token");

    AdvancedReportsApi apiInstance = new AdvancedReportsApi(defaultClient);
    GenerateEmailBouncesReport generateEmailBouncesReport = new GenerateEmailBouncesReport(); // GenerateEmailBouncesReport | Parameters for the email bounces report
    try {
      AcceptedResponse result = apiInstance.generateEmailBouncesReport(generateEmailBouncesReport);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdvancedReportsApi#generateEmailBouncesReport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.egoiapp.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AdvancedReportsApi* | [**generateEmailBouncesReport**](docs/AdvancedReportsApi.md#generateEmailBouncesReport) | **POST** /reports/advanced/email-bounces | Generate email bounces report
*AdvancedReportsApi* | [**generateEmailClicksByContactReport**](docs/AdvancedReportsApi.md#generateEmailClicksByContactReport) | **POST** /reports/advanced/email-clicks-by-contact | Generate email clicks by contact report
*AdvancedReportsApi* | [**generateEmailClicksByUrlReport**](docs/AdvancedReportsApi.md#generateEmailClicksByUrlReport) | **POST** /reports/advanced/email-clicks-by-url | Generate email clicks by URL report
*AdvancedReportsApi* | [**generateEmailEventsReport**](docs/AdvancedReportsApi.md#generateEmailEventsReport) | **POST** /reports/advanced/email-events | Generate email events report
*AdvancedReportsApi* | [**generateEmailUnsubscriptionsReport**](docs/AdvancedReportsApi.md#generateEmailUnsubscriptionsReport) | **POST** /reports/advanced/email-unsubscriptions | Generate email unsubscriptions report
*AdvancedReportsApi* | [**generateFormAnswersReport**](docs/AdvancedReportsApi.md#generateFormAnswersReport) | **POST** /reports/advanced/form-answers | Generate form answers report
*AdvancedReportsApi* | [**generateSendsReport**](docs/AdvancedReportsApi.md#generateSendsReport) | **POST** /reports/advanced/sends | Generate sends report
*AdvancedReportsApi* | [**generateSmsBouncesReport**](docs/AdvancedReportsApi.md#generateSmsBouncesReport) | **POST** /reports/advanced/sms-bounces | Generate SMS bounces report
*AdvancedReportsApi* | [**generateSmsEventsReport**](docs/AdvancedReportsApi.md#generateSmsEventsReport) | **POST** /reports/advanced/sms-events | Generate SMS events report
*AdvancedReportsApi* | [**generateSubscriptionsReport**](docs/AdvancedReportsApi.md#generateSubscriptionsReport) | **POST** /reports/advanced/subscriptions | Generate subscriptions report
*AdvancedReportsApi* | [**generateUnsubscriptionsReport**](docs/AdvancedReportsApi.md#generateUnsubscriptionsReport) | **POST** /reports/advanced/unsubscriptions | Generate unsubscriptions report
*AdvancedReportsApi* | [**getAllAdvancedReports**](docs/AdvancedReportsApi.md#getAllAdvancedReports) | **GET** /reports/advanced | Get all advanced reports
*AutomationsApi* | [**deleteAutomation**](docs/AutomationsApi.md#deleteAutomation) | **DELETE** /automations/{automation_id} | Remove automation
*AutomationsApi* | [**getAllAutomations**](docs/AutomationsApi.md#getAllAutomations) | **GET** /automations | Get all automations
*CNamesApi* | [**createCName**](docs/CNamesApi.md#createCName) | **POST** /cnames | Create cname
*CNamesApi* | [**getAllCNames**](docs/CNamesApi.md#getAllCNames) | **GET** /cnames | Get All CNames
*CampaignGroupsApi* | [**createCampaignGroup**](docs/CampaignGroupsApi.md#createCampaignGroup) | **POST** /campaign-groups | Create new campaign group
*CampaignGroupsApi* | [**deleteCampaignGroup**](docs/CampaignGroupsApi.md#deleteCampaignGroup) | **DELETE** /campaign-groups/{group_id} | Remove Campaign Group
*CampaignGroupsApi* | [**getAllCampaignGroups**](docs/CampaignGroupsApi.md#getAllCampaignGroups) | **GET** /campaign-groups | Get all campaign groups
*CampaignGroupsApi* | [**updateCampaignGroup**](docs/CampaignGroupsApi.md#updateCampaignGroup) | **PUT** /campaign-groups/{group_id} | Update a specific campaign group
*CampaignsApi* | [**deleteCampaigns**](docs/CampaignsApi.md#deleteCampaigns) | **DELETE** /campaigns/{campaign_hash} | Remove Campaign
*CampaignsApi* | [**getAllCampaigns**](docs/CampaignsApi.md#getAllCampaigns) | **GET** /campaigns | Get all Campaigns
*ConnectedSitesApi* | [**createConnectedSites**](docs/ConnectedSitesApi.md#createConnectedSites) | **POST** /connectedsites | Creates a Connected Site
*ConnectedSitesApi* | [**deleteConnectedSites**](docs/ConnectedSitesApi.md#deleteConnectedSites) | **DELETE** /connectedsites/{domain} | Deletes a Connected Site
*ConnectedSitesApi* | [**getAllConnectedSites**](docs/ConnectedSitesApi.md#getAllConnectedSites) | **GET** /connectedsites | Get all Connected Sites
*ConnectedSitesApi* | [**getConnectedSites**](docs/ConnectedSitesApi.md#getConnectedSites) | **GET** /connectedsites/{domain} | Get a Connected Site
*ContactsApi* | [**actionActivateContacts**](docs/ContactsApi.md#actionActivateContacts) | **POST** /lists/{list_id}/contacts/actions/activate | Activate contacts
*ContactsApi* | [**actionAttachTag**](docs/ContactsApi.md#actionAttachTag) | **POST** /lists/{list_id}/contacts/actions/attach-tag | Attach tag to contact
*ContactsApi* | [**actionDeactivateContacts**](docs/ContactsApi.md#actionDeactivateContacts) | **POST** /lists/{list_id}/contacts/actions/deactivate | Deactivate contacts
*ContactsApi* | [**actionDetachTag**](docs/ContactsApi.md#actionDetachTag) | **POST** /lists/{list_id}/contacts/actions/detach-tag | Detach tag to contact
*ContactsApi* | [**actionExportContacts**](docs/ContactsApi.md#actionExportContacts) | **POST** /lists/{list_id}/contacts/actions/export | Exports a list of contacts
*ContactsApi* | [**actionForgetContacts**](docs/ContactsApi.md#actionForgetContacts) | **POST** /lists/{list_id}/contacts/actions/forget | Forget contacts
*ContactsApi* | [**actionImportBulk**](docs/ContactsApi.md#actionImportBulk) | **POST** /lists/{list_id}/contacts/actions/import-bulk | Import collection of contacts
*ContactsApi* | [**actionStartAutomation**](docs/ContactsApi.md#actionStartAutomation) | **POST** /lists/{list_id}/contacts/actions/start-automation | Start automation
*ContactsApi* | [**actionUnsubscribeContact**](docs/ContactsApi.md#actionUnsubscribeContact) | **POST** /lists/{list_id}/contacts/actions/unsubscribe | Unsubscribes contacts
*ContactsApi* | [**actionUpdateContacts**](docs/ContactsApi.md#actionUpdateContacts) | **POST** /lists/{list_id}/contacts/actions/update | Updates contacts
*ContactsApi* | [**createContact**](docs/ContactsApi.md#createContact) | **POST** /lists/{list_id}/contacts | Create new contact
*ContactsApi* | [**getAllContactActivities**](docs/ContactsApi.md#getAllContactActivities) | **GET** /lists/{list_id}/contacts/{contact_id}/activities | Get all contact activities
*ContactsApi* | [**getAllContacts**](docs/ContactsApi.md#getAllContacts) | **GET** /lists/{list_id}/contacts | Get all contacts
*ContactsApi* | [**getAllContactsBySegment**](docs/ContactsApi.md#getAllContactsBySegment) | **GET** /lists/{list_id}/contacts/segment/{segment_id} | Get all contacts by Segment Id
*ContactsApi* | [**getContact**](docs/ContactsApi.md#getContact) | **GET** /lists/{list_id}/contacts/{contact_id} | Get contact
*ContactsApi* | [**patchContact**](docs/ContactsApi.md#patchContact) | **PATCH** /lists/{list_id}/contacts/{contact_id} | Update a specific contact
*ContactsApi* | [**searchContacts**](docs/ContactsApi.md#searchContacts) | **GET** /contacts/search | Search contact
*EcommerceApi* | [**createCart**](docs/EcommerceApi.md#createCart) | **POST** /{domain}/carts | Create cart
*EcommerceApi* | [**createCatalog**](docs/EcommerceApi.md#createCatalog) | **POST** /catalogs | Create new catalog
*EcommerceApi* | [**createOrder**](docs/EcommerceApi.md#createOrder) | **POST** /{domain}/orders | Create order
*EcommerceApi* | [**createProduct**](docs/EcommerceApi.md#createProduct) | **POST** /catalogs/{catalog_id}/products | Create new product
*EcommerceApi* | [**deleteCatalog**](docs/EcommerceApi.md#deleteCatalog) | **DELETE** /catalogs/{catalog_id} | Remove catalog
*EcommerceApi* | [**deleteProduct**](docs/EcommerceApi.md#deleteProduct) | **DELETE** /catalogs/{catalog_id}/products/{product_identifier} | Remove product
*EcommerceApi* | [**getAllCatalogs**](docs/EcommerceApi.md#getAllCatalogs) | **GET** /catalogs | Get all catalogs
*EcommerceApi* | [**getAllProducts**](docs/EcommerceApi.md#getAllProducts) | **GET** /catalogs/{catalog_id}/products | Get all products
*EcommerceApi* | [**getProduct**](docs/EcommerceApi.md#getProduct) | **GET** /catalogs/{catalog_id}/products/{product_identifier} | Get product
*EcommerceApi* | [**importProducts**](docs/EcommerceApi.md#importProducts) | **POST** /catalogs/{catalog_id}/products/actions/import | Import products
*EcommerceApi* | [**updateProduct**](docs/EcommerceApi.md#updateProduct) | **PATCH** /catalogs/{catalog_id}/products/{product_identifier} | Update product
*EcommerceActivityApi* | [**importOrdersBulk**](docs/EcommerceActivityApi.md#importOrdersBulk) | **POST** /lists/{list_id}/orders | Orders import bulk request
*EmailApi* | [**actionEnableEmailRss**](docs/EmailApi.md#actionEnableEmailRss) | **POST** /campaigns/email/rss/{campaign_hash}/actions/enable | Enables a rss email campaign
*EmailApi* | [**actionSendEmail**](docs/EmailApi.md#actionSendEmail) | **POST** /campaigns/email/{campaign_hash}/actions/send | Send email message
*EmailApi* | [**createEmailCampaign**](docs/EmailApi.md#createEmailCampaign) | **POST** /campaigns/email | Create new email campaign
*EmailApi* | [**createEmailRssCampaign**](docs/EmailApi.md#createEmailRssCampaign) | **POST** /campaigns/email/rss | Create new email rss campaign
*EmailApi* | [**patchEmailCampaign**](docs/EmailApi.md#patchEmailCampaign) | **PATCH** /campaigns/email/{campaign_hash} | Update a specific email campaign
*FieldsApi* | [**createExtraField**](docs/FieldsApi.md#createExtraField) | **POST** /lists/{list_id}/fields/extra | Create extra field
*FieldsApi* | [**createFieldOption**](docs/FieldsApi.md#createFieldOption) | **POST** /lists/{list_id}/fields/extra/{field_id}/options | Create new field option
*FieldsApi* | [**deleteExtraField**](docs/FieldsApi.md#deleteExtraField) | **DELETE** /lists/{list_id}/fields/extra/{field_id} | Remove extra field
*FieldsApi* | [**deleteFieldOption**](docs/FieldsApi.md#deleteFieldOption) | **DELETE** /lists/{list_id}/fields/extra/{field_id}/options/{option_id} | Deletes an option
*FieldsApi* | [**getAllFieldOptions**](docs/FieldsApi.md#getAllFieldOptions) | **GET** /lists/{list_id}/fields/extra/{field_id}/options | Get all field options
*FieldsApi* | [**getAllFields**](docs/FieldsApi.md#getAllFields) | **GET** /lists/{list_id}/fields | Get all fields
*FieldsApi* | [**patchBaseField**](docs/FieldsApi.md#patchBaseField) | **PATCH** /lists/{list_id}/fields/base/{field_id} | Update base field
*FieldsApi* | [**patchExtraField**](docs/FieldsApi.md#patchExtraField) | **PATCH** /lists/{list_id}/fields/extra/{field_id} | Update extra field
*FieldsApi* | [**updateFieldOption**](docs/FieldsApi.md#updateFieldOption) | **PATCH** /lists/{list_id}/fields/extra/{field_id}/options/{option_id} | Update field option
*ListsApi* | [**createList**](docs/ListsApi.md#createList) | **POST** /lists | Create new list
*ListsApi* | [**deleteList**](docs/ListsApi.md#deleteList) | **DELETE** /lists/{list_id} | Remove list
*ListsApi* | [**getAllLists**](docs/ListsApi.md#getAllLists) | **GET** /lists | Get all lists
*ListsApi* | [**updateList**](docs/ListsApi.md#updateList) | **PATCH** /lists/{list_id} | Update a specific list
*MyAccountApi* | [**enableTe**](docs/MyAccountApi.md#enableTe) | **POST** /my-account/actions/enable-te | Enable Track&amp;Engage
*MyAccountApi* | [**enableTransactional**](docs/MyAccountApi.md#enableTransactional) | **POST** /my-account/actions/enable-transactional | Enable Transactional
*MyAccountApi* | [**getMyAccount**](docs/MyAccountApi.md#getMyAccount) | **GET** /my-account | Get My Account Info
*OperationsApi* | [**actionApproveOperation**](docs/OperationsApi.md#actionApproveOperation) | **POST** /operations/actions/approve | Approve operation
*OperationsApi* | [**actionCancelOperation**](docs/OperationsApi.md#actionCancelOperation) | **POST** /operations/actions/cancel | Cancel operation
*OperationsApi* | [**actionPauseOperation**](docs/OperationsApi.md#actionPauseOperation) | **POST** /operations/actions/pause | Pause operation
*OperationsApi* | [**actionResumeOperation**](docs/OperationsApi.md#actionResumeOperation) | **POST** /operations/actions/resume | Resume operation
*OperationsApi* | [**getAllOperations**](docs/OperationsApi.md#getAllOperations) | **GET** /operations | Get all queued operations
*PingApi* | [**ping**](docs/PingApi.md#ping) | **POST** /ping | Pings the API
*PushApi* | [**actionSendPush**](docs/PushApi.md#actionSendPush) | **POST** /campaigns/push/{campaign_hash}/actions/send | Send push message
*PushApi* | [**createPushCampaign**](docs/PushApi.md#createPushCampaign) | **POST** /campaigns/push | Create new push campaign
*PushApi* | [**getPushApp**](docs/PushApi.md#getPushApp) | **GET** /push/apps/{app_id} | Get a Push application from E-goi
*PushApi* | [**getPushApps**](docs/PushApi.md#getPushApps) | **GET** /push/apps | Get all Push applications from E-goi
*PushApi* | [**patchPushCampaign**](docs/PushApi.md#patchPushCampaign) | **PATCH** /campaigns/push/{campaign_hash} | Update a specific push campaign
*PushApi* | [**registerPushEvent**](docs/PushApi.md#registerPushEvent) | **POST** /push/apps/{app_id}/event | Registers an event from the push notification.
*PushApi* | [**registerPushToken**](docs/PushApi.md#registerPushToken) | **POST** /push/apps/{app_id}/token | Registers a Firebase token
*ReportsApi* | [**getEmailReport**](docs/ReportsApi.md#getEmailReport) | **GET** /reports/email/{campaign_hash} | Get email report
*ReportsApi* | [**getSMSReport**](docs/ReportsApi.md#getSMSReport) | **GET** /reports/sms/{campaign_hash} | Get sms report
*ReportsApi* | [**getVoiceReport**](docs/ReportsApi.md#getVoiceReport) | **GET** /reports/voice/{campaign_hash} | Get voice report
*ReportsApi* | [**getWebPushReport**](docs/ReportsApi.md#getWebPushReport) | **GET** /reports/web-push/{campaign_hash} | Get webpush report
*SegmentsApi* | [**deleteSegment**](docs/SegmentsApi.md#deleteSegment) | **DELETE** /lists/{list_id}/segments/{segment_id} | Remove segment
*SegmentsApi* | [**getAllSegments**](docs/SegmentsApi.md#getAllSegments) | **GET** /lists/{list_id}/segments | Get all segments
*SendersApi* | [**createCellphoneSender**](docs/SendersApi.md#createCellphoneSender) | **POST** /senders/cellphone | Create cellphone sender
*SendersApi* | [**createEmailSender**](docs/SendersApi.md#createEmailSender) | **POST** /senders/email | Create email sender
*SendersApi* | [**createPhoneSender**](docs/SendersApi.md#createPhoneSender) | **POST** /senders/phone | Create phone sender
*SendersApi* | [**deleteCellphoneSender**](docs/SendersApi.md#deleteCellphoneSender) | **DELETE** /senders/cellphone/{sender_id} | Remove cellphone sender
*SendersApi* | [**deleteEmailSender**](docs/SendersApi.md#deleteEmailSender) | **DELETE** /senders/email/{sender_id} | Remove email sender
*SendersApi* | [**deletePhoneSender**](docs/SendersApi.md#deletePhoneSender) | **DELETE** /senders/phone/{sender_id} | Remove phone sender
*SendersApi* | [**getAllCellphoneSenders**](docs/SendersApi.md#getAllCellphoneSenders) | **GET** /senders/cellphone | Get all cellphone senders
*SendersApi* | [**getAllEmailSenders**](docs/SendersApi.md#getAllEmailSenders) | **GET** /senders/email | Get all email senders
*SendersApi* | [**getAllPhoneSenders**](docs/SendersApi.md#getAllPhoneSenders) | **GET** /senders/phone | Get all phone senders
*SendersApi* | [**putEmailSender**](docs/SendersApi.md#putEmailSender) | **PUT** /senders/email/{sender_id} | Update email sender
*SmartSmsApi* | [**actionSendSmartSms**](docs/SmartSmsApi.md#actionSendSmartSms) | **POST** /campaigns/smart-sms/{campaign_hash}/actions/send | Send smart sms message
*SmartSmsApi* | [**createSmartSmsCampaign**](docs/SmartSmsApi.md#createSmartSmsCampaign) | **POST** /campaigns/smart-sms | Create new smart sms campaign
*SmartSmsApi* | [**patchSmartSmsCampaign**](docs/SmartSmsApi.md#patchSmartSmsCampaign) | **PATCH** /campaigns/smart-sms/{campaign_hash} | Update a specific smart sms campaign
*SmsApi* | [**actionSendSms**](docs/SmsApi.md#actionSendSms) | **POST** /campaigns/sms/{campaign_hash}/actions/send | Send sms message
*SmsApi* | [**createSmsCampaign**](docs/SmsApi.md#createSmsCampaign) | **POST** /campaigns/sms | Create new sms campaign
*SmsApi* | [**patchSmsCampaign**](docs/SmsApi.md#patchSmsCampaign) | **PATCH** /campaigns/sms/{campaign_hash} | Update a specific sms campaign
*SuppressionListApi* | [**createSuppressionList**](docs/SuppressionListApi.md#createSuppressionList) | **POST** /suppression-list | Add to suppression list
*SuppressionListApi* | [**deleteSuppressionList**](docs/SuppressionListApi.md#deleteSuppressionList) | **DELETE** /suppression-list/{suppression_id} | Delete from suppression list
*SuppressionListApi* | [**getAllSuppressionList**](docs/SuppressionListApi.md#getAllSuppressionList) | **GET** /suppression-list | Get the suppression list
*TagsApi* | [**createTag**](docs/TagsApi.md#createTag) | **POST** /tags | Create new tag
*TagsApi* | [**deleteTag**](docs/TagsApi.md#deleteTag) | **DELETE** /tags/{tag_id} | Remove tag
*TagsApi* | [**getAllTags**](docs/TagsApi.md#getAllTags) | **GET** /tags | Get all tags
*TagsApi* | [**updateTag**](docs/TagsApi.md#updateTag) | **PUT** /tags/{tag_id} | Update a specific tag
*TrackEngageApi* | [**getAllDomains**](docs/TrackEngageApi.md#getAllDomains) | **GET** /trackengage/domains | Get all domains
*TrackEngageApi* | [**getAllGoals**](docs/TrackEngageApi.md#getAllGoals) | **GET** /trackengage/goals | Get all goals
*UsersApi* | [**deleteUser**](docs/UsersApi.md#deleteUser) | **DELETE** /users/{user_id} | Remove user
*UsersApi* | [**getAllUsers**](docs/UsersApi.md#getAllUsers) | **GET** /users | Get all users
*UtilitiesApi* | [**getAllCountries**](docs/UtilitiesApi.md#getAllCountries) | **GET** /utilities/countries | Get all countries
*VoiceApi* | [**actionSendVoice**](docs/VoiceApi.md#actionSendVoice) | **POST** /campaigns/voice/{campaign_hash}/actions/send | Send voice message
*VoiceApi* | [**createVoiceCampaign**](docs/VoiceApi.md#createVoiceCampaign) | **POST** /campaigns/voice | Create new voice campaign
*VoiceApi* | [**patchVoiceCampaign**](docs/VoiceApi.md#patchVoiceCampaign) | **PATCH** /campaigns/voice/{campaign_hash} | Update a specific voice campaign
*WebHooksApi* | [**createWebhook**](docs/WebHooksApi.md#createWebhook) | **POST** /webhooks | Create new webhook
*WebHooksApi* | [**deleteWebhook**](docs/WebHooksApi.md#deleteWebhook) | **DELETE** /webhooks/{webhook_id} | Remove webhook
*WebHooksApi* | [**getAllWebhooks**](docs/WebHooksApi.md#getAllWebhooks) | **GET** /webhooks | Get all webhooks
*WebpushApi* | [**actionEnableWebPushRss**](docs/WebpushApi.md#actionEnableWebPushRss) | **POST** /campaigns/webpush/rss/{campaign_hash}/actions/enable | Enable a rss webpush campaign
*WebpushApi* | [**actionSendWebPush**](docs/WebpushApi.md#actionSendWebPush) | **POST** /campaigns/web-push/{campaign_hash}/actions/send | Send webpush message
*WebpushApi* | [**createWebPushCampaign**](docs/WebpushApi.md#createWebPushCampaign) | **POST** /campaigns/web-push | Create new webpush campaign
*WebpushApi* | [**createWebPushRssCampaign**](docs/WebpushApi.md#createWebPushRssCampaign) | **POST** /campaigns/webpush/rss | Create new webpush rss campaign
*WebpushApi* | [**createWebpushSite**](docs/WebpushApi.md#createWebpushSite) | **POST** /webpush/sites | Creates a webpush site
*WebpushApi* | [**getAllWebPushSites**](docs/WebpushApi.md#getAllWebPushSites) | **GET** /webpush/sites | Get all webpush sites
*WebpushApi* | [**patchWebPushCampaign**](docs/WebpushApi.md#patchWebPushCampaign) | **PATCH** /campaigns/web-push/{campaign_hash} | Update a specific webpush campaign


## Documentation for Models

 - [AbstractCampaignSendRequest](docs/AbstractCampaignSendRequest.md)
 - [AbstractCampaignSendRequestSegments](docs/AbstractCampaignSendRequestSegments.md)
 - [AbstractCampaignTemplate](docs/AbstractCampaignTemplate.md)
 - [AbstractCellphoneSender](docs/AbstractCellphoneSender.md)
 - [AbstractCellphoneSenderAllOf](docs/AbstractCellphoneSenderAllOf.md)
 - [AbstractSegment](docs/AbstractSegment.md)
 - [AbstractSendEmail](docs/AbstractSendEmail.md)
 - [AbstractSendVoice](docs/AbstractSendVoice.md)
 - [AbstractSendVoiceAllOf](docs/AbstractSendVoiceAllOf.md)
 - [AbstractSendVoiceAllOf1](docs/AbstractSendVoiceAllOf1.md)
 - [AbstractSuppresionList](docs/AbstractSuppresionList.md)
 - [AcceptedResponse](docs/AcceptedResponse.md)
 - [ActivateContactsAll](docs/ActivateContactsAll.md)
 - [ActivateContactsMany](docs/ActivateContactsMany.md)
 - [ActivateContactsRequest](docs/ActivateContactsRequest.md)
 - [ActivityCollection](docs/ActivityCollection.md)
 - [AdvancedReport](docs/AdvancedReport.md)
 - [AdvancedReportCampaignsObject](docs/AdvancedReportCampaignsObject.md)
 - [AdvancedReportEmailBouncesColumns](docs/AdvancedReportEmailBouncesColumns.md)
 - [AdvancedReportEmailBouncesOptions](docs/AdvancedReportEmailBouncesOptions.md)
 - [AdvancedReportEmailClicksByContactColumns](docs/AdvancedReportEmailClicksByContactColumns.md)
 - [AdvancedReportEmailClicksByContactOptions](docs/AdvancedReportEmailClicksByContactOptions.md)
 - [AdvancedReportEmailClicksByUrlColumns](docs/AdvancedReportEmailClicksByUrlColumns.md)
 - [AdvancedReportEmailClicksByUrlOptions](docs/AdvancedReportEmailClicksByUrlOptions.md)
 - [AdvancedReportEmailEventsColumns](docs/AdvancedReportEmailEventsColumns.md)
 - [AdvancedReportEmailEventsOptions](docs/AdvancedReportEmailEventsOptions.md)
 - [AdvancedReportEmailUnsubscriptionsColumns](docs/AdvancedReportEmailUnsubscriptionsColumns.md)
 - [AdvancedReportEmailUnsubscriptionsOptions](docs/AdvancedReportEmailUnsubscriptionsOptions.md)
 - [AdvancedReportFormsInner](docs/AdvancedReportFormsInner.md)
 - [AdvancedReportListExtraFieldsInner](docs/AdvancedReportListExtraFieldsInner.md)
 - [AdvancedReportRange](docs/AdvancedReportRange.md)
 - [AdvancedReportSendsColumns](docs/AdvancedReportSendsColumns.md)
 - [AdvancedReportSendsOptions](docs/AdvancedReportSendsOptions.md)
 - [AdvancedReportSmsBouncesColumns](docs/AdvancedReportSmsBouncesColumns.md)
 - [AdvancedReportSmsBouncesOptions](docs/AdvancedReportSmsBouncesOptions.md)
 - [AdvancedReportSmsEventsColumns](docs/AdvancedReportSmsEventsColumns.md)
 - [AdvancedReportSmsEventsOptions](docs/AdvancedReportSmsEventsOptions.md)
 - [AdvancedReportSubscriptionsColumns](docs/AdvancedReportSubscriptionsColumns.md)
 - [AdvancedReportSubscriptionsOptions](docs/AdvancedReportSubscriptionsOptions.md)
 - [AdvancedReportUnsubscriptionsColumns](docs/AdvancedReportUnsubscriptionsColumns.md)
 - [AdvancedReportUnsubscriptionsOptions](docs/AdvancedReportUnsubscriptionsOptions.md)
 - [AdvancedReportsCollection](docs/AdvancedReportsCollection.md)
 - [AlphanumericCellphoneSender](docs/AlphanumericCellphoneSender.md)
 - [AlphanumericCellphoneSenderPost](docs/AlphanumericCellphoneSenderPost.md)
 - [AlphanumericCellphoneSenderPostAllOf](docs/AlphanumericCellphoneSenderPostAllOf.md)
 - [AppStructure](docs/AppStructure.md)
 - [AppStructureList](docs/AppStructureList.md)
 - [AttachByContacts](docs/AttachByContacts.md)
 - [AttachBySegment](docs/AttachBySegment.md)
 - [AttachTagRequest](docs/AttachTagRequest.md)
 - [AttachTagResponse](docs/AttachTagResponse.md)
 - [AutomaticSegment](docs/AutomaticSegment.md)
 - [AutomaticSegmentAllOf](docs/AutomaticSegmentAllOf.md)
 - [Automation](docs/Automation.md)
 - [AutomationAllOf](docs/AutomationAllOf.md)
 - [AutomationCollection](docs/AutomationCollection.md)
 - [AutomationPost](docs/AutomationPost.md)
 - [AutomationPostAllOf](docs/AutomationPostAllOf.md)
 - [BadRequest](docs/BadRequest.md)
 - [BalanceInfo](docs/BalanceInfo.md)
 - [BalanceInfoBalanceInfo](docs/BalanceInfoBalanceInfo.md)
 - [BaseConflict](docs/BaseConflict.md)
 - [BasicProduct](docs/BasicProduct.md)
 - [BasicSender](docs/BasicSender.md)
 - [BillingInfo](docs/BillingInfo.md)
 - [BillingInfoAllOf](docs/BillingInfoAllOf.md)
 - [BillingInfoAllOfBillingInfo](docs/BillingInfoAllOfBillingInfo.md)
 - [BillingInfoAllOfBillingInfoCountry](docs/BillingInfoAllOfBillingInfoCountry.md)
 - [BulkActionResponse](docs/BulkActionResponse.md)
 - [CName](docs/CName.md)
 - [CNamePost](docs/CNamePost.md)
 - [CNamesCollection](docs/CNamesCollection.md)
 - [Campaign](docs/Campaign.md)
 - [CampaignEmailBaseContent](docs/CampaignEmailBaseContent.md)
 - [CampaignEmailContent](docs/CampaignEmailContent.md)
 - [CampaignEmailContentFile](docs/CampaignEmailContentFile.md)
 - [CampaignEmailContentFileAllOf](docs/CampaignEmailContentFileAllOf.md)
 - [CampaignEmailContentHtml](docs/CampaignEmailContentHtml.md)
 - [CampaignEmailContentHtmlAllOf](docs/CampaignEmailContentHtmlAllOf.md)
 - [CampaignEmailContentHtmlPatch](docs/CampaignEmailContentHtmlPatch.md)
 - [CampaignEmailContentHtmlPatchAllOf](docs/CampaignEmailContentHtmlPatchAllOf.md)
 - [CampaignEmailContentTemplate](docs/CampaignEmailContentTemplate.md)
 - [CampaignEmailContentTemplateAllOf](docs/CampaignEmailContentTemplateAllOf.md)
 - [CampaignEmailContentWebPage](docs/CampaignEmailContentWebPage.md)
 - [CampaignEmailContentWebPageAllOf](docs/CampaignEmailContentWebPageAllOf.md)
 - [CampaignEmailRssContent](docs/CampaignEmailRssContent.md)
 - [CampaignEmailRssContentHtml](docs/CampaignEmailRssContentHtml.md)
 - [CampaignEmailRssContentHtmlAllOf](docs/CampaignEmailRssContentHtmlAllOf.md)
 - [CampaignEmailScheduleRequest](docs/CampaignEmailScheduleRequest.md)
 - [CampaignEmailScheduleRequestAllOf](docs/CampaignEmailScheduleRequestAllOf.md)
 - [CampaignEmailSendNowRequest](docs/CampaignEmailSendNowRequest.md)
 - [CampaignEmailSendRequest](docs/CampaignEmailSendRequest.md)
 - [CampaignGroup](docs/CampaignGroup.md)
 - [CampaignGroupAllOf](docs/CampaignGroupAllOf.md)
 - [CampaignGroupCollection](docs/CampaignGroupCollection.md)
 - [CampaignGroupPost](docs/CampaignGroupPost.md)
 - [CampaignGroupPostAllOf](docs/CampaignGroupPostAllOf.md)
 - [CampaignHash](docs/CampaignHash.md)
 - [CampaignPushContent](docs/CampaignPushContent.md)
 - [CampaignPushContentTemplate](docs/CampaignPushContentTemplate.md)
 - [CampaignPushContentText](docs/CampaignPushContentText.md)
 - [CampaignPushScheduleRequest](docs/CampaignPushScheduleRequest.md)
 - [CampaignPushSendRequest](docs/CampaignPushSendRequest.md)
 - [CampaignScheduleDate](docs/CampaignScheduleDate.md)
 - [CampaignSentLast30Days](docs/CampaignSentLast30Days.md)
 - [CampaignSentLast30DaysErrors](docs/CampaignSentLast30DaysErrors.md)
 - [CampaignSmartSmsHtml](docs/CampaignSmartSmsHtml.md)
 - [CampaignSmartSmsImport](docs/CampaignSmartSmsImport.md)
 - [CampaignSmartSmsOptions](docs/CampaignSmartSmsOptions.md)
 - [CampaignSmartSmsPageContent](docs/CampaignSmartSmsPageContent.md)
 - [CampaignSmartSmsRedirect](docs/CampaignSmartSmsRedirect.md)
 - [CampaignSmartSmsScheduleRequest](docs/CampaignSmartSmsScheduleRequest.md)
 - [CampaignSmartSmsSendRequest](docs/CampaignSmartSmsSendRequest.md)
 - [CampaignSmsContent](docs/CampaignSmsContent.md)
 - [CampaignSmsContentTemplate](docs/CampaignSmsContentTemplate.md)
 - [CampaignSmsContentText](docs/CampaignSmsContentText.md)
 - [CampaignSmsOptions](docs/CampaignSmsOptions.md)
 - [CampaignSmsScheduleRequest](docs/CampaignSmsScheduleRequest.md)
 - [CampaignSmsSendRequest](docs/CampaignSmsSendRequest.md)
 - [CampaignVoiceScheduleRequest](docs/CampaignVoiceScheduleRequest.md)
 - [CampaignVoiceSendRequest](docs/CampaignVoiceSendRequest.md)
 - [CampaignWebPushScheduleRequest](docs/CampaignWebPushScheduleRequest.md)
 - [CampaignWebPushSendRequest](docs/CampaignWebPushSendRequest.md)
 - [CampaignsCollection](docs/CampaignsCollection.md)
 - [Cart](docs/Cart.md)
 - [CartPatchRequest](docs/CartPatchRequest.md)
 - [Catalog](docs/Catalog.md)
 - [CatalogCollection](docs/CatalogCollection.md)
 - [CatalogPost](docs/CatalogPost.md)
 - [CatalogPostRequest](docs/CatalogPostRequest.md)
 - [CellphoneSender](docs/CellphoneSender.md)
 - [CellphoneSenderCollection](docs/CellphoneSenderCollection.md)
 - [CellphoneSenderPost](docs/CellphoneSenderPost.md)
 - [ClientAlreadyEnabled](docs/ClientAlreadyEnabled.md)
 - [ClientAlreadyEnabledErrors](docs/ClientAlreadyEnabledErrors.md)
 - [ClientIsBeingEnabled](docs/ClientIsBeingEnabled.md)
 - [ClientIsBeingEnabledErrors](docs/ClientIsBeingEnabledErrors.md)
 - [CnameExists](docs/CnameExists.md)
 - [CnameExistsErrors](docs/CnameExistsErrors.md)
 - [ComplexContact](docs/ComplexContact.md)
 - [ComplexContactAllOf](docs/ComplexContactAllOf.md)
 - [ComplexContactAllOfEmailStats](docs/ComplexContactAllOfEmailStats.md)
 - [ComplexContactAllOfPushStats](docs/ComplexContactAllOfPushStats.md)
 - [ComplexContactAllOfSmsStats](docs/ComplexContactAllOfSmsStats.md)
 - [ComplexContactAllOfVoiceStats](docs/ComplexContactAllOfVoiceStats.md)
 - [ComplexContactAllOfWebpushStats](docs/ComplexContactAllOfWebpushStats.md)
 - [ComplexField](docs/ComplexField.md)
 - [ComplexFieldAllOf](docs/ComplexFieldAllOf.md)
 - [ComplexList](docs/ComplexList.md)
 - [ComplexListAllOf](docs/ComplexListAllOf.md)
 - [ComplexListAllOfStats](docs/ComplexListAllOfStats.md)
 - [ComplexUser](docs/ComplexUser.md)
 - [ComplexUserAllOf](docs/ComplexUserAllOf.md)
 - [ComplexUserPost](docs/ComplexUserPost.md)
 - [Conflict](docs/Conflict.md)
 - [ConflictAllOf](docs/ConflictAllOf.md)
 - [ConnectedSitesDomain](docs/ConnectedSitesDomain.md)
 - [ConnectedSitesDomainDetail](docs/ConnectedSitesDomainDetail.md)
 - [ConnectedSitesEmbedForm](docs/ConnectedSitesEmbedForm.md)
 - [ConnectedSitesGeneralProductAppDetail](docs/ConnectedSitesGeneralProductAppDetail.md)
 - [ConnectedSitesGeneralProductAppDetailGlobal](docs/ConnectedSitesGeneralProductAppDetailGlobal.md)
 - [ConnectedSitesGeneralProductFormDetail](docs/ConnectedSitesGeneralProductFormDetail.md)
 - [ConnectedSitesGeneralProductFormDetailGlobal](docs/ConnectedSitesGeneralProductFormDetailGlobal.md)
 - [ConnectedSitesGeneralProductTEDetailGlobal](docs/ConnectedSitesGeneralProductTEDetailGlobal.md)
 - [ConnectedSitesProductEmbedFormDetail](docs/ConnectedSitesProductEmbedFormDetail.md)
 - [ConnectedSitesProducts](docs/ConnectedSitesProducts.md)
 - [Contact](docs/Contact.md)
 - [Contact1](docs/Contact1.md)
 - [Contact2](docs/Contact2.md)
 - [ContactActivity](docs/ContactActivity.md)
 - [ContactActivityAbstractActionsWithAutomations](docs/ContactActivityAbstractActionsWithAutomations.md)
 - [ContactActivityAbstractActionsWithCampaign](docs/ContactActivityAbstractActionsWithCampaign.md)
 - [ContactActivityAbstractActionsWithData](docs/ContactActivityAbstractActionsWithData.md)
 - [ContactActivityAbstractActionsWithTags](docs/ContactActivityAbstractActionsWithTags.md)
 - [ContactActivityClick](docs/ContactActivityClick.md)
 - [ContactActivityClickAllOf](docs/ContactActivityClickAllOf.md)
 - [ContactActivityClickAllOfActionData](docs/ContactActivityClickAllOfActionData.md)
 - [ContactAutomationsActivity](docs/ContactAutomationsActivity.md)
 - [ContactAutomationsActivityAllOf](docs/ContactAutomationsActivityAllOf.md)
 - [ContactAutomationsActivityAllOfActionData](docs/ContactAutomationsActivityAllOfActionData.md)
 - [ContactBaseExtra](docs/ContactBaseExtra.md)
 - [ContactBaseExtraBulk](docs/ContactBaseExtraBulk.md)
 - [ContactBaseExtraFull](docs/ContactBaseExtraFull.md)
 - [ContactBaseExtraPost](docs/ContactBaseExtraPost.md)
 - [ContactBaseFieldsBulkSchema](docs/ContactBaseFieldsBulkSchema.md)
 - [ContactBaseFieldsBulkSchemaBase](docs/ContactBaseFieldsBulkSchemaBase.md)
 - [ContactBaseFieldsPostSchema](docs/ContactBaseFieldsPostSchema.md)
 - [ContactBaseFieldsPostSchemaBase](docs/ContactBaseFieldsPostSchemaBase.md)
 - [ContactBaseFieldsSchema](docs/ContactBaseFieldsSchema.md)
 - [ContactBaseFieldsSchemaBase](docs/ContactBaseFieldsSchemaBase.md)
 - [ContactBaseFieldsWithIdSchema](docs/ContactBaseFieldsWithIdSchema.md)
 - [ContactBaseFieldsWithIdSchemaBase](docs/ContactBaseFieldsWithIdSchemaBase.md)
 - [ContactBaseStatusExtra](docs/ContactBaseStatusExtra.md)
 - [ContactBaseStatusExtraBulk](docs/ContactBaseStatusExtraBulk.md)
 - [ContactBaseStatusExtraNoRemoved](docs/ContactBaseStatusExtraNoRemoved.md)
 - [ContactBaseWithStatusFieldsBulkSchema](docs/ContactBaseWithStatusFieldsBulkSchema.md)
 - [ContactBaseWithStatusFieldsNoTokensSchema](docs/ContactBaseWithStatusFieldsNoTokensSchema.md)
 - [ContactBaseWithStatusFieldsNoTokensSchemaBase](docs/ContactBaseWithStatusFieldsNoTokensSchemaBase.md)
 - [ContactBaseWithStatusFieldsSchema](docs/ContactBaseWithStatusFieldsSchema.md)
 - [ContactBaseWithStatusFieldsSchemaBase](docs/ContactBaseWithStatusFieldsSchemaBase.md)
 - [ContactBaseWithStatusNoRemovedFieldsSchema](docs/ContactBaseWithStatusNoRemovedFieldsSchema.md)
 - [ContactBaseWithStatusNoRemovedFieldsSchemaBase](docs/ContactBaseWithStatusNoRemovedFieldsSchemaBase.md)
 - [ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner](docs/ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner.md)
 - [ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner](docs/ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner.md)
 - [ContactBulk](docs/ContactBulk.md)
 - [ContactBulkFile](docs/ContactBulkFile.md)
 - [ContactBulkFileAllOf](docs/ContactBulkFileAllOf.md)
 - [ContactBulkFileAllOf1](docs/ContactBulkFileAllOf1.md)
 - [ContactBulkFileAllOf2](docs/ContactBulkFileAllOf2.md)
 - [ContactBulkFileAllOf3](docs/ContactBulkFileAllOf3.md)
 - [ContactCampaignActivity](docs/ContactCampaignActivity.md)
 - [ContactCampaignActivityAllOf](docs/ContactCampaignActivityAllOf.md)
 - [ContactCampaignActivityAllOfActionData](docs/ContactCampaignActivityAllOfActionData.md)
 - [ContactCollection](docs/ContactCollection.md)
 - [ContactExportRequest](docs/ContactExportRequest.md)
 - [ContactExtraFieldCellphone](docs/ContactExtraFieldCellphone.md)
 - [ContactExtraFieldCellphoneBulk](docs/ContactExtraFieldCellphoneBulk.md)
 - [ContactExtraFieldDate](docs/ContactExtraFieldDate.md)
 - [ContactExtraFieldEmail](docs/ContactExtraFieldEmail.md)
 - [ContactExtraFieldEmailBulk](docs/ContactExtraFieldEmailBulk.md)
 - [ContactExtraFieldNumber](docs/ContactExtraFieldNumber.md)
 - [ContactExtraFieldOptions](docs/ContactExtraFieldOptions.md)
 - [ContactExtraFieldPhone](docs/ContactExtraFieldPhone.md)
 - [ContactExtraFieldPhoneBulk](docs/ContactExtraFieldPhoneBulk.md)
 - [ContactExtraFieldText](docs/ContactExtraFieldText.md)
 - [ContactExtraFields](docs/ContactExtraFields.md)
 - [ContactExtraFieldsBulk](docs/ContactExtraFieldsBulk.md)
 - [ContactExtraFieldsBulkSchema](docs/ContactExtraFieldsBulkSchema.md)
 - [ContactExtraFieldsSchema](docs/ContactExtraFieldsSchema.md)
 - [ContactFieldMappingFileBulkSchema](docs/ContactFieldMappingFileBulkSchema.md)
 - [ContactForgetRequest](docs/ContactForgetRequest.md)
 - [ContactInsideBase](docs/ContactInsideBase.md)
 - [ContactInsideBaseBulk](docs/ContactInsideBaseBulk.md)
 - [ContactInsideBasePost](docs/ContactInsideBasePost.md)
 - [ContactInsideBaseWithId](docs/ContactInsideBaseWithId.md)
 - [ContactOtherActivity](docs/ContactOtherActivity.md)
 - [ContactSearchResponse](docs/ContactSearchResponse.md)
 - [ContactStatusFieldsBulkSchema](docs/ContactStatusFieldsBulkSchema.md)
 - [ContactStatusFieldsSchema](docs/ContactStatusFieldsSchema.md)
 - [ContactTagActivity](docs/ContactTagActivity.md)
 - [ContactTagActivityAllOf](docs/ContactTagActivityAllOf.md)
 - [ContactTagActivityAllOfActionData](docs/ContactTagActivityAllOfActionData.md)
 - [ContactTags](docs/ContactTags.md)
 - [ContactTagsBulk](docs/ContactTagsBulk.md)
 - [ContactsActionUpdateContactsSchema](docs/ContactsActionUpdateContactsSchema.md)
 - [ContentVoice](docs/ContentVoice.md)
 - [ContentVoiceAudio](docs/ContentVoiceAudio.md)
 - [ContentVoicePatch](docs/ContentVoicePatch.md)
 - [ContentVoiceTemplate](docs/ContentVoiceTemplate.md)
 - [Country](docs/Country.md)
 - [CountryCollection](docs/CountryCollection.md)
 - [CreateCartResponse](docs/CreateCartResponse.md)
 - [CreateContactResponse](docs/CreateContactResponse.md)
 - [CreateOrder](docs/CreateOrder.md)
 - [CreateOrderResponse](docs/CreateOrderResponse.md)
 - [CreateSuppressionListRequest](docs/CreateSuppressionListRequest.md)
 - [DeactivateContactsAll](docs/DeactivateContactsAll.md)
 - [DeactivateContactsMany](docs/DeactivateContactsMany.md)
 - [DeactivateContactsRequest](docs/DeactivateContactsRequest.md)
 - [DeleteCampaignsConflict](docs/DeleteCampaignsConflict.md)
 - [DeleteFieldsConflict](docs/DeleteFieldsConflict.md)
 - [DeleteListsConflict](docs/DeleteListsConflict.md)
 - [DeleteListsConflictsErrors](docs/DeleteListsConflictsErrors.md)
 - [DeleteSegmentsConflict](docs/DeleteSegmentsConflict.md)
 - [DeleteSegmentsConflictsErrors](docs/DeleteSegmentsConflictsErrors.md)
 - [DeleteSuppressionListConflictsErrors](docs/DeleteSuppressionListConflictsErrors.md)
 - [DetachByContacts](docs/DetachByContacts.md)
 - [DetachBySegment](docs/DetachBySegment.md)
 - [DetachTagRequest](docs/DetachTagRequest.md)
 - [Domain](docs/Domain.md)
 - [DomainAlreadyDefined](docs/DomainAlreadyDefined.md)
 - [DomainAlreadyDefinedErrors](docs/DomainAlreadyDefinedErrors.md)
 - [DomainCollection](docs/DomainCollection.md)
 - [DomainListRequired](docs/DomainListRequired.md)
 - [DomainListRequiredErrors](docs/DomainListRequiredErrors.md)
 - [EmailBouncesCampaignFields](docs/EmailBouncesCampaignFields.md)
 - [EmailBouncesListStatsFields](docs/EmailBouncesListStatsFields.md)
 - [EmailCampaignCreate](docs/EmailCampaignCreate.md)
 - [EmailCampaignPatch](docs/EmailCampaignPatch.md)
 - [EmailCampaignTemplate](docs/EmailCampaignTemplate.md)
 - [EmailCampaignTemplateAllOf](docs/EmailCampaignTemplateAllOf.md)
 - [EmailCampaignTemplateAllOfReplyToData](docs/EmailCampaignTemplateAllOfReplyToData.md)
 - [EmailCampaignTemplateAllOfSenderData](docs/EmailCampaignTemplateAllOfSenderData.md)
 - [EmailClicksByContactCampaignFields](docs/EmailClicksByContactCampaignFields.md)
 - [EmailClicksByContactListStatsFields](docs/EmailClicksByContactListStatsFields.md)
 - [EmailClicksByUrlCampaignFields](docs/EmailClicksByUrlCampaignFields.md)
 - [EmailClicksByUrlListStatsFields](docs/EmailClicksByUrlListStatsFields.md)
 - [EmailEventsCampaignFields](docs/EmailEventsCampaignFields.md)
 - [EmailEventsListStatsFields](docs/EmailEventsListStatsFields.md)
 - [EmailReport](docs/EmailReport.md)
 - [EmailReportAllOf](docs/EmailReportAllOf.md)
 - [EmailReportByDate](docs/EmailReportByDate.md)
 - [EmailReportByDateDateInner](docs/EmailReportByDateDateInner.md)
 - [EmailReportByDomain](docs/EmailReportByDomain.md)
 - [EmailReportByDomainDomainInner](docs/EmailReportByDomainDomainInner.md)
 - [EmailReportByEcommerce](docs/EmailReportByEcommerce.md)
 - [EmailReportByEcommerceEcommerce](docs/EmailReportByEcommerceEcommerce.md)
 - [EmailReportByHour](docs/EmailReportByHour.md)
 - [EmailReportByHourHourInner](docs/EmailReportByHourHourInner.md)
 - [EmailReportByLocation](docs/EmailReportByLocation.md)
 - [EmailReportByLocationLocationInner](docs/EmailReportByLocationLocationInner.md)
 - [EmailReportByReader](docs/EmailReportByReader.md)
 - [EmailReportByReaderReaderInner](docs/EmailReportByReaderReaderInner.md)
 - [EmailReportByUrl](docs/EmailReportByUrl.md)
 - [EmailReportByUrlUrlInner](docs/EmailReportByUrlUrlInner.md)
 - [EmailReportByWeekday](docs/EmailReportByWeekday.md)
 - [EmailReportByWeekdayWeekdayInner](docs/EmailReportByWeekdayWeekdayInner.md)
 - [EmailReportOverall](docs/EmailReportOverall.md)
 - [EmailReportOverallOverall](docs/EmailReportOverallOverall.md)
 - [EmailRssCampaignCreate](docs/EmailRssCampaignCreate.md)
 - [EmailSendSegment](docs/EmailSendSegment.md)
 - [EmailSender](docs/EmailSender.md)
 - [EmailSenderAllOf](docs/EmailSenderAllOf.md)
 - [EmailSenderCollection](docs/EmailSenderCollection.md)
 - [EmailSenderPost](docs/EmailSenderPost.md)
 - [EmailSenderPutRequest](docs/EmailSenderPutRequest.md)
 - [EmailUnsubscriptionsCampaignFields](docs/EmailUnsubscriptionsCampaignFields.md)
 - [EmailUnsubscriptionsListStatsFields](docs/EmailUnsubscriptionsListStatsFields.md)
 - [EnableTeConflict](docs/EnableTeConflict.md)
 - [EnableTeConflictsErrors](docs/EnableTeConflictsErrors.md)
 - [EnableTeRequest](docs/EnableTeRequest.md)
 - [EnableTransactionalConflict](docs/EnableTransactionalConflict.md)
 - [EnableTransactionalConflictsErrors](docs/EnableTransactionalConflictsErrors.md)
 - [ExportContactsWebhookData](docs/ExportContactsWebhookData.md)
 - [ExportReportWebhookData](docs/ExportReportWebhookData.md)
 - [Field](docs/Field.md)
 - [FieldInUse](docs/FieldInUse.md)
 - [FieldInUseErrors](docs/FieldInUseErrors.md)
 - [FieldInUseErrorsFieldInUseData](docs/FieldInUseErrorsFieldInUseData.md)
 - [FieldOption](docs/FieldOption.md)
 - [FieldOptionPost](docs/FieldOptionPost.md)
 - [FieldOptionsCollection](docs/FieldOptionsCollection.md)
 - [Forbidden](docs/Forbidden.md)
 - [Form](docs/Form.md)
 - [GeneralInfo](docs/GeneralInfo.md)
 - [GeneralInfoAllOf](docs/GeneralInfoAllOf.md)
 - [GeneralInfoAllOfGeneralInfo](docs/GeneralInfoAllOfGeneralInfo.md)
 - [GenerateEmailBouncesReport](docs/GenerateEmailBouncesReport.md)
 - [GenerateEmailClicksByContactReport](docs/GenerateEmailClicksByContactReport.md)
 - [GenerateEmailClicksByUrlReport](docs/GenerateEmailClicksByUrlReport.md)
 - [GenerateEmailEventsReport](docs/GenerateEmailEventsReport.md)
 - [GenerateEmailUnsubscriptionsReport](docs/GenerateEmailUnsubscriptionsReport.md)
 - [GenerateFormAnswersReport](docs/GenerateFormAnswersReport.md)
 - [GenerateSendsReport](docs/GenerateSendsReport.md)
 - [GenerateSmsBouncesReport](docs/GenerateSmsBouncesReport.md)
 - [GenerateSmsEventsReport](docs/GenerateSmsEventsReport.md)
 - [GenerateSubscriptionsReport](docs/GenerateSubscriptionsReport.md)
 - [GenerateUnsubscriptionsReport](docs/GenerateUnsubscriptionsReport.md)
 - [GetAllContactsExtraFieldIdParameter](docs/GetAllContactsExtraFieldIdParameter.md)
 - [GetAllProductsCustomAttributesParameter](docs/GetAllProductsCustomAttributesParameter.md)
 - [Goal](docs/Goal.md)
 - [GoalAutommaticInfo](docs/GoalAutommaticInfo.md)
 - [GoalCollection](docs/GoalCollection.md)
 - [GoalInfo](docs/GoalInfo.md)
 - [GoalManualInfo](docs/GoalManualInfo.md)
 - [GoalTimeInfo](docs/GoalTimeInfo.md)
 - [HasAutomations](docs/HasAutomations.md)
 - [HasAutomationsErrors](docs/HasAutomationsErrors.md)
 - [HasCampaignsLastThirtyDays](docs/HasCampaignsLastThirtyDays.md)
 - [HasCampaignsLastThirtyDaysErrors](docs/HasCampaignsLastThirtyDaysErrors.md)
 - [HasPushApp](docs/HasPushApp.md)
 - [HasPushAppErrors](docs/HasPushAppErrors.md)
 - [HasQueuedCampaigns](docs/HasQueuedCampaigns.md)
 - [HasQueuedCampaignsErrors](docs/HasQueuedCampaignsErrors.md)
 - [HasQueuedOperations](docs/HasQueuedOperations.md)
 - [HasQueuedOperationsErrors](docs/HasQueuedOperationsErrors.md)
 - [HasWebPushSite](docs/HasWebPushSite.md)
 - [HasWebPushSiteErrors](docs/HasWebPushSiteErrors.md)
 - [HashcodeCampaign](docs/HashcodeCampaign.md)
 - [HeaderFooter](docs/HeaderFooter.md)
 - [HeaderFooterFooterLinks](docs/HeaderFooterFooterLinks.md)
 - [HeaderFooterHeaderLinks](docs/HeaderFooterHeaderLinks.md)
 - [HeaderFooterTemplate](docs/HeaderFooterTemplate.md)
 - [ImportBulkFileRequest](docs/ImportBulkFileRequest.md)
 - [ImportBulkFileRequestSchema](docs/ImportBulkFileRequestSchema.md)
 - [ImportBulkFileRequestSchemaFile](docs/ImportBulkFileRequestSchemaFile.md)
 - [ImportBulkRequest](docs/ImportBulkRequest.md)
 - [ImportContactsWebhookData](docs/ImportContactsWebhookData.md)
 - [ImportOrdersBulkBulkRequest](docs/ImportOrdersBulkBulkRequest.md)
 - [ImportOrdersBulkBulkRequestItems](docs/ImportOrdersBulkBulkRequestItems.md)
 - [InternalServerError](docs/InternalServerError.md)
 - [InvalidSegmentType](docs/InvalidSegmentType.md)
 - [InvalidSegmentTypeErrors](docs/InvalidSegmentTypeErrors.md)
 - [Language](docs/Language.md)
 - [LimitContactsActionSend](docs/LimitContactsActionSend.md)
 - [LimitContactsPercentActionSend](docs/LimitContactsPercentActionSend.md)
 - [LimitContactsValueActionSend](docs/LimitContactsValueActionSend.md)
 - [LimitHourActionSend](docs/LimitHourActionSend.md)
 - [LimitHourActionSendLimitHour](docs/LimitHourActionSendLimitHour.md)
 - [LimitSpeedActionSend](docs/LimitSpeedActionSend.md)
 - [ListCollection](docs/ListCollection.md)
 - [ListCollection1](docs/ListCollection1.md)
 - [ListLimitReached](docs/ListLimitReached.md)
 - [ListLimitReachedErrors](docs/ListLimitReachedErrors.md)
 - [MessageWebPush](docs/MessageWebPush.md)
 - [MessageWebPushPost](docs/MessageWebPushPost.md)
 - [MessageWebPushRss](docs/MessageWebPushRss.md)
 - [ModelList](docs/ModelList.md)
 - [ModuleInfo](docs/ModuleInfo.md)
 - [ModuleInfoModuleInfo](docs/ModuleInfoModuleInfo.md)
 - [ModuleInfoModuleInfoTe](docs/ModuleInfoModuleInfoTe.md)
 - [MyAccount](docs/MyAccount.md)
 - [NameAlreadyExists](docs/NameAlreadyExists.md)
 - [NameAlreadyExistsErrors](docs/NameAlreadyExistsErrors.md)
 - [NotFound](docs/NotFound.md)
 - [NotifyUserIdArrayActionSend](docs/NotifyUserIdArrayActionSend.md)
 - [Now](docs/Now.md)
 - [NumericCellphoneSender](docs/NumericCellphoneSender.md)
 - [NumericCellphoneSenderPost](docs/NumericCellphoneSenderPost.md)
 - [NumericCellphoneSenderPostAllOf](docs/NumericCellphoneSenderPostAllOf.md)
 - [OLimitContactsActionSend](docs/OLimitContactsActionSend.md)
 - [OSegmentsActionSend](docs/OSegmentsActionSend.md)
 - [OSegmentsWithoutContactActionSend](docs/OSegmentsWithoutContactActionSend.md)
 - [Operation](docs/Operation.md)
 - [OperationActionRequest](docs/OperationActionRequest.md)
 - [OperationActionResponse](docs/OperationActionResponse.md)
 - [OperationActionResponseError](docs/OperationActionResponseError.md)
 - [OperationOperationData](docs/OperationOperationData.md)
 - [OperationsCollection](docs/OperationsCollection.md)
 - [Order](docs/Order.md)
 - [OrderPatchRequest](docs/OrderPatchRequest.md)
 - [Overall](docs/Overall.md)
 - [OverallOverall](docs/OverallOverall.md)
 - [PatchRequestBaseField](docs/PatchRequestBaseField.md)
 - [PatchRequestField](docs/PatchRequestField.md)
 - [PatchRequestList](docs/PatchRequestList.md)
 - [PatchVoiceCampaign200Response](docs/PatchVoiceCampaign200Response.md)
 - [PayloadTooLarge](docs/PayloadTooLarge.md)
 - [PhoneCampaignTemplate](docs/PhoneCampaignTemplate.md)
 - [PhoneCampaignTemplateAllOf](docs/PhoneCampaignTemplateAllOf.md)
 - [PhoneReport](docs/PhoneReport.md)
 - [PhoneReportAllOf](docs/PhoneReportAllOf.md)
 - [PhoneReportAllOfNetworks](docs/PhoneReportAllOfNetworks.md)
 - [PhoneSender](docs/PhoneSender.md)
 - [PhoneSenderAllOf](docs/PhoneSenderAllOf.md)
 - [PhoneSenderCollection](docs/PhoneSenderCollection.md)
 - [PhoneSenderPost](docs/PhoneSenderPost.md)
 - [Ping](docs/Ping.md)
 - [PlanInfo](docs/PlanInfo.md)
 - [PlanInfoPlanInfo](docs/PlanInfoPlanInfo.md)
 - [PostCNameConflict](docs/PostCNameConflict.md)
 - [PostContactsConflict](docs/PostContactsConflict.md)
 - [PostListsConflict](docs/PostListsConflict.md)
 - [PostProductsConflict](docs/PostProductsConflict.md)
 - [PostRequestList](docs/PostRequestList.md)
 - [PostWebpushSiteConflict](docs/PostWebpushSiteConflict.md)
 - [Product](docs/Product.md)
 - [ProductAllOf](docs/ProductAllOf.md)
 - [ProductAlreadyExists](docs/ProductAlreadyExists.md)
 - [ProductAlreadyExistsErrors](docs/ProductAlreadyExistsErrors.md)
 - [ProductBulkRequest](docs/ProductBulkRequest.md)
 - [ProductCollection](docs/ProductCollection.md)
 - [ProductCustomAttributes](docs/ProductCustomAttributes.md)
 - [ProductPatchRequest](docs/ProductPatchRequest.md)
 - [ProductPatchRequestRelatedProducts](docs/ProductPatchRequestRelatedProducts.md)
 - [ProductPostRequest](docs/ProductPostRequest.md)
 - [PushCampaignPatchRequest](docs/PushCampaignPatchRequest.md)
 - [PushCampaignPatchRequestContent](docs/PushCampaignPatchRequestContent.md)
 - [PushCampaignPatchRequestGeoOptions](docs/PushCampaignPatchRequestGeoOptions.md)
 - [PushCampaignPostRequest](docs/PushCampaignPostRequest.md)
 - [PushCampaignPostRequestActions](docs/PushCampaignPostRequestActions.md)
 - [PushCampaignPostRequestGeoOptions](docs/PushCampaignPostRequestGeoOptions.md)
 - [PushCampaignPostRequestNotificationOptions](docs/PushCampaignPostRequestNotificationOptions.md)
 - [PushEvent](docs/PushEvent.md)
 - [PushNotificationSoundSchema](docs/PushNotificationSoundSchema.md)
 - [PushNotificationSoundSchemaDefault](docs/PushNotificationSoundSchemaDefault.md)
 - [PushNotificationSoundSchemaNone](docs/PushNotificationSoundSchemaNone.md)
 - [PushNotificationSoundSchemaUrl](docs/PushNotificationSoundSchemaUrl.md)
 - [PushReport](docs/PushReport.md)
 - [PushReportAllOf](docs/PushReportAllOf.md)
 - [PushResponse](docs/PushResponse.md)
 - [PushToken](docs/PushToken.md)
 - [PushTokenTwoStepsData](docs/PushTokenTwoStepsData.md)
 - [PushVersions](docs/PushVersions.md)
 - [PushVersionsVersionsInner](docs/PushVersionsVersionsInner.md)
 - [RemoveRequest](docs/RemoveRequest.md)
 - [RemoveResponse](docs/RemoveResponse.md)
 - [RemoveResponseErrors](docs/RemoveResponseErrors.md)
 - [ReportCampaignsAll](docs/ReportCampaignsAll.md)
 - [ReportCampaignsGroup](docs/ReportCampaignsGroup.md)
 - [ReportCampaignsLast](docs/ReportCampaignsLast.md)
 - [ReportCampaignsSpecific](docs/ReportCampaignsSpecific.md)
 - [RequestEntityTooLarge](docs/RequestEntityTooLarge.md)
 - [RequestItemsUnsubscribe](docs/RequestItemsUnsubscribe.md)
 - [RequestItemsUnsubscribeAllOf](docs/RequestItemsUnsubscribeAllOf.md)
 - [RequestTimeout](docs/RequestTimeout.md)
 - [SavedSegment](docs/SavedSegment.md)
 - [SavedSegmentAllOf](docs/SavedSegmentAllOf.md)
 - [SavedSegmentAllOf1](docs/SavedSegmentAllOf1.md)
 - [SavedSegmentAllOf1SegmentFilter](docs/SavedSegmentAllOf1SegmentFilter.md)
 - [SavedSegmentAllOf1SegmentFilterSegmentFilterArray](docs/SavedSegmentAllOf1SegmentFilterSegmentFilterArray.md)
 - [SearchContacts200Response](docs/SearchContacts200Response.md)
 - [Segment](docs/Segment.md)
 - [SegmentCollection](docs/SegmentCollection.md)
 - [SegmentsActionSend](docs/SegmentsActionSend.md)
 - [SegmentsWithoutContactActionSend](docs/SegmentsWithoutContactActionSend.md)
 - [SendContact](docs/SendContact.md)
 - [SendContactCellphone](docs/SendContactCellphone.md)
 - [SendEmailContact](docs/SendEmailContact.md)
 - [SendNone](docs/SendNone.md)
 - [SendPush](docs/SendPush.md)
 - [SendPushAllOf](docs/SendPushAllOf.md)
 - [SendSegment](docs/SendSegment.md)
 - [SendSmartSms](docs/SendSmartSms.md)
 - [SendSmartSmsAllOf](docs/SendSmartSmsAllOf.md)
 - [SendSmartSmsAllOf1](docs/SendSmartSmsAllOf1.md)
 - [SendSmartSmsAllOf2](docs/SendSmartSmsAllOf2.md)
 - [SendSms](docs/SendSms.md)
 - [SendSmsAllOf](docs/SendSmsAllOf.md)
 - [SendSmsAllOf1](docs/SendSmsAllOf1.md)
 - [SendWebPush](docs/SendWebPush.md)
 - [SendWebPushAllOf](docs/SendWebPushAllOf.md)
 - [SendsCampaignFields](docs/SendsCampaignFields.md)
 - [ServiceUnavailable](docs/ServiceUnavailable.md)
 - [SingleCartObject](docs/SingleCartObject.md)
 - [SingleOrderObject](docs/SingleOrderObject.md)
 - [SmartSmsCampaign](docs/SmartSmsCampaign.md)
 - [SmartSmsCampaignCampaignContent](docs/SmartSmsCampaignCampaignContent.md)
 - [SmartSmsCampaignPatchRequest](docs/SmartSmsCampaignPatchRequest.md)
 - [SmartSmsCampaignPatchRequestCampaignContent](docs/SmartSmsCampaignPatchRequestCampaignContent.md)
 - [SmartSmsCampaignPatchRequestPageContent](docs/SmartSmsCampaignPatchRequestPageContent.md)
 - [SmartSmsSegmentsActionSend](docs/SmartSmsSegmentsActionSend.md)
 - [SmsBouncesCampaignFields](docs/SmsBouncesCampaignFields.md)
 - [SmsBouncesListStatsFields](docs/SmsBouncesListStatsFields.md)
 - [SmsCampaign](docs/SmsCampaign.md)
 - [SmsCampaignPatchRequest](docs/SmsCampaignPatchRequest.md)
 - [SmsCampaignPatchRequestContent](docs/SmsCampaignPatchRequestContent.md)
 - [SmsCampaignTemplate](docs/SmsCampaignTemplate.md)
 - [SmsCampaignTemplateAllOf](docs/SmsCampaignTemplateAllOf.md)
 - [SmsEventsCampaignFields](docs/SmsEventsCampaignFields.md)
 - [SmsEventsListStatsFields](docs/SmsEventsListStatsFields.md)
 - [SmsSegmentsActionSend](docs/SmsSegmentsActionSend.md)
 - [StartAutomationRequest](docs/StartAutomationRequest.md)
 - [StartAutomationResponse](docs/StartAutomationResponse.md)
 - [SubscriptionsListStatsFields](docs/SubscriptionsListStatsFields.md)
 - [SuppressionList](docs/SuppressionList.md)
 - [SuppressionListItems](docs/SuppressionListItems.md)
 - [SuppressionTypeCellphone](docs/SuppressionTypeCellphone.md)
 - [SuppressionTypeCellphoneAllOf](docs/SuppressionTypeCellphoneAllOf.md)
 - [SuppressionTypeCellphoneAllOf1](docs/SuppressionTypeCellphoneAllOf1.md)
 - [SuppressionTypeEmail](docs/SuppressionTypeEmail.md)
 - [SuppressionTypeEmailAllOf](docs/SuppressionTypeEmailAllOf.md)
 - [SuppressionTypeEmailAllOf1](docs/SuppressionTypeEmailAllOf1.md)
 - [SuppressionTypeEmailDomain](docs/SuppressionTypeEmailDomain.md)
 - [SuppressionTypeEmailDomainAllOf](docs/SuppressionTypeEmailDomainAllOf.md)
 - [SuppressionTypeEmailDomainAllOf1](docs/SuppressionTypeEmailDomainAllOf1.md)
 - [SuppressionTypePhone](docs/SuppressionTypePhone.md)
 - [SuppressionTypePhoneAllOf](docs/SuppressionTypePhoneAllOf.md)
 - [SuppressionTypePhoneAllOf1](docs/SuppressionTypePhoneAllOf1.md)
 - [SuppressionTypeUserEmail](docs/SuppressionTypeUserEmail.md)
 - [SuppressionTypeUserEmailAllOf](docs/SuppressionTypeUserEmailAllOf.md)
 - [SuppressionTypeUserEmailAllOf1](docs/SuppressionTypeUserEmailAllOf1.md)
 - [Tag](docs/Tag.md)
 - [TagCollection](docs/TagCollection.md)
 - [TagCollection1](docs/TagCollection1.md)
 - [TagRequest](docs/TagRequest.md)
 - [TagSegment](docs/TagSegment.md)
 - [TagSegmentAllOf](docs/TagSegmentAllOf.md)
 - [TeResponse](docs/TeResponse.md)
 - [TeResponseAllOf](docs/TeResponseAllOf.md)
 - [TooManyRequests](docs/TooManyRequests.md)
 - [Unauthorized](docs/Unauthorized.md)
 - [UniqueFieldInUse](docs/UniqueFieldInUse.md)
 - [UniqueFieldInUseErrors](docs/UniqueFieldInUseErrors.md)
 - [UnprocessableEntity](docs/UnprocessableEntity.md)
 - [UnremovableEntry](docs/UnremovableEntry.md)
 - [UnremovableEntryErrors](docs/UnremovableEntryErrors.md)
 - [UnsubscriptionObject](docs/UnsubscriptionObject.md)
 - [UnsubscriptionsListStatsFields](docs/UnsubscriptionsListStatsFields.md)
 - [UpdateByContact](docs/UpdateByContact.md)
 - [UpdateBySegment](docs/UpdateBySegment.md)
 - [UpdateContactsRequest](docs/UpdateContactsRequest.md)
 - [UpdateForAll](docs/UpdateForAll.md)
 - [UsedInAutomations](docs/UsedInAutomations.md)
 - [UsedInAutomationsErrors](docs/UsedInAutomationsErrors.md)
 - [UsedInRecurringMessages](docs/UsedInRecurringMessages.md)
 - [UsedInRecurringMessagesErrors](docs/UsedInRecurringMessagesErrors.md)
 - [User](docs/User.md)
 - [UserAllOf](docs/UserAllOf.md)
 - [UserCollection](docs/UserCollection.md)
 - [UserPost](docs/UserPost.md)
 - [UserPostAllOf](docs/UserPostAllOf.md)
 - [UserPostRequest](docs/UserPostRequest.md)
 - [UserPostRequestAllOf](docs/UserPostRequestAllOf.md)
 - [VoiceCampaign](docs/VoiceCampaign.md)
 - [VoiceCampaignAllOf](docs/VoiceCampaignAllOf.md)
 - [VoiceCampaignTemplate](docs/VoiceCampaignTemplate.md)
 - [VoiceCampaignTemplateAllOf](docs/VoiceCampaignTemplateAllOf.md)
 - [VoicePatchCampaign](docs/VoicePatchCampaign.md)
 - [VoicePatchCampaignAllOf](docs/VoicePatchCampaignAllOf.md)
 - [WebPushCampaign](docs/WebPushCampaign.md)
 - [WebPushPatchCampaign](docs/WebPushPatchCampaign.md)
 - [WebPushReport](docs/WebPushReport.md)
 - [WebPushReportBrowsersInner](docs/WebPushReportBrowsersInner.md)
 - [WebPushReportBrowsersInnerVersionsInner](docs/WebPushReportBrowsersInnerVersionsInner.md)
 - [WebPushReportBrowsersInnerVersionsInnerAllOf](docs/WebPushReportBrowsersInnerVersionsInnerAllOf.md)
 - [WebPushReportDevicesInner](docs/WebPushReportDevicesInner.md)
 - [WebPushReportDevicesInnerAllOf](docs/WebPushReportDevicesInnerAllOf.md)
 - [WebPushReportOperatingSystemsInner](docs/WebPushReportOperatingSystemsInner.md)
 - [WebPushReportOperatingSystemsInnerVersionsInner](docs/WebPushReportOperatingSystemsInnerVersionsInner.md)
 - [WebPushReportOperatingSystemsInnerVersionsInnerAllOf](docs/WebPushReportOperatingSystemsInnerVersionsInnerAllOf.md)
 - [WebPushReportUrlInner](docs/WebPushReportUrlInner.md)
 - [WebPushReportUrlInnerAllOf](docs/WebPushReportUrlInnerAllOf.md)
 - [WebPushRssCampaign](docs/WebPushRssCampaign.md)
 - [WebPushSite](docs/WebPushSite.md)
 - [WebPushStats](docs/WebPushStats.md)
 - [Webhook](docs/Webhook.md)
 - [WebhookActionSchema](docs/WebhookActionSchema.md)
 - [WebpushActionsInner](docs/WebpushActionsInner.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Apikey

- **Type**: API key
- **API key parameter name**: Apikey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



