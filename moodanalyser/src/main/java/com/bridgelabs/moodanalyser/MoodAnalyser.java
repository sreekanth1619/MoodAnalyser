package com.bridgelabs.moodanalyser;
/**
 * Purpose  - “I am in Sad Mood” message Should Return SAD
 * @author  - N Sreekanth
 * @version - 16.0
 *
 */
public class MoodAnalyser {
	public static String analyseMood(String message) {
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else if (message.toLowerCase().contains("Any")) {
        }
        return "Happy";
    }
}
