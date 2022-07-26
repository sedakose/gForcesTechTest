package com.gForces.step_definitions;

import com.gForces.pages.basePage;
import com.gForces.pages.gForcesPage;
import com.gForces.utilities.BrowserUtils;
import com.gForces.utilities.ConfigurationReader;
import com.gForces.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.List;


public class gForcesStepDefs {

    gForcesPage gForcesPage = new gForcesPage();

    @Given("user is on a web browser")
    public void user_is_on_a_web_browser() {
        Driver.get();
        BrowserUtils.waitForPageToLoad(5);
    }

    @When("user navigate to the computer database app")
    public void user_navigate_to_the_computer_database_app() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitForPageToLoad(5);
    }

    @Then("user should see {string} button")
    public void user_should_see_button(String string) {
        Assert.assertTrue(new basePage().addANewComputer.isDisplayed());
    }


    @When("user click on the link")
    public void user_click_on_the_link() {
        {
            new basePage().addANewComputer.click();
        }

    }

    @When("The new section should have a heading of {string}")
    public void the_new_section_should_have_a_heading_of(String string) {
        Assert.assertTrue(new gForcesPage().computerHeader.isDisplayed());
    }


    @When("user navigate to the new section using the button link")
    public void i_navigate_to_the_new_section_using_the_button_link() {
        new basePage().addANewComputer.click();
    }

//
//    @Then("user should see four fields labelled {string} with a type of {string}")
//    public void userShouldSeeFourFieldsLabelledWithATypeOf(String fields, String type) {
//        System.out.println("fields " + fields + "type " + type);
//    }
//
//    @And("user should see two buttons named {string}")
//    public void userShouldSeeTwoButtonsNamed(String buttons) {
//        System.out.println("buttons " + buttons);
//    }


    @Then("user enter new computer name")
    public void user_enter_new_computer_name() {
        gForcesPage.computerNameField.sendKeys("apple");

    }

    @Then("user enter Introduced date")
    public void user_enter_introduced_date() {
        gForcesPage.introducedDateField.sendKeys("2021-07-25");
    }

    @Then("user enter Discontinued date")
    public void user_enter_discontinued_date() {
        gForcesPage.discontinuedDateField.sendKeys("2022-07-25");
    }

    @Then("user click choose a company")
    public void user_click_choose_a_company() {

    }

    @Then("user select company name")
    public void user_select_company_name() {

    }

}
//    @Then("user should see four fields labelled {string} with a type of {string}")
//    public void userShouldSeeFourFieldsLabelledWithATypeOf(String field, String type) {
//    }
//
//    @And("user should see two buttons named {string}")
//    public void userShouldSeeTwoButtonsNamed(List<String>buttons) {
//    }
//}










