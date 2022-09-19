package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        //Kaynak kodları içinde "Gateway" kelimesinin olduğunu test ediniz
        String istenenKelime = "Gateway";
        if (driver.getPageSource().contains(istenenKelime)) {
            System.out.println("PageSource Test PASSED");
        }else  System.out.println("PageSource Test FAILED");

        driver.close(); //sayfayı kapatır
        // driver.quit(); // birden fazla sayfa varsa hepsini kapatır



    }
}
