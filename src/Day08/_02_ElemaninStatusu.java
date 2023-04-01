package Day08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElemaninStatusu extends BaseDriver {
    @Test
    public void Test1() {
//Elementlerin statulerini alma

        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement sali = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-label"));
        System.out.println("sali.isDisplayed() = " + sali.isDisplayed());
        System.out.println("sali.isEnabled() = " + sali.isEnabled());
        System.out.println("sali.isSelected() = " + sali.isSelected());

        sali.click();
        System.out.println("sali.isSelected() = " + sali.isSelected());

        WebElement saturday = driver.findElement(By.id("gwt-debug-cwCheckBox-Sunday-input"));

        System.out.println("saturday.isSelected() = " + saturday.isSelected());
        System.out.println("saturday.isDisplayed() = " + saturday.isDisplayed());
        System.out.println("saturday.isEnabled() = " + saturday.isEnabled());
        saturday.click();
        MyFunc.Bekle(2);

        System.out.println("saturday.isSelected() = " + saturday.isSelected());

        BekleKapat();
    }
}
