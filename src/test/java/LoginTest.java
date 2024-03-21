import org.example.pages.login.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    private SidebarPage sidebarPage;
    private SignInPage signInPage;
    private EmailPage emailPage;
    private PasswordPage passwordPage;

    @BeforeClass
    public void setUpBeforeTest() {
        sidebarPage = new SidebarPage(webDriver);
        signInPage = new SignInPage(webDriver);
        emailPage = new EmailPage(webDriver);
        passwordPage = new PasswordPage(webDriver);
    }

    @Test
    public void testLogin() {
        webDriver.get("https://prom.ua/ua/");
        sidebarPage.signInOrRegister();
        signInPage.signInWithEmail();
        emailPage.inputEmail("brehernasti@gmail.com");
        passwordPage.inputPassword("Mar19742005.");
        Assert.assertTrue(sidebarPage.isUserLoggedIn());
    }
}
