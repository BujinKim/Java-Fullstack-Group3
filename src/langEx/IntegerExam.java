package langEx;

public class IntegerExam {

	public static void main(String[] args) {
		
		/*
		 * Wrapper 클래스 : 자바의 모든 Ptype 의 정보를 관리하는 클래스 
		 */
		
		int i = Integer.valueOf(10) + 1;
		
		
		new Integer("10");
		
		
		System.out.println(Integer.compare(11, 12)); // 값이 같은경우는 0, 왼쪽이 더크면 양수, 오른쪽이 더 크면 음수
		
		String s = "10.0"; // 실수이기 때문에 parseInt가 아닌 parseDouble을 불러야함.
		Double.parseDouble(s);
		
		System.out.println(Integer.toBinaryString(i)); // 2진수
		System.out.println(Integer.toHexString(i)); // 16진수
		System.out.println(Integer.toOctalString(i)); // 8진수
		System.out.println(Integer.toString(i)); // String으로 변환
		
	}

}
