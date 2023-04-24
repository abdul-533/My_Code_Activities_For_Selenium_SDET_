package Day13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _01_Scrollinto extends BaseDriver {
    /*
        Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
        Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

        Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
        sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
        sayfa üzerinde.

        ("window.scrollTo(0, 3000);")    -> Verilen pixel e kadar gider.
        ("window.scrollBy(0, 3000);")    -> bulunduğu yerden , Verilen kadar daha ileri gider.
        ("window.scrollTo(0, document.body.scrollHeight);")   -> sayfanın sonuna kadar gider.
        ("arguments[0].scrollIntoView(true);", element)       -> Verilen elemente kadar gider.
                                                       true : element sayfanın üstünde gözükene kadar,
                                                       false: element sayfanın altına gözükene kadar
                                                       default true;

       element.click() -> normal click
       action click()  -> action click
       ("arguments[0].click();", element)    -> javascript click()  -> javascript click.
     */
    @Test
    public void Test1() {
        driver.get("https://p-del.co/");
        //Actions aksionlar = new Actions(driver); // driver uzerinden aksin ishlemleri icin
        //Select webSelect=new Select(element); // bir tane element icin

        JavascriptExecutor js = (JavascriptExecutor) driver; //cast yapildi

        //selenium javascript window scroll bunu yaz kodlari burdan bul yaz

        js.executeScript("window.scrollBy(0,3000);");// bir tanede ; ihtiyac yok amma cok olunca var

        //(0,1500) ->(x,y) Sayfayi saga x kadar ve asaqi y kadar kaydir
        //1500 pixel kadar asaqi kaydiracak

        MyFunc.Bekle(3);
        js.executeScript("window.scrollBy(0,-3000);");//


        BekleKapat();
    }
}
