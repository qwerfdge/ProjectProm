package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToFavoritePage extends BasePage {

    public AddToFavoritePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@data-qaid='add_favorite']")
    private WebElement addToFavorite;

    public void setFavoriteInput() {
        addToFavorite.click();
    }
}
