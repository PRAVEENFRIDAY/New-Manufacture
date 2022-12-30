@TC101
Feature: Adactin smoke testcase

Background:
Given user lauch the "chrome" Browser
And user navigate the url "https://portal.workload.aisadmin-dev.aws.transu.net/"
Then user verify login page 

@TC102
Scenario: To verify the login details
 
And user wants to click on the login button
And user enter the valid username "da-prak"
And user enter the valid password "GcM*fb8D7COgtdJkqvX"
And user click on the login button 
Then user verify the login successfully 

@TC103
Scenario: To verify the burger button 
And user wants to click on the login button
And user enter the valid username "da-prak"
And user enter the valid password "GcM*fb8D7COgtdJkqvX"
And user click on the login button 
Then user verify the login successfully 
And user wants to click burget button
And user clicks on the case button 
Then user verify the case screen 

@TC104
Scenario: To verify the case button
And user wants to click on the login button
And user enter the valid username "da-prak"
And user enter the valid password "g*P@D^jZ9mf04nyb!EJ"
And user click on the login button 
Then user verify the login successfully 
And user wants to click burget button
And user clicks on the case button 
And user wants to click on the Create case button 
And user click on the case type button 
And user clicks on the New manufacture button'
And user clicks on the nect button
Then verify the manufacture details page 

@TC105
Scenario: To verify the maufacture detials 
And user wants to click on the login button
And user enter the valid username "da-prak"
And user enter the valid password "g*P@D^jZ9mf04nyb!EJ"
And user click on the login button 
Then user verify the login successfully 
And user wants to click burget button
And user clicks on the case button 
And user wants to click on the Create case button 
And user click on the case type button 
And user clicks on the New manufacture button'
And user clicks on the nect button
Then verify the manufacture details page 
And user enter the manufacture name "AMBASSDARS"
And user click the country origin button
And user selects the respective country
And user  enter the emails name "ambasddar.com"
And user enter the manufacture number "256"
And user clicks on the next button 
Then user verify the Manufacture screen
And user clicks on the upload natis button
And user clicks on the upload registration button
And user clicks on the upload homolagation button
And user clicks on the next button 
Then user verify the upload is done 
And user clicks on the lastnext button 
Then user verify the case details page for the manufacture 






