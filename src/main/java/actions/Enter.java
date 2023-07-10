package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Enter {

    public void text(WebDriver driver, By locator , String value){
        driver.findElement(locator).sendKeys(value);
    }
}
