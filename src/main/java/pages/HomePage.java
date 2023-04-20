package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import components.Button;

public class HomePage extends BasePage{

    private final String baseUrl = "https://www.akros.ch/";
    public Locator buttonList;
    public Button unternehmenButton;
    public Button felderButton;
    public Button branchenButton;
    public Button jobsButton;
    public Button academyButton;
    public Button supportButton;
        public HomePage(Page page) {
            super(page);
            navigateTo();
            page.locator("button#onetrust-accept-btn-handler").click();

            buttonList = getById("menu-main");
            unternehmenButton = new Button(buttonList.getByRole(AriaRole.LISTITEM).all().get(0));
            felderButton = new Button(buttonList.getByRole(AriaRole.LISTITEM).all().get(1));
            branchenButton = new Button(buttonList.getByRole(AriaRole.LISTITEM).all().get(2));
            jobsButton = new Button(buttonList.getByRole(AriaRole.LISTITEM).all().get(3));
            academyButton = new Button(buttonList.getByRole(AriaRole.LISTITEM).all().get(4));
            supportButton = new Button(buttonList.getByRole(AriaRole.LISTITEM).all().get(5));

        }

        @Override
        public void navigateTo() {
            page.navigate(baseUrl);
        }

        //navigation Buttons


}
