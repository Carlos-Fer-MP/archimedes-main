package com.archimedes.main.domain.users.enums;

import lombok.Getter;

import java.util.Map;

@Getter
public enum MemberTypes {
    NOT_A_MEMBER("not_a_member"),
    ADULT("adult"),
    KID("kid");

    private final String value;

    MemberTypes(String value) {
        this.value = value;
    }

    public static final Map<String,String> VALUES_MAP = Map.of(
       "not_a_member", MemberTypes.NOT_A_MEMBER.getValue(),
       "adult", MemberTypes.ADULT.getValue(),
       "kid", MemberTypes.KID.getValue()
    );

}
