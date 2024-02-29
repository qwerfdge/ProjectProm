package org.example.pages.login;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage extends BasePage {

    @FindBy(xpath = "//input[@id='email_field']")
    private WebElement emailField;

    @FindBy(xpath = "//button[@id='emailConfirmButton']")
    private WebElement emailConfirmButton;

    public EmailPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
        emailConfirmButton.click();
    }
}
