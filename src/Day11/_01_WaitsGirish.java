package Day11;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_WaitsGirish extends BaseDriver {

    /*
    Selenium bekletme komutlari:

    >>>Implicitly wait<<<
    Tum sayfadaki elemanlar icin, elemanin locatoru sayfa icinde bulunabilir hale gelene kadar verilen bekleme
    suresi.Butun elemanlar icin gecerli ve eleman bulunduqunda kalan sureyi beklemez.NoSuchElement hatasi icin verilen
    sure kadar beller.
    KULLANIM:
    Duration muhlet = Duration.ofSeconds(120);
    driver.manage().timeouts().implicitlyWait(muhlet);

    ExplicitWait:
        Duration muhlet=Duration.ofSeconds(20);            //muhlet
        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
        Beklenenkriterlerden-> ExpectedConditions
        Verilen locatordaki element gozukur hale-> unvisibilityofElementLocated
        gelene kadar bekle-> bekle.until




     */

    @Test
    public void Test1() {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration muhlet = Duration.ofSeconds(120);

        driver.manage().timeouts().implicitlyWait(muhlet); //kendisine verilen sure kadar find
        // elementsi etkiler
        // ve gorunur hale gelmesine kadar bekler htmle icinde olub olmamamsina bakar

        //MyFunc.Bekle(30);   //bu programi Yani Javayi durudrur, sayfayla ilgisi olmadiqi icin ona verilen surenin sonuna kadar bekler
        //Interviyularda bekletme olarak kesinlikle soylenmez

        WebElement textWeb = driver.findElement(By.xpath("//p[text()='WebDriver']"));

        BekleKapat();


    }
}
