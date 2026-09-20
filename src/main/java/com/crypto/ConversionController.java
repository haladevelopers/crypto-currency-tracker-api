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
        educationCatalog.add(new Lesson(1, "English", "Mastering the Present Continuous Tense",
                "Use this tense for actions happening right now! Structure: Subject + am/is/are + Verb(ing). Example: 'I am learning code right now.'",
                "Tip: Look around your room and say out loud what your family members are doing!"));

        educationCatalog.add(new Lesson(2, "AI", "Introduction to Prompt Engineering",
                "AI outputs are only as good as your inputs. Always give the AI a Role, a Task, and a Context. Example: 'Act as a professional English tutor, correct my grammar in this sentence...'",
                "Tip: Try starting your next query with 'Act as an expert software tester'!"));

        educationCatalog.add(new Lesson(3, "Earning", "Setting Up Your Mobile Upwork Account",
                "You do not need an expensive laptop to start. Use the official Upwork Mobile App to browse entry-level data tasks, verify your identity securely, and message prospective global clients.",
                "Tip: Ensure your profile summary highlights absolute clarity and technical focus!"));
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
        if (category == null || category.isEmpty()) {
            return educationCatalog;
        }
        return educationCatalog.stream()
                .filter(lesson -> lesson.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // 🌟 FIXED LESSON ADDITION HOOK
    @GetMapping("/api/lessons/add")
    public List<Lesson> addNewLessonFromForm(
            @RequestParam("category") String category,
            @RequestParam("title") String title,
            @RequestParam("content") String content,
            @RequestParam("tip") String tip) {

        long nextLessonId = educationCatalog.size() + 1;
        Lesson customLesson = new Lesson(nextLessonId, category, title, content, tip);
        educationCatalog.add(customLesson);
        return educationCatalog;
    }
}
