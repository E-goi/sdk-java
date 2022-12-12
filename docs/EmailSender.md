

# EmailSender

Email sender schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Sender name |  |
|**email** | **String** | Sender email |  |
|**senderId** | **Integer** |  |  [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the sender |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| MODERATION | &quot;moderation&quot; |
| REJECTED | &quot;rejected&quot; |



