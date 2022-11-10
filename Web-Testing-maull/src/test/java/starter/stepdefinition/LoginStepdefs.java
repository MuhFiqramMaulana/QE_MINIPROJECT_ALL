package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;

public class LoginStepdefs {
    @Steps
    Login login;
    @Given("I am on login page")
    public void iAmOnLoginPage() {
        login.openUrlLogin();
    }
    @When("I am input my email {string}")
    public void iAmInputMyEmail(String arg4) {
        login.inputMyEmail(arg4);
    }

    @And("I am input my password {string}")
    public void iAmInputMyPassword(String arg5) {
        login.inputMyPassword(arg5);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        login.clickLoginButton();
    }


    @Then("I go to home page")
    public void iGoToHomePage() {
        login.dashboardIsDisplayed();
    }

    @Then("I can not login")
    public void iCanNotLogin() {
        login.iconLoginIsDisplayed();
    }

    @When("I am input my email")
    public void iAmInputMyEmail() {
        login.inputMyValidEmail("fiqram@gmail.com");
    }

    @And("I input my password")
    public void iInputMyPassword() {
        login.inputMyValidPassword("ganteng");
    }
}
