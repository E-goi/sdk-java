

# ContactExtraFieldPhone


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fieldId** | **Integer** |  |  [optional] |
|**format** | [**FormatEnum**](#FormatEnum) | Extra field format |  [optional] [readonly] |
|**value** | **String** | Phone value (country code followed by phone number, split by &#39;-&#39;) |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Extra field status |  [optional] |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| PHONE | &quot;phone&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |



