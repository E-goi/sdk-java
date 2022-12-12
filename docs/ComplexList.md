

# ComplexList

Complex list schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **Language** |  |  |
|**stats** | [**ComplexListAllOfStats**](ComplexListAllOfStats.md) |  |  [optional] |
|**listId** | **Integer** |  |  [optional] [readonly] |
|**internalName** | **String** | Internal name of the list |  [optional] |
|**publicName** | **String** | Public name of the list |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the list |  [optional] [readonly] |
|**groupId** | **Integer** | ID of the list group |  [optional] [readonly] |
|**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |
|**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| BLOCKED | &quot;blocked&quot; |



