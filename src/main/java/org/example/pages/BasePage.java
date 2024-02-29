package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public final String ADD_TO_FAVORITE = "Додано до улюбленого";

    protected final String ADD_TO_CART = "Додано в кошик";

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getLoggedInUserName() {
        return null;
    }
}
