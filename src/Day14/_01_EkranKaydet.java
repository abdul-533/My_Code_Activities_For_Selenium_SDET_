package Day14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {


    @Test
    public void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username = driver.findElement(By.name("username"));

        username.sendKeys("ismet");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("1234");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();


        //hata var ise cikan element
        List<WebElement> hataMesaji = driver.findElements(By.cssSelector("div[role='alert']"));

        if (hataMesaji.size() > 0) {
            //ekran kaydet
            System.out.println("Hata olushdu");
            //driverde tip donushumu yapiyoruz
            TakesScreenshot ts = (TakesScreenshot) driver;  //1 .asamada ekran goruntusu alma deyishkeni tanimladim
            File hafizadakiHali = ts.getScreenshotAs(OutputType.FILE); //2. asamada ekran goruntusu alindi bir bir yere kayd etmedim
            //3. bu bilgiyi dosya olarak kayd et diyicem
            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\screenshot.png")); // kasayor acicak

//            TakesScreenshot ts=(TakesScreenshot) driver; //1.Aşama ekran görünütü alma değişkenini tanımladım
//            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE); ////2.Aşama ekran görüntüsü alındı, hafızada
//            //hafızadaki bu bilgiyi doya olarak kaydet.
//            FileUtils.copyFile(hafizadakiHali, new File("ekranGoruntuleri\\screenshot.png")); buraya format nereye kayd etme istiyorsak deyebiliyoruz

            // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
            //        biz istiyoruzki her dosya ayrı olsun yani her kayıt ayrı olsun
            //        bunu nasıl yaparsınız
            //        LocalDateTime alıcaksın bilgileri
            //        YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png


        }



        MyFunc.Bekle(2);
        BekleKapat();

    }
}
