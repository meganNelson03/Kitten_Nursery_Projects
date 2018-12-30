// -------------------------------------------------------------------
// INTERN PROJECT  08/26/2018
// INPUT: 2007+ excel document containing kitten info
// OUTPUT: list of addresses extracted from Intake Notes in a txt file "KittenAddress.txt"
// Megan Nelson
// ----------------------------------------------------------------------


package com.project.kitten;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class PrintAddressList {

	public static void main(String[] args) throws FileNotFoundException {

	    // make new file "KittenAddress.txt" 
	    PrintStream o = new PrintStream(new File("KittenAddress.txt"));
	    PrintStream console = System.out;
	    
	    System.setOut(o);
	    System.out.println("LIST OF ADDRESSES: " + "\n" + "--------------------");
	    
	    // print address list into KittenAddress.txt
		ReadExcel kittenAddressList = new ReadExcel();
		kittenAddressList.printer();
		System.setOut(console);
	    
	   
	
	}

}
	
