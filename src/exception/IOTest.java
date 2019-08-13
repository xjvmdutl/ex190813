package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class IOTest {

	public static void main(String[] args) {
		FileInputStream fis= null;
		
		try {
			fis=new FileInputStream("hello.txt");//있다고 가정하고 넣지만 실제로 없다
			fis.read();
			
			/*
			 * if(fis!= null) fis.close();
			 */
			
		}catch(FileNotFoundException e) {
			System.out.println("file not found");
		}catch(IOException e) {
			System.out.println("io error");
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				System.out.println("아");
				e.printStackTrace();
			}
		}
	}

}
