package testint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class one {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) throws InterruptedException, IOException {

        driver.get("https://demo.applitools.com/");
          List<WebElement> list =  driver.findElements(By.tagName("a"));

          Thread.sleep(100);
          System.out.println(list);
          for(WebElement l : list){
              String URLs = l.getAttribute("href");
              System.out.println(URLs);

          }
    }
}
