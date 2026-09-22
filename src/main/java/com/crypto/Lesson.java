package com.crypto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "lessons")
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Category field cannot be blank")
    private String category;

    // 🇬🇧 English Storage Fields
    @NotBlank(message = "English title cannot be blank")
    @Size(min = 3, max = 150, message = "English title must be between 3 and 150 characters")
    private String title;

    @NotBlank(message = "English content details cannot be blank")
    @Size(min = 10, max = 5000, message = "English content must be between 10 and 5000 characters")
    @Column(columnDefinition = "TEXT")
    private String content;

    @NotBlank(message = "English interactive teacher tip cannot be blank")
    @Column(columnDefinition = "TEXT")
    private String interactiveTip;

    @NotBlank(message = "English quiz question cannot be blank")
    @Column(columnDefinition = "TEXT")
    private String quizQuestion;

    @Column(columnDefinition = "TEXT")
    private String quizOptionsRaw;

    // 🗣️ Automated Sindhi Database Storage Columns
    @Column(columnDefinition = "TEXT")
    private String titleSd;

    @Column(columnDefinition = "TEXT")
    private String contentSd;

    @Column(columnDefinition = "TEXT")
    private String interactiveTipSd;

    @Column(columnDefinition = "TEXT")
    private String quizQuestionSd;

    @Column(columnDefinition = "TEXT")
    private String quizOptionsRawSd;

    private int correctOptionIndex;
    private String videoUrl;

    public Lesson() {}

    public Lesson(String category, String title, String content, String interactiveTip,
                  String quizQuestion, String[] quizOptions, int correctOptionIndex, String videoUrl,
                  String titleSd, String contentSd, String interactiveTipSd, String quizQuestionSd, String[] quizOptionsSd) {
        this.category = category;
        this.title = title;
        this.content = content;
        this.interactiveTip = interactiveTip;
        this.quizQuestion = quizQuestion;
        this.setQuizOptions(quizOptions);
        this.correctOptionIndex = correctOptionIndex;
        this.videoUrl = videoUrl;
        // Map Sindhi parameters
        this.titleSd = titleSd;
        this.contentSd = contentSd;
        this.interactiveTipSd = interactiveTipSd;
        this.quizQuestionSd = quizQuestionSd;
        this.setQuizOptionsSd(quizOptionsSd);
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getInteractiveTip() { return interactiveTip; }
    public void setInteractiveTip(String interactiveTip) { this.interactiveTip = interactiveTip; }
    public String getQuizQuestion() { return quizQuestion; }
    public void setQuizQuestion(String quizQuestion) { this.quizQuestion = quizQuestion; }

    // Getters and Setters for automated Sindhi Columns
    public String getTitleSd() { return titleSd; }
    public void setTitleSd(String titleSd) { this.titleSd = titleSd; }
    public String getContentSd() { return contentSd; }
    public void setContentSd(String contentSd) { this.contentSd = contentSd; }
    public String getInteractiveTipSd() { return interactiveTipSd; }
    public void setInteractiveTipSd(String interactiveTipSd) { this.interactiveTipSd = interactiveTipSd; }
    public String getQuizQuestionSd() { return quizQuestionSd; }
    public void setQuizQuestionSd(String quizQuestionSd) { this.quizQuestionSd = quizQuestionSd; }

    public int getCorrectOptionIndex() { return correctOptionIndex; }
    public void setCorrectOptionIndex(int correctOptionIndex) { this.correctOptionIndex = correctOptionIndex; }
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

    public String[] getQuizOptionsSd() {
        if (this.quizOptionsRawSd == null) return new String[0];
        return this.quizOptionsRawSd.split("###");
    }
    public void setQuizOptionsSd(String[] options) {
        if (options == null) return;
        this.quizOptionsRawSd = String.join("###", options);
    }
}
