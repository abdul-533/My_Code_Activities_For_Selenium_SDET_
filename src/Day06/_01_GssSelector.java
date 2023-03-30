package Day06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GssSelector extends BaseDriver {

    public static void main(String[] args) {
        // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
        // 2-Butona tıklatınız
        // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement gssSelector = driver.findElement(By.cssSelector("input[id='user-message']"));
        gssSelector.sendKeys("biz testerler geliyoruz");
        WebElement buton = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        buton.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        if (msg.getText().equals("biz testerler geliyoruz"))
            System.out.println("test passed");
        else System.out.println("test fail");


        BekleKapat();

    }
}
