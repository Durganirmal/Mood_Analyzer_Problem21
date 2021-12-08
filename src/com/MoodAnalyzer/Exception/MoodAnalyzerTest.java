package com.MoodAnalyzer.Exception;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {	
	@Test
    public void given_Message_SadMood_Should_Return_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am In a Sad Mood");
        String mood = moodAnalyzer.analyseMood();
        //Asserting The Result As Boolean Type True Or False
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void given_Message_AnyMood_Should_Return_HAPPY() {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}