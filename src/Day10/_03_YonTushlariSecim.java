package Day10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_YonTushlariSecim extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksionlar = new Actions(driver);
        //elemente git icine tiklat, sonra b tushuna bas

        Action aksion = aksionlar.moveToElement(element).click().sendKeys("b").build();
        aksion.perform();

        MyFunc.Bekle(2);

        Action aksion2 = aksionlar
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        aksion2.perform();

        BekleKapat();
    }
}
