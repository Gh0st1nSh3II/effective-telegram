package UI.Pages;

import Driver.WebDriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected static WebDriver instance = WebDriverSingleton.getInstance();
    JavascriptExecutor js = (JavascriptExecutor) instance;

    public BasePage(WebDriver instance) {
        this.instance = instance;
    }

    public void open(String url) {
        instance.get(url);
    }

    public void close() {
        instance.close();
    }

    public void setBodyStyleZoom(int scale){
        js.executeScript("document.body.style.zoom='" + scale + "%'");
    }

    public void scrollPageDown(int pixels) {
        ((JavascriptExecutor) instance).executeScript("window.scrollBy(0, " + pixels + ");");
    }


}
