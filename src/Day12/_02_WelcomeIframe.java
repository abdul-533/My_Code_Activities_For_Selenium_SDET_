package Day12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_WelcomeIframe extends BaseDriver {
    ///*
    //   Senaryo :
    //   https://chercher.tech/practice/frames sitesine gidiniz
    //   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
    //   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
    // */

    @Test
    public void Test1() {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // indec baya hizli

        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Turkiye");

//        kendim ilave olarak yapdim
//        driver.switchTo().frame(0);
//        WebElement sceck=driver.findElement(By.xpath("//input[@id='a']"));
//        sceck.click();

        driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame(); // bir tane iceri girdiyimcin buda ayni ishlemi yapar

        driver.switchTo().frame(1);
        WebElement avatar = driver.findElement(By.xpath("//select[@id='animals']"));

        Select s1 = new Select(avatar);
        s1.selectByVisibleText("Avatar");

        //  avatar.sendKeys("avatar");


        BekleKapat();
    }
}
