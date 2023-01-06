package basic;
import java.io.IOException;

public class Cal {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("숫자나 문자 하나를 입력해보세요.");
		char inputF =(char) System.in.read();
		
		System.out.println(inputF);
		
		//엔터를 처리하기 위한 코드입니다.
		System.in.read();
		System.in.read();
		//숫자를 입력 받을겁니다.
		
		char plus = (char) System.in.read();
		
		System.out.println(plus);
		System.in.read();
		System.in.read();
		
		char inputS =(char) System.in.read();
		
		System.out.println(inputS);
		System.in.read();
		System.in.read();
		
		int digit = System.in.read() - 48;
		System.out.println(digit);
		System.in.read();
		System.in.read();
		
		int sum = (char) (inputF - 48) + (inputS - 48);
		System.out.println("값은 " + sum + "입니다.");

	}

}
