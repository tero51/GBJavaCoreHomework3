package org.example;

public enum Holiday {
    NEW_YEAR("С Новым годом!"),
    WOMENS_DAY("С 8 Марта!"),
    DEFENDERS_DAY("С 23 Февраля!");
    private final String message;

    Holiday(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
