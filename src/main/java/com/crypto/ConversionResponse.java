package com.crypto;

import java.time.LocalDateTime;

public class ConversionResponse {
    private long id;
    private String baseCurrency;
    private double originalAmountUsd;
    private double convertedEur;
    private double convertedPkr;
    private double convertedInr;
    private String timestamp;

    public ConversionResponse(long id, double originalAmountUsd, double convertedEur, double convertedPkr, double convertedInr) {
        this.id = id;
        this.baseCurrency = "USD";
        this.originalAmountUsd = originalAmountUsd;
        this.convertedEur = convertedEur;
        this.convertedPkr = convertedPkr;
        this.convertedInr = convertedInr;
        this.timestamp = LocalDateTime.now().toString();
    }

    // Standard getters required by Spring Boot to automatically generate the JSON payload
    public long getId() { return id; }
    public String getBaseCurrency() { return baseCurrency; }
    public double getOriginalAmountUsd() { return originalAmountUsd; }
    public double getConvertedEur() { return convertedEur; }
    public double getConvertedPkr() { return convertedPkr; }
    public double getConvertedInr() { return convertedInr; }
    public String getTimestamp() { return timestamp; }
}
