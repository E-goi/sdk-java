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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner;
import org.egoi.client.model.ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner;
import org.egoi.client.model.Language;

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
 * Contact base fields
 */
@ApiModel(description = "Contact base fields")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-30T16:00:36.862706+01:00[Europe/Lisbon]")
public class ContactBaseWithStatusFieldsSchemaBase {
  public static final String SERIALIZED_NAME_CONTACT_ID = "contact_id";
  @SerializedName(SERIALIZED_NAME_CONTACT_ID)
  private String contactId;

  /**
   * Status of the contact
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    REMOVED("removed"),
    
    UNCONFIRMED("unconfirmed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status = StatusEnum.ACTIVE;

  /**
   * Contact consent
   */
  @JsonAdapter(ConsentEnum.Adapter.class)
  public enum ConsentEnum {
    ANY("any"),
    
    CONSENT("consent"),
    
    CONTRACT("contract"),
    
    LEGITIMATE_INTEREST("legitimate_interest"),
    
    NONE("none"),
    
    PROTECT_VITAL_INTERESTS("protect_vital_interests"),
    
    PUBLIC_INTERESTS("public_interests"),
    
    REQUIRED_BY_LAW("required_by_law"),
    
    WITHDRAWN("withdrawn");

    private String value;

    ConsentEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConsentEnum fromValue(String value) {
      for (ConsentEnum b : ConsentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConsentEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConsentEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConsentEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConsentEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONSENT = "consent";
  @SerializedName(SERIALIZED_NAME_CONSENT)
  private ConsentEnum consent;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_BIRTH_DATE = "birth_date";
  @SerializedName(SERIALIZED_NAME_BIRTH_DATE)
  private LocalDate birthDate;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Language language = Language.EN;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  /**
   * Email channel status
   */
  @JsonAdapter(EmailStatusEnum.Adapter.class)
  public enum EmailStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    EmailStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EmailStatusEnum fromValue(String value) {
      for (EmailStatusEnum b : EmailStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EmailStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EmailStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EmailStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EmailStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_EMAIL_STATUS = "email_status";
  @SerializedName(SERIALIZED_NAME_EMAIL_STATUS)
  private EmailStatusEnum emailStatus;

  public static final String SERIALIZED_NAME_CELLPHONE = "cellphone";
  @SerializedName(SERIALIZED_NAME_CELLPHONE)
  private String cellphone;

  /**
   * Cellphone channel status
   */
  @JsonAdapter(CellphoneStatusEnum.Adapter.class)
  public enum CellphoneStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    CellphoneStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CellphoneStatusEnum fromValue(String value) {
      for (CellphoneStatusEnum b : CellphoneStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CellphoneStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CellphoneStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CellphoneStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CellphoneStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CELLPHONE_STATUS = "cellphone_status";
  @SerializedName(SERIALIZED_NAME_CELLPHONE_STATUS)
  private CellphoneStatusEnum cellphoneStatus;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  /**
   * Phone channel status
   */
  @JsonAdapter(PhoneStatusEnum.Adapter.class)
  public enum PhoneStatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    PhoneStatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PhoneStatusEnum fromValue(String value) {
      for (PhoneStatusEnum b : PhoneStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PhoneStatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PhoneStatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PhoneStatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PhoneStatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PHONE_STATUS = "phone_status";
  @SerializedName(SERIALIZED_NAME_PHONE_STATUS)
  private PhoneStatusEnum phoneStatus;

  public static final String SERIALIZED_NAME_PUSH_TOKEN_ANDROID = "push_token_android";
  @SerializedName(SERIALIZED_NAME_PUSH_TOKEN_ANDROID)
  private List<ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner> pushTokenAndroid = null;

  public static final String SERIALIZED_NAME_PUSH_TOKEN_IOS = "push_token_ios";
  @SerializedName(SERIALIZED_NAME_PUSH_TOKEN_IOS)
  private List<ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner> pushTokenIos = null;

  public ContactBaseWithStatusFieldsSchemaBase() {
  }

  
  public ContactBaseWithStatusFieldsSchemaBase(
     String contactId
  ) {
    this();
    this.contactId = contactId;
  }

   /**
   * Get contactId
   * @return contactId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8f3a27ef26", value = "")

  public String getContactId() {
    return contactId;
  }




  public ContactBaseWithStatusFieldsSchemaBase status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the contact
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the contact")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public ContactBaseWithStatusFieldsSchemaBase consent(ConsentEnum consent) {
    
    this.consent = consent;
    return this;
  }

   /**
   * Contact consent
   * @return consent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact consent")

  public ConsentEnum getConsent() {
    return consent;
  }


  public void setConsent(ConsentEnum consent) {
    this.consent = consent;
  }


  public ContactBaseWithStatusFieldsSchemaBase firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the contact
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "John", value = "First name of the contact")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ContactBaseWithStatusFieldsSchemaBase lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the contact
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "Last name of the contact")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ContactBaseWithStatusFieldsSchemaBase birthDate(LocalDate birthDate) {
    
    this.birthDate = birthDate;
    return this;
  }

   /**
   * Birth date of the contact
   * @return birthDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Jan 10 01:00:00 WET 1975", value = "Birth date of the contact")

  public LocalDate getBirthDate() {
    return birthDate;
  }


  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }


  public ContactBaseWithStatusFieldsSchemaBase language(Language language) {
    
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Language getLanguage() {
    return language;
  }


  public void setLanguage(Language language) {
    this.language = language;
  }


  public ContactBaseWithStatusFieldsSchemaBase email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of the contact
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@e-goi.com", value = "Email of the contact")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ContactBaseWithStatusFieldsSchemaBase emailStatus(EmailStatusEnum emailStatus) {
    
    this.emailStatus = emailStatus;
    return this;
  }

   /**
   * Email channel status
   * @return emailStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email channel status")

  public EmailStatusEnum getEmailStatus() {
    return emailStatus;
  }


  public void setEmailStatus(EmailStatusEnum emailStatus) {
    this.emailStatus = emailStatus;
  }


  public ContactBaseWithStatusFieldsSchemaBase cellphone(String cellphone) {
    
    this.cellphone = cellphone;
    return this;
  }

   /**
   * Cellphone of the contact (country code followed by phone number, split by &#39;-&#39;)
   * @return cellphone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "351-300404336", value = "Cellphone of the contact (country code followed by phone number, split by '-')")

  public String getCellphone() {
    return cellphone;
  }


  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }


  public ContactBaseWithStatusFieldsSchemaBase cellphoneStatus(CellphoneStatusEnum cellphoneStatus) {
    
    this.cellphoneStatus = cellphoneStatus;
    return this;
  }

   /**
   * Cellphone channel status
   * @return cellphoneStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cellphone channel status")

  public CellphoneStatusEnum getCellphoneStatus() {
    return cellphoneStatus;
  }


  public void setCellphoneStatus(CellphoneStatusEnum cellphoneStatus) {
    this.cellphoneStatus = cellphoneStatus;
  }


  public ContactBaseWithStatusFieldsSchemaBase phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Phone of the contact (country code followed by phone number, split by &#39;-&#39;)
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "351-300404336", value = "Phone of the contact (country code followed by phone number, split by '-')")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public ContactBaseWithStatusFieldsSchemaBase phoneStatus(PhoneStatusEnum phoneStatus) {
    
    this.phoneStatus = phoneStatus;
    return this;
  }

   /**
   * Phone channel status
   * @return phoneStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone channel status")

  public PhoneStatusEnum getPhoneStatus() {
    return phoneStatus;
  }


  public void setPhoneStatus(PhoneStatusEnum phoneStatus) {
    this.phoneStatus = phoneStatus;
  }


  public ContactBaseWithStatusFieldsSchemaBase pushTokenAndroid(List<ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner> pushTokenAndroid) {
    
    this.pushTokenAndroid = pushTokenAndroid;
    return this;
  }

  public ContactBaseWithStatusFieldsSchemaBase addPushTokenAndroidItem(ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner pushTokenAndroidItem) {
    if (this.pushTokenAndroid == null) {
      this.pushTokenAndroid = new ArrayList<>();
    }
    this.pushTokenAndroid.add(pushTokenAndroidItem);
    return this;
  }

   /**
   * Android push token of the contact
   * @return pushTokenAndroid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Android push token of the contact")

  public List<ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner> getPushTokenAndroid() {
    return pushTokenAndroid;
  }


  public void setPushTokenAndroid(List<ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner> pushTokenAndroid) {
    this.pushTokenAndroid = pushTokenAndroid;
  }


  public ContactBaseWithStatusFieldsSchemaBase pushTokenIos(List<ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner> pushTokenIos) {
    
    this.pushTokenIos = pushTokenIos;
    return this;
  }

  public ContactBaseWithStatusFieldsSchemaBase addPushTokenIosItem(ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner pushTokenIosItem) {
    if (this.pushTokenIos == null) {
      this.pushTokenIos = new ArrayList<>();
    }
    this.pushTokenIos.add(pushTokenIosItem);
    return this;
  }

   /**
   * IOS push token of the contact
   * @return pushTokenIos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IOS push token of the contact")

  public List<ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner> getPushTokenIos() {
    return pushTokenIos;
  }


  public void setPushTokenIos(List<ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner> pushTokenIos) {
    this.pushTokenIos = pushTokenIos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactBaseWithStatusFieldsSchemaBase contactBaseWithStatusFieldsSchemaBase = (ContactBaseWithStatusFieldsSchemaBase) o;
    return Objects.equals(this.contactId, contactBaseWithStatusFieldsSchemaBase.contactId) &&
        Objects.equals(this.status, contactBaseWithStatusFieldsSchemaBase.status) &&
        Objects.equals(this.consent, contactBaseWithStatusFieldsSchemaBase.consent) &&
        Objects.equals(this.firstName, contactBaseWithStatusFieldsSchemaBase.firstName) &&
        Objects.equals(this.lastName, contactBaseWithStatusFieldsSchemaBase.lastName) &&
        Objects.equals(this.birthDate, contactBaseWithStatusFieldsSchemaBase.birthDate) &&
        Objects.equals(this.language, contactBaseWithStatusFieldsSchemaBase.language) &&
        Objects.equals(this.email, contactBaseWithStatusFieldsSchemaBase.email) &&
        Objects.equals(this.emailStatus, contactBaseWithStatusFieldsSchemaBase.emailStatus) &&
        Objects.equals(this.cellphone, contactBaseWithStatusFieldsSchemaBase.cellphone) &&
        Objects.equals(this.cellphoneStatus, contactBaseWithStatusFieldsSchemaBase.cellphoneStatus) &&
        Objects.equals(this.phone, contactBaseWithStatusFieldsSchemaBase.phone) &&
        Objects.equals(this.phoneStatus, contactBaseWithStatusFieldsSchemaBase.phoneStatus) &&
        Objects.equals(this.pushTokenAndroid, contactBaseWithStatusFieldsSchemaBase.pushTokenAndroid) &&
        Objects.equals(this.pushTokenIos, contactBaseWithStatusFieldsSchemaBase.pushTokenIos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactId, status, consent, firstName, lastName, birthDate, language, email, emailStatus, cellphone, cellphoneStatus, phone, phoneStatus, pushTokenAndroid, pushTokenIos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactBaseWithStatusFieldsSchemaBase {\n");
    sb.append("    contactId: ").append(toIndentedString(contactId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emailStatus: ").append(toIndentedString(emailStatus)).append("\n");
    sb.append("    cellphone: ").append(toIndentedString(cellphone)).append("\n");
    sb.append("    cellphoneStatus: ").append(toIndentedString(cellphoneStatus)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    phoneStatus: ").append(toIndentedString(phoneStatus)).append("\n");
    sb.append("    pushTokenAndroid: ").append(toIndentedString(pushTokenAndroid)).append("\n");
    sb.append("    pushTokenIos: ").append(toIndentedString(pushTokenIos)).append("\n");
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
    openapiFields.add("contact_id");
    openapiFields.add("status");
    openapiFields.add("consent");
    openapiFields.add("first_name");
    openapiFields.add("last_name");
    openapiFields.add("birth_date");
    openapiFields.add("language");
    openapiFields.add("email");
    openapiFields.add("email_status");
    openapiFields.add("cellphone");
    openapiFields.add("cellphone_status");
    openapiFields.add("phone");
    openapiFields.add("phone_status");
    openapiFields.add("push_token_android");
    openapiFields.add("push_token_ios");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContactBaseWithStatusFieldsSchemaBase
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ContactBaseWithStatusFieldsSchemaBase.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContactBaseWithStatusFieldsSchemaBase is not found in the empty JSON string", ContactBaseWithStatusFieldsSchemaBase.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContactBaseWithStatusFieldsSchemaBase.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContactBaseWithStatusFieldsSchemaBase` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("contact_id") != null && !jsonObj.get("contact_id").isJsonNull()) && !jsonObj.get("contact_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contact_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contact_id").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("consent") != null && !jsonObj.get("consent").isJsonNull()) && !jsonObj.get("consent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `consent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("consent").toString()));
      }
      if ((jsonObj.get("first_name") != null && !jsonObj.get("first_name").isJsonNull()) && !jsonObj.get("first_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `first_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("first_name").toString()));
      }
      if ((jsonObj.get("last_name") != null && !jsonObj.get("last_name").isJsonNull()) && !jsonObj.get("last_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_name").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("email_status") != null && !jsonObj.get("email_status").isJsonNull()) && !jsonObj.get("email_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email_status").toString()));
      }
      if ((jsonObj.get("cellphone") != null && !jsonObj.get("cellphone").isJsonNull()) && !jsonObj.get("cellphone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cellphone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cellphone").toString()));
      }
      if ((jsonObj.get("cellphone_status") != null && !jsonObj.get("cellphone_status").isJsonNull()) && !jsonObj.get("cellphone_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cellphone_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cellphone_status").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("phone_status") != null && !jsonObj.get("phone_status").isJsonNull()) && !jsonObj.get("phone_status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_status").toString()));
      }
      if (jsonObj.get("push_token_android") != null && !jsonObj.get("push_token_android").isJsonNull()) {
        JsonArray jsonArraypushTokenAndroid = jsonObj.getAsJsonArray("push_token_android");
        if (jsonArraypushTokenAndroid != null) {
          // ensure the json data is an array
          if (!jsonObj.get("push_token_android").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `push_token_android` to be an array in the JSON string but got `%s`", jsonObj.get("push_token_android").toString()));
          }

          // validate the optional field `push_token_android` (array)
          for (int i = 0; i < jsonArraypushTokenAndroid.size(); i++) {
            ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner.validateJsonObject(jsonArraypushTokenAndroid.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("push_token_ios") != null && !jsonObj.get("push_token_ios").isJsonNull()) {
        JsonArray jsonArraypushTokenIos = jsonObj.getAsJsonArray("push_token_ios");
        if (jsonArraypushTokenIos != null) {
          // ensure the json data is an array
          if (!jsonObj.get("push_token_ios").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `push_token_ios` to be an array in the JSON string but got `%s`", jsonObj.get("push_token_ios").toString()));
          }

          // validate the optional field `push_token_ios` (array)
          for (int i = 0; i < jsonArraypushTokenIos.size(); i++) {
            ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner.validateJsonObject(jsonArraypushTokenIos.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContactBaseWithStatusFieldsSchemaBase.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContactBaseWithStatusFieldsSchemaBase' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContactBaseWithStatusFieldsSchemaBase> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContactBaseWithStatusFieldsSchemaBase.class));

       return (TypeAdapter<T>) new TypeAdapter<ContactBaseWithStatusFieldsSchemaBase>() {
           @Override
           public void write(JsonWriter out, ContactBaseWithStatusFieldsSchemaBase value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContactBaseWithStatusFieldsSchemaBase read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContactBaseWithStatusFieldsSchemaBase given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContactBaseWithStatusFieldsSchemaBase
  * @throws IOException if the JSON string is invalid with respect to ContactBaseWithStatusFieldsSchemaBase
  */
  public static ContactBaseWithStatusFieldsSchemaBase fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContactBaseWithStatusFieldsSchemaBase.class);
  }

 /**
  * Convert an instance of ContactBaseWithStatusFieldsSchemaBase to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

