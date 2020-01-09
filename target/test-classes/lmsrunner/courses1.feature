Feature: Courses
Background: browser launch
    Given User enters the url into the chrome browser
    When  Enters the credentials to login in homepage of Enuma login.
   

  Scenario: Navigate to  Courses Archive 
    And  clicks on  courses archive in the Courses dropdown
    Then  All the courses should be displayed
      
 
   Scenario: Navigate to other Paid Type 
    And  clicks on other Paid type course in the Courses dropdown
    Then other Paid type courses page should be displayed
    And Should display all the details of the Description , curriculum ,instructors and review in other Paid type courses page
 
   
 
Scenario: Navigate to Free Access type page 
    And  clicks on Free access type course in the Course dropdown.
    Then Free Access type page should be displayed
    And Should display all the details of the Description , curriculum ,instructors and review



Scenario: Navigate to other free type page 
    And  clicks on other free type course in the Courses dropdown
    Then other free type courses page should be displayed
    And Should display all the details of the Description , curriculum ,instructors and review in other free type page
  
  
 Scenario: Navigate to  Paid Type courses 
    And  clicks on  Paid type course in the Courses dropdown
    Then  Paid type courses page should be displayed
    And Should display all the details of the Description , curriculum ,instructors and review in  Paid type courses page
 
 
 