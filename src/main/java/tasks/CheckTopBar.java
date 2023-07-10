package tasks;

import actions.WaitUntil;
import org.openqa.selenium.WebDriver;
import pages.TopBarPage;

public class CheckTopBar {
    private WebDriver driver;
    private WaitUntil waitUntil;
    private TopBarPage topBarPage;

    public CheckTopBar(WebDriver driver) {
        this.driver = driver;
        this.waitUntil = new WaitUntil();
        this.topBarPage = new TopBarPage();
    }

    public boolean appears() {
        return waitUntil.elementIsVisible(driver, topBarPage.userDropDown);
    }
}
