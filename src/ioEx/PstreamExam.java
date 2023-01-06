package ioEx;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PstreamExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f = new File("message.log");
		FileOutputStream fos = null;
		PrintStream ps = null;
		
		Scanner sc = new Scanner(System.in);
		
		//사용자의 입력값..
		String input = null;
		
		
		try {
			//File 에 Append 가 가능하도록 fos 생성..
			fos = new FileOutputStream(f, true);
			//PrintStream 의 메서드를 사용하기 위해 객체 생성
			ps = new PrintStream(fos);
			
			System.out.println("ㅎㅇ, 메세지 입력 ㄱㄱ. 끝낼거임? 그럼 q 입력하셈");
			
			while(true) {
				System.out.print("msg : ");
				input = sc.nextLine();
				if(input.equalsIgnoreCase("q")) {
					System.out.println("아디다스...");
					System.exit(0);
					break;
				}
				
				ps.println(input);
				ps.flush();
			}
			
			ps.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("xxxxxx");
		
	}

}
