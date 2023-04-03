//package Gun09;
//
//import Utility.BaseDriver;
//import Utility.MyFunc;
//import org.junit.Assert;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.List;
//
//public class _02_Question extends BaseDriver {
//
//    //        Test Senaryosu
////        1- https://www.facebook.com/  sayfasına gidiniz
////        2- CreateNewAccount a tıklatınız.
////        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
////        4- Doğum tarihinizi Select sınıfı ile seçiniz
////        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
////          öncesinde de görünmediğini, sonrasında da göründüğünü
////          assert ile doğrulayınız.
//    @Test
//    public void Test() {
//
//
//        driver.get("https://www.facebook.com/");
//
//
//        MyFunc.Bekle(2);
//        List<WebElement> cookiesAccept = driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));
//        if (cookiesAccept.size() > 0)
//            cookiesAccept.get(0).click();
//
//        MyFunc.Bekle(2);
//        WebElement btnYeniHesap = driver.findElement(By.className("_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy"));
//        btnYeniHesap.click();
//
//        MyFunc.Bekle(1);
//        WebElement firstname = driver.findElement(By.name("firstname"));
//        firstname.sendKeys("ismet");
//
//        MyFunc.Bekle(1);
//        WebElement lastname = driver.findElement(By.name("lastname"));
//        lastname.sendKeys("temur");
//
//        MyFunc.Bekle(1);
//        WebElement reEmail = driver.findElement(By.name("reg_email_conifirmatio__"));
//        Assert.assertFalse(reEmail.isDisplayed());  // beklenen gorunmesi false
//        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());
//
//        MyFunc.Bekle(1);
//        WebElement email = driver.findElement(By.name("reg_email__"));
//        email.sendKeys("elizadeh9779@gmail.com");
//
//        MyFunc.Bekle(1);
//        Assert.assertTrue(reEmail.isDisplayed());
//        System.out.println("email.isDisplayed() = " + email.isDisplayed());
//
//        WebElement webDay = driver.findElement(By.name("day"));
//        Select day = new Select(webDay);
//        day.selectByValue("28");
//        WebElement webmonth = driver.findElement(By.name("month"));
//        Select month = new Select(webmonth);
//        day.selectByValue("Nis");
//        WebElement webyear = driver.findElement(By.name("year"));
//        Select year = new Select(webyear);
//        day.selectByValue("1997");
//
//
//        BekleKapat();
//    }
//
//
//}
