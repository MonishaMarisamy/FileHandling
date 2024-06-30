package fileHandling;

import java.io.File;

public class Basic_ListOfFiles {

	public static void main(String[] args) {
		
		java.io.File f = new java.io.File("D:\\nandhaclg\\files\\");
		
		String[] st = f.list();
		
		for(int i=0; i<st.length; i++) {
			
			System.out.println(st[i]);
		}
	}
}
