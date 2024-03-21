package org.example.pages.login;

import org.example.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//div[@data-qaid='email_btn']")
    private WebElement emailButton;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void signInWithEmail() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-qaid='email_btn']")));
        emailButton.click();
    }
}
