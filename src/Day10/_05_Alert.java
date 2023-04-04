package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Alert extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement dismis = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        dismis.click();
        MyFunc.Bekle(2);
        // alert acildi
        driver.switchTo().alert().dismiss();// alerk kutusu cansel ine bas , boylece kapandi


        BekleKapat();
    }
}
