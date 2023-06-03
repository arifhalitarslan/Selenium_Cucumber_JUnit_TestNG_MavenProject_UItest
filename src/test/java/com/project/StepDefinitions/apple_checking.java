package com.project.StepDefinitions;
import com.project.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

public class apple_checking {
    WebDriver driver;
    @When("we should be in google home page")
    public void we_should_be_in_google_home_page() throws IOException {
     driver = Driver.getDriver();
     driver.get("https://www.google.com/");
    }
    @When("we should write {string} and click the enter")
    public void we_should_write_and_click_the_enter(String string) {
        WebElement googleSearchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        googleSearchBox.sendKeys(string+ Keys.ENTER);


    }
    @Then("We should results")
    public void we_should_results() {

        String expectedTitle = "apple - Google'da Ara";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }

}
