package com.memo.airbnb;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterPage extends WebDriverHelper{

    By filter = By.cssSelector("button[data-testid='category-bar-filter-button']");
    By fiyat = By.cssSelector("h2[id='filter-section-heading-id-FILTER_SECTION_CONTAINER:ROOMS_AND_BEDS_WITH_SUBCATEGORY']");
    By fiyatAraligi = By.cssSelector("h2[id='filter-section-heading-id-FILTER_SECTION_CONTAINER:PRICE_RANGE']");
    By yatakOda = By.xpath("(//div[starts-with(@id,'menuItemButton')])[3]");
    By yataklar = By.xpath("(//div[starts-with(@id,'menuItemButton')])[13]");
    By banyo = By.xpath("(//div[starts-with(@id,'menuItemButton')])[20]");
    By minPrice = By.cssSelector("#price_filter_min");
    By maxPrice = By.cssSelector("#price_filter_max");
    By konaklama = By.cssSelector("h2[id='filter-section-heading-id-FILTER_SECTION_CONTAINER:TOP_TIER_STAYS']");
    By guestFavori = By.xpath("(//span[@class='mcny6za atm_9s_1ulexfb dir dir-ltr'])[1]");
    By yerTipi = By.cssSelector("h2[id='filter-section-heading-id-FILTER_SECTION_CONTAINER:PROPERTY_TYPES_WITH_SUBCATEGORY']");
    By ev = By.xpath("(//span[@class='m1hfo47l atm_9s_1ulexfb dir dir-ltr'])[1]");
    By apartman = By.xpath("(//span[@class='m1hfo47l atm_9s_1ulexfb dir dir-ltr'])[2]");
    By olanaklarSc = By.cssSelector("h2[id='filter-section-heading-id-FILTER_SECTION_CONTAINER:MORE_FILTERS_AMENITIES_WITH_SUBCATEGORIES']");
    By wifiClick = By.cssSelector("div[id='filter-item-amenities-4-row-title']");
    By filterSearch = By.xpath("(//a[starts-with(@class,'l1ovpqvx')])[41]");
    By airbnbKonak = By.xpath("(//img[starts-with(@class,'itu7ddv')])[2]");



    public FilterPage(WebDriver driver) {
        super(driver);
    }

    public void filter() throws InterruptedException {
        Thread.sleep(2000);
        click(filter,10);
    }

    public void scrollFilter() throws InterruptedException {
        Thread.sleep(3000);
        scrollWithJs(fiyatAraligi);
    }

    public void scrollFiyat() throws InterruptedException {
        scrollWithJs(fiyat);
    }

    public void sendFiyat(String price1, String price2) throws InterruptedException {

        //WebElement min = driver.findElement(minXprice);
        //WebElement max = driver.findElement(maxXprice);

        WebElement toClear = driver.findElement(minPrice);
        toClear.sendKeys(Keys.CONTROL + "a");
        toClear.sendKeys(Keys.DELETE);
        //click(minXprice,10);
        //min.clear();
        //driver.findElement(minXprice).sendKeys(Keys.CONTROL+"300");
        //driver.findElement(minXprice).sendKeys(Keys.DELETE);
        //driver.findElement(minPrice).clear();
        driver.findElement(minPrice).sendKeys(price1);

        WebElement toClearX = driver.findElement(maxPrice);
        toClearX.sendKeys(Keys.CONTROL + "a");
        toClearX.sendKeys(Keys.DELETE);
        //click(maxXprice,10);
        //max.clear();
        //driver.findElement(maxXprice).sendKeys(Keys.CONTROL+"7500");
        //driver.findElement(maxXprice).sendKeys(Keys.DELETE);
        //driver.findElement(maxPrice).clear();
        driver.findElement(maxPrice).sendKeys(price2);
    }

    public void odaYatak(){
        click(yatakOda,10);
        click(yataklar,10);
        click(banyo,10);
    }

    public void konaklamaScroll(){
        click(konaklama,10);
    }
    public void guestFav() throws InterruptedException {
        Thread.sleep(1000);
        click(guestFavori,10);
    }
    public void yerScrollClick() throws InterruptedException {
        scrollWithJs(yerTipi);
        click(ev,10);
        click(apartman,10);
    }
    public void olanaklarScrollClick() throws InterruptedException {
        scrollWithJs(olanaklarSc);
        click(wifiClick,10);

        click(filterSearch,10);
    }

    public void kiralaClick(){
        click(airbnbKonak,10);
    }


}
