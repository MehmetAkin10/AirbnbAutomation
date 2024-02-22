package com.test.test;

import com.test.driver.BaseTest;
import com.test.methods.Methods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {


    @Test
    public void LoginTest(){
        Methods methods = new Methods();


        methods.waitBySeconds(3);

        methods.click(By.cssSelector("._yoc0mbj > div:nth-of-type(3) path:nth-of-type(1)"));
        //Pop-up kaldırma

        methods.waitBySeconds(2);
        //methods.findElement(By.xpath("//button[@class='l1j9v1wn ci31uza dir dir-ltr']")).click();
        //methods.click(By.xpath("//div[text()='Herhangi bir yer']"));
        //methods.waitBySeconds(3);
        methods.click(By.cssSelector("#bigsearch-query-location-input"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("bigsearch-query-location-input"), "Ayvalık");
        methods.waitBySeconds(2);


        methods.click(By.className("_1825a1k"));

        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@data-testid='calendar-day-01.06.2023']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[@data-testid='calendar-day-10.06.2023']"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//div[text()='Kişiler']"));
        methods.waitBySeconds(3);


        //methods.MouseMove(By.xpath("//span[@class='c1ng71ne dir dir-ltr']"));
        methods.waitBySeconds(4);



        WebElement searchButton = driver.findElement(By.xpath("//span[@class='c1ng71ne dir dir-ltr']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()", searchButton);


        methods.waitBySeconds(3);
        js.executeScript("window.scrollBy(0,250)", "");
        methods.waitBySeconds(3);
        methods.randomSelect();
        //methods.scrollWithAction(By.xpath("//span[text()='★ Deniz manzaralı, teraslı ve özel bahçeli şık ev ★']"));
        methods.waitBySeconds(3);
        //methods.click(By.xpath("//img[@src='https://a0.muscache.com/im/pictures/76fc7ea7-2423-43c6-9fba-ed843a1c337a.jpg?im_w=720']"));
        //methods.findElement(By.xpath("//button[@aria-label='Kapat']")).click();
        methods.ifElementExistClickElseSkip();
        methods.waitBySeconds(3);
        //methods.scrollWithAction(By.xpath("//span[text()='Rezerve edin' or @class='c4wd1yj dir dir-ltr']"));
        methods.switchWindow();
        js.executeScript("window.scrollBy(0,350)", "");
        System.out.println("Aşağıya scrool edildi");
        methods.click(By.xpath("(//button[@data-testid='homes-pdp-cta-btn'])[2]"));
        System.out.println("Rezerve edin butonuna tıklandı");
        //methods.click(By.xpath("(//button[@data-testid='homes-pdp-cta-btn'])[2]"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//div[text()='E-posta ile devam et' or @class='_bc4egv']"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#phoneInputphoneNumber"));
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("phoneInputphoneNumber"),"05346227814");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("button[data-testid=\"signup-login-submit-btn\"]"));
        methods.waitBySeconds(3);












        //button[@class='c1grjlav crawnjq dir dir-ltr']
        //  (//button[@data-testid="homes-pdp-cta-btn"])[2]  index ile xpath alma
    }

}
