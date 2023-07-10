package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSuccesfulTest extends BaseTest {

    @Test
    public void loginSuccesful(){
        login.as("Admin","admin123");
        Assert.assertTrue(checkTopBar.appears(), "User drop down does not appear in top bar page");
    }
}
