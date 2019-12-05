package files;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadLocal {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fileInputStream = new FileInputStream("test.txt");
		
		int data = fileInputStream.read();
		//file
		
		while((data!=-1)) {
			System.out.print((char)data);
			data = fileInputStream.read();
		}
		fileInputStream.close();
	}

}
