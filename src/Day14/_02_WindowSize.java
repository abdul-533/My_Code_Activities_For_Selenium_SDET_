package Day14;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class _02_WindowSize extends BaseDriver {

    // bazi durumlarda sizeni misal mobile tablete kmpya gore ayarlayib test etmem gereke bilir onuncinde size deyishtirme komutu var
    @Test
    public void Test() {
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        MyFunc.Bekle(3);

        Dimension yeniboyut = new Dimension(516, 600); // hangi olcu lazimsa tel tablet boyutu alib yaziyoruz

        driver.manage().window().setSize(yeniboyut);


        BekleKapat();
    }
}
