

# ContactExportRequest

Contact export request schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**format** | [**FormatEnum**](#FormatEnum) | File extension to export contacts |  |
|**callbackUrl** | **URI** | Url to receive the callback &lt;a href&#x3D;&#39;/usecases/callbacks/#exports-a-list-of-contacts&#39; target&#x3D;&#39;_blank&#39;&gt;[Go to callback documentation]&lt;/a&gt; |  [optional] |
|**segments** | **List&lt;String&gt;** | Array of segment IDs to filter contacts to export. ***Note:*** segments of type ***auto*** and  ***tag*** are not yet supported but they are expected to be supported soon! |  [optional] |
|**fields** | **List&lt;String&gt;** | Array of field IDs to be displayed in the exported file |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| CSV | &quot;csv&quot; |
| XML | &quot;xml&quot; |



