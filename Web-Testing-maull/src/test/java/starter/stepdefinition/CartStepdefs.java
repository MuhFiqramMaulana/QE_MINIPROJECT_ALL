package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Cart;

public class CartStepdefs {
    @Steps
    Cart cart;
    @Given("I have logged in")
    public void iHaveLoggedIn() {
        cart.openUrlLogin();
        cart.inputEmail("fiqram@gmail.com");
        cart.inputPassword("ganteng");
        cart.clickLoginButton();
        cart.openUrlAltashop();
    }

    @When("I click beli button")
    public void iClickBeliButton() {
        cart.clickBeliButton();
    }

    @Then("Item added successfully to cart")
    public void itemAddedSuccessfullyToCart() {
        cart.quantityIsDisplayed();
    }

    @Given("I am on order page")
    public void iAmOnOrderPage() {
        cart.openUrlOrderPage();
        cart.clickCartButton();
    }

    @When("I click icon plus")
    public void iClickIconPlus() {
        cart.clickIconPlus();
    }

    @Then("number of items increases")
    public void numberOfItemsIncreases() {
        cart.numberIsDisplayed();
    }

    @When("I click bayar button")
    public void iClickBayarButton() {
        cart.clickBayarButton();
    }

    @Then("I go to transaction page")
    public void iGoToTransactionPage() {
        cart.transactionPageIsDisplayed();
    }

    @And("I add item to cart")
    public void iAddItemToCart() {
        cart.clickBeliButton();
    }

    @And("I click cart button")
    public void iClickCartButton() {
        cart.clickCartButton();
    }
}
