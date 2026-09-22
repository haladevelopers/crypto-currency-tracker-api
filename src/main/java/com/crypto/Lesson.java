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

    @NotBlank(message = "Title cannot be blank")
    @Size(min = 3, max = 150, message = "Title must be between 3 and 150 characters")
    private String title;

    @NotBlank(message = "Lesson content details cannot be blank")
    @Size(min = 10, max = 5000, message = "Content must be between 10 and 5000 characters")
    @Column(columnDefinition = "TEXT")
    private String content;

    @NotBlank(message = "Interactive teacher tip cannot be blank")
    @Column(columnDefinition = "TEXT")
    private String interactiveTip;

    @NotBlank(message = "Quiz question cannot be blank")
    @Column(columnDefinition = "TEXT")
    private String quizQuestion;

    @Column(columnDefinition = "TEXT")
    private String quizOptionsRaw;

    private int correctOptionIndex;

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
    public void setCategory(String category) { this.category = category; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getInteractiveTip() { return interactiveTip; }
    public void setInteractiveTip(String interactiveTip) { this.interactiveTip = interactiveTip; }
    public String getQuizQuestion() { return quizQuestion; }
    public void setQuizQuestion(String quizQuestion) { this.quizQuestion = quizQuestion; }
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
}
