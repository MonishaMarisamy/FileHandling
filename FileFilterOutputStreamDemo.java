package fileHandling;

import java.io.*;

public class FileFilterOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("D:\\filehandling\\filterout.txt");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			FilterOutputStream bout = new FilterOutputStream(fout);
			
			String msg = "Filtered output stream";
			
			byte[] by = msg.getBytes();
			
			bout.write(by);
			
			bout.close();
			
			fout.close();
			
			System.out.println("Success ...");
			
		}catch(Exception obj) {
			
			obj.printStackTrace();
		}
	}
}
