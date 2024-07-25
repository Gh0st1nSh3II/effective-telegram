package Elements;

import Driver.WebDriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public abstract class BaseElement {
    protected static WebDriver instance = WebDriverSingleton.getInstance();
    private By locator;
    private String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public WebElement findElement() {
        return instance.findElement(this.locator);
    }

    public boolean isDisplayed() {
        return findElement().isDisplayed();
    }

    public void click() {
        findElement().click();
    }

    public void sendKeys(String keys){
        findElement().sendKeys(keys);
    }

    public String getText(){
        return findElement().getText();
    }

    public void moveTo() {
        new Actions(instance).moveToElement(findElement()).build().perform();
    }
    public void clickAndHold(){
        new Actions(instance).clickAndHold(findElement()).build().perform();
    }

    public void sendDoubleClick(){
        new Actions(instance).doubleClick();
    }

    public void scrollToElement(WebElement element){
        new Actions(instance).scrollToElement(element).perform();
    }

    public List<WebElement> findElements() {
        return instance.findElements(this.locator);
    }

}
