package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click {

    public void on (WebDriver driver, By locator ){
        driver.findElement(locator).click();
    }
}
