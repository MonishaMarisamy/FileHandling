package fileHandling;

import java.io.*;

public class FileBufferedOutputStreamDemo {

	public static void main(String[] str) {
		
		try {
			
			File f = new File("D:\\filehandling\\bufferout.txt");
			
			FileOutputStream fout = new FileOutputStream(f);
			
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			
			String msg = "Buffered output stream";
			
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
