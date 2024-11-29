package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class CreateFile1 {
	public static void main(String[] args) {
		File file = new File("demo.txt");
		try {
			boolean status=file.createNewFile();
			if(status) {
				System.out.println("File is created");
				
			}
			else {
				System.out.println("File is already exist");
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
		
}
	


