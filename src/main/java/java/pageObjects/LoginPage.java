package java.pageObjects;

import io.cucumber.java.Scenario;
import Utilities.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends base {

    @FindBy (xpath = "//*[conta]")
    private WebElement userName;


    public void LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void login(String uName, String password, Scenario scenario){

        userName.sendKeys();
        scenario.log("clicked to submit");

    }






}
