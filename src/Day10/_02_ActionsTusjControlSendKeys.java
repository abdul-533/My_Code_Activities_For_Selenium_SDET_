package Day10;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionsTusjControlSendKeys extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));
        //element.sendKeys("Ali");


        Actions aksionlar = new Actions(driver);
        Action aksiyon = aksionlar
                .moveToElement(element)
                .click()
                .keyDown(Keys.SHIFT)// shifte bas
                .sendKeys("a") //shift-> A
                .keyUp(Keys.SHIFT) //shifti birak
                .sendKeys("hmet")
                .build();
        aksiyon.perform();

        BekleKapat();
    }
}
