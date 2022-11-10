package starter.pages;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class Logout extends PageObject {
    private By fieldemail(){
        return By.xpath("(//div//input[@type='text'])[1]");
    }

    private By fieldPassword(){
        return By.xpath("(//div//input[@type='text'])[2]");
    }

    private By loginButton(){
        return By.xpath("//button/span[text()='Login']");
    }
    private By headerIconAccount(){
        return By.xpath("//button//i[contains(@class,'user')]");
    }
    private By accountButton(){
        return By.xpath("//button//i[contains(@class,'user')]");
    }
    private By logoutButton(){
        return By.xpath("(//div[@class='v-list-item__title'])[2]");
    }
    private By headerIconLogin(){
        return By.className("//div[contains(@class,'title')][text()='Login']");
    }
    private By loginPage(){
        return By.className("container");
    }
    public void openUrlAltashop() {
        openAt("/");
    }

    public void clickIconAccount() {
        $(accountButton()).click();
    }

    public void clickLogoutButton() {
        $(logoutButton()).click();
    }

    public void headerIsDisplayed() {
        $(headerIconLogin()).isDisplayed();
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

    public void goToLoginPage() {
        $(loginPage()).isDisplayed();
    }
}
