package pages;

import org.openqa.selenium.By;

public class LoginPage {

    public By userName = By.xpath("//*[@name='username']");
    public By password = By.xpath("//*[@name='password']");
    public By loginButton = By.xpath("//*[@type='submit']");
    public By errorMessage = By.xpath("//*[@role='alert']");

}
