package basic;
import java.util.Arrays;

public class ForExam {

	public static void main(String[] args) {//run -> run configurations -> arguments 탭에서 값 줄 수 있음
		//main() 의 파라미터인 String[] 에 값을 주고 시작해봅니다.
		
		for(int i = 0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		//향상된 for.. jdk1.5부터 지원됨... 특정 그룹데이터의 전체를 다 루프할 때 요긴함
		//자바스크립트의 for in과 거의 유사함.
		for(String str : args) // = String str = args[i];
			System.out.println(str);
		
		
		for(char ch = 'a'; ch <='z'; ch++) {
			System.out.println(ch);
		}
		
		//위와 똑같이 나오게 int를 이용해서 해보기.
		for(int i = 65; i<=90; i++) {
			System.out.println((char)i);
		}
		
		//구구단 전체 돌기.
		//자바에서만 존재 하는 Label loop
		//loop 에 이름(Label)을 주고 호출하며 제어하는 방법
		outer : for(int i = 2; i<=9; i++) {
//			if (i % 2 == 0)  //
//				continue; // 짝수단은 건너뛰기
			System.out.println(i + "단 시작");
			inner : for (int j = 1; j<=9; j++) {
				if (i % 2 == 0)
					continue outer;
				
				int sum = i * j;
				System.out.println(i + " * " + j + " = " + sum);
			}
			System.out.println(i + "단 끝");
			}
		//중첩 for 에서 초기화 변수를 재활용 할때 발생하는 로직을 작성해봅니다.
		for(char a = 'A'; a<='Z'; a++) {
			for (char b = a; b<='Z'; b++) {
				System.out.println(b);
			}
			System.out.println();
		}
		
		//FindNum.java
		//두 수를 입력을 받으세요 (값의 크기는 상관없음.. 100, 4, 4, 100)
		//두수의 차의 (100, 4를 받았을 경우, 차이는 96입니다.)
		//이 차이의 누적 합을 구해서 출력하세요.
	}
		
		
//		int[] intArr = {12, 30, 27, 3, 50, 107, 505};//자바 배열.
//		
//		Arrays.sort(intArr);
//		
//		for(int i=0; i<intArr.length; i++) {
//			System.out.println(intArr[i]);
//		}

}


