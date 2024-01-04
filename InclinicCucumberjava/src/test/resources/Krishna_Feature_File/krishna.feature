Feature: Testing All Test cases Using Cucumber Framewrok






@Test
Scenario: Verify the Login page
Given Inclinic Url Enter
Then Click on Login Page
Then Enter Valid <Username> and <Password>
And Click on login button
Then Verify the Login Page Dashboard

Examples:
|UserName|Password|
|venkatesh.t@peoplelinkvc.com|Homeo@123|