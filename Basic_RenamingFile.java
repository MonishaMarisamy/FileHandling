package fileHandling;

import java.io.File;

public class Basic_RenamingFile {

	public static void main(String[] args) {
		
		java.io.File f1 = new java.io.File("D:\\nandhaclg\\files\\Billing.xlsx");
		
		java.io.File f2 = new java.io.File("D:\\nandhaclg\\files\\Billing Information.xlsx");
		
		f1.renameTo(f2);
		
		System.out.println("Success...");
	}
}
