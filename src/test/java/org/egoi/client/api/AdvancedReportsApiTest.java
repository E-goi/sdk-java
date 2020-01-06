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
import org.egoi.client.model.AdvancedReportsCollection;
import org.egoi.client.model.BadRequest;
import org.egoi.client.model.Forbidden;
import org.egoi.client.model.GenerateEmailBouncesReport;
import org.egoi.client.model.GenerateEmailClicksByContactReport;
import org.egoi.client.model.GenerateEmailClicksByUrlReport;
import org.egoi.client.model.GenerateEmailEventsReport;
import org.egoi.client.model.GenerateEmailUnsubscriptionsReport;
import org.egoi.client.model.GenerateFormAnswersReport;
import org.egoi.client.model.GenerateSendsReport;
import org.egoi.client.model.GenerateSmsBouncesReport;
import org.egoi.client.model.GenerateSmsEventsReport;
import org.egoi.client.model.GenerateSubscriptionsReport;
import org.egoi.client.model.GenerateUnsubscriptionsReport;
import org.egoi.client.model.InternalServerError;
import org.threeten.bp.OffsetDateTime;
import org.egoi.client.model.Unauthorized;
import org.egoi.client.model.UnprocessableEntity;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdvancedReportsApi
 */
@Ignore
public class AdvancedReportsApiTest {

    private final AdvancedReportsApi api = new AdvancedReportsApi();

    
    /**
     * Generate email bounces report
     *
     * Generates a new email bounces report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateEmailBouncesReportTest() throws ApiException {
        GenerateEmailBouncesReport generateEmailBouncesReport = null;
        AcceptedResponse response = api.generateEmailBouncesReport(generateEmailBouncesReport);

        // TODO: test validations
    }
    
    /**
     * Generate email clicks by contact report
     *
     * Generates a new email clicks by contact report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateEmailClicksByContactReportTest() throws ApiException {
        GenerateEmailClicksByContactReport generateEmailClicksByContactReport = null;
        AcceptedResponse response = api.generateEmailClicksByContactReport(generateEmailClicksByContactReport);

        // TODO: test validations
    }
    
    /**
     * Generate email clicks by URL report
     *
     * Generates a new email clicks by URL report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateEmailClicksByUrlReportTest() throws ApiException {
        GenerateEmailClicksByUrlReport generateEmailClicksByUrlReport = null;
        AcceptedResponse response = api.generateEmailClicksByUrlReport(generateEmailClicksByUrlReport);

        // TODO: test validations
    }
    
    /**
     * Generate email events report
     *
     * Generates a new email events report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateEmailEventsReportTest() throws ApiException {
        GenerateEmailEventsReport generateEmailEventsReport = null;
        AcceptedResponse response = api.generateEmailEventsReport(generateEmailEventsReport);

        // TODO: test validations
    }
    
    /**
     * Generate SMS bounces report
     *
     * Generates a new SMS bounces report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateEmailSmsReportTest() throws ApiException {
        GenerateSmsBouncesReport generateSmsBouncesReport = null;
        AcceptedResponse response = api.generateEmailSmsReport(generateSmsBouncesReport);

        // TODO: test validations
    }
    
    /**
     * Generate email unsubscriptions report
     *
     * Generates a new email unsubscriptions report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateEmailUnsubscriptionsReportTest() throws ApiException {
        GenerateEmailUnsubscriptionsReport generateEmailUnsubscriptionsReport = null;
        AcceptedResponse response = api.generateEmailUnsubscriptionsReport(generateEmailUnsubscriptionsReport);

        // TODO: test validations
    }
    
    /**
     * Generate form answers report
     *
     * Generates a new form answers report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateFormAnswersReportTest() throws ApiException {
        GenerateFormAnswersReport generateFormAnswersReport = null;
        AcceptedResponse response = api.generateFormAnswersReport(generateFormAnswersReport);

        // TODO: test validations
    }
    
    /**
     * Generate sends report
     *
     * Generates a new sends report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateSendsReportTest() throws ApiException {
        GenerateSendsReport generateSendsReport = null;
        AcceptedResponse response = api.generateSendsReport(generateSendsReport);

        // TODO: test validations
    }
    
    /**
     * Generate SMS events report
     *
     * Generates a new SMS events report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateSmsEventsReportTest() throws ApiException {
        GenerateSmsEventsReport generateSmsEventsReport = null;
        AcceptedResponse response = api.generateSmsEventsReport(generateSmsEventsReport);

        // TODO: test validations
    }
    
    /**
     * Generate subscriptions report
     *
     * Generates a new subscriptions report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateSubscriptionsReportTest() throws ApiException {
        GenerateSubscriptionsReport generateSubscriptionsReport = null;
        AcceptedResponse response = api.generateSubscriptionsReport(generateSubscriptionsReport);

        // TODO: test validations
    }
    
    /**
     * Generate unsubscriptions report
     *
     * Generates a new unsubscriptions report
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateUnsubscriptionsReportTest() throws ApiException {
        GenerateUnsubscriptionsReport generateUnsubscriptionsReport = null;
        AcceptedResponse response = api.generateUnsubscriptionsReport(generateUnsubscriptionsReport);

        // TODO: test validations
    }
    
    /**
     * Get all advanced reports
     *
     * Returns all advanced reports
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAdvancedReportsTest() throws ApiException {
        String status = null;
        String title = null;
        OffsetDateTime createdMin = null;
        OffsetDateTime createdMax = null;
        Integer offset = null;
        Integer limit = null;
        String order = null;
        String orderBy = null;
        AdvancedReportsCollection response = api.getAllAdvancedReports(status, title, createdMin, createdMax, offset, limit, order, orderBy);

        // TODO: test validations
    }
    
}