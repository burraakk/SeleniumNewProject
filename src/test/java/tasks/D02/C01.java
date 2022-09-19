package tasks.D02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitleFacebook = driver.getTitle();
        String arananTitleFacebook = "facebook";
        if (actualTitleFacebook.contains(arananTitleFacebook)){
            System.out.println("Title Test PASSED");
        }else
            System.out.println("Title Test FAILED" +
                    "\nActual Title: " + actualTitleFacebook);

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
        String actualURL = driver.getCurrentUrl();
        String arananURL = "facebook";
        if (actualURL.contains(arananURL)){
            System.out.println("URL Test PASSED");
        }else
            System.out.println("URL TEST FAILED" +
                    "\nActual URL: " + actualURL);

        //4.https://www.walmart.com/ sayfasina gidin.
        Thread.sleep(2000);
        driver.get("https://www.walmart.com");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitleWalmart = driver.getTitle();
        String arananTitleWalmart = "Walmart.com";
        if (actualTitleWalmart.contains(arananTitleWalmart)){
            System.out.println("Title Test PASSED");
        }else
            System.out.println("Title Test FAILED" +
                    "\nActual Title: " + actualTitleWalmart);

        //6. Tekrar “facebook” sayfasina donun
        Thread.sleep(2000);
        driver.navigate().back();

        //7. Sayfayi yenileyin
        Thread.sleep(2000);
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //9.Browser’i kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
