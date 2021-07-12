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

/**
 * Basic Product schema
 */
@ApiModel(description = "Basic Product schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-07-12T20:27:19.076308+01:00[Europe/Lisbon]")
public class BasicProduct   {
  public static final String SERIALIZED_NAME_PRODUCT_IDENTIFIER = "product_identifier";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDENTIFIER)
  private String productIdentifier;

  public static final String SERIALIZED_NAME_CATALOG_ID = "catalog_id";
  @SerializedName(SERIALIZED_NAME_CATALOG_ID)
  private Integer catalogId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SKU = "sku";
  @SerializedName(SERIALIZED_NAME_SKU)
  private String sku;

  public static final String SERIALIZED_NAME_UPC = "upc";
  @SerializedName(SERIALIZED_NAME_UPC)
  private String upc;

  public static final String SERIALIZED_NAME_EAN = "ean";
  @SerializedName(SERIALIZED_NAME_EAN)
  private String ean;

  public static final String SERIALIZED_NAME_GTIN = "gtin";
  @SerializedName(SERIALIZED_NAME_GTIN)
  private String gtin;

  public static final String SERIALIZED_NAME_MPN = "mpn";
  @SerializedName(SERIALIZED_NAME_MPN)
  private String mpn;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_IMAGE_LINK = "image_link";
  @SerializedName(SERIALIZED_NAME_IMAGE_LINK)
  private String imageLink;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price = 0d;

  public static final String SERIALIZED_NAME_SALE_PRICE = "sale_price";
  @SerializedName(SERIALIZED_NAME_SALE_PRICE)
  private Double salePrice = 0d;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;


  public BasicProduct productIdentifier(String productIdentifier) {
    
    this.productIdentifier = productIdentifier;
    return this;
  }

   /**
   * The ID of the product in your store
   * @return productIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the product in your store")

  public String getProductIdentifier() {
    return productIdentifier;
  }


  public void setProductIdentifier(String productIdentifier) {
    this.productIdentifier = productIdentifier;
  }


   /**
   * Get catalogId
   * minimum: 1
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getCatalogId() {
    return catalogId;
  }




  public BasicProduct name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the product
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Product name", value = "Name of the product")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BasicProduct description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the product
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Product description", value = "Description of the product")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public BasicProduct sku(String sku) {
    
    this.sku = sku;
    return this;
  }

   /**
   * Stock Keeping Unit
   * @return sku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Stock Keeping Unit")

  public String getSku() {
    return sku;
  }


  public void setSku(String sku) {
    this.sku = sku;
  }


  public BasicProduct upc(String upc) {
    
    this.upc = upc;
    return this;
  }

   /**
   * Universal Product Code
   * @return upc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Universal Product Code")

  public String getUpc() {
    return upc;
  }


  public void setUpc(String upc) {
    this.upc = upc;
  }


  public BasicProduct ean(String ean) {
    
    this.ean = ean;
    return this;
  }

   /**
   * European Article Numbering
   * @return ean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "European Article Numbering")

  public String getEan() {
    return ean;
  }


  public void setEan(String ean) {
    this.ean = ean;
  }


  public BasicProduct gtin(String gtin) {
    
    this.gtin = gtin;
    return this;
  }

   /**
   * Global Trade Item Number
   * @return gtin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Global Trade Item Number")

  public String getGtin() {
    return gtin;
  }


  public void setGtin(String gtin) {
    this.gtin = gtin;
  }


  public BasicProduct mpn(String mpn) {
    
    this.mpn = mpn;
    return this;
  }

   /**
   * Manufacturer Part Number
   * @return mpn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Manufacturer Part Number")

  public String getMpn() {
    return mpn;
  }


  public void setMpn(String mpn) {
    this.mpn = mpn;
  }


  public BasicProduct link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Link for the product
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link for the product")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public BasicProduct imageLink(String imageLink) {
    
    this.imageLink = imageLink;
    return this;
  }

   /**
   * Link for the product image
   * @return imageLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link for the product image")

  public String getImageLink() {
    return imageLink;
  }


  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }


  public BasicProduct price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * Price of the product
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Price of the product")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public BasicProduct salePrice(Double salePrice) {
    
    this.salePrice = salePrice;
    return this;
  }

   /**
   * Sale price of the product
   * @return salePrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Sale price of the product")

  public Double getSalePrice() {
    return salePrice;
  }


  public void setSalePrice(Double salePrice) {
    this.salePrice = salePrice;
  }


  public BasicProduct brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * Brand of the product
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Brand of the product")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicProduct basicProduct = (BasicProduct) o;
    return Objects.equals(this.productIdentifier, basicProduct.productIdentifier) &&
        Objects.equals(this.catalogId, basicProduct.catalogId) &&
        Objects.equals(this.name, basicProduct.name) &&
        Objects.equals(this.description, basicProduct.description) &&
        Objects.equals(this.sku, basicProduct.sku) &&
        Objects.equals(this.upc, basicProduct.upc) &&
        Objects.equals(this.ean, basicProduct.ean) &&
        Objects.equals(this.gtin, basicProduct.gtin) &&
        Objects.equals(this.mpn, basicProduct.mpn) &&
        Objects.equals(this.link, basicProduct.link) &&
        Objects.equals(this.imageLink, basicProduct.imageLink) &&
        Objects.equals(this.price, basicProduct.price) &&
        Objects.equals(this.salePrice, basicProduct.salePrice) &&
        Objects.equals(this.brand, basicProduct.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIdentifier, catalogId, name, description, sku, upc, ean, gtin, mpn, link, imageLink, price, salePrice, brand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicProduct {\n");
    sb.append("    productIdentifier: ").append(toIndentedString(productIdentifier)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    upc: ").append(toIndentedString(upc)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    gtin: ").append(toIndentedString(gtin)).append("\n");
    sb.append("    mpn: ").append(toIndentedString(mpn)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
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

