package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file >> WookBook >> Sheets >> Rows >> Cells

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {

		// opening or creating file in writing mode
		FileOutputStream file = new FileOutputStream(
				System.getProperty("user.dir") + "\\testdata\\myfile_dynamic.xlsx");

		// creating new workbook in the file
		XSSFWorkbook workbook = new XSSFWorkbook();

		// creating sheet in the workbook
		XSSFSheet sheet = workbook.createSheet("DynamicData");

		// getting data from user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many rows....");
		int noOfrows = sc.nextInt();
		System.out.println("enter how many cells....");
		int noOfcells = sc.nextInt();
		
		for(int r = 0;r<=noOfrows;r++)
		{
			
			XSSFRow currentRow = sheet.createRow(r);
			
			for(int c = 0;c<noOfcells;c++)
			{
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}

		//attaching workbook to the file
		workbook.write(file);
		
		//closing the workbook
		workbook.close();
		
		//closing the file
		file.close();
		
		System.out.println("file is created....");
		
	}

}
