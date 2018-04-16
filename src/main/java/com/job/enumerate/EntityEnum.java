package com.job.enumerate;

public enum EntityEnum {
    FIELD_ID("id");

    private String name;

    public String getName() {
        return name;
    }

    EntityEnum(String name) {
        this.name = name;
    }
}
