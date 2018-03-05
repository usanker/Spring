package com.springProject;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorld2 {
	   @Autowired
	   private Message messageH2;
	   private Name name;

	   public HelloWorld2(){
		   System.out.println("HelloWorld2 default Constructor is Called");
	   }
	   
	   @Autowired
	   public HelloWorld2(Message m){
		   System.out.println("HelloWorld2 ONE Arg Constructor is Called");
		   this.messageH2=m;
		   System.out.println("END of HelloWorld2 ONE Arg Constructor is Called");
	   }
	   
	   //@Autowired
	   public HelloWorld2(Message m,Name n){
		   System.out.println("HelloWorld2 TWO Arg Constructor is Called");
		   this.messageH2=m;
		   this.name=n;
	   }
	   
	   @Autowired
	   public void setMessage(Message message){
		  System.out.println("HelloWorld2 setMessage() is Called");
		  System.out.println("Value of Message in setMessage() before assign=>"+this.messageH2);
	      this.messageH2  = message;
	   }
	   public Message getMessage(){
		  System.out.println("HelloWorld2 getMessage() is Called");
		  System.out.println("Your Message : " + messageH2);
		  System.out.println("Your Name : " + name);
	      return messageH2;
	   }
}
