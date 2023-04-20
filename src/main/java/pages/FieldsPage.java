package pages;

import com.microsoft.playwright.Page;
import components.Button;

import javax.swing.*;

public class FieldsPage extends BasePage{

    public final Button accademyButton;
    public final Button gpiButton;
    public final Button datenmanagementButton;
    public final Button qualitaetButton;
    public final Button softwareButton;
    public FieldsPage(Page page) {
        super(page);
        accademyButton = new Button(getByHref("https://www.akros.ch/academy/"));
        gpiButton = new Button(getByHref("/geschaftsfelder/geschaftsprozessintegration/"));
        datenmanagementButton = new Button(getByHref("/geschaftsfelder/datenmanagement/"));
        qualitaetButton = new Button(getByHref("/geschaftsfelder/qualitatsmanagement/"));
        softwareButton = new Button(getByHref("/geschaftsfelder/softwarelosungen/"));
    }
    @Override
    public void navigateTo() {
        page.navigate("https://www.akros.ch/geschaftsfelder");
    }


}
