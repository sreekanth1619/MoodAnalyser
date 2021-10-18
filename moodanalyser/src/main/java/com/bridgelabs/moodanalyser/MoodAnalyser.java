package com.bridgelabs.moodanalyser;
/**
 * Purpose  - “I am in Happy Mood” message in Constructor Should Return Happy
 * @author  - N Sreekanth
 * @version - 16.0
 *
 */
public class MoodAnalyser {
	 public static String message;

	    // Constructor
	    public MoodAnalyser(String message) {
	        this.message = message;
	        analyseMood();
	    }

	    //Getter
	    public String getMessage() {
	        return message;
	    }

	    //Setter
	    public void setMessage(String message) {
	        this.message = message;
	    }

	    public String analyseMood() {

	        if (message.toLowerCase().contains("sad")) {
	            return "Sad";
	        } else if (message.toLowerCase().contains("happy")) {
	        }
	        return "Happy";
	    }
	    }
