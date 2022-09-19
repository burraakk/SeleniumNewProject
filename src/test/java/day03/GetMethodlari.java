package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //-Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        //-Arama kutusunu locate ediniz
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        String expectedTagName = "input";
        String actualTagName = searchBox.getTagName();
        if (actualTagName.equals(expectedTagName)) {
            System.out.println("TagName Test PASSED " + actualTagName);
        }else System.out.println("TagName Test FAILED");

        //-Arama kutusunun name attribute'unun değerinin field-keywords olduğunu test ediniz
        String expectedAttributeName = "field-keywords";
        String actualAttributeName = searchBox.getAttribute("name");
        if (actualAttributeName.equals(expectedAttributeName)) {
            System.out.println("AttributeName Test PASSED " + actualAttributeName);
        }else System.out.println("AttributeName Test FAILED");

        //-Arama kutusunun konumunu yazdiriniz
        System.out.println("Arama kutusunun konumu" + searchBox.getLocation());

        //-Sayfayı kapatınız
        driver.close();
    }
}
