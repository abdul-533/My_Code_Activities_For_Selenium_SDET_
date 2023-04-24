package Day13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class _04_RobotClass extends BaseDriver {

    @Test
    public void Test1() throws AWTException {

        driver.get("https://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        // ilk once bunun cikmasinida beklememiz lazim
//        driver.switchTo().frame(8); // name: gdpr-conset-notice
//        List<WebElement> acceptAll = driver.findElements(By.xpath("//span[text()='Accept All']]"));
//        if (acceptAll.size() > 0)
//            acceptAll.get(0).click();


        /* ************************************/

        Robot rbt = new Robot();
//        rbt.keyPress(KeyEvent.VK_TAB); // tusha basildi.   down
//        rbt.keyRelease(KeyEvent.VK_TAB);  // tush birakildi  bu mutlaka iki haneli kulanmak zorundayiz ki basili kalmasin klav


        for (int i = 0; i < 21; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);

        }
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // buraya kadar windows dosya bul açıldı
        // aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor
        StringSelection dosyaYolu = new StringSelection("C:\\Users\\user\\Desktop\\Ornek.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
// dosya uzerinde shift+saq klick yapiyoruz

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);

        MyFunc.Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

        rbt.keyPress(KeyEvent.VK_ENTER);  // dosya ENTER basilarak gonderildi
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(1);
        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);  // tusha basildi check boxa gelindi burda
            rbt.keyRelease(KeyEvent.VK_TAB);

        }

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_SPACE);   //cekledi
        rbt.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Bekle(1);

        for (int i = 0; i < 2; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);  // tusha basildi submit boxa gelindi burda
            rbt.keyRelease(KeyEvent.VK_TAB);

        }

        MyFunc.Bekle(1);
        rbt.keyPress(KeyEvent.VK_ENTER);   //enterlendi submitlendi
        rbt.keyRelease(KeyEvent.VK_ENTER);


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement mesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(mesaj.isDisplayed());

        BekleKapat();
    }
}
