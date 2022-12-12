

# PhoneSender

Phone sender schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**phone** | **String** | Sender value (country code followed by phone number, split by &#39;-&#39;) |  |
|**_file** | **byte[]** | Content of your sender file in base64 |  |
|**senderId** | **Integer** |  |  [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the sender |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| MODERATION | &quot;moderation&quot; |
| REJECTED | &quot;rejected&quot; |



