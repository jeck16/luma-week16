package com.luma.pages;

import com.luma.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement women;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement tops;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement womenJackets;
    @CacheLookup
    @FindBy(xpath = "(//select[@id='sorter'])[1]")
    WebElement selectSorting;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-5']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
    WebElement men;
    @CacheLookup
    @FindBy(xpath = "//li[@class = 'level1 nav-3-2 category-item last parent ui-menu-item']//span[contains(text(),'Bottoms')]")
    WebElement bottoms;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pants;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gear;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement duffle;

    public void mouseHoverOnWomenTopsAndClick() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Women']")));
        log.info("Mouse hover on Women ");
        mouseHoverToElement(women);
        Thread.sleep(1000);
        log.info("Mouse hover on Tops ");
        mouseHoverToElement(tops);
        Thread.sleep(1000);
        log.info("Mouse hover on Women Jackets and Click ");
        mouseHoverToElementAndClick(womenJackets);
        Thread.sleep(1000);
    }

    public void mouseHoverOnMenBottomsAndClick() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-id-5']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")));
        log.info("Mouse hover on Men ");
        mouseHoverToElement(men);
        Thread.sleep(5000);
        log.info("Mouse hover on Bottoms");
        mouseHoverToElement(bottoms);
        Thread.sleep(5000);
        log.info("Mouse hover on Pants and click ");
        mouseHoverToElementAndClick(pants);

    }

    public void selectSortingOption(String text) throws InterruptedException {
        log.info("Select Sorting " + text);
        selectByVisibleTextFromDropDown(selectSorting, text);
        Thread.sleep(1000);
    }

    public void mouseHoverOnGearAndClick() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='Gear']")));
        log.info("Mouse hover on Gear ");
        mouseHoverToElement(gear);
        Thread.sleep(5000);
        log.info("Mouse hover on Bags and Click ");
        mouseHoverToElementAndClick(bags);
        Thread.sleep(3000);
        log.info("Click on Duffle ");
        clickOnElement(duffle);
    }

}
