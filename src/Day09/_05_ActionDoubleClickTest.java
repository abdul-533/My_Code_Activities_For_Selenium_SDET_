package Day09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionDoubleClickTest extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://demoqa.com/buttons");


        WebElement element = driver.findElement(By.id("doubleClickBtn"));
        MyFunc.Bekle(3);

        Actions aksionlar = new Actions(driver);

        Action aksion = aksionlar.moveToElement(element).doubleClick().build();
        aksion.perform();

        //  aksionlar.doubleClick(element);
        // aksionlar.moveToElement(element).doubleClick().build().perform();


        BekleKapat();
    }
}
