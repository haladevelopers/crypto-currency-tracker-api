package com.crypto;

public class Lesson {
    private long id;
    private String category;   // "English", "AI", or "Earning"
    private String title;
    private String content;
    private String interactiveTip;

    public Lesson(long id, String category, String title, String content, String interactiveTip) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.content = content;
        this.interactiveTip = interactiveTip;
    }

    // Getters for Spring Boot automated JSON translation
    public long getId() { return id; }
    public String getCategory() { return category; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getInteractiveTip() { return interactiveTip; }
}
