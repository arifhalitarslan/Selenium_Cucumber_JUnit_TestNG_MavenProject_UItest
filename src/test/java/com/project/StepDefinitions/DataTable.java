package com.project.StepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTable {
    @Then("user should see fruits I like")
    public void user_should_see_fruits_ı_like(List<String> fruits) {

        System.out.println(fruits);
        System.out.println(fruits.get(1));

    }

}
