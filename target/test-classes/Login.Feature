#Author: sarra.baccar.sb@gmail.com

Feature: orangeHRM login page

  
  Scenario: Login with valid credentials
  
    Given admin is on login page
    
    When admin enter correct username "Admin" and correct password "admin123"
    
    Then admin is directed to the DashboardPage that contains message "Dashboard"
   


