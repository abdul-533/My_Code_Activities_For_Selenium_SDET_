package Day06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question1 extends BaseDriver {
    //>     -> cocuklarda arar
    //space -> tüm cocuklarda(torunlar dahil) arar
    //+     -> bitişik kardeş i bulur
    //~     -> tüm kardeşlerde ara

    //[id='user-message'] > *   cocukların hepsi(torunlar yok)

//    [class='nav navbar-nav'] > li+li+li
//[class='nav navbar-nav'] > :nth-child(3)
//
//    yukarıdakilerin ikiside 3.Çocuk demekdir.


    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector

    @Test
    public void Test() {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement business = driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();

        MyFunc.Bekle(2);
        WebElement bdropDownDiscover = driver.findElement(By.cssSelector("[id$='_4588']"));
        bdropDownDiscover.click();

        MyFunc.Bekle(2);
        WebElement optionOnlineAdvertising = driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        MyFunc.Bekle(2);
        WebElement buttonEveryDay = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEveryDay.click();

        MyFunc.Bekle(2);
        WebElement goodRadio = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();

        MyFunc.Bekle(2);
        WebElement optionSelect = driver.findElement(By.cssSelector("select[id$='_4597']"));
        optionSelect.click();

        MyFunc.Bekle(2);
        WebElement optionUsingXTZ = driver.findElement(By.cssSelector("select[id$='_4597']> :nth-child(4)"));
        optionUsingXTZ.click();

        MyFunc.Bekle(2);
        // acik kalmasin diye extra tiklatdik
        goodRadio.click();

        // driver.findElement(By.xpath(""));
        //ssSelector olmayan 2 hareket var
        //
        //elemendan geri gitme
        //ekrandan gözüken yazısı ile bulma
        //
        //By.Id("firstName");
        //By.Name("firstName");
        //By.cssSelector("[id='firstName']")
        //
        //By.xpath(" //[@id='firstName']   ")


        BekleKapat();


    }


}
