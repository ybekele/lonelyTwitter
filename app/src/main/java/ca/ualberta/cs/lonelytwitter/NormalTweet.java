package ca.ualberta.cs.lonelytwitter;

/**
 * Created by yonael on 9/13/17.
 */

public class NormalTweet extends Tweet{
    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
