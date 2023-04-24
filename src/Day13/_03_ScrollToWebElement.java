package Day13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {
    @Test
    public void Test1() {
        driver.manage().deleteAllCookies(); // cookiesleri sildik
        driver.get("https://www.copado.com/robotic-testing");
        // driver.manage().deleteAllCookies(); // cookiesleri sildik
        JavascriptExecutor js = (JavascriptExecutor) driver;
        MyFunc.Bekle(2);

        WebElement element = driver.findElement(By.xpath("//a[text()='Read story']"));

        js.executeScript("arguments[0].scrollIntoView(true);", element); // once kaydirma ishlemi , elemente kadar scrool yapar
        // elemet su an sayfanin uzerinde
        //js.executeScript("arguments[0].scrollIntoView(false);", element); // false yapib denedik alta kadar getirir


        // element barin altinda kaldi tiklatma ishlemi normal olarak yapilamiyor
        MyFunc.Bekle(3);
        // element.click(); // tiklama ishlemi olmadi

        // bu yuzden bunlari java script clickle yapicaz

        js.executeScript("arguments[0].click();", element);
        // html icinde elemente ulashir ve tiklatir

        MyFunc.Bekle(3);


        BekleKapat();
    }
}
