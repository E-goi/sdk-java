

# ComplexField

Complex field schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Field type |  [optional] [readonly] |
|**options** | [**List&lt;FieldOption&gt;**](FieldOption.md) | Lists of options (only for fields of type &#39;options&#39;) |  [optional] [readonly] |
|**fieldId** | **String** | Field ID |  [optional] [readonly] |
|**name** | **String** | Name of the field |  |
|**format** | [**FormatEnum**](#FormatEnum) | Field format |  |
|**unique** | **Boolean** | True if the field is unique, false otherwise |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BASE | &quot;base&quot; |
| EXTRA | &quot;extra&quot; |



## Enum: FormatEnum

| Name | Value |
|---- | -----|
| DATE | &quot;date&quot; |
| TEXT | &quot;text&quot; |
| CELLPHONE | &quot;cellphone&quot; |
| PHONE | &quot;phone&quot; |
| NUMBER | &quot;number&quot; |
| EMAIL | &quot;email&quot; |
| OPTIONS | &quot;options&quot; |



