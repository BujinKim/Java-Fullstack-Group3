package basic;

public class CharExam {

	public static void main(String[] args) {
		char c = 'a'; // 싱글쿼트로 문자 하나를 표현하면 됩니다. "ab"이런식으로 문자열으로 할때는 더블쿼트로, 타입은 string
		
		System.out.println(++c + 1);
		
		
		//char의 기본값은 \u0000
		char c2 = '\u0000'; // 항상 싱글 쿼트
		System.out.println(c2); // 아무것도 나오지 않음 (99는 위의 값)
		
		c2 = '김';
		System.out.println((int)c2);
		
		c2 = 44608; // '김'의 10진수 값
		System.out.println(c2);
		
		short s = (short)c2;  // (short)를 빼면 에러가 나는 이유는 char에는 음수값이 없음.
		
		System.out.println(Integer.toHexString(44608)); // Hex는 16진수
		
		//위 16 진수값을 유니코드로 변수 myLastName에 담아보세요.
		
		char myLastName = '\uae40';
		System.out.println(myLastName);
		
		//자바의 escape 문자열..
		//escape란 출력시 특정 기호를 사용하여 탭, 라인변경, 줄바꿈 등을 할 수 있는 문자입니다.
		//사용법은 반드시 문자열 내에 \(escape 문자)를 사용해야합니다.
		//n(라인변경), t(tab), /n/r(엔터), //(역슬래시), ' (싱글쿼트)
		
		System.out.print("1\n\r\t\'" + "A" + "\'\\");
		System.out.print("2");
		
		if('a' > 'b') {
			System.out.println("a가 b 보다 큽니다.");
		}
		
		
		
	}

}
