package com.MoodAnalyzer.Exception;

public class MoodAnalyzer {
	public MoodAnalyzer() {
    }

    public String MoodAnalyzer(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
