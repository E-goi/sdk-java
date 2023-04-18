

# ContactAutomationsActivity

Contact Automation activity schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionData** | [**ContactAutomationsActivityAllOfActionData**](ContactAutomationsActivityAllOfActionData.md) |  |  [optional] |
|**date** | **OffsetDateTime** | The date and time |  [optional] |
|**actionName** | [**ActionNameEnum**](#ActionNameEnum) | Action name |  [optional] |



## Enum: ActionNameEnum

| Name | Value |
|---- | -----|
| EVENT | &quot;automation_event&quot; |
| ACTION | &quot;automation_action&quot; |
| TRIGGER | &quot;automation_trigger&quot; |



