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
import org.egoi.client.model.ContactBaseWithStatusFieldsSchemaBasePushTokenAndroid;
import org.egoi.client.model.ContactBaseWithStatusFieldsSchemaBasePushTokenIos;
import org.egoi.client.model.Language;
import org.threeten.bp.LocalDate;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for ContactBaseWithStatusFieldsSchemaBase
 */
public class ContactBaseWithStatusFieldsSchemaBaseTest {
    private final ContactBaseWithStatusFieldsSchemaBase model = new ContactBaseWithStatusFieldsSchemaBase();

    /**
     * Model tests for ContactBaseWithStatusFieldsSchemaBase
     */
    @Test
    public void testContactBaseWithStatusFieldsSchemaBase() {
        // TODO: test ContactBaseWithStatusFieldsSchemaBase
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
