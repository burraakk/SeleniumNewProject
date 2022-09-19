package tasks.D01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_GetMethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");
        //Sayfa basligini(title) yazdirin
        System.out.println("Sayfa Basligi : "+driver.getTitle());
        //Sayfa basliginin “Amazon” icerdigini test edin
        String istenenKelime = "Amazon";
        if (driver.getTitle().contains(istenenKelime)){
            System.out.println("Title test PASSED");
        } else
            System.out.println("Title test FAILED");
        //Sayfa adresini(url) yazdirin
        System.out.println("Sayfa adresi : " + driver.getCurrentUrl());
        //Sayfa url’inin “amazon” icerdigini test edin.
        String arananKelime = "amazon";
        if (driver.getCurrentUrl().contains(arananKelime)){
            System.out.println("URL test PASSED");
        }else
            System.out.println("URL test FAILED");
        //Sayfa handle degerini yazdirin
        System.out.println("WindowHandle degeri : "+driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String kelime = "Gateway";
        if (driver.getPageSource().contains(kelime)){
            System.out.println("WindowHandle test PASSED");
        }else
            System.out.println("WindowHandle test FAILED");
        //Sayfayi kapatin.
        driver.close();




    }
}
