package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DufflePage extends Utility {
    private static final Logger log = LogManager.getLogger(DufflePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addToCart;

    public void changeQuantity(String text) {
        log.info("Change Quantity " + text);
        quantity.clear();
        sendTextToElement(quantity, text);
    }

    public void clickOnAddToCart() {
        log.info("Click on Add to Cart ");
        clickOnElement(addToCart);
    }
}
