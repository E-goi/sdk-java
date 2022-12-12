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
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.SuppressionTypeCellphone;
import org.egoi.client.model.SuppressionTypeEmail;
import org.egoi.client.model.SuppressionTypeEmailDomain;
import org.egoi.client.model.SuppressionTypePhone;
import org.egoi.client.model.SuppressionTypeUserEmail;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-12T17:30:24.773899Z[Europe/Lisbon]")
public class CreateSuppressionListRequest extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(CreateSuppressionListRequest.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateSuppressionListRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateSuppressionListRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SuppressionTypeCellphone> adapterSuppressionTypeCellphone = gson.getDelegateAdapter(this, TypeToken.get(SuppressionTypeCellphone.class));
            final TypeAdapter<SuppressionTypeEmail> adapterSuppressionTypeEmail = gson.getDelegateAdapter(this, TypeToken.get(SuppressionTypeEmail.class));
            final TypeAdapter<SuppressionTypeEmailDomain> adapterSuppressionTypeEmailDomain = gson.getDelegateAdapter(this, TypeToken.get(SuppressionTypeEmailDomain.class));
            final TypeAdapter<SuppressionTypePhone> adapterSuppressionTypePhone = gson.getDelegateAdapter(this, TypeToken.get(SuppressionTypePhone.class));
            final TypeAdapter<SuppressionTypeUserEmail> adapterSuppressionTypeUserEmail = gson.getDelegateAdapter(this, TypeToken.get(SuppressionTypeUserEmail.class));

            return (TypeAdapter<T>) new TypeAdapter<CreateSuppressionListRequest>() {
                @Override
                public void write(JsonWriter out, CreateSuppressionListRequest value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SuppressionTypeCellphone`
                    if (value.getActualInstance() instanceof SuppressionTypeCellphone) {
                        JsonObject obj = adapterSuppressionTypeCellphone.toJsonTree((SuppressionTypeCellphone)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SuppressionTypeEmail`
                    if (value.getActualInstance() instanceof SuppressionTypeEmail) {
                        JsonObject obj = adapterSuppressionTypeEmail.toJsonTree((SuppressionTypeEmail)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SuppressionTypeEmailDomain`
                    if (value.getActualInstance() instanceof SuppressionTypeEmailDomain) {
                        JsonObject obj = adapterSuppressionTypeEmailDomain.toJsonTree((SuppressionTypeEmailDomain)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SuppressionTypePhone`
                    if (value.getActualInstance() instanceof SuppressionTypePhone) {
                        JsonObject obj = adapterSuppressionTypePhone.toJsonTree((SuppressionTypePhone)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `SuppressionTypeUserEmail`
                    if (value.getActualInstance() instanceof SuppressionTypeUserEmail) {
                        JsonObject obj = adapterSuppressionTypeUserEmail.toJsonTree((SuppressionTypeUserEmail)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: SuppressionTypeCellphone, SuppressionTypeEmail, SuppressionTypeEmailDomain, SuppressionTypePhone, SuppressionTypeUserEmail");
                }

                @Override
                public CreateSuppressionListRequest read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SuppressionTypeCellphone
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SuppressionTypeCellphone.validateJsonObject(jsonObject);
                        actualAdapter = adapterSuppressionTypeCellphone;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SuppressionTypeCellphone'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SuppressionTypeCellphone failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SuppressionTypeCellphone'", e);
                    }

                    // deserialize SuppressionTypeEmail
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SuppressionTypeEmail.validateJsonObject(jsonObject);
                        actualAdapter = adapterSuppressionTypeEmail;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SuppressionTypeEmail'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SuppressionTypeEmail failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SuppressionTypeEmail'", e);
                    }

                    // deserialize SuppressionTypeEmailDomain
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SuppressionTypeEmailDomain.validateJsonObject(jsonObject);
                        actualAdapter = adapterSuppressionTypeEmailDomain;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SuppressionTypeEmailDomain'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SuppressionTypeEmailDomain failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SuppressionTypeEmailDomain'", e);
                    }

                    // deserialize SuppressionTypePhone
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SuppressionTypePhone.validateJsonObject(jsonObject);
                        actualAdapter = adapterSuppressionTypePhone;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SuppressionTypePhone'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SuppressionTypePhone failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SuppressionTypePhone'", e);
                    }

                    // deserialize SuppressionTypeUserEmail
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SuppressionTypeUserEmail.validateJsonObject(jsonObject);
                        actualAdapter = adapterSuppressionTypeUserEmail;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SuppressionTypeUserEmail'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SuppressionTypeUserEmail failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SuppressionTypeUserEmail'", e);
                    }

                    if (match == 1) {
                        CreateSuppressionListRequest ret = new CreateSuppressionListRequest();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for CreateSuppressionListRequest: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public CreateSuppressionListRequest() {
        super("oneOf", Boolean.FALSE);
    }

    public CreateSuppressionListRequest(SuppressionTypeCellphone o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateSuppressionListRequest(SuppressionTypeEmail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateSuppressionListRequest(SuppressionTypeEmailDomain o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateSuppressionListRequest(SuppressionTypePhone o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public CreateSuppressionListRequest(SuppressionTypeUserEmail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SuppressionTypeCellphone", new GenericType<SuppressionTypeCellphone>() {
        });
        schemas.put("SuppressionTypeEmail", new GenericType<SuppressionTypeEmail>() {
        });
        schemas.put("SuppressionTypeEmailDomain", new GenericType<SuppressionTypeEmailDomain>() {
        });
        schemas.put("SuppressionTypePhone", new GenericType<SuppressionTypePhone>() {
        });
        schemas.put("SuppressionTypeUserEmail", new GenericType<SuppressionTypeUserEmail>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return CreateSuppressionListRequest.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SuppressionTypeCellphone, SuppressionTypeEmail, SuppressionTypeEmailDomain, SuppressionTypePhone, SuppressionTypeUserEmail
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SuppressionTypeCellphone) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SuppressionTypeEmail) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SuppressionTypeEmailDomain) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SuppressionTypePhone) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SuppressionTypeUserEmail) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SuppressionTypeCellphone, SuppressionTypeEmail, SuppressionTypeEmailDomain, SuppressionTypePhone, SuppressionTypeUserEmail");
    }

    /**
     * Get the actual instance, which can be the following:
     * SuppressionTypeCellphone, SuppressionTypeEmail, SuppressionTypeEmailDomain, SuppressionTypePhone, SuppressionTypeUserEmail
     *
     * @return The actual instance (SuppressionTypeCellphone, SuppressionTypeEmail, SuppressionTypeEmailDomain, SuppressionTypePhone, SuppressionTypeUserEmail)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SuppressionTypeCellphone`. If the actual instance is not `SuppressionTypeCellphone`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SuppressionTypeCellphone`
     * @throws ClassCastException if the instance is not `SuppressionTypeCellphone`
     */
    public SuppressionTypeCellphone getSuppressionTypeCellphone() throws ClassCastException {
        return (SuppressionTypeCellphone)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SuppressionTypeEmail`. If the actual instance is not `SuppressionTypeEmail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SuppressionTypeEmail`
     * @throws ClassCastException if the instance is not `SuppressionTypeEmail`
     */
    public SuppressionTypeEmail getSuppressionTypeEmail() throws ClassCastException {
        return (SuppressionTypeEmail)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SuppressionTypeEmailDomain`. If the actual instance is not `SuppressionTypeEmailDomain`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SuppressionTypeEmailDomain`
     * @throws ClassCastException if the instance is not `SuppressionTypeEmailDomain`
     */
    public SuppressionTypeEmailDomain getSuppressionTypeEmailDomain() throws ClassCastException {
        return (SuppressionTypeEmailDomain)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SuppressionTypePhone`. If the actual instance is not `SuppressionTypePhone`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SuppressionTypePhone`
     * @throws ClassCastException if the instance is not `SuppressionTypePhone`
     */
    public SuppressionTypePhone getSuppressionTypePhone() throws ClassCastException {
        return (SuppressionTypePhone)super.getActualInstance();
    }

    /**
     * Get the actual instance of `SuppressionTypeUserEmail`. If the actual instance is not `SuppressionTypeUserEmail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SuppressionTypeUserEmail`
     * @throws ClassCastException if the instance is not `SuppressionTypeUserEmail`
     */
    public SuppressionTypeUserEmail getSuppressionTypeUserEmail() throws ClassCastException {
        return (SuppressionTypeUserEmail)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateSuppressionListRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with SuppressionTypeCellphone
    try {
      SuppressionTypeCellphone.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SuppressionTypeCellphone failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SuppressionTypeEmail
    try {
      SuppressionTypeEmail.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SuppressionTypeEmail failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SuppressionTypeEmailDomain
    try {
      SuppressionTypeEmailDomain.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SuppressionTypeEmailDomain failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SuppressionTypePhone
    try {
      SuppressionTypePhone.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SuppressionTypePhone failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with SuppressionTypeUserEmail
    try {
      SuppressionTypeUserEmail.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for SuppressionTypeUserEmail failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for CreateSuppressionListRequest with oneOf schemas: SuppressionTypeCellphone, SuppressionTypeEmail, SuppressionTypeEmailDomain, SuppressionTypePhone, SuppressionTypeUserEmail. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of CreateSuppressionListRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSuppressionListRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSuppressionListRequest
  */
  public static CreateSuppressionListRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSuppressionListRequest.class);
  }

 /**
  * Convert an instance of CreateSuppressionListRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

