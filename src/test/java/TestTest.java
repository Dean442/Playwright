

import com.microsoft.playwright.Page;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import java.nio.file.Paths;

public class TestTest extends BaseTest {

    @Test
    public void test() {
        System.out.println("TestTest.test");
        HomePage homePage = new HomePage(page);
        homePage.navigateTo();
        homePage.felderButton.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        page.screenshot(new Page.ScreenshotOptions()
                .setPath(Paths.get("screenshots/screenshot.png")));
    }
}
