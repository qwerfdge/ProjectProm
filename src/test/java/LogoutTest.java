import org.example.pages.LogoutPage;
import org.example.pages.login.EmailPage;
import org.example.pages.login.PasswordPage;
import org.example.pages.login.SidebarPage;
import org.example.pages.login.SignInPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {

    private SidebarPage sidebarPage;
    private SignInPage signInPage;
    private EmailPage emailPage;
    private PasswordPage passwordPage;
    private LogoutPage logoutPage;

    @BeforeClass
    public void setUpBeforeTest() {
        sidebarPage = new SidebarPage(webDriver);
        signInPage = new SignInPage(webDriver);
        emailPage = new EmailPage(webDriver);
        passwordPage = new PasswordPage(webDriver);
        logoutPage = new LogoutPage(webDriver);
    }

    @BeforeMethod
    public void loginBeforeTest() {
        webDriver.get("https://prom.ua/");
        sidebarPage.signInOrRegister();
        signInPage.signInWithEmail();
        emailPage.inputEmail("brehernasti@gmail.com");
        passwordPage.inputPassword("Mar19742005.");
        sidebarPage.clickAcceptButton();
    }

    @Test
    public void logoutTest() {
        logoutPage.logout();
        Assert.assertFalse(logoutPage.isUserLoggedIn());
    }
}
