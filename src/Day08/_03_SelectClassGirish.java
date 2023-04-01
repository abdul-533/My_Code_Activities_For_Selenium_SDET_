package Day08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_SelectClassGirish extends BaseDriver {

    @Test
    public void Test1() {
      //  driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com.tr/");
       // driver.manage().deleteAllCookies();

        WebElement webmenu = driver.findElement(By.id("searchDropdownBox"));

        Select ddmenu = new Select(webmenu);
       // ddmenu.selectByIndex(0);
       // ddmenu.selectByValue("serch-alias=electronic");
        ddmenu.selectByVisibleText("Elektronik");

        System.out.println("ddmenu.getOptions().size() = " + ddmenu.getOptions().size());
        BekleKapat();
    }

}
