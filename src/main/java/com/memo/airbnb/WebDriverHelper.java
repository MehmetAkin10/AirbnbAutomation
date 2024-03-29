package com.memo.airbnb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverHelper {

    protected WebDriver driver;
    WebDriverWait w;

    public WebDriverHelper(WebDriver driver){
        this.driver=driver;
    }

    public void click(By byElement, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).click();

    }

    public void clickSix(By byElement,int time){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
    }

    public void scrollWithJs(By byElement) throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement el = driver.findElement(byElement);
        js.executeScript("arguments[0].scrollIntoView(true);",el);
        Thread.sleep(2000);

    }




    public void scrollWithAction(By byElement) {
        //Actions actions = new Actions(driver);
        //actions.moveToElement(driver.findElement(byElement)).build().perform();

        //WebElement myElement = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(driver.findElement(byElement)));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", myElement);
        //actions.moveToElement(driver.findElement(byElement)).build().perform();

         /*
        WebElement searchButton = driver.findElement(By.cssSelector("li>a[href='https://www.turkishairlines.com/tr-int/arac-kiralama/']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)", searchButton);

         */


        //actions.moveToElement().build().perform();


        //WebElement searchButton = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(byElement));
        WebElement searchButton = driver.findElement(byElement);


        //to perform Scroll on application using Selenium
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)", searchButton);
    }




    public void sendKeys(By byElement, String text, boolean submit) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(byElement)).sendKeys(text);
        if (submit) {
            WebElement element = driver.findElement(byElement);
            element.submit();
        }
    }

    public String getText(By byElement){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(byElement)).getText();

    }
}
