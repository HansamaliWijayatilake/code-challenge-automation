package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Filtering {

    WebDriver driver;

    @FindBy(id="condition")
    WebElement condition;

    @FindBy(id="manufacturer")
    WebElement manufacturer;

    @FindBy(id="model")
    WebElement model;

    @FindBy(name = "year")
    WebElement year;

    @FindBy(id="transmission")
    WebElement transmission;

    @FindBy(xpath = "//div[@class='col-6 position-sticky mb-3']/button[contains(text(),'Filter')]")
    WebElement btnFilter;

    public Filtering(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setCondition(String conditionValue){
        condition.click();
        Select conditionSelection = new Select(condition);
        conditionSelection.selectByValue(conditionValue);
    }

    public void setManufacturer(String manufacturerValue){
        manufacturer.click();
        Select manufacturerSelection = new Select(manufacturer);
        manufacturerSelection.selectByValue(manufacturerValue);
    }

    public void setModel(String modelValue){
        model.click();
        Select modelSelection = new Select(model);
        modelSelection.selectByValue(modelValue);
    }

    public void setYear(String yearValue){
        year.sendKeys(yearValue);
    }

    public void setTransmission(String transmissionValue){
        transmission.click();
        Select transmissionSelection = new Select(transmission);
        transmissionSelection.selectByValue(transmissionValue);
    }

    public void submitFilter(){
        btnFilter.click();
    }
}
