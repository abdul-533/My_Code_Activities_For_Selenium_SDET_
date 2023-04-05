package Day11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.cssSelector("[id='title']"));
        name.sendKeys("Abdul");

        WebElement commet = driver.findElement(By.cssSelector("[id='description']"));
        commet.sendKeys("Alizada");


        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();

        WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(30));
        bekle.until(ExpectedConditions.textToBe(By.id("submit-control"), "Form submited Successfully!"));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // bu elemant bulmak icin burda problem yok
        WebElement test = driver.findElement(By.id("submit-control"));

        Assert.assertEquals("Form submited Successfully!", test.getText());


        BekleKapat();
    }
}
