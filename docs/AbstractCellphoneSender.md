

# AbstractCellphoneSender

Abstract cellphone sender schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Sender code type |  |
|**senderId** | **Integer** |  |  [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the sender |  [optional] [readonly] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALPHA_NUMERIC | &quot;alpha_numeric&quot; |
| NUMERIC | &quot;numeric&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| MODERATION | &quot;moderation&quot; |
| REJECTED | &quot;rejected&quot; |



