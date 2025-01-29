package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;


public class base {
    public static WebDriver driver;
    public static Properties properties;
    // https://demo.applitools.com/

    public static WebDriver getDriver(String url) {
        properties = new Properties();
        String directory = System.getProperty("user.dir");
        String propFilePath = " ";
        driver = new ChromeDriver();
        return driver;
    }



}
