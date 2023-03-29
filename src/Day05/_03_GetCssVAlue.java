package Day05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssVAlue extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        WebElement inputValEnter = driver.findElement(By.id("inputValEnter"));


        //<input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword" id="inputValEnter"
        // onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands"
        // value="" strtindx="" endindx="">
        
        System.out.println("inputValEnter.getAttribute(\"class\") = " + inputValEnter.getAttribute("class"));

        // clasin karsiliqi olan CSS yani sekillendirme deyerlerini lamak icin getCssValue kullanilir.
        System.out.println("inputValEnter.getCssValue(\"color\") = " + inputValEnter.getCssValue("color"));
        System.out.println("inputValEnter.getCssValue(\"font-size\") = " + inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getCssValue(\"background\") = " + inputValEnter.getCssValue("background"));
        //RGBA (51, 51,51 1)  a burda opacity yani parlaklik


        BekleKapat();


    }
}
