package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landing {

    WebDriver driver;

    @FindBy(xpath="//div[@class='section-content']/ul/li/a[@href='https://www.patpat.lk/vehicle']")
    WebElement vehiclesCategory;

    public Landing(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickVehiclesCategory(){
        vehiclesCategory.click();
    }
}
