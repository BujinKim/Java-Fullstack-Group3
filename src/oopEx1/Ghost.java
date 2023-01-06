package oopEx1;

public class Ghost extends Terran implements GhostAbility{

	private String name;
	private String rank;
	private int hp;
	private int damage;

	public Ghost(String name, String rank, int hp, int damage) {
		super("고스트");
		this.name = name;
		this.rank = rank;
		this.hp = hp;
		this.damage = damage;
	}
	
	public void move (int x, int y) {
		System.out.println(this.name + "이(가) " + "[" + x + "," + y + "]로 이동했습니다.");
	}

	public String toString() {
		return super.toString() + "\n이름: " + this.name + "\n계급: " + this.rank + "\nHP : " + this.hp
				+ "\n공격력 : " + this.damage + "\n";
	}

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
	public void sound() {
		System.out.println("Ghost says : There's no one here.");
	}

	@Override
	public void attack(String target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nuclearLaunch(int x, int y) {
		System.out.println("핵폭탄 발사됨.. 좌표는 [" + x + ", " + y + "]" );
	}
	
//	@Override
//	public void attack(String target) {
//		System.out.println(super.getTheUnit() + " 이(가) " + target + " 을(를) 저격총으로 공격합니다.");
//	}

}
