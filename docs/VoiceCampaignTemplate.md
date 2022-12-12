

# VoiceCampaignTemplate

Voice campaign template schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**_file** | **String** | Voice template message file |  [optional] |
|**options** | **List&lt;Object&gt;** | Extra options |  [optional] |
|**message** | **String** | Message |  [optional] |
|**sender** | **String** | Sender number |  [optional] |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Message type |  [optional] |
|**templateId** | **Integer** |  |  [optional] [readonly] |
|**templateHash** | **String** |  |  [optional] [readonly] |
|**internalName** | **String** | Campaign internal name |  [optional] |
|**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |
|**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;normal&quot; |
| FLASH | &quot;flash&quot; |



