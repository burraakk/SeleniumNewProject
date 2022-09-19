package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get("http://techproeducation.com");
        driver.close();
        /*
       Ileride wait konusu daha geniş olarak ele alinacak

       Bir sayfa acilirken ilk once sayfa icerisinde yer alan elementlere gore
       bir yukleme suresine ihtiyac vardir. Veya bir webelementin kullanilabilmesi icin
       zamana ihtiyac olabilir

       implicitlyWait bizie sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin
       beklenecek maximum sureyi belirleme imkani tanir
        */
    }
}
