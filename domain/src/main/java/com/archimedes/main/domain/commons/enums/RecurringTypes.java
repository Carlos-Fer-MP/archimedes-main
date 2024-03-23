package com.archimedes.main.domain.commons.enums;

import lombok.Getter;

@Getter
public enum RecurringTypes {
    DAILY("daily"),
    WEEKLY("weekly"),
    MONTHLY("monthly"),
    YEARLY("yearly"),
    NON_RECURRENT("non_recurrent");

    private final String value;
    RecurringTypes(String value) {
        this.value = value;
    }
}
