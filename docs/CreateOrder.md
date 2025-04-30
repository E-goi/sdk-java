

# CreateOrder

Create data

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**orderTotal** | **Double** | Ecommerce cart total |  [optional] |
|**orderId** | **String** | Order ID is any non-empty unique string |  |
|**cartId** | **String** | Cart ID that originated this order |  [optional] |
|**orderDate** | **OffsetDateTime** | Date and hour of the order |  [optional] |
|**orderStatus** | [**OrderStatusEnum**](#OrderStatusEnum) | Status of the order |  [optional] |
|**contact** | [**Contact1**](Contact1.md) |  |  [optional] |
|**products** | [**List&lt;OrderProduct&gt;**](OrderProduct.md) | List of products |  [optional] |



## Enum: OrderStatusEnum

| Name | Value |
|---- | -----|
| CREATED | &quot;created&quot; |
| PENDING | &quot;pending&quot; |
| CANCELED | &quot;canceled&quot; |
| COMPLETED | &quot;completed&quot; |
| UNKNOWN | &quot;unknown&quot; |



