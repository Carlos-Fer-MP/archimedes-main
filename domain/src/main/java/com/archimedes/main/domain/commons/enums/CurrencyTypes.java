package com.archimedes.main.domain.commons.enums;

import lombok.Getter;

@Getter
public enum CurrencyTypes {
    EURO("euro"),
    DOLLAR("dollar"),
    CHF("chf"),
    YEN("yen");

    private final String code;
    CurrencyTypes(String code) {
        this.code = code;
    }
}
