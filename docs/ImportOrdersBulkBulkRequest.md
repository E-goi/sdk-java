

# ImportOrdersBulkBulkRequest

Order data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderId** | **String** | Ecommerce order id |  |
|**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) | Status of the order |  [optional] |
|**contactId** | **String** | Contact ID is any non-empty unique string identifying the user (such as an email address or e-goi uid) |  |
|**revenue** | **BigDecimal** | Ecommerce order revenue. Must be greater than 0. |  |
|**storeUrl** | **String** | Ecommerce store url |  |
|**date** | [**OffsetDateTime**](OffsetDateTime.md) | Ecommerce order date (For technical reasons, all orders synchronized will have the date of synchronization.) |  |
|**items** | [**List&lt;ImportOrdersBulkBulkRequestItems&gt;**](ImportOrdersBulkBulkRequestItems.md) | Array of ordered products |  |



## Enum: OrderStatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| PENDING | &quot;pending&quot; |
| CANCELED | &quot;canceled&quot; |
| COMPLETED | &quot;completed&quot; |
| UNKNOWN | &quot;unknown&quot; |



