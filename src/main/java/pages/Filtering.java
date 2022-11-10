package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Filtering {

    WebDriver driver;

    @FindBy(id="condition")
    WebElement condition;

    @FindBy(id="manufacturer")
    WebElement manufacturer;


    public Filtering(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setCondition(String conditionValue){
        Select conditionSelection = new Select(condition);
        conditionSelection.selectByValue(conditionValue);
    }

    public void setManufacturer(String manufacturerValue){
        Select manufacturerSelection = new Select(manufacturer);
        manufacturerSelection.selectByValue(manufacturerValue);
    }
}
