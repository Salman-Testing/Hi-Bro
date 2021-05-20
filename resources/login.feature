Feature: To validate the login functionality of given application



@Smoke
  Scenario: To verify the username and password with given credentials for facebook
    
    When User will enter the given URL
    And User enter username and password in the respected field
      # 2 Dimentional Map
      | username | password      |
      | Java     | Java@12345    |
      | Selenium | Selenium@1234 |
      | Python   | Python@1234   |
    And User will click the login button
    Then User verifies the login functionnality


# Scenario: To verify the username and password with given credentials for Flipkart
    
#    When User will enter the given URL$
#    And User enter username and password in the respected field$
#    And User will click the login button$
#    Then User verifies the login functionnality$
