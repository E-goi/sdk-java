

# ContactActivity

Contact activity schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionData** | [**ContactAutomationsActivityAllOfActionData**](ContactAutomationsActivityAllOfActionData.md) |  |  [optional] |
|**date** | **OffsetDateTime** | The date and time |  [optional] |
|**actionName** | [**ActionNameEnum**](#ActionNameEnum) | Action name |  [optional] |



## Enum: ActionNameEnum

| Name | Value |
|---- | -----|
| SUBSCRIPTION | &quot;subscription&quot; |
| UNSUBSCRIBE | &quot;unsubscribe&quot; |
| UNSUBSCRIBE_API | &quot;unsubscribe_api&quot; |
| UNSUBSCRIBE_MANUAL | &quot;unsubscribe_manual&quot; |
| UNSUBSCRIBE_REASON | &quot;unsubscribe_reason&quot; |
| EDIT_SUBSCRIPTION | &quot;edit_subscription&quot; |
| RESUBSCRIPTION | &quot;resubscription&quot; |
| CONVERSION | &quot;conversion&quot; |
| FACEBOOK_LIKE | &quot;facebook_like&quot; |
| SOCIAL_SHARE | &quot;social_share&quot; |
| CELLPHONE_FIELD_DISABLE | &quot;cellphone_field_disable&quot; |
| EMAIL_FIELD_DISABLE | &quot;email_field_disable&quot; |
| PHONE_FIELD_DISABLE | &quot;phone_field_disable&quot; |
| EMAIL_FIELD_ENABLE | &quot;email_field_enable&quot; |
| CELLPHONE_FIELD_ENABLE | &quot;cellphone_field_enable&quot; |
| PHONE_FIELD_ENABLE | &quot;phone_field_enable&quot; |
| WEB_PUSH_SUBSCRIPTION | &quot;web_push_subscription&quot; |
| WEB_PUSH_UNSUBSCRIPTION | &quot;web_push_unsubscription&quot; |
| ADD_PUSH_CONTACT | &quot;add_push_contact&quot; |
| REMOVE_PUSH_CONTACT | &quot;remove_push_contact&quot; |
| FORGET_SUBSCRIPTION | &quot;forget_subscription&quot; |
| CHANGE_CONSENT | &quot;change_consent&quot; |
| PUSH_UNSUBSCRIPTION | &quot;push_unsubscription&quot; |



