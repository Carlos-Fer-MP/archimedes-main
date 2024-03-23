package com.archimedes.main.domain.users.enums;

import lombok.Getter;

@Getter
public enum MemberTypes {
    NOT_A_MEMBER("not_a_member"),
    ADULT("adult"),
    KID("kid");

    private final String value;

    MemberTypes(String value) {
        this.value = value;
    }
}
