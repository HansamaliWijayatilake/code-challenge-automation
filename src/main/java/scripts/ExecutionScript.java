package scripts;

import constants.enums.FilteringConditions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;
import scripts.dataProvider.FiltertingDataProvider;

public class ExecutionScript {
    ChromeDriver driver;
    public static final String BASE_URL = "https://www.patpat.lk/";
    Landing landingPage;
    Vehicles vehiclesPage;
    Filtering filtering;
    AdvertsList adverts;
    Advert advert;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @Test
    public void navigateToVehiclesAndClickCars(){
        landingPage = new Landing(driver);
        vehiclesPage = new Vehicles(driver);

        landingPage.clickVehiclesCategory();
        vehiclesPage.clickCarSection();
    }

    @Test(dependsOnMethods = "navigateToVehiclesAndClickCars", dataProvider = "getFilterCriteria",
            dataProviderClass = FiltertingDataProvider.class)
    public void setFilteringCriteria(String conditionValue, String manufacturerValue,
                                     String modelValue, String yearValue, String transmissionValue){
        filtering = new Filtering(driver);
        filtering.setCondition(conditionValue);
        filtering.setManufacturer(manufacturerValue);
        filtering.setModel(modelValue);
        filtering.setYear(yearValue);
        filtering.setTransmission(transmissionValue);
        filtering.submitFilter();
    }

    @Test(dependsOnMethods = "setFilteringCriteria")
    public void clickOnAdvert(){
        adverts = new AdvertsList(driver);
        adverts.clickResults();
    }

    @Test(dependsOnMethods = "clickOnAdvert")
    public void validateTestData(){
        advert = new Advert(driver);

        String modelYear = advert.accessTableData(1,2);
        Assert.assertEquals(modelYear, FilteringConditions.YEAR_2009.getValue());
        System.out.println("----Manufactured Year Verification: PASSED----");

        String condition = advert.accessTableData(2,2);
        Assert.assertEquals(condition, FilteringConditions.USED_CONDITION.getValue());
        System.out.println("----Vehicle Condition Verification: PASSED----");
    }
}
