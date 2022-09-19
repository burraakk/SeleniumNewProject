package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class TekrarTesti {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com");

        // b. Search(ara) “city bike”
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("city bike", Keys.ENTER);

        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> searchResult = driver.findElements(By.className("sg-col-inner"));
        String sonucYazisi = searchResult.get(0).getText();
        System.out.println(sonucYazisi);

        // d.Sadece sonuc sayisini yazdiriniz
        String[] sonucYazisiList = sonucYazisi.split(" ");
        System.out.println("'city bike' icin bulunan sonuc sayisi : " + sonucYazisiList[2]);

        // Sonuc sayisini LAMBDA ile yazdiriniz
        Arrays.stream(sonucYazisi.split(" ")).limit(3).skip(2).forEach(System.out::println);

        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        List<WebElement> firstImg = driver.findElements(By.className("s-image"));
        firstImg.get(0).click();

        driver.close();
    }
}
