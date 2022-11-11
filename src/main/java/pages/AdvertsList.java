package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class AdvertsList {

    WebDriver driver;

    @FindBy(xpath="//*[@id='result']/div/div")
    List<WebElement> resultsRoot;


    public AdvertsList(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickResults(){

        if(resultsRoot.size()==0){
            Assert.fail("No Vehicles matched the selection criteria");
        }

        if(resultsRoot.size()>0){
            resultsRoot.get(0).findElement(By.tagName("a")).click();
        }
    }
}
