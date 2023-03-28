package Day04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement sifarishlerim = driver.findElement(By.linkText("Siparişlerim"));
        // gozuken text i Siparishlerim olan a tag li web element

        System.out.println("sifarishlerim.getText() = " + sifarishlerim.getText());

        System.out.println("sifarishlerim.getAttribute(href) = " + sifarishlerim.getAttribute("href"));
        System.out.println("sifarishlerim.getAttribute(title) = " + sifarishlerim.getAttribute("title"));
        System.out.println("sifarishlerim.getAttribute(rel) = " + sifarishlerim.getAttribute("rel"));

        // partialLinkText

        WebElement link2 = driver.findElement(By.partialLinkText("Süper Fiyat"));
        System.out.println("link2.getText() = " + link2.getText());
        MyFunc.Bekle(3);
        driver.quit();

    }
}
