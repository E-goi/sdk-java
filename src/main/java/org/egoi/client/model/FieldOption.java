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

/**
 * Field option schema
 */
@ApiModel(description = "Field option schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-19T15:12:15.913371Z[Europe/Lisbon]")
public class FieldOption   {
  public static final String SERIALIZED_NAME_OPTION_ID = "option_id";
  @SerializedName(SERIALIZED_NAME_OPTION_ID)
  private Integer optionId;

  public static final String SERIALIZED_NAME_EN = "en";
  @SerializedName(SERIALIZED_NAME_EN)
  private String en;

  public static final String SERIALIZED_NAME_PT = "pt";
  @SerializedName(SERIALIZED_NAME_PT)
  private String pt;

  public static final String SERIALIZED_NAME_BR = "br";
  @SerializedName(SERIALIZED_NAME_BR)
  private String br;

  public static final String SERIALIZED_NAME_ES = "es";
  @SerializedName(SERIALIZED_NAME_ES)
  private String es;

  public static final String SERIALIZED_NAME_DE = "de";
  @SerializedName(SERIALIZED_NAME_DE)
  private String de;

  public static final String SERIALIZED_NAME_HU = "hu";
  @SerializedName(SERIALIZED_NAME_HU)
  private String hu;

  public static final String SERIALIZED_NAME_FR = "fr";
  @SerializedName(SERIALIZED_NAME_FR)
  private String fr;


   /**
   * Get optionId
   * minimum: 1
   * @return optionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getOptionId() {
    return optionId;
  }




  public FieldOption en(String en) {
    
    this.en = en;
    return this;
  }

   /**
   * English option value
   * @return en
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "English example", value = "English option value")

  public String getEn() {
    return en;
  }


  public void setEn(String en) {
    this.en = en;
  }


  public FieldOption pt(String pt) {
    
    this.pt = pt;
    return this;
  }

   /**
   * Portuguese option value
   * @return pt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Portuguese example", value = "Portuguese option value")

  public String getPt() {
    return pt;
  }


  public void setPt(String pt) {
    this.pt = pt;
  }


  public FieldOption br(String br) {
    
    this.br = br;
    return this;
  }

   /**
   * Brazilian portuguese option value
   * @return br
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Brazilian portuguese example", value = "Brazilian portuguese option value")

  public String getBr() {
    return br;
  }


  public void setBr(String br) {
    this.br = br;
  }


  public FieldOption es(String es) {
    
    this.es = es;
    return this;
  }

   /**
   * Spanish option value
   * @return es
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Spanish example", value = "Spanish option value")

  public String getEs() {
    return es;
  }


  public void setEs(String es) {
    this.es = es;
  }


  public FieldOption de(String de) {
    
    this.de = de;
    return this;
  }

   /**
   * German option value
   * @return de
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "German example", value = "German option value")

  public String getDe() {
    return de;
  }


  public void setDe(String de) {
    this.de = de;
  }


  public FieldOption hu(String hu) {
    
    this.hu = hu;
    return this;
  }

   /**
   * Hungarian option value
   * @return hu
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hungarian example", value = "Hungarian option value")

  public String getHu() {
    return hu;
  }


  public void setHu(String hu) {
    this.hu = hu;
  }


  public FieldOption fr(String fr) {
    
    this.fr = fr;
    return this;
  }

   /**
   * French option value
   * @return fr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "French example", value = "French option value")

  public String getFr() {
    return fr;
  }


  public void setFr(String fr) {
    this.fr = fr;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldOption fieldOption = (FieldOption) o;
    return Objects.equals(this.optionId, fieldOption.optionId) &&
        Objects.equals(this.en, fieldOption.en) &&
        Objects.equals(this.pt, fieldOption.pt) &&
        Objects.equals(this.br, fieldOption.br) &&
        Objects.equals(this.es, fieldOption.es) &&
        Objects.equals(this.de, fieldOption.de) &&
        Objects.equals(this.hu, fieldOption.hu) &&
        Objects.equals(this.fr, fieldOption.fr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionId, en, pt, br, es, de, hu, fr);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldOption {\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("    pt: ").append(toIndentedString(pt)).append("\n");
    sb.append("    br: ").append(toIndentedString(br)).append("\n");
    sb.append("    es: ").append(toIndentedString(es)).append("\n");
    sb.append("    de: ").append(toIndentedString(de)).append("\n");
    sb.append("    hu: ").append(toIndentedString(hu)).append("\n");
    sb.append("    fr: ").append(toIndentedString(fr)).append("\n");
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

