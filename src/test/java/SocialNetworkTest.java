// Язык программирования: Java

import org.example.pages.SocialNetworkPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SocialNetworkTest {

    private WebDriver driver;
    private SocialNetworkPage socialPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://prom.ua/p1272542085-loson-sprej-dlya.html");
        socialPage = new SocialNetworkPage(driver);
    }

    @Test
    public void testSocialNetworkLinks() {
        socialPage.goToSocialNetworks();
        List<String> socialNetworks = socialPage.getSocialNetworkLinks();


        Assert.assertTrue("No social network links found on the page", socialNetworks.size() > 0);


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}