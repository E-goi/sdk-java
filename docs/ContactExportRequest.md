

# ContactExportRequest

Contact export request schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | [**FormatEnum**](#FormatEnum) | File extension to export contacts | 
**callbackUrl** | [**URI**](URI.md) | Url to receive the webhook |  [optional]
**segments** | **List&lt;String&gt;** | Array of segment IDs to filter contacts to export. ***Note:*** segments of type ***auto*** and                         ***tag*** are not yet supported but they are expected to be supported soon! |  [optional]
**fields** | **List&lt;String&gt;** | Array of field IDs to be displayed in the exported file |  [optional]



## Enum: FormatEnum

Name | Value
---- | -----
XLS | &quot;xls&quot;
CSV | &quot;csv&quot;
XML | &quot;xml&quot;



