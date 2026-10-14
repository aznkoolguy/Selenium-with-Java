Test case: Account Registration
Create BasePage under "pageOjects" which includes only constructor. This will be every Page Object Class constructor (Re-usability).
Create Page Object Classes for HomePage, RegistrationPage under pageOject package (These classes extends from BasePage).
Create AccountRegistrationTest under "testCases"
Create BaseClass under testBase package and copy re-usable methods.
Create re-usable methods to generate random numbers and strings in BaseClass.

Adding logs to test case (log4j2)
Add log4j2.xml file under src/test/resources.
Update BaseClass.
Add log statements to AccountRegistrationTest.
