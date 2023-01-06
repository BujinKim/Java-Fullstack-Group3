package ioEx;

import java.io.FileInputStream;
import 

public class FileInputEx2 {

	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream(args[0]);
			
			int data = 0;
			
			while((data = fis.read()) != -1) {
				char c = (char)fis.read();
				System.out.println(c);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
