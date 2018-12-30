package com.project.kitten;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.PrintStream;
//import java.util.ArrayList;


public class ReturnAddress {
	
	public String returnAddresses() throws FileNotFoundException {
		
		ReadExcel addressList = new ReadExcel();
		addressList.printer();
		
		 FileInputStream fis = null;
	     String str = "";
	     
	     try {
	    	 fis = new FileInputStream("Kittens.txt");
	    	 int content;
	    	 while ((content = fis.read()) != -1) {
	    		 str += (char) content;
	    	 }
	    	
	    	 
	     } catch (IOException e) {
	    	 e.printStackTrace();
	     } finally {
	    	 try {
	    		 if (fis !=null) fis.close();
	    	 } catch (IOException ex) 
	    	 {ex.printStackTrace();}
	     }
	     
	  
	    return str;
		
	}
	
  
}

