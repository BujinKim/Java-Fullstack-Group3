package langEx.nestcls;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 익명 클래스는 말 그대로 이름이 없는 클래스입니다.
 * 이 뜻은 특정 클래스 또는 인터페이스 타입에 적용된 메서드나 생성자에 
 * 바로 클래스를 정의 후 특정메서드를 호출하는 방식입니다.
 * 
 * 이렇게 정의된 클래스는 익명으로 처리되어, 생성 및 작업 후 사라지게 되는 형태입니다.
 */

interface TestAnonyInner{//인터페이스라 자신의 생성자는 생성하지 못함.
	int data = 10000;
	void printData();
	void yourMethod();
}
/* TestAnonyInner 구현클래스... 이걸 익명으로 변환한게 new TestAnonyInner() 입니다.
 */
class UseAnonyInner{
	
	public void test() {
		//익명 클래스는 어디에서건 정의 할 수 있습니다.
		new TestAnonyInner() {//인터페이스를 객체로 만드는 것이 아님
			
			@Override
			public void yourMethod() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				System.out.println(data);
				
			}
//		};//<-- 구현부를 끝냈다는 의미의 새미콜론
		}.printData();
	}
}

//ActionListener 를 구현하는 클래스 정의.. 내가 해당 타입의 클래스가 된다.
class MyActionListen implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ㅂㅂ");
		System.exit(0);		
	}
	
}

public class AnonyInnerEx {

	public static void main(String[] args) {
		UseAnonyInner u = new UseAnonyInner();
		u.test();
		
		
		Frame f = new Frame("새복많");
		f.setSize(300,300);
		Button button = new Button("ㅇㅋ");
		
		//버튼에 이벤트 연결함..
		
		//아래는 익명클래스를 구현한것..
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("이건 익명클래스에서 호출됨");
				System.exit(0);
			}
		});
		
		//아래는 구현 객체를 연결한것..
		//button.addActionListener(new MyActionListen());
		f.add(button);
		f.setVisible(true);
	}

}
