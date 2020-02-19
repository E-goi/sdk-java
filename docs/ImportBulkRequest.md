

# ImportBulkRequest

Contact import bulk request schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mode** | [**ModeEnum**](#ModeEnum) | Add new contacts only (&#39;add&#39;) or add and replace existing ones (&#39;update&#39;) | 
**compareField** | **String** | Field ID which will be mapped for comparison to prevent duplicates) | 
**contacts** | [**List&lt;ContactBulk&gt;**](ContactBulk.md) | Array of contacts to import | 
**forceEmpty** | **Boolean** | If &#39;true&#39; accepts empty values and erases those fields |  [optional]
**notify** | **List&lt;Integer&gt;** | Array of IDs of the users to notify |  [optional]
**callbackUrl** | **String** | Url to receive the report |  [optional]



## Enum: ModeEnum

Name | Value
---- | -----
ADD | &quot;add&quot;
UPDATE | &quot;update&quot;



