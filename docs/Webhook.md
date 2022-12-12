

# Webhook

Webhook schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**webhookId** | **Integer** |  |  [optional] [readonly] |
|**listId** | **Integer** |  |  |
|**url** | **String** | Url to send the webhook:  *       Note: Only &#39;http&#39; or &#39;https&#39; protocols are supported |  |
|**actions** | **List&lt;WebhookActionSchema&gt;** | Action that will trigger the webhook |  |
|**fields** | **List&lt;String&gt;** | Array of contact field IDs to be displayed in the webhook |  [optional] |



