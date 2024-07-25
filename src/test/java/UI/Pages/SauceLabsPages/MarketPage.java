package UI.Pages.SauceLabsPages;

import Elements.Interfaces.ExpandMernu;
import Elements.Label;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MarketPage extends LoginPage{

    public MarketPage(WebDriver instance) {
        super(instance);
    }

    private final ExpandMernu sort_container =
            new ExpandMernu(By.cssSelector(".product_sort_container"), "Click to expand");
    private final ExpandMernu hiloSort =
            new ExpandMernu(By.cssSelector("[value=\"hilo\"]"), "Higt to low");
    private final Label itemPrice =
            new Label(By.cssSelector(".inventory_item_price"), "Price of the product");

    public void clickExpandMenu(){
        sort_container.click();
    }
    public void chooseHiLoOption (){
        hiloSort.click();
    }

    public List<WebElement> getItemPricesElements() {
        return instance.findElements(By.cssSelector(".inventory_item_price"));
    }

}
