package com.memo.airbnb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBoxPage extends WebDriverHelper {

    By searchBoxyer = By.cssSelector("#bigsearch-query-location-input");
    By searchBoxAyv = By.id("bigsearch-query-location-input");
    By clickAyv = By.cssSelector("#bigsearch-query-location-suggestion-0");
    By searchDateEnter = By.cssSelector("div[data-testid='calendar-day-02/01/2024']");
    By searchDateExit = By.cssSelector("div[data-testid='calendar-day-02/04/2024']");
    By searchKisiler = By.xpath("//div[text()='Kişiler']");
    By yetiskinPlus = By.cssSelector("button[data-testid='stepper-adults-increase-button']");
    By cocukPlus = By.cssSelector("button[data-testid='stepper-children-increase-button']");
    By bebekPlus= By.cssSelector("button[data-testid='stepper-infants-increase-button']");
    By searchButton = By.cssSelector("button[data-testid='structured-search-input-search-button']");


    public SearchBoxPage(WebDriver driver) {
        super(driver);
    }

    public void searchYer(){
        click(searchBoxyer,10);
    }

    public void searchAyv(String keyword) throws InterruptedException {
        driver.findElement(searchBoxAyv).sendKeys(keyword);
        Thread.sleep(1000);
        click(clickAyv,10);
    }

    public void searchDate(){
        click(searchDateEnter,10);
        click(searchDateExit,10);
        click(searchKisiler,10);
    }

    public void searchKisi(){
        click(yetiskinPlus,10);
        click(yetiskinPlus,10);
        click(cocukPlus,10);
        click(bebekPlus,10);
    }

    public void searchButon(){
        click(searchButton,10);
    }



}
