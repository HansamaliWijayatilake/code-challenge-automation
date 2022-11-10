package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Advert {

    WebDriver driver;

    @FindBy(xpath="//table[@class='course-info table table-striped']/tbody")
    WebElement table;

    List<WebElement> rows;
    List<WebElement> cols;


    public Advert(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String accessTableData(int row, int col){

        String columnValue = null;
        if(table.findElements(By.tagName("tr")).size()>0){
            rows = table.findElements(By.tagName("tr"));
            for (int i = 0;i < row; i++) {
                cols = rows.get(row).findElements(By.tagName("td"));
                if(col<=cols.size()){
                    columnValue = cols.get(col-1).getText();
                }
            }

        }else{
            Assert.fail("No Vehicles matched the selection criteria");
        }

        return columnValue;
    }

}
