package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SelectCategory extends PageObject {

    private By fieldemail(){
        return By.xpath("(//div//input[@type='text'])[1]");
    }

    private By fieldPassword(){
        return By.xpath("(//div//input[@type='text'])[2]");
    }

    private By loginButton(){
        return By.xpath("//button/span[text()='Login']");
    }

    private By selectCategory(){
        return By.xpath("//div[contains(@class,'v-select__selections')]");
    }

    private By selectGaming1(){
        return By.xpath("(//div[@class='v-list-item__title'][text()='gaming'])[1]");
    }

    private By selectGaming2(){
        return By.xpath("(//div[@class='v-list-item__title'][text()='gaming'])[2]");
    }

    private By selectGaming6(){
        return By.xpath("(//div[@class='v-list-item__title'][text()='gaming'])[6]");
    }

    private By selectDolanan1(){
        return By.xpath("(//div//div[@class='v-list-item__title'])[5]");
    }

    private By selectDolanan2(){
        return By.xpath("(//div//div[@class='v-list-item__title'])[5]");
    }

    private By mesaage() {
        return By.xpath("//div[@class='v-alert__wrapper']");
    }


    public void clickSelectCategory() {
        $(selectCategory()).click();
    }

    public void clickGamming1() {
        $(selectGaming1()).click();
    }

    public void getProductIsEmptyMessage() {
        $(mesaage()).isDisplayed();
    }

    public void clickDolonan1() {
        $(selectDolanan1()).click();
    }

    public void clickGamming2() {
        $(selectGaming2()).click();
    }

    public void clickGamming6() {
        $(selectGaming6()).click();
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
}
