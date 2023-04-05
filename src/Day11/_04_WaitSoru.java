package Day11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitSoru extends BaseDriver {

    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */

    @Test
    public void Test() {
        driver.get("https://www.demoblaze.com/index.html");

        WebElement sam = driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']"));
        sam.click();

        WebElement ad = driver.findElement(By.xpath("//a[@onclick='addToCart(1)']"));
        ad.click();

        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.alertIsPresent());


        driver.switchTo().alert().accept();

        WebElement prod = driver.findElement(By.xpath("//img[@src='bm.png']"));
        prod.click();

        Assert.assertTrue("Yalnish secim",driver.getCurrentUrl().equals("https://www.demoblaze.com/index.html"));






        BekleKapat();
    }
}
