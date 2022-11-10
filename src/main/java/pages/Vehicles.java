package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Vehicles {

    WebDriver driver;

    @FindBy(xpath="//span[@data-vtype='car']")
    WebElement carSection;


    public Vehicles(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickCarSection(){
        carSection.click();
    }
}
