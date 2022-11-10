package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.SelectCategory;

public class SelectCategoryStepdefs {
    @Steps
    SelectCategory selectCategory;
    @When("I click select category")
    public void iClickSelectCategory() {
        selectCategory.clickSelectCategory();
    }

    @And("I click gamming1")
    public void iClickGamming1() {
        selectCategory.clickGamming1();
    }

    @Then("I get product is empty message")
    public void iGetProductIsEmptyMessage() {
        selectCategory.getProductIsEmptyMessage();
    }

    @And("I click dolonan1")
    public void iClickDolonan1() {
        selectCategory.clickDolonan1();
    }

    @And("I click gamming2")
    public void iClickGamming2() {
        selectCategory.clickGamming2();
    }

    @And("I click gamming6")
    public void iClickGamming6() {
        selectCategory.clickGamming6();
    }

    @Given("I have loggedin")
    public void iHaveLoggedin() {
        selectCategory.openUrlLogin();
        selectCategory.inputEmail("fiqram@gmail.com");
        selectCategory.inputPassword("ganteng");
        selectCategory.clickLoginButton();
    }
}
