@Britix
  Feature: Login
  As user I want to login under different roles
#  hook will take care of this action
#  Hook will open main page
#  Background:
#    Given user is on the landing page
    @login_with_outline
    Scenario: User names test
      Given user logs in with following credentials <username> and <password>
        | username                      | password |
        | helpdesk13@cybertekschool.com | UserUser |
        | marketing13@cybertekschool.com| UserUser |
        | hr@cybertekschool.com         | UserUser |
      Then Verify that user succesfully logged in

      #Examples: Credentials information
#        | username                      | password |
#        | helpdesk13@cybertekschool.com | UserUser |
#        | marketing13@cybertekschool.com| UserUser |
#        | hr@cybertekschool.com         | UserUser |


