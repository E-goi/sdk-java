

# ContactActivityAbstractActionsWithCampaign

Campaign contact activity schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | The date and time |  [optional] |
|**actionName** | [**ActionNameEnum**](#ActionNameEnum) | Action name |  [optional] |



## Enum: ActionNameEnum

| Name | Value |
|---- | -----|
| EMAIL_OPEN | &quot;email_open&quot; |
| FORWARD | &quot;forward&quot; |
| EMAIL_SEND | &quot;email_send&quot; |
| SMS_SEND | &quot;sms_send&quot; |
| VOICE_SEND | &quot;voice_send&quot; |
| SMS_REPORT | &quot;sms_report&quot; |
| VOICE_REPORT | &quot;voice_report&quot; |
| INVITATION_SEND | &quot;invitation_send&quot; |
| INVITATION_OPEN | &quot;invitation_open&quot; |
| EMAIL_SOFT_BOUNCE | &quot;email_soft_bounce&quot; |
| EMAIL_HARD_BOUNCE | &quot;email_hard_bounce&quot; |
| DOUBLE_OPTIN | &quot;double_optin&quot; |
| DOUBLE_OPTIN_RESEND | &quot;double_optin_resend&quot; |
| EMAIL_SPAM_COMPLAINT | &quot;email_spam_complaint&quot; |
| DOUBLE_OPTEDIT | &quot;double_optedit&quot; |
| PUSH_SEND | &quot;push_send&quot; |
| PUSH_OPEN | &quot;push_open&quot; |
| PUSH_RECEIVED | &quot;push_received&quot; |
| PUSH_ERROR | &quot;push_error&quot; |
| PUSH_CANCELED | &quot;push_canceled&quot; |
| REPLY_TO_EMAIL | &quot;reply_to_email&quot; |
| WEB_PUSH_SEND | &quot;web_push_send&quot; |
| WEB_PUSH_DELIVERED | &quot;web_push_delivered&quot; |
| WEB_PUSH_OPEN | &quot;web_push_open&quot; |
| WEB_PUSH_BOUNCE | &quot;web_push_bounce&quot; |
| VOICE_MENU_EVENT | &quot;voice_menu_event&quot; |
| VOICE_REDIRECT | &quot;voice_redirect&quot; |
| PUSH_DELIVERED | &quot;push_delivered&quot; |
| SMART_SMS_SEND | &quot;smart_sms_send&quot; |
| SMART_SMS_OPEN | &quot;smart_sms_open&quot; |
| SMART_SMS_REPORT | &quot;smart_sms_report&quot; |



