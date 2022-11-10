package constants.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FilteringConditions {
    USED_CONDITION("used"),
    TOYOTA_MANUFACTURER("Toyota"),
    AXIO_MODEL("Axio"),
    YEAR_2009("2009"),
    AUTO_TRANSMISSION("auto");

    private String value;

}
