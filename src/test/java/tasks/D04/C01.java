package tasks.D04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //2- Add Element butonuna 10 kez basinız
        WebElement addElementButton = driver.findElement(By.xpath("//*[@onclick='addElement()']"));
        int sayac = 0;
        while (sayac < 10) {
            addElementButton.click();
            Thread.sleep(200);
            sayac++;
        }

        //3- 10 kez Add element butonuna basıldığını test ediniz
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//*[@onclick='deleteElement()']"));
        int actualDeleteButtons = deleteButtons.size();
        int expectedDeleteButtons = 10;
        if (actualDeleteButtons == expectedDeleteButtons){
            System.out.println("Add Element Button Test PASSED");
        }else
            System.out.println("Add Element Button Test FAILED");

        //4 - Delete butonuna görünmeyene kadar basınız
        WebElement deleteButton = driver.findElement(By.xpath("//*[@onclick='deleteElement()'][10]"));
        int sayac2 = deleteButtons.size();
        while (sayac > 0){
            deleteButton.click();
            Thread.sleep(200);
            sayac--;
        }

        //5- Delete butonunun görünmediğini test ediniz
        WebElement anasayfa = driver.findElement(By.className("no-js"));
        String button = "Delete";
        if (!anasayfa.getText().contains(button)) {
            System.out.println("NO DELETE BUTTON. TEST PASSED.");
        }else
            System.out.println("NO DELETE BUTTON. TEST FAILED");

        //6- Sayfayı kapatınız
        Thread.sleep(1000);
        driver.close();
    }
}
