

# PostContactsConflict

Error schema for post lists conflicts
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**UniqueFieldInUseErrors**](UniqueFieldInUseErrors.md) |  |  [optional]
**type** | **String** | RFC for status code definitions |  [optional]
**title** | [**TitleEnum**](#TitleEnum) | Error title |  [optional]
**status** | **Integer** | Status code |  [optional]
**detail** | **String** | Error detail |  [optional]



## Enum: TitleEnum

Name | Value
---- | -----
CONFLICT | &quot;Conflict&quot;



