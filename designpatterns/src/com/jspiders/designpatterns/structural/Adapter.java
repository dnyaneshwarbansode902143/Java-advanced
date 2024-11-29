package com.jspiders.designpatterns.structural;

public class Adapter extends Player implements Team {
	
	public void event() {
		System.out.println(getName()+" is manager for the event");
		System.out.println(getMobile() +" This is mobile for manager");
		System.out.println(getId()+" This is id of manager");
    		
	}
	
	}
