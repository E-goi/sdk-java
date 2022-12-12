

# EmailReport

Email report schema

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**campaignHash** | **String** |  |  [optional] [readonly] |
|**overall** | [**EmailReportOverallOverall**](EmailReportOverallOverall.md) |  |  [optional] |
|**date** | [**List&lt;EmailReportByDateDateInner&gt;**](EmailReportByDateDateInner.md) | Email stats grouped by date |  [optional] |
|**weekday** | [**List&lt;EmailReportByWeekdayWeekdayInner&gt;**](EmailReportByWeekdayWeekdayInner.md) | Email stats grouped by date |  [optional] |
|**hour** | [**List&lt;EmailReportByHourHourInner&gt;**](EmailReportByHourHourInner.md) | Email stats grouped by hour |  [optional] |
|**location** | [**List&lt;EmailReportByLocationLocationInner&gt;**](EmailReportByLocationLocationInner.md) | Email stats grouped by Location |  [optional] |
|**domain** | [**List&lt;EmailReportByDomainDomainInner&gt;**](EmailReportByDomainDomainInner.md) | Email stats grouped by Domain |  [optional] |
|**url** | [**List&lt;EmailReportByUrlUrlInner&gt;**](EmailReportByUrlUrlInner.md) | Email stats grouped by Domain |  [optional] |
|**reader** | [**List&lt;EmailReportByReaderReaderInner&gt;**](EmailReportByReaderReaderInner.md) | Email stats grouped by Reader |  [optional] |



