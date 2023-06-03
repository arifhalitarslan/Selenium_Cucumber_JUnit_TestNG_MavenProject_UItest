package com.project.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/project/StepDefinitions",
        features = "@target/rerun.txt"

)

public class FailedRunner {

}
