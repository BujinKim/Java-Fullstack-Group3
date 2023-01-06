package oopEx1;

public interface Attackable {
	
	//공격 기능을 선언합니다.
	
	public abstract void attack(String target); // 인터페이스에서는 추상 메서드만 사용가능하기 때문에 바디를 가질 수 없다.
}
