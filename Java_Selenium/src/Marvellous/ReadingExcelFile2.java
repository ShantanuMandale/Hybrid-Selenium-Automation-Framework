//Read the data from excel file and paste it in another excel file Assignment

package Marvellous;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFile2 {

	public static void main(String[] args) throws Exception {
		
		File src1 = new File("C:\\Users\\Dell\\Downloads\\Sample Excel file.xlsx");
		File src2 = new File("C:\\Users\\Dell\\Downloads\\file_example_XLSX_50.xlsx");
		
		FileInputStream fis1 = new FileInputStream(src1);
		FileInputStream fis2 = new FileInputStream(src2);
		
	    XSSFWorkbook wb1 = new XSSFWorkbook(fis1);
	    XSSFWorkbook wb2 = new XSSFWorkbook(fis2);
	    
	    XSSFSheet sh1 = wb1.getSheet("Sheet1");
	    XSSFSheet sh2 = wb2.getSheet("Sheet2");
	    
	    //System.out.println(sh1.getRow(16).getCell(0).getStringCellValue());
	    System.out.println(sh2.getRow(8).getCell(1).getStringCellValue());
	    
	    sh2.getRow(8).getCell(1).setCellValue(sh1.getRow(16).getCell(0).getStringCellValue());
	    System.out.println(sh2.getRow(8).getCell(1).getStringCellValue());
	}

}