package Day07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Odev1 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.cssSelector("[id='user-name'][autocorrect='off']"));
        String usernsme1 = "standard_user";
        username.sendKeys(usernsme1);
        WebElement password = driver.findElement(By.cssSelector("[placeholder='Password'][id='password']"));
        String password1 = "secret_sauce";

        password.sendKeys(password1);
        WebElement login = driver.findElement(By.cssSelector("[class='submit-button btn_action']"));
        login.click();

        WebElement sauce = driver.findElement(By.cssSelector("[id='item_4_title_link']>:nth-child(1)"));
        sauce.click();
        MyFunc.Bekle(2);

        WebElement add = driver.findElement(By.cssSelector(" [class='btn btn_primary btn_small btn_inventory'][name='add-to-cart-sauce-labs-backpack']"));
        add.click();
        MyFunc.Bekle(2);

        WebElement back = driver.findElement(By.cssSelector("[id='back-to-products']"));
        back.click();

        MyFunc.Bekle(3);

        WebElement tShirt = driver.findElement(By.cssSelector("[id='item_1_title_link']>:nth-child(1)"));
        tShirt.click();

        MyFunc.Bekle(3);
        WebElement add1 = driver.findElement(By.cssSelector("[class='btn btn_primary btn_small btn_inventory']"));
        add1.click();


        WebElement sepet = driver.findElement(By.cssSelector("[class='shopping_cart_link']"));
        sepet.click();
        MyFunc.Bekle(3);

        WebElement chechOut = driver.findElement(By.cssSelector("[id='checkout']"));
        chechOut.click();

        WebElement firstName = driver.findElement(By.cssSelector("[id='first-name']"));
        String fname = "Ali";
        firstName.sendKeys(fname);
        WebElement lastname = driver.findElement(By.cssSelector("[id='last-name']"));
        String lname = "Alizade";
        lastname.sendKeys(lname);

        WebElement zip = driver.findElement(By.cssSelector("[data-test='postalCode'][autocorrect='off']"));
        String zipc = "0043";
        zip.sendKeys(zipc);

        WebElement cantinue = driver.findElement(By.cssSelector("[class='submit-button btn btn_primary cart_button btn_action']"));
        cantinue.click();

        WebElement total=driver.findElement(By.cssSelector("[class='summary_subtotal_label']"));
        Double value=Double.parseDouble(total.getText().substring(13));

        Assert.assertTrue("VAlueler esit deyi",value==(29.99+15.99));

        BekleKapat();
    }
}
