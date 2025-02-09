package org.example;

public enum Male {
    MALE("Мальчик"), FEMALE("Девочка");

    private final String russianMaleTitle;

    Male(String russianMaleTitle) {
        this.russianMaleTitle = russianMaleTitle;
    }

    public String getRussianMaleTitle() {
        return russianMaleTitle;
    }
}
