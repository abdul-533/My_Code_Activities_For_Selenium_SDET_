package Day09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _09_DragAndDropBy extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        MyFunc.Bekle(2);
        Actions aksionlar = new Actions(driver);


        WebElement solsurgu = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));

        MyFunc.Bekle(2);

        Action aksion=aksionlar.dragAndDropBy(solsurgu,100, 0).build();
        aksion.perform();


        BekleKapat();
    }
}
