package com.gla;



abstract public class Notification {
	private String message;
	 long time;


	 
	 public Notification(String message) {
       this.message = message;
       this.time = System.currentTimeMillis();     
}
	 
	 
	 public void display() {
		 System.out.println("message :"+ message + "  At  " + time );
	 }
}