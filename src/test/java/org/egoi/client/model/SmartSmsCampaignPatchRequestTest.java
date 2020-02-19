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
import org.egoi.client.model.CampaignSmsOptions;
import org.egoi.client.model.SmartSmsCampaignPatchRequestCampaignContent;
import org.egoi.client.model.SmartSmsCampaignPatchRequestPageContent;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for SmartSmsCampaignPatchRequest
 */
public class SmartSmsCampaignPatchRequestTest {
    private final SmartSmsCampaignPatchRequest model = new SmartSmsCampaignPatchRequest();

    /**
     * Model tests for SmartSmsCampaignPatchRequest
     */
    @Test
    public void testSmartSmsCampaignPatchRequest() {
        // TODO: test SmartSmsCampaignPatchRequest
    }

    /**
     * Test the property 'internalName'
     */
    @Test
    public void internalNameTest() {
        // TODO: test internalName
    }

    /**
     * Test the property 'campaignContent'
     */
    @Test
    public void campaignContentTest() {
        // TODO: test campaignContent
    }

    /**
     * Test the property 'pageContent'
     */
    @Test
    public void pageContentTest() {
        // TODO: test pageContent
    }

    /**
     * Test the property 'senderId'
     */
    @Test
    public void senderIdTest() {
        // TODO: test senderId
    }

    /**
     * Test the property 'cnameId'
     */
    @Test
    public void cnameIdTest() {
        // TODO: test cnameId
    }

    /**
     * Test the property 'options'
     */
    @Test
    public void optionsTest() {
        // TODO: test options
    }

}