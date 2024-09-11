Feature: Docuport rows validations
  Background: Given user is on Docuport login page
  /*task1:
 - login as an supervisor
  - click leads
  - Validate that Rows Per Page shows by default 10
  - Change Rows Per Page to 5
  - validate that after changing it is showing 5
  - Click Users
  - Validate that Rows per page shows by default 10
  - change rows per page to 5
  - validate that after changing it is showing 5
  */

   @supervisor

  Scenario: Validate the rows per page functionallity for supervisor
     Given user login as a supervisor
    When user clicks leads on the left menu bar
   Then user sees 10 rows per page by default
   Then  user  changes row per page to 5
     Then user sees 5 rows per page
     And  user clicks Users on the left menu bar
     Then user sees 10 rows per page by default
     And user changes rows per page to 5
     Then user sees 5 rows per page
