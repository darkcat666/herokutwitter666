package test_twitter4;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

public class tweet_test444 {
	Status status;

	public void TweetTest444() {
		// このファクトリインスタンスは再利用可能でスレッドセーフです
    	Twitter twitter = TwitterFactory.getSingleton();
		try {
			status = twitter.updateStatus("テストちんちん");
		} catch (TwitterException e) {
			e.printStackTrace();
		}
    	System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}
}
