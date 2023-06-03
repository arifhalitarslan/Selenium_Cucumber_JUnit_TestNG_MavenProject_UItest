package com.project.StepDefinitions;
import com.project.Pages.PageObjectModel;
import com.project.Utilities.ConfigurationReader;
import com.project.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
public class Login_stepDefinitions {
    @When("user enters Librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");
    }
    @When("user enters Librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }

    @When("user enters Student username")
    public void user_enters_student_username() {
        System.out.println("user enters Student username");
    }
    @When("user enters Student password")
    public void user_enters_student_password() {
        System.out.println("user enters Student password");
    }

    @When("user enters Admin username")
    public void user_enters_admin_username() {
        System.out.println("user enters admin username");
    }
    @When("user enters Admin password")
    public void user_enters_admin_password() {
        System.out.println("user enters admin password");
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user should see the dashboard");
    }
}
