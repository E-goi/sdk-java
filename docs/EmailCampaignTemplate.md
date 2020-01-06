

# EmailCampaignTemplate

Email campaign template schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**templateId** | **Integer** |  |  [optional] [readonly]
**templateHash** | **String** |  |  [optional] [readonly]
**internalName** | **String** | Campaign internal name |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]
**senderData** | [**EmailCampaignTemplateAllOfSenderData**](EmailCampaignTemplateAllOfSenderData.md) |  |  [optional]
**image** | **String** | Template image |  [optional]
**messageHtmlVersion** | **String** | Html message |  [optional]
**messageTextVersion** | **String** | Text message |  [optional]
**replyToData** | [**EmailCampaignTemplateAllOfReplyToData**](EmailCampaignTemplateAllOfReplyToData.md) |  |  [optional]



