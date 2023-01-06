package basic;

public class Fruit {

	public static void main(String[] args) {
		/* 6. 여러분이 과수원을 한다고 생각하시고 하루에 생산되는 과일의 평균을
		 * 구하느 로직을 작성합니다. 과일로는 사과, 배, 오렌지가 있고
		 * 각각 3, 5, 9 개씩 하루에 생산 됩니다.
		 * 하루를 기준으로 시간당 몇개가 생산되는지를 출력하세요
		 * 단 아래의 조건을 만족 시키세요.
		 * a.반드시 한번의 casting 을 사용하세요.
		 * b.결과 값은 float 타입으로 선언된 변수에 담고 출력시키세요
		 * c.반드시 한번의 리터럴을 사용하세요.
		 * d.위 문제는 Fruit.java 파일을 생성후 main() 내부에 정의하세요.
		 */
		
		//byte는 정수 연산할 때 쓰이지 않음. because, 
		
		int apple = 3; //정수
		int pear = 5; //정수
		int orange = 9; //정수
		
		int sum = apple + pear + orange; // 얘도 정수
	//	float avg = (float) (sum / 24.0); // 이것도 가능하고 아래도 가능.
		float avg = (float) sum / 24.0F; //float타입으로 값을 도출하니까 float으로 ㄱㄱ. 캐스팅과 리터럴
		System.out.println(avg);
		
	}

}
