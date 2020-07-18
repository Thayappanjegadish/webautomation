package components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven {

	
	public static void main (String[] args) throws IOException {
		
		
		
		FileInputStream fis = new FileInputStream("D:\\Automationscriptdatas.xlsx");
		XSSFWorkbook obj = new XSSFWorkbook(fis);
		
		int sheets = obj.getNumberOfSheets();
		for (int i= 0;i<sheets;i++) {
			if(obj.getSheetName(i).equalsIgnoreCase("sheet1"));
			{
				XSSFSheet sheet = obj.getSheetAt(i);
				
				Iterator<Row> rows = sheet.iterator();
				rows.next();
			}
		}
	}
}
