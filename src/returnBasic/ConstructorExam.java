package returnBasic;
//복습을 해 봅시다.
//부모 클래스가 될 기본 클래스 정의해봅니다.
class parent{//extends Object는 기본적으로 생략되어있음
	
	private String myName;//이름멤버변수
	private int age;//나이멤버변수..여기까지가 필드
	
	public parent(String myName, int age) {//기본생성자.. 상위에는 생략되어있지만 Object를 기본적으로 부모객체를 두고있음
		super();//Object의 기본생성자 호출..
		this.age = age;
		this.myName = myName;
	}
	
	public void myJob() {
		System.out.println("Parent 클래스의 직업은 Fisher");
	}
	

}
class Son extends parent {//parent를 부모객체로 두고있음
	private String myjob;
	
	public Son() {
		super(null,0);//Parent의 기본생성자 호출..
	}
	
	public void myJob() {
		System.out.println("Son 클래스의 직업은 자바 프로그래머");
	}
	
	
}
class userEmail{
	
	private String email;
	
	
	
	public userEmail(String email) {
		this.email = email;
	}
	
	//email 값을 리턴하는 getter 만들기.
	public String getEmail() {
		return email;
	}
}
public class ConstructorExam {

	userEmail email;
	
	public static void main(String[] args) {
		
		Son son = new Son();// Son 기본 인스턴스 생성
		Object object = son;//Ref 를 복사해서 넘겨준다.
		parent parent = (parent) object;//object Ref하는 참조값을 parent에게 넘겨준다.
		parent p2 = new Son();
		
//		parent = null;
//		son = null; // 이 코드와 아랫 코드가 붙어야지 parent까지 몹쓸객체가 되는것.
//		object = null; 
//		p2 = null; // 이 친구가 몹쓸객체 -> 참조를 안하고있음
		
		System.out.println(object.equals(son));
		System.out.println(parent.equals(p2));
		
		((parent)object).myJob(); // Son이 Override함
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if (parent == p2) {
//			//son과 object는 rtype.. rtype에서 == 연산자를 쓰면 "같은 객체니?"라고 묻는것.
//			//즉, "reference 값이 같니?"
//			System.out.println("두 객체는 같은 객체입니다.0");
//			System.out.println(son);
//			System.out.println(object);
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		System.out.println("이메일을 입력해주세요.");
//		String email = "tjsdlf0217@naver.com";
//		ConstructorExam play = new ConstructorExam();
//		play.email = new userEmail(email);
//		System.out.println(play.email.getEmail());
	}

}
