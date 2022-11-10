package starter.pages;
import net.thucydides.core.pages.PageObject;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

public class Login extends PageObject {
    private By fieldEmail(){
        return By.xpath("(//div//input[@type='text'])[1]");
    }

    private By fieldPassword(){
        return By.xpath("(//div//input[@type='text'])[2]");
    }

    private By loginButton(){
        return By.xpath("//button/span[text()='Login']");
    }
    private By erorMsg(){
        return By.className("v-alert__wrapper");
    }

    private By headerIconAccount(){
        return By.xpath("//button//i[contains(@class,'user')]");
    }
    public void openUrlLogin() {
        openAt("/auth/login");
    }

    public void inputMyEmail(String email) {
        $(fieldEmail()).type(email);
    }

    public void inputMyPassword(String password) {
        $(fieldPassword()).type(password);
    }

    public void clickLoginButton() {
        $(loginButton()).click();
    }

    public void dashboardIsDisplayed() {
        $(headerIconAccount()).isDisplayed();
    }

    public void iconLoginIsDisplayed() {
        $(erorMsg()).isDisplayed();
    }

    public void inputMyValidEmail(String s) {
        $(fieldEmail()).type(s);
    }

    public void inputMyValidPassword(String retiaah10) {
        $(fieldPassword()).type(retiaah10);
    }
}
