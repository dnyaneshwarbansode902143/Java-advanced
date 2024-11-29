package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamRead {
	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		
		if(file.exists()) {
			try {
				
			FileReader fileReader = new FileReader(file);
			int ch = fileReader.read();
			System.out.println(ch);
			System.out.println("Data is featched the file");
			fileReader.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
		}
		else {
			System.out.println("File is does not exist");
		}
	}

}
