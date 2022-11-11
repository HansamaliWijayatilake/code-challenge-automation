package scripts.dataProvider;

import constants.enums.FilteringConditions;
import org.testng.annotations.DataProvider;

public class FiltertingDataProvider {

    @DataProvider(name = "getFilterCriteria")
    public Object[][] getFilterCriteria() {
            return new Object[][]{{FilteringConditions.USED_CONDITION.getValue(),
                    FilteringConditions.TOYOTA_MANUFACTURER.getValue()
                    ,FilteringConditions.AXIO_MODEL.getValue(),
                    FilteringConditions.YEAR_2009.getValue(), FilteringConditions.AUTO_TRANSMISSION.getValue()}};
    }

}
