package fileHandling;

import java.io.*;

public class _FileReaderDemo {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("D:\\filehandling\\writer.txt");
			
			FileReader fr = new FileReader(f);
			
			int x;
			
			while((x=fr.read())!=-1) {
				
				char ch = (char)x;
				
				System.out.print(ch);
			}
			
			fr.close();
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
