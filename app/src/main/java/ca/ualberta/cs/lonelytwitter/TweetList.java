package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by yonael on 10/11/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){};

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }
    // Tweet because it will return a Tweet
    public Tweet getTweet(int index) {

        return tweets.get(index);
    }

}
