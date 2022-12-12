

# RequestItemsUnsubscribe


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactId** | **String** |  |  [optional] |
|**unsubscriptionMethod** | [**UnsubscriptionMethodEnum**](#UnsubscriptionMethodEnum) | Unsubcription Method |  [optional] |
|**unsubscriptionReason** | [**UnsubscriptionReasonEnum**](#UnsubscriptionReasonEnum) | Unsubcription Reason |  [optional] |
|**unsubscriptionObservation** | **String** | Unsubcription Observation |  [optional] |



## Enum: UnsubscriptionMethodEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;manual&quot; |
| FORM | &quot;form&quot; |
| UNSUBSCRIBE_LINK | &quot;unsubscribe_link&quot; |
| BOUNCE | &quot;bounce&quot; |
| API | &quot;api&quot; |



## Enum: UnsubscriptionReasonEnum

| Name | Value |
|---- | -----|
| NOT_INTERESTED | &quot;not_interested&quot; |
| LACK_OF_TIME | &quot;lack_of_time&quot; |
| EMAIL_ADDRESS_CHANGE | &quot;email_address_change&quot; |
| SPAM | &quot;spam&quot; |
| OTHER | &quot;other&quot; |



