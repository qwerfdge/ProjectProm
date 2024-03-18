import org.example.pages.login.*;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void testLogin() {
        webDriver.get("https://prom.ua/ua/");
        SignInPage signInPage = new SignInPage(webDriver);
        signInPage.signIn();
        SignInOrRegisterPage signInOrRegisterPage = new SignInOrRegisterPage(webDriver);
        signInOrRegisterPage.signInOrRegister();
        SignInWithEmailPage signInWithEmailPage = new SignInWithEmailPage(webDriver);
        signInWithEmailPage.signInWithEmail();
        EmailPage emailPage = new EmailPage(webDriver);
        emailPage.inputEmail("brehernasti@gmail.com");
        PasswordPage passwordPage = new PasswordPage(webDriver);
        passwordPage.inputPassword("Mar19742005.");

//        String expectedUserName = "Your Username";
//        String actualUserName = header.getLoggedInUserName();
//        Assert.assertEquals(actualUserName, expectedUserName, "Login failed!");

    }
}
