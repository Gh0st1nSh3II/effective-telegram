package UI.Pages.SauceLabsPages;

import Elements.Button;
import Elements.Label;
import Elements.TextBoxInput;
import Entity.SauceLabsUsers;
import UI.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver instance) {
        super(instance);
    }

    public final static String sauceLabLoginPage = "https://www.saucedemo.com/";

    private final TextBoxInput loginUsernameField =
            new TextBoxInput(By.cssSelector("#user-name"), "Login field");
    private final TextBoxInput loginPasswordField =
            new TextBoxInput(By.cssSelector("#password"), "Password field");
    protected final Button loginButton =
            new Button(By.cssSelector("#login-button"), "Login button");
    private final Label loginCredentials =
            new Label(By.cssSelector("#login_credentials"), "Login credentials");
    private final Label loginErrorField =
            new Label(By.xpath("//div[contains(@class, \"error\")]"), "Login error field");


    public void sendLogin(String username) {
        loginUsernameField.sendKeys(username);
    }
    public void sendPassword(String password) {
        loginPasswordField.sendKeys(password);
    }
    public void sendLoginData(String username, String password) {
        loginUsernameField.sendKeys(username);
        loginPasswordField.sendKeys(password);
    }
    public void sendLoginPojoData(SauceLabsUsers sauceLabsUsers){
        loginUsernameField.sendKeys(sauceLabsUsers.getLogin());
        loginPasswordField.sendKeys(sauceLabsUsers.getPassword());
    }
    public void clickLoginBtn() {
        loginButton.click();
    }
    public boolean isLoginCredentialsVisible(){
        return loginCredentials.isDisplayed();
    }
    public boolean isLoginErrorVisible(){
        return loginErrorField.isDisplayed();
    }
    public String getLoginErrorMessage(){
        return loginErrorField.getText();
    }
}
