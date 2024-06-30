package fileHandling;

import java.io.*;

public class _FileBufferedReaderForFile {

	public static void main(String[] args) {
		
		try {
			
			File f = new File("D:\\filehandling\\bufferout.txt");
			
			FileReader fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr);
			
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
