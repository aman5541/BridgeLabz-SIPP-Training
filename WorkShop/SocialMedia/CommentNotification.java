package com.gla;

 class CommentNotification extends Notification{
    
	public CommentNotification( String user, String comments) {
		 
		super( user + " commented : -"+ comments + " ");
		
	}
	

}
