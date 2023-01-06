package langEx;

public class StringBuilderEx {

	public static void main (String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		sb = sb.append(new String(" Java World... 졸려도 일어나세요!!").toCharArray());
		System.out.println(sb.capacity());
		System.out.println(sb.delete(0, 6)); // Hello만 지움
		sb.ensureCapacity(200);
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		
		System.out.println(sb);
		
		char [] addMsg = "기지개 좀 켜고 ".toCharArray();
		
		//18번 index
		
		//sb 결과 내용에 insert를 이용해서 위 addMsg를 일어나세요 앞에 추가해보세요.
		sb.insert(sb.indexOf("일어"), addMsg); // 문자열 중간에 값을 넣을 수 있음
		System.out.println(sb);
		
		sb.setCharAt(0, 'k');//replace 같은 역할
		System.out.println(sb);
		
		//sb 객체를 그대로 String 객체로 변환해보세요.
		
		sb.toString();
		System.out.println(sb.toString());
		
		
		
		
	}
	
}
