package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        //driver.navigate().to() methodu sayfada ileri geri yapacaksak kullanilir
        //driver.get() methodu gibi bizi istediğimiz URL'e götürür
        driver.navigate().to("http://techproeducation.com");

        //tekrar Amazon sayfasina dönelim
        Thread.sleep(3000); // 3 saniye bekletelim
        driver.navigate().back();

        //tekrar techproeducation sayfasina gidelim
        Thread.sleep(3000);
        driver.navigate().forward();

        // techproeducation sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        //sayfayi kapatalim
        driver.close();

    }
}
