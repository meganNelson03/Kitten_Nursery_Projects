package com.project.kitten;

//import java.io.FileNotFoundException;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintStream;
//import java.io.PrintStream;
//import java.util.Scanner;
//import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAddress {
	
	// extract: match group of text that starts with found at/from location/etc
	//          and ends at a period
	 private static final String KITTEN_PATTERN_STRING = "[\00]|^.*?(found at|from location|Found at|From location|Found in|Intake from|intake from) (.*?)([\\.,!?].*+|)$";
	 private static final Pattern KITTEN_PATTERN = Pattern.compile(KITTEN_PATTERN_STRING);
	
	 public String extractKittenAddress(String kittenString) {
		   
		 // replace all instances of periods inside address
		 if (kittenString.contains("W.")) {
	    	  kittenString = kittenString.replace("W.", "W");
	      }
		 
		 if (kittenString.contains("E.")) {
			 kittenString = kittenString.replaceAll("E.", "E");
		 }
		 if (kittenString.contains("S.")) {
			 kittenString = kittenString.replaceAll("S.", "S");
		 }
		 if (kittenString.contains("So.")) {
			 kittenString = kittenString.replaceAll("So.", "So");
		 }
		 if (kittenString.contains("N.")) {
			 kittenString = kittenString.replaceAll("N.", "N");
		 }
		 
		 
	     Matcher m = KITTEN_PATTERN.matcher(kittenString);

	      
	      // return group between 'found at' and period mark 
	      if(m.matches()) 
	         return m.group(2);
	       return null;

	  }
		
		
		
	}
	
	  

	
	
	

