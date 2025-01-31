package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.Contact;
import com.jspiders.designpatterns.creational.ContactBuilder;

public class ContactMain {
	public static void main(String[] args) {
		Contact contact = new ContactBuilder().setMobileNumber(9876543210l).setFirstName("Akash").setEmail("akash@gmail.com").buildContact();
		System.out.println(contact);
}

}
