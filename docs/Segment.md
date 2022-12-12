

# Segment

Segment schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of segment |  [optional] [readonly] |
|**segmentId** | **String** |  |  |
|**name** | **String** | Name of the segment |  [optional] |
|**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |
|**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |
|**segmentFilter** | [**SavedSegmentAllOf1SegmentFilter**](SavedSegmentAllOf1SegmentFilter.md) |  |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| SAVED | &quot;saved&quot; |
| TAG | &quot;tag&quot; |



