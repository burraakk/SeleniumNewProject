package tasks.D02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_LoginTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        Thread.sleep(1000);
        driver.findElement(By.id("sign-in")).click();

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // String username = "testtechproed@gmail.com"
        // String password = "Test1234!"
        String username = "testtechproed@gmail.com";
        String password = "Test1234!";

        Thread.sleep(1000);
        WebElement emailBox = driver.findElement(By.name("session[email]"));
        emailBox.sendKeys(username);

        Thread.sleep(1000);
        WebElement passwordBox = driver.findElement(By.name("session[password]"));
        passwordBox.sendKeys(password,Keys.ENTER);

        //e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        if (driver.getPageSource().contains("Welcome to Address Book")){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test FAILED");

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        if (driver.getPageSource().contains("Addresses") && driver.getPageSource().contains("Sign Out")){
            System.out.println("''Addresses & Sign Out' Test PASSED");
        }else
            System.out.println("''Addresses & Sign Out' Test FAILED");

        //3. Sayfada kac tane link oldugunu bulun.

    }
}
