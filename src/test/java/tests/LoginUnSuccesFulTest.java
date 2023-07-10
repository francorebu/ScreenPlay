package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginUnSuccesFulTest extends BaseTest {

    @Test
    public void loginUnSuccesful(){
        login.as("Admin","invalidPass");
        Assert.assertTrue(checkLoginErrorMsg.appears(), "Error msg does not appear");
    }
}
