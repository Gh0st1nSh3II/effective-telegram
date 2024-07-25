package Elements.Interfaces;

import org.openqa.selenium.Keys;

public interface IElement {
    void sendKeys(Keys keys);

    void clickAndWait();

    default String getText() {
        return getText();
    }

}
