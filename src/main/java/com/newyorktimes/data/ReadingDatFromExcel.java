package com.newyorktimes.data;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File---> Workbook----> sheets----> Rows----> Cells
public class ReadingDatFromExcel {
	//throws remove - getting error if we remove throws
	public void dataread()throws IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\testdata\\testdata.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");   
		int totalRows= sheet.getLastRowNum();
		int totalCells= sheet.getRow(1).getLastCellNum();
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow currentRow= sheet.getRow(r);
			for(int c=0; c<totalCells; c++)
			{
				XSSFCell cell= currentRow.getCell(c);
			}
		}
		workbook.close();
		file.close();
	}
}
