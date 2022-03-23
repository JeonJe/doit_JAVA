package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileInputStream fis = null;
		
		try (FileInputStream fis = new FileInputStream("a.txt"); )  {
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} 
		System.out.println("end");
	}

}
