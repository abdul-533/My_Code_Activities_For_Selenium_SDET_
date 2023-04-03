package Day09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionClickTest extends BaseDriver {

    @Test
    public void Test1() {


        driver.get("https://demoqa.com/buttons");
        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click();

        Actions aksionlar = new Actions(driver); // web sayfasi aksionlara acildi

        Action aksiyon = aksionlar.moveToElement(element).click().build();
        //elementin uzerine click icin git orda bekle.aksionu hazirla
        System.out.println("Aksion hazirlandi");

        MyFunc.Bekle(4);
        aksiyon.perform();// aksion gercekleshdir isleme al uyqula icra et
        System.out.println("Aksion gerceklesdi");

        aksiyon.perform();

        BekleKapat();
    }
}
