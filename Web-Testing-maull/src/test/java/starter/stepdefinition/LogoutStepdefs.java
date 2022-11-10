package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Logout;

public class LogoutStepdefs {
    @Steps
    Logout logout;
    @Then("I success logout")
    public void iSuccessLogout() {
        logout.headerIsDisplayed();

    }

    @Given("I am on dashboard page")
    public void iAmOnDashboardPage() {
        logout.openUrlAltashop();
    }

    @When("I click icon account")
    public void iClickIconAccount() {
        logout.clickIconAccount();
    }

    @Then("I click logout button")
    public void iClickLogoutButton() {
        logout.clickLogoutButton();
    }

    @Given("I have login And Iam in dashboard page")
    public void iHaveLoggedInAndIamInDashboardPage() {
        logout.openUrlLogin();
        logout.inputEmail("fiqram@gmail.com");
        logout.inputPassword("ganteng");
        logout.clickLoginButton();
        logout.goToLoginPage();
    }
}
