package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntraAlert extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        clickMe.click();
        MyFunc.Bekle(2);
        // alert acildi
        driver.switchTo().alert().accept();// alerk kutusu okey ine bas , boylece kapandi



        BekleKapat();
    }
}
