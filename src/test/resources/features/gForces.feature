 @allTest
Feature:It Should allow users to add new computers to the database for searching at a later date

  @scenario1
  Scenario: Testing the visibility of 'Add a new computer' button
    Given   user is on a web browser
    When    user navigate to the computer database app
    Then    user should see 'Add a new computer' button



  @scenario2
  Scenario: It should be possible to open the new section
    Given   user navigate to the computer database app
    And     user should see 'Add a new computer' button
    When    user click on the link
    And     The new section should have a heading of "Add a New Computer"


#  @scenario3
#  Scenario Outline:It should have four new fields and two buttons in the new section
#    Given user navigate to the computer database app
#    When user navigate to the new section using the button link
#    Then user should see four fields labelled "<fields>" with a type of "<type>"
#    Examples:
#      |    type    |      fields       |
#      | Free input |   Computer Name   |
#      | Free input |  Introduced Date  |
#      | Free input | Discontinued Date |
#      | Free Input |   Manufacturer    |
#
#    And user should see two buttons named "buttons"
#    Examples:
#      |   buttons    |
#      | Add Computer |
#      |    Cancel    |
#


  @senario4
  Scenario: the user can create a new computer
    Given   user navigate to the computer database app
    When    user click on the link
    Then    user enter new computer name
    Then    user enter Introduced date
    Then    user enter Discontinued date
    And     user click choose a company
    Then    user select company name




