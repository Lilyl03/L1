package com.company.d15.stringmaker;

public class StringMakerResult {
    private long duration;
    private String text;

    public StringMakerResult(long duration, String text) {
        this.duration = duration;
        this.text = text;
    }

    public long getDuration() {
        return duration;
    }

    public String getText() {
        return text;
    }
}
