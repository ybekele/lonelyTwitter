package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yonael on 9/21/17.
 */

public abstract class MyCurrentMood {
    public String mood = "No Mood";
    private Date date;
    private String sad;
    private String happy;


    public Date getDate() {
        return date;
    }


    public void setMood(String mood, Date date) {
        this.mood = mood;
        this.date = date;
    }

    String getMood(String value) {
        if (value.equals("Happy")) {
            setHappy(mood);
        } else {
            setSad(mood);
        }
        return mood;
    }
    public void setSad(String sad) {this.sad = sad; }
    public void setHappy(String happy) {this.happy = happy; }
}


