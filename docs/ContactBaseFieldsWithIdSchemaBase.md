

# ContactBaseFieldsWithIdSchemaBase

Contact base fields with contact_id

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**contactId** | **String** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the contact |  [optional] |
|**consent** | [**ConsentEnum**](#ConsentEnum) | Contact consent |  [optional] [readonly] |
|**consentDate** | **OffsetDateTime** | Date and hour of the contact consent |  [optional] [readonly] |
|**subscriptionMethod** | [**SubscriptionMethodEnum**](#SubscriptionMethodEnum) | Contact subscription method |  [optional] [readonly] |
|**subscriptionDate** | **OffsetDateTime** | Date and hour of the contact subscription |  [optional] [readonly] |
|**subscriptionForm** | **Integer** | Contact subscription form |  [optional] [readonly] |
|**unsubscriptionMethod** | [**UnsubscriptionMethodEnum**](#UnsubscriptionMethodEnum) | Contact unsubscription method |  [optional] [readonly] |
|**unsubscriptionReason** | [**UnsubscriptionReasonEnum**](#UnsubscriptionReasonEnum) | Contact unsubscription reason |  [optional] [readonly] |
|**unsubscriptionObservation** | **String** | Contact unsubscription observation |  [optional] [readonly] |
|**unsubscriptionDate** | **OffsetDateTime** | Contact unsubscription date |  [optional] [readonly] |
|**changeDate** | **LocalDate** | Last modification date of the contact |  [optional] [readonly] |
|**firstName** | **String** | First name of the contact |  [optional] |
|**lastName** | **String** | Last name of the contact |  [optional] |
|**birthDate** | **LocalDate** | Birth date of the contact |  [optional] |
|**language** | **Language** |  |  [optional] |
|**email** | **String** | Email of the contact |  [optional] |
|**emailStatus** | [**EmailStatusEnum**](#EmailStatusEnum) | Email channel status |  [optional] [readonly] |
|**cellphone** | **String** | Cellphone of the contact |  [optional] |
|**cellphoneStatus** | [**CellphoneStatusEnum**](#CellphoneStatusEnum) | Cellphone channel status |  [optional] [readonly] |
|**phone** | **String** | Phone of the contact |  [optional] |
|**phoneStatus** | [**PhoneStatusEnum**](#PhoneStatusEnum) | Phone channel status |  [optional] [readonly] |
|**pushTokenAndroid** | [**List&lt;ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner&gt;**](ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenAndroidInner.md) | Android push token of the contact |  [optional] |
|**pushTokenIos** | [**List&lt;ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner&gt;**](ContactBaseWithStatusNoRemovedFieldsSchemaBasePushTokenIosInner.md) | IOS push token of the contact |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| REMOVED | &quot;removed&quot; |
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



## Enum: SubscriptionMethodEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;manual&quot; |
| FORM | &quot;form&quot; |
| IMPORTED | &quot;imported&quot; |
| REFERRAL | &quot;referral&quot; |
| API | &quot;api&quot; |



## Enum: UnsubscriptionMethodEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;manual&quot; |
| FORM | &quot;form&quot; |
| UNSUBSCRIBE_LINK | &quot;unsubscribe_link&quot; |
| BOUNCE | &quot;bounce&quot; |
| API | &quot;api&quot; |
| EMPTY | &quot;&quot; |



## Enum: UnsubscriptionReasonEnum

| Name | Value |
|---- | -----|
| NOT_INTERESTED | &quot;not_interested&quot; |
| LACK_OF_TIME | &quot;lack_of_time&quot; |
| EMAIL_ADDRESS_CHANGE | &quot;email_address_change&quot; |
| SPAM | &quot;spam&quot; |
| OTHER | &quot;other&quot; |
| EMPTY | &quot;&quot; |



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



