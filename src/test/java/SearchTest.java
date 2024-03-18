import org.example.pages.SearchPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {

    private WebDriver driver;
    private SearchPage searchPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://prom.ua/p1272542085-loson-sprej-dlya.html");
        searchPage = new SearchPage(driver);
    }

    @Test
    public void testSiteSearch() {
        searchPage.searchFor("Ноутбук");

        // Добавьте проверку наличия результатов поиска
//        Assert.assertTrue("Результаты поиска не отображены", searchPage.areSearchResultsDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
