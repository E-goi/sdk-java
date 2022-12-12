

# EmailCampaignCreate

Email campaign schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**listId** | **Integer** |  |  |
|**internalName** | **String** | Campaign internal name |  |
|**subject** | **String** | Campaign subject. If no value is sent, defaults to &#39;internal_name&#39; property value |  [optional] |
|**content** | [**CampaignEmailContent**](CampaignEmailContent.md) |  |  |
|**senderId** | **Integer** |  |  |
|**replyTo** | **Integer** |  |  [optional] |
|**headerFooter** | [**HeaderFooter**](HeaderFooter.md) |  |  [optional] |



