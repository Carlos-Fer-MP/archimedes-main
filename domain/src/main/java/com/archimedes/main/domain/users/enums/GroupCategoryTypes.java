package com.archimedes.main.domain.users.enums;

import lombok.Getter;

import java.util.Map;

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

    public static final Map<String,String> VALUES_MAP = Map.of(
         "not_a_group", GroupCategoryTypes.NOT_A_GROUP.getName(),
         "regular", GroupCategoryTypes.REGULAR.getName(),
         "especial", GroupCategoryTypes.ESPECIAL.getName(),
         "exposition", GroupCategoryTypes.EXPOSITION.getName()
    );
}
