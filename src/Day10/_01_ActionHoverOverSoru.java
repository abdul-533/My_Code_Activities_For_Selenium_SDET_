package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_ActionHoverOverSoru extends BaseDriver {
    //     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.
    @Test
    public void Test1() {
        driver.get("https://www.etsy.com/");

        List<WebElement> cookiesAccept= driver.findElements(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click(); // kapat, tıklat

        WebElement jevelery = driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));


        Actions actionlar = new Actions(driver);
        Action action = actionlar.moveToElement(jevelery).build();
        action.perform();
        MyFunc.Bekle(2);
        WebElement neclace = driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));
        Action action2 = actionlar.moveToElement(neclace).build();
        action2.perform();
        MyFunc.Bekle(2);
        WebElement bibNeclace = driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));
        bibNeclace.click();
        MyFunc.Bekle(2);
        Assert.assertTrue("YAlnish secim", driver.getCurrentUrl().contains("bib-necklaces"));

        BekleKapat();
    }


}
