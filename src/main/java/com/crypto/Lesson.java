package com.crypto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String category;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    @Column(columnDefinition = "TEXT")
    private String interactiveTip;

    @Column(columnDefinition = "TEXT")
    private String quizQuestion;

    @Column(columnDefinition = "TEXT")
    private String quizOptionsRaw;

    private int correctOptionIndex;

    // 🎥 NEW DATABASE FIELD: Stores the target streaming educational video ID record row
    private String videoUrl;

    public Lesson() {}

    public Lesson(String category, String title, String content, String interactiveTip,
                  String quizQuestion, String[] quizOptions, int correctOptionIndex, String videoUrl) {
        this.category = category;
        this.title = title;
        this.content = content;
        this.interactiveTip = interactiveTip;
        this.quizQuestion = quizQuestion;
        this.setQuizOptions(quizOptions);
        this.correctOptionIndex = correctOptionIndex;
        this.videoUrl = videoUrl;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCategory() { return category; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getInteractiveTip() { return interactiveTip; }
    public String getQuizQuestion() { return quizQuestion; }
    public int getCorrectOptionIndex() { return correctOptionIndex; }
    public String getVideoUrl() { return videoUrl; }
    public void setVideoUrl(String videoUrl) { this.videoUrl = videoUrl; }

    public String[] getQuizOptions() {
        if (this.quizOptionsRaw == null) return new String[0];
        return this.quizOptionsRaw.split("###");
    }

    public void setQuizOptions(String[] options) {
        if (options == null) return;
        this.quizOptionsRaw = String.join("###", options);
    }
}
