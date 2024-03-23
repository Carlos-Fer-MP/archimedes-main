package com.archimedes.main.domain.commons.enums;

import lombok.Getter;

@Getter
public enum VeteranTypes {
    NOT_ENROLLED("not_enrolled"),
    VETERAN("veteran"),
    NEWBIE("newbie"),
    REGULAR("regular");

    private final String name;

    VeteranTypes(String name) {
        this.name = name;
    }
}
