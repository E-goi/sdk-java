

# DeleteCampaignsConflict

Error schema for delete campaigns conflicts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**CampaignSentLast30DaysErrors**](CampaignSentLast30DaysErrors.md) |  |  [optional]
**type** | **String** | RFC for status code definitions |  [optional]
**title** | [**TitleEnum**](#TitleEnum) | Error title |  [optional]
**status** | **Integer** | Status code |  [optional]
**detail** | **String** | Error detail |  [optional]



## Enum: TitleEnum

Name | Value
---- | -----
CONFLICT | &quot;Conflict&quot;



