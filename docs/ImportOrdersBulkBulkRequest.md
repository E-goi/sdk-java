

# ImportOrdersBulkBulkRequest

Order data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Ecommerce order id |  |
|**contactId** | **String** | Contact ID is any non-empty unique string identifying the user (such as an email address or e-goi uid) |  [optional] |
|**revenue** | **BigDecimal** | Ecommerce order revenue |  |
|**storeUrl** | **String** | Ecommerce store url |  |
|**date** | [**OffsetDateTime**](OffsetDateTime.md) | Ecommerce order date (For technical reasons, all orders synchronized will have the date of synchronization.) |  |
|**items** | [**List&lt;ImportOrdersBulkBulkRequestItems&gt;**](ImportOrdersBulkBulkRequestItems.md) | Array of ordered products |  |



