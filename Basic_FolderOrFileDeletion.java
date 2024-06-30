package fileHandling;

public class Basic_FolderOrFileDeletion {

	public static void main(String[] args) {
		
		java.io.File f = new java.io.File("D:\\nandhaclg\\files\\sample");
		
		f.delete();
		
		System.out.println("Success...");
	}
}
