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
import org.egoi.client.model.ProductCustomAttributes;

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
 * Product schema
 */
@ApiModel(description = "Product schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-30T16:00:36.862706+01:00[Europe/Lisbon]")
public class Product {
  public static final String SERIALIZED_NAME_CATEGORIES = "categories";
  @SerializedName(SERIALIZED_NAME_CATEGORIES)
  private List<String> categories = null;

  public static final String SERIALIZED_NAME_RELATED_PRODUCTS = "related_products";
  @SerializedName(SERIALIZED_NAME_RELATED_PRODUCTS)
  private List<String> relatedProducts = null;

  public static final String SERIALIZED_NAME_CUSTOM_ATTRIBUTES = "custom_attributes";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ATTRIBUTES)
  private List<ProductCustomAttributes> customAttributes = null;

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

  public Product() {
  }

  
  public Product(
     Integer catalogId
  ) {
    this();
    this.catalogId = catalogId;
  }

  public Product categories(List<String> categories) {
    
    this.categories = categories;
    return this;
  }

  public Product addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Array of product categories, using the character &#39;&gt;&#39; as delimiter for the breadcrumb                                 syntax
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of product categories, using the character '>' as delimiter for the breadcrumb                                 syntax")

  public List<String> getCategories() {
    return categories;
  }


  public void setCategories(List<String> categories) {
    this.categories = categories;
  }


  public Product relatedProducts(List<String> relatedProducts) {
    
    this.relatedProducts = relatedProducts;
    return this;
  }

  public Product addRelatedProductsItem(String relatedProductsItem) {
    if (this.relatedProducts == null) {
      this.relatedProducts = new ArrayList<>();
    }
    this.relatedProducts.add(relatedProductsItem);
    return this;
  }

   /**
   * Related products, array of &#39;product_identifier&#39;
   * @return relatedProducts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Related products, array of 'product_identifier'")

  public List<String> getRelatedProducts() {
    return relatedProducts;
  }


  public void setRelatedProducts(List<String> relatedProducts) {
    this.relatedProducts = relatedProducts;
  }


  public Product customAttributes(List<ProductCustomAttributes> customAttributes) {
    
    this.customAttributes = customAttributes;
    return this;
  }

  public Product addCustomAttributesItem(ProductCustomAttributes customAttributesItem) {
    if (this.customAttributes == null) {
      this.customAttributes = new ArrayList<>();
    }
    this.customAttributes.add(customAttributesItem);
    return this;
  }

   /**
   * Custom attributes
   * @return customAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom attributes")

  public List<ProductCustomAttributes> getCustomAttributes() {
    return customAttributes;
  }


  public void setCustomAttributes(List<ProductCustomAttributes> customAttributes) {
    this.customAttributes = customAttributes;
  }


  public Product productIdentifier(String productIdentifier) {
    
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




  public Product name(String name) {
    
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


  public Product description(String description) {
    
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


  public Product sku(String sku) {
    
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


  public Product upc(String upc) {
    
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


  public Product ean(String ean) {
    
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


  public Product gtin(String gtin) {
    
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


  public Product mpn(String mpn) {
    
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


  public Product link(String link) {
    
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


  public Product imageLink(String imageLink) {
    
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


  public Product price(Double price) {
    
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


  public Product salePrice(Double salePrice) {
    
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


  public Product brand(String brand) {
    
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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.categories, product.categories) &&
        Objects.equals(this.relatedProducts, product.relatedProducts) &&
        Objects.equals(this.customAttributes, product.customAttributes) &&
        Objects.equals(this.productIdentifier, product.productIdentifier) &&
        Objects.equals(this.catalogId, product.catalogId) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.sku, product.sku) &&
        Objects.equals(this.upc, product.upc) &&
        Objects.equals(this.ean, product.ean) &&
        Objects.equals(this.gtin, product.gtin) &&
        Objects.equals(this.mpn, product.mpn) &&
        Objects.equals(this.link, product.link) &&
        Objects.equals(this.imageLink, product.imageLink) &&
        Objects.equals(this.price, product.price) &&
        Objects.equals(this.salePrice, product.salePrice) &&
        Objects.equals(this.brand, product.brand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, relatedProducts, customAttributes, productIdentifier, catalogId, name, description, sku, upc, ean, gtin, mpn, link, imageLink, price, salePrice, brand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    relatedProducts: ").append(toIndentedString(relatedProducts)).append("\n");
    sb.append("    customAttributes: ").append(toIndentedString(customAttributes)).append("\n");
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
    openapiFields.add("categories");
    openapiFields.add("related_products");
    openapiFields.add("custom_attributes");
    openapiFields.add("product_identifier");
    openapiFields.add("catalog_id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("sku");
    openapiFields.add("upc");
    openapiFields.add("ean");
    openapiFields.add("gtin");
    openapiFields.add("mpn");
    openapiFields.add("link");
    openapiFields.add("image_link");
    openapiFields.add("price");
    openapiFields.add("sale_price");
    openapiFields.add("brand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Product
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Product.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Product is not found in the empty JSON string", Product.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Product.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Product` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("categories") != null && !jsonObj.get("categories").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `categories` to be an array in the JSON string but got `%s`", jsonObj.get("categories").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("related_products") != null && !jsonObj.get("related_products").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `related_products` to be an array in the JSON string but got `%s`", jsonObj.get("related_products").toString()));
      }
      if (jsonObj.get("custom_attributes") != null && !jsonObj.get("custom_attributes").isJsonNull()) {
        JsonArray jsonArraycustomAttributes = jsonObj.getAsJsonArray("custom_attributes");
        if (jsonArraycustomAttributes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom_attributes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom_attributes` to be an array in the JSON string but got `%s`", jsonObj.get("custom_attributes").toString()));
          }

          // validate the optional field `custom_attributes` (array)
          for (int i = 0; i < jsonArraycustomAttributes.size(); i++) {
            ProductCustomAttributes.validateJsonObject(jsonArraycustomAttributes.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("product_identifier") != null && !jsonObj.get("product_identifier").isJsonNull()) && !jsonObj.get("product_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_identifier").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("sku") != null && !jsonObj.get("sku").isJsonNull()) && !jsonObj.get("sku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sku").toString()));
      }
      if ((jsonObj.get("upc") != null && !jsonObj.get("upc").isJsonNull()) && !jsonObj.get("upc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `upc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("upc").toString()));
      }
      if ((jsonObj.get("ean") != null && !jsonObj.get("ean").isJsonNull()) && !jsonObj.get("ean").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ean` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ean").toString()));
      }
      if ((jsonObj.get("gtin") != null && !jsonObj.get("gtin").isJsonNull()) && !jsonObj.get("gtin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gtin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gtin").toString()));
      }
      if ((jsonObj.get("mpn") != null && !jsonObj.get("mpn").isJsonNull()) && !jsonObj.get("mpn").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mpn` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mpn").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("image_link") != null && !jsonObj.get("image_link").isJsonNull()) && !jsonObj.get("image_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `image_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("image_link").toString()));
      }
      if ((jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonNull()) && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Product.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Product' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Product> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Product.class));

       return (TypeAdapter<T>) new TypeAdapter<Product>() {
           @Override
           public void write(JsonWriter out, Product value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Product read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Product given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Product
  * @throws IOException if the JSON string is invalid with respect to Product
  */
  public static Product fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Product.class);
  }

 /**
  * Convert an instance of Product to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

