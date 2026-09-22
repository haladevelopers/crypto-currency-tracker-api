package com.crypto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ConversionController {

    private final List<ConversionResponse> mockDatabaseTable = new ArrayList<>();
    private long autoIncrementId = 1;

    @Autowired
    private LessonRepository lessonRepository;

    @GetMapping("/api/convert")
    public ConversionResponse calculateWebConversion(@RequestParam(value = "usd", defaultValue = "1") double usdAmount) {
        double eurRate = 0.91; double pkrRate = 278.50; double inrRate = 83.40;
        ConversionResponse newRecord = new ConversionResponse(autoIncrementId++, usdAmount, usdAmount * eurRate, usdAmount * pkrRate, usdAmount * inrRate);
        mockDatabaseTable.add(newRecord);
        return newRecord;
    }

    @GetMapping("/api/history")
    public List<ConversionResponse> getAllTransactions() { return mockDatabaseTable; }

    @GetMapping("/api/lessons")
    public List<Lesson> getLessons(@RequestParam(value = "category", required = false) String category) {
        if (category == null || category.isEmpty()) {
            return lessonRepository.findAll();
        }
        return lessonRepository.findByCategoryIgnoreCase(category);
    }

    @GetMapping("/api/lessons/add")
    public List<Lesson> addNewLessonFromForm(
            @RequestParam("category") String category,
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("tip") String tip,
            @RequestParam("quizQuestion") String quizQuestion,
            @RequestParam("opt0") String opt0,
            @RequestParam("opt1") String opt1,
            @RequestParam("opt2") String opt2,
            @RequestParam("correctIdx") int correctIdx,
            @RequestParam(value = "videoUrl", defaultValue = "") String videoUrl,
            // 🌟 NEW SINDHI DYNAMIC QUERY PARAMETERS INJECTED HERE
            @RequestParam("titleSd") String titleSd,
            @RequestParam("contentSd") String contentSd,
            @RequestParam("tipSd") String tipSd,
            @RequestParam("quizQuestionSd") String quizQuestionSd,
            @RequestParam("opt0Sd") String opt0Sd,
            @RequestParam("opt1Sd") String opt1Sd,
            @RequestParam("opt2Sd") String opt2Sd) {

        String[] customOptions = new String[]{opt0, opt1, opt2};
        String[] customOptionsSd = new String[]{opt0Sd, opt1Sd, opt2Sd};

        // Maps the complete bilingual module safely to our relational storage
        Lesson dynamicLesson = new Lesson(category, title, content, tip, quizQuestion, customOptions, correctIdx, videoUrl,
                titleSd, contentSd, tipSd, quizQuestionSd, customOptionsSd);

        lessonRepository.save(dynamicLesson);
        return lessonRepository.findAll();
    }

    @GetMapping("/api/lessons/delete")
    public List<Lesson> deleteLessonById(@RequestParam("id") long lessonId) {
        lessonRepository.deleteById(lessonId);
        return lessonRepository.findAll();
    }
}
