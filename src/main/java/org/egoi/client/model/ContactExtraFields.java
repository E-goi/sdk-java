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
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.ContactExtraFieldCellphone;
import org.egoi.client.model.ContactExtraFieldDate;
import org.egoi.client.model.ContactExtraFieldEmail;
import org.egoi.client.model.ContactExtraFieldNumber;
import org.egoi.client.model.ContactExtraFieldOptions;
import org.egoi.client.model.ContactExtraFieldPhone;
import org.egoi.client.model.ContactExtraFieldText;

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
public class ContactExtraFields extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ContactExtraFields.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContactExtraFields.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContactExtraFields' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ContactExtraFieldCellphone> adapterContactExtraFieldCellphone = gson.getDelegateAdapter(this, TypeToken.get(ContactExtraFieldCellphone.class));
            final TypeAdapter<ContactExtraFieldDate> adapterContactExtraFieldDate = gson.getDelegateAdapter(this, TypeToken.get(ContactExtraFieldDate.class));
            final TypeAdapter<ContactExtraFieldEmail> adapterContactExtraFieldEmail = gson.getDelegateAdapter(this, TypeToken.get(ContactExtraFieldEmail.class));
            final TypeAdapter<ContactExtraFieldNumber> adapterContactExtraFieldNumber = gson.getDelegateAdapter(this, TypeToken.get(ContactExtraFieldNumber.class));
            final TypeAdapter<ContactExtraFieldOptions> adapterContactExtraFieldOptions = gson.getDelegateAdapter(this, TypeToken.get(ContactExtraFieldOptions.class));
            final TypeAdapter<ContactExtraFieldPhone> adapterContactExtraFieldPhone = gson.getDelegateAdapter(this, TypeToken.get(ContactExtraFieldPhone.class));
            final TypeAdapter<ContactExtraFieldText> adapterContactExtraFieldText = gson.getDelegateAdapter(this, TypeToken.get(ContactExtraFieldText.class));

            return (TypeAdapter<T>) new TypeAdapter<ContactExtraFields>() {
                @Override
                public void write(JsonWriter out, ContactExtraFields value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `ContactExtraFieldCellphone`
                    if (value.getActualInstance() instanceof ContactExtraFieldCellphone) {
                        JsonObject obj = adapterContactExtraFieldCellphone.toJsonTree((ContactExtraFieldCellphone)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ContactExtraFieldDate`
                    if (value.getActualInstance() instanceof ContactExtraFieldDate) {
                        JsonObject obj = adapterContactExtraFieldDate.toJsonTree((ContactExtraFieldDate)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ContactExtraFieldEmail`
                    if (value.getActualInstance() instanceof ContactExtraFieldEmail) {
                        JsonObject obj = adapterContactExtraFieldEmail.toJsonTree((ContactExtraFieldEmail)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ContactExtraFieldNumber`
                    if (value.getActualInstance() instanceof ContactExtraFieldNumber) {
                        JsonObject obj = adapterContactExtraFieldNumber.toJsonTree((ContactExtraFieldNumber)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ContactExtraFieldOptions`
                    if (value.getActualInstance() instanceof ContactExtraFieldOptions) {
                        JsonObject obj = adapterContactExtraFieldOptions.toJsonTree((ContactExtraFieldOptions)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ContactExtraFieldPhone`
                    if (value.getActualInstance() instanceof ContactExtraFieldPhone) {
                        JsonObject obj = adapterContactExtraFieldPhone.toJsonTree((ContactExtraFieldPhone)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ContactExtraFieldText`
                    if (value.getActualInstance() instanceof ContactExtraFieldText) {
                        JsonObject obj = adapterContactExtraFieldText.toJsonTree((ContactExtraFieldText)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: ContactExtraFieldCellphone, ContactExtraFieldDate, ContactExtraFieldEmail, ContactExtraFieldNumber, ContactExtraFieldOptions, ContactExtraFieldPhone, ContactExtraFieldText");
                }

                @Override
                public ContactExtraFields read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize ContactExtraFieldCellphone
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContactExtraFieldCellphone.validateJsonObject(jsonObject);
                        actualAdapter = adapterContactExtraFieldCellphone;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContactExtraFieldCellphone'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContactExtraFieldCellphone failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContactExtraFieldCellphone'", e);
                    }

                    // deserialize ContactExtraFieldDate
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContactExtraFieldDate.validateJsonObject(jsonObject);
                        actualAdapter = adapterContactExtraFieldDate;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContactExtraFieldDate'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContactExtraFieldDate failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContactExtraFieldDate'", e);
                    }

                    // deserialize ContactExtraFieldEmail
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContactExtraFieldEmail.validateJsonObject(jsonObject);
                        actualAdapter = adapterContactExtraFieldEmail;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContactExtraFieldEmail'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContactExtraFieldEmail failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContactExtraFieldEmail'", e);
                    }

                    // deserialize ContactExtraFieldNumber
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContactExtraFieldNumber.validateJsonObject(jsonObject);
                        actualAdapter = adapterContactExtraFieldNumber;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContactExtraFieldNumber'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContactExtraFieldNumber failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContactExtraFieldNumber'", e);
                    }

                    // deserialize ContactExtraFieldOptions
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContactExtraFieldOptions.validateJsonObject(jsonObject);
                        actualAdapter = adapterContactExtraFieldOptions;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContactExtraFieldOptions'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContactExtraFieldOptions failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContactExtraFieldOptions'", e);
                    }

                    // deserialize ContactExtraFieldPhone
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContactExtraFieldPhone.validateJsonObject(jsonObject);
                        actualAdapter = adapterContactExtraFieldPhone;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContactExtraFieldPhone'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContactExtraFieldPhone failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContactExtraFieldPhone'", e);
                    }

                    // deserialize ContactExtraFieldText
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ContactExtraFieldText.validateJsonObject(jsonObject);
                        actualAdapter = adapterContactExtraFieldText;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'ContactExtraFieldText'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for ContactExtraFieldText failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'ContactExtraFieldText'", e);
                    }

                    if (match == 1) {
                        ContactExtraFields ret = new ContactExtraFields();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ContactExtraFields: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public ContactExtraFields() {
        super("oneOf", Boolean.FALSE);
    }

    public ContactExtraFields(ContactExtraFieldCellphone o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContactExtraFields(ContactExtraFieldDate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContactExtraFields(ContactExtraFieldEmail o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContactExtraFields(ContactExtraFieldNumber o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContactExtraFields(ContactExtraFieldOptions o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContactExtraFields(ContactExtraFieldPhone o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContactExtraFields(ContactExtraFieldText o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("ContactExtraFieldCellphone", new GenericType<ContactExtraFieldCellphone>() {
        });
        schemas.put("ContactExtraFieldDate", new GenericType<ContactExtraFieldDate>() {
        });
        schemas.put("ContactExtraFieldEmail", new GenericType<ContactExtraFieldEmail>() {
        });
        schemas.put("ContactExtraFieldNumber", new GenericType<ContactExtraFieldNumber>() {
        });
        schemas.put("ContactExtraFieldOptions", new GenericType<ContactExtraFieldOptions>() {
        });
        schemas.put("ContactExtraFieldPhone", new GenericType<ContactExtraFieldPhone>() {
        });
        schemas.put("ContactExtraFieldText", new GenericType<ContactExtraFieldText>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return ContactExtraFields.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * ContactExtraFieldCellphone, ContactExtraFieldDate, ContactExtraFieldEmail, ContactExtraFieldNumber, ContactExtraFieldOptions, ContactExtraFieldPhone, ContactExtraFieldText
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof ContactExtraFieldCellphone) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContactExtraFieldDate) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContactExtraFieldEmail) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContactExtraFieldNumber) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContactExtraFieldOptions) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContactExtraFieldPhone) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ContactExtraFieldText) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be ContactExtraFieldCellphone, ContactExtraFieldDate, ContactExtraFieldEmail, ContactExtraFieldNumber, ContactExtraFieldOptions, ContactExtraFieldPhone, ContactExtraFieldText");
    }

    /**
     * Get the actual instance, which can be the following:
     * ContactExtraFieldCellphone, ContactExtraFieldDate, ContactExtraFieldEmail, ContactExtraFieldNumber, ContactExtraFieldOptions, ContactExtraFieldPhone, ContactExtraFieldText
     *
     * @return The actual instance (ContactExtraFieldCellphone, ContactExtraFieldDate, ContactExtraFieldEmail, ContactExtraFieldNumber, ContactExtraFieldOptions, ContactExtraFieldPhone, ContactExtraFieldText)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContactExtraFieldCellphone`. If the actual instance is not `ContactExtraFieldCellphone`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContactExtraFieldCellphone`
     * @throws ClassCastException if the instance is not `ContactExtraFieldCellphone`
     */
    public ContactExtraFieldCellphone getContactExtraFieldCellphone() throws ClassCastException {
        return (ContactExtraFieldCellphone)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContactExtraFieldDate`. If the actual instance is not `ContactExtraFieldDate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContactExtraFieldDate`
     * @throws ClassCastException if the instance is not `ContactExtraFieldDate`
     */
    public ContactExtraFieldDate getContactExtraFieldDate() throws ClassCastException {
        return (ContactExtraFieldDate)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContactExtraFieldEmail`. If the actual instance is not `ContactExtraFieldEmail`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContactExtraFieldEmail`
     * @throws ClassCastException if the instance is not `ContactExtraFieldEmail`
     */
    public ContactExtraFieldEmail getContactExtraFieldEmail() throws ClassCastException {
        return (ContactExtraFieldEmail)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContactExtraFieldNumber`. If the actual instance is not `ContactExtraFieldNumber`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContactExtraFieldNumber`
     * @throws ClassCastException if the instance is not `ContactExtraFieldNumber`
     */
    public ContactExtraFieldNumber getContactExtraFieldNumber() throws ClassCastException {
        return (ContactExtraFieldNumber)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContactExtraFieldOptions`. If the actual instance is not `ContactExtraFieldOptions`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContactExtraFieldOptions`
     * @throws ClassCastException if the instance is not `ContactExtraFieldOptions`
     */
    public ContactExtraFieldOptions getContactExtraFieldOptions() throws ClassCastException {
        return (ContactExtraFieldOptions)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContactExtraFieldPhone`. If the actual instance is not `ContactExtraFieldPhone`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContactExtraFieldPhone`
     * @throws ClassCastException if the instance is not `ContactExtraFieldPhone`
     */
    public ContactExtraFieldPhone getContactExtraFieldPhone() throws ClassCastException {
        return (ContactExtraFieldPhone)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ContactExtraFieldText`. If the actual instance is not `ContactExtraFieldText`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ContactExtraFieldText`
     * @throws ClassCastException if the instance is not `ContactExtraFieldText`
     */
    public ContactExtraFieldText getContactExtraFieldText() throws ClassCastException {
        return (ContactExtraFieldText)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactExtraFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with ContactExtraFieldCellphone
    try {
      ContactExtraFieldCellphone.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContactExtraFieldCellphone failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ContactExtraFieldDate
    try {
      ContactExtraFieldDate.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContactExtraFieldDate failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ContactExtraFieldEmail
    try {
      ContactExtraFieldEmail.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContactExtraFieldEmail failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ContactExtraFieldNumber
    try {
      ContactExtraFieldNumber.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContactExtraFieldNumber failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ContactExtraFieldOptions
    try {
      ContactExtraFieldOptions.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContactExtraFieldOptions failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ContactExtraFieldPhone
    try {
      ContactExtraFieldPhone.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContactExtraFieldPhone failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with ContactExtraFieldText
    try {
      ContactExtraFieldText.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for ContactExtraFieldText failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for ContactExtraFields with oneOf schemas: ContactExtraFieldCellphone, ContactExtraFieldDate, ContactExtraFieldEmail, ContactExtraFieldNumber, ContactExtraFieldOptions, ContactExtraFieldPhone, ContactExtraFieldText. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of ContactExtraFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactExtraFields
  * @throws IOException if the JSON string is invalid with respect to ContactExtraFields
  */
  public static ContactExtraFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactExtraFields.class);
  }

 /**
  * Convert an instance of ContactExtraFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

