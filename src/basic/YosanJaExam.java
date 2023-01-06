package basic;

public class YosanJaExam {

	public static void main(String[] args) { // 자바에선 ===은 없다.
		/*
		연산자(최(.,[],new),(), 선행(++,--), 단항(!,~,+,-,typeof,), 
		산술(*,/,%,+,-),쉬프트(<<,>>,>>>),관계(==,!=, ===, !==, <,>,...), 
		비트(&,|), 논리(&,|,&&,||), 삼항(조건 ?v1 : v2), 
		배정대입(+=,..),후행(++,--))
		*/
				
		boolean res = 4 + 5 > 2 - 1 *7 && (12 & 3 * 2) > 7 || -2 != 2;
		//			    9        -5	   &&     (4)      > 7 ||
		//		true	   &&          false   			   ||   true
		//				false				   			   ||   true ---> 결과는 true
		System.out.println(res);
		System.out.println(12 & 6);
		System.out.println(12 | 6);
		
		//"~" : 비트를 반전시키라는 뜻. (단항 연산자이다)	
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(~1));
		
		//비트이동연산자.. <<?(부호비트는 두고 모두 좌측으로 ? 만큼 이동, 새로운 비트는 0으로 채운다. [밀린 비트는 버려진다.])
		//			  >>?(부호비트는 두고 모두 우측으로 ? 만큼 이동, 새로운 비트는 0으로 채운다.)
		//			 >>>?(우측만 존재함.. 부호비트부터 다 이동하라.. 이동된 비트는 0으로 채움.)
		
		System.out.println(Integer.toBinaryString(-1<<2)); // 00000001 (1)에서 00000100 (4)으로 변경, 1을 음수로 바꿔서도 해보자.
		System.out.println(Integer.toBinaryString(-1>>3)); // 00000001(1)에서 00000000(0)으로 변경 
		System.out.println(Integer.toBinaryString(-1>>>3)); //  거의 쓸일 없어서 스킵해도 ㄱㅊ
		
		String mi = "hi";
		String mi2 = new String("hi2");
		
		if (mi == mi2){ // 두 객체가 같냐는 연산자 (Ref가 같은지.. 즉, 같은 객체인지)
			System.out.println("같은 객체입니다.");
		}else{
			System.out.println("다른 객체입니다.");
		}
		
		//두 문자열 객체의 값을 비교할 때는 문자열.equals(비교문자열) 메서드를
		//이용해야 합니다.
		
		if(mi.equals(mi2) ) {//문자열 객체의 값이 같은지를 확인.. 같으면 true 리턴
			System.out.println("문자열 값이 같습니다.");
		}else {
			System.out.println("문자열 값이 다릅니다.");
		}
	}

}
