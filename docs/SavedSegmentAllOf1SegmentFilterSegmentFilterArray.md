

# SavedSegmentAllOf1SegmentFilterSegmentFilterArray


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**segmentField** | **String** | Field internal name (retrieve fields using GET: /lists/{list_id}/fields) |  [optional] |
|**segmentOperator** | [**SegmentOperatorEnum**](#SegmentOperatorEnum) | Segment operator used for comparison. When using a range of dates split them                                             using the following format: date1||date2 |  [optional] |
|**segmentValue** | **String** | Segment search value |  [optional] |



## Enum: SegmentOperatorEnum

| Name | Value |
|---- | -----|
| EQUAL_TO | &quot;equal_to&quot; |
| NOT_EQUAL_TO | &quot;not_equal_to&quot; |
| GREATER_OR_EQUAL_TO | &quot;greater_or_equal_to&quot; |
| GREATER_THAN | &quot;greater_than&quot; |
| LESS_OR_EQUAL_TO | &quot;less_or_equal_to&quot; |
| LESS_THAN | &quot;less_than&quot; |
| CONTAINS | &quot;contains&quot; |
| DOES_NOT_CONTAIN | &quot;does_not_contain&quot; |
| BEGINS_WITH | &quot;begins_with&quot; |
| ENDS_WITH | &quot;ends_with&quot; |
| DATE_RANGE | &quot;date_range&quot; |



