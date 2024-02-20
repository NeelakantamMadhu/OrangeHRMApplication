
Feature: OrangeHRM Application Functionalities Testing


Background:
Given User should open Browser in the System

@Smoke
Scenario: Validation OrangeHRM Application LonIn Page

#Given User should open Browser in the System
When User enter OrangeHRM Application URL Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
#Then User should close the OrangeHRM Application along with the browser


@ReTesting
Scenario: Validating OrangeHRM Application LogIn Functionality

#Given User should open Browser in the System
When User enters OrangeHRM Application URL Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should enter userName and password and click on login button
Then User should be navigated to OrangeHRM Application HomePage
Then User should click on WelCome Admin and click on Logout
Then User should be navigated to OrangeHRM Application LogIn WebPage
#Then User should close the OrangeHRM Application along with the browser


#@RegressionTesting @Smoke
@Smoke @RegressionTesting
Scenario Outline: Validating OrangeHRM Application LogIn Functionality with TestData

#Given User should open Browser in the System
When User enters OrangeHRM Application URL Address
Then User should be navigated to OrangeHRM Application LogIn WebPage
Then User should enter "<userName>"and "<password>" and click on login button
Then User should be navigated to OrangeHRM Application HomePage
Then User should click on WelCome Admin and click on Logout
Then User should be navigated to OrangeHRM Application LogIn WebPage
#Then User should close the OrangeHRM Application along with the browser

Examples:

 |  userName   |   password        | 
 |  Madhu      |   Livetech@123    | 
 |  sai        |   chandu          | 
 |  Gowtham    |   Govidhraj       | 
 |  madhu      |   Livetech@123    | 





