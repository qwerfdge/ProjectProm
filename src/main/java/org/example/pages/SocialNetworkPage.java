package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SocialNetworkPage {

    private WebDriver driver;

    public SocialNetworkPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToSocialNetworks() {

    }

    public List<String> getSocialNetworkLinks() {
        List<String> socialNetworkLinks = new ArrayList<>();
        List<WebElement> socialLinks = driver.findElements(By.xpath(""));

        for (WebElement link : socialLinks) {
            socialNetworkLinks.add(link.getAttribute("href"));
        }

        return socialNetworkLinks;
    }
}