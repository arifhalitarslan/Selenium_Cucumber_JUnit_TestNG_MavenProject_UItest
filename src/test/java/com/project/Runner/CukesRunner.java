package com.project.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
               "me.jvt.cucumber.report.PrettyReports:target/cucumber"
                 },
        features = "src/test/resources/FeatureFile",
        glue = "com/project/StepDefinitions",
        tags = "@wip",
        dryRun = false,  //for running on page
        publish = true   //for cucumber report link

)
public class CukesRunner {

}
