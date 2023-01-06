package oopEx1;
//이 클래스는 마린을 정의한 클래스입니다.
//클래스에는 크게 3가지를 정의할 수 있는데 속성, 생성자, 메서드입니다.
//일반적으로 정의 순서는 위 순으로 합니다.
public class Firebat extends Terran implements Attackable,Moveable{//클래스에는 public or default만 존재함.
	
	//public > protected > default > private ==> 접근제어자 (Access Modifier)
	//private 은 오직 내 클래스 안에서만 쓸 수 있음 (가장 강력한 접근제어자)
	//속성정의.//Fields --> 객체를 구성하는 속성.. 즉 객체속성 멤버필드..
	private String name; //마린의 이름 // 객체는 선언과 동시에 디폴트값을 가지게됨. // 디폴트 객체 : 선언만 한 상태의 객체들. //private : 은닉
	private String rank; //계급
	private int hp;//체력
	private int damage;//데미지
	
	/*
	 * 생성자.. 생성자는 클래스가 인스턴스화 될때 JVM 호출하는 일종의 메서드와 같은 코드입니다.
	 * 위처럼 메서드와 같다는 말은 ()를 가지고 있다는 말인데, 다른점은 리턴타입을 선언해서는
	 * 안되고(하게되면 메서드화 되어짐), 생성자 명은 반드시 클래스 명과 같아야 한다는 점입니다.
	 * 만약 여러분이 생성자를 하나도 정의하지 않은 경우에는 컴파일시 컴파일러가 기본생성자(default)를
	 * 자동으로 클래스내에 넣어줍니다. 하지만 여러분이 하나라도 정의하면 컴파일러는 제공하지
	 * 않습니다.
	 * 
	 * 목적 하나더.. 생성자를 이용해서 객체를 생성할 수 있는 가이드라인 역할까지 수행할 수
	 * 있습니다.
	 */
	
	// 생성자 오버로딩 
//	public FireBet() { //기본생성자.. 컴파일러가 넣어주는 기본 생성자가 어떤 역할을 하는지 코드로 정의합니다.
//		name = null; //멤버필드 초기화
//		rank = null;
//		hp = 0;
//		damage = 0;
//	}
	
//	public FireBet(String name) {
//		this.name = name;
//	}
	
//	public FireBet(String name, String rank) {
//		/*
//		 * 생성자 this([params]) : 이미 정의된 생성자를 호출하는 코드
//		 * 파라미터는 옵션입니다. 이렇게 호출하면 정의된 생성자가 호출되어지기 때문에
//		 * 코드를 재사용 가능합니다.
//		 * 단!!!!!!! this() 는 무조건 생성자 첫 코드에서만 호출할 수 있고,
//		 * 한번 이상 사용안됩니다.
//		 */
////		this.name = name;
//		this(name);
//		this.rank = rank;
//	}
	
//	public FireBet(String name, String rank, int hp) {
//		this(name,rank);
//		this.hp = hp;
//	}
	
	public Firebat(String name, String rank, int hp, int damage) {
		super("테란");
		this.name = name;
		this.rank = rank;
		this.hp = hp;
		this.damage = damage;
	}

	
	
	
	
	//객체의 정보를 외부에 표시하는 interface 역할을 하는 메서드 정의합니다.
	//왜 이렇게 되는지는 나중에 알게됩니다.
	public String toString() {
		return super.toString() + "\n이름: " + this.name + "\n계급: " + this.rank + "\nHP : " + this.hp
				+ "\n공격력 : " + this.damage + "\n";
	}
		
	//이동하는 기능인 move 메서드를 정의합니다.
	public void move (int x, int y) {
		System.out.println(this.name + "이(가) " + "[" + x + "," + y + "]로 이동했습니다.");
	}
	
	public void sound() {
		System.out.println("불이 필요하신가요?");
	}

	
	//치료받는 메서드 정의
	public void getHealing (int hp) throws InterruptedException {
		while (true) {
			if(this.hp == 40) {
				return;
			}
			Thread.sleep(1000);
			this.hp += hp;
			System.out.println(this.name + this.rank + " 이(가) 치료를 받고 있습니다.");
			System.out.println("+" + hp + " 증가");
		
		}
	}

	@Override
	public void attack(String target) {
		System.out.println(super.getTheUnit() + " 이(가) " + target + " 을(를) 화염방사기로 공격합니다.");
	}
	
	
	
	
	
	
}
