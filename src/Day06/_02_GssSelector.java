package Day06;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class _02_GssSelector extends BaseDriver {
    @Test
    public void Test1() // test gibi calishmasini saqlayan yontem
    {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement gssSelector = driver.findElement(By.cssSelector("input[id='user-message']"));
        gssSelector.sendKeys("biz testerler geliyoruz");
        WebElement buton = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        buton.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue("aranilan eleman bulunamadi", msg.getText().equals("biz testerler geliyoruz"));  // verilen deyer True mi?
        // verilen deyer doqru ise hic bir sey gondermez demekki calishmasi doqru
        //genelde hata varsa goster diyoruz yoksa zaten pass oluyor


        BekleKapat();
    }
}
