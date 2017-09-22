package ca.ualberta.cs.lonelytwitter;

/**
 * Created by yonael on 9/21/17.
 */

public class Sad extends MyCurrentMood {



    public int Sad() {
        if (mood.equals("Sad")) {
            return 1;
        }
        return 0;
    }
}

