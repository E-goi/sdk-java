

# OrderProduct

Order Product schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**productIdentifier** | **String** | The ID of the product in your store |  [optional] |
|**catalogId** | **Integer** |  |  [optional] [readonly] |
|**name** | **String** | Name of the product |  [optional] |
|**description** | **String** | Description of the product |  [optional] |
|**sku** | **String** | Stock Keeping Unit |  [optional] |
|**upc** | **String** | Universal Product Code |  [optional] |
|**ean** | **String** | European Article Numbering |  [optional] |
|**gtin** | **String** | Global Trade Item Number |  [optional] |
|**mpn** | **String** | Manufacturer Part Number |  [optional] |
|**link** | **String** | Link for the product |  [optional] |
|**imageLink** | **String** | Link for the product image |  [optional] |
|**price** | **Double** | Price of the product |  [optional] |
|**salePrice** | **Double** | Sale price of the product |  [optional] |
|**brand** | **String** | Brand of the product |  [optional] |
|**quantity** | **Double** | Quantity of the product |  [optional] |
|**categories** | **List&lt;String&gt;** | Array of product categories, using the character &#39;&gt;&#39; as delimiter for the breadcrumb syntax |  [optional] |
|**relatedProducts** | **List&lt;String&gt;** | Related products, array of &#39;product_identifier&#39; |  [optional] |
|**customAttributes** | [**List&lt;ProductCustomAttributes&gt;**](ProductCustomAttributes.md) | Custom attributes |  [optional] |



