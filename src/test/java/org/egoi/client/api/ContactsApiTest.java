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


package org.egoi.client.api;

import org.egoi.client.ApiException;
import org.egoi.client.model.AcceptedResponse;
import org.egoi.client.model.ActivityCollection;
import org.egoi.client.model.AttachTagRequest;
import org.egoi.client.model.AttachTagResponse;
import org.egoi.client.model.BadRequest;
import org.egoi.client.model.ComplexContact;
import org.egoi.client.model.ContactBaseExtra;
import org.egoi.client.model.ContactBaseStatusExtra;
import org.egoi.client.model.ContactCollection;
import org.egoi.client.model.ContactExportRequest;
import org.egoi.client.model.CreateContactResponse;
import org.egoi.client.model.Forbidden;
import org.egoi.client.model.InternalServerError;
import org.egoi.client.model.NotFound;
import org.threeten.bp.OffsetDateTime;
import org.egoi.client.model.PostContactsConflict;
import org.egoi.client.model.RemoveRequest;
import org.egoi.client.model.RemoveResponse;
import org.egoi.client.model.StartAutomationRequest;
import org.egoi.client.model.StartAutomationResponse;
import org.egoi.client.model.Unauthorized;
import org.egoi.client.model.UnprocessableEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Ignore
public class ContactsApiTest {

    private final ContactsApi api = new ContactsApi();

    
    /**
     * Attach tag to contact
     *
     * Attaches a tag to the provided contacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void actionAttachTagTest() throws ApiException {
        Integer listId = null;
        AttachTagRequest attachTagRequest = null;
        AttachTagResponse response = api.actionAttachTag(listId, attachTagRequest);

        // TODO: test validations
    }
    
    /**
     * Detach tag to contact
     *
     * Detach a tag to the provided contacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void actionDetachTagTest() throws ApiException {
        Integer listId = null;
        AttachTagRequest attachTagRequest = null;
        AttachTagResponse response = api.actionDetachTag(listId, attachTagRequest);

        // TODO: test validations
    }
    
    /**
     * Exports a list of contacts
     *
     * Exports a list of contacts to the desired callback url
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void actionExportContactsTest() throws ApiException {
        Integer listId = null;
        ContactExportRequest contactExportRequest = null;
        AcceptedResponse response = api.actionExportContacts(listId, contactExportRequest);

        // TODO: test validations
    }
    
    /**
     * Start automation
     *
     * Start automation to the provided contacts
     *
     * @throws ApiException
     *          if the Api call fails
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void actionUnsubscribeContactTest() throws ApiException {
        Integer listId = null;
        RemoveRequest removeRequest = null;
        RemoveResponse response = api.actionUnsubscribeContact(listId, removeRequest);

        // TODO: test validations
    }
    
    /**
     * Create new contact
     *
     * Create a new contact
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createContactTest() throws ApiException {
        Integer listId = null;
        ContactBaseExtra contactBaseExtra = null;
        CreateContactResponse response = api.createContact(listId, contactBaseExtra);

        // TODO: test validations
    }
    
    /**
     * Get all contact activities
     *
     * Returns all contact activities
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllContactActivitiesTest() throws ApiException {
        String contactId = null;
        Integer listId = null;
        Integer offset = null;
        Integer limit = null;
        OffsetDateTime dateMin = null;
        OffsetDateTime dateMax = null;
        ActivityCollection response = api.getAllContactActivities(contactId, listId, offset, limit, dateMin, dateMax);

        // TODO: test validations
    }
    
    /**
     * Get all contacts
     *
     * Returns all contacts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllContactsTest() throws ApiException {
        Integer listId = null;
        Integer offset = null;
        Integer limit = null;
        ContactCollection response = api.getAllContacts(listId, offset, limit);

        // TODO: test validations
    }
    
    /**
     * Get contact
     *
     * Returns contact information given its ID
     *
     * @throws ApiException
     *          if the Api call fails
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
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void patchContactTest() throws ApiException {
        String contactId = null;
        Integer listId = null;
        ContactBaseStatusExtra contactBaseStatusExtra = null;
        CreateContactResponse response = api.patchContact(contactId, listId, contactBaseStatusExtra);

        // TODO: test validations
    }
    
}
