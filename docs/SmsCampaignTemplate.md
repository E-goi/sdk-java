

# SmsCampaignTemplate

Sms campaign template schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**encoding** | [**EncodingEnum**](#EncodingEnum) | Message encoding |  [optional] |
|**maxMessages** | **Integer** | Maximum number of messages |  [optional] |
|**message** | **String** | Message |  [optional] |
|**sender** | **String** | Sender number |  [optional] |
|**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | Message type |  [optional] |
|**templateId** | **Integer** |  |  [optional] [readonly] |
|**templateHash** | **String** |  |  [optional] [readonly] |
|**internalName** | **String** | Campaign internal name |  [optional] |
|**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |
|**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |



## Enum: EncodingEnum

| Name | Value |
|---- | -----|
| GSM | &quot;gsm&quot; |
| UNICODE | &quot;unicode&quot; |



## Enum: MessageTypeEnum

| Name | Value |
|---- | -----|
| NORMAL | &quot;normal&quot; |
| FLASH | &quot;flash&quot; |



