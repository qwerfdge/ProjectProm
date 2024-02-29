import org.example.pages.Header;
import org.example.pages.login.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;
    private Header header;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Anastasia/AppData/Local/Microsoft/WindowsApps/chromedriver.exe");
        driver = new ChromeDriver();
        header = new Header(driver);
        driver.manage().window().maximize();
        driver.get("https://prom.ua/");
    }

    @Test
    public void testLogin() {

//        header.getLinkBasket().click();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.signIn();

        SignInOrRegisterPage signInOrRegisterPage = new SignInOrRegisterPage(driver);
        signInOrRegisterPage.signInOrRegister();

        SignInWithEmailPage signInWithEmailPage = new SignInWithEmailPage(driver);
        signInWithEmailPage.signInWithEmail();

        EmailPage emailPage = new EmailPage(driver);
        emailPage.inputEmail("brehernasti@gmail.com");

        PasswordPage passwordPage = new PasswordPage(driver);
        passwordPage.inputPassword("Mar19742005.");

//        String expectedUserName = "Your Username";
//        String actualUserName = header.getLoggedInUserName();
//        Assert.assertEquals(actualUserName, expectedUserName, "Login failed!");

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
