

# CellphoneSenderPost

Cellphone sender schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Sender code type |  |
|**cellphone** | **String** | Sender cellphone (country code followed by phone number, split by &#39;-&#39;) |  |
|**_file** | **byte[]** | Content of your sender file in base64 |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALPHA_NUMERIC | &quot;alpha_numeric&quot; |
| NUMERIC | &quot;numeric&quot; |



