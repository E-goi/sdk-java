

# ComplexUser

Complex user schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **Language** |  |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) | User gender |  [optional] |
|**username** | **String** | User login |  [optional] [readonly] |
|**firstName** | **String** | First name of the user |  [optional] |
|**lastName** | **String** | Last name of the user |  [optional] |
|**email** | **String** | Email of the user |  [optional] |
|**phone** | **String** | User&#39;s phone (may be cellphone or phone) |  [optional] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;male&quot; |
| FEMALE | &quot;female&quot; |



