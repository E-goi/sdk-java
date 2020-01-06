

# CampaignSmsScheduleRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time |  [optional]
**listId** | **Integer** |  | 
**destinationField** | **String** | SMS campaign destination field. Must be &#39;cellphone&#39; or the other field ID of type                                 cellphone | 
**segments** | [**SmsSegmentsActionSend**](SmsSegmentsActionSend.md) |  | 
**notify** | **List&lt;Integer&gt;** | Array of IDs of the users to notify |  [optional]



