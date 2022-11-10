package scripts.dataProvider;

import constants.enums.FilteringConditions;
import org.testng.annotations.DataProvider;

public class FiltertingDataProvider {

    @DataProvider(name = "getFilterCriteria")
    public Object[][] getFilterCriteria() {
            return new Object[][]{{FilteringConditions.USED_CONDITION.getValue()},{FilteringConditions.TOYOTA_MANUFACTURER.getValue()}};
    }

}
