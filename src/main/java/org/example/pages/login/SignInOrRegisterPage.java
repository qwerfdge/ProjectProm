package org.example.pages.login;

import org.example.pages.BasePage;
import org.example.pages.component.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInOrRegisterPage extends BasePage {

    @FindBy(xpath = "//button[@data-qaid='sign_in_mob_sidebar']")
    private WebElement signInMobSidebar;

    private final Header header;

    public SignInOrRegisterPage(WebDriver driver) {
        super(driver);
        header = new Header(driver);
    }

    public void signInOrRegister() {
        header.getCabinetButton().click();
        signInMobSidebar.click();
    }
}
