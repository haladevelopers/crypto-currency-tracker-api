package com.crypto;

public class Lesson {
    private long id;
    private String category;
    private String title;
    private String content;
    private String interactiveTip;

    // 🧠 NEW: ENHANCED INTERACTIVE QUIZ METADATA VARIABLES
    private String quizQuestion;
    private String[] quizOptions;
    private int correctOptionIndex; // 0, 1, or 2 matching the correct array spot

    public Lesson(long id, String category, String title, String content, String interactiveTip,
                  String quizQuestion, String[] quizOptions, int correctOptionIndex) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.content = content;
        this.interactiveTip = interactiveTip;
        this.quizQuestion = quizQuestion;
        this.quizOptions = quizOptions;
        this.correctOptionIndex = correctOptionIndex;
    }

    // Standard getters required for automated web data stream compilation
    public long getId() { return id; }
    public String getCategory() { return category; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getInteractiveTip() { return interactiveTip; }
    public String getQuizQuestion() { return quizQuestion; }
    public String[] getQuizOptions() { return quizOptions; }
    public int getCorrectOptionIndex() { return correctOptionIndex; }
}
