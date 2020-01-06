

# ComplexField

Complex field schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldId** | **String** | Field ID |  [optional] [readonly]
**name** | **String** | Name of the field | 
**format** | [**FormatEnum**](#FormatEnum) | Field format | 
**unique** | **Boolean** | True if the field is unique, false otherwise |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Field type |  [optional] [readonly]
**options** | [**List&lt;FieldOption&gt;**](FieldOption.md) | Lists of options (only for fields of type &#39;options&#39;) |  [optional] [readonly]



## Enum: FormatEnum

Name | Value
---- | -----
DATE | &quot;date&quot;
TEXT | &quot;text&quot;
CELLPHONE | &quot;cellphone&quot;
PHONE | &quot;phone&quot;
NUMBER | &quot;number&quot;
EMAIL | &quot;email&quot;
OPTIONS | &quot;options&quot;



## Enum: TypeEnum

Name | Value
---- | -----
BASE | &quot;base&quot;
EXTRA | &quot;extra&quot;



