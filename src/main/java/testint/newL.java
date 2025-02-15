package testint;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class newL extends one {  // Assuming One contains WebDriver setup

    public newL() {  // Explicit constructor to call parent constructor
        super();
    }

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.globalsqa.com/demo-site/select-elements/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@class, 'lazyloaded')]")));

        driver.switchTo().frame(frame);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(900, 0)");

        Actions act = new Actions(driver);

        // Hold down CTRL key and select multiple elements
        act.keyDown(Keys.CONTROL)
                .click(driver.findElement(By.xpath("(//ol[@id]//li)[1]")))
                .click(driver.findElement(By.xpath("(//ol[@id]//li)[3]")))
                .click(driver.findElement(By.xpath("(//ol[@id]//li)[5]")))
                .keyUp(Keys.CONTROL)  // Release CTRL key
                .perform();

        // Wait to see results before closing
        Thread.sleep(3000);

    }
}
