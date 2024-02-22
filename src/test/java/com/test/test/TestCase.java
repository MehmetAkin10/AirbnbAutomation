package com.test.test;

import com.memo.airbnb.BasePage;
import com.memo.airbnb.FilterPage;
import com.memo.airbnb.HomeProfilePage;
import com.memo.airbnb.SearchBoxPage;
import com.test.driver.BaseTest;
import com.test.methods.Methods;
import org.junit.Test;

public class TestCase extends BaseTest {

    @Test
    public void AirbnbTest() throws InterruptedException {
        Methods methods = new Methods();


        String location ="Ayvalık";
        String minPrice = "500";
        String maxPrice = "5000";


        BasePage basePage = new BasePage(driver);
        basePage.getLoginPage();

        SearchBoxPage searchBoxPage = new SearchBoxPage(driver);
        searchBoxPage.searchYer();
        searchBoxPage.searchAyv(location);
        searchBoxPage.searchDate();
        searchBoxPage.searchKisi();
        searchBoxPage.searchButon();

        FilterPage filterPage = new FilterPage(driver);
        filterPage.filter();
        //methods.waitBySeconds(3);
        //methods.isElementVisible(By.xpath("(//div[starts-with(@id,'menuItemButton')])[2]"));
        //methods.click(By.cssSelector("#tab--tabs--1"));
        filterPage.scrollFilter();
        filterPage.sendFiyat(minPrice,maxPrice); // Var olanlar silinmiyor
        filterPage.scrollFiyat();
        filterPage.odaYatak();
        filterPage.konaklamaScroll();
        filterPage.guestFav();
        filterPage.olanaklarScrollClick();
        filterPage.kiralaClick();

        System.out.println("New Branch");

        HomeProfilePage homeProfilePage = new HomeProfilePage(driver);
        methods.switchWindow();
        homeProfilePage.popupClose();
        homeProfilePage.rezerveCheck();

    }
}
