package Day12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Question extends BaseDriver {

    /*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
   // _03_IFrameSoru

    @Test
    public void Test(){
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.cssSelector("#topic+input"));
        input.sendKeys("Azerbaijan");


        driver.switchTo().frame(0);
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='a']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame(); // bir tane iceri girdiyimcin buda ayni ishlemi yapar

        driver.switchTo().frame(1);
        WebElement avatar = driver.findElement(By.xpath("//select[@id='animals']"));

        Select s1 = new Select(avatar);
        s1.selectByIndex(3);

        //  avatar.sendKeys("avatar");




        BekleKapat();
    }
}
