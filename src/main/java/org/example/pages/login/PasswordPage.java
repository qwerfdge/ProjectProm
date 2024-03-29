package org.example.pages.login;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPage extends BasePage {

    @FindBy(xpath = "//input[@id='enterPassword']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@id='enterPasswordConfirmButton']")
    private WebElement passwordConfirmButton;

    public PasswordPage(WebDriver driver) {
        super(driver);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
        passwordConfirmButton.click();
    }
}
