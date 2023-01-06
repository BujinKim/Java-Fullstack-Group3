package ioEx;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.Reader;

public class FileReaderExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// D:\Full_Stack_Work\myjava\src\basic\ArrayExam.java
		
		//PrintWriter 이용해서 파일을 복사해서 ArrayExam.java.back 이라는 파일을 생성시켜보세요.

		File file = 
				new File("D:\\Full_Stack_Work\\myjava\\src\\basic\\ArrayExam.java");

		FileReader fr = null;
		BufferedReader br = null;
		LineNumberReader lr = null;
		PrintWriter pw = null;
		
		
		
		String msg = null;
		int readData;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			lr = new LineNumberReader(br);
			pw = new PrintWriter("ArrayExam.java.back");
			String msg2;// = null;
			int i = 1;
			while ((msg2 = br.readLine()) != null) {
				System.out.print(lr.getLineNumber() + " ");
				System.out.println(msg2);
				pw.println(msg2);
				
		//		pw.flush();
				
			
			}
			pw.close();
		} catch (Exception e) {
			
		}
		
		
		
//		try {
//			fr = new FileReader(file);
//
//			// 순수하게 read() 만 이용해서 읽기.
//			while ((readData = fr.read()) != -1){
//				System.out.print((char)readData);
//			}
//
//			fr.close();
//		} catch (Exception e) {
//			// TODO: handle exception
//		}

	}

}
