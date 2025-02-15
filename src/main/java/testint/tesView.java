package testint;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class tesView extends one{
    public static void main(String[] args) {
        driver.manage().window().maximize();
    driver.get("https://www.w3schools.in/javascript/dynamic-dependent-dropdown-list");
//        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@name, 'country')]")));
        Select select = new Select(driver.findElement(By.xpath("//*[contains(@name, 'country')]")));
        select.selectByIndex(2);
        System.out.println(select.getAllSelectedOptions());
    }
}
