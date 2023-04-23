package Day12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_welcomeIframe extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://chercher.tech/practice/frames");
        // driver.switchTo().frame("frame1");// name ve id oldukca yavash calishir
        // driver.switchTo().frame("iamframe");   // id ile bu da yavash
        driver.switchTo().frame(0); // indec baya hizli


        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Turkiye");

        // geri gelmek icin parent frame gecilir
        // driver.switchTo().parentFrame(); // ilgili odaya iframeye gec, parente gec
        //   driver.switchTo().defaultContent(); // bu da bizi ana sayfay ghecirir direk ilk ana sayfaya donuruz


        // iframe içindeki bir locator da işlem yapılacaksa önce o iframe geçmem lazım.
        // driver.switchTo().frame(0);  // ilgili odaya (iframe) geç
        // driver.switchTo().parentFrame(); // bir önceki odaya geç, parent e geç
        // driver.switchTo().defaultContent(); // ilk ana sayfaya direk geçer

        BekleKapat();

    }
}
