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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner;
import org.egoi.client.model.ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner;
import org.egoi.client.model.Language;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


/**
 * Model tests for ContactBaseFieldsBulkSchemaBase
 */
public class ContactBaseFieldsBulkSchemaBaseTest {
    private final ContactBaseFieldsBulkSchemaBase model = new ContactBaseFieldsBulkSchemaBase();

    /**
     * Model tests for ContactBaseFieldsBulkSchemaBase
     */
    @Test
    public void testContactBaseFieldsBulkSchemaBase() {
        // TODO: test ContactBaseFieldsBulkSchemaBase
    }

    /**
     * Test the property 'contactId'
     */
    @Test
    public void contactIdTest() {
        // TODO: test contactId
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'consent'
     */
    @Test
    public void consentTest() {
        // TODO: test consent
    }

    /**
     * Test the property 'consentDate'
     */
    @Test
    public void consentDateTest() {
        // TODO: test consentDate
    }

    /**
     * Test the property 'subscriptionMethod'
     */
    @Test
    public void subscriptionMethodTest() {
        // TODO: test subscriptionMethod
    }

    /**
     * Test the property 'subscriptionDate'
     */
    @Test
    public void subscriptionDateTest() {
        // TODO: test subscriptionDate
    }

    /**
     * Test the property 'subscriptionForm'
     */
    @Test
    public void subscriptionFormTest() {
        // TODO: test subscriptionForm
    }

    /**
     * Test the property 'unsubscriptionMethod'
     */
    @Test
    public void unsubscriptionMethodTest() {
        // TODO: test unsubscriptionMethod
    }

    /**
     * Test the property 'unsubscriptionReason'
     */
    @Test
    public void unsubscriptionReasonTest() {
        // TODO: test unsubscriptionReason
    }

    /**
     * Test the property 'unsubscriptionObservation'
     */
    @Test
    public void unsubscriptionObservationTest() {
        // TODO: test unsubscriptionObservation
    }

    /**
     * Test the property 'unsubscriptionDate'
     */
    @Test
    public void unsubscriptionDateTest() {
        // TODO: test unsubscriptionDate
    }

    /**
     * Test the property 'changeDate'
     */
    @Test
    public void changeDateTest() {
        // TODO: test changeDate
    }

    /**
     * Test the property 'firstName'
     */
    @Test
    public void firstNameTest() {
        // TODO: test firstName
    }

    /**
     * Test the property 'lastName'
     */
    @Test
    public void lastNameTest() {
        // TODO: test lastName
    }

    /**
     * Test the property 'birthDate'
     */
    @Test
    public void birthDateTest() {
        // TODO: test birthDate
    }

    /**
     * Test the property 'language'
     */
    @Test
    public void languageTest() {
        // TODO: test language
    }

    /**
     * Test the property 'email'
     */
    @Test
    public void emailTest() {
        // TODO: test email
    }

    /**
     * Test the property 'emailStatus'
     */
    @Test
    public void emailStatusTest() {
        // TODO: test emailStatus
    }

    /**
     * Test the property 'cellphone'
     */
    @Test
    public void cellphoneTest() {
        // TODO: test cellphone
    }

    /**
     * Test the property 'cellphoneStatus'
     */
    @Test
    public void cellphoneStatusTest() {
        // TODO: test cellphoneStatus
    }

    /**
     * Test the property 'phone'
     */
    @Test
    public void phoneTest() {
        // TODO: test phone
    }

    /**
     * Test the property 'phoneStatus'
     */
    @Test
    public void phoneStatusTest() {
        // TODO: test phoneStatus
    }

    /**
     * Test the property 'pushTokenAndroid'
     */
    @Test
    public void pushTokenAndroidTest() {
        // TODO: test pushTokenAndroid
    }

    /**
     * Test the property 'pushTokenIos'
     */
    @Test
    public void pushTokenIosTest() {
        // TODO: test pushTokenIos
    }

}