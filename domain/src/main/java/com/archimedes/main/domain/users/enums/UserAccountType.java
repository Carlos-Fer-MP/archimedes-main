package com.archimedes.main.domain.users.enums;

import lombok.Getter;

@Getter
public enum UserAccountType {
    GUEST("guest"),
    PARTICULAR("particular"),
    GROUP("group"),
    BUSINESS("businesses");

    private final String name;
    UserAccountType(String name) {
        this.name = name;
    }
}
