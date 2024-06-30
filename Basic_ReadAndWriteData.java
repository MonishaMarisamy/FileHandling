package fileHandling;

import java.io.*;

public class Basic_ReadAndWriteData {

	public static void main(String[] args) {
		
		try {
			
			File source = new File("E:\\art\\dog.jpg");
			
			File destination = new File("D:\\nandhaclg\\files\\sample2.jpg");
			
			FileInputStream fin = new FileInputStream(source);
			
			FileOutputStream fout = new FileOutputStream(destination);
			
			int x;
			
			while((x=fin.read())!=-1) {
				
				fout.write(x);
			}
			
			fout.close();
			
			fin.close();
			
			System.out.println("Success...");
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
