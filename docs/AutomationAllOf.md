

# AutomationAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**automationId** | **Integer** |  |  [optional] [readonly]
**title** | **String** | Automation title |  [optional]
**listId** | **Integer** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Automation status |  [optional]
**createdBy** | **Integer** |  |  [optional] [readonly]
**allowMultipleContacts** | **Boolean** | True if the automation allows multiple contacts, false otherwise |  [optional]
**contactLimit** | **Integer** | Contact limit for the automation. Contact limit value (value &#39;0&#39; is returned if contact                                 limit is not enabled) |  [optional]
**created** | [**LocalDate**](LocalDate.md) |  |  [optional] [readonly]
**updated** | [**LocalDate**](LocalDate.md) |  |  [optional] [readonly]



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;



