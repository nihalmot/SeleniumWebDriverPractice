package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel file >> WookBook >> Sheets >> Rows >> Cells

public class ReadingDataFromExcel {

	public static void main(String args[]) throws IOException
	{
		//opening file in reading mode
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		//opening workbook from excel file
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		//opening particular sheet from workbook
		XSSFSheet sheet = workbook.getSheet("sheet1");  //XSSFSheet sheet = workbook.getSheetAt(0);
		
		//reading data from each row and each cells
		
		//getting row count
		int totalRows = sheet.getLastRowNum();  //returns last row of the sheet = no. of rows present
		
		//getting no. of cells in a row
		int totalCells = sheet.getRow(1).getLastCellNum();  //returns total number of cells in a row
		
		System.out.println("number of rows : "+totalRows);  //rows will be counted from 0
		System.out.println("number of cells : "+totalCells);  //cells will be counted from 1
		
		for(int r = 0;r <= totalRows;r++)
		{
			
			XSSFRow currentRow = sheet.getRow(r);  //returns current row from the sheet
			
			for(int c = 0;c < totalCells;c++)
			{
				XSSFCell cell = currentRow.getCell(c);  //returns cell from current row
			    System.out.print(cell.toString()+"\t");  //returns data from cell
			}
			System.out.println();
		}
		
		workbook.close();  //closing the workbook once our job is done
		file.close();  //closing the file once our job is done
		
	}
}
