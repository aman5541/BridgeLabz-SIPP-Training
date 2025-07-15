package com.gla;

public class SocialMedia {
    public static void main(String[] args) {
    	
        NotificationFeed feed = new NotificationFeed();

        feed.add(new LikeNotification("Mannu Sir"));
        feed.add(new CommentNotification("Jatin", "Nice pic"));
        feed.add(new LikeNotification("Aman"));
        feed.add(new CommentNotification("Jeetesh", "Congraculation"));

        feed.show();
    }
}
