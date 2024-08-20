package com.boc.system.domain;

public class TableCountEcharts {
    private String name;
    private Integer value;

    // Constructors, getters, and setters
    public TableCountEcharts(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
