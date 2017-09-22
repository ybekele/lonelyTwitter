package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by yonael on 9/21/17.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    public Tweet(String message) {
        date = new Date();
        this.message = message;
    }

    public Tweet(String message, Date date) {
        this.date = date;
        this.message = message;
    }
    // getter
    public String getMessage() {
        return message;
    }
    // setter
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= 140) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }

    public abstract Boolean isImportant();
}

