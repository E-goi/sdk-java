

# Operation

Operation schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operationId** | **Integer** |  |  [optional] [readonly] |
|**operationData** | [**OperationOperationData**](OperationOperationData.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of operation |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | State of the operation |  [optional] |
|**createdBy** | **Integer** |  |  [optional] [readonly] |
|**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |
|**startDate** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMPORT_CONTACTS | &quot;import_contacts&quot; |
| UPDATE_CONTACTS | &quot;update_contacts&quot; |
| EXPORT_CONTACTS | &quot;export_contacts&quot; |
| EXPORT_REPORTS | &quot;export_reports&quot; |
| ADVANCED_REPORT | &quot;advanced_report&quot; |
| EMAIL | &quot;email&quot; |
| SMS | &quot;sms&quot; |
| SMART_SMS | &quot;smart_sms&quot; |
| VOICE | &quot;voice&quot; |
| PUSH | &quot;push&quot; |
| WEBPUSH | &quot;webpush&quot; |
| ADS | &quot;ads&quot; |
| SOCIAL | &quot;social&quot; |
| SEGMENT_GENERATION | &quot;segment_generation&quot; |
| MASS_OPERATION | &quot;mass_operation&quot; |
| UNIFY | &quot;unify&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;queued&quot; |
| PROCESSING | &quot;processing&quot; |
| EXECUTING | &quot;executing&quot; |
| PAUSED | &quot;paused&quot; |



