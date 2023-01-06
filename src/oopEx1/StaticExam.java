package oopEx1;

public class StaticExam {
	
	static final int a;//공유 변수(상수) 선언..
	int b; // 멤버필드
	
	static {
		a = 10;
		System.out.println("static 블락 호출됨..");
		System.out.println("static 의 값 : " + a);
	}
	
	void showB() { // none static이므로 객체 소유, instance가 있어야 부를수 있음.
		System.out.println("멤버필드 b 값 " + this.b);
	}
	
	static void showA() { // static이 있으면 CLS(class) 소유
		
	}
	
	public static void main(String[] args) {
//		a = 10;
		
		showA(); // 메인이 스태틱중 제일 나중에 호출이 되어서 showA()만 써도 가능.
		new StaticExam().showB(); //객체가 반드시 있어야 호출이 되므로 new StaticExam().을 붙여야함.
		System.out.println("메인 메서드 호출됨..");
		
	}

}
