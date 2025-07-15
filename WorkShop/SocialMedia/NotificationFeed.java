package com.gla;

import java.util.LinkedList;

public class NotificationFeed {
	
    LinkedList<Notification> feed = new LinkedList<>();

    public void add(Notification notification) {
        feed.addFirst(notification);
        if (feed.size() > 10) {
            feed.removeLast(); 
        }
    }

    public void show() {
        System.out.println("Display Notification");
        for (Notification n : feed) {
            n.display();
        }
    }
}