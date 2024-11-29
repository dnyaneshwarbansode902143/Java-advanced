package com.jspiders.designpatterns.main;

import java.util.Scanner;

import com.jspiders.designpatterns.creational.Baleno;
import com.jspiders.designpatterns.creational.Car;
import com.jspiders.designpatterns.creational.Polo;
import com.jspiders.designpatterns.creational.Thar;
import com.jspiders.designpatterns.creational.XUV700;

public class CarMain {
	public static void main(String[] args) {
		try {
			 carfactory().order();
		} catch (NullPointerException e) {
			System.out.println("Selected choice is not availble!!!");
			System.out.println("Car is not ordered.");
		}
		
	}
		private static Car carfactory() {
			System.out.println("Enter1 to ordered Thar\n Eneter2 to ordered Polo\n Enter3 to ordered Baleno\n Enter4 to ordered XUV700 ");
			System.out.println("Enter your choice");
			Scanner scanner = new Scanner(System.in);
			int choice=scanner.nextInt();
			scanner.close();
			Car car = null;
			
			switch(choice) {
			
			case 1:
				car= new Thar();
				break;
			 
			case 2 :
				car =new Polo();
				break;
				
			case 3: 
				car = new Baleno();
				break;
				
			case 4:
				car = new XUV700();
				break;
				
			default:
				System.out.println("Invalid Choice!!!");
				
			}
			return car;
			
		}
	}


