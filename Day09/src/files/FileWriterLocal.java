package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterLocal {

	public static void main(String[] args) throws IOException {
		File folder = new File("My Folder");
		File test = new File("test.txt");
		new FileOutputStream(test).write("This is a test file".getBytes());
		
		if (!folder.exists())
			folder.mkdir();
		else {
			File file = new File(folder, "data.txt");
			System.out.println("absolute path: " +file.getAbsolutePath());
			System.out.println("absolute path: " +file.getParent());
			//file
			
			FileOutputStream fos = new FileOutputStream(file);
			fos.write("This is a file written by Java".getBytes());
			
			fos.close();
		}
	}

}
