package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Cart extends PageObject {

    private By fieldemail(){
        return By.xpath("(//div//input[@type='text'])[1]");
    }

    private By fieldPassword(){
        return By.xpath("(//div//input[@type='text'])[2]");
    }

    private By loginButton(){
        return By.xpath("//button/span[text()='Login']");
    }
    private By beliButon(){
        return By.xpath("(//button[@type='button']/span)[4]");
    }
    private By numberOnCart(){
        return By.xpath("//span//span[contains(@class,'primary')]");
    }
    private By quantityButton(){
        return By.xpath("(//button/span[@class='v-btn__content'])[4]");
    }
    private By quantityDisplayed(){
        return By.xpath("(//span[@class='mx-3 label-quantity'])[1]");
    }
    private By bayarButton(){
        return By.xpath("//button[@id='button-bayar']/span");
    }
    private By transactionPage(){
        return By.xpath("//h3");
    }
    private By cartButton(){
        return By.xpath("(//button//span[@class='v-btn__content'])[1]");
    }


    public void openUrlAltashop() {
        openAt("/");
    }

    public void clickBeliButton() {
        $(beliButon()).click();
    }

    public void quantityIsDisplayed() {
        $(quantityDisplayed()).isDisplayed();
    }

    public void openUrlOrderPage() {
        openAt("/order");
    }

    public void clickIconPlus() {
        $(quantityButton()).click();
    }

    public void numberIsDisplayed() {
        $(numberOnCart()).isDisplayed();
    }

    public void clickBayarButton() {
        $(bayarButton()).click();
    }

    public void transactionPageIsDisplayed() {
        $(transactionPage()).isDisplayed();
    }

    public void openUrlLogin() {
        openAt("/auth/login");
    }

    public void inputEmail(String s) {
        $(fieldemail()).type(s);
    }

    public void inputPassword(String retiaah10) {
        $(fieldPassword()).type(retiaah10);
    }

    public void clickLoginButton() {
        $(loginButton()).click();
    }

    public void clickCartButton() {
        $(cartButton()).click();
    }
}
