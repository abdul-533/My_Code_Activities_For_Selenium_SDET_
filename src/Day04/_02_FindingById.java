package Day04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353"); //sayfaya git

        WebElement name = driver.findElement(By.id("first_8")); //Elemani bul Id ile bulma
        name.sendKeys("Abdul");   //kutucuklara yazi gonderme

        WebElement surname = driver.findElement(By.id("last_8"));
        surname.sendKeys("Alizada");

        MyFunc.Bekle(2);

//        name.clear();    //temizleme ishlemi
//        surname.clear();

        // inceleme bolumu aktivken yapilir
        // Chrome ctrl+f ye basıldığında inspect bölümünde arama kutuasun acar
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar

        WebElement labelFirstElementname = driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstElementname = " + labelFirstElementname.getText());


        WebElement labelLastElementname = driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastElementname. = " + labelLastElementname.getText());

        WebElement submitbutton = driver.findElement(By.id("input_2"));
        submitbutton.click();


        MyFunc.Bekle(5);
        driver.quit();

    }
}
