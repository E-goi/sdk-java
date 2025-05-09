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
import org.egoi.client.model.HasAutomations;
import org.egoi.client.model.HasCampaignsLastThirtyDays;
import org.egoi.client.model.HasCampaignsLastThirtyDaysErrors;
import org.egoi.client.model.HasPushApp;
import org.egoi.client.model.HasQueuedOperations;
import org.egoi.client.model.HasWebPushSite;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-30T16:00:36.862706+01:00[Europe/Lisbon]")
public class DeleteListsConflictsErrors extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(DeleteListsConflictsErrors.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteListsConflictsErrors.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeleteListsConflictsErrors' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<HasAutomations> adapterHasAutomations = gson.getDelegateAdapter(this, TypeToken.get(HasAutomations.class));
            final TypeAdapter<HasCampaignsLastThirtyDays> adapterHasCampaignsLastThirtyDays = gson.getDelegateAdapter(this, TypeToken.get(HasCampaignsLastThirtyDays.class));
            final TypeAdapter<HasPushApp> adapterHasPushApp = gson.getDelegateAdapter(this, TypeToken.get(HasPushApp.class));
            final TypeAdapter<HasQueuedOperations> adapterHasQueuedOperations = gson.getDelegateAdapter(this, TypeToken.get(HasQueuedOperations.class));
            final TypeAdapter<HasWebPushSite> adapterHasWebPushSite = gson.getDelegateAdapter(this, TypeToken.get(HasWebPushSite.class));

            return (TypeAdapter<T>) new TypeAdapter<DeleteListsConflictsErrors>() {
                @Override
                public void write(JsonWriter out, DeleteListsConflictsErrors value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `HasAutomations`
                    if (value.getActualInstance() instanceof HasAutomations) {
                        JsonObject obj = adapterHasAutomations.toJsonTree((HasAutomations)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `HasCampaignsLastThirtyDays`
                    if (value.getActualInstance() instanceof HasCampaignsLastThirtyDays) {
                        JsonObject obj = adapterHasCampaignsLastThirtyDays.toJsonTree((HasCampaignsLastThirtyDays)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `HasPushApp`
                    if (value.getActualInstance() instanceof HasPushApp) {
                        JsonObject obj = adapterHasPushApp.toJsonTree((HasPushApp)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `HasQueuedOperations`
                    if (value.getActualInstance() instanceof HasQueuedOperations) {
                        JsonObject obj = adapterHasQueuedOperations.toJsonTree((HasQueuedOperations)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `HasWebPushSite`
                    if (value.getActualInstance() instanceof HasWebPushSite) {
                        JsonObject obj = adapterHasWebPushSite.toJsonTree((HasWebPushSite)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: HasAutomations, HasCampaignsLastThirtyDays, HasPushApp, HasQueuedOperations, HasWebPushSite");
                }

                @Override
                public DeleteListsConflictsErrors read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize HasAutomations
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HasAutomations.validateJsonObject(jsonObject);
                        actualAdapter = adapterHasAutomations;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HasAutomations'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HasAutomations failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HasAutomations'", e);
                    }

                    // deserialize HasCampaignsLastThirtyDays
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HasCampaignsLastThirtyDays.validateJsonObject(jsonObject);
                        actualAdapter = adapterHasCampaignsLastThirtyDays;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HasCampaignsLastThirtyDays'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HasCampaignsLastThirtyDays failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HasCampaignsLastThirtyDays'", e);
                    }

                    // deserialize HasPushApp
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HasPushApp.validateJsonObject(jsonObject);
                        actualAdapter = adapterHasPushApp;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HasPushApp'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HasPushApp failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HasPushApp'", e);
                    }

                    // deserialize HasQueuedOperations
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HasQueuedOperations.validateJsonObject(jsonObject);
                        actualAdapter = adapterHasQueuedOperations;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HasQueuedOperations'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HasQueuedOperations failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HasQueuedOperations'", e);
                    }

                    // deserialize HasWebPushSite
                    try {
                        // validate the JSON object to see if any exception is thrown
                        HasWebPushSite.validateJsonObject(jsonObject);
                        actualAdapter = adapterHasWebPushSite;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'HasWebPushSite'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for HasWebPushSite failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'HasWebPushSite'", e);
                    }

                    if (match == 1) {
                        DeleteListsConflictsErrors ret = new DeleteListsConflictsErrors();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for DeleteListsConflictsErrors: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public DeleteListsConflictsErrors() {
        super("oneOf", Boolean.FALSE);
    }

    public DeleteListsConflictsErrors(HasAutomations o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DeleteListsConflictsErrors(HasCampaignsLastThirtyDays o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DeleteListsConflictsErrors(HasPushApp o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DeleteListsConflictsErrors(HasQueuedOperations o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public DeleteListsConflictsErrors(HasWebPushSite o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("HasAutomations", new GenericType<HasAutomations>() {
        });
        schemas.put("HasCampaignsLastThirtyDays", new GenericType<HasCampaignsLastThirtyDays>() {
        });
        schemas.put("HasPushApp", new GenericType<HasPushApp>() {
        });
        schemas.put("HasQueuedOperations", new GenericType<HasQueuedOperations>() {
        });
        schemas.put("HasWebPushSite", new GenericType<HasWebPushSite>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return DeleteListsConflictsErrors.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * HasAutomations, HasCampaignsLastThirtyDays, HasPushApp, HasQueuedOperations, HasWebPushSite
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof HasAutomations) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof HasCampaignsLastThirtyDays) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof HasPushApp) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof HasQueuedOperations) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof HasWebPushSite) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be HasAutomations, HasCampaignsLastThirtyDays, HasPushApp, HasQueuedOperations, HasWebPushSite");
    }

    /**
     * Get the actual instance, which can be the following:
     * HasAutomations, HasCampaignsLastThirtyDays, HasPushApp, HasQueuedOperations, HasWebPushSite
     *
     * @return The actual instance (HasAutomations, HasCampaignsLastThirtyDays, HasPushApp, HasQueuedOperations, HasWebPushSite)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `HasAutomations`. If the actual instance is not `HasAutomations`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HasAutomations`
     * @throws ClassCastException if the instance is not `HasAutomations`
     */
    public HasAutomations getHasAutomations() throws ClassCastException {
        return (HasAutomations)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HasCampaignsLastThirtyDays`. If the actual instance is not `HasCampaignsLastThirtyDays`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HasCampaignsLastThirtyDays`
     * @throws ClassCastException if the instance is not `HasCampaignsLastThirtyDays`
     */
    public HasCampaignsLastThirtyDays getHasCampaignsLastThirtyDays() throws ClassCastException {
        return (HasCampaignsLastThirtyDays)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HasPushApp`. If the actual instance is not `HasPushApp`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HasPushApp`
     * @throws ClassCastException if the instance is not `HasPushApp`
     */
    public HasPushApp getHasPushApp() throws ClassCastException {
        return (HasPushApp)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HasQueuedOperations`. If the actual instance is not `HasQueuedOperations`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HasQueuedOperations`
     * @throws ClassCastException if the instance is not `HasQueuedOperations`
     */
    public HasQueuedOperations getHasQueuedOperations() throws ClassCastException {
        return (HasQueuedOperations)super.getActualInstance();
    }

    /**
     * Get the actual instance of `HasWebPushSite`. If the actual instance is not `HasWebPushSite`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `HasWebPushSite`
     * @throws ClassCastException if the instance is not `HasWebPushSite`
     */
    public HasWebPushSite getHasWebPushSite() throws ClassCastException {
        return (HasWebPushSite)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeleteListsConflictsErrors
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with HasAutomations
    try {
      HasAutomations.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for HasAutomations failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with HasCampaignsLastThirtyDays
    try {
      HasCampaignsLastThirtyDays.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for HasCampaignsLastThirtyDays failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with HasPushApp
    try {
      HasPushApp.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for HasPushApp failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with HasQueuedOperations
    try {
      HasQueuedOperations.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for HasQueuedOperations failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with HasWebPushSite
    try {
      HasWebPushSite.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for HasWebPushSite failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for DeleteListsConflictsErrors with oneOf schemas: HasAutomations, HasCampaignsLastThirtyDays, HasPushApp, HasQueuedOperations, HasWebPushSite. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of DeleteListsConflictsErrors given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteListsConflictsErrors
  * @throws IOException if the JSON string is invalid with respect to DeleteListsConflictsErrors
  */
  public static DeleteListsConflictsErrors fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteListsConflictsErrors.class);
  }

 /**
  * Convert an instance of DeleteListsConflictsErrors to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

