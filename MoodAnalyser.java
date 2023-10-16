package com.denisstrykov.unit_tests.Unit3.HW3.moodAnalyser;

public class MoodAnalyser {

    public String analyseMood(String message) {
        return switch (message) {
            case "отличное" -> "You are lucky man!";
            case "хорошее" -> "You are still lucky man!";
            case "не очень" -> "It is happened man...";
            case "плохое" -> "Do not cry man...";
            default -> "Wat do you say?";
        };
    }

}
