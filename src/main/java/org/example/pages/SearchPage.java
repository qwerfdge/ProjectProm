package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    private final WebDriver driver;
    private final By searchBox = By.id("Ноутбук");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchFor(String query) {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.sendKeys(query);
        searchInput.sendKeys(Keys.RETURN);
    }
}
