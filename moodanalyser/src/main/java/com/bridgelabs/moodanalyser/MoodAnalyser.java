package com.bridgelabs.moodanalyser;
/**
 * Purpose  -  Handle Exception if User Provides Invalid Mood
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

	    public static String analyseMood() {
	        try {
	            if (message.toLowerCase().contains("sad")) {
	                return "Sad";
	            } else {
	                return "Happy";
	            }
	        } catch (NullPointerException e) {
	            return "Exception Handled";
	        }
	    }
	    }
