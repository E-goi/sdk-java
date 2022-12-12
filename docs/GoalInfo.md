

# GoalInfo

GoalInfo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Goal type |  [optional] |
|**multipleConversion** | **Boolean** | Goal is multiple conversion |  [optional] |
|**rule** | [**RuleEnum**](#RuleEnum) | Goal rule |  [optional] |
|**condition** | [**ConditionEnum**](#ConditionEnum) | Goal condition |  [optional] |
|**pattern** | **String** | Goal pattern |  [optional] |
|**caseSensitive** | **Boolean** | Goal pattern case sensitive |  [optional] |
|**minutes** | **Double** | Goal trigger time in minutes |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| TIME | &quot;time&quot; |



## Enum: RuleEnum

| Name | Value |
|---- | -----|
| URL | &quot;url&quot; |
| TITLE | &quot;title&quot; |
| DOWNLOAD | &quot;download&quot; |
| EXTERNAL_URL | &quot;external_url&quot; |



## Enum: ConditionEnum

| Name | Value |
|---- | -----|
| CONTAINS | &quot;contains&quot; |
| EXACTLY | &quot;exactly&quot; |
| REGEX | &quot;regex&quot; |



