package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file >> WookBook >> Sheets >> Rows >> Cells

public class WrittingDataIntoSpecificRowAndCell {

	public static void main(String[] args) throws IOException {

		// opening or creating file in writing mode
		FileOutputStream file = new FileOutputStream(
				System.getProperty("user.dir") + "\\testdata\\myfile_random_data.xlsx");

		// creating new workbook in the file
		XSSFWorkbook workbook = new XSSFWorkbook();

		// creating sheet in the workbook
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		//creating random row and random cell
		XSSFRow row = sheet.createRow(3);
		XSSFCell cell = row.createCell(4);
		
		//putting data to random cell
		cell.setCellValue("kfj94389h");
		
		//attaching workbook to file 
		workbook.write(file);
		
		//closing workbook
		workbook.close();
		
		//closing file
		file.close();
		
		System.out.println("file got created.....");

	}

}
