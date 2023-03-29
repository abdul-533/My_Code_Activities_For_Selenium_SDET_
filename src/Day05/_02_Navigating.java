package Day05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {
    public static void main(String[] args) {
        // driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

        WebElement element = driver.findElement(By.id("alerttest"));
        //WebElement elemet=driver.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();  // yeni sayfaya gitdik
        MyFunc.Bekle(3);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // o anda bulundugun url yi verir

        driver.navigate().back();   // tarayici historisinden geri geldim
        MyFunc.Bekle(3);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl()); // o anda bulunduqun url yi verir

        driver.navigate().forward();
        MyFunc.Bekle(3);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        BekleKapat();


    }
}
