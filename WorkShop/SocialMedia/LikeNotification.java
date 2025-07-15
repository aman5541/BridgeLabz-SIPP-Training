package com.gla;

class LikeNotification extends Notification {

	public LikeNotification(String user) {
		
		super( user + "   liked your post");
	}

}
