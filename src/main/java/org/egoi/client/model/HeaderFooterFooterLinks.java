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
 * HeaderFooterFooterLinks
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-02-19T15:12:15.913371Z[Europe/Lisbon]")
public class HeaderFooterFooterLinks   {
  public static final String SERIALIZED_NAME_FORWARD = "forward";
  @SerializedName(SERIALIZED_NAME_FORWARD)
  private Boolean forward = false;

  public static final String SERIALIZED_NAME_VIEW_WEB = "view_web";
  @SerializedName(SERIALIZED_NAME_VIEW_WEB)
  private Boolean viewWeb = false;

  public static final String SERIALIZED_NAME_UNSUBSCRIBE = "unsubscribe";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBE)
  private Boolean unsubscribe = false;

  public static final String SERIALIZED_NAME_FOOTER_LINKS = "footer_links";
  @SerializedName(SERIALIZED_NAME_FOOTER_LINKS)
  private Boolean footerLinks = false;

  public static final String SERIALIZED_NAME_SOCIAL_SHARE = "social_share";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SHARE)
  private Boolean socialShare = false;

  public static final String SERIALIZED_NAME_FACEBOOK_SHARE = "facebook_share";
  @SerializedName(SERIALIZED_NAME_FACEBOOK_SHARE)
  private Boolean facebookShare = false;

  public static final String SERIALIZED_NAME_TWITTER_SHARE = "twitter_share";
  @SerializedName(SERIALIZED_NAME_TWITTER_SHARE)
  private Boolean twitterShare = false;


  public HeaderFooterFooterLinks forward(Boolean forward) {
    
    this.forward = forward;
    return this;
  }

   /**
   * Use view forward footer link
   * @return forward
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use view forward footer link")

  public Boolean getForward() {
    return forward;
  }


  public void setForward(Boolean forward) {
    this.forward = forward;
  }


  public HeaderFooterFooterLinks viewWeb(Boolean viewWeb) {
    
    this.viewWeb = viewWeb;
    return this;
  }

   /**
   * Use view view in web footer link
   * @return viewWeb
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use view view in web footer link")

  public Boolean getViewWeb() {
    return viewWeb;
  }


  public void setViewWeb(Boolean viewWeb) {
    this.viewWeb = viewWeb;
  }


  public HeaderFooterFooterLinks unsubscribe(Boolean unsubscribe) {
    
    this.unsubscribe = unsubscribe;
    return this;
  }

   /**
   * Use view unsubscribe footer link
   * @return unsubscribe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use view unsubscribe footer link")

  public Boolean getUnsubscribe() {
    return unsubscribe;
  }


  public void setUnsubscribe(Boolean unsubscribe) {
    this.unsubscribe = unsubscribe;
  }


  public HeaderFooterFooterLinks footerLinks(Boolean footerLinks) {
    
    this.footerLinks = footerLinks;
    return this;
  }

   /**
   * Use view edit footer link
   * @return footerLinks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use view edit footer link")

  public Boolean getFooterLinks() {
    return footerLinks;
  }


  public void setFooterLinks(Boolean footerLinks) {
    this.footerLinks = footerLinks;
  }


  public HeaderFooterFooterLinks socialShare(Boolean socialShare) {
    
    this.socialShare = socialShare;
    return this;
  }

   /**
   * Use view social share footer link
   * @return socialShare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use view social share footer link")

  public Boolean getSocialShare() {
    return socialShare;
  }


  public void setSocialShare(Boolean socialShare) {
    this.socialShare = socialShare;
  }


  public HeaderFooterFooterLinks facebookShare(Boolean facebookShare) {
    
    this.facebookShare = facebookShare;
    return this;
  }

   /**
   * Use view facebook share footer link
   * @return facebookShare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use view facebook share footer link")

  public Boolean getFacebookShare() {
    return facebookShare;
  }


  public void setFacebookShare(Boolean facebookShare) {
    this.facebookShare = facebookShare;
  }


  public HeaderFooterFooterLinks twitterShare(Boolean twitterShare) {
    
    this.twitterShare = twitterShare;
    return this;
  }

   /**
   * Use view twitter share footer link
   * @return twitterShare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use view twitter share footer link")

  public Boolean getTwitterShare() {
    return twitterShare;
  }


  public void setTwitterShare(Boolean twitterShare) {
    this.twitterShare = twitterShare;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeaderFooterFooterLinks headerFooterFooterLinks = (HeaderFooterFooterLinks) o;
    return Objects.equals(this.forward, headerFooterFooterLinks.forward) &&
        Objects.equals(this.viewWeb, headerFooterFooterLinks.viewWeb) &&
        Objects.equals(this.unsubscribe, headerFooterFooterLinks.unsubscribe) &&
        Objects.equals(this.footerLinks, headerFooterFooterLinks.footerLinks) &&
        Objects.equals(this.socialShare, headerFooterFooterLinks.socialShare) &&
        Objects.equals(this.facebookShare, headerFooterFooterLinks.facebookShare) &&
        Objects.equals(this.twitterShare, headerFooterFooterLinks.twitterShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forward, viewWeb, unsubscribe, footerLinks, socialShare, facebookShare, twitterShare);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeaderFooterFooterLinks {\n");
    sb.append("    forward: ").append(toIndentedString(forward)).append("\n");
    sb.append("    viewWeb: ").append(toIndentedString(viewWeb)).append("\n");
    sb.append("    unsubscribe: ").append(toIndentedString(unsubscribe)).append("\n");
    sb.append("    footerLinks: ").append(toIndentedString(footerLinks)).append("\n");
    sb.append("    socialShare: ").append(toIndentedString(socialShare)).append("\n");
    sb.append("    facebookShare: ").append(toIndentedString(facebookShare)).append("\n");
    sb.append("    twitterShare: ").append(toIndentedString(twitterShare)).append("\n");
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

