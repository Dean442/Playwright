package components;

import com.microsoft.playwright.Locator;

public class Button {

    public Locator locator;

    public Button(Locator locator) {
        System.out.println("Button.Button");
        this.locator = locator;
    }

    public void click() {
        System.out.println("Button.click");
        locator.click();
    }

    public void hover() {
        locator.hover();
    }
}
