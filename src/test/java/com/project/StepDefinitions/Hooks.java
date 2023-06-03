package com.project.StepDefinitions;


import com.project.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.IOException;

public class Hooks {

  //  @Before
    public void setupScenerio(){
        System.out.println("setup the test");
    }

   @After
    public void endScenerio(Scenario scenario) throws IOException {

if (scenario.isFailed()) {
    byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
    scenario.attach(screenshot, "image/png", scenario.getName());

    Driver.closeDriver();
}
    }

}
