package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.User;

public class UserMain {
public static void main(String[] args) {
	User user1 = User.getObject();
	System.out.println(user1);
	
	User user2 = User.getObject();
	System.out.println(user2);
	
	User user3 = User.getObject();
	System.out.println(user3);
	
	User user4 = User.getObject();
	System.out.println(user4);
	
	User user5 = User.getObject();
	System.out.println(user5);
	
	User user6 = User.getObject();
	System.out.println(user6);
	
	User user7 = User.getObject();
	System.out.println(user7);
}
}
