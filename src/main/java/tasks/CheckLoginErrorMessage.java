package tasks;

import actions.WaitUntil;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class CheckLoginErrorMessage {
    private WebDriver driver;
    private WaitUntil waitUntil;
    private LoginPage loginPage;

    public CheckLoginErrorMessage(WebDriver driver) {
        this.driver = driver;
        this.waitUntil = new WaitUntil();
        this.loginPage = new LoginPage();
    }

    public boolean appears() {
        return waitUntil.elementIsVisible(driver, loginPage.errorMessage);
    }
}

