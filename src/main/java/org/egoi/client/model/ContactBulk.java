/*
 * APIv3 (Beta)
 *  # Introduction Just a quick peek!!! This is our new version of API. Remember, it is not stable yet!!! But we invite you play with it and give us your feedback ;) # Getting Started  E-goi can be integrated with many environments and programming languages via our REST API. We've created a developer focused portal to give your organization a clear and quick overview of how to integrate with E-goi. The developer portal focuses on scenarios for integration and flow of events. We recommend familiarizing yourself with all of the content in the developer portal, before start using our rest API.   The E-goi  APIv3 is served over HTTPS. To ensure data privacy, unencrypted HTTP is not supported.  Request data is passed to the API by POSTing JSON objects to the API endpoints with the appropriate parameters.   BaseURL = api.egoiapp.com  # RESTful Services This API supports 5 HTTP methods:  * <b>GET</b>: The HTTP GET method is used to **read** (or retrieve) a representation of a resource. * <b>POST</b>: The POST verb is most-often utilized to **create** new resources. * <b>PATCH</b>: PATCH is used for **modify** capabilities. The PATCH request only needs to contain the changes to the resource, not the complete resource * <b>PUT</b>: PUT is most-often utilized for **update** capabilities, PUT-ing to a known resource URI with the request body containing the newly-updated representation of the original resource. * <b>DELETE</b>: DELETE is pretty easy to understand. It is used to **delete** a resource identified by a URI.  # Authentication   We use a custom authentication method, you will need a apikey that you can find in your account settings. Below you will see a curl example to get your account information:  #!/bin/bash  curl -X GET 'https://api.egoiapp.com/my-account' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>'  Here you can see a curl Post example with authentication:  #!/bin/bash  curl -X POST 'http://api.egoiapp.com/tags' \\  -H 'accept: application/json' \\  -H 'Apikey: <YOUR_APY_KEY>' \\  -H 'Content-Type: application/json' \\  -d '{`name`:`Your custom tag`,`color`:`#FFFFFF`}'  # SDK Get started quickly with E-goi with our integration tools. Our SDK is a modern open source library that makes it easy to integrate your application with E-goi services. * <b><a href='https://github.com/E-goi/sdk-java'>Java</a></b> * <b><a href='https://github.com/E-goi/sdk-php'>PHP</a></b> * <b><a href='https://github.com/E-goi/sdk-python'>Python</a></b>  <security-definitions/>
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
import java.util.ArrayList;
import java.util.List;
import org.egoi.client.model.ContactBaseExtraBulk;
import org.egoi.client.model.ContactExtraFieldsBulk;
import org.egoi.client.model.ContactInsideBaseBulk;
import org.egoi.client.model.ContactTagsBulk;

/**
 * Contact schema
 */
@ApiModel(description = "Contact schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-19T15:12:15.913371Z[Europe/Lisbon]")
public class ContactBulk   {
  public static final String SERIALIZED_NAME_BASE = "base";
  @SerializedName(SERIALIZED_NAME_BASE)
  private ContactInsideBaseBulk base;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private List<ContactExtraFieldsBulk> extra = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<Integer> tags = null;


  public ContactBulk base(ContactInsideBaseBulk base) {
    
    this.base = base;
    return this;
  }

   /**
   * Contact base fields
   * @return base
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contact base fields")

  public ContactInsideBaseBulk getBase() {
    return base;
  }


  public void setBase(ContactInsideBaseBulk base) {
    this.base = base;
  }


  public ContactBulk extra(List<ContactExtraFieldsBulk> extra) {
    
    this.extra = extra;
    return this;
  }

  public ContactBulk addExtraItem(ContactExtraFieldsBulk extraItem) {
    if (this.extra == null) {
      this.extra = new ArrayList<ContactExtraFieldsBulk>();
    }
    this.extra.add(extraItem);
    return this;
  }

   /**
   * Array of the contact&#39;s extra fields
   * @return extra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of the contact's extra fields")

  public List<ContactExtraFieldsBulk> getExtra() {
    return extra;
  }


  public void setExtra(List<ContactExtraFieldsBulk> extra) {
    this.extra = extra;
  }


   /**
   * Array of tags for this contact
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[1,2]", value = "Array of tags for this contact")

  public List<Integer> getTags() {
    return tags;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactBulk contactBulk = (ContactBulk) o;
    return Objects.equals(this.base, contactBulk.base) &&
        Objects.equals(this.extra, contactBulk.extra) &&
        Objects.equals(this.tags, contactBulk.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, extra, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactBulk {\n");
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

