/*
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University of Alberta
 *
 *
 */

package ca.ualberta.cs.lonelytwitter.model;

public class ImportantTweet extends Tweet {
    @Override
    public boolean isValid() {
        if (tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        String body = getTweetDate() + " | " + getTweetBody();
        return  body.toUpperCase();
    }
}
