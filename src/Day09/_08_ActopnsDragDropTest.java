package Day09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _08_ActopnsDragDropTest extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        MyFunc.Bekle(2);
        Actions aksionlar = new Actions(driver);

        WebElement oslo = driver.findElement(By.id("box1"));
        WebElement norvech = driver.findElement(By.id("box101"));

        //1 yontem
        //  aksionlar.dragAndDrop(oslo, norvech).build().perform(); //oslonu al norvece at

        //2yontem
        aksionlar.clickAndHold(oslo).build().perform();// osloyu tiklat al
        aksionlar.moveToElement(norvech).release().build().perform(); // norvece git ve uzerine birak

        BekleKapat();
    }

}
