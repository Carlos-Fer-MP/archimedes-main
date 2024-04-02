package com.archimedes.main.domain.billing.enums;

import lombok.Getter;

@Getter
public enum BillingTypes {

    NOT_ASSIGNED("not_assigned"),
    MONTHLY("recurring"),
    YEARLY("yearly"),
    FREE_TRIAL("free_trial");

    private final String type;

    BillingTypes(String type) {
        this.type = type;
    }
}
