package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement dismis = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        dismis.click();
        MyFunc.Bekle(2);
        // alert acildi
        driver.switchTo().alert().sendKeys("Hello");// alerk kutusu okey ine bas , boylece kapandi
        driver.switchTo().alert().accept();
        MyFunc.Bekle(2);
        WebElement textActual = driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Beklenen yazi gozukdumu", textActual.getText().contains("Hello"));


        BekleKapat();
    }
}
