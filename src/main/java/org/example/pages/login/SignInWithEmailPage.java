package org.example.pages.login;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInWithEmailPage extends BasePage {

    @FindBy(xpath = "//div[@data-qaid='email_btn']")
    private WebElement emailButton;

    public SignInWithEmailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void signInWithEmail() {
        emailButton.click();
    }
}
