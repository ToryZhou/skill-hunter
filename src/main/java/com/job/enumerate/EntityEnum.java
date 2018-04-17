package com.job.enumerate;

public enum EntityEnum {
    FIELD_ID("id"),

    CATALOG_SKILL_HUNTER("skill_hunter"),

    TABLE_USER("user");

    private String name;

    public String getName() {
        return name;
    }

    EntityEnum(String name) {
        this.name = name;
    }
}
