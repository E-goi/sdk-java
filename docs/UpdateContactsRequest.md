

# UpdateContactsRequest

Updates contacts request schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Updates the contacts in the whole list (excluding removed contacts) |  |
|**contacts** | **Set&lt;String&gt;** | Array of contact IDs to update |  |
|**segmentId** | **String** | Segment ID to update channel field |  |
|**base** | [**ContactBaseWithStatusFieldsNoTokensSchemaBase**](ContactBaseWithStatusFieldsNoTokensSchemaBase.md) |  |  [optional] |
|**extra** | [**List&lt;ContactExtraFields&gt;**](ContactExtraFields.md) | Array of the contact&#39;s extra fields |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |



