package testint;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class uForm {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://........."); // url form page
        String expectedTitle = "BankFormPage";
        String pageTitle = driver.getTitle(); // pagetitel
        Assert.assertEquals(expectedTitle,pageTitle);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//"))));
       //for firstName
       try {
           driver.findElement(By.xpath("//div[@attribute]")).sendKeys("12as46a");
       }
       catch(Exception e){
           System.out.println("cannot pass the values in Varchar");
       }
       finally {
           driver.findElement(By.xpath("//div[@attribute]")).sendKeys("asjkavgd");
       }
        Select sltCountry = new Select(driver.findElement(By.xpath("")));
        sltCountry.selectByVisibleText("US");
        List<WebElement > l1 = sltCountry.getOptions();
        Map<String, String> countStates=  new LinkedHashMap<>();
        Select cStates = new Select(driver.findElement(By.xpath("")));
        cStates.selectByVisibleText("WS");
    }
}
