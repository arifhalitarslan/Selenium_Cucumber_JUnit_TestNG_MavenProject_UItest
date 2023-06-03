package com.project.StepDefinitions;

import com.project.Pages.SmartBearPage;
import com.project.Utilities.ConfigurationReader;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBear {
    WebDriver driver;
    SmartBearPage smartBearPage = new SmartBearPage();
    @When("Open browser")
    public void open_browser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @When("Go to website")
    public void go_to_website() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }
    @When("Enter username: Tester")
    public void enter_username_tester() {
      smartBearPage.inputMainContentUsername.sendKeys("Tester");
    }
    @When("Enter password: test")
    public void enter_password_test() {
     smartBearPage.inputMainContentPassword.sendKeys("test");
    }
    @When("Click to Login button")
    public void click_to_login_button() {
      smartBearPage.inputMainContentLoginButton.click();
    }
    @When("Print out count of all the links on landing page")
    public void print_out_count_of_all_the_links_on_landing_page() {

    }
    @Then("Print out each link text on this page")
    public void print_out_each_link_text_on_this_page() {

    }
}
