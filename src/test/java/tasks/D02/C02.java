package tasks.D02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        driver.get("https://www.youtube.com");
        String actualTitleYoutube = driver.getTitle();
        String arananTitleYoutube = "youtube";
        System.out.println(actualTitleYoutube.contains(arananTitleYoutube) ? "Youtube Title test PASSED" :
                "Youtube Title test FAILED\nActual Youtube Title : " + actualTitleYoutube);

        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        String actualURLYoutube = driver.getCurrentUrl();
        String arananURLYoutube = "youtube";
        System.out.println(actualURLYoutube.contains(arananURLYoutube) ? "URL test PASSED" :
                "URL test FAILED|\nActual URL : " + actualURLYoutube);

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        Thread.sleep(2000);
        driver.get("https://www.amazon.com");

        //5. Youtube sayfasina geri donun
        Thread.sleep(2000);
        driver.navigate().back();

        //6. Sayfayi yenileyin
        Thread.sleep(2000);
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        Thread.sleep(2000);
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin
        Thread.sleep(2000);
        driver.manage().window().maximize();

        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String actualTitleAmazon = driver.getTitle();
        String arananTitleAmazon = "youtube";
        System.out.println(actualTitleAmazon.contains(arananTitleAmazon) ? "Amazon Title test PASSED" :
                "Amazon Title test FAILED\nActual Amazon Title : " + actualTitleAmazon);

        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String actualURLAmazon = driver.getCurrentUrl();
        String arananURLAmazon = "youtube";
        System.out.println(actualURLYoutube.contains(arananURLAmazon) ? "Amazon URL test PASSED" :
                "Amazon URL test FAILED|\nActual Amazon URL : " + actualURLAmazon);

        //11.Sayfayi kapatin
        Thread.sleep(2000);
        driver.close();
    }
}
