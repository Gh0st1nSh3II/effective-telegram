package UI.Tests;

import Driver.BrowserTypeEnum;
import Driver.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver = WebDriverSingleton.getDriver(BrowserTypeEnum.FIREFOX_HEADLESS);

    @BeforeSuite
    protected void setupMethod() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
    }

    @AfterTest
    public void quitTheApp() {
        driver.quit();
    }
}
