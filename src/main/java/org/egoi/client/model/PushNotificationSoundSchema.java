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
import org.egoi.client.model.PushNotificationSoundSchemaDefault;
import org.egoi.client.model.PushNotificationSoundSchemaNone;
import org.egoi.client.model.PushNotificationSoundSchemaUrl;

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
public class PushNotificationSoundSchema extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(PushNotificationSoundSchema.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PushNotificationSoundSchema.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PushNotificationSoundSchema' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PushNotificationSoundSchemaDefault> adapterPushNotificationSoundSchemaDefault = gson.getDelegateAdapter(this, TypeToken.get(PushNotificationSoundSchemaDefault.class));
            final TypeAdapter<PushNotificationSoundSchemaNone> adapterPushNotificationSoundSchemaNone = gson.getDelegateAdapter(this, TypeToken.get(PushNotificationSoundSchemaNone.class));
            final TypeAdapter<PushNotificationSoundSchemaUrl> adapterPushNotificationSoundSchemaUrl = gson.getDelegateAdapter(this, TypeToken.get(PushNotificationSoundSchemaUrl.class));

            return (TypeAdapter<T>) new TypeAdapter<PushNotificationSoundSchema>() {
                @Override
                public void write(JsonWriter out, PushNotificationSoundSchema value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `PushNotificationSoundSchemaDefault`
                    if (value.getActualInstance() instanceof PushNotificationSoundSchemaDefault) {
                        JsonObject obj = adapterPushNotificationSoundSchemaDefault.toJsonTree((PushNotificationSoundSchemaDefault)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PushNotificationSoundSchemaNone`
                    if (value.getActualInstance() instanceof PushNotificationSoundSchemaNone) {
                        JsonObject obj = adapterPushNotificationSoundSchemaNone.toJsonTree((PushNotificationSoundSchemaNone)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `PushNotificationSoundSchemaUrl`
                    if (value.getActualInstance() instanceof PushNotificationSoundSchemaUrl) {
                        JsonObject obj = adapterPushNotificationSoundSchemaUrl.toJsonTree((PushNotificationSoundSchemaUrl)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: PushNotificationSoundSchemaDefault, PushNotificationSoundSchemaNone, PushNotificationSoundSchemaUrl");
                }

                @Override
                public PushNotificationSoundSchema read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize PushNotificationSoundSchemaDefault
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PushNotificationSoundSchemaDefault.validateJsonObject(jsonObject);
                        actualAdapter = adapterPushNotificationSoundSchemaDefault;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PushNotificationSoundSchemaDefault'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PushNotificationSoundSchemaDefault failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PushNotificationSoundSchemaDefault'", e);
                    }

                    // deserialize PushNotificationSoundSchemaNone
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PushNotificationSoundSchemaNone.validateJsonObject(jsonObject);
                        actualAdapter = adapterPushNotificationSoundSchemaNone;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PushNotificationSoundSchemaNone'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PushNotificationSoundSchemaNone failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PushNotificationSoundSchemaNone'", e);
                    }

                    // deserialize PushNotificationSoundSchemaUrl
                    try {
                        // validate the JSON object to see if any exception is thrown
                        PushNotificationSoundSchemaUrl.validateJsonObject(jsonObject);
                        actualAdapter = adapterPushNotificationSoundSchemaUrl;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'PushNotificationSoundSchemaUrl'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for PushNotificationSoundSchemaUrl failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'PushNotificationSoundSchemaUrl'", e);
                    }

                    if (match == 1) {
                        PushNotificationSoundSchema ret = new PushNotificationSoundSchema();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for PushNotificationSoundSchema: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public PushNotificationSoundSchema() {
        super("oneOf", Boolean.FALSE);
    }

    public PushNotificationSoundSchema(PushNotificationSoundSchemaDefault o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PushNotificationSoundSchema(PushNotificationSoundSchemaNone o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public PushNotificationSoundSchema(PushNotificationSoundSchemaUrl o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("PushNotificationSoundSchemaDefault", new GenericType<PushNotificationSoundSchemaDefault>() {
        });
        schemas.put("PushNotificationSoundSchemaNone", new GenericType<PushNotificationSoundSchemaNone>() {
        });
        schemas.put("PushNotificationSoundSchemaUrl", new GenericType<PushNotificationSoundSchemaUrl>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return PushNotificationSoundSchema.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * PushNotificationSoundSchemaDefault, PushNotificationSoundSchemaNone, PushNotificationSoundSchemaUrl
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof PushNotificationSoundSchemaDefault) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PushNotificationSoundSchemaNone) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PushNotificationSoundSchemaUrl) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be PushNotificationSoundSchemaDefault, PushNotificationSoundSchemaNone, PushNotificationSoundSchemaUrl");
    }

    /**
     * Get the actual instance, which can be the following:
     * PushNotificationSoundSchemaDefault, PushNotificationSoundSchemaNone, PushNotificationSoundSchemaUrl
     *
     * @return The actual instance (PushNotificationSoundSchemaDefault, PushNotificationSoundSchemaNone, PushNotificationSoundSchemaUrl)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PushNotificationSoundSchemaDefault`. If the actual instance is not `PushNotificationSoundSchemaDefault`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PushNotificationSoundSchemaDefault`
     * @throws ClassCastException if the instance is not `PushNotificationSoundSchemaDefault`
     */
    public PushNotificationSoundSchemaDefault getPushNotificationSoundSchemaDefault() throws ClassCastException {
        return (PushNotificationSoundSchemaDefault)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PushNotificationSoundSchemaNone`. If the actual instance is not `PushNotificationSoundSchemaNone`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PushNotificationSoundSchemaNone`
     * @throws ClassCastException if the instance is not `PushNotificationSoundSchemaNone`
     */
    public PushNotificationSoundSchemaNone getPushNotificationSoundSchemaNone() throws ClassCastException {
        return (PushNotificationSoundSchemaNone)super.getActualInstance();
    }

    /**
     * Get the actual instance of `PushNotificationSoundSchemaUrl`. If the actual instance is not `PushNotificationSoundSchemaUrl`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PushNotificationSoundSchemaUrl`
     * @throws ClassCastException if the instance is not `PushNotificationSoundSchemaUrl`
     */
    public PushNotificationSoundSchemaUrl getPushNotificationSoundSchemaUrl() throws ClassCastException {
        return (PushNotificationSoundSchemaUrl)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PushNotificationSoundSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with PushNotificationSoundSchemaDefault
    try {
      PushNotificationSoundSchemaDefault.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PushNotificationSoundSchemaDefault failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PushNotificationSoundSchemaNone
    try {
      PushNotificationSoundSchemaNone.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PushNotificationSoundSchemaNone failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with PushNotificationSoundSchemaUrl
    try {
      PushNotificationSoundSchemaUrl.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for PushNotificationSoundSchemaUrl failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for PushNotificationSoundSchema with oneOf schemas: PushNotificationSoundSchemaDefault, PushNotificationSoundSchemaNone, PushNotificationSoundSchemaUrl. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of PushNotificationSoundSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PushNotificationSoundSchema
  * @throws IOException if the JSON string is invalid with respect to PushNotificationSoundSchema
  */
  public static PushNotificationSoundSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PushNotificationSoundSchema.class);
  }

 /**
  * Convert an instance of PushNotificationSoundSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

