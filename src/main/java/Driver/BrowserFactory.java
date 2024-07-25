package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {
    BrowserFactory browserFactory;

        static WebDriver createBrowserByArgument(BrowserTypeEnum browserEnum) {
            switch (browserEnum) {
                case CHROME:
                    return new ChromeDriver();

                case FIREFOX:
                    return new FirefoxDriver();

                case CHROME_INCOGNITO:
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--incognito");
                    return new ChromeDriver(chromeOptions);

                case FIREFOX_HEADLESS:
                    FirefoxOptions firefoxOptions2 = new FirefoxOptions();
                    firefoxOptions2.addArguments("--headless");
                    return new FirefoxDriver(firefoxOptions2);

                case EDGE:
                    return new EdgeDriver();
            }

            throw new RuntimeException(browserEnum + " is unknown argument");
        }
    }

