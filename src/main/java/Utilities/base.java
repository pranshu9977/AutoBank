package Utilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;


public class base {
    public static WebDriver driver;
    public static Properties properties;
    public static Scenario scenario;
    String filepath = "/properties/url.properties";
    // https://demo.applitools.com/

public base(){
    PageFactory.initElements(driver,this);
    properties = new Properties();
    String directory = System.getProperty("user.dir");
    String propFilePath = directory + "/config.properties";
    driver = new ChromeDriver();
}

    @Before
    public WebDriver getDriver() {
        return driver;
    }
    public void getSite(){

        Properties urls = new Properties();
        FileInputStream fis;
        try {
            fis = new FileInputStream(filepath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            urls.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String currentURL = urls.getProperty("URL1");

        driver.get(currentURL);
    }


@After
    public void tearDown(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
}


}
