

# CreateSuppressionListRequest

Suppression list schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Suppression type |  |
|**value** | **List&lt;String&gt;** | Array of phone values to add to the suppression list (country code followed by phone number, split by &#39;-&#39;) |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EMAIL | &quot;email&quot; |
| EMAIL_DOMAIN | &quot;email_domain&quot; |
| EMAIL_USER | &quot;email_user&quot; |
| CELLPHONE | &quot;cellphone&quot; |
| PHONE | &quot;phone&quot; |



