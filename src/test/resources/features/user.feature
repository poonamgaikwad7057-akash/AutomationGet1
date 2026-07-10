Feature: GET API

Scenario: Verify GET User API

Given User sends GET request
Then Status code should be 200
And Response should contain user id