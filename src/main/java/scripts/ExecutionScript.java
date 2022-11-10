package scripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Filtering;
import pages.Landing;
import pages.Vehicles;
import scripts.dataProvider.FiltertingDataProvider;

public class ExecutionScript {
    ChromeDriver driver;
    public static final String BASE_URL = "https://www.patpat.lk/";
    Landing landingPage;
    Vehicles vehiclesPage;
    Filtering filtering;

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

    @Test(dependsOnMethods = "navigateToVehiclesAndClickCars", dataProvider = "getFilterCriteria", dataProviderClass = FiltertingDataProvider.class)
    public void setFilteringCriteria(String conditionValue, String manufacturerValue){
        filtering = new Filtering(driver);
        filtering.setCondition(conditionValue);
        filtering.setManufacturer(manufacturerValue);
    }
}
