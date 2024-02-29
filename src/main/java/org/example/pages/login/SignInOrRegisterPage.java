package org.example.pages.login;

import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInOrRegisterPage extends BasePage {

    @FindBy(xpath = "//button[@data-qaid='sign_in_mob_sidebar']")
    private WebElement signInMobSidebar;

    public SignInOrRegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void signInOrRegister() {
        signInMobSidebar.click();
    }
}
