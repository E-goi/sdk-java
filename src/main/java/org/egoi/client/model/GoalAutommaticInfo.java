/*
 * APIv3 (New)
 *  # Introduction This is our new version of API. We invite you to start using it and give us your feedback # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB.  # Timeouts Timeouts set a maximum waiting time on a request's response. Our API, sets a default timeout for each request and when breached, you'll receive an HTTP **408 (Request Timeout)** error code. You should take into consideration that response times can vary widely based on the complexity of the request, amount of data being analyzed, and the load on the system and workspace at the time of the query. When dealing with such errors, you should first attempt to reduce the complexity and amount of data under analysis, and only then, if problems are still occurring ask for support.  For all these reasons, the default timeout for each request is **10 Seconds** and any request that creates or modifies data (**POST**, **PATCH** and **PUT**) will have a timeout of **60 Seconds**. Specific timeouts may exist for specific requests, these can be found in the request's documentation.  <security-definitions/>
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
import org.egoi.client.model.Bool;

/**
 * Automatic goal info schema
 */
@ApiModel(description = "Automatic goal info schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T20:27:19.076308+01:00[Europe/Lisbon]")
public class GoalAutommaticInfo  implements GoalInfo {
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
  private Bool caseSensitive = null;

  public static final String SERIALIZED_NAME_MULTIPLE_CONVERSION = "multiple_conversion";
  @SerializedName(SERIALIZED_NAME_MULTIPLE_CONVERSION)
  private Bool multipleConversion = null;


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


  public GoalAutommaticInfo caseSensitive(Bool caseSensitive) {
    
    this.caseSensitive = caseSensitive;
    return this;
  }

   /**
   * Goal pattern case sensitive
   * @return caseSensitive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Goal pattern case sensitive")

  public Bool getCaseSensitive() {
    return caseSensitive;
  }


  public void setCaseSensitive(Bool caseSensitive) {
    this.caseSensitive = caseSensitive;
  }


  public GoalAutommaticInfo multipleConversion(Bool multipleConversion) {
    
    this.multipleConversion = multipleConversion;
    return this;
  }

   /**
   * Goal is multiple conversion
   * @return multipleConversion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Goal is multiple conversion")

  public Bool getMultipleConversion() {
    return multipleConversion;
  }


  public void setMultipleConversion(Bool multipleConversion) {
    this.multipleConversion = multipleConversion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
