package com.memo.airbnb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebDriverHelper {

    By Popup = By.cssSelector("._yoc0mbj > div:nth-of-type(3) path:nth-of-type(1)");

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public BasePage getLoginPage(){
        //click(Popup,10);
        return new BasePage(driver);
    }
}
