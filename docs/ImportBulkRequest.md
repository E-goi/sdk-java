

# ImportBulkRequest

Contact import bulk request schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**compareField** | [**CompareFieldEnum**](#CompareFieldEnum) | Field ID which will be mapped for comparison to prevent duplicates. If it is an extra field,                         append the prefix &#39;extra_&#39; to it (e. g. &#39;extra_1&#39;) | 
**replaceExistingContacts** | **Boolean** | False to add new contacts only, true to replace existing contacts |  [optional]
**sendAutoresponder** | **Boolean** | True to send each imported contact the autoresponder sequence you have previously set up for                         sign-ups in this mailing list |  [optional]
**contacts** | [**List&lt;Contact&gt;**](Contact.md) | Array of contacts to import | 



## Enum: CompareFieldEnum

Name | Value
---- | -----
EMAIL | &quot;email&quot;
CELLPHONE | &quot;cellphone&quot;
PHONE | &quot;phone&quot;
FIRST_NAME | &quot;first_name&quot;
LAST_NAME | &quot;last_name&quot;
BIRTH_DATE | &quot;birth_date&quot;
EXTRA_X | &quot;extra_X&quot;



