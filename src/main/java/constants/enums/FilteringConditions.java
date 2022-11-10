package constants.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FilteringConditions {
    USED_CONDITION("used"),
    TOYOTA_MANUFACTURER("Toyota");

    private String value;

}
