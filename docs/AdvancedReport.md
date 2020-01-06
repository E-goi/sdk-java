

# AdvancedReport

Advanced report schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advancedReportId** | **Integer** |  |  [optional] [readonly]
**title** | **String** | Advanced report title |  [optional]
**hash** | **String** | Advanced report hash |  [optional]
**file** | **String** | Advanced report file |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Advanced report status |  [optional]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
QUEUED | &quot;queued&quot;
RUNNING | &quot;running&quot;
FINISHED | &quot;finished&quot;
STOPPED | &quot;stopped&quot;
CANCELED | &quot;canceled&quot;
PAUSED | &quot;paused&quot;
ERROR | &quot;error&quot;



