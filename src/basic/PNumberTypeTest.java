package basic;

public class PNumberTypeTest {

	public static void main(String[] args) {
		/*
		 * 1. 자바 자료형의 분류를 크게 2가지와 각 큰 타입의
		 * 세부 자료형을 기술하세요.
		 * 
		 * 답 : p-type: 수치형(정수)(byte, short, integer, long), 수치형(실수)(float, double), 문자형(char), 논리형(boolean)
		 * 
		 *     r-type: 객체형(reference)
		 * 
		 * 2.다음 코딩을 실행시 결과를 예측 해보세요
		 * short sh = 32790
		 * 
		 * cannot conver int to short
		 * 
		 * 3.int 타입의 값 범위를 적어보세요.
		 * 
		 * - 9223372036854775808 ~ 9223372036854775807
		 * 
		 * 4.float 과 double 형 타입을 하나씩 초기화 해보세요.
		 * 
		 * float f=1.0F; double b=2.0;
		 * 
		 * 5.아래 코드에서 에러가 발생하는 부분과 그 이유를 기술하고 수정 해보세요
		 * 1. byte by = 20; short sh = by;
		 * 2. long lo = 20L; float fl = lo;
		 * 3. float f= 20; long lo2 = f;
		 * 
		 * (1) 오류없음
		 * (2) 오류없음
		 * (3) lo2가 f보다 큰 타입이기 때문에 타임캐스팅을 해서 lo2=(float)f라고 해야됨
		 * 
		 * 6. 여러분이 과수원을 한다고 생각하시고 하루에 생산되는 과일의 평균을
		 * 구하느 로직을 작성합니다. 과일로는 사과, 배, 오렌지가 있고
		 * 각각 3, 5, 9 개씩 하루에 생산 됩니다.
		 * 하루를 기준으로 시간당 몇개가 생산되는지를 출력하세요
		 * 단 아래의 조건을 만족 시키세요.
		 * a.반드시 한번의 casting 을 사용하세요.
		 * b.결과 값은 float 타입으로 선언된 변수에 담고 출력시키세요
		 * c.반드시 한번의 리터럴을 사용하세요.
		 * d.위 문제는 Fruit.java 파일을 생성후 main() 내부에 정의하세요.
		 */
		
		
		// x=3 y=5 z=9 하루 24시간, 시간당 구해야됨. 수식을 만들어보자.
	}

}
