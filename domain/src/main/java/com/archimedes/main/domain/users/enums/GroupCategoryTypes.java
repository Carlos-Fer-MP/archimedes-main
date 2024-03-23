package com.archimedes.main.domain.users.enums;

import lombok.Getter;

@Getter
public enum GroupCategoryTypes {
    NOT_A_GROUP("not_a_group"),
    REGULAR("regular"),
    ESPECIAL("especial"),
    EXPOSITION("exposition");

    private final String name;
    GroupCategoryTypes(String name) {
        this.name = name;
    }
}
