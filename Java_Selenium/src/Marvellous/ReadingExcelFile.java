package Marvellous;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcelFile {

	public static void main(String[] args) throws Exception {
		
		// Specify the location of excel file same way we have read properties file
		File src = new File("C:\\Users\\Dell\\Downloads\\Sample Excel file.xlsx");
		System.out.println("File exists " +src.exists());
		
		// Load the file
		FileInputStream fis = new FileInputStream(src);
		
		//Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Load Worksheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//Print the loades sheet name
		System.out.println(sh.getSheetName());
		
		// want to print data from excel sheet  (print pakistan)
		System.out.println(sh.getRow(32).getCell(0).getStringCellValue());  //getRow(Row index number).get(column index no.).getStringCellValue()- its is string type so
		
		//print pakistan with rank
		System.out.println("Country:- "+sh.getRow(32).getCell(0).getStringCellValue()+ " And " +" Rank:- " +sh.getRow(32).getCell(2).getStringCellValue());
		
		//for printing number use getNumericCellValue()
		System.out.println((int)sh.getRow(38).getCell(3).getNumericCellValue());  
	   
		//for printing float use getNumericCellValue()
		System.out.println(sh.getRow(33).getCell(3).getNumericCellValue());  
		
		//if we want to print total number of rows 1st way
		System.out.println("Total number of Rows: "+sh.getPhysicalNumberOfRows());
		
		//if we want to print total number of rows 2nd way
		System.out.println("Total number of Rows: "+(sh.getLastRowNum()+1));
		
		//if we want to print total number of columns
		System.out.println("Total number of Col: "+sh.getRow(1).getPhysicalNumberOfCells());
		
		//Real time implementation
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//peak any name from excel file and fill it into username e.g iran
	    String Username = sh.getRow(40).getCell(0).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(Username); //can put (sh.getRow(40).getCell(0).getStringCellValue()); also
		

	}

}
