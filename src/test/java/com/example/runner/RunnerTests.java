package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features/LoginPage.feature",
        glue = "com.example.definitions",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-report.html",
                "json:target/cucumber-reports/cucumber-report.json",
                "rerun:target/rerun.txt" // Saves paths of failed scenarios
        }
)
public class RunnerTests extends AbstractTestNGCucumberTests {
}
