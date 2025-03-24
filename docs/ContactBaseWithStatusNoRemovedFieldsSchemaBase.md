

# ContactBaseWithStatusNoRemovedFieldsSchemaBase

Contact base fields

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactId** | **String** |  |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the contact |  [optional] |
|**consent** | [**ConsentEnum**](#ConsentEnum) | Contact consent |  [optional] |
|**firstName** | **String** | First name of the contact |  [optional] |
|**lastName** | **String** | Last name of the contact |  [optional] |
|**birthDate** | **LocalDate** | Birth date of the contact |  [optional] |
|**language** | **Language** |  |  [optional] |
|**email** | **String** | Email of the contact |  [optional] |
|**emailStatus** | [**EmailStatusEnum**](#EmailStatusEnum) | Email channel status |  [optional] |
|**cellphone** | **String** | Cellphone of the contact (country code followed by phone number, split by &#39;-&#39;) |  [optional] |
|**cellphoneStatus** | [**CellphoneStatusEnum**](#CellphoneStatusEnum) | Cellphone channel status |  [optional] |
|**phone** | **String** | Phone of the contact (country code followed by phone number, split by &#39;-&#39;) |  [optional] |
|**phoneStatus** | [**PhoneStatusEnum**](#PhoneStatusEnum) | Phone channel status |  [optional] |
|**pushTokenAndroid** | [**List&lt;ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner&gt;**](ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner.md) | Android push token of the contact |  [optional] |
|**pushTokenIos** | [**List&lt;ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner&gt;**](ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner.md) | IOS push token of the contact |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| UNCONFIRMED | &quot;unconfirmed&quot; |



## Enum: ConsentEnum

| Name | Value |
|---- | -----|
| ANY | &quot;any&quot; |
| CONSENT | &quot;consent&quot; |
| CONTRACT | &quot;contract&quot; |
| LEGITIMATE_INTEREST | &quot;legitimate_interest&quot; |
| NONE | &quot;none&quot; |
| PROTECT_VITAL_INTERESTS | &quot;protect_vital_interests&quot; |
| PUBLIC_INTERESTS | &quot;public_interests&quot; |
| REQUIRED_BY_LAW | &quot;required_by_law&quot; |
| WITHDRAWN | &quot;withdrawn&quot; |



## Enum: EmailStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



## Enum: CellphoneStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



## Enum: PhoneStatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



