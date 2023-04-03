package Day09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionsRightClick extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");


        WebElement element = driver.findElement(By.id("rightClickBtn"));
        MyFunc.Bekle(3);

        Actions aksionlar = new Actions(driver);
        Action aksiyon = aksionlar.moveToElement(element).contextClick().build();// right click icerir ayni sey
        aksiyon.perform();


        BekleKapat();
    }
}
