package com.jspiders.designpatterns.main;

import java.util.Scanner;

import com.jspiders.designpatterns.creational.Mobile;
import com.jspiders.designpatterns.creational.Nokiya;
import com.jspiders.designpatterns.creational.Oppo;
import com.jspiders.designpatterns.creational.Realme7i;
import com.jspiders.designpatterns.creational.Samsung;

public class MobileMain {
	public static void main(String[] args) {
	try {
		 mobileFactory().order();
	} catch (NullPointerException e) {
		System.out.println("Sorry Choose available Choice!!!");
		System.out.println("Mobile is not ordered!!!");
		
		
	}
	}
		private static  Mobile mobileFactory() {
			System.out.println("Enter1 to order Nokiya\n Enter2 ordered to Oppo\n Enter3 to ordered Realme7i\n Eneter4 to ordered Samsung");
			System.out.println("Enter your choice");
			Scanner scanner =new Scanner(System.in);
			int choice=scanner.nextInt(); 
			scanner.close();
			Mobile mobile = null;
			
			switch(choice) {
			case 1 :
				mobile =  new Nokiya();
				break;
			case 2 :
				mobile = new Oppo();
				break;
			case 3 :
				mobile = new Realme7i();
				break;
			case 4 :
				mobile = new  Samsung();
				break;
			default :
				System.out.println("Invalid choice");
			}
			return mobile;
			
			
		}
	}


