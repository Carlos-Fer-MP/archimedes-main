package com.archimedes.main.domain.commons.enums;

import lombok.Getter;

import java.util.Map;

@Getter
public enum CurrencyTypes {
    NOT_ASSIGNED("not_assigned"),
    EURO("euro"),
    DOLLAR("dollar"),
    CHF("chf"),
    YEN("yen");

    private final String code;
    CurrencyTypes(String code) {
        this.code = code;
    }

    public static final Map<String,String> VALUES_MAP = Map.of(
            "euro", CurrencyTypes.EURO.getCode(),
            "dollar", CurrencyTypes.DOLLAR.getCode(),
            "chf", CurrencyTypes.CHF.getCode(),
            "yen", CurrencyTypes.YEN.getCode(),
            "not_assigned", CurrencyTypes.NOT_ASSIGNED.getCode()
    );
}
