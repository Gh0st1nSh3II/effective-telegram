package UI.Tests.DemoqaTests;

import Entity.DemoqaTextBoxPerson;
import UI.Pages.DemoqaPages.TextBoxElementPage;
import UI.Tests.BaseTest;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

import static UI.Pages.DemoqaPages.TextBoxElementPage.textPageLink;

/**
 *     Open https://demoqa.com/text-box
 *     Fill all textboxes
 *     Click on Submit button
 *     Check that you can see the data that you entered
 *
 *     Important things: you should have 1 positive scenario and 1 negative scenario
 * */

public class TC001_testMustFillTxtBoxTest extends BaseTest {
    TextBoxElementPage textBoxElementPage = new TextBoxElementPage(driver);

    DemoqaTextBoxPerson positivePerson =
            new DemoqaTextBoxPerson("Ryan Gosling", "ryanDrive8@gmail.com", "257 Fireweed Ln", "912 Park Ave");

    DemoqaTextBoxPerson negativePerson =
            new DemoqaTextBoxPerson("Arnold Schwarzenegger", "a' OR 1=1", "2336 Jack Warren Rd", "925 S Chugach St #APT 10");

    @Test
    public void testMustFillTxtBoxPositive() {
        textBoxElementPage.open(textPageLink);
        textBoxElementPage.setBodyStyleZoom(50);

        textBoxElementPage.sendData(positivePerson);

        textBoxElementPage.clickSubmitButton();

        Assert.assertTrue(textBoxElementPage.isOutputDataContainsResult());
    }

    @Test
    public void testMustFillTxtBoxNegative() {

        textBoxElementPage.open(textPageLink);
        textBoxElementPage.setBodyStyleZoom(50);

        textBoxElementPage.sendData(negativePerson);

        textBoxElementPage.clickSubmitButton();

        Assert.assertFalse(textBoxElementPage.isOutputDataContainsResult());
        Allure.step("Must Fill Text Box");
    }
}
