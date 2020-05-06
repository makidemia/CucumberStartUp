# new feature
# Tags: optional

Feature: A student app url

  Scenario: student app url test
    Given a student app url
    When student get request is hit
    Then response code should return '500' status code