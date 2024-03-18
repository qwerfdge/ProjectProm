package org.example.pages.component;

import lombok.Getter;
import org.example.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class Header extends BasePage {

    @FindBy(xpath = "//button[@data-qaid='show_sidebar']")
    private WebElement cabinetButton;

    @FindBy(xpath = "")
    private WebElement accountButton;

    @FindBy(xpath = "")
    private WebElement favoriteButton;

    public Header(WebDriver driver) {
        super(driver);
    }

    public void clickAccountButton() {
        accountButton.click();
    }
}
