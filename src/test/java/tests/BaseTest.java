package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import tasks.CheckLoginErrorMessage;
import tasks.CheckTopBar;
import tasks.Login;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected WebDriver driver;
    protected Login login;
    protected CheckLoginErrorMessage checkLoginErrorMsg;
    protected CheckTopBar checkTopBar;

    @BeforeClass
    public void setUp() {
        this.driverSetup();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        this.tasksInstantiation();

    }

    public void driverSetup(){
        WebDriverManager.chromedriver().setup(); // This will download the appropriate ChromeDriver version
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void tasksInstantiation(){
        login = new Login(driver);
        checkLoginErrorMsg = new CheckLoginErrorMessage(driver);
        checkTopBar = new CheckTopBar(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
