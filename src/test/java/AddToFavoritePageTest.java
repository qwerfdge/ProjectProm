import org.example.pages.AddToFavoritePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToFavoritePageTest  {

    private WebDriver driver;
    private AddToFavoritePage addToFavoritePage;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Anastasia/AppData/Local/Microsoft/WindowsApps/chromedriver.exe");
        driver = new ChromeDriver();

        addToFavoritePage = new AddToFavoritePage(driver);


        driver.get("https://prom.ua/p1272542085-loson-sprej-dlya.html");
    }

    @Test
    public void testAddProductToFavorite() {

        addToFavoritePage.setFavoriteInput();


    }

    @After
    public void tearDown() {

        driver.quit();
    }
}

