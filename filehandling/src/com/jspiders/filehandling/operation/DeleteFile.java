package com.jspiders.filehandling.operation;

import java.io.File;
import java.io.IOException;

public class DeleteFile {
	public static void main(String[] args) {
		
		File file = new File("D:\\file\\demo.txt");
		try {
			if(file.exists()) {
				boolean status=file.delete();
				
				if(status) {
					System.out.println("File is deleted");
					
				}
				else {
					System.out.println("File is not deleted");
				}
			}
			else {
				System.out.println("File is does not exist");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
