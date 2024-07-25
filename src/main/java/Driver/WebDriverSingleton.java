package Driver;

import org.openqa.selenium.WebDriver;

import static Driver.BrowserFactory.createBrowserByArgument;

public class WebDriverSingleton {
    private static WebDriver instance;

    private WebDriverSingleton() {}

    public static synchronized WebDriver getDriver(BrowserTypeEnum browserEnum) {
        if (instance == null) {
            instance = createBrowserByArgument(browserEnum);
        }
        return instance;
    }

    public static WebDriver getInstance() {
        return instance;
    }
}
