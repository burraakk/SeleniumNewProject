package tasks.D04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.amazon.com/ adresine gidin
        driver.get("https://amazon.com/");

        //Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //Sayfayi “refresh” yapin
        Thread.sleep(1000);
        driver.navigate().refresh();

        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "Spend less";
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Test PASSED");
        }else
            System.out.println("Title Test FAILED");

        //Gift Cards sekmesine basin
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();

        //Birthday butonuna basin
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@alt='Birthday gift cards']")).click();

        //Best Seller bolumunden ilk urunu tiklayin
        Thread.sleep(200);
        driver.findElement(By.xpath("//*[@alt='Amazon.com eGift Card'][1]")).click();

        //Gift card details’den 25 $’i secin
        Thread.sleep(200);
        driver.findElement(By.xpath("//button[@value='25']")).click();

        //Urun ucretinin 25$ oldugunu test edin
        String actualAmount = driver.findElement(By.xpath("//*[@id='gc-live-preview-amount']")).getText();
        String expectedAmount = "$25";
        if (actualAmount.contains(expectedAmount)) {
            System.out.println("Amount Test PASSED. Amount : " + actualAmount);
        }else
            System.out.println("Amount Test FAILED Amount : " + actualAmount);

        //Sayfayi kapatin
        driver.close();
    }
}
