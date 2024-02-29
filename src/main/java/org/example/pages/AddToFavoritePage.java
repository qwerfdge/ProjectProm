package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToFavoritePage extends BasePage {

    public AddToFavoritePage(WebDriver driver) {
        super(driver);
    }

    public void addProductToFavorite(String productName) {

    }

    @FindBy(xpath = "//a[@data-qaid='favorite_btn']")
    private WebElement favoriteInput;

    public void setFavoriteInput() {
        favoriteInput.click();
    }
}