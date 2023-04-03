package Day09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionsHoverTest extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Bekle(2);

        Actions aksionlar = new Actions(driver);
        Action aksion = aksionlar.moveToElement(element).build();
        aksion.perform();


        BekleKapat();
    }
}
