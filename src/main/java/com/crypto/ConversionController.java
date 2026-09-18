package com.crypto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ConversionController {

    private final List<ConversionResponse> mockDatabaseTable = new ArrayList<>();
    private long autoIncrementId = 1;

    @GetMapping("/api/convert")
    public ConversionResponse calculateWebConversion(@RequestParam(value = "usd", defaultValue = "1") double usdAmount) {
        double eurRate = 0.91;
        double pkrRate = 278.50;
        double inrRate = 83.40;

        double totalEur = usdAmount * eurRate;
        double totalPkr = usdAmount * pkrRate;
        double totalInr = usdAmount * inrRate;

        ConversionResponse newRecord = new ConversionResponse(autoIncrementId++, usdAmount, totalEur, totalPkr, totalInr);
        mockDatabaseTable.add(newRecord);

        return newRecord;
    }

    @GetMapping("/api/history")
    public List<ConversionResponse> getAllTransactions() {
        return mockDatabaseTable;
    }
}
