#Author: Automation Tester
#Module: Login
#Date: 30 Oct 2022

Feature: Login Functionality
Scenario: Test case to verify with username and password 

Given Browse should be open with login page
When User should login with valid username and password and click on login button
Then Homepage should open and verify the title page and close the browser

