package fileHandling;

import java.io.*;

public class _FileFilterReaderDemo {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("D:\\filehandling\\filterout.txt");
			
			FileReader fr = new FileReader(f);
			
			FilterReader br = new FilterReader(fr) { };
			
			int x;
			
			while((x=br.read())!=-1) {
				
				char ch = (char)x;
				
				System.out.print(ch);
			}
			
			br.close();
			
			fr.close();
			
		} catch (Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
