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


package org.egoi.client.api;

import org.egoi.client.ApiException;
import org.egoi.client.model.AcceptedResponse;
import org.egoi.client.model.ActivateContactsRequest;
import org.egoi.client.model.ActivityCollection;
import org.egoi.client.model.AttachTagRequest;
import org.egoi.client.model.BadRequest;
import org.egoi.client.model.ComplexContact;
import org.egoi.client.model.Conflict;
import org.egoi.client.model.ContactBaseExtraPost;
import org.egoi.client.model.ContactBaseStatusExtraNoRemoved;
import org.egoi.client.model.ContactCollection;
import org.egoi.client.model.ContactExportRequest;
import org.egoi.client.model.ContactFieldIdBaseExtraPost;
import org.egoi.client.model.ContactForgetRequest;
import org.egoi.client.model.CreateContactResponse;
import org.egoi.client.model.DeactivateContactsRequest;
import org.egoi.client.model.DetachTagRequest;
import org.egoi.client.model.Forbidden;
import org.egoi.client.model.GetAllContactsExtraFieldIdParameter;
import org.egoi.client.model.ImportBulkFileRequest;
import org.egoi.client.model.InternalServerError;
import java.time.LocalDate;
import org.egoi.client.model.NotFound;
import java.time.OffsetDateTime;
import org.egoi.client.model.PostContactsConflict;
import org.egoi.client.model.RemoveRequest;
import org.egoi.client.model.RemoveResponse;
import org.egoi.client.model.RequestEntityTooLarge;
import org.egoi.client.model.RequestTimeout;
import org.egoi.client.model.SearchContacts200Response;
import org.egoi.client.model.ServiceUnavailable;
import org.egoi.client.model.StartAutomationRequest;
import org.egoi.client.model.StartAutomationResponse;
import org.egoi.client.model.TooManyRequests;
import org.egoi.client.model.Unauthorized;
import org.egoi.client.model.UnprocessableEntity;
import org.egoi.client.model.UpdateContactsRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Disabled
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    /**
     * Activate contacts
     *
     * Activates a collection of contacts (does not apply to removed contacts)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionActivateContactsTest() throws ApiException {
        Integer listId = null;
        ActivateContactsRequest activateContactsRequest = null;
        AcceptedResponse response = api.actionActivateContacts(listId, activateContactsRequest);
        // TODO: test validations
    }

    /**
     * Attach tag to contact
     *
     * Attaches a tag to the provided contacts.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionAttachTagTest() throws ApiException {
        Integer listId = null;
        AttachTagRequest attachTagRequest = null;
        AcceptedResponse response = api.actionAttachTag(listId, attachTagRequest);
        // TODO: test validations
    }

    /**
     * Deactivate contacts
     *
     * Deactivates a collection of contacts (does not apply to removed contacts)
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionDeactivateContactsTest() throws ApiException {
        Integer listId = null;
        DeactivateContactsRequest deactivateContactsRequest = null;
        AcceptedResponse response = api.actionDeactivateContacts(listId, deactivateContactsRequest);
        // TODO: test validations
    }

    /**
     * Detach tag to contact
     *
     * Detach a tag to the provided contacts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionDetachTagTest() throws ApiException {
        Integer listId = null;
        DetachTagRequest detachTagRequest = null;
        AcceptedResponse response = api.actionDetachTag(listId, detachTagRequest);
        // TODO: test validations
    }

    /**
     * Exports a list of contacts
     *
     * Exports a list of contacts to the desired callback url
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionExportContactsTest() throws ApiException {
        Integer listId = null;
        ContactExportRequest contactExportRequest = null;
        AcceptedResponse response = api.actionExportContacts(listId, contactExportRequest);
        // TODO: test validations
    }

    /**
     * Forget contacts
     *
     * Forgets a list of contacts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionForgetContactsTest() throws ApiException {
        Integer listId = null;
        ContactForgetRequest contactForgetRequest = null;
        AcceptedResponse response = api.actionForgetContacts(listId, contactForgetRequest);
        // TODO: test validations
    }

    /**
     * Import collection of contacts
     *
     * Imports a collection of contacts &lt;/br&gt;      **DISCLAIMER:** stream limits applied. [view here](#section/Stream-Limits &#39;Stream Limits&#39;)&lt;br&gt; ***Notes:***&lt;br&gt;Minimum of 2 contacts to use this method. [Use Create new contact method instead](#operation/createContact &#39;Create new contact&#39;)&lt;br&gt;It defaults to ***Bulk object*** import.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionImportBulkTest() throws ApiException {
        Integer listId = null;
        ImportBulkFileRequest importBulkFileRequest = null;
        AcceptedResponse response = api.actionImportBulk(listId, importBulkFileRequest);
        // TODO: test validations
    }

    /**
     * Start automation
     *
     * Start automation to the provided contacts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionStartAutomationTest() throws ApiException {
        Integer listId = null;
        StartAutomationRequest startAutomationRequest = null;
        StartAutomationResponse response = api.actionStartAutomation(listId, startAutomationRequest);
        // TODO: test validations
    }

    /**
     * Unsubscribes contacts
     *
     * Unsubscribes contacts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionUnsubscribeContactTest() throws ApiException {
        Integer listId = null;
        RemoveRequest removeRequest = null;
        RemoveResponse response = api.actionUnsubscribeContact(listId, removeRequest);
        // TODO: test validations
    }

    /**
     * Updates contacts
     *
     * Updates a collection of contacts (does not apply to removed contacts).      Note that all contacts will be updated with the same values and the existance of unique fields in the payload will trigger a 409 Conflict response.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void actionUpdateContactsTest() throws ApiException {
        Integer listId = null;
        UpdateContactsRequest updateContactsRequest = null;
        AcceptedResponse response = api.actionUpdateContacts(listId, updateContactsRequest);
        // TODO: test validations
    }

    /**
     * Create new contact
     *
     * Create a new contact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createContactTest() throws ApiException {
        Integer listId = null;
        ContactBaseExtraPost contactBaseExtraPost = null;
        CreateContactResponse response = api.createContact(listId, contactBaseExtraPost);
        // TODO: test validations
    }

    /**
     * Get all contact activities
     *
     * Returns all contact activities
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllContactActivitiesTest() throws ApiException {
        String contactId = null;
        Integer listId = null;
        Integer offset = null;
        Integer limit = null;
        OffsetDateTime dateMin = null;
        OffsetDateTime dateMax = null;
        String actionName = null;
        ActivityCollection response = api.getAllContactActivities(contactId, listId, offset, limit, dateMin, dateMax, actionName);
        // TODO: test validations
    }

    /**
     * Get all contacts
     *
     * Returns all contacts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllContactsTest() throws ApiException {
        Integer listId = null;
        Integer offset = null;
        Integer limit = null;
        String firstName = null;
        String lastName = null;
        String email = null;
        Boolean emailStatus = null;
        String cellphone = null;
        Boolean cellphoneStatus = null;
        String phone = null;
        Boolean phoneStatus = null;
        LocalDate birthDate = null;
        String language = null;
        GetAllContactsExtraFieldIdParameter extraFieldId = null;
        ContactCollection response = api.getAllContacts(listId, offset, limit, firstName, lastName, email, emailStatus, cellphone, cellphoneStatus, phone, phoneStatus, birthDate, language, extraFieldId);
        // TODO: test validations
    }

    /**
     * Get all contacts by Segment Id
     *
     * Returns all contacts filtered by Segment Id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllContactsBySegmentTest() throws ApiException {
        Integer listId = null;
        String segmentId = null;
        Integer offset = null;
        Integer limit = null;
        Boolean showRemoved = null;
        ContactCollection response = api.getAllContactsBySegment(listId, segmentId, offset, limit, showRemoved);
        // TODO: test validations
    }

    /**
     * Get contact
     *
     * Returns contact information given its ID
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContactTest() throws ApiException {
        String contactId = null;
        Integer listId = null;
        ComplexContact response = api.getContact(contactId, listId);
        // TODO: test validations
    }

    /**
     * Update a specific contact
     *
     * Update contact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void patchContactTest() throws ApiException {
        String contactId = null;
        Integer listId = null;
        ContactBaseStatusExtraNoRemoved contactBaseStatusExtraNoRemoved = null;
        CreateContactResponse response = api.patchContact(contactId, listId, contactBaseStatusExtraNoRemoved);
        // TODO: test validations
    }

    /**
     * Search contact
     *
     * Searches a contact across all lists and returns a collection of contacts found
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchContactsTest() throws ApiException {
        String contact = null;
        String type = null;
        SearchContacts200Response response = api.searchContacts(contact, type);
        // TODO: test validations
    }

    /**
     * Updates a contact by field
     *
     * Updates a contact by field, wich must be unique in list
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateContactByFieldTest() throws ApiException {
        Integer listId = null;
        ContactFieldIdBaseExtraPost contactFieldIdBaseExtraPost = null;
        CreateContactResponse response = api.updateContactByField(listId, contactFieldIdBaseExtraPost);
        // TODO: test validations
    }

}
