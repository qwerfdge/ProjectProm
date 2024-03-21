package org.example.pages.component;

import lombok.Getter;
import org.example.pages.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Getter
public class Header extends BasePage {

    @FindBy(xpath = "//button[@data-qaid='show_sidebar']")
    private WebElement cabinetButton;

    @FindBy(xpath = "//div[@data-qaid='avatar']")
    private WebElement accountButton;

    @FindBy(xpath = "")
    private WebElement favoriteButton;

    public Header(WebDriver driver) {
        super(driver);
    }

    public void clickAccountButton() {
        waitForVisibility(accountButton);
        accountButton.click();
    }

    public boolean isUserLoggedIn() {
        try {
            return getAccountButton().isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void waitForVisibility(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("Element is visible and clickable: " + element);
        } catch (TimeoutException e) {
            System.out.println("Timeout waiting for visibility of element" + element + "'");
            throw e;
        }
    }
}
