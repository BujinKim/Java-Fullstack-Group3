package langEx;

class Value{
	
	int value;
	
	public Value(int value) {
		this.value = value;
	}
}

class Person{
	long id;//주민번호 또는 사회보장번호 필드.
	
	public Person(long id) {
		this.id = id;
	}
	
	//상속받은 equals() 오버라이드하기..
	@Override
	public boolean equals(Object obj) {
		//두 객체의 특정 값이 같은지 비교해보자..
		if(obj != null && obj instanceof Person) {
			   return id == ((Person)obj).id;    
		}else {
			return false;
		}
		
	}
}
public class ObjectExam {
	
	//toString() 오버라이드
	public String toString() {
		return "이건 오버라이드 된 내용이 나옵니다."; // toString() 오버라이드
	}

	public static void main(String[] args) {
		
		Person p1 = new Person(12345678);
		Person p2 = new Person(12345678);
		
		if(p1 == p2) { // 쉽게 풀면 p1과 p2가 같은사람이냐는 뜻
			System.out.println("같은 사람입니다.");
		}else {
			System.out.println("다른 사람입니다.");
		}
		
		
		if(p1.equals(p2)) {// 둘다 12345678의 값을 가지고 있음.	
			System.out.println("다른 사람이지만 주민번호는 같음");
		}else {
			System.out.println("다른 사람이고 주민번호도 다름");
		}
		
		
		
		
		
		
		
		//equals() : 파라미터의 객체와 같은 객체인지를 판별하여 true/false를 리턴하는 메서드
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1 과 v2 는 같다.");
		}else {
			System.out.println("v1 과 v2 는 다르다.");
		} // 결과 : v1 과 v2 는 다르다. 왜냐하면 v1과 v2는 서로 다른 instance이기 때문.
		
		v1 = v2; //v1과 v2를 같은 값으로 대입.
		
		if(v1.equals(v2)) {
			System.out.println("v1 과 v2 는 같다.");
		}else {
			System.out.println("v1 과 v2 는 다르다.");
		} // 결과 : v1 과 v2 는 같다.
		
		
		
		
		
		
		
		
		
		
		//Object의 상속된 toString() 보기
		ObjectExam objex = new ObjectExam();
		
		System.out.println(objex.toString());
		
		System.out.println(objex.getClass().getName());//상속된 getClass() 호출..
		
		System.out.println(objex.getClass().getName() + "@" + Integer.toHexString(objex.hashCode()));
		
		
		
		
	}

}
