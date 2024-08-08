# Page Object Model with Cucumber, Selenium and TestNG

This is a sample application to demonstrate how to setup and run Cucumber tests with TestNG in Page Object Model.

1. This framework consists of:
````
   Cucumber – 7.18.1
   Java 17
   TestNG – 7.10.2
   Maven – 3.9.6
   Selenium – 4.23.0
   Maven Compiler - 3.13.0
   Maven Surefire - 3.3.1
````
   
2. To run the tests through command line, use the command
````
   mvn clean test
````

3. TestNG Report - This framework contains sample TestNG Reports under **_test-output_** folder.

4. Cucumber Report - Add cucumber.properties under src/test/resources and use the below command:
````
cucumber.publish.enabled=true
````
