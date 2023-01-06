package basic;

public class ArrayExam {

	public static void main(String[] args) {
		/*
		 * 자바배열 (Array) : 자바에서는 String, 배열은 모두 P type 이 아닌 R type 입니다.
		 * 즉 객체란 뜻입니다.
		 * 때문에 지금껏 알고있던 P type에 대한 개념과는 다르니 잘 이해 바랍니다.
		 * 배열을 생성할 때는 반드시 new 라는 키워드를 이용해서 생성해야합니다.
		 * 또 배열은 객체라서 해당 객체를 Ref 하는 변수 (reference 변수)를 반드시
		 * 이용해서 뭔가를 해야합니다. 즉 ref를 잃어버린 배열객체는 이후 더이상 사용 불가능
		 * 하기 때문입니다. (몹쓸객체가 됨) * ref를 잃어버린 것은 몹쓸 객체 *
		 * !! 객체들은 동적임 (컴파일 이후에 생성됨; 프로그램 실행이후-> 즉 클래스 로드 이후-> static 초기화 -> 메인 호출!) !! 되게 중요하니 알아두자.
		 */
		
//		System.out.println(new int[] {1,2,3}); //이 주석은 객체의 메모리 주솟값이 나옴.
		//배열 생성식 (1), 길이만 준다.
		int[] arr = new int[3]; //자바에선 절대 빈배열(length)이 없는 배열은 생성불가.
								//따라서 반드시 length는 줘야함.
		//생성된 배열객체의 hashcode 출력.
		System.out.println(arr.length); // 배열은 속성 하나밖에 존재하지 않음.
		//배열은 값을 주지않고 생성하면(기본배열객체) 자동으로 기본값으로 초기화합니다.(0으로 초기화) / String일 경우 null로 초기화
		for (int a : arr)
			System.out.println(a);
		//배열객체는 모든 타입(P and R type)을 배열로 생성할 수 있습니다.
		
		
		
		//배열생성식 (2), 값을 주고 초기화한다.
		String strArr[] = {"Hello", "World", "Java"};
		//strArr[] = new int[3]; 이미 타입이 지정됐기 때문에 다른타입으로 생성 불가.
		for(String str : strArr)
			System.out.println(str);
		System.out.println(strArr); // strArr의 해쉬코드
		
		
		//배열생성식 (3), 위 2개를 합친 형태.. length만 빼준다.
		char[] stars = new char[] {'a', 'b', 'c'};
		
		//위 str 배열을 버리고 새로운 객체를 생성한다.
		strArr = new String[3];
		System.out.println(strArr);
		for(String str : strArr)
			System.out.println(str);
		
		char[] mych = new char[2]; //char 2개의 length의 배열 생성.
		//값은 있을까? 있음... '\u0000'
		mych[0] = 'a';
		mych[1] = 'b';
		//mych[2] = 'c';
		for(int i = 0; i<mych.length; i++) {
			System.out.println(mych[i]);
		}
		
	}

}
