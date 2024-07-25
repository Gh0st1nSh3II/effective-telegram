package UI.Pages.DemoqaPages;

import Elements.Button;
import Elements.Label;
import Elements.TextBoxInput;
import Entity.DemoqaTextBoxPerson;
import UI.Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBoxElementPage extends BasePage {

    public TextBoxElementPage(WebDriver instance) {
        super(instance);
    }

    public final static String textPageLink = "https://demoqa.com/text-box";

    DemoqaTextBoxPerson demoqaTextBoxPerson;

    private final TextBoxInput fullNameBox =
            new TextBoxInput(By.cssSelector("#userName"), "Enter Full Name");
    private final TextBoxInput emailBox =
            new TextBoxInput(By.cssSelector("#userEmail"), "Enter Email");
    private final TextBoxInput currentAddressBox =
            new TextBoxInput(By.cssSelector("#currentAddress"), "Enter Current Address");
    private final TextBoxInput permanentAddressBox =
            new TextBoxInput(By.cssSelector("#permanentAddress"), "Enter Current Address");
    private final Button submitButton =
            new Button(By.cssSelector("#submit"), "Submit Button");
    private final Label outputData =
            new Label(By.cssSelector("#output"), "Output Data");


    public void sendData(DemoqaTextBoxPerson demoqaTextBoxPerson) {
        fullNameBox.sendKeys(demoqaTextBoxPerson.getFullName());
        emailBox.sendKeys(demoqaTextBoxPerson.getEmail());
        currentAddressBox.sendKeys(demoqaTextBoxPerson.getCurrentAddress());
        permanentAddressBox.sendKeys(demoqaTextBoxPerson.getPermanentAddress());
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isOutputDataContainsResult() {
        if (outputData.getText() == null || outputData.getText().isEmpty()) {
            return false;
        }else{
            return true;
        }
    }
}
