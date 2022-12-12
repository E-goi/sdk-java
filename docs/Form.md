

# Form

Form schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**formId** | **Integer** |  |  [optional] [readonly] |
|**internalTitle** | **String** | Internal title of the form |  [optional] |
|**title** | **String** | Title of the form |  |
|**language** | **Language** |  |  [optional] |
|**listId** | **Integer** |  |  [optional] |
|**_default** | **Boolean** | True if this is the default form in the list, false otherwise |  [optional] |
|**owner** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the form |  [optional] [readonly] |
|**created** | **OffsetDateTime** | The date and time |  [optional] |
|**updated** | **OffsetDateTime** | The date and time |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |
| CLONED | &quot;cloned&quot; |
| DELETED | &quot;deleted&quot; |



