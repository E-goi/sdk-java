

# EmailSender

Email sender schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**senderId** | **Integer** |  |  [readonly]
**status** | [**StatusEnum**](#StatusEnum) | Status of the sender |  [optional] [readonly]
**name** | **String** | Sender name | 
**email** | **String** | Sender email | 



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
MODERATION | &quot;moderation&quot;
REJECTED | &quot;rejected&quot;



