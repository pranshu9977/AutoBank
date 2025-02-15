package testint;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class windowhandls extends one {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demo.applitools.com/");
        String parenttab = driver.getWindowHandle();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
        Thread.sleep(1000);
        Set<String> tabs = driver.getWindowHandles();
        for(String s : tabs){
            System.out.println(s);

            if(tabs.equals(parenttab)){
                driver.switchTo().window(s);
                driver.navigate().to("https://www.google.com/");
                System.out.println(driver.getTitle());
            }
        }

        driver.switchTo().window(parenttab);
        System.out.println(  driver.getTitle());


    }
}
