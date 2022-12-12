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
import org.egoi.client.model.ContentVoiceAudio;
import org.egoi.client.model.ContentVoiceTemplate;

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
public class ContentVoice extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ContentVoice.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContentVoice.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContentVoice' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ContentVoiceAudio> adapterContentVoiceAudio = gson.getDelegateAdapter(this, TypeToken.get(ContentVoiceAudio.class));
            final TypeAdapter<ContentVoiceTemplate> adapterContentVoiceTemplate = gson.getDelegateAdapter(this, TypeToken.get(ContentVoiceTemplate.class));

            return (TypeAdapter<T>) new TypeAdapter<ContentVoice>() {
                @Override
                public void write(JsonWriter out, ContentVoice value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ContentVoiceAudio`
                    if (value.getActualInstance() instanceof ContentVoiceAudio) {
                        JsonObject obj = adapterContentVoiceAudio.toJsonTree((ContentVoiceAudio)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ContentVoiceTemplate`
                    if (value.getActualInstance() instanceof ContentVoiceTemplate) {
                        JsonObject obj = adapterContentVoiceTemplate.toJsonTree((ContentVoiceTemplate)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ContentVoiceAudio, ContentVoiceTemplate");
                }

                @Override
                public ContentVoice read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ContentVoiceAudio
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContentVoiceAudio.validateJsonObject(jsonObject);
                        actualAdapter = adapterContentVoiceAudio;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContentVoiceAudio'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContentVoiceAudio failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContentVoiceAudio'", e);
                    }

                    // deserialize ContentVoiceTemplate
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContentVoiceTemplate.validateJsonObject(jsonObject);
                        actualAdapter = adapterContentVoiceTemplate;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContentVoiceTemplate'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContentVoiceTemplate failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContentVoiceTemplate'", e);
                    }

                    if (match == 1) {
                        ContentVoice ret = new ContentVoice();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ContentVoice: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ContentVoice() {
        super("oneOf", Boolean.FALSE);
    }

    public ContentVoice(ContentVoiceAudio o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContentVoice(ContentVoiceTemplate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ContentVoiceAudio", new GenericType<ContentVoiceAudio>() {
        });
        schemas.put("ContentVoiceTemplate", new GenericType<ContentVoiceTemplate>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ContentVoice.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ContentVoiceAudio, ContentVoiceTemplate
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ContentVoiceAudio) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContentVoiceTemplate) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ContentVoiceAudio, ContentVoiceTemplate");
    }

    /**
     * Get the actual instance, which can be the following:
     * ContentVoiceAudio, ContentVoiceTemplate
     *
     * @return The actual instance (ContentVoiceAudio, ContentVoiceTemplate)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContentVoiceAudio`. If the actual instance is not `ContentVoiceAudio`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContentVoiceAudio`
     * @throws ClassCastException if the instance is not `ContentVoiceAudio`
     */
    public ContentVoiceAudio getContentVoiceAudio() throws ClassCastException {
        return (ContentVoiceAudio)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContentVoiceTemplate`. If the actual instance is not `ContentVoiceTemplate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContentVoiceTemplate`
     * @throws ClassCastException if the instance is not `ContentVoiceTemplate`
     */
    public ContentVoiceTemplate getContentVoiceTemplate() throws ClassCastException {
        return (ContentVoiceTemplate)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContentVoice
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ContentVoiceAudio
    try {
      ContentVoiceAudio.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContentVoiceAudio failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ContentVoiceTemplate
    try {
      ContentVoiceTemplate.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContentVoiceTemplate failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ContentVoice with oneOf schemas: ContentVoiceAudio, ContentVoiceTemplate. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ContentVoice given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContentVoice
  * @throws IOException if the JSON string is invalid with respect to ContentVoice
  */
  public static ContentVoice fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContentVoice.class);
  }

 /**
  * Convert an instance of ContentVoice to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

