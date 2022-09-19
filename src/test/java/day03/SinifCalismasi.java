package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SinifCalismasi {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        // b. Sign in butonuna basin
        driver.findElement(By.linkText("Sign in")).click();

        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement email_textbox = driver.findElement(By.id("session_email"));
        WebElement password_textbox = driver.findElement(By.id("session_password"));
        WebElement signin = driver.findElement(By.name("commit"));

        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        email_textbox.sendKeys("testtechproed@gmail.com");
        password_textbox.sendKeys("Test1234!");
        signin.click();

        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //------------1. yol---------------
        WebElement actualUser = driver.findElement(By.className("navbar-text"));
        if (actualUser.isDisplayed()){
            System.out.println("Expected User ID Test PASSED " + actualUser.getText());
        }else
            System.out.println("Expected User ID Test FAILED");

        //------------2. yol---------------
        String actualUserYazisi = actualUser.getText();
        String expectedUserYazisi = "testtechproed@gmail.com";
        if (actualUserYazisi.equals(expectedUserYazisi)){
            System.out.println("TEST PASSED");
        }else
            System.out.println("TEST FAILED");

        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addresses = driver.findElement(By.linkText("Addresses"));
        WebElement signOut = driver.findElement(By.linkText("Sign out"));
        if (addresses.isDisplayed()){
            System.out.println("Addresses Test PASSED");
        }else
            System.out.println("Addresses Test FAILED");

        if (signOut.isDisplayed()){
            System.out.println("Sign Out Test PASSED");
        }else
            System.out.println("Sign Out Test FAILED");

        // 3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi : " + linklerListesi.size());

        // 4. Linkleri yazdiriniz
        //-----------------1.yol----------------------
        System.out.println("\nLinkler :");
        for (WebElement each : linklerListesi){
            System.out.println(each.getText());
        }
        //-----------------2.yol----------------------
        System.out.println("\nLinkler :");
        linklerListesi.stream().forEach(x-> System.out.println(x.getText()));

        // 5. Sayfayi kapatiniz
        driver.close();



    }
}
