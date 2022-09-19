package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C06_findElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim
        driver.get("http://www.amazon.com");
        driver.manage().window().minimize();

        // Amazon sayffasindaki tag'lari a (link) olanlarin sayisini yaziniz
        List<WebElement> tag = driver.findElements(By.tagName("a"));
        System.out.println("a tag'inin sayisi :"+tag.size());

        List<WebElement> tag2 = driver.findElements(By.tagName("input"));
        System.out.println("input tag'inin sayisi :"+tag2.size());

        List<WebElement> tag3 = driver.findElements(By.tagName("*"));
        System.out.println("tum tag'lerin sayisi :"+tag3.size());

    }
}
