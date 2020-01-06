

# UserPostRequest

User post request schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**userId** | **Integer** |  |  [optional] [readonly]
**username** | **String** | User login |  [optional] [readonly]
**isAdmin** | **Boolean** | True if user is admin, false otherwise |  [optional] [readonly]
**firstName** | **String** | First name of the user |  [optional]
**lastName** | **String** | Last name of the user |  [optional]
**email** | **String** | Email of the user |  [optional]
**phone** | **String** | User&#39;s phone (may be cellphone or phone) |  [optional]
**profileImage** | **String** | User&#39;s profile image |  [optional] [readonly]
**status** | [**StatusEnum**](#StatusEnum) | User status |  [optional] [readonly]
**created** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time |  [optional]
**updated** | [**OffsetDateTime**](OffsetDateTime.md) | The date and time |  [optional]
**language** | [**Language**](Language.md) |  |  [optional]
**timezone** | **String** | User timezone |  [optional] [readonly]
**showRemovedContacts** | **Boolean** | True if the user can see removed contacts, false otherwise |  [optional] [readonly]
**gender** | [**GenderEnum**](#GenderEnum) | User gender |  [optional]
**password** | **String** | User password |  [optional]
**passwordConfirmation** | **String** | User password confirmation |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;



## Enum: GenderEnum

Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;



