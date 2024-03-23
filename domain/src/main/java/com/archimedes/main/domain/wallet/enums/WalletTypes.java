package com.archimedes.main.domain.wallet.enums;

import lombok.Getter;

@Getter
public enum WalletTypes {

    PARTICULAR("particular"),
    SHARED("shared");

    private final String name;

    WalletTypes(String name) {
        this.name = name;
    }
}
