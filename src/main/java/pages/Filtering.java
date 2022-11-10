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


    public Filtering(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void setCondition(){
        Select selection = new Select(condition);
        selection.selectByValue("used");
    }
}
