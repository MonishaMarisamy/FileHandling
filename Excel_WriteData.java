package fileHandling;

import java.io.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_WriteData {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("C:\\Users\\mmoni\\OneDrive\\Documents\\Sheet1.xlsx");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			
			
			XSSFWorkbook xb = new XSSFWorkbook();
			
			XSSFSheet xs = xb.createSheet("Sheet1");
			
			XSSFRow r = xs.createRow(5);
			
			XSSFCell c = r.createCell(5);
			
			c.setCellValue("abc");
			
			
			xb.write(fout);
			
			fout.close();
			
			System.out.println("Data Added Successfully ...");
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
