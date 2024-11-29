package com.jspiders.filehandling.operation;

import java.io.File;

public class FileInfo {
	public static void main(String[] args) {
		
		File file = new File("D:\\file\\demo.txt");
				System.out.println(file.getName());
		         System.out.println(file.getAbsolutePath());
		       // System.out.println(file.getLength());
		         System.out.println(file.getPath());
		         //System.out.println(file.delete());
		         System.out.println(file.getFreeSpace());
		         System.out.println(file.getParent());
		         System.out.println(file.exists());
		         System.out.println(file.length());
		         System.out.println(file.separator);
		        
		         if(file.canExecute()) {
		        	 System.out.println("File is executable");
		         }
		         else {
		        	 System.out.println("File is not executable");
		         }
		         if(file.canRead()) {
		        	 System.out.println("File is readable");
		         }
		         else {
		        	 System.out.println("File is not readable");
		         }
		         if(file.canWrite()) {
		        	 System.out.println("File is writable");
		         }
		         else {
		        	 System.out.println("File is not writabel");
		         }
	}

}
