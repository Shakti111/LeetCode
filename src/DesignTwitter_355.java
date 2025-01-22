import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DesignTwitter_355 {
    public static void main (String[] args) {
        Twitter twitterObj = new Twitter();

        twitterObj.follow(1, 5);
        List<Integer> newsFeed_1 = twitterObj.getNewsFeed(1);
        System.out.println(Arrays.deepToString(newsFeed_1.toArray()));
//        twitterObj.postTweet(1, 1);
//        List<Integer> newsFeed_1 = twitterObj.getNewsFeed(1);
//        System.out.println(Arrays.deepToString(newsFeed_1.toArray()));
//        twitterObj.follow(2, 1);
//        List<Integer> newsFeed_2 = twitterObj.getNewsFeed(2);
//        System.out.println(Arrays.deepToString(newsFeed_2.toArray()));
//        twitterObj.unfollow(2, 1);
//        List<Integer> newsFeed_3 = twitterObj.getNewsFeed(2);
//        System.out.println(Arrays.deepToString(newsFeed_3.toArray()));
//        twitterObj.postTweet(1, 5);
//        List<Integer> newsFeed_1 = twitterObj.getNewsFeed(1);
//        System.out.println(Arrays.deepToString(newsFeed_1.toArray()));
//        twitterObj.follow(1, 2);
//        twitterObj.postTweet(2, 6);
//        List<Integer> newsFeed_2 = twitterObj.getNewsFeed(1);
//        System.out.println(Arrays.deepToString(newsFeed_2.toArray()));
//        twitterObj.unfollow(1, 2);
//        List<Integer> newsFeed_3 = twitterObj.getNewsFeed(1);
//        System.out.println(Arrays.deepToString(newsFeed_3.toArray()));

    }

}

class Twitter {
    private Map<Integer, ArrayList<int[]>> userTweets;
    private Map<Integer, ArrayList<Integer>> followerUserIds;
    private int tweetCounter;

    public Twitter() {
        this.userTweets = new HashMap<>();
        this.followerUserIds = new HashMap<>();
        this.tweetCounter = 1;
    }

    public void postTweet(int userId, int tweetId) {
        int[] tweetWithTimeArr = new int[] {tweetId, tweetCounter++};
        if (!userTweets.containsKey(userId)) {
            userTweets.put(userId, new ArrayList<>());
        }
        userTweets.get(userId).add(tweetWithTimeArr);
    }

    public List<Integer> getNewsFeed(int userId) {
        ArrayList<Integer> followersList = followerUserIds.get(userId) != null ?
                new ArrayList<>(followerUserIds.get(userId)) :
                new ArrayList<>();

        followersList.add(userId);
        List<int[]> combinedList = new ArrayList<>();
        for (int follower : followersList) {
            if (userTweets.containsKey(follower)) {
                ArrayList<int[]> getFollowerTweets = userTweets.get(follower);
                combinedList.addAll(getFollowerTweets);
            }
        }

        combinedList.sort((a, b) -> Integer.compare(b[1], a[1]));

        List<Integer> newsFeed = new ArrayList<Integer>();
        for (int[] tweetIdWithDate : combinedList) {
            if (!newsFeed.contains(tweetIdWithDate[0])) {
                newsFeed.add(tweetIdWithDate[0]);
            }
        }
        return newsFeed;
    }

    public void follow(int followerId, int followeeId) {
        if (!followerUserIds.containsKey(followerId)) {
            followerUserIds.put(followerId, new ArrayList<>());
        }
        followerUserIds.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followerUserIds.containsKey(followerId)) {
            followerUserIds.get(followerId).remove(Integer.valueOf(followeeId));
        }
    }
}

//class Twitter {
//    private Map<Integer, ArrayList<int[]>> userTweets;
//    private Map<Integer, ArrayList<Integer>> followerUserIds;
//    private int tweetCounter;
//
//    public Twitter() {
//        this.userTweets = new HashMap<>();
//        this.followerUserIds = new HashMap<>();
//        this.tweetCounter = 1;
//    }
//
//    public void postTweet(int userId, int tweetId) {
//        int[] tweetWithTimeArr = new int[] {tweetId, tweetCounter++};
//        if (!userTweets.containsKey(userId)) {
//            userTweets.put(userId, new ArrayList<>());
//        }
//        userTweets.get(userId).add(tweetWithTimeArr);
//        System.out.println(Arrays.asList(userTweets));
//        System.out.println(Arrays.deepToString(userTweets.get(userId).toArray()));
//    }
//
//    public List<Integer> getNewsFeed(int userId) {
//        ArrayList<Integer> followersList = followerUserIds.get(userId) != null ?
//                new ArrayList<>(followerUserIds.get(userId)) :
//                new ArrayList<>();
//        ArrayList<Integer> followersList = followerUserIds.get(userId);
//        System.out.println("followerUserIds.toString()" + followerUserIds.toString() + "userid " + userId);
//        followersList.add(userId);
//        List<int[]> combinedList = new ArrayList<>();
//        for (int follower : followersList) {
//            ArrayList<int[]> getFollowerTweets = userTweets.get(follower);
//            combinedList.addAll(getFollowerTweets);
//            System.out.println(Arrays.deepToString(getFollowerTweets.toArray()));
//        }
//
//        combinedList.sort((a, b) -> Integer.compare(b[1], a[1]));
//
//        List<Integer> newsFeed = new ArrayList<Integer>();
//        for (int[] tweetIdWithDate : combinedList) {
//            newsFeed.add(tweetIdWithDate[0]);
//        }
//        return newsFeed;
//    }
//
//    public void follow(int followerId, int followeeId) {
//        if (!followerUserIds.containsKey(followerId)) {
//            followerUserIds.put(followerId, new ArrayList<>());
//        }
//        followerUserIds.get(followerId).add(followeeId);
//        System.out.println(Arrays.asList(followerUserIds));
//        System.out.println(Arrays.deepToString(followerUserIds.get(followerId).toArray()));
//    }
//
//    public void unfollow(int followerId, int followeeId) {
//        if (followerUserIds.containsKey(followerId)) {
//            followerUserIds.get(followerId).remove(Integer.valueOf(followeeId));
//        }
//    }
//}
