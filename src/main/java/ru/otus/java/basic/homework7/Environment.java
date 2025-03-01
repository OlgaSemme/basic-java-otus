package ru.otus.java.basic.homework7;

public enum Environment {
    FOREST("густой лес"),
    PLAIN("равнина"),
    SWAMP("болото");

    Environment(String environment) {
        this.environment = environment;
    }

    private String environment;

    public String getEnvironment() {
        return environment;
    }


}
