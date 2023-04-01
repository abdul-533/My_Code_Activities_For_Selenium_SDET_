package Day08;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_Odev_cozumu extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://www.saucedemo.com/");

        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        username.sendKeys("standard_user");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        //1.Ürün Ekleme

        WebElement product1 = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        product1.click();


        WebElement addToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        addToCart.click();


        WebElement btnBack = driver.findElement(By.xpath("//button[@id='back-to-products']")); //   //button[text()='Back to products']
        btnBack.click();


        //2.Ürün Ekleme


        //2.Ürün Ekleme

        WebElement product2 = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        product2.click();


        WebElement addToCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        addToCart2.click();


        WebElement btnBack2 = driver.findElement(By.xpath("//button[@id='back-to-products']")); //   //button[text()='Back to products']
        btnBack2.click();

        // sepet işlemleri

        WebElement sepet = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();

        ;
        WebElement buttonCheckOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        buttonCheckOut.click();

        // kullanıcı bilgileri giriyoruz

        WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("ismet");


        WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("temur");


        WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipcode.sendKeys("232323");

        WebElement btnContinue = driver.findElement(By.xpath("//input[@id='continue']"));
        btnContinue.click();

        //urun ucret

        List<WebElement> ucretler = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));


        double total = 0;

        for (WebElement a : ucretler) {
            System.out.println("a.getText() = " + a.getText());
            total = total + Double.parseDouble(a.getText().substring(1));
        }
        System.out.println("total = " + total);


        // altoplam

        WebElement webAltTotal = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));

        System.out.println("webAltTotal.getText() = " + webAltTotal.getText());
        System.out.println("webAltTotal.getText() = " + webAltTotal.getText().replaceAll("[^0-9,.]",""));

        Double alTotal = Double.parseDouble(webAltTotal.getText().replaceAll("[^0-9,.]",""));

        Assert.assertTrue("Dengeler esit deyil", total == alTotal);


        BekleKapat();


    }
}


