package UI.Tests.SauceLabsTests;

import Entity.SauceLabsUsers;
import UI.Pages.SauceLabsPages.MarketPage;
import UI.Tests.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static UI.Pages.SauceLabsPages.LoginPage.sauceLabLoginPage;


/**
 *    Go to https://www.saucedemo.com
 *     Login as a standard_user
 *     Select sort by price (High to low)
 *     Make sure products are displayed correctly
 */

public class SL001_testMustLoginAndCheckSortTest extends BaseTest {
    MarketPage sortActionPage = new MarketPage(driver);
    SauceLabsUsers standartUser = new SauceLabsUsers("standard_user", "secret_sauce");

    @Test
    public void testMustLoginAndCheckSort() {
        sortActionPage.open(sauceLabLoginPage);

        sortActionPage.sendLoginPojoData(standartUser);

        sortActionPage.clickLoginBtn();

        sortActionPage.clickExpandMenu();

        sortActionPage.chooseHiLoOption();

        List<Float> itemPricesList = new ArrayList<>();

        for (WebElement element : sortActionPage.getItemPricesElements()) {
            String value = element.getText().replaceAll("[$]", "");
            itemPricesList.add(Float.valueOf(value));
        }
        Assert.assertTrue(itemPricesList.stream().allMatch(x -> x >= 0));
    }
}
