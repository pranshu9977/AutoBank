package testint;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class tabledata extends one {

    public static void main(String[] args) throws IOException {
       // WebDriverManager.chromedriver().setup();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
        Properties prop = new Properties();
        FileOutputStream file = new FileOutputStream("properties/details.properties");
        for(WebElement e : columns){
            e.getText();
            prop.setProperty("headers" ,e.getText() );
        }
    prop.store(file, null);
    }
}
