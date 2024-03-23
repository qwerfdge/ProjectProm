package org.example.pages.login;

import org.example.pages.BasePage;
import org.example.pages.component.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidebarPage extends BasePage {

    @FindBy(xpath = "//button[@data-qaid='sign_in_mob_sidebar']")
    private WebElement signInMobSidebar;

    @FindBy(xpath = "//span[@data-qaid='error_field']")
    private WebElement errorField;

    @FindBy(xpath = "//button[@data-qaid='accept_btn']")
    private WebElement acceptButton;

    private final Header header;

    public SidebarPage(WebDriver driver) {
        super(driver);
        header = new Header(driver);
    }

    public void signInOrRegister() {
        header.getCabinetButton().click();
        signInMobSidebar.click();
    }

    public boolean isUserLoggedIn() {
        return header.isUserLoggedIn();
    }

    public boolean isErrorDisplayed(String expectedErrorMessage) {
        try {
            return errorField.isDisplayed() && errorField.getText().equals(expectedErrorMessage.trim());
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void clickAcceptButton() {
        header.waitForVisibility(acceptButton);
        acceptButton.click();
    }
}
