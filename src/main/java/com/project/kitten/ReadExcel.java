package com.project.kitten;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public void printer() {
		String printedString = "";
		
		try {
			// create and read in excel file (IntakeNotes.xlsx in project root)
			FileInputStream kittenFile = new FileInputStream(new File("./IntakeNotes.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(kittenFile);
			XSSFSheet sheet = wb.getSheetAt(0);

			int numColumns = sheet.getRow(0).getPhysicalNumberOfCells();
			String[] columnNames = new String[numColumns];
			
			Row firstRow = sheet.getRow(0);
			
			// populate columnNames array
			for (int x = firstRow.getFirstCellNum(); x < firstRow.getLastCellNum(); x++){
				Cell m = firstRow.getCell(x);
				columnNames[x] = m.toString();
			} 
			
			//populate kitten list with information
			ArrayList<Kitten> kittenList = new ArrayList<Kitten>();
			for (int i= sheet.getFirstRowNum() + 1; i<= sheet.getLastRowNum(); i++) {
				Kitten k = new Kitten();
				Row r = sheet.getRow(i);
				
				for (int j = r.getFirstCellNum(); j<= r.getLastCellNum(); j++) {
					Cell c = r.getCell(j);
			
					for (int y=0; y< numColumns; y++) {
						
						if (j==y && columnNames[y].equals("Intake Notes") && (c!=null)) {
							k.setAddress(c.getStringCellValue());
						}
					
					}
				}
				
				//add populated kitten to kitten list 
				kittenList.add(k);
			}

			// for each kitten, get intake notes, extract address, and print to console
			
			for (Kitten kit: kittenList) {
				printedString = kit.getAddress();
				
				if (printedString != null) {
			     
				 ExtractAddress extractAddress = new ExtractAddress();
				 printedString = extractAddress.extractKittenAddress(printedString); 
				}
				
				System.out.println(printedString);
				
			} 

	wb.close();

		}

catch(Exception e) { e.printStackTrace();}
		
		
	}

}

