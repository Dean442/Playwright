package components;

import com.microsoft.playwright.Locator;

public class Button {

    public Locator locator;

    public Button(Locator locator) {
        this.locator = locator;
    }

    public void click() {
        locator.click();
    }

    public void hover() {
        locator.hover();
    }
}
