

# ImportBulkFileRequestSchema

Contact import bulk request schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mode** | [**ModeEnum**](#ModeEnum) | Add new contacts only (&#39;add&#39;), add and replace existing ones (&#39;update&#39;) or only replace existing ones (&#39;update_only&#39;) |  |
|**compareField** | **String** | Field ID which will be mapped for comparison to prevent duplicates. Field must be set as unique in E-goi. |  |
|**_file** | [**ImportBulkFileRequestSchemaFile**](ImportBulkFileRequestSchemaFile.md) |  |  |
|**forceEmpty** | **Boolean** | If &#39;true&#39; accepts empty values and erases those fields |  [optional] |
|**notify** | **List&lt;Integer&gt;** | Array of IDs of the users to notify |  [optional] |
|**callbackUrl** | **String** | Url to receive the report &lt;a href&#x3D;&#39;/usecases/callbacks/#import-collection-of-contacts&#39; target&#x3D;&#39;_blank&#39;&gt;[Go to callback documentation]&lt;/a&gt; |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| ADD | &quot;add&quot; |
| UPDATE | &quot;update&quot; |
| UPDATE_ONLY | &quot;update_only&quot; |



