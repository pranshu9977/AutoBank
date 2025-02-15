package testint;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.FileHandler;

public class tablehandels extends one {

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        List<WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']//th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@class = 'dataTable']//tr[2]//td"));
        Map<String, String> tbl = new LinkedHashMap<>();
        String textA = "";
        String textB = "";
        System.out.println(headers.size());
        System.out.println(rows.size());
        for (int i = 0; i < headers.size(); i++) {
            textA = headers.get(i).getText().trim();
            textB = rows.get(i).getText().trim();
            tbl.put(textA, textB);
        }
        System.out.println(tbl);

        for (Map.Entry<String, String> entry : tbl.entrySet()) {
            System.out.println(entry.getKey() + " is   --->" + entry.getValue());
        }
        TakesScreenshot sc = (TakesScreenshot) driver;
        File source = sc.getScreenshotAs(OutputType.FILE);
        File destination = new File("SC/sc1.png" );

    }
}