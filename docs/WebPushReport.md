

# WebPushReport

Webpush report schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignHash** | **String** |  |  [optional] [readonly] |
|**overall** | [**WebPushStats**](WebPushStats.md) |  |  [optional] |
|**devices** | [**List&lt;WebPushReportDevicesInner&gt;**](WebPushReportDevicesInner.md) | Stats of the campaign for each device |  [optional] |
|**operatingSystems** | [**List&lt;WebPushReportOperatingSystemsInner&gt;**](WebPushReportOperatingSystemsInner.md) | Stats of the campaign for each operating system |  [optional] |
|**browsers** | [**List&lt;WebPushReportBrowsersInner&gt;**](WebPushReportBrowsersInner.md) | Stats of the campaign for each browser |  [optional] |
|**url** | [**List&lt;WebPushReportUrlInner&gt;**](WebPushReportUrlInner.md) | Stats of the campaign for each url |  [optional] |



