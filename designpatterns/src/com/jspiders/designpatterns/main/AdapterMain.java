package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.structural.Adapter;

public class AdapterMain {
	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		adapter.setName("Dnyanesh");
		adapter.setMobile(9021433771l);
		adapter.setId(9);
		adapter.event();
		}

}
