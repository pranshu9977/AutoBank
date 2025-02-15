package testint;
import Utilities.base;
import com.google.common.escape.Escaper;
import org.apache.poi.ss.formula.functions.Today;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Key;
import java.util.Date;

public class ActonsClss extends one {
    static final String path ="D:/data";
    public static void main(String[] args) throws IOException {

        JavascriptExecutor jss = (JavascriptExecutor) driver;
        String home = driver.getWindowHandle();
        driver.switchTo().newWindow(WindowType.TAB);
        // jss.executeScript("window.open()");
        driver.get("https://www.google.com/");
        driver.switchTo().window(home);
        String title = driver.getTitle();
        System.out.println(driver.getTitle());
        Actions act = new Actions(driver);
        WebElement search = driver.findElement(By.xpath("//*[@class= 'gLFyf']"));
        act.contextClick(search).build().perform();
        act.click().perform();
        act.doubleClick(search).perform();
        FileInputStream file = null;
        try {
            file = new FileInputStream("testDaata");
        }
        catch (IOException IO){
            IO.printStackTrace();
        }
        Workbook wb = WorkbookFactory.create(file);
        Sheet sheet = wb.getSheet("Sheet1");
        Row row = sheet.createRow(1);
        Cell cell = row.createCell(1);
        cell.setCellValue(title);
        }
    }

