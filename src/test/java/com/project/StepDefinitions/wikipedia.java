package com.project.StepDefinitions;
import com.project.Pages.PageObjectModel;
import com.project.Pages.Wikipedia_PageObjectModel;
import com.project.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

public class wikipedia {

    WebDriver driver;
    Wikipedia_PageObjectModel pageObjectModel = new Wikipedia_PageObjectModel();

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
       driver = Driver.getDriver();
       driver.get("https://www.wikipedia.org/");
    }
    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
      pageObjectModel.SearchBox.sendKeys(string);

    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
pageObjectModel.searchButton.click();
    }
    @Then("User Sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
String expectedTitle = string;
String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("User sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {
String expectedMainHeader = string;
String actualMainHeader = pageObjectModel.MainHeader.getText();
Assert.assertEquals(expectedMainHeader,actualMainHeader);
    }

}
