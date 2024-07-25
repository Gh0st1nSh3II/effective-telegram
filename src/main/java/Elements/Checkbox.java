package Elements;

import org.openqa.selenium.By;

public class Checkbox extends BaseElement{

    public Checkbox(By locator, String name) {
        super(locator, name);
    }

    public boolean isChecked() {
        return isDisplayed();
    }

}
