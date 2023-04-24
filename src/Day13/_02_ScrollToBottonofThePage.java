package Day13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottonofThePage extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://p-del.co/");

        MyFunc.Bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        //sayfanin sonuna kadar git
        MyFunc.Bekle(2);
        js.executeScript("window.scrollTo(0, 0);"); // en basha direk gider
        //js.executeScript("window.scrollBy(0,0);"); // bulunduqun yerden 0 kadar gider


        BekleKapat();
    }
}
