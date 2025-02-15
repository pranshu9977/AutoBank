package testint;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class dropdownhanld extends one {

    public static void main(String[] args) {
        Map<String,String> dd = new TreeMap<>();
        // https://www.globalsqa.com/demo-site/select-dropdown-menu/
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        Select ss = new Select(driver.findElement(By.xpath("//div//select")));
        boolean indiaFound = false;
       try{
        List<WebElement> option1=  ss.getOptions();
        for(WebElement w : option1){
            dd.put(w.getText(),w.getAttribute("value"));
        }
        for(Map.Entry<String,String> entry : dd.entrySet()){
            System.out.println(entry.getKey()+ "          "   + entry.getValue());
            if((entry.getKey().equals("India")) || (entry.getValue().equals("IND"))){
                System.out.println(entry.getKey() +  "   " +entry.getValue() );
                ss.selectByVisibleText(entry.getKey());
                indiaFound = true;
            }
        }
    }
       catch (NoSuchElementException nse){
           System.out.println(nse.getMessage());
       }
       catch(TimeoutException to){
           System.out.println(to.getStackTrace());
        }
       catch(Exception E){
           E.printStackTrace();
       }
       finally {
           driver.quit();

       }
       if(!indiaFound){
           throw new ElementNotInteractableException("India is not in dd list");
       }
    }
}
