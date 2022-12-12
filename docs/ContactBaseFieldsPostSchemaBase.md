

# ContactBaseFieldsPostSchemaBase

Contact base fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactId** | **String** |  |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the contact |  [optional] |
|**firstName** | **String** | First name of the contact |  [optional] |
|**lastName** | **String** | Last name of the contact |  [optional] |
|**birthDate** | **LocalDate** | Birth date of the contact |  [optional] |
|**language** | **Language** |  |  [optional] |
|**email** | **String** | Email of the contact |  [optional] |
|**cellphone** | **String** | Cellphone of the contact |  [optional] |
|**phone** | **String** | Phone of the contact |  [optional] |
|**pushTokenAndroid** | [**List&lt;ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner&gt;**](ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner.md) | Android push token of the contact |  [optional] |
|**pushTokenIos** | [**List&lt;ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner&gt;**](ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner.md) | IOS push token of the contact |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| REMOVED | &quot;removed&quot; |
| UNCONFIRMED | &quot;unconfirmed&quot; |



