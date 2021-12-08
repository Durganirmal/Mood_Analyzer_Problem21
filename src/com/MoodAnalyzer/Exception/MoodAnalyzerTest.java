package com.MoodAnalyzer.Exception;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {

	 @Test
	    public void given_NullMood_Should_Throw_MoodAnalyzerException() {
	        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
	        String mood;
	        try {
	            mood = moodAnalyser.analyseMood();
	        } catch (MoodAnalyzerException e) {
	            Assert.assertEquals(MoodAnalyzerException.Exception_Type.NULL,e.type);
	        }
	    }
	}