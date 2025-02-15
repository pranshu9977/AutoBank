package testint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newIR {
    static WebDriver driver;
    public static void main(String[] args) {
        driver  = new ChromeDriver();
        int num = 6;
        driver.findElement(By.xpath("//div[text()='9']"));



    }

    public static void cclick(int num ){
        driver.findElement(By.xpath("//div[text()= '" + num +"']"));

    }

}
