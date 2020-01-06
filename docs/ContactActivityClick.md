

# ContactActivityClick

Contact click activity schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time |  [optional]
**actionName** | [**ActionNameEnum**](#ActionNameEnum) | Action name |  [optional]
**actionData** | [**ContactActivityClickAllOfActionData**](ContactActivityClickAllOfActionData.md) |  |  [optional]



## Enum: ActionNameEnum

Name | Value
---- | -----
EMAIL_CLICK | &quot;email_click&quot;
PUSH_CLICK | &quot;push_click&quot;
WEB_PUSH_CLICK | &quot;web_push_click&quot;



