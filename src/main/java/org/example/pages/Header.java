package org.example.pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class Header extends BasePage {

//    @FindBy(css = "a[data-qaid='shopping_cart']")
//    private WebElement linkBasket;

    public Header(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
