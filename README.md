BDD-TEST-AUTOMATION

This project is a BDD Cucumber framework written using Page Object Model to automate GUI scenario. It is written in Java language using Maven build tool with cucumber reporting along with Junit runner. BDD features are written in Gherkin language. There is a test property file added to provide the test data used in the execution script.

Tools Used:

Eclipse-IDE, Cucumber Eclipse plug-in, Maven, Cucumer-reporting, Gherkin, POM structure


Location of reports & screenshots:

Cucumber Report and Json file - /bdd-test-automation/cucumber-reports/
Execution Result Json file - /bdd-test-automation/reports/
Screenshots - /bdd-test-automation/reports/screenshots/


Framework Execution:

1)	Clone the github repository and import it as a maven project in Eclipse. 
2)	Update the maven project to download/update the maven dependencies.
3)	Once all dependencies are completed, navigate to RunCuke and right click on it, select Run As ->  Run Configuration
4)	Add the RunCuke path and select the project and JUnit for execution. Click on apply.
5)  Provide the test data in file located at : /src/main/java/testData/test,properties
6)	Right click on RunCuke, select Run As -> JUnit, it should start running the cucumber BDD scripts.
