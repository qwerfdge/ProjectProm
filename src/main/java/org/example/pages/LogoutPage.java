package org.example.pages;

import org.example.pages.component.Header;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

    @FindBy(xpath = "//span[@class='_3Trjq gwkkx' and text()='Вийти']")
    private WebElement logoutButton;

    private final Header header;

    public LogoutPage(WebDriver driver) {
        super(driver);
        header = new Header(driver);
    }

    public boolean isUserLoggedIn() {
        return header.isUserLoggedIn();
    }

    public void logout() {
        header.clickAccountButton();
        header.waitForVisibility(logoutButton);
        logoutButton.click();
    }
}
