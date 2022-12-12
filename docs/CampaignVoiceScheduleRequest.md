

# CampaignVoiceScheduleRequest

Campaign voice schedule request schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**scheduleDate** | **OffsetDateTime** | The date and time |  [optional] |
|**listId** | **Integer** |  |  |
|**destinationField** | [**DestinationFieldEnum**](#DestinationFieldEnum) | Destination field of this campaign |  |
|**uniqueContactsOnly** | **Boolean** | True to send the campaign only to unique contacts |  [optional] |
|**segments** | [**OSegmentsActionSend**](OSegmentsActionSend.md) |  |  |
|**notify** | **List&lt;Integer&gt;** | Array of IDs of the users to notify |  [optional] |
|**limitContacts** | [**OLimitContactsActionSend**](OLimitContactsActionSend.md) |  |  [optional] |
|**limitHour** | [**LimitHourActionSendLimitHour**](LimitHourActionSendLimitHour.md) |  |  [optional] |
|**limitSpeed** | **Integer** | Speed limit to send the campaign |  [optional] |



## Enum: DestinationFieldEnum

| Name | Value |
|---- | -----|
| PHONE | &quot;phone&quot; |
| CELLPHONE | &quot;cellphone&quot; |
| PHONE_FAILSAFE_CELLPHONE | &quot;phone_failsafe_cellphone&quot; |
| CELLPHONE_FAILSAFE_PHONE | &quot;cellphone_failsafe_phone&quot; |
| CELLPHONE_PHONE | &quot;cellphone_phone&quot; |



