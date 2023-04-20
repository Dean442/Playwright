package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class BasePage {

    public final Page page;
    public BasePage(Page page) {
        this.page = page;
    }

    public void navigateTo() {
    }

    public Locator getById(String id) {
        return page.locator("#" + id);
    }

    public Locator getByHref(String href) {
        return page.locator("a[href='" + href + "']");
    }

}
