

# SuppressionList

Suppression list schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** |  |  [optional] [readonly]
**value** | **String** | Suppressed value |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Suppression type |  [optional]
**method** | [**MethodEnum**](#MethodEnum) | Suppression method |  [optional]
**campaignHash** | **String** |  |  [optional] [readonly]
**created** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
EMAIL | &quot;email&quot;
EMAIL_DOMAIN | &quot;email_domain&quot;
EMAIL_USER | &quot;email_user&quot;
CELLPHONE | &quot;cellphone&quot;
PHONE | &quot;phone&quot;



## Enum: MethodEnum

Name | Value
---- | -----
UNSUBSCRIBE | &quot;unsubscribe&quot;
BOUNCE | &quot;bounce&quot;
MANUAL | &quot;manual&quot;
OTHER | &quot;other&quot;
FORGOTTEN | &quot;forgotten&quot;



