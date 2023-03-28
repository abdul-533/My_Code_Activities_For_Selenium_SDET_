package Day04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement name = driver.findElement(By.className("form-textbox"));
        name.sendKeys("Ali");


        //birden fazla ayni element varsa
        // findelement ilkini alir ona gore ishlem yapar

        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        System.out.println(labels.size());
        for (WebElement e : labels) {
            System.out.println("e.getText() = " + e.getText());
        }
        //aranilan eleman bulunamazsa: find element NoSuchElement hatasi verir
        // findElements ise size i 0 olan list verir , yani hata vermez

        MyFunc.Bekle(3);
        driver.quit();

    }
}
