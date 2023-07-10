package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUntil {

    WebDriverWait wait;


    public boolean elementIsVisible(WebDriver driver, By locator ) {
        try {
            this.wait = new WebDriverWait(driver, 10);
            this.wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
