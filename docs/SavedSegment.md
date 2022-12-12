

# SavedSegment

Saved segment schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |
|**updated** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of segment |  [optional] [readonly] |
|**segmentFilter** | [**SavedSegmentAllOf1SegmentFilter**](SavedSegmentAllOf1SegmentFilter.md) |  |  |
|**segmentId** | **String** |  |  |
|**name** | **String** | Name of the segment |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| SAVED | &quot;saved&quot; |
| TAG | &quot;tag&quot; |



