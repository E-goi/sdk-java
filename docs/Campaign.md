

# Campaign

Campaign schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaignHash** | **String** |  |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Status of the campaign |  [optional]
**thumbnail** | **String** | Thumbnail of the campaign |  [optional]
**channel** | [**ChannelEnum**](#ChannelEnum) | Channel of the campaign |  [optional]
**internalName** | **String** | Internal name of the campaign |  [optional]
**listId** | **Integer** |  |  [optional] [readonly]
**title** | **String** | Subject of the campaign |  [optional]
**createdBy** | **Integer** |  |  [optional] [readonly]
**groupId** | **Integer** |  |  [optional] [readonly]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**endDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**scheduleDate** | [**CampaignScheduleDate**](CampaignScheduleDate.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
DRAFT | &quot;draft&quot;
CANCELED | &quot;canceled&quot;
QUEUED | &quot;queued&quot;
PAUSED | &quot;paused&quot;
SENDING | &quot;sending&quot;
SENT | &quot;sent&quot;



## Enum: ChannelEnum

Name | Value
---- | -----
EMAIL | &quot;email&quot;
PUSH | &quot;push&quot;
SMS | &quot;sms&quot;
SMART_SMS | &quot;smart_sms&quot;
VOICE | &quot;voice&quot;
WEB_PUSH | &quot;web_push&quot;



