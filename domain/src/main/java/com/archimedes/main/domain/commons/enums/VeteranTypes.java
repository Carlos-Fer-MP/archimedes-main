package com.archimedes.main.domain.commons.enums;


import lombok.Getter;

import java.util.Map;

@Getter
public enum VeteranTypes {
    NOT_ENROLLED("not_enrolled"),
    NEWBIE("newbie"),
    REGULAR("regular"),
    VETERAN("veteran");

    private final String name;

    VeteranTypes(String name) {
        this.name = name;
    }

    public static final Map<String,String> VALUES_MAP = Map.of(
      "veteran", VeteranTypes.VETERAN.getName(),
      "newbie", VeteranTypes.NEWBIE.getName(),
      "regular", VeteranTypes.REGULAR.getName(),
      "not_enrolled", VeteranTypes.NOT_ENROLLED.getName()
    );
}
