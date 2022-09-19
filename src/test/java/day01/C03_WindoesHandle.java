package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindoesHandle {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle()); // CDwindow-974F128AEF4F4F38E21351CF7154ED9F

        // Her açılan pencerenin WindowHandle'ı farklıdır
        // Farklı pencereler arasında dolaşabilmek için getWindowHandle() methodunu kullanırız



    }
}
