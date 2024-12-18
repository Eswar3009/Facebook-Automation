package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	public static WebDriver driver;
	 public static Actions a;
	 public static File f;
	 
		public static void launch() {
			 driver=new ChromeDriver();
			 
		}
		public static void toGetUrl(String url) {
			driver.get(url);

		}
		public static void toMaximize() {
			driver.manage().window().maximize();

		}
		public static void toGetCurrentUrl() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
	 }
		
		public static void toGetTitle() {
			String title = driver.getTitle();
			System.out.println(title);

		}
		public static void fill(WebElement element,String usertext ) {
			element.sendKeys(usertext);

		}
		
		public static void toClick(WebElement element) {
			element.click();

		}
		public static void toQuit() {
			driver.quit();

		}
		public static void toGetText(WebElement element ) {
			String text = element.getText();
			System.out.println(text);
			
			}
		
		public static void toGetAttribute(WebElement element,String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);

		}
		
		public static void moveToElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).perform();

		}
		
		public static void dragAndDrop(WebElement src, WebElement target) {
			a.dragAndDrop(src, target).perform();

		}
		
		public static void doubleclick(WebElement element) {
	a.doubleClick(element).perform();		

		}
		
		public static void contextClick(WebElement element) {
			a.contextClick(element).perform();

		}
		
		public static void keyup(WebElement element) {
			

		}
		
		private void readFile(String path) throws FileNotFoundException{	
	    f=new File(path);
	    FileInputStream fin=new FileInputStream(f);
		}
		
		private void writeFile(String path) throws FileNotFoundException {
			f=new File(path);
			FileOutputStream fos=new FileOutputStream(f);
		}
		
		public static String excelRead(String SheetName,int RowNo, int CellNo) throws IOException {
			
			File f=new File("D:\\\\eclipse\\\\Cucumber\\\\Excel\\\\Fb det.xlsx");
			FileInputStream fin=new FileInputStream(f);
			Workbook book=new XSSFWorkbook(fin);
			Sheet s = book.getSheet(SheetName);
			Row r = s.getRow(RowNo);
			Cell c = r.getCell(CellNo);
		    int type = c.getCellType();
		    String name="";
		    
		 if (type==1) {
			 name = c.getStringCellValue();
			System.out.println(name);
		}
		 else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim=new SimpleDateFormat("dd/MM/yy");
			 name = sim.format(d);
			System.out.println(name);
			
		}
		 else {
			double da = c.getNumericCellValue();
			long l=(long)da;
			 name = String.valueOf(l);
			System.out.println(name);
			
		}
		return name;
		}
}

