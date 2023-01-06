package oopEx1;

public class Starcraft {

	public static void main(String[] args) throws InterruptedException {
		
		//Terran t = new Terran("이건 테란입니다."); // Terran은 추상이기에 자신의 인스턴스를 생성하지 못한다.
		
		//테란 유닛은 실체가 없지만, 객체 테스트 용으로 만들어봄
		//Terran terran = new Terran();
		
		// 마린 클래스를 정의했기 때문에 객체를 만들고 싶은 만큼 생성할 수 있습니다.
		// 객체 생성 코드는 ClassName ref변수 = new Class(); 처럼 할 수 있습니다.
		
		/*-------------------------------------------------------------------
		 * 객체지향의 다형성(Polymorphism) : 다형성이란, "상속" 관계에서 생성된 인스턴스를
		 * Ref하는 형태가 다양하게 변경될 수 있다는 의미입니다.
		 * 
		 * 이 말을 다시 풀어보면, 우리가 Ptype에서 배웠던 프로모션과 캐스팅과 같습니다.
		 * 상속관계에서 자식의 인스턴스를 생성 또는 이미 생성된 인스턴스를 Ref 할 때 부모타입으로
		 * 가능한데, 이 때 생성된 인스턴스는 해당 클래스의 생성자를 호출하여 생성되었기에
		 * 메모리에서 사라지기 전까지는 인스턴스 타입은 불변입니다.(꼭 기억하세요)
		 * 
		 * 하지만 해당 인스턴스를 Ref한 타입 변수는 부모 타입이기에 Ref타입은 부모타입으로
		 * 변경되어지게 됩니다. (이 부분을 많이 햇갈려 합니다.)
		 * 
		 * 이렇게 다형성으로 생성된 또는 Ref된 인스턴스의 메서드 or 변수를 호출할때는
		 * 무조건 오버라이드 된 애들이 호출되어집니다.
		 * 
		 * 하지만, 인스턴스에만 정의된 메서드를 호출하게 될시에는 컴파일 에러가 유발됩니다.
		 * 이유는 Ref하는 변수 타입에는 해당 내용이 없기 때문입니다.
		 * 
		 * 이렇게 다형성을 구현하는 이유는, 상속 관계에서 자식들이 상속받은 메서드를 자신의
		 * 목적에 맞게 오버라이드 했을경우, 어떤 타입이건 상관없이 동일하게 부모타입으로
		 * Ref 해서 오버라이드된 메서드를 호출 할 때, 즉 메서드명은 하나로 통일하되, 내용부는
		 * 인스턴스에 적응된 내용이 나오도록 하는데 목적이 있습니다.
		 * 
		 * 꼭 기억해야 할 것은, 부모 타입으로 Ref하던, 인스턴스를 생성하면, 생성된 인스턴스의
		 * 타입은 절대 불변이라는 겁니다.
		 * -------------------------------------------------------------------
		 */
		
		/*
		Terran marine = new Marine ("Jason","이병", 60, 60); //Marine 파일의 extends Terran을 지우면 에러가 뜸
		Terran firebat = new Firebat ("불쏘시개","상병", 40, 70);
		Terran medic = new Medic ("줄리아","하사", 50, 0);
		
		marine.sound(); // Marine 메소드에 Sound 정의 -> Override Super타입으로 불러옴.
		firebat.sound();
		medic.sound();
		
		((Marine)marine).move(100,100); //캐스팅을 안할시에는 인스턴스에만 정의된 메서드를 호출해서 컴파일에러가 뜸.
										//그리고 연산자에서 .이 ()보다 연산이 빠르기 때문에 앞을 먼저 괄호로 묶어줌.
		
		*/
		
//		//타입변경을 해봅니다. 즉, 마린 인스턴스의 Ref타입을 원형으로 변경해봅니다.
//		Marine ma = (Marine) marine; // Type Casting
//		Object obj = ma; // 객체는 바뀌지 않는다. 따라서 obj는 Marine
//		ma = (Marine) obj;
//		medic = (Medic) obj; // 논리적인 오류가 있음 : 컴파일러는 실행한 이후에 만들어져서 오류가 없지만 JVM에서는 예외가 뜸.
		
		
		
		
		
		
		
		
		Marine m1 = new Marine("Jason", "이등병", 40, 60);//Instance화 하는 단계. 
								 //즉, 객체를 생성하는 코드입니다.
								 //해서 정확한 문법적 표현은 Instantiation 이라고 합니다.
								 //위에서 Marine()이 호출된 이후엔 Marine 클래스의 인스턴스가 생성되고
								 //해당 인스턴스는 JVM이 관리하는 Heap 메모리 영역에 저장되어집니다.
		Firebat f1 = new Firebat("불추장", "상병", 50, 80);
		Medic md1 = new Medic("간호사", "하사", 60, 0);
		
//		System.out.println(m1.toString());
//		System.out.println(f1.toString());
//		System.out.println(md1.toString());
//		
//		m1.sound();
//		f1.sound();
//		md1.sound();
		
		md1.healing("마린");
		
		
		Terran[] allUnit = {m1,f1,md1};
		for(int i = 0; i<allUnit.length; i++) {
			Terran theUnit = allUnit[(int)(Math.random() * allUnit.length)];
			//모든 유닛들의 sound()를 호출해보세요.
			theUnit.sound();
			
			//만약 리턴되는 인스턴스가 메딕이라면, "마린"을 치료토록 해보세요..
			//즉 healing("마린")을 호출하세요.
			
//			if (theUnit instanceof Medic) {
//				((Medic) theUnit).healing("마린");
//			}
			
			if(theUnit instanceof Marine) { //instanceof는 연산자
				((Marine)theUnit).move(300,300);
			}else if(theUnit instanceof Firebat) {
				((Firebat)theUnit).move(300, 300);
			}else {
				Medic m = (Medic)theUnit;
				//((Medic)theUnit).move(300, 300);
				m.move(300, 300);
				//((Medic) theUnit).healing("마린");
				m.healing("마린");
			}
			
		}
		

		
		
/*		Marine m2 = new Marine("Jackson", "중사", 15, 60);
		m2.getHealing(1);
		
		
		//은닉(hidden) 정보를 직접 접근하여 에러 발생됨 <from) Marine.java>
//		m1.name = "Scaramuche";
//		m1.hp = 40;
//		m2.name = "Washington";
//		m2.hp = 40;
		
		System.out.println(m1);
		System.out.println(m2);
		
		m1.move(100, 110);
		m2.move(80, 90); */
	}

}
