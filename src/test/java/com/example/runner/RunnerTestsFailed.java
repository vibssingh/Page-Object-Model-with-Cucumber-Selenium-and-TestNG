package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = "@target/rerun.txt",
        glue = "com.example.definitions",
        plugin =  {
                "pretty",
                "html:target/cucumber-reports/cucumber-rerun1-report.html",
                "json:target/cucumber-reports/cucumber-rerun1-report.json",
                "rerun:target/rerun1.txt"
        }
)

public class RunnerTestsFailed extends AbstractTestNGCucumberTests {
}
