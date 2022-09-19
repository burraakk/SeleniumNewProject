package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        /*
        1- Amazon sayfasına gidiniz
        2- Başlığın "Amazon" içerdiğini test ediniz
        3- Url'nin amazon içerdiğini test ediniz
        4- Sayfayı kapatınız
        */

        // 1- Amazon sayfasına gidiniz
        driver.get("https://amazon.com");

        // 2- Başlığın "Amazon" içerdiğini test ediniz
        String actualTitle = driver.getTitle();
        String istenenKelime = "Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title Testi PASSED");
        }else
            System.out.println("Title Testi FAILED");

        // 3- Url'nin amazon içerdiğini test ediniz
        String actualUrl = driver.getCurrentUrl();
        String arananKelime = "amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url Testi PASSED");
        }else
            System.out.println("Url Testi FAILED");
        // 4- Sayfayı kapatınız
        driver.close();


    }
}
