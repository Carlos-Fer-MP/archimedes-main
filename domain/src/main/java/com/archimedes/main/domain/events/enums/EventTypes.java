package com.archimedes.main.domain.events.enums;

import lombok.Getter;

@Getter
public enum EventTypes {
    SOCIAL("social"),
    OFFICIAL("official");

    private final String name;

    EventTypes(String name) {
        this.name = name;
    }
}
