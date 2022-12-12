

# UserAllOf


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Integer** |  |  [optional] [readonly] |
|**username** | **String** | User login |  [optional] [readonly] |
|**isAdmin** | **Boolean** | True if user is admin, false otherwise |  [optional] [readonly] |
|**firstName** | **String** | First name of the user |  [optional] |
|**lastName** | **String** | Last name of the user |  [optional] |
|**email** | **String** | Email of the user |  [optional] |
|**phone** | **String** | User&#39;s phone (may be cellphone or phone) |  [optional] |
|**profileImage** | **String** | User&#39;s profile image |  [optional] [readonly] |
|**status** | [**StatusEnum**](#StatusEnum) | User status |  [optional] [readonly] |
|**created** | **OffsetDateTime** | The date and time |  [optional] |
|**updated** | **OffsetDateTime** | The date and time |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



