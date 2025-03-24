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
import org.egoi.client.model.HasQueuedCampaigns;
import org.egoi.client.model.HasQueuedCampaignsErrors;
import org.egoi.client.model.InvalidSegmentType;
import org.egoi.client.model.UsedInAutomations;
import org.egoi.client.model.UsedInRecurringMessages;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import org.egoi.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T11:21:14.263836Z[Europe/Lisbon]")
public class DeleteSegmentsConflictsErrors extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DeleteSegmentsConflictsErrors.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteSegmentsConflictsErrors.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeleteSegmentsConflictsErrors' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<HasQueuedCampaigns> adapterHasQueuedCampaigns = gson.getDelegateAdapter(this, TypeToken.get(HasQueuedCampaigns.class));
            final TypeAdapter<InvalidSegmentType> adapterInvalidSegmentType = gson.getDelegateAdapter(this, TypeToken.get(InvalidSegmentType.class));
            final TypeAdapter<UsedInAutomations> adapterUsedInAutomations = gson.getDelegateAdapter(this, TypeToken.get(UsedInAutomations.class));
            final TypeAdapter<UsedInRecurringMessages> adapterUsedInRecurringMessages = gson.getDelegateAdapter(this, TypeToken.get(UsedInRecurringMessages.class));

            return (TypeAdapter<T>) new TypeAdapter<DeleteSegmentsConflictsErrors>() {
                @Override
                public void write(JsonWriter out, DeleteSegmentsConflictsErrors value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `HasQueuedCampaigns`
                    if (value.getActualInstance() instanceof HasQueuedCampaigns) {
                        JsonObject obj = adapterHasQueuedCampaigns.toJsonTree((HasQueuedCampaigns)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `InvalidSegmentType`
                    if (value.getActualInstance() instanceof InvalidSegmentType) {
                        JsonObject obj = adapterInvalidSegmentType.toJsonTree((InvalidSegmentType)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UsedInAutomations`
                    if (value.getActualInstance() instanceof UsedInAutomations) {
                        JsonObject obj = adapterUsedInAutomations.toJsonTree((UsedInAutomations)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `UsedInRecurringMessages`
                    if (value.getActualInstance() instanceof UsedInRecurringMessages) {
                        JsonObject obj = adapterUsedInRecurringMessages.toJsonTree((UsedInRecurringMessages)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: HasQueuedCampaigns, InvalidSegmentType, UsedInAutomations, UsedInRecurringMessages");
                }

                @Override
                public DeleteSegmentsConflictsErrors read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize HasQueuedCampaigns
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HasQueuedCampaigns.validateJsonObject(jsonObject);
                        actualAdapter = adapterHasQueuedCampaigns;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HasQueuedCampaigns'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HasQueuedCampaigns failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HasQueuedCampaigns'", e);
                    }

                    // deserialize InvalidSegmentType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        InvalidSegmentType.validateJsonObject(jsonObject);
                        actualAdapter = adapterInvalidSegmentType;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'InvalidSegmentType'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for InvalidSegmentType failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'InvalidSegmentType'", e);
                    }

                    // deserialize UsedInAutomations
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UsedInAutomations.validateJsonObject(jsonObject);
                        actualAdapter = adapterUsedInAutomations;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UsedInAutomations'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UsedInAutomations failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UsedInAutomations'", e);
                    }

                    // deserialize UsedInRecurringMessages
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UsedInRecurringMessages.validateJsonObject(jsonObject);
                        actualAdapter = adapterUsedInRecurringMessages;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UsedInRecurringMessages'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UsedInRecurringMessages failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UsedInRecurringMessages'", e);
                    }

                    if (match == 1) {
                        DeleteSegmentsConflictsErrors ret = new DeleteSegmentsConflictsErrors();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for DeleteSegmentsConflictsErrors: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public DeleteSegmentsConflictsErrors() {
        super("oneOf", Boolean.FALSE);
    }

    public DeleteSegmentsConflictsErrors(HasQueuedCampaigns o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DeleteSegmentsConflictsErrors(InvalidSegmentType o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DeleteSegmentsConflictsErrors(UsedInAutomations o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DeleteSegmentsConflictsErrors(UsedInRecurringMessages o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("HasQueuedCampaigns", new GenericType<HasQueuedCampaigns>() {
        });
        schemas.put("InvalidSegmentType", new GenericType<InvalidSegmentType>() {
        });
        schemas.put("UsedInAutomations", new GenericType<UsedInAutomations>() {
        });
        schemas.put("UsedInRecurringMessages", new GenericType<UsedInRecurringMessages>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return DeleteSegmentsConflictsErrors.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * HasQueuedCampaigns, InvalidSegmentType, UsedInAutomations, UsedInRecurringMessages
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof HasQueuedCampaigns) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof InvalidSegmentType) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UsedInAutomations) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UsedInRecurringMessages) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be HasQueuedCampaigns, InvalidSegmentType, UsedInAutomations, UsedInRecurringMessages");
    }

    /**
     * Get the actual instance, which can be the following:
     * HasQueuedCampaigns, InvalidSegmentType, UsedInAutomations, UsedInRecurringMessages
     *
     * @return The actual instance (HasQueuedCampaigns, InvalidSegmentType, UsedInAutomations, UsedInRecurringMessages)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `HasQueuedCampaigns`. If the actual instance is not `HasQueuedCampaigns`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HasQueuedCampaigns`
     * @throws ClassCastException if the instance is not `HasQueuedCampaigns`
     */
    public HasQueuedCampaigns getHasQueuedCampaigns() throws ClassCastException {
        return (HasQueuedCampaigns)super.getActualInstance();
    }

    /**
     * Get the actual instance of `InvalidSegmentType`. If the actual instance is not `InvalidSegmentType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `InvalidSegmentType`
     * @throws ClassCastException if the instance is not `InvalidSegmentType`
     */
    public InvalidSegmentType getInvalidSegmentType() throws ClassCastException {
        return (InvalidSegmentType)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UsedInAutomations`. If the actual instance is not `UsedInAutomations`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UsedInAutomations`
     * @throws ClassCastException if the instance is not `UsedInAutomations`
     */
    public UsedInAutomations getUsedInAutomations() throws ClassCastException {
        return (UsedInAutomations)super.getActualInstance();
    }

    /**
     * Get the actual instance of `UsedInRecurringMessages`. If the actual instance is not `UsedInRecurringMessages`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UsedInRecurringMessages`
     * @throws ClassCastException if the instance is not `UsedInRecurringMessages`
     */
    public UsedInRecurringMessages getUsedInRecurringMessages() throws ClassCastException {
        return (UsedInRecurringMessages)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeleteSegmentsConflictsErrors
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with HasQueuedCampaigns
    try {
      HasQueuedCampaigns.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for HasQueuedCampaigns failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with InvalidSegmentType
    try {
      InvalidSegmentType.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for InvalidSegmentType failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UsedInAutomations
    try {
      UsedInAutomations.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UsedInAutomations failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with UsedInRecurringMessages
    try {
      UsedInRecurringMessages.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for UsedInRecurringMessages failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for DeleteSegmentsConflictsErrors with oneOf schemas: HasQueuedCampaigns, InvalidSegmentType, UsedInAutomations, UsedInRecurringMessages. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of DeleteSegmentsConflictsErrors given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteSegmentsConflictsErrors
  * @throws IOException if the JSON string is invalid with respect to DeleteSegmentsConflictsErrors
  */
  public static DeleteSegmentsConflictsErrors fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteSegmentsConflictsErrors.class);
  }

 /**
  * Convert an instance of DeleteSegmentsConflictsErrors to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

