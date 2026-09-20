package com.crypto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ConversionController {

    private final List<ConversionResponse> mockDatabaseTable = new ArrayList<>();
    private final List<Lesson> educationCatalog = new ArrayList<>();
    private long autoIncrementId = 1;

    public ConversionController() {
        // Initial core curriculum items with pre-set quizzes
        educationCatalog.add(new Lesson(1, "English", "Mastering the Present Continuous Tense",
                "Use this tense for actions happening right now! Structure: Subject + am/is/are + Verb(ing). Example: 'I am learning code right now.'",
                "Tip: Look around your room and say out loud what your family members are doing!",
                "Identify the correct Present Continuous statement below:",
                new String[]{"He runs to school yesterday.", "She is speaking English beautifully.", "They will study tomorrow."},
                1));

        educationCatalog.add(new Lesson(2, "AI", "Introduction to Prompt Engineering",
                "AI outputs are only as good as your inputs. Always give the AI a Role, a Task, and a Context. Example: 'Act as a professional English tutor...'",
                "Tip: Try starting your next query with 'Act as an expert software tester'!",
                "What are the three essential components of a perfect foundational AI prompt?",
                new String[]{"Role, Task, and Context", "Username, Password, and Code", "Laptop, Internet, and Browser"},
                0));
    }

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
        if (category == null || category.isEmpty()) { return educationCatalog; }
        return educationCatalog.stream()
                .filter(lesson -> lesson.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // 🌟 FULLY DYNAMIC: Now accepts custom quiz structures directly from your web dashboard input array!
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
            @RequestParam("correctIdx") int correctIdx) {

        long nextLessonId = educationCatalog.size() + 1;

        // Assemble the custom options array layout packages
        String[] customOptions = new String[]{opt0, opt1, opt2};

        // Create the fully tailored custom Lesson object
        Lesson dynamicLesson = new Lesson(nextLessonId, category, title, content, tip, quizQuestion, customOptions, correctIdx);

        educationCatalog.add(dynamicLesson);
        return educationCatalog;
    }

    @GetMapping("/api/lessons/delete")
    public List<Lesson> deleteLessonById(@RequestParam("id") long lessonId) {
        educationCatalog.removeIf(lesson -> lesson.getId() == lessonId);
        return educationCatalog;
    }
}
