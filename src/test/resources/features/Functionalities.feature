#Author: andreco06@hotmail.com
Feature: Emp Functionality

Background: 
Given I logged into OrangeHRM 

Scenario: Add Employee
And I navigated to the Add Employee Page
When I provide the first name, middle name and last name of the employee
Then I successfully added an employee

Scenario: Edit employee
And I navigated to the Employee List Page
When I search for an added employee 
And selected that employee
Then I navigated to the employee profile 
And I can edit Employee information

Scenario: Delete Employee
And I navigated to the Employee List Page
When I search for an added employee 
Then I should be able to delete that employee
