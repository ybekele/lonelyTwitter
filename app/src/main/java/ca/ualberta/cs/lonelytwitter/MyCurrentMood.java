package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

import static android.R.attr.value;

/**
 * Created by yonael on 9/13/17.
 */

public abstract class MyCurrentMood extends Tweet{
    public String mood = "No Mood";
    private String sad;
    private String happy;
    private Date date;

    //prints mood
    public MyCurrentMood(String mood) {
        super(mood);
    }

    // mood setter
    public void setMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }
    // mood getter
    String getMood(String value) {
        if (value.equals("Happy")) {
            setHappy(mood);

        } else {
            setSad(mood);
        }


        return mood;
    }

    public void setSad(String sad) {
        this.sad = sad;
    }

    public void setHappy(String happy) {
        this.happy = happy;
    }
}