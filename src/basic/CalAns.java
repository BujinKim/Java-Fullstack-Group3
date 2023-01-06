package basic;
import java.io.IOException;

public class CalAns {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("숫자나 문자 하나를 입력해보세요.");
		
		//첫수 입력받기
		int fir =System.in.read()-48;		
		//엔터를 처리하기 위한 코드입니다.
		System.in.read();
		System.in.read();

		//두번째 수 입력받기
		int sec = System.in.read()-48;
		//엔터를 처리하기 위한 코드입니다.
		System.in.read();
		System.in.read();
		
		//+입력받기
		char yon = (char)System.in.read();
		
		//결과 변수에 + 결과 담기
		int result = fir + sec;
		
		System.out.println("" + fir + yon + sec + " = " + result);
	}

}
