package day40;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file >> WookBook >> Sheets >> Rows >> Cells

public class WritingStaticDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		//opening or creating file in writing mode
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		//creating new workbook in the file
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		//creating sheet in the workbook
		XSSFSheet sheet = workbook.createSheet("Data");
		
		//creating first row in the sheet
		XSSFRow row1 = sheet.createRow(0);
		
		//creating cells in the first row
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue(1);
		row1.createCell(2).setCellValue("Automation");
		
		//creating second row in the sheet
		XSSFRow row2 = sheet.createRow(1);
		
		//creating cells in the second row
		row2.createCell(0).setCellValue("Python");
		row2.createCell(1).setCellValue(2);
		row2.createCell(2).setCellValue("Automation");
		
		//creating third row in the sheet
		XSSFRow row3 = sheet.createRow(2);
		
		//creating cells in the third row
		row3.createCell(0).setCellValue("C#");
		row3.createCell(1).setCellValue(3);
		row3.createCell(2).setCellValue("Automation");
		
		//attaching newly created workbook into file
		workbook.write(file);
		
		//closing workbook
		workbook.close();
		
		//closing file
		file.close();
		
		System.out.println("file is created.....");

	}

}
