

# ComplexContact

Complex contact schema
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base** | [**ContactInsideBase**](ContactInsideBase.md) | Contact base fields |  [optional]
**extra** | [**List&lt;ContactExtraFields&gt;**](ContactExtraFields.md) | Array of the contact&#39;s extra fields |  [optional]
**tags** | **List&lt;Integer&gt;** | Array of tags for this contact |  [optional] [readonly]
**emailStats** | [**ComplexContactAllOfEmailStats**](ComplexContactAllOfEmailStats.md) |  |  [optional]
**smsStats** | [**ComplexContactAllOfSmsStats**](ComplexContactAllOfSmsStats.md) |  |  [optional]
**pushStats** | [**ComplexContactAllOfPushStats**](ComplexContactAllOfPushStats.md) |  |  [optional]
**webpushStats** | [**ComplexContactAllOfWebpushStats**](ComplexContactAllOfWebpushStats.md) |  |  [optional]
**voiceStats** | [**ComplexContactAllOfVoiceStats**](ComplexContactAllOfVoiceStats.md) |  |  [optional]



