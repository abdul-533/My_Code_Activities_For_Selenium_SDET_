package Day04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingbyidException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");


        try {


            //locatorlari yalnish verdiyimizde ne olur?
            WebElement labelFirstElementname = driver.findElement(By.id("hataliLocator"));
            // System.out.println("labelFirstElementname = " + labelFirstElementname.getText());
        } catch (Exception ex) {

            System.out.println("Web element bulunamadi " + ex.getMessage());
        }


        MyFunc.Bekle(5);
        driver.quit();


    }
}
