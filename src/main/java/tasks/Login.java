package tasks;

import actions.Enter;
import actions.Click;
import actions.WaitUntil;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class Login {

    private WebDriver driver;
    private LoginPage loginPage;
    private Enter enter;
    private Click click;
    private WaitUntil waitUntil;

    public Login(WebDriver driver) {
        this.driver = driver;
        this.loginPage = new LoginPage();
        this.enter = new Enter();
        this.click = new Click();
        this.waitUntil = new WaitUntil();

    }

    public void as(String username, String password) {
        waitUntil.elementIsVisible(driver,loginPage.userName);
        enter.text(driver, loginPage.userName, username);
        enter.text(driver, loginPage.password, password);
        click.on(driver,loginPage.loginButton);
    }
}
