package com.memo.airbnb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeProfilePage extends WebDriverHelper{
   // By Pop_up1 = By.xpath("(//button[starts-with(@class,'l1ovpqvx')])[32]");
    //By Pop_up2 = By.xpath("//div[@class='l1e1glti atm_ax_idpfg4 atm_bb_idpfg4 atm_ap_exct8b atm_r3_1e5hqsa dir dir-ltr']");

    By Pop_up = By.xpath("(//span[@class='i3tjjh1 atm_mk_h2mmj6 dir dir-ltr'])[3]");
    By rezerveScrollClick = By.xpath("(//button[@data-testid='homes-pdp-cta-btn'])[2]");
    public HomeProfilePage(WebDriver driver) {
        super(driver);
    }

    public void popupClose(){
        click(Pop_up,10);
    }
    public void rezerveCheck(){
        click(rezerveScrollClick,10);
    }
}
