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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.egoi.client.JSON;

/**
 * Automatic goal info schema
 */
@ApiModel(description = "Automatic goal info schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-24T11:21:14.263836Z[Europe/Lisbon]")
public class GoalAutommaticInfo {
  /**
   * Goal type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    AUTOMATIC("automatic");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  /**
   * Goal rule
   */
  @JsonAdapter(RuleEnum.Adapter.class)
  public enum RuleEnum {
    URL("url"),
    
    TITLE("title"),
    
    DOWNLOAD("download"),
    
    EXTERNAL_URL("external_url");

    private String value;

    RuleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RuleEnum fromValue(String value) {
      for (RuleEnum b : RuleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RuleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RuleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RuleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private RuleEnum rule;

  /**
   * Goal condition
   */
  @JsonAdapter(ConditionEnum.Adapter.class)
  public enum ConditionEnum {
    CONTAINS("contains"),
    
    EXACTLY("exactly"),
    
    REGEX("regex");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConditionEnum fromValue(String value) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConditionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConditionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConditionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConditionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONDITION = "condition";
  @SerializedName(SERIALIZED_NAME_CONDITION)
  private ConditionEnum condition;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_CASE_SENSITIVE = "case_sensitive";
  @SerializedName(SERIALIZED_NAME_CASE_SENSITIVE)
  private Boolean caseSensitive;

  public static final String SERIALIZED_NAME_MULTIPLE_CONVERSION = "multiple_conversion";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_CONVERSION)
  private Boolean multipleConversion;

  public GoalAutommaticInfo() {
  }

  public GoalAutommaticInfo type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Goal type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Goal type")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public GoalAutommaticInfo rule(RuleEnum rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * Goal rule
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Goal rule")

  public RuleEnum getRule() {
    return rule;
  }


  public void setRule(RuleEnum rule) {
    this.rule = rule;
  }


  public GoalAutommaticInfo condition(ConditionEnum condition) {
    
    this.condition = condition;
    return this;
  }

   /**
   * Goal condition
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Goal condition")

  public ConditionEnum getCondition() {
    return condition;
  }


  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }


  public GoalAutommaticInfo pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * Goal pattern
   * @return pattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "checkout/confirmation", value = "Goal pattern")

  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public GoalAutommaticInfo caseSensitive(Boolean caseSensitive) {
    
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Goal pattern case sensitive
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Goal pattern case sensitive")

  public Boolean getCaseSensitive() {
    return caseSensitive;
  }


  public void setCaseSensitive(Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public GoalAutommaticInfo multipleConversion(Boolean multipleConversion) {
    
    this.multipleConversion = multipleConversion;
    return this;
  }

   /**
   * Goal is multiple conversion
   * @return multipleConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Goal is multiple conversion")

  public Boolean getMultipleConversion() {
    return multipleConversion;
  }


  public void setMultipleConversion(Boolean multipleConversion) {
    this.multipleConversion = multipleConversion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalAutommaticInfo goalAutommaticInfo = (GoalAutommaticInfo) o;
    return Objects.equals(this.type, goalAutommaticInfo.type) &&
        Objects.equals(this.rule, goalAutommaticInfo.rule) &&
        Objects.equals(this.condition, goalAutommaticInfo.condition) &&
        Objects.equals(this.pattern, goalAutommaticInfo.pattern) &&
        Objects.equals(this.caseSensitive, goalAutommaticInfo.caseSensitive) &&
        Objects.equals(this.multipleConversion, goalAutommaticInfo.multipleConversion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, rule, condition, pattern, caseSensitive, multipleConversion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalAutommaticInfo {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
    sb.append("    multipleConversion: ").append(toIndentedString(multipleConversion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("type");
    openapiFields.add("rule");
    openapiFields.add("condition");
    openapiFields.add("pattern");
    openapiFields.add("case_sensitive");
    openapiFields.add("multiple_conversion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GoalAutommaticInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GoalAutommaticInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GoalAutommaticInfo is not found in the empty JSON string", GoalAutommaticInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GoalAutommaticInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GoalAutommaticInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("rule") != null && !jsonObj.get("rule").isJsonNull()) && !jsonObj.get("rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rule").toString()));
      }
      if ((jsonObj.get("condition") != null && !jsonObj.get("condition").isJsonNull()) && !jsonObj.get("condition").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `condition` to be a primitive type in the JSON string but got `%s`", jsonObj.get("condition").toString()));
      }
      if ((jsonObj.get("pattern") != null && !jsonObj.get("pattern").isJsonNull()) && !jsonObj.get("pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pattern").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GoalAutommaticInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GoalAutommaticInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GoalAutommaticInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GoalAutommaticInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<GoalAutommaticInfo>() {
           @Override
           public void write(JsonWriter out, GoalAutommaticInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GoalAutommaticInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GoalAutommaticInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GoalAutommaticInfo
  * @throws IOException if the JSON string is invalid with respect to GoalAutommaticInfo
  */
  public static GoalAutommaticInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GoalAutommaticInfo.class);
  }

 /**
  * Convert an instance of GoalAutommaticInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

