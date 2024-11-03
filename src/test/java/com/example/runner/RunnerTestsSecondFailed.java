package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = "@target/rerun1.txt",
        glue = "com.example.definitions",
        plugin =  {
                "pretty",
                "html:target/cucumber-reports/cucumber-rerun2-report.html",
                "json:target/cucumber-reports/cucumber-rerun2-report.json"
        }
)

public class RunnerTestsSecondFailed extends AbstractTestNGCucumberTests {
}
