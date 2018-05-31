Feature: Login Action

#Scenario Outline: Successful Login with Valid Credentials
#	Given User is on Home Page
#	When User Navigate to LogIn Page
#	And User enters "<username>" and "<password>"
#	Then Message displayed Login Successfully
#Examples:
#    | username   | password |
#    | testuser_1 | Test@153 |
#    | testuser_2 | Test@153 |
    

 Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters Credentials to LogIn
    | Username   | Password |          RunMode|
    | admin@trueconnect.com | 111111 |Yes|
    #| admin@trueconnect.com | 111111 |Yes| 
  Then Message displayed Login Successfully
 
 
Scenario: Successfully get table count
	 Then User is on userlist page
   Then get all row count
	 Then page count
	