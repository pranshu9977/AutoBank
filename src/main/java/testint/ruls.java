package testint;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

public class ruls {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement searchbox = driver.findElement(By.xpath("//textarea[@class = 'gLFyf']"));
        searchbox.sendKeys("java");
        //driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
        Actions act = new Actions(driver);
        act.keyDown(Keys.ENTER).build().perform();
        act.keyUp(Keys.ENTER).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println((driver.getTitle()));
        List<WebElement> URLS = driver.findElements(By.tagName("a"));
        String ppth = System.getProperty("user.dir");
        FileOutputStream fos =  new FileOutputStream("D:\\intelij\\AutoBank\\properties\\details.properties");
        Properties pro = new Properties();
        for (WebElement w : URLS) {
            int i = 0;
            while (i <= 5) {
                String URL = w.getAttribute("href");
                pro.setProperty(String.valueOf(i), URL);
                pro.store(fos ,null);
                i++;
            }

        }
    }

}
