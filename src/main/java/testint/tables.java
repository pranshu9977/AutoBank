package testint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class tables extends one {
    public static void main(String[] args) {
    //div[@class='elementor-widget-container']//tbody//tr[normalize-text(text(),'Tim')]

    driver.get("https://www.dezlearn.com/webtable-example/");

    String email = "";

    List<WebElement> emails = driver.findElements(By.xpath("//td[contains(text(),'@')]"));

for(WebElement E : emails){

        if(E.getText().contains(" ")){

            email = E.getText();

        }

    System.out.println(email);

    }

}
}
