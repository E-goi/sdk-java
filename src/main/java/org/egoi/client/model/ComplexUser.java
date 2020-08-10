/*
 * APIv3 (Beta)
 *  # Introduction Just a quick peek!!! This is our new version of API. Remember, it is not stable yet!!! But we invite you play with it and give us your feedback ;) # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services.  * <a href='https://github.com/E-goi/sdk-java'>Java</a>  * <a href='https://github.com/E-goi/sdk-php'>PHP</a>  * <a href='https://github.com/E-goi/sdk-python'>Python</a>  * <a href='https://github.com/E-goi/sdk-ruby'>Ruby</a>  * <a href='https://github.com/E-goi/sdk-javascript'>Javascript</a>  * <a href='https://github.com/E-goi/sdk-csharp'>C#</a>  # Stream Limits Stream limits are security mesures we have to make sure our API have a fair use policy, for this reason, any request that creates or modifies data (**POST**, **PATCH** and **PUT**) is limited to a maximum of **20MB** of content length. If you arrive to this limit in one of your request, you'll receive a HTTP code **413 (Request Entity Too Large)** and the request will be ignored. To avoid this error in importation's requests, it's advised the request's division in batches that have each one less than 20MB. <security-definitions/>
 *
 * The version of the OpenAPI document: 3.0.0-beta
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
import org.egoi.client.model.ComplexUserAllOf;
import org.egoi.client.model.Language;
import org.egoi.client.model.User;
import org.threeten.bp.OffsetDateTime;

/**
 * Complex user schema
 */
@ApiModel(description = "Complex user schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-08-10T12:53:53.038698+01:00[Europe/Lisbon]")
public class ComplexUser   {
  public static final String SERIALIZED_NAME_USER_ID = "user_id";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_IS_ADMIN = "is_admin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin = false;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PROFILE_IMAGE = "profile_image";
  @SerializedName(SERIALIZED_NAME_PROFILE_IMAGE)
  private String profileImage;

  /**
   * User status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

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
  private StatusEnum status;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private Language language = Language.EN;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_SHOW_REMOVED_CONTACTS = "show_removed_contacts";
  @SerializedName(SERIALIZED_NAME_SHOW_REMOVED_CONTACTS)
  private Boolean showRemovedContacts = true;

  /**
   * User gender
   */
  @JsonAdapter(GenderEnum.Adapter.class)
  public enum GenderEnum {
    MALE("male"),
    
    FEMALE("female");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static GenderEnum fromValue(String value) {
      for (GenderEnum b : GenderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<GenderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final GenderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public GenderEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return GenderEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private GenderEnum gender;


   /**
   * Get userId
   * minimum: 1
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getUserId() {
    return userId;
  }




   /**
   * User login
   * @return username
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@e-goi.com", value = "User login")

  public String getUsername() {
    return username;
  }




   /**
   * True if user is admin, false otherwise
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if user is admin, false otherwise")

  public Boolean getIsAdmin() {
    return isAdmin;
  }




  public ComplexUser firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the user
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First name of the user")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public ComplexUser lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the user
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last name of the user")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public ComplexUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Email of the user
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "example@e-goi.com", value = "Email of the user")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public ComplexUser phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * User&#39;s phone (may be cellphone or phone)
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "351-300404336", value = "User's phone (may be cellphone or phone)")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


   /**
   * User&#39;s profile image
   * @return profileImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User's profile image")

  public String getProfileImage() {
    return profileImage;
  }




   /**
   * User status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User status")

  public StatusEnum getStatus() {
    return status;
  }




  public ComplexUser created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The date and time
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public ComplexUser updated(OffsetDateTime updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * The date and time
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public ComplexUser language(Language language) {
    
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


   /**
   * User timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Europe/Portugal/Lisbon", value = "User timezone")

  public String getTimezone() {
    return timezone;
  }




   /**
   * True if the user can see removed contacts, false otherwise
   * @return showRemovedContacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "True if the user can see removed contacts, false otherwise")

  public Boolean getShowRemovedContacts() {
    return showRemovedContacts;
  }




  public ComplexUser gender(GenderEnum gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * User gender
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User gender")

  public GenderEnum getGender() {
    return gender;
  }


  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComplexUser complexUser = (ComplexUser) o;
    return Objects.equals(this.userId, complexUser.userId) &&
        Objects.equals(this.username, complexUser.username) &&
        Objects.equals(this.isAdmin, complexUser.isAdmin) &&
        Objects.equals(this.firstName, complexUser.firstName) &&
        Objects.equals(this.lastName, complexUser.lastName) &&
        Objects.equals(this.email, complexUser.email) &&
        Objects.equals(this.phone, complexUser.phone) &&
        Objects.equals(this.profileImage, complexUser.profileImage) &&
        Objects.equals(this.status, complexUser.status) &&
        Objects.equals(this.created, complexUser.created) &&
        Objects.equals(this.updated, complexUser.updated) &&
        Objects.equals(this.language, complexUser.language) &&
        Objects.equals(this.timezone, complexUser.timezone) &&
        Objects.equals(this.showRemovedContacts, complexUser.showRemovedContacts) &&
        Objects.equals(this.gender, complexUser.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, username, isAdmin, firstName, lastName, email, phone, profileImage, status, created, updated, language, timezone, showRemovedContacts, gender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComplexUser {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    showRemovedContacts: ").append(toIndentedString(showRemovedContacts)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

